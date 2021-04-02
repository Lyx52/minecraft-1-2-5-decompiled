package mojang;

public class rg extends rt {

   public rg(World var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.r *= 0.30000001192092896D;
      this.s = (double)((float)Math.random() * 0.2F + 0.1F);
      this.t *= 0.30000001192092896D;
      this.ao = 1.0F;
      this.ap = 1.0F;
      this.aq = 1.0F;
      this.c(19 + this.U.nextInt(4));
      this.a(0.01F, 0.01F);
      this.an = 0.06F;
      this.e = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void J_() {
      this.sandX = this.o;
      this.sandY = this.p;
      this.sandZ = this.q;
      this.s -= (double)this.an;
      this.b(this.r, this.s, this.t);
      this.r *= 0.9800000190734863D;
      this.s *= 0.9800000190734863D;
      this.t *= 0.9800000190734863D;
      if(this.e-- <= 0) {
         this.A();
      }

      if(this.z) {
         if(Math.random() < 0.5D) {
            this.A();
         }

         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
      }

      acn var1 = this.k.f(Utils.c(this.o), Utils.c(this.p), Utils.c(this.q));
      if(var1.d() || var1.a()) {
         double var2 = (double)((float)(Utils.c(this.p) + 1) - agv.e(this.k.e(Utils.c(this.o), Utils.c(this.p), Utils.c(this.q))));
         if(this.p < var2) {
            this.A();
         }
      }

   }
}
