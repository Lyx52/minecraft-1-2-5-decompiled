package mojang;

public class ud extends xg {

   public boolean a = false;
   public boolean b = false;


   public ud() {
      super(0.0F, -14.0F);
      float var1 = -14.0F;
      float var2 = 0.0F;
      this.d = new qp(this, 0, 16);
      this.d.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.d.a(0.0F, 0.0F + var1, 0.0F);
      this.e = new qp(this, 32, 16);
      this.e.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var2);
      this.e.a(0.0F, 0.0F + var1, 0.0F);
      this.f = new qp(this, 56, 0);
      this.f.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, var2);
      this.f.a(-3.0F, 2.0F + var1, 0.0F);
      this.g = new qp(this, 56, 0);
      this.g.i = true;
      this.g.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, var2);
      this.g.a(5.0F, 2.0F + var1, 0.0F);
      this.n = new qp(this, 56, 0);
      this.n.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, var2);
      this.n.a(-2.0F, 12.0F + var1, 0.0F);
      this.o = new qp(this, 56, 0);
      this.o.i = true;
      this.o.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, var2);
      this.o.a(2.0F, 12.0F + var1, 0.0F);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      this.c.j = true;
      float var7 = -14.0F;
      this.e.f = 0.0F;
      this.e.d = var7;
      this.e.e = -0.0F;
      this.n.f -= 0.0F;
      this.o.f -= 0.0F;
      this.f.f = (float)((double)this.f.f * 0.5D);
      this.g.f = (float)((double)this.g.f * 0.5D);
      this.n.f = (float)((double)this.n.f * 0.5D);
      this.o.f = (float)((double)this.o.f * 0.5D);
      float var8 = 0.4F;
      if(this.f.f > var8) {
         this.f.f = var8;
      }

      if(this.g.f > var8) {
         this.g.f = var8;
      }

      if(this.f.f < -var8) {
         this.f.f = -var8;
      }

      if(this.g.f < -var8) {
         this.g.f = -var8;
      }

      if(this.n.f > var8) {
         this.n.f = var8;
      }

      if(this.o.f > var8) {
         this.o.f = var8;
      }

      if(this.n.f < -var8) {
         this.n.f = -var8;
      }

      if(this.o.f < -var8) {
         this.o.f = -var8;
      }

      if(this.a) {
         this.f.f = -0.5F;
         this.g.f = -0.5F;
         this.f.h = 0.05F;
         this.g.h = -0.05F;
      }

      this.f.e = 0.0F;
      this.g.e = 0.0F;
      this.n.e = 0.0F;
      this.o.e = 0.0F;
      this.n.d = 9.0F + var7;
      this.o.d = 9.0F + var7;
      this.c.e = -0.0F;
      this.c.d = var7 + 1.0F;
      this.d.c = this.c.c;
      this.d.d = this.c.d;
      this.d.e = this.c.e;
      this.d.f = this.c.f;
      this.d.g = this.c.g;
      this.d.h = this.c.h;
      if(this.b) {
         float var9 = 1.0F;
         this.c.d -= var9 * 5.0F;
      }

   }
}
