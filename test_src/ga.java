
public class ga extends rt {

   private acn a;
   private int au;


   public ga(xd var1, double var2, double var4, double var6, acn var8) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.r = this.s = this.t = 0.0D;
      if(var8 == acn.g) {
         this.ao = 0.0F;
         this.ap = 0.0F;
         this.aq = 1.0F;
      } else {
         this.ao = 1.0F;
         this.ap = 0.0F;
         this.aq = 0.0F;
      }

      this.c(113);
      this.a(0.01F, 0.01F);
      this.an = 0.06F;
      this.a = var8;
      this.au = 40;
      this.e = (int)(64.0D / (Math.random() * 0.8D + 0.2D));
      this.r = this.s = this.t = 0.0D;
   }

   public int b(float var1) {
      return this.a == acn.g?super.b(var1):257;
   }

   public float a(float var1) {
      return this.a == acn.g?super.a(var1):1.0F;
   }

   public void J_() {
      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      if(this.a == acn.g) {
         this.ao = 0.2F;
         this.ap = 0.3F;
         this.aq = 1.0F;
      } else {
         this.ao = 1.0F;
         this.ap = 16.0F / (float)(40 - this.au + 16);
         this.aq = 4.0F / (float)(40 - this.au + 8);
      }

      this.s -= (double)this.an;
      if(this.au-- > 0) {
         this.r *= 0.02D;
         this.s *= 0.02D;
         this.t *= 0.02D;
         this.c(113);
      } else {
         this.c(112);
      }

      this.b(this.r, this.s, this.t);
      this.r *= 0.9800000190734863D;
      this.s *= 0.9800000190734863D;
      this.t *= 0.9800000190734863D;
      if(this.e-- <= 0) {
         this.A();
      }

      if(this.z) {
         if(this.a == acn.g) {
            this.A();
            this.k.a("splash", this.o, this.p, this.q, 0.0D, 0.0D, 0.0D);
         } else {
            this.c(114);
         }

         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
      }

      acn var1 = this.k.f(gk.c(this.o), gk.c(this.p), gk.c(this.q));
      if(var1.d() || var1.a()) {
         double var2 = (double)((float)(gk.c(this.p) + 1) - agv.e(this.k.e(gk.c(this.o), gk.c(this.p), gk.c(this.q))));
         if(this.p < var2) {
            this.A();
         }
      }

   }
}
