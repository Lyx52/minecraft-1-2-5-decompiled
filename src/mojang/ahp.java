package mojang;

import org.lwjgl.opengl.GL11;

public class ahp extends ho {

   public qp a;
   public qp b;
   public qp c;
   public qp d;
   public qp e;
   public qp f;
   public qp g;
   public qp n;


   public ahp() {
      byte var1 = 16;
      this.a = new qp(this, 0, 0);
      this.a.a(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
      this.a.a(0.0F, (float)(-1 + var1), -4.0F);
      this.g = new qp(this, 14, 0);
      this.g.a(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
      this.g.a(0.0F, (float)(-1 + var1), -4.0F);
      this.n = new qp(this, 14, 4);
      this.n.a(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
      this.n.a(0.0F, (float)(-1 + var1), -4.0F);
      this.b = new qp(this, 0, 9);
      this.b.a(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
      this.b.a(0.0F, (float)var1, 0.0F);
      this.c = new qp(this, 26, 0);
      this.c.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.c.a(-2.0F, (float)(3 + var1), 1.0F);
      this.d = new qp(this, 26, 0);
      this.d.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.d.a(1.0F, (float)(3 + var1), 1.0F);
      this.e = new qp(this, 24, 13);
      this.e.a(0.0F, 0.0F, -3.0F, 1, 4, 6);
      this.e.a(-4.0F, (float)(-3 + var1), 0.0F);
      this.f = new qp(this, 24, 13);
      this.f.a(-1.0F, 0.0F, -3.0F, 1, 4, 6);
      this.f.a(4.0F, (float)(-3 + var1), 0.0F);
   }

   public void a(BaseEntity var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      if(this.k) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 5.0F * var7, 2.0F * var7);
         this.a.a(var7);
         this.g.a(var7);
         this.n.a(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.b.a(var7);
         this.c.a(var7);
         this.d.a(var7);
         this.e.a(var7);
         this.f.a(var7);
         GL11.glPopMatrix();
      } else {
         this.a.a(var7);
         this.g.a(var7);
         this.n.a(var7);
         this.b.a(var7);
         this.c.a(var7);
         this.d.a(var7);
         this.e.a(var7);
         this.f.a(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a.f = -(var5 / 57.295776F);
      this.a.g = var4 / 57.295776F;
      this.g.f = this.a.f;
      this.g.g = this.a.g;
      this.n.f = this.a.f;
      this.n.g = this.a.g;
      this.b.f = 1.5707964F;
      this.c.f = Utils.cos(var1 * 0.6662F) * 1.4F * var2;
      this.d.f = Utils.cos(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.e.h = var3;
      this.f.h = -var3;
   }
}
