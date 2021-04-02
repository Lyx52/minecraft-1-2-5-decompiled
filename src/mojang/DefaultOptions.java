package mojang;

public enum DefaultOptions {

   MUSIC("MUSIC", 0, "options.music", true, false),
   SOUND("SOUND", 1, "options.sound", true, false),
   INVERT_MOUSE("INVERT_MOUSE", 2, "options.invertMouse", false, true),
   SENSITIVITY("SENSITIVITY", 3, "options.sensitivity", true, false),
   FOV("FOV", 4, "options.fov", true, false),
   GAMMA("GAMMA", 5, "options.gamma", true, false),
   RENDER_DISTANCE("RENDER_DISTANCE", 6, "options.renderDistance", false, false),
   VIEW_BOBBING("VIEW_BOBBING", 7, "options.viewBobbing", false, true),
   ANAGLYPH("ANAGLYPH", 8, "options.anaglyph", false, true),
   ADVANCED_OPENGL("ADVANCED_OPENGL", 9, "options.advancedOpengl", false, true),
   FRAMERATE_LIMIT("FRAMERATE_LIMIT", 10, "options.framerateLimit", false, false),
   DIFFICULTY("DIFFICULTY", 11, "options.difficulty", false, false),
   GRAPHICS("GRAPHICS", 12, "options.graphics", false, false),
   ABIENT_OCCLUSION("AMBIENT_OCCLUSION", 13, "options.ao", false, true),
   GUI_SCALE("GUI_SCALE", 14, "options.guiScale", false, false),
   RENDER_CLOUDS("RENDER_CLOUDS", 15, "options.renderClouds", false, true),
   PARTICLES("PARTICLES", 16, "options.particles", false, false);

   private final boolean r;
   private final boolean s;
   private final String optionBindName;

   private static final DefaultOptions[] OPTIONS = new DefaultOptions[]{MUSIC, SOUND, INVERT_MOUSE, SENSITIVITY, FOV, GAMMA, RENDER_DISTANCE, VIEW_BOBBING, ANAGLYPH, ADVANCED_OPENGL, FRAMERATE_LIMIT, DIFFICULTY, GRAPHICS, ABIENT_OCCLUSION, GUI_SCALE, RENDER_CLOUDS, PARTICLES};


   public static DefaultOptions a(int var0) {
      DefaultOptions[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         DefaultOptions var4 = var1[var3];
         if(var4.getIDS() == var0) {
            return var4;
         }
      }

      return null;
   }

   private DefaultOptions(String optionName, int id, String optionBindName, boolean var4, boolean var5) {
      this.optionBindName = optionBindName;
      this.r = var4;
      this.s = var5;
   }

   public boolean a() {
      return this.r;
   }

   public boolean b() {
      return this.s;
   }

   public int getIDS() {
      return this.ordinal();
   }

   public String d() {
      return this.optionBindName;
   }

}
