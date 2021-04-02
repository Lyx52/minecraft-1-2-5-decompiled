package mojang;

public class qw extends ho {

   qp a;
   qp[] b = new qp[8];


   public qw() {
      byte var1 = -16;
      this.a = new qp(this, 0, 0);
      this.a.a(-6.0F, -8.0F, -6.0F, 12, 16, 12);
      this.a.d += (float)(24 + var1);

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.b[var2] = new qp(this, 48, 0);
         double var3 = (double)var2 * 3.141592653589793D * 2.0D / (double)this.b.length;
         float var5 = (float)Math.cos(var3) * 5.0F;
         float var6 = (float)Math.sin(var3) * 5.0F;
         this.b[var2].a(-1.0F, 0.0F, -1.0F, 2, 18, 2);
         this.b[var2].c = var5;
         this.b[var2].e = var6;
         this.b[var2].d = (float)(31 + var1);
         var3 = (double)var2 * 3.141592653589793D * -2.0D / (double)this.b.length + 1.5707963267948966D;
         this.b[var2].g = (float)var3;
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      qp[] var7 = this.b;
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         qp var10 = var7[var9];
         var10.f = var3;
      }

   }

   public void a(nn var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.a.a(var7);

      for(int var8 = 0; var8 < this.b.length; ++var8) {
         this.b[var8].a(var7);
      }

   }
}
