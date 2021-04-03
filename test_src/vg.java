
public class vg extends rt {

   public vg(xd var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.ao = 1.0F;
      this.ap = 1.0F;
      this.aq = 1.0F;
      this.c(32);
      this.a(0.02F, 0.02F);
      this.am *= this.U.nextFloat() * 0.6F + 0.2F;
      this.r = var8 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.s = var10 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.t = var12 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.e = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void J_() {
      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      this.s += 0.002D;
      this.b(this.r, this.s, this.t);
      this.r *= 0.8500000238418579D;
      this.s *= 0.8500000238418579D;
      this.t *= 0.8500000238418579D;
      if(this.k.f(gk.c(this.o), gk.c(this.p), gk.c(this.q)) != acn.g) {
         this.A();
      }

      if(this.e-- <= 0) {
         this.A();
      }

   }
}
