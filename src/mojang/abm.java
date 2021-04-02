package mojang;

public class abm extends rt {

   float a;


   public abm(xd var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 2.0F);
   }

   public abm(xd var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.r *= 0.009999999776482582D;
      this.s *= 0.009999999776482582D;
      this.t *= 0.009999999776482582D;
      this.s += 0.1D;
      this.am *= 0.75F;
      this.am *= var14;
      this.a = this.am;
      this.e = 16;
      this.S = false;
      this.c(80);
   }

   public void a(adz var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.d + var2) / (float)this.e * 32.0F;
      if(var8 < 0.0F) {
         var8 = 0.0F;
      }

      if(var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.am = this.a * var8;
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void J_() {
      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      if(this.d++ >= this.e) {
         this.A();
      }

      this.b(this.r, this.s, this.t);
      if(this.p == this.m) {
         this.r *= 1.1D;
         this.t *= 1.1D;
      }

      this.r *= 0.8600000143051147D;
      this.s *= 0.8600000143051147D;
      this.t *= 0.8600000143051147D;
      if(this.z) {
         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
      }

   }
}
