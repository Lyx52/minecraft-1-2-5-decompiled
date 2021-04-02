package mojang;

import org.lwjgl.opengl.GL11;

public class sx extends ho {

   public qp a;
   public qp b;
   public qp c;
   public qp d;
   public qp e;
   public qp f;
   qp g;
   qp n;


   public sx() {
      float var1 = 0.0F;
      float var2 = 13.5F;
      this.a = new qp(this, 0, 0);
      this.a.a(-3.0F, -3.0F, -2.0F, 6, 6, 4, var1);
      this.a.a(-1.0F, var2, -7.0F);
      this.b = new qp(this, 18, 14);
      this.b.a(-4.0F, -2.0F, -3.0F, 6, 9, 6, var1);
      this.b.a(0.0F, 14.0F, 2.0F);
      this.n = new qp(this, 21, 0);
      this.n.a(-4.0F, -3.0F, -3.0F, 8, 6, 7, var1);
      this.n.a(-1.0F, 14.0F, 2.0F);
      this.c = new qp(this, 0, 18);
      this.c.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.c.a(-2.5F, 16.0F, 7.0F);
      this.d = new qp(this, 0, 18);
      this.d.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.d.a(0.5F, 16.0F, 7.0F);
      this.e = new qp(this, 0, 18);
      this.e.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.e.a(-2.5F, 16.0F, -4.0F);
      this.f = new qp(this, 0, 18);
      this.f.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.f.a(0.5F, 16.0F, -4.0F);
      this.g = new qp(this, 9, 18);
      this.g.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.g.a(-1.0F, 12.0F, 8.0F);
      this.a.a(16, 14).a(-3.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.a.a(16, 14).a(1.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.a.a(0, 10).a(-1.5F, 0.0F, -5.0F, 3, 3, 4, var1);
   }

   public void a(BaseEntity var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(var2, var3, var4, var5, var6, var7);
      if(this.k) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 5.0F * var7, 2.0F * var7);
         this.a.b(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.b.a(var7);
         this.c.a(var7);
         this.d.a(var7);
         this.e.a(var7);
         this.f.a(var7);
         this.g.b(var7);
         this.n.a(var7);
         GL11.glPopMatrix();
      } else {
         this.a.b(var7);
         this.b.a(var7);
         this.c.a(var7);
         this.d.a(var7);
         this.e.a(var7);
         this.f.a(var7);
         this.g.b(var7);
         this.n.a(var7);
      }

   }

   public void a(Mob var1, float var2, float var3, float var4) {
      Wolf var5 = (Wolf)var1;
      if(var5.am()) {
         this.g.g = 0.0F;
      } else {
         this.g.g = Utils.cos(var2 * 0.6662F) * 1.4F * var3;
      }

      if(var5.af()) {
         this.n.a(-1.0F, 16.0F, -3.0F);
         this.n.f = 1.2566371F;
         this.n.g = 0.0F;
         this.b.a(0.0F, 18.0F, 0.0F);
         this.b.f = 0.7853982F;
         this.g.a(-1.0F, 21.0F, 6.0F);
         this.c.a(-2.5F, 22.0F, 2.0F);
         this.c.f = 4.712389F;
         this.d.a(0.5F, 22.0F, 2.0F);
         this.d.f = 4.712389F;
         this.e.f = 5.811947F;
         this.e.a(-2.49F, 17.0F, -4.0F);
         this.f.f = 5.811947F;
         this.f.a(0.51F, 17.0F, -4.0F);
      } else {
         this.b.a(0.0F, 14.0F, 2.0F);
         this.b.f = 1.5707964F;
         this.n.a(-1.0F, 14.0F, -3.0F);
         this.n.f = this.b.f;
         this.g.a(-1.0F, 12.0F, 8.0F);
         this.c.a(-2.5F, 16.0F, 7.0F);
         this.d.a(0.5F, 16.0F, 7.0F);
         this.e.a(-2.5F, 16.0F, -4.0F);
         this.f.a(0.5F, 16.0F, -4.0F);
         this.c.f = Utils.cos(var2 * 0.6662F) * 1.4F * var3;
         this.d.f = Utils.cos(var2 * 0.6662F + 3.1415927F) * 1.4F * var3;
         this.e.f = Utils.cos(var2 * 0.6662F + 3.1415927F) * 1.4F * var3;
         this.f.f = Utils.cos(var2 * 0.6662F) * 1.4F * var3;
      }

      this.a.h = var5.d(var4) + var5.d(var4, 0.0F);
      this.n.h = var5.d(var4, -0.08F);
      this.b.h = var5.d(var4, -0.16F);
      this.g.h = var5.d(var4, -0.2F);
      if(var5.aj()) {
         float var6 = var5.a(var4) * var5.c(var4);
         GL11.glColor3f(var6, var6, var6);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      this.a.f = var5 / 57.295776F;
      this.a.g = var4 / 57.295776F;
      this.g.f = var3;
   }
}
