package mojang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class OptionParser {

   private static final String[] RenderDistanceSettingList = new String[]{"options.renderDistance.far", "options.renderDistance.normal", "options.renderDistance.short", "options.renderDistance.tiny"};
   private static final String[] DifficultySettingList = new String[]{"options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard"};
   private static final String[] GUIScaleList = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
   private static final String[] ParticleSettingList = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
   private static final String[] PerformanceSettingList = new String[]{"performance.max", "performance.balanced", "performance.powersaver"};
   public float musicVolume = 1.0F;
   public float soundVolume = 1.0F;
   public float mouseSensitivity = 0.5F;
   public boolean mouseInverted = false;
   public int viewDistance = 0;
   public boolean bobView = true;
   public boolean glyph3d = false;
   public boolean advancedOpenGL = false;
   public int fpsLimit = 1;
   public boolean fancyGraphics = true;
   public boolean aoSetting = true;
   public boolean cloudVisibility = true;
   public String texturePackName = "Default";
   public InputKey key_forward = new InputKey("key.forward", 17);
   public InputKey key_left = new InputKey("key.left", 30);
   public InputKey key_back = new InputKey("key.back", 31);
   public InputKey key_right = new InputKey("key.right", 32);
   public InputKey key_jump = new InputKey("key.jump", 57);
   public InputKey key_inventory = new InputKey("key.inventory", 18);
   public InputKey key_drop = new InputKey("key.drop", 16);
   public InputKey key_chat = new InputKey("key.chat", 20);
   public InputKey key_sneak = new InputKey("key.sneak", 42);
   public InputKey key_attack = new InputKey("key.attack", -100);
   public InputKey key_use = new InputKey("key.use", -99);
   public InputKey key_playerlist = new InputKey("key.playerlist", 15);
   public InputKey key_pick_item = new InputKey("key.pickItem", -98);
   public InputKey[] inputKeys;
   protected Minecraft minecraftInstance;
   private File optionFile;
   public int gameDifficulty;
   public boolean D;
   public int E;
   public boolean F;
   public boolean G;
   public String lastServer;
   public boolean I;
   public boolean J;
   public boolean K;
   public float L;
   public float M;
   public float fov;
   public float gammaSetting;
   public int guiScale;
   public int particleSettings;
   public String lang;


   public OptionParser(Minecraft minecraft, File gameDirectory) {
      this.inputKeys = new InputKey[]{this.key_attack, this.key_use, this.key_forward, this.key_left, this.key_back, this.key_right, this.key_jump, this.key_sneak, this.key_drop, this.key_inventory, this.key_chat, this.key_playerlist, this.key_pick_item};
      this.gameDifficulty = 2;
      this.D = false;
      this.E = 0;
      this.F = false;
      this.G = false;
      this.lastServer = "";
      this.I = false;
      this.J = false;
      this.K = false;
      this.L = 1.0F;
      this.M = 1.0F;
      this.fov = 0.0F;
      this.gammaSetting = 0.0F;
      this.guiScale = 0;
      this.particleSettings = 0;
      this.lang = "en_US";
      this.minecraftInstance = minecraft;
      this.optionFile = new File(gameDirectory, "options.txt");
      this.a();
   }

   public OptionParser() {
      this.inputKeys = new InputKey[]{this.key_attack, this.key_use, this.key_forward, this.key_left, this.key_back, this.key_right, this.key_jump, this.key_sneak, this.key_drop, this.key_inventory, this.key_chat, this.key_playerlist, this.key_pick_item};
      this.gameDifficulty = 2;
      this.D = false;
      this.E = 0;
      this.F = false;
      this.G = false;
      this.lastServer = "";
      this.I = false;
      this.J = false;
      this.K = false;
      this.L = 1.0F;
      this.M = 1.0F;
      this.fov = 0.0F;
      this.gammaSetting = 0.0F;
      this.guiScale = 0;
      this.particleSettings = 0;
      this.lang = "en_US";
   }

   public String a(int var1) {
      LocalizationManager var2 = LocalizationManager.getInstance();
      return var2.getLocaleStringByName(this.inputKeys[var1].keyBindName);
   }

   public String b(int var1) {
      int var2 = this.inputKeys[var1].keyCode;
      return c(var2);
   }

   public static String c(int var0) {
      return var0 < 0? LocalizationManagerWrapper.getFormatedLocaleString("key.mouseButton", new Object[]{Integer.valueOf(var0 + 101)}):Keyboard.getKeyName(var0);
   }

   public void a(int var1, int var2) {
      this.inputKeys[var1].keyCode = var2;
      this.b();
   }

   public void setOption(DefaultOptions option, float value) {
      if(option == DefaultOptions.MUSIC) {
         this.musicVolume = value;
         this.minecraftInstance.soundManager.a();
      }

      if(option == DefaultOptions.SOUND) {
         this.soundVolume = value;
         this.minecraftInstance.soundManager.a();
      }

      if(option == DefaultOptions.SENSITIVITY) {
         this.mouseSensitivity = value;
      }

      if(option == DefaultOptions.FOV) {
         this.fov = value;
      }

      if(option == DefaultOptions.GAMMA) {
         this.gammaSetting = value;
      }

   }

   public void a(DefaultOptions var1, int var2) {
      if(var1 == DefaultOptions.INVERT_MOUSE) {
         this.mouseInverted = !this.mouseInverted;
      }

      if(var1 == DefaultOptions.RENDER_DISTANCE) {
         this.viewDistance = this.viewDistance + var2 & 3;
      }

      if(var1 == DefaultOptions.GUI_SCALE) {
         this.guiScale = this.guiScale + var2 & 3;
      }

      if(var1 == DefaultOptions.PARTICLES) {
         this.particleSettings = (this.particleSettings + var2) % 3;
      }

      if(var1 == DefaultOptions.VIEW_BOBBING) {
         this.bobView = !this.bobView;
      }

      if(var1 == DefaultOptions.RENDER_CLOUDS) {
         this.cloudVisibility = !this.cloudVisibility;
      }

      if(var1 == DefaultOptions.ADVANCED_OPENGL) {
         this.advancedOpenGL = !this.advancedOpenGL;
         this.minecraftInstance.g.a();
      }

      if(var1 == DefaultOptions.ANAGLYPH) {
         this.glyph3d = !this.glyph3d;
         this.minecraftInstance.textureManager.b();
      }

      if(var1 == DefaultOptions.FRAMERATE_LIMIT) {
         this.fpsLimit = (this.fpsLimit + var2 + 3) % 3;
      }

      if(var1 == DefaultOptions.DIFFICULTY) {
         this.gameDifficulty = this.gameDifficulty + var2 & 3;
      }

      if(var1 == DefaultOptions.GRAPHICS) {
         this.fancyGraphics = !this.fancyGraphics;
         this.minecraftInstance.g.a();
      }

      if(var1 == DefaultOptions.ABIENT_OCCLUSION) {
         this.aoSetting = !this.aoSetting;
         this.minecraftInstance.g.a();
      }

      this.b();
   }

   public float a(DefaultOptions var1) {
      return var1 == DefaultOptions.FOV ?this.fov :(var1 == DefaultOptions.GAMMA ?this.gammaSetting :(var1 == DefaultOptions.MUSIC ?this.musicVolume :(var1 == DefaultOptions.SOUND ?this.soundVolume :(var1 == DefaultOptions.SENSITIVITY ?this.mouseSensitivity :0.0F))));
   }

   public boolean getOption(DefaultOptions var1) {
      switch(xp.a[var1.ordinal()]) {
      case 1:
         return this.mouseInverted;
      case 2:
         return this.bobView;
      case 3:
         return this.glyph3d;
      case 4:
         return this.advancedOpenGL;
      case 5:
         return this.aoSetting;
      case 6:
         return this.cloudVisibility;
      default:
         return false;
      }
   }

   private static String a(String[] var0, int var1) {
      if(var1 < 0 || var1 >= var0.length) {
         var1 = 0;
      }

      LocalizationManager var2 = LocalizationManager.getInstance();
      return var2.getLocaleStringByName(var0[var1]);
   }

   public String c(DefaultOptions var1) {
      LocalizationManager var2 = LocalizationManager.getInstance();
      String var3 = var2.getLocaleStringByName(var1.d()) + ": ";
      if(var1.a()) {
         float var5 = this.a(var1);
         return var1 == DefaultOptions.SENSITIVITY ?(var5 == 0.0F?var3 + var2.getLocaleStringByName("options.sensitivity.min"):(var5 == 1.0F?var3 + var2.getLocaleStringByName("options.sensitivity.max"):var3 + (int)(var5 * 200.0F) + "%")):(var1 == DefaultOptions.FOV ?(var5 == 0.0F?var3 + var2.getLocaleStringByName("options.fov.min"):(var5 == 1.0F?var3 + var2.getLocaleStringByName("options.fov.max"):var3 + (int)(70.0F + var5 * 40.0F))):(var1 == DefaultOptions.GAMMA ?(var5 == 0.0F?var3 + var2.getLocaleStringByName("options.gamma.min"):(var5 == 1.0F?var3 + var2.getLocaleStringByName("options.gamma.max"):var3 + "+" + (int)(var5 * 100.0F) + "%")):(var5 == 0.0F?var3 + var2.getLocaleStringByName("options.off"):var3 + (int)(var5 * 100.0F) + "%")));
      } else if(var1.b()) {
         boolean var4 = this.getOption(var1);
         return var4?var3 + var2.getLocaleStringByName("options.on"):var3 + var2.getLocaleStringByName("options.off");
      } else {
         return var1 == DefaultOptions.RENDER_DISTANCE ?var3 + a(RenderDistanceSettingList, this.viewDistance):(var1 == DefaultOptions.DIFFICULTY ?var3 + a(DifficultySettingList, this.gameDifficulty):(var1 == DefaultOptions.GUI_SCALE ?var3 + a(GUIScaleList, this.guiScale):(var1 == DefaultOptions.PARTICLES ?var3 + a(ParticleSettingList, this.particleSettings):(var1 == DefaultOptions.FRAMERATE_LIMIT ?var3 + a(PerformanceSettingList, this.fpsLimit):(var1 == DefaultOptions.GRAPHICS ?(this.fancyGraphics ?var3 + var2.getLocaleStringByName("options.graphics.fancy"):var3 + var2.getLocaleStringByName("options.graphics.fast")):var3)))));
      }
   }

   public void a() {
      try {
         if(!this.optionFile.exists()) {
            return;
         }

         BufferedReader optionFileReader = new BufferedReader(new FileReader(this.optionFile));
         String line = "";

         while((line = optionFileReader.readLine()) != null) {
            try {
               String[] var3 = line.split(":");
               if(var3[0].equals("music")) {
                  this.musicVolume = this.boolToFloat(var3[1]);
               }

               if(var3[0].equals("sound")) {
                  this.soundVolume = this.boolToFloat(var3[1]);
               }

               if(var3[0].equals("mouseSensitivity")) {
                  this.mouseSensitivity = this.boolToFloat(var3[1]);
               }

               if(var3[0].equals("fov")) {
                  this.fov = this.boolToFloat(var3[1]);
               }

               if(var3[0].equals("gamma")) {
                  this.gammaSetting = this.boolToFloat(var3[1]);
               }

               if(var3[0].equals("invertYMouse")) {
                  this.mouseInverted = var3[1].equals("true");
               }

               if(var3[0].equals("viewDistance")) {
                  this.viewDistance = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("guiScale")) {
                  this.guiScale = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("particles")) {
                  this.particleSettings = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("bobView")) {
                  this.bobView = var3[1].equals("true");
               }

               if(var3[0].equals("anaglyph3d")) {
                  this.glyph3d = var3[1].equals("true");
               }

               if(var3[0].equals("advancedOpengl")) {
                  this.advancedOpenGL = var3[1].equals("true");
               }

               if(var3[0].equals("fpsLimit")) {
                  this.fpsLimit = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("difficulty")) {
                  this.gameDifficulty = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("fancyGraphics")) {
                  this.fancyGraphics = var3[1].equals("true");
               }

               if(var3[0].equals("ao")) {
                  this.aoSetting = var3[1].equals("true");
               }

               if(var3[0].equals("clouds")) {
                  this.cloudVisibility = var3[1].equals("true");
               }

               if(var3[0].equals("skin")) {
                  this.texturePackName = var3[1];
               }

               if(var3[0].equals("lastServer") && var3.length >= 2) {
                  this.lastServer = var3[1];
               }

               if(var3[0].equals("mojang/lang") && var3.length >= 2) {
                  this.lang = var3[1];
               }

               for(int var4 = 0; var4 < this.inputKeys.length; ++var4) {
                  if(var3[0].equals("key_" + this.inputKeys[var4].keyBindName)) {
                     this.inputKeys[var4].keyCode = Integer.parseInt(var3[1]);
                  }
               }
            } catch (Exception var5) {
               System.out.println("Skipping bad option: " + line);
            }
         }

         InputKey.b();
         optionFileReader.close();
      } catch (Exception var6) {
         System.out.println("Failed to load options");
         var6.printStackTrace();
      }

   }

   private float boolToFloat(String setting) {
      return setting.equals("true")?1.0F:(setting.equals("false")?0.0F:Float.parseFloat(setting));
   }

   public void b() {
      try {
         PrintWriter optionFileWriter = new PrintWriter(new FileWriter(this.optionFile));
         optionFileWriter.println("music:" + this.musicVolume);
         optionFileWriter.println("sound:" + this.soundVolume);
         optionFileWriter.println("invertYMouse:" + this.mouseInverted);
         optionFileWriter.println("mouseSensitivity:" + this.mouseSensitivity);
         optionFileWriter.println("fov:" + this.fov);
         optionFileWriter.println("gamma:" + this.gammaSetting);
         optionFileWriter.println("viewDistance:" + this.viewDistance);
         optionFileWriter.println("guiScale:" + this.guiScale);
         optionFileWriter.println("particles:" + this.particleSettings);
         optionFileWriter.println("bobView:" + this.bobView);
         optionFileWriter.println("anaglyph3d:" + this.glyph3d);
         optionFileWriter.println("advancedOpengl:" + this.advancedOpenGL);
         optionFileWriter.println("fpsLimit:" + this.fpsLimit);
         optionFileWriter.println("difficulty:" + this.gameDifficulty);
         optionFileWriter.println("fancyGraphics:" + this.fancyGraphics);
         optionFileWriter.println("ao:" + this.aoSetting);
         optionFileWriter.println("clouds:" + this.cloudVisibility);
         optionFileWriter.println("skin:" + this.texturePackName);
         optionFileWriter.println("lastServer:" + this.lastServer);
         optionFileWriter.println("mojang.lang:" + this.lang);

         for(int key_index = 0; key_index < this.inputKeys.length; ++key_index) {
            optionFileWriter.println("key_" + this.inputKeys[key_index].keyBindName + ":" + this.inputKeys[key_index].keyCode);
         }

         optionFileWriter.close();
      } catch (Exception e) {
         System.out.println("Failed to save options");
         e.printStackTrace();
      }

   }

   public boolean cloudsVisible() {
      return this.viewDistance < 2 && this.cloudVisibility;
   }

}
