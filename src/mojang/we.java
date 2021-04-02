package mojang;

import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class we extends fe {

   private xg c;
   private xg d;
   private xg i;
   private static final String[] j = new String[]{"cloth", "chain", "iron", "diamond", "gold"};


   public we() {
      super(new xg(0.0F), 0.5F);
      this.c = (xg)this.a;
      this.d = new xg(1.0F);
      this.i = new xg(0.5F);
   }

   protected int a(yw var1, int var2, float var3) {
      aan var4 = var1.ap.f(3 - var2);
      if(var4 != null) {
         yr var5 = var4.a();
         if(var5 instanceof ql) {
            ql var6 = (ql)var5;
            this.a("/mojang/armor/" + j[var6.c] + "_" + (var2 == 2?2:1) + ".png");
            xg var7 = var2 == 2?this.i:this.d;
            var7.c.j = var2 == 0;
            var7.d.j = var2 == 0;
            var7.e.j = var2 == 1 || var2 == 2;
            var7.f.j = var2 == 1;
            var7.g.j = var2 == 1;
            var7.n.j = var2 == 2 || var2 == 3;
            var7.o.j = var2 == 2 || var2 == 3;
            this.a(var7);
            if(var4.u()) {
               return 15;
            }

            return 1;
         }
      }

      return -1;
   }

   public void a(yw var1, double var2, double var4, double var6, float var8, float var9) {
      aan var10 = var1.ap.b();
      this.d.s = this.i.s = this.c.s = var10 != null?1:0;
      if(var10 != null && var1.ai() > 0) {
         aaq var11 = var10.m();
         if(var11 == aaq.d) {
            this.d.s = this.i.s = this.c.s = 3;
         } else if(var11 == aaq.e) {
            this.d.u = this.i.u = this.c.u = true;
         }
      }

      this.d.t = this.i.t = this.c.t = var1.V();
      double var13 = var4 - (double)var1.H;
      if(var1.V() && !(var1 instanceof vq)) {
         var13 -= 0.125D;
      }

      super.a((acq)var1, var2, var13, var6, var8, var9);
      this.d.u = this.i.u = this.c.u = false;
      this.d.t = this.i.t = this.c.t = false;
      this.d.s = this.i.s = this.c.s = 0;
   }

   protected void a(yw var1, double var2, double var4, double var6) {
      if(Minecraft.r() && var1 != this.e.h) {
         float var8 = 1.6F;
         float var9 = 0.016666668F * var8;
         float var10 = var1.e(this.e.h);
         float var11 = var1.V()?32.0F:64.0F;
         if(var10 < var11) {
            String var12 = var1.aA;
            if(!var1.V()) {
               if(var1.az()) {
                  this.a(var1, var12, var2, var4 - 1.5D, var6, 64);
               } else {
                  this.a(var1, var12, var2, var4, var6, 64);
               }
            } else {
               nl var13 = this.a();
               GL11.glPushMatrix();
               GL11.glTranslatef((float)var2 + 0.0F, (float)var4 + 2.3F, (float)var6);
               GL11.glNormal3f(0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-this.e.i, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(this.e.j, 1.0F, 0.0F, 0.0F);
               GL11.glScalef(-var9, -var9, var9);
               GL11.glDisable(2896);
               GL11.glTranslatef(0.0F, 0.25F / var9, 0.0F);
               GL11.glDepthMask(false);
               GL11.glEnable(3042);
               GL11.glBlendFunc(770, 771);
               adz var14 = adz.a;
               GL11.glDisable(3553);
               var14.b();
               int var15 = var13.a(var12) / 2;
               var14.a(0.0F, 0.0F, 0.0F, 0.25F);
               var14.a((double)(-var15 - 1), -1.0D, 0.0D);
               var14.a((double)(-var15 - 1), 8.0D, 0.0D);
               var14.a((double)(var15 + 1), 8.0D, 0.0D);
               var14.a((double)(var15 + 1), -1.0D, 0.0D);
               var14.a();
               GL11.glEnable(3553);
               GL11.glDepthMask(true);
               var13.b(var12, -var13.a(var12) / 2, 0, 553648127);
               GL11.glEnable(2896);
               GL11.glDisable(3042);
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glPopMatrix();
            }
         }
      }

   }

   protected void a(yw var1, float var2) {
      super.b(var1, var2);
      aan var3 = var1.ap.f(3);
      if(var3 != null && var3.a().bQ < 256) {
         GL11.glPushMatrix();
         this.c.c.c(0.0625F);
         if(vl.a(pb.m[var3.c].d())) {
            float var4 = 0.625F;
            GL11.glTranslatef(0.0F, -0.25F, 0.0F);
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
         }

         this.e.f.a(var1, var3, 0);
         GL11.glPopMatrix();
      }

      float var6;
      if(var1.aA.equals("deadmau5") && this.a(var1.Z, (String)null)) {
         for(int var19 = 0; var19 < 2; ++var19) {
            float var5 = var1.w + (var1.u - var1.w) * var2 - (var1.be + (var1.bd - var1.be) * var2);
            var6 = var1.x + (var1.v - var1.x) * var2;
            GL11.glPushMatrix();
            GL11.glRotatef(var5, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(0.375F * (float)(var19 * 2 - 1), 0.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.375F, 0.0F);
            GL11.glRotatef(-var6, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-var5, 0.0F, 1.0F, 0.0F);
            float var7 = 1.3333334F;
            GL11.glScalef(var7, var7, var7);
            this.c.a(0.0625F);
            GL11.glPopMatrix();
         }
      }

      float var10;
      if(this.a(var1.aC, (String)null)) {
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 0.0F, 0.125F);
         double var20 = var1.aE + (var1.aH - var1.aE) * (double)var2 - (var1.l + (var1.o - var1.l) * (double)var2);
         double var23 = var1.aF + (var1.aI - var1.aF) * (double)var2 - (var1.m + (var1.p - var1.m) * (double)var2);
         double var8 = var1.aG + (var1.aJ - var1.aG) * (double)var2 - (var1.n + (var1.q - var1.n) * (double)var2);
         var10 = var1.be + (var1.bd - var1.be) * var2;
         double var11 = (double)gk.a(var10 * 3.1415927F / 180.0F);
         double var13 = (double)(-gk.b(var10 * 3.1415927F / 180.0F));
         float var15 = (float)var23 * 10.0F;
         if(var15 < -6.0F) {
            var15 = -6.0F;
         }

         if(var15 > 32.0F) {
            var15 = 32.0F;
         }

         float var16 = (float)(var20 * var11 + var8 * var13) * 100.0F;
         float var17 = (float)(var20 * var13 - var8 * var11) * 100.0F;
         if(var16 < 0.0F) {
            var16 = 0.0F;
         }

         float var18 = var1.aw + (var1.ax - var1.aw) * var2;
         var15 += gk.a((var1.K + (var1.L - var1.K) * var2) * 6.0F) * 32.0F * var18;
         if(var1.V()) {
            var15 += 25.0F;
         }

         GL11.glRotatef(6.0F + var16 / 2.0F + var15, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var17 / 2.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var17 / 2.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         this.c.b(0.0625F);
         GL11.glPopMatrix();
      }

      aan var21 = var1.ap.b();
      if(var21 != null) {
         GL11.glPushMatrix();
         this.c.f.c(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         if(var1.aZ != null) {
            var21 = new aan(yr.D);
         }

         aaq var22 = null;
         if(var1.ai() > 0) {
            var22 = var21.m();
         }

         if(var21.c < 256 && vl.a(pb.m[var21.c].d())) {
            var6 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var6 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var6, -var6, var6);
         } else if(var21.c == yr.k.bQ) {
            var6 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var6, -var6, var6);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if(yr.e[var21.c].a()) {
            var6 = 0.625F;
            if(yr.e[var21.c].A_()) {
               GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
               GL11.glTranslatef(0.0F, -0.125F, 0.0F);
            }

            if(var1.ai() > 0 && var22 == aaq.d) {
               GL11.glTranslatef(0.05F, 0.0F, -0.1F);
               GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-10.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(-60.0F, 0.0F, 0.0F, 1.0F);
            }

            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var6, -var6, var6);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            var6 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var6, var6, var6);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         if(var21.a().c()) {
            for(int var25 = 0; var25 <= 1; ++var25) {
               int var24 = var21.a().b(var21.i(), var25);
               float var26 = (float)(var24 >> 16 & 255) / 255.0F;
               float var9 = (float)(var24 >> 8 & 255) / 255.0F;
               var10 = (float)(var24 & 255) / 255.0F;
               GL11.glColor4f(var26, var9, var10, 1.0F);
               this.e.f.a(var1, var21, var25);
            }
         } else {
            this.e.f.a(var1, var21, 0);
         }

         GL11.glPopMatrix();
      }

   }

   protected void b(yw var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   public void b() {
      this.c.h = 0.0F;
      this.c.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
      this.c.f.a(0.0625F);
   }

   protected void b(yw var1, double var2, double var4, double var6) {
      if(var1.M() && var1.az()) {
         super.a(var1, var2 + (double)var1.aM, var4 + (double)var1.aN, var6 + (double)var1.aO);
      } else {
         super.a(var1, var2, var4, var6);
      }

   }

   protected void a(yw var1, float var2, float var3, float var4) {
      if(var1.M() && var1.az()) {
         GL11.glRotatef(var1.ay(), 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.a(var1), 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
      } else {
         super.a(var1, var2, var3, var4);
      }

   }

}
