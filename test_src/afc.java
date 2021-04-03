
public class afc extends rt {

   private float a;
   private double au;
   private double av;
   private double aw;


   public afc(xd var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.r = var8;
      this.s = var10;
      this.t = var12;
      this.au = this.o = var2;
      this.av = this.p = var4;
      this.aw = this.q = var6;
      float var14 = this.U.nextFloat() * 0.6F + 0.4F;
      this.a = this.am = this.U.nextFloat() * 0.5F + 0.2F;
      this.ao = this.ap = this.aq = 1.0F * var14;
      this.ap *= 0.9F;
      this.ao *= 0.9F;
      this.e = (int)(Math.random() * 10.0D) + 30;
      this.S = true;
      this.c((int)(Math.random() * 26.0D + 1.0D + 224.0D));
   }

   public int b(float var1) {
      int var2 = super.b(var1);
      float var3 = (float)this.d / (float)this.e;
      var3 *= var3;
      var3 *= var3;
      int var4 = var2 & 255;
      int var5 = var2 >> 16 & 255;
      var5 += (int)(var3 * 15.0F * 16.0F);
      if(var5 > 240) {
         var5 = 240;
      }

      return var4 | var5 << 16;
   }

   public float a(float var1) {
      float var2 = super.a(var1);
      float var3 = (float)this.d / (float)this.e;
      var3 *= var3;
      var3 *= var3;
      return var2 * (1.0F - var3) + var3;
   }

   public void J_() {
      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      float var1 = (float)this.d / (float)this.e;
      var1 = 1.0F - var1;
      float var2 = 1.0F - var1;
      var2 *= var2;
      var2 *= var2;
      this.o = this.au + this.r * (double)var1;
      this.p = this.av + this.s * (double)var1 - (double)(var2 * 1.2F);
      this.q = this.aw + this.t * (double)var1;
      if(this.d++ >= this.e) {
         this.A();
      }

   }
}
