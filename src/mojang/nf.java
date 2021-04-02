package mojang;

public class nf extends ho {

   public qp a;
   public qp b;
   public qp c;
   public qp d;
   public qp e;
   public qp f;
   public qp g;
   public qp n;
   public qp o;
   public qp p;
   public qp q;


   public nf() {
      float var1 = 0.0F;
      byte var2 = 15;
      this.a = new qp(this, 32, 4);
      this.a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, var1);
      this.a.a(0.0F, (float)var2, -3.0F);
      this.b = new qp(this, 0, 0);
      this.b.a(-3.0F, -3.0F, -3.0F, 6, 6, 6, var1);
      this.b.a(0.0F, (float)var2, 0.0F);
      this.c = new qp(this, 0, 12);
      this.c.a(-5.0F, -4.0F, -6.0F, 10, 8, 12, var1);
      this.c.a(0.0F, (float)var2, 9.0F);
      this.d = new qp(this, 18, 0);
      this.d.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.d.a(-4.0F, (float)var2, 2.0F);
      this.e = new qp(this, 18, 0);
      this.e.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.e.a(4.0F, (float)var2, 2.0F);
      this.f = new qp(this, 18, 0);
      this.f.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.f.a(-4.0F, (float)var2, 1.0F);
      this.g = new qp(this, 18, 0);
      this.g.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.g.a(4.0F, (float)var2, 1.0F);
      this.n = new qp(this, 18, 0);
      this.n.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.n.a(-4.0F, (float)var2, 0.0F);
      this.o = new qp(this, 18, 0);
      this.o.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.o.a(4.0F, (float)var2, 0.0F);
      this.p = new qp(this, 18, 0);
      this.p.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.p.a(-4.0F, (float)var2, -1.0F);
      this.q = new qp(this, 18, 0);
      this.q.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.q.a(4.0F, (float)var2, -1.0F);
   }

   public void a(BaseEntity var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.a.a(var7);
      this.b.a(var7);
      this.c.a(var7);
      this.d.a(var7);
      this.e.a(var7);
      this.f.a(var7);
      this.g.a(var7);
      this.n.a(var7);
      this.o.a(var7);
      this.p.a(var7);
      this.q.a(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a.g = var4 / 57.295776F;
      this.a.f = var5 / 57.295776F;
      float var7 = 0.7853982F;
      this.d.h = -var7;
      this.e.h = var7;
      this.f.h = -var7 * 0.74F;
      this.g.h = var7 * 0.74F;
      this.n.h = -var7 * 0.74F;
      this.o.h = var7 * 0.74F;
      this.p.h = -var7;
      this.q.h = var7;
      float var8 = -0.0F;
      float var9 = 0.3926991F;
      this.d.g = var9 * 2.0F + var8;
      this.e.g = -var9 * 2.0F - var8;
      this.f.g = var9 * 1.0F + var8;
      this.g.g = -var9 * 1.0F - var8;
      this.n.g = -var9 * 1.0F + var8;
      this.o.g = var9 * 1.0F - var8;
      this.p.g = -var9 * 2.0F + var8;
      this.q.g = var9 * 2.0F - var8;
      float var10 = -(Utils.cos(var1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var2;
      float var11 = -(Utils.cos(var1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * var2;
      float var12 = -(Utils.cos(var1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * var2;
      float var13 = -(Utils.cos(var1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * var2;
      float var14 = Math.abs(Utils.sin(var1 * 0.6662F + 0.0F) * 0.4F) * var2;
      float var15 = Math.abs(Utils.sin(var1 * 0.6662F + 3.1415927F) * 0.4F) * var2;
      float var16 = Math.abs(Utils.sin(var1 * 0.6662F + 1.5707964F) * 0.4F) * var2;
      float var17 = Math.abs(Utils.sin(var1 * 0.6662F + 4.712389F) * 0.4F) * var2;
      this.d.g += var10;
      this.e.g += -var10;
      this.f.g += var11;
      this.g.g += -var11;
      this.n.g += var12;
      this.o.g += -var12;
      this.p.g += var13;
      this.q.g += -var13;
      this.d.h += var14;
      this.e.h += -var14;
      this.f.h += var15;
      this.g.h += -var15;
      this.n.h += var16;
      this.o.h += -var16;
      this.p.h += var17;
      this.q.h += -var17;
   }
}
