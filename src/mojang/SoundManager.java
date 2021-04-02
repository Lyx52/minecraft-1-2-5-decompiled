package mojang;

import java.io.File;
import java.util.Random;
import mojang.paulscode.sound.SoundSystem;
import mojang.paulscode.sound.SoundSystemConfig;
import mojang.paulscode.sound.codecs.CodecJOrbis;
import mojang.paulscode.sound.codecs.CodecWav;
import mojang.paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class SoundManager {

   private static SoundSystem soundSystem;
   private zo b = new zo();
   private zo c = new zo();
   private zo d = new zo();
   private int e = 0;
   private OptionParser f;
   private static boolean running = false;
   private Random randomizer = new Random();
   private int randomInt;


   public SoundManager() {
      this.randomInt = this.randomizer.nextInt(12000);
   }

   public void a(OptionParser var1) {
      this.c.b = false;
      this.f = var1;
      if(!running && (var1 == null || var1.soundVolume != 0.0F || var1.musicVolume != 0.0F)) {
         this.d();
      }

   }

   private void d() {
      try {
         float var1 = this.f.soundVolume;
         float var2 = this.f.musicVolume;
         this.f.soundVolume = 0.0F;
         this.f.musicVolume = 0.0F;
         this.f.b();
         SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
         SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
         SoundSystemConfig.setCodec("mus", aac.class);
         SoundSystemConfig.setCodec("wav", CodecWav.class);
         soundSystem = new SoundSystem();
         this.f.soundVolume = var1;
         this.f.musicVolume = var2;
         this.f.b();
      } catch (Throwable var3) {
         var3.printStackTrace();
         System.err.println("error linking with the LibraryJavaSound plug-in");
      }

      running = true;
   }

   public void a() {
      if(!running && (this.f.soundVolume != 0.0F || this.f.musicVolume != 0.0F)) {
         this.d();
      }

      if(running) {
         if(this.f.musicVolume == 0.0F) {
            soundSystem.stop("BgMusic");
         } else {
            soundSystem.setVolume("BgMusic", this.f.musicVolume);
         }
      }

   }

   public void cleanup() {
      if(running) {
         soundSystem.cleanup();
      }

   }

   public void a(String var1, File var2) {
      this.b.a(var1, var2);
   }

   public void b(String var1, File var2) {
      this.c.a(var1, var2);
   }

   public void c(String var1, File var2) {
      this.d.a(var1, var2);
   }

   public void c() {
      if(running && this.f.musicVolume != 0.0F) {
         if(!soundSystem.playing("BgMusic") && !soundSystem.playing("streaming")) {
            if(this.randomInt > 0) {
               --this.randomInt;
               return;
            }

            ub var1 = this.d.a();
            if(var1 != null) {
               this.randomInt = this.randomizer.nextInt(12000) + 12000;
               soundSystem.backgroundMusic("BgMusic", var1.b, var1.a, false);
               soundSystem.setVolume("BgMusic", this.f.musicVolume);
               soundSystem.play("BgMusic");
            }
         }

      }
   }

   public void a(Mob var1, float var2) {
      if(running && this.f.soundVolume != 0.0F) {
         if(var1 != null) {
            float var3 = var1.w + (var1.u - var1.w) * var2;
            double var4 = var1.sandX + (var1.o - var1.sandX) * (double)var2;
            double var6 = var1.sandY + (var1.p - var1.sandY) * (double)var2;
            double var8 = var1.sandZ + (var1.q - var1.sandZ) * (double)var2;
            float var10 = Utils.cos(-var3 * 0.017453292F - 3.1415927F);
            float var11 = Utils.sin(-var3 * 0.017453292F - 3.1415927F);
            float var12 = -var11;
            float var13 = 0.0F;
            float var14 = -var10;
            float var15 = 0.0F;
            float var16 = 1.0F;
            float var17 = 0.0F;
            soundSystem.setListenerPosition((float)var4, (float)var6, (float)var8);
            soundSystem.setListenerOrientation(var12, var13, var14, var15, var16, var17);
         }
      }
   }

   public void a(String var1, float var2, float var3, float var4, float var5, float var6) {
      if(running && (this.f.soundVolume != 0.0F || var1 == null)) {
         String var7 = "streaming";
         if(soundSystem.playing("streaming")) {
            soundSystem.stop("streaming");
         }

         if(var1 != null) {
            ub var8 = this.c.a(var1);
            if(var8 != null && var5 > 0.0F) {
               if(soundSystem.playing("BgMusic")) {
                  soundSystem.stop("BgMusic");
               }

               float var9 = 16.0F;
               soundSystem.newStreamingSource(true, var7, var8.b, var8.a, false, var2, var3, var4, 2, var9 * 4.0F);
               soundSystem.setVolume(var7, 0.5F * this.f.soundVolume);
               soundSystem.play(var7);
            }

         }
      }
   }

   public void b(String var1, float var2, float var3, float var4, float var5, float var6) {
      if(running && this.f.soundVolume != 0.0F) {
         ub var7 = this.b.a(var1);
         if(var7 != null && var5 > 0.0F) {
            this.e = (this.e + 1) % 256;
            String soundFile = "sound_" + this.e;
            float var9 = 16.0F;
            if(var5 > 1.0F) {
               var9 *= var5;
            }

            soundSystem.newSource(var5 > 1.0F, soundFile, var7.b, var7.a, false, var2, var3, var4, 2, var9);
            soundSystem.setPitch(soundFile, var6);
            if(var5 > 1.0F) {
               var5 = 1.0F;
            }

            soundSystem.setVolume(soundFile, var5 * this.f.soundVolume);
            soundSystem.play(soundFile);
         }

      }
   }

   public void a(String var1, float var2, float var3) {
      if(running && this.f.soundVolume != 0.0F) {
         ub var4 = this.b.a(var1);
         if(var4 != null) {
            this.e = (this.e + 1) % 256;
            String var5 = "sound_" + this.e;
            soundSystem.newSource(false, var5, var4.b, var4.a, false, 0.0F, 0.0F, 0.0F, 0, 0.0F);
            if(var2 > 1.0F) {
               var2 = 1.0F;
            }

            var2 *= 0.25F;
            soundSystem.setPitch(var5, var3);
            soundSystem.setVolume(var5, var2 * this.f.soundVolume);
            soundSystem.play(var5);
         }

      }
   }

}
