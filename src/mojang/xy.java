package mojang;

public class xy extends rt {

   public xy(xd var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      float var14 = this.U.nextFloat() * 0.1F + 0.2F;
      this.ao = var14;
      this.ap = var14;
      this.aq = var14;
      this.c(0);
      this.a(0.02F, 0.02F);
      this.am *= this.U.nextFloat() * 0.6F + 0.5F;
      this.r *= 0.019999999552965164D;
      this.s *= 0.019999999552965164D;
      this.t *= 0.019999999552965164D;
      this.e = (int)(20.0D / (Math.random() * 0.8D + 0.2D));
      this.S = true;
   }

   public void J_() {
      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      this.b(this.r, this.s, this.t);
      this.r *= 0.99D;
      this.s *= 0.99D;
      this.t *= 0.99D;
      if(this.e-- <= 0) {
         this.A();
      }

   }
}
