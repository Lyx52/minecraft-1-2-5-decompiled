package mojang;

public class ky extends rt {

   public ky(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4 - 0.125D, var6, var8, var10, var12);
      this.ao = 0.4F;
      this.ap = 0.4F;
      this.aq = 0.7F;
      this.c(0);
      this.a(0.01F, 0.01F);
      this.am *= this.U.nextFloat() * 0.6F + 0.2F;
      this.r = var8 * 0.0D;
      this.s = var10 * 0.0D;
      this.t = var12 * 0.0D;
      this.e = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void J_() {
      this.sandX = this.o;
      this.sandY = this.p;
      this.sandZ = this.q;
      this.b(this.r, this.s, this.t);
      if(this.k.f(Utils.c(this.o), Utils.c(this.p), Utils.c(this.q)) != acn.g) {
         this.A();
      }

      if(this.e-- <= 0) {
         this.A();
      }

   }
}
