package mojang;

public abstract class alb {

   public World a;
   public WorldGeneratorTypes b;
   public rs c;
   public boolean d = false;
   public boolean e = false;
   public float[] f = new float[16];
   public int g = 0;
   private float[] h = new float[4];


   public final void a(World var1) {
      this.a = var1;
      this.b = var1.B().getGenerator();
      this.a();
      this.i();
   }

   protected void i() {
      float var1 = 0.0F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.f[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   protected void a() {
      if(this.a.B().getGenerator() == WorldGeneratorTypes.flatWorld) {
         this.c = new fm(abn.c, 0.5F, 0.5F);
      } else {
         this.c = new rs(this.a);
      }

   }

   public ca b() {
      return (ca)(this.b == WorldGeneratorTypes.flatWorld ?new yh(this.a, this.a.v(), this.a.B().hasMapFeatures()):new aly(this.a, this.a.v(), this.a.B().hasMapFeatures()));
   }

   public boolean a(int var1, int var2) {
      int var3 = this.a.b(var1, var2);
      return var3 == pb.u.bO;
   }

   public float a(long var1, float var3) {
      int var4 = (int)(var1 % 24000L);
      float var5 = ((float)var4 + var3) / 24000.0F - 0.25F;
      if(var5 < 0.0F) {
         ++var5;
      }

      if(var5 > 1.0F) {
         --var5;
      }

      float var6 = var5;
      var5 = 1.0F - (float)((Math.cos((double)var5 * 3.141592653589793D) + 1.0D) / 2.0D);
      var5 = var6 + (var5 - var6) / 3.0F;
      return var5;
   }

   public int b(long var1, float var3) {
      return (int)(var1 / 24000L) % 8;
   }

   public boolean e() {
      return true;
   }

   public float[] a(float var1, float var2) {
      float var3 = 0.4F;
      float var4 = Utils.cos(var1 * 3.1415927F * 2.0F) - 0.0F;
      float var5 = -0.0F;
      if(var4 >= var5 - var3 && var4 <= var5 + var3) {
         float var6 = (var4 - var5) / var3 * 0.5F + 0.5F;
         float var7 = 1.0F - (1.0F - Utils.sin(var6 * 3.1415927F)) * 0.99F;
         var7 *= var7;
         this.h[0] = var6 * 0.3F + 0.7F;
         this.h[1] = var6 * var6 * 0.7F + 0.2F;
         this.h[2] = var6 * var6 * 0.0F + 0.2F;
         this.h[3] = var7;
         return this.h;
      } else {
         return null;
      }
   }

   public bo b(float var1, float var2) {
      float var3 = Utils.cos(var1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = 0.7529412F;
      float var5 = 0.84705883F;
      float var6 = 1.0F;
      var4 *= var3 * 0.94F + 0.06F;
      var5 *= var3 * 0.94F + 0.06F;
      var6 *= var3 * 0.91F + 0.09F;
      return bo.b((double)var4, (double)var5, (double)var6);
   }

   public boolean d() {
      return true;
   }

   public static alb a(int var0) {
      return (alb)(var0 == -1?new akf():(var0 == 0?new ms():(var0 == 1?new ii():null)));
   }

   public float f() {
      return 128.0F;
   }

   public boolean c() {
      return true;
   }

   public uh g() {
      return null;
   }

   public int h() {
      return this.b == WorldGeneratorTypes.flatWorld ?4:64;
   }

   public boolean j() {
      return this.b != WorldGeneratorTypes.flatWorld && !this.e;
   }

   public double k() {
      return this.b == WorldGeneratorTypes.flatWorld ?1.0D:0.03125D;
   }

   public boolean b(int var1, int var2) {
      return false;
   }
}
