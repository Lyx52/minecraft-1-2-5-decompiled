package mojang;

import org.lwjgl.opengl.GL11;

public class aks extends ho {

   private qp a;
   private qp b;
   private qp c;
   private qp d;
   private qp e;
   private qp f;
   private qp g;
   private qp n;
   private qp o;
   private qp p;
   private qp q;
   private qp r;
   private float s;


   public aks(float var1) {
      this.l = 256;
      this.m = 256;
      this.a("body.body", 0, 0);
      this.a("wing.skin", -56, 88);
      this.a("wingtip.skin", -56, 144);
      this.a("rearleg.main", 0, 0);
      this.a("rearfoot.main", 112, 0);
      this.a("rearlegtip.main", 196, 0);
      this.a("head.upperhead", 112, 30);
      this.a("wing.bone", 112, 88);
      this.a("head.upperlip", 176, 44);
      this.a("jaw.jaw", 176, 65);
      this.a("frontleg.main", 112, 104);
      this.a("wingtip.bone", 112, 136);
      this.a("frontfoot.main", 144, 104);
      this.a("neck.box", 192, 104);
      this.a("frontlegtip.main", 226, 138);
      this.a("body.scale", 220, 53);
      this.a("head.scale", 0, 0);
      this.a("neck.scale", 48, 0);
      this.a("head.nostril", 112, 0);
      float var2 = -16.0F;
      this.a = new qp(this, "head");
      this.a.a("upperlip", -6.0F, -1.0F, -8.0F + var2, 12, 5, 16);
      this.a.a("upperhead", -8.0F, -8.0F, 6.0F + var2, 16, 16, 16);
      this.a.i = true;
      this.a.a("scale", -5.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.a.a("nostril", -5.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      this.a.i = false;
      this.a.a("scale", 3.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.a.a("nostril", 3.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      this.c = new qp(this, "jaw");
      this.c.a(0.0F, 4.0F, 8.0F + var2);
      this.c.a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
      this.a.a(this.c);
      this.b = new qp(this, "neck");
      this.b.a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
      this.b.a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
      this.d = new qp(this, "body");
      this.d.a(0.0F, 4.0F, 8.0F);
      this.d.a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
      this.d.a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
      this.d.a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
      this.d.a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
      this.q = new qp(this, "wing");
      this.q.a(-12.0F, 5.0F, 2.0F);
      this.q.a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
      this.q.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.r = new qp(this, "wingtip");
      this.r.a(-56.0F, 0.0F, 0.0F);
      this.r.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
      this.r.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.q.a(this.r);
      this.f = new qp(this, "frontleg");
      this.f.a(-12.0F, 20.0F, 2.0F);
      this.f.a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
      this.n = new qp(this, "frontlegtip");
      this.n.a(0.0F, 20.0F, -1.0F);
      this.n.a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
      this.f.a(this.n);
      this.p = new qp(this, "frontfoot");
      this.p.a(0.0F, 23.0F, 0.0F);
      this.p.a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
      this.n.a(this.p);
      this.e = new qp(this, "rearleg");
      this.e.a(-16.0F, 16.0F, 42.0F);
      this.e.a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
      this.g = new qp(this, "rearlegtip");
      this.g.a(0.0F, 32.0F, -4.0F);
      this.g.a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
      this.e.a(this.g);
      this.o = new qp(this, "rearfoot");
      this.o.a(0.0F, 31.0F, 4.0F);
      this.o.a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
      this.g.a(this.o);
   }

   public void a(acq var1, float var2, float var3, float var4) {
      this.s = var4;
   }

   public void a(nn var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      GL11.glPushMatrix();
      oq var8 = (oq)var1;
      float var9 = var8.au + (var8.av - var8.au) * this.s;
      this.c.f = (float)(Math.sin((double)(var9 * 3.1415927F * 2.0F)) + 1.0D) * 0.2F;
      float var10 = (float)(Math.sin((double)(var9 * 3.1415927F * 2.0F - 1.0F)) + 1.0D);
      var10 = (var10 * var10 * 1.0F + var10 * 2.0F) * 0.05F;
      GL11.glTranslatef(0.0F, var10 - 2.0F, -3.0F);
      GL11.glRotatef(var10 * 2.0F, 1.0F, 0.0F, 0.0F);
      float var11 = -30.0F;
      float var13 = 0.0F;
      float var14 = 1.5F;
      double[] var15 = var8.a(6, this.s);
      float var16 = this.a(var8.a(5, this.s)[0] - var8.a(10, this.s)[0]);
      float var17 = this.a(var8.a(5, this.s)[0] + (double)(var16 / 2.0F));
      var11 += 2.0F;
      float var18 = var9 * 3.1415927F * 2.0F;
      var11 = 20.0F;
      float var12 = -12.0F;

      float var21;
      for(int var19 = 0; var19 < 5; ++var19) {
         double[] var20 = var8.a(5 - var19, this.s);
         var21 = (float)Math.cos((double)((float)var19 * 0.45F + var18)) * 0.15F;
         this.b.g = this.a(var20[0] - var15[0]) * 3.1415927F / 180.0F * var14;
         this.b.f = var21 + (float)(var20[1] - var15[1]) * 3.1415927F / 180.0F * var14 * 5.0F;
         this.b.h = -this.a(var20[0] - (double)var17) * 3.1415927F / 180.0F * var14;
         this.b.d = var11;
         this.b.e = var12;
         this.b.c = var13;
         var11 = (float)((double)var11 + Math.sin((double)this.b.f) * 10.0D);
         var12 = (float)((double)var12 - Math.cos((double)this.b.g) * Math.cos((double)this.b.f) * 10.0D);
         var13 = (float)((double)var13 - Math.sin((double)this.b.g) * Math.cos((double)this.b.f) * 10.0D);
         this.b.a(var7);
      }

      this.a.d = var11;
      this.a.e = var12;
      this.a.c = var13;
      double[] var22 = var8.a(0, this.s);
      this.a.g = this.a(var22[0] - var15[0]) * 3.1415927F / 180.0F * 1.0F;
      this.a.h = -this.a(var22[0] - (double)var17) * 3.1415927F / 180.0F * 1.0F;
      this.a.a(var7);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var16 * var14 * 1.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(0.0F, -1.0F, 0.0F);
      this.d.h = 0.0F;
      this.d.a(var7);

      for(int var23 = 0; var23 < 2; ++var23) {
         GL11.glEnable(2884);
         var21 = var9 * 3.1415927F * 2.0F;
         this.q.f = 0.125F - (float)Math.cos((double)var21) * 0.2F;
         this.q.g = 0.25F;
         this.q.h = (float)(Math.sin((double)var21) + 0.125D) * 0.8F;
         this.r.h = -((float)(Math.sin((double)(var21 + 2.0F)) + 0.5D)) * 0.75F;
         this.e.f = 1.0F + var10 * 0.1F;
         this.g.f = 0.5F + var10 * 0.1F;
         this.o.f = 0.75F + var10 * 0.1F;
         this.f.f = 1.3F + var10 * 0.1F;
         this.n.f = -0.5F - var10 * 0.1F;
         this.p.f = 0.75F + var10 * 0.1F;
         this.q.a(var7);
         this.f.a(var7);
         this.e.a(var7);
         GL11.glScalef(-1.0F, 1.0F, 1.0F);
         if(var23 == 0) {
            GL11.glCullFace(1028);
         }
      }

      GL11.glPopMatrix();
      GL11.glCullFace(1029);
      GL11.glDisable(2884);
      float var24 = -((float)Math.sin((double)(var9 * 3.1415927F * 2.0F))) * 0.0F;
      var18 = var9 * 3.1415927F * 2.0F;
      var11 = 10.0F;
      var12 = 60.0F;
      var13 = 0.0F;
      var15 = var8.a(11, this.s);

      for(int var25 = 0; var25 < 12; ++var25) {
         var22 = var8.a(12 + var25, this.s);
         var24 = (float)((double)var24 + Math.sin((double)((float)var25 * 0.45F + var18)) * 0.05000000074505806D);
         this.b.g = (this.a(var22[0] - var15[0]) * var14 + 180.0F) * 3.1415927F / 180.0F;
         this.b.f = var24 + (float)(var22[1] - var15[1]) * 3.1415927F / 180.0F * var14 * 5.0F;
         this.b.h = this.a(var22[0] - (double)var17) * 3.1415927F / 180.0F * var14;
         this.b.d = var11;
         this.b.e = var12;
         this.b.c = var13;
         var11 = (float)((double)var11 + Math.sin((double)this.b.f) * 10.0D);
         var12 = (float)((double)var12 - Math.cos((double)this.b.g) * Math.cos((double)this.b.f) * 10.0D);
         var13 = (float)((double)var13 - Math.sin((double)this.b.g) * Math.cos((double)this.b.f) * 10.0D);
         this.b.a(var7);
      }

      GL11.glPopMatrix();
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
   }

   private float a(double var1) {
      while(var1 >= 180.0D) {
         var1 -= 360.0D;
      }

      while(var1 < -180.0D) {
         var1 += 360.0D;
      }

      return (float)var1;
   }
}
