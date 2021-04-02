package mojang;

public class yx extends rt {

   public yx(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.r = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.s = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.t = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.ao = this.ap = this.aq = this.U.nextFloat() * 0.3F + 0.7F;
      this.am = this.U.nextFloat() * this.U.nextFloat() * 6.0F + 1.0F;
      this.e = (int)(16.0D / ((double)this.U.nextFloat() * 0.8D + 0.2D)) + 2;
   }

   public void J_() {
      this.sandX = this.o;
      this.sandY = this.p;
      this.sandZ = this.q;
      if(this.d++ >= this.e) {
         this.A();
      }

      this.c(7 - this.d * 8 / this.e);
      this.s += 0.004D;
      this.b(this.r, this.s, this.t);
      this.r *= 0.8999999761581421D;
      this.s *= 0.8999999761581421D;
      this.t *= 0.8999999761581421D;
      if(this.z) {
         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
      }

   }
}
