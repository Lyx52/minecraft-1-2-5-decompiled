package mojang;

public class mj extends rt {

   private float a;


   public mj(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.r = this.r * 0.009999999776482582D + var8;
      this.s = this.s * 0.009999999776482582D + var10;
      this.t = this.t * 0.009999999776482582D + var12;
      double var10000 = var2 + (double)((this.U.nextFloat() - this.U.nextFloat()) * 0.05F);
      var10000 = var4 + (double)((this.U.nextFloat() - this.U.nextFloat()) * 0.05F);
      var10000 = var6 + (double)((this.U.nextFloat() - this.U.nextFloat()) * 0.05F);
      this.a = this.am;
      this.ao = this.ap = this.aq = 1.0F;
      this.e = (int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4;
      this.S = true;
      this.c(48);
   }

   public void a(Tessalator var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.d + var2) / (float)this.e;
      this.am = this.a * (1.0F - var8 * var8 * 0.5F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public int b(float var1) {
      float var2 = ((float)this.d + var1) / (float)this.e;
      if(var2 < 0.0F) {
         var2 = 0.0F;
      }

      if(var2 > 1.0F) {
         var2 = 1.0F;
      }

      int var3 = super.b(var1);
      int var4 = var3 & 255;
      int var5 = var3 >> 16 & 255;
      var4 += (int)(var2 * 15.0F * 16.0F);
      if(var4 > 240) {
         var4 = 240;
      }

      return var4 | var5 << 16;
   }

   public float a(float var1) {
      float var2 = ((float)this.d + var1) / (float)this.e;
      if(var2 < 0.0F) {
         var2 = 0.0F;
      }

      if(var2 > 1.0F) {
         var2 = 1.0F;
      }

      float var3 = super.a(var1);
      return var3 * var2 + (1.0F - var2);
   }

   public void J_() {
      this.sandX = this.o;
      this.sandY = this.p;
      this.sandZ = this.q;
      if(this.d++ >= this.e) {
         this.A();
      }

      this.b(this.r, this.s, this.t);
      this.r *= 0.9599999785423279D;
      this.s *= 0.9599999785423279D;
      this.t *= 0.9599999785423279D;
      if(this.z) {
         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
      }

   }
}
