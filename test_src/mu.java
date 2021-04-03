import org.lwjgl.opengl.GL11;

public class mu extends ho {

   qp a;
   qp b;
   qp c;
   qp d;
   qp e;
   qp f;
   qp g;
   qp n;
   int o = 1;


   public mu() {
      this.a("head.main", 0, 0);
      this.a("head.nose", 0, 24);
      this.a("head.ear1", 0, 10);
      this.a("head.ear2", 6, 10);
      this.g = new qp(this, "head");
      this.g.a("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
      this.g.a("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
      this.g.a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
      this.g.a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
      this.g.a(0.0F, 15.0F, -9.0F);
      this.n = new qp(this, 20, 0);
      this.n.a(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
      this.n.a(0.0F, 12.0F, -10.0F);
      this.e = new qp(this, 0, 15);
      this.e.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.e.f = 0.9F;
      this.e.a(0.0F, 15.0F, 8.0F);
      this.f = new qp(this, 4, 15);
      this.f.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.f.a(0.0F, 20.0F, 14.0F);
      this.a = new qp(this, 8, 13);
      this.a.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.a.a(1.1F, 18.0F, 5.0F);
      this.b = new qp(this, 8, 13);
      this.b.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.b.a(-1.1F, 18.0F, 5.0F);
      this.c = new qp(this, 40, 0);
      this.c.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.c.a(1.2F, 13.8F, -5.0F);
      this.d = new qp(this, 40, 0);
      this.d.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.d.a(-1.2F, 13.8F, -5.0F);
   }

   public void a(nn var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      if(this.k) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glScalef(1.5F / var8, 1.5F / var8, 1.5F / var8);
         GL11.glTranslatef(0.0F, 10.0F * var7, 4.0F * var7);
         this.g.a(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.n.a(var7);
         this.a.a(var7);
         this.b.a(var7);
         this.c.a(var7);
         this.d.a(var7);
         this.e.a(var7);
         this.f.a(var7);
         GL11.glPopMatrix();
      } else {
         this.g.a(var7);
         this.n.a(var7);
         this.e.a(var7);
         this.f.a(var7);
         this.a.a(var7);
         this.b.a(var7);
         this.c.a(var7);
         this.d.a(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.g.f = var5 / 57.295776F;
      this.g.g = var4 / 57.295776F;
      if(this.o != 3) {
         this.n.f = 1.5707964F;
         if(this.o == 2) {
            this.a.f = gk.b(var1 * 0.6662F) * 1.0F * var2;
            this.b.f = gk.b(var1 * 0.6662F + 0.3F) * 1.0F * var2;
            this.c.f = gk.b(var1 * 0.6662F + 3.1415927F + 0.3F) * 1.0F * var2;
            this.d.f = gk.b(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
            this.f.f = 1.7278761F + 0.31415927F * gk.b(var1) * var2;
         } else {
            this.a.f = gk.b(var1 * 0.6662F) * 1.0F * var2;
            this.b.f = gk.b(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
            this.c.f = gk.b(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
            this.d.f = gk.b(var1 * 0.6662F) * 1.0F * var2;
            if(this.o == 1) {
               this.f.f = 1.7278761F + 0.7853982F * gk.b(var1) * var2;
            } else {
               this.f.f = 1.7278761F + 0.47123894F * gk.b(var1) * var2;
            }
         }
      }

   }

   public void a(acq var1, float var2, float var3, float var4) {
      uo var5 = (uo)var1;
      this.n.d = 12.0F;
      this.n.e = -10.0F;
      this.g.d = 15.0F;
      this.g.e = -9.0F;
      this.e.d = 15.0F;
      this.e.e = 8.0F;
      this.f.d = 20.0F;
      this.f.e = 14.0F;
      this.c.d = this.d.d = 13.8F;
      this.c.e = this.d.e = -5.0F;
      this.a.d = this.b.d = 18.0F;
      this.a.e = this.b.e = 5.0F;
      this.e.f = 0.9F;
      if(var5.V()) {
         ++this.n.d;
         this.g.d += 2.0F;
         ++this.e.d;
         this.f.d += -4.0F;
         this.f.e += 2.0F;
         this.e.f = 1.5707964F;
         this.f.f = 1.5707964F;
         this.o = 0;
      } else if(var5.W()) {
         this.f.d = this.e.d;
         this.f.e += 2.0F;
         this.e.f = 1.5707964F;
         this.f.f = 1.5707964F;
         this.o = 2;
      } else if(var5.af()) {
         this.n.f = 0.7853982F;
         this.n.d += -4.0F;
         this.n.e += 5.0F;
         this.g.d += -3.3F;
         ++this.g.e;
         this.e.d += 8.0F;
         this.e.e += -2.0F;
         this.f.d += 2.0F;
         this.f.e += -0.8F;
         this.e.f = 1.7278761F;
         this.f.f = 2.670354F;
         this.c.f = this.d.f = -0.15707964F;
         this.c.d = this.d.d = 15.8F;
         this.c.e = this.d.e = -7.0F;
         this.a.f = this.b.f = -1.5707964F;
         this.a.d = this.b.d = 21.0F;
         this.a.e = this.b.e = 1.0F;
         this.o = 3;
      } else {
         this.o = 1;
      }

   }
}
