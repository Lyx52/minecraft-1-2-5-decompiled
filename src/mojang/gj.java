package mojang;

public class gj extends ho {

   public qp a;
   public qp b;
   public qp c;
   public qp d;
   public qp e;
   public qp f;
   public qp g;


   public gj() {
      this(0.0F);
   }

   public gj(float var1) {
      byte var2 = 4;
      this.a = new qp(this, 0, 0);
      this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.a.a(0.0F, (float)var2, 0.0F);
      this.b = new qp(this, 32, 0);
      this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.b.a(0.0F, (float)var2, 0.0F);
      this.c = new qp(this, 16, 16);
      this.c.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.c.a(0.0F, (float)var2, 0.0F);
      this.d = new qp(this, 0, 16);
      this.d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.d.a(-2.0F, (float)(12 + var2), 4.0F);
      this.e = new qp(this, 0, 16);
      this.e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.e.a(2.0F, (float)(12 + var2), 4.0F);
      this.f = new qp(this, 0, 16);
      this.f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.f.a(-2.0F, (float)(12 + var2), -4.0F);
      this.g = new qp(this, 0, 16);
      this.g.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.g.a(2.0F, (float)(12 + var2), -4.0F);
   }

   public void a(nn var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.a.a(var7);
      this.c.a(var7);
      this.d.a(var7);
      this.e.a(var7);
      this.f.a(var7);
      this.g.a(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a.g = var4 / 57.295776F;
      this.a.f = var5 / 57.295776F;
      this.d.f = gk.b(var1 * 0.6662F) * 1.4F * var2;
      this.e.f = gk.b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.f.f = gk.b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.g.f = gk.b(var1 * 0.6662F) * 1.4F * var2;
   }
}
