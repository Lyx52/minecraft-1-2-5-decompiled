package mojang;

public class ake extends ho {

   private qp[] a = new qp[12];
   private qp b;


   public ake() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = new qp(this, 0, 16);
         this.a[var1].a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      }

      this.b = new qp(this, 0, 0);
      this.b.a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
   }

   public int a() {
      return 8;
   }

   public void a(BaseEntity var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.b.a(var7);

      for(int var8 = 0; var8 < this.a.length; ++var8) {
         this.a[var8].a(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var3 * 3.1415927F * -0.1F;

      int var8;
      for(var8 = 0; var8 < 4; ++var8) {
         this.a[var8].d = -2.0F + Utils.cos(((float)(var8 * 2) + var3) * 0.25F);
         this.a[var8].c = Utils.cos(var7) * 9.0F;
         this.a[var8].e = Utils.sin(var7) * 9.0F;
         ++var7;
      }

      var7 = 0.7853982F + var3 * 3.1415927F * 0.03F;

      for(var8 = 4; var8 < 8; ++var8) {
         this.a[var8].d = 2.0F + Utils.cos(((float)(var8 * 2) + var3) * 0.25F);
         this.a[var8].c = Utils.cos(var7) * 7.0F;
         this.a[var8].e = Utils.sin(var7) * 7.0F;
         ++var7;
      }

      var7 = 0.47123894F + var3 * 3.1415927F * -0.05F;

      for(var8 = 8; var8 < 12; ++var8) {
         this.a[var8].d = 11.0F + Utils.cos(((float)var8 * 1.5F + var3) * 0.5F);
         this.a[var8].c = Utils.cos(var7) * 5.0F;
         this.a[var8].e = Utils.sin(var7) * 5.0F;
         ++var7;
      }

      this.b.g = var4 / 57.295776F;
      this.b.f = var5 / 57.295776F;
   }
}
