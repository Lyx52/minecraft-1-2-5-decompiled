
public class dz extends ho {

   public qp a;
   public qp b;
   public qp c;
   public qp d;
   public qp e;


   public dz() {
      float var1 = 4.0F;
      float var2 = 0.0F;
      this.c = (new qp(this, 0, 0)).b(64, 64);
      this.c.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.c.a(0.0F, 0.0F + var1, 0.0F);
      this.d = (new qp(this, 32, 0)).b(64, 64);
      this.d.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.d.a(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.e = (new qp(this, 32, 0)).b(64, 64);
      this.e.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.e.a(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.a = (new qp(this, 0, 16)).b(64, 64);
      this.a.a(-5.0F, -10.0F, -5.0F, 10, 10, 10, var2 - 0.5F);
      this.a.a(0.0F, 0.0F + var1 + 9.0F, 0.0F);
      this.b = (new qp(this, 0, 36)).b(64, 64);
      this.b.a(-6.0F, -12.0F, -6.0F, 12, 12, 12, var2 - 0.5F);
      this.b.a(0.0F, 0.0F + var1 + 20.0F, 0.0F);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      this.c.g = var4 / 57.295776F;
      this.c.f = var5 / 57.295776F;
      this.a.g = var4 / 57.295776F * 0.25F;
      float var7 = gk.a(this.a.g);
      float var8 = gk.b(this.a.g);
      this.d.h = 1.0F;
      this.e.h = -1.0F;
      this.d.g = 0.0F + this.a.g;
      this.e.g = 3.1415927F + this.a.g;
      this.d.c = var8 * 5.0F;
      this.d.e = -var7 * 5.0F;
      this.e.c = -var8 * 5.0F;
      this.e.e = var7 * 5.0F;
   }

   public void a(nn var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.a.a(var7);
      this.b.a(var7);
      this.c.a(var7);
      this.d.a(var7);
      this.e.a(var7);
   }
}
