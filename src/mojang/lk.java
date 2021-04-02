package mojang;

public class lk extends ho {

   public qp a = (new qp(this)).a(0, 0).a(-6.0F, -5.0F, 0.0F, 6, 10, 0);
   public qp b = (new qp(this)).a(16, 0).a(0.0F, -5.0F, 0.0F, 6, 10, 0);
   public qp c = (new qp(this)).a(0, 10).a(0.0F, -4.0F, -0.99F, 5, 8, 1);
   public qp d = (new qp(this)).a(12, 10).a(0.0F, -4.0F, -0.01F, 5, 8, 1);
   public qp e = (new qp(this)).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public qp f = (new qp(this)).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public qp g = (new qp(this)).a(12, 0).a(-1.0F, -5.0F, 0.0F, 2, 10, 0);


   public lk() {
      this.a.a(0.0F, 0.0F, -1.0F);
      this.b.a(0.0F, 0.0F, 1.0F);
      this.g.g = 1.5707964F;
   }

   public void a(BaseEntity var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.a.a(var7);
      this.b.a(var7);
      this.g.a(var7);
      this.c.a(var7);
      this.d.a(var7);
      this.e.a(var7);
      this.f.a(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = (Utils.sin(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.a.g = 3.1415927F + var7;
      this.b.g = -var7;
      this.c.g = var7;
      this.d.g = -var7;
      this.e.g = var7 - var7 * 2.0F * var2;
      this.f.g = var7 - var7 * 2.0F * var3;
      this.c.c = Utils.sin(var7);
      this.d.c = Utils.sin(var7);
      this.e.c = Utils.sin(var7);
      this.f.c = Utils.sin(var7);
   }
}
