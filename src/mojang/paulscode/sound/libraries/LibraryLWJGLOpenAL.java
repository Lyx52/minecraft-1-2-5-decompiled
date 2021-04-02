package mojang.paulscode.sound.libraries;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import mojang.paulscode.sound.Channel;
import mojang.paulscode.sound.FilenameURL;
import mojang.paulscode.sound.ICodec;
import mojang.paulscode.sound.Library;
import mojang.paulscode.sound.ListenerData;
import mojang.paulscode.sound.SoundBuffer;
import mojang.paulscode.sound.SoundSystemConfig;
import mojang.paulscode.sound.SoundSystemException;
import mojang.paulscode.sound.Source;

public class LibraryLWJGLOpenAL extends Library {

   private static final boolean GET = false;
   private static final boolean SET = true;
   private static final boolean XXX = false;
   private FloatBuffer listenerPositionAL = null;
   private FloatBuffer listenerOrientation = null;
   private FloatBuffer listenerVelocity = null;
   private HashMap ALBufferMap = null;
   private static boolean alPitchSupported = true;


   public LibraryLWJGLOpenAL() {
      this.ALBufferMap = new HashMap();
   }

   public void init() throws SoundSystemException {
      boolean var1 = false;

      try {
         AL.create();
         var1 = this.checkALError();
      } catch (LWJGLException var5) {
         this.errorMessage("Unable to initialize OpenAL.  Probable cause: OpenAL not supported.");
         this.printStackTrace(var5);
         throw new SoundSystemException(var5.getMessage(), 6);
      }

      if(var1) {
         this.importantMessage("OpenAL did not initialize properly!");
      } else {
         this.message("OpenAL initialized.");
      }

      this.listenerPositionAL = BufferUtils.createFloatBuffer(3).put(new float[]{this.listener.position.x, this.listener.position.y, this.listener.position.z});
      this.listenerOrientation = BufferUtils.createFloatBuffer(6).put(new float[]{this.listener.lookAt.x, this.listener.lookAt.y, this.listener.lookAt.z, this.listener.up.x, this.listener.up.y, this.listener.up.z});
      this.listenerVelocity = BufferUtils.createFloatBuffer(3).put(new float[]{0.0F, 0.0F, 0.0F});
      this.listenerPositionAL.flip();
      this.listenerOrientation.flip();
      this.listenerVelocity.flip();
      AL10.alListener(4100, this.listenerPositionAL);
      var1 = this.checkALError() || var1;
      AL10.alListener(4111, this.listenerOrientation);
      var1 = this.checkALError() || var1;
      AL10.alListener(4102, this.listenerVelocity);
      var1 = this.checkALError() || var1;
      if(var1) {
         this.importantMessage("OpenAL did not initialize properly!");
         throw new SoundSystemException("Problem encountered while loading OpenAL or creating the listener.  Probably cause:  OpenAL not supported", 6);
      } else {
         super.init();
         ChannelLWJGLOpenAL var2 = (ChannelLWJGLOpenAL)this.normalChannels.get(1);

         try {
            AL10.alSourcef(var2.ALSource.get(0), 4099, 1.0F);
            if(this.checkALError()) {
               alPitchSupported(true, false);
               throw new SoundSystemException("OpenAL: AL_PITCH not supported.", 13);
            } else {
               alPitchSupported(true, true);
            }
         } catch (Exception var4) {
            alPitchSupported(true, false);
            throw new SoundSystemException("OpenAL: AL_PITCH not supported.", 13);
         }
      }
   }

   public static boolean libraryCompatible() {
      if(AL.isCreated()) {
         return true;
      } else {
         try {
            AL.create();
         } catch (Exception var2) {
            return false;
         }

         try {
            AL.destroy();
         } catch (Exception var1) {
            ;
         }

         return true;
      }
   }

   protected Channel createChannel(int var1) {
      IntBuffer var3 = BufferUtils.createIntBuffer(1);

      try {
         AL10.alGenSources(var3);
      } catch (Exception var5) {
         AL10.alGetError();
         return null;
      }

      if(AL10.alGetError() != 0) {
         return null;
      } else {
         ChannelLWJGLOpenAL var2 = new ChannelLWJGLOpenAL(var1, var3);
         return var2;
      }
   }

   public void cleanup() {
      super.cleanup();
      Set var1 = this.bufferMap.keySet();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         IntBuffer var4 = (IntBuffer)this.ALBufferMap.get(var3);
         if(var4 != null) {
            AL10.alDeleteBuffers(var4);
            this.checkALError();
            var4.clear();
         }
      }

      this.bufferMap.clear();
      AL.destroy();
      this.bufferMap = null;
      this.listenerPositionAL = null;
      this.listenerOrientation = null;
      this.listenerVelocity = null;
   }

   public boolean loadSound(FilenameURL var1) {
      if(this.bufferMap == null) {
         this.bufferMap = new HashMap();
         this.importantMessage("Buffer Map was null in method \'loadSound\'");
      }

      if(this.ALBufferMap == null) {
         this.ALBufferMap = new HashMap();
         this.importantMessage("Open AL Buffer Map was null in method\'loadSound\'");
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
            var2.initialize(var1.getURL());
            SoundBuffer var3 = var2.readAll();
            var2.cleanup();
            var2 = null;
            if(this.errorCheck(var3 == null, "Sound buffer null in method \'loadSound\'")) {
               return false;
            } else {
               this.bufferMap.put(var1.getFilename(), var3);
               AudioFormat var4 = var3.audioFormat;
               boolean var5 = false;
               short var8;
               if(var4.getChannels() == 1) {
                  if(var4.getSampleSizeInBits() == 8) {
                     var8 = 4352;
                  } else {
                     if(var4.getSampleSizeInBits() != 16) {
                        this.errorMessage("Illegal sample size in method \'loadSound\'");
                        return false;
                     }

                     var8 = 4353;
                  }
               } else {
                  if(var4.getChannels() != 2) {
                     this.errorMessage("File neither mono nor stereo in method \'loadSound\'");
                     return false;
                  }

                  if(var4.getSampleSizeInBits() == 8) {
                     var8 = 4354;
                  } else {
                     if(var4.getSampleSizeInBits() != 16) {
                        this.errorMessage("Illegal sample size in method \'loadSound\'");
                        return false;
                     }

                     var8 = 4355;
                  }
               }

               IntBuffer var6 = BufferUtils.createIntBuffer(1);
               AL10.alGenBuffers(var6);
               if(this.errorCheck(AL10.alGetError() != 0, "alGenBuffers error when loading " + var1.getFilename())) {
                  return false;
               } else {
                  ByteBuffer var7 = BufferUtils.createByteBuffer(var3.audioData.length);
                  var7.clear();
                  var7.put(var3.audioData);
                  var7.flip();
                  AL10.alBufferData(var6.get(0), var8, var7, (int)var4.getSampleRate());
                  if(this.errorCheck(AL10.alGetError() != 0, "alBufferData error when loading " + var1.getFilename()) && this.errorCheck(var6 == null, "Sound buffer was not created for " + var1.getFilename())) {
                     return false;
                  } else {
                     this.ALBufferMap.put(var1.getFilename(), var6);
                     return true;
                  }
               }
            }
         }
      }
   }

   public void unloadSound(String var1) {
      this.ALBufferMap.remove(var1);
      super.unloadSound(var1);
   }

   public void setMasterVolume(float var1) {
      super.setMasterVolume(var1);
      AL10.alListenerf(4106, var1);
      this.checkALError();
   }

   public void newSource(boolean var1, boolean var2, boolean var3, String var4, FilenameURL var5, float var6, float var7, float var8, int var9, float var10) {
      IntBuffer var11 = null;
      if(!var2) {
         var11 = (IntBuffer)this.ALBufferMap.get(var5.getFilename());
         if(var11 == null && !this.loadSound(var5)) {
            this.errorMessage("Source \'" + var4 + "\' was not created " + "because an error occurred while loading " + var5.getFilename());
            return;
         }

         var11 = (IntBuffer)this.ALBufferMap.get(var5.getFilename());
         if(var11 == null) {
            this.errorMessage("Source \'" + var4 + "\' was not created " + "because a sound buffer was not found for " + var5.getFilename());
            return;
         }
      }

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

      this.sourceMap.put(var4, new SourceLWJGLOpenAL(this.listenerPositionAL, var11, var1, var2, var3, var4, var5, var12, var6, var7, var8, var9, var10, false));
   }

   public void rawDataStream(AudioFormat var1, boolean var2, String var3, float var4, float var5, float var6, int var7, float var8) {
      this.sourceMap.put(var3, new SourceLWJGLOpenAL(this.listenerPositionAL, var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public void quickPlay(boolean var1, boolean var2, boolean var3, String var4, FilenameURL var5, float var6, float var7, float var8, int var9, float var10, boolean var11) {
      IntBuffer var12 = null;
      if(!var2) {
         var12 = (IntBuffer)this.ALBufferMap.get(var5.getFilename());
         if(var12 == null) {
            this.loadSound(var5);
         }

         var12 = (IntBuffer)this.ALBufferMap.get(var5.getFilename());
         if(var12 == null) {
            this.errorMessage("Sound buffer was not created for " + var5.getFilename());
            return;
         }
      }

      SoundBuffer var13 = null;
      if(!var2) {
         var13 = (SoundBuffer)this.bufferMap.get(var5.getFilename());
         if(var13 == null && !this.loadSound(var5)) {
            this.errorMessage("Source \'" + var4 + "\' was not created " + "because an error occurred while loading " + var5.getFilename());
            return;
         }

         var13 = (SoundBuffer)this.bufferMap.get(var5.getFilename());
         if(var13 == null) {
            this.errorMessage("Source \'" + var4 + "\' was not created " + "because audio data was not found for " + var5.getFilename());
            return;
         }
      }

      SourceLWJGLOpenAL var14 = new SourceLWJGLOpenAL(this.listenerPositionAL, var12, var1, var2, var3, var4, var5, var13, var6, var7, var8, var9, var10, false);
      this.sourceMap.put(var4, var14);
      this.play(var14);
      if(var11) {
         var14.setTemporary(true);
      }

   }

   public void copySources(HashMap var1) {
      if(var1 != null) {
         Set var2 = var1.keySet();
         Iterator var3 = var2.iterator();
         if(this.bufferMap == null) {
            this.bufferMap = new HashMap();
            this.importantMessage("Buffer Map was null in method \'copySources\'");
         }

         if(this.ALBufferMap == null) {
            this.ALBufferMap = new HashMap();
            this.importantMessage("Open AL Buffer Map was null in method\'copySources\'");
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

               if(var5.toStream || var6 != null) {
                  this.sourceMap.put(var4, new SourceLWJGLOpenAL(this.listenerPositionAL, (IntBuffer)this.ALBufferMap.get(var5.filenameURL.getFilename()), var5, var6));
               }
            }
         }

      }
   }

   public void setListenerPosition(float var1, float var2, float var3) {
      super.setListenerPosition(var1, var2, var3);
      this.listenerPositionAL.put(0, var1);
      this.listenerPositionAL.put(1, var2);
      this.listenerPositionAL.put(2, var3);
      AL10.alListener(4100, this.listenerPositionAL);
      this.checkALError();
   }

   public void setListenerAngle(float var1) {
      super.setListenerAngle(var1);
      this.listenerOrientation.put(0, this.listener.lookAt.x);
      this.listenerOrientation.put(2, this.listener.lookAt.z);
      AL10.alListener(4111, this.listenerOrientation);
      this.checkALError();
   }

   public void setListenerOrientation(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.setListenerOrientation(var1, var2, var3, var4, var5, var6);
      this.listenerOrientation.put(0, var1);
      this.listenerOrientation.put(1, var2);
      this.listenerOrientation.put(2, var3);
      this.listenerOrientation.put(3, var4);
      this.listenerOrientation.put(4, var5);
      this.listenerOrientation.put(5, var6);
      AL10.alListener(4111, this.listenerOrientation);
      this.checkALError();
   }

   public void setListenerData(ListenerData var1) {
      super.setListenerData(var1);
      this.listenerPositionAL.put(0, var1.position.x);
      this.listenerPositionAL.put(1, var1.position.y);
      this.listenerPositionAL.put(2, var1.position.z);
      AL10.alListener(4100, this.listenerPositionAL);
      this.listenerOrientation.put(0, var1.lookAt.x);
      this.listenerOrientation.put(1, var1.lookAt.y);
      this.listenerOrientation.put(2, var1.lookAt.z);
      this.listenerOrientation.put(3, var1.up.x);
      this.listenerOrientation.put(4, var1.up.y);
      this.listenerOrientation.put(5, var1.up.z);
      AL10.alListener(4111, this.listenerOrientation);
      this.checkALError();
   }

   private boolean checkALError() {
      switch(AL10.alGetError()) {
      case 0:
         return false;
      case '\ua001':
         this.errorMessage("Invalid name parameter.");
         return true;
      case '\ua002':
         this.errorMessage("Invalid parameter.");
         return true;
      case '\ua003':
         this.errorMessage("Invalid enumerated parameter value.");
         return true;
      case '\ua004':
         this.errorMessage("Illegal call.");
         return true;
      case '\ua005':
         this.errorMessage("Unable to allocate memory.");
         return true;
      default:
         this.errorMessage("An unrecognized error occurred.");
         return true;
      }
   }

   public static boolean alPitchSupported() {
      return alPitchSupported(false, false);
   }

   private static synchronized boolean alPitchSupported(boolean var0, boolean var1) {
      if(var0) {
         alPitchSupported = var1;
      }

      return alPitchSupported;
   }

   public static String getTitle() {
      return "LWJGL OpenAL";
   }

   public static String getDescription() {
      return "The LWJGL binding of OpenAL.  For more information, see http://www.lwjgl.org";
   }

   public String getClassName() {
      return "LibraryLWJGLOpenAL";
   }

}
