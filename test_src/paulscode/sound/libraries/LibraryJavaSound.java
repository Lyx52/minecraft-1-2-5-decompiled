package paulscode.sound.libraries;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.Mixer.Info;
import paulscode.sound.Channel;
import paulscode.sound.FilenameURL;
import paulscode.sound.ICodec;
import paulscode.sound.Library;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.Source;
import paulscode.sound.libraries.ChannelJavaSound;
import paulscode.sound.libraries.SourceJavaSound;

public class LibraryJavaSound extends Library {

   private static final boolean GET = false;
   private static final boolean SET = true;
   private final int maxClipSize = 1048576;
   private static Mixer myMixer = null;
   private static LibraryJavaSound instance = null;


   public LibraryJavaSound() {
      instance = this;
   }

   public void init() {
      if(myMixer == null) {
         myMixer = AudioSystem.getMixer((Info)null);
      }

      if(myMixer == null) {
         this.importantMessage("\"Java Sound Audio Engine\" was not found!");
         super.init();
         throw new SoundSystemException("\"Java Sound Audio Engine\" was not found in the list of available mixers.", 14);
      } else {
         this.setMasterVolume(1.0F);
         this.message("JavaSound initialized.");
         super.init();
      }
   }

   public static boolean libraryCompatible() {
      Info[] var0 = AudioSystem.getMixerInfo();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         Info var3 = var0[var2];
         if(var3.getName().equals("Java Sound Audio Engine")) {
            return true;
         }
      }

      return false;
   }

   protected Channel createChannel(int var1) {
      return new ChannelJavaSound(var1, myMixer);
   }

   public void cleanup() {
      super.cleanup();
      instance = null;
      myMixer = null;
   }

   public boolean loadSound(FilenameURL var1) {
      if(this.bufferMap == null) {
         this.bufferMap = new HashMap();
         this.importantMessage("Buffer Map was null in method \'loadSound\'");
      }

      if(this.errorCheck(var1 == null, "Filename/URL not specified in method \'loadSound\'")) {
         return false;
      } else if(this.bufferMap.get(var1.getFilename()) != null) {
         return true;
      } else {
         ICodec var2 = SoundSystemConfig.getCodec(var1.getFilename());
         if(this.errorCheck(var2 == null, "No codec found for file \'" + var1.getFilename() + "\' in method \'loadSound\'")) {
            return false;
         } else {
            URL var3 = var1.getURL();
            if(this.errorCheck(var3 == null, "Unable to open file \'" + var1.getFilename() + "\' in method \'loadSound\'")) {
               return false;
            } else {
               var2.initialize(var3);
               SoundBuffer var4 = var2.readAll();
               var2.cleanup();
               var2 = null;
               if(var4 != null) {
                  this.bufferMap.put(var1.getFilename(), var4);
               } else {
                  this.errorMessage("Sound buffer null in method \'loadSound\'");
               }

               return true;
            }
         }
      }
   }

   public void setMasterVolume(float var1) {
      super.setMasterVolume(var1);
      Set var2 = this.sourceMap.keySet();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         Source var5 = (Source)this.sourceMap.get(var4);
         if(var5 != null) {
            var5.positionChanged();
         }
      }

   }

   public void newSource(boolean var1, boolean var2, boolean var3, String var4, FilenameURL var5, float var6, float var7, float var8, int var9, float var10) {
      SoundBuffer var11 = null;
      if(!var2) {
         var11 = (SoundBuffer)this.bufferMap.get(var5.getFilename());
         if(var11 == null && !this.loadSound(var5)) {
            this.errorMessage("Source \'" + var4 + "\' was not created " + "because an error occurred while loading " + var5.getFilename());
            return;
         }

         var11 = (SoundBuffer)this.bufferMap.get(var5.getFilename());
         if(var11 == null) {
            this.errorMessage("Source \'" + var4 + "\' was not created " + "because audio data was not found for " + var5.getFilename());
            return;
         }
      }

      if(!var2 && var11 != null) {
         var11.trimData(1048576);
      }

      this.sourceMap.put(var4, new SourceJavaSound(this.listener, var1, var2, var3, var4, var5, var11, var6, var7, var8, var9, var10, false));
   }

   public void rawDataStream(AudioFormat var1, boolean var2, String var3, float var4, float var5, float var6, int var7, float var8) {
      this.sourceMap.put(var3, new SourceJavaSound(this.listener, var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public void quickPlay(boolean var1, boolean var2, boolean var3, String var4, FilenameURL var5, float var6, float var7, float var8, int var9, float var10, boolean var11) {
      SoundBuffer var12 = null;
      if(!var2) {
         var12 = (SoundBuffer)this.bufferMap.get(var5.getFilename());
         if(var12 == null && !this.loadSound(var5)) {
            this.errorMessage("Source \'" + var4 + "\' was not created " + "because an error occurred while loading " + var5.getFilename());
            return;
         }

         var12 = (SoundBuffer)this.bufferMap.get(var5.getFilename());
         if(var12 == null) {
            this.errorMessage("Source \'" + var4 + "\' was not created " + "because audio data was not found for " + var5.getFilename());
            return;
         }
      }

      if(!var2 && var12 != null) {
         var12.trimData(1048576);
      }

      this.sourceMap.put(var4, new SourceJavaSound(this.listener, var1, var2, var3, var4, var5, var12, var6, var7, var8, var9, var10, var11));
   }

   public void copySources(HashMap var1) {
      if(var1 != null) {
         Set var2 = var1.keySet();
         Iterator var3 = var2.iterator();
         if(this.bufferMap == null) {
            this.bufferMap = new HashMap();
            this.importantMessage("Buffer Map was null in method \'copySources\'");
         }

         this.sourceMap.clear();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            Source var5 = (Source)var1.get(var4);
            if(var5 != null) {
               SoundBuffer var6 = null;
               if(!var5.toStream) {
                  this.loadSound(var5.filenameURL);
                  var6 = (SoundBuffer)this.bufferMap.get(var5.filenameURL.getFilename());
               }

               if(!var5.toStream && var6 != null) {
                  var6.trimData(1048576);
               }

               if(var5.toStream || var6 != null) {
                  this.sourceMap.put(var4, new SourceJavaSound(this.listener, var5, var6));
               }
            }
         }

      }
   }

   public static Mixer getMixer() {
      return mixer(false, (Mixer)null);
   }

   public static void setMixer(Mixer var0) {
      mixer(true, var0);
      SoundSystemException var1 = SoundSystem.getLastException();
      SoundSystem.setException((SoundSystemException)null);
      if(var1 != null) {
         throw var1;
      }
   }

   private static synchronized Mixer mixer(boolean var0, Mixer var1) {
      if(var0) {
         myMixer = var1;
         if(instance != null) {
            ListIterator var3 = instance.normalChannels.listIterator();
            SoundSystem.setException((SoundSystemException)null);

            ChannelJavaSound var2;
            while(var3.hasNext()) {
               var2 = (ChannelJavaSound)var3.next();
               var2.newMixer(var1);
            }

            var3 = instance.streamingChannels.listIterator();

            while(var3.hasNext()) {
               var2 = (ChannelJavaSound)var3.next();
               var2.newMixer(var1);
            }
         }
      }

      return myMixer;
   }

   public static String getTitle() {
      return "Java Sound";
   }

   public static String getDescription() {
      return "The Java Sound API.  For more information, see http://java.sun.com/products/java-media/sound/";
   }

   public String getClassName() {
      return "LibraryJavaSound";
   }

}
