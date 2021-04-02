package mojang;

public class xg extends ho {

   public qp c;
   public qp d;
   public qp e;
   public qp f;
   public qp g;
   public qp n;
   public qp o;
   public qp p;
   public qp q;
   public int r;
   public int s;
   public boolean t;
   public boolean u;


   public xg() {
      this(0.0F);
   }

   public xg(float var1) {
      this(var1, 0.0F);
   }

   public xg(float var1, float var2) {
      this.r = 0;
      this.s = 0;
      this.t = false;
      this.u = false;
      this.q = new qp(this, 0, 0);
      this.q.a(-5.0F, 0.0F, -1.0F, 10, 16, 1, var1);
      this.p = new qp(this, 24, 0);
      this.p.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, var1);
      this.c = new qp(this, 0, 0);
      this.c.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.c.a(0.0F, 0.0F + var2, 0.0F);
      this.d = new qp(this, 32, 0);
      this.d.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.d.a(0.0F, 0.0F + var2, 0.0F);
      this.e = new qp(this, 16, 16);
      this.e.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.e.a(0.0F, 0.0F + var2, 0.0F);
      this.f = new qp(this, 40, 16);
      this.f.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.f.a(-5.0F, 2.0F + var2, 0.0F);
      this.g = new qp(this, 40, 16);
      this.g.i = true;
      this.g.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.g.a(5.0F, 2.0F + var2, 0.0F);
      this.n = new qp(this, 0, 16);
      this.n.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.n.a(-2.0F, 12.0F + var2, 0.0F);
      this.o = new qp(this, 0, 16);
      this.o.i = true;
      this.o.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.o.a(2.0F, 12.0F + var2, 0.0F);
   }

   public void a(BaseEntity var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.c.a(var7);
      this.e.a(var7);
      this.f.a(var7);
      this.g.a(var7);
      this.n.a(var7);
      this.o.a(var7);
      this.d.a(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.c.g = var4 / 57.295776F;
      this.c.f = var5 / 57.295776F;
      this.d.g = this.c.g;
      this.d.f = this.c.f;
      this.f.f = Utils.cos(var1 * 0.6662F + 3.1415927F) * 2.0F * var2 * 0.5F;
      this.g.f = Utils.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
      this.f.h = 0.0F;
      this.g.h = 0.0F;
      this.n.f = Utils.cos(var1 * 0.6662F) * 1.4F * var2;
      this.o.f = Utils.cos(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.n.g = 0.0F;
      this.o.g = 0.0F;
      if(this.i) {
         this.f.f += -0.62831855F;
         this.g.f += -0.62831855F;
         this.n.f = -1.2566371F;
         this.o.f = -1.2566371F;
         this.n.g = 0.31415927F;
         this.o.g = -0.31415927F;
      }

      if(this.r != 0) {
         this.g.f = this.g.f * 0.5F - 0.31415927F * (float)this.r;
      }

      if(this.s != 0) {
         this.f.f = this.f.f * 0.5F - 0.31415927F * (float)this.s;
      }

      this.f.g = 0.0F;
      this.g.g = 0.0F;
      float var7;
      float var8;
      if(this.h > -9990.0F) {
         var7 = this.h;
         this.e.g = Utils.sin(Utils.sqrt(var7) * 3.1415927F * 2.0F) * 0.2F;
         this.f.e = Utils.sin(this.e.g) * 5.0F;
         this.f.c = -Utils.cos(this.e.g) * 5.0F;
         this.g.e = -Utils.sin(this.e.g) * 5.0F;
         this.g.c = Utils.cos(this.e.g) * 5.0F;
         this.f.g += this.e.g;
         this.g.g += this.e.g;
         this.g.f += this.e.g;
         var7 = 1.0F - this.h;
         var7 *= var7;
         var7 *= var7;
         var7 = 1.0F - var7;
         var8 = Utils.sin(var7 * 3.1415927F);
         float var9 = Utils.sin(this.h * 3.1415927F) * -(this.c.f - 0.7F) * 0.75F;
         this.f.f = (float)((double)this.f.f - ((double)var8 * 1.2D + (double)var9));
         this.f.g += this.e.g * 2.0F;
         this.f.h = Utils.sin(this.h * 3.1415927F) * -0.4F;
      }

      if(this.t) {
         this.e.f = 0.5F;
         this.f.f += 0.4F;
         this.g.f += 0.4F;
         this.n.e = 4.0F;
         this.o.e = 4.0F;
         this.n.d = 9.0F;
         this.o.d = 9.0F;
         this.c.d = 1.0F;
      } else {
         this.e.f = 0.0F;
         this.n.e = 0.0F;
         this.o.e = 0.0F;
         this.n.d = 12.0F;
         this.o.d = 12.0F;
         this.c.d = 0.0F;
      }

      this.f.h += Utils.cos(var3 * 0.09F) * 0.05F + 0.05F;
      this.g.h -= Utils.cos(var3 * 0.09F) * 0.05F + 0.05F;
      this.f.f += Utils.sin(var3 * 0.067F) * 0.05F;
      this.g.f -= Utils.sin(var3 * 0.067F) * 0.05F;
      if(this.u) {
         var7 = 0.0F;
         var8 = 0.0F;
         this.f.h = 0.0F;
         this.g.h = 0.0F;
         this.f.g = -(0.1F - var7 * 0.6F) + this.c.g;
         this.g.g = 0.1F - var7 * 0.6F + this.c.g + 0.4F;
         this.f.f = -1.5707964F + this.c.f;
         this.g.f = -1.5707964F + this.c.f;
         this.f.f -= var7 * 1.2F - var8 * 0.4F;
         this.g.f -= var7 * 1.2F - var8 * 0.4F;
         this.f.h += Utils.cos(var3 * 0.09F) * 0.05F + 0.05F;
         this.g.h -= Utils.cos(var3 * 0.09F) * 0.05F + 0.05F;
         this.f.f += Utils.sin(var3 * 0.067F) * 0.05F;
         this.g.f -= Utils.sin(var3 * 0.067F) * 0.05F;
      }

   }

   public void a(float var1) {
      this.p.g = this.c.g;
      this.p.f = this.c.f;
      this.p.c = 0.0F;
      this.p.d = 0.0F;
      this.p.a(var1);
   }

   public void b(float var1) {
      this.q.a(var1);
   }
}
