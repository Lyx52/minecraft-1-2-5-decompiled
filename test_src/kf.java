import org.lwjgl.opengl.GL11;

public class kf extends ho {

   public qp a = new qp(this, 0, 0);
   public qp b;
   public qp c;
   public qp d;
   public qp e;
   public qp f;
   protected float g = 8.0F;
   protected float n = 4.0F;


   public kf(int var1, float var2) {
      this.a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, var2);
      this.a.a(0.0F, (float)(18 - var1), -6.0F);
      this.b = new qp(this, 28, 8);
      this.b.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, var2);
      this.b.a(0.0F, (float)(17 - var1), 2.0F);
      this.c = new qp(this, 0, 16);
      this.c.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.c.a(-3.0F, (float)(24 - var1), 7.0F);
      this.d = new qp(this, 0, 16);
      this.d.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.d.a(3.0F, (float)(24 - var1), 7.0F);
      this.e = new qp(this, 0, 16);
      this.e.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.e.a(-3.0F, (float)(24 - var1), -5.0F);
      this.f = new qp(this, 0, 16);
      this.f.a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.f.a(3.0F, (float)(24 - var1), -5.0F);
   }

   public void a(nn var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      if(this.k) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, this.g * var7, this.n * var7);
         this.a.a(var7);
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
         this.b.a(var7);
         this.c.a(var7);
         this.d.a(var7);
         this.e.a(var7);
         this.f.a(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a.f = var5 / 57.295776F;
      this.a.g = var4 / 57.295776F;
      this.b.f = 1.5707964F;
      this.c.f = gk.b(var1 * 0.6662F) * 1.4F * var2;
      this.d.f = gk.b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.e.f = gk.b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.f.f = gk.b(var1 * 0.6662F) * 1.4F * var2;
   }
}
