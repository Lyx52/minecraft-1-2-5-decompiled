package mojang;

public class ac extends rt {

   float a;


   public ac(xd var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 2.0F);
   }

   public ac(xd var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.r *= 0.009999999776482582D;
      this.s *= 0.009999999776482582D;
      this.t *= 0.009999999776482582D;
      this.s += 0.2D;
      this.ao = gk.a(((float)var8 + 0.0F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.ap = gk.a(((float)var8 + 0.33333334F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.aq = gk.a(((float)var8 + 0.6666667F) * 3.1415927F * 2.0F) * 0.65F + 0.35F;
      this.am *= 0.75F;
      this.am *= var14;
      this.a = this.am;
      this.e = 6;
      this.S = false;
      this.c(64);
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

      this.r *= 0.6600000262260437D;
      this.s *= 0.6600000262260437D;
      this.t *= 0.6600000262260437D;
      if(this.z) {
         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
      }

   }
}
