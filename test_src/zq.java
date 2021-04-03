
public enum zq {

   a("MUSIC", 0, "options.music", true, false),
   b("SOUND", 1, "options.sound", true, false),
   c("INVERT_MOUSE", 2, "options.invertMouse", false, true),
   d("SENSITIVITY", 3, "options.sensitivity", true, false),
   e("FOV", 4, "options.fov", true, false),
   f("GAMMA", 5, "options.gamma", true, false),
   g("RENDER_DISTANCE", 6, "options.renderDistance", false, false),
   h("VIEW_BOBBING", 7, "options.viewBobbing", false, true),
   i("ANAGLYPH", 8, "options.anaglyph", false, true),
   j("ADVANCED_OPENGL", 9, "options.advancedOpengl", false, true),
   k("FRAMERATE_LIMIT", 10, "options.framerateLimit", false, false),
   l("DIFFICULTY", 11, "options.difficulty", false, false),
   m("GRAPHICS", 12, "options.graphics", false, false),
   n("AMBIENT_OCCLUSION", 13, "options.ao", false, true),
   o("GUI_SCALE", 14, "options.guiScale", false, false),
   p("RENDER_CLOUDS", 15, "options.renderClouds", false, true),
   q("PARTICLES", 16, "options.particles", false, false);
   private final boolean r;
   private final boolean s;
   private final String t;
   // $FF: synthetic field
   private static final zq[] u = new zq[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q};


   public static zq a(int var0) {
      zq[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         zq var4 = var1[var3];
         if(var4.c() == var0) {
            return var4;
         }
      }

      return null;
   }

   private zq(String var1, int var2, String var3, boolean var4, boolean var5) {
      this.t = var3;
      this.r = var4;
      this.s = var5;
   }

   public boolean a() {
      return this.r;
   }

   public boolean b() {
      return this.s;
   }

   public int c() {
      return this.ordinal();
   }

   public String d() {
      return this.t;
   }

}
