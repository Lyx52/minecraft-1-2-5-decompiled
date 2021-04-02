package mojang;

public enum acf {

   a("monster", 0, xf.class, 70, acn.a, false),
   b("creature", 1, bc.class, 15, acn.a, true),
   c("waterCreature", 2, tq.class, 5, acn.g, true);
   private final Class d;
   private final int e;
   private final acn f;
   private final boolean g;
   // $FF: synthetic field
   private static final acf[] h = new acf[]{a, b, c};


   private acf(String var1, int var2, Class var3, int var4, acn var5, boolean var6) {
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.g = var6;
   }

   public Class a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public acn c() {
      return this.f;
   }

   public boolean d() {
      return this.g;
   }

}
