package mojang;

import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class mn {

   private Minecraft a;
   private aan b = null;
   private float c = 0.0F;
   private float d = 0.0F;
   private vl e = new vl();
   private aal f;
   private int g = -1;


   public mn(Minecraft var1) {
      this.a = var1;
      this.f = new aal(var1.q, var1.A, var1.p);
   }

   public void a(acq var1, aan var2, int var3) {
      GL11.glPushMatrix();
      if(var2.c < 256 && vl.a(pb.m[var2.c].d())) {
         GL11.glBindTexture(3553, this.a.p.b("/mojang/terrain.png"));
         this.e.a(pb.m[var2.c], var2.i(), 1.0F);
      } else {
         if(var2.c < 256) {
            GL11.glBindTexture(3553, this.a.p.b("/mojang/terrain.png"));
         } else {
            GL11.glBindTexture(3553, this.a.p.b("/mojang/gui/items.png"));
         }

         adz var4 = adz.a;
         int var5 = var1.b(var2, var3);
         float var6 = ((float)(var5 % 16 * 16) + 0.0F) / 256.0F;
         float var7 = ((float)(var5 % 16 * 16) + 15.99F) / 256.0F;
         float var8 = ((float)(var5 / 16 * 16) + 0.0F) / 256.0F;
         float var9 = ((float)(var5 / 16 * 16) + 15.99F) / 256.0F;
         float var10 = 0.0F;
         float var11 = 0.3F;
         GL11.glEnable('\u803a');
         GL11.glTranslatef(-var10, -var11, 0.0F);
         float var12 = 1.5F;
         GL11.glScalef(var12, var12, var12);
         GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
         this.a(var4, var7, var8, var6, var9);
         if(var2 != null && var2.r() && var3 == 0) {
            GL11.glDepthFunc(514);
            GL11.glDisable(2896);
            this.a.p.b(this.a.p.b("%blur%/mojang.misc/glint.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(768, 1);
            float var13 = 0.76F;
            GL11.glColor4f(0.5F * var13, 0.25F * var13, 0.8F * var13, 1.0F);
            GL11.glMatrixMode(5890);
            GL11.glPushMatrix();
            float var14 = 0.125F;
            GL11.glScalef(var14, var14, var14);
            float var15 = (float)(System.currentTimeMillis() % 3000L) / 3000.0F * 8.0F;
            GL11.glTranslatef(var15, 0.0F, 0.0F);
            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
            this.a(var4, 0.0F, 0.0F, 1.0F, 1.0F);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(var14, var14, var14);
            var15 = (float)(System.currentTimeMillis() % 4873L) / 4873.0F * 8.0F;
            GL11.glTranslatef(-var15, 0.0F, 0.0F);
            GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
            this.a(var4, 0.0F, 0.0F, 1.0F, 1.0F);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
         }

         GL11.glDisable('\u803a');
      }

      GL11.glPopMatrix();
   }

   private void a(adz var1, float var2, float var3, float var4, float var5) {
      float var6 = 1.0F;
      float var7 = 0.0625F;
      var1.b();
      var1.b(0.0F, 0.0F, 1.0F);
      var1.a(0.0D, 0.0D, 0.0D, (double)var2, (double)var5);
      var1.a((double)var6, 0.0D, 0.0D, (double)var4, (double)var5);
      var1.a((double)var6, 1.0D, 0.0D, (double)var4, (double)var3);
      var1.a(0.0D, 1.0D, 0.0D, (double)var2, (double)var3);
      var1.a();
      var1.b();
      var1.b(0.0F, 0.0F, -1.0F);
      var1.a(0.0D, 1.0D, (double)(0.0F - var7), (double)var2, (double)var3);
      var1.a((double)var6, 1.0D, (double)(0.0F - var7), (double)var4, (double)var3);
      var1.a((double)var6, 0.0D, (double)(0.0F - var7), (double)var4, (double)var5);
      var1.a(0.0D, 0.0D, (double)(0.0F - var7), (double)var2, (double)var5);
      var1.a();
      var1.b();
      var1.b(-1.0F, 0.0F, 0.0F);

      int var8;
      float var9;
      float var10;
      float var11;
      for(var8 = 0; var8 < 16; ++var8) {
         var9 = (float)var8 / 16.0F;
         var10 = var2 + (var4 - var2) * var9 - 0.001953125F;
         var11 = var6 * var9;
         var1.a((double)var11, 0.0D, (double)(0.0F - var7), (double)var10, (double)var5);
         var1.a((double)var11, 0.0D, 0.0D, (double)var10, (double)var5);
         var1.a((double)var11, 1.0D, 0.0D, (double)var10, (double)var3);
         var1.a((double)var11, 1.0D, (double)(0.0F - var7), (double)var10, (double)var3);
      }

      var1.a();
      var1.b();
      var1.b(1.0F, 0.0F, 0.0F);

      for(var8 = 0; var8 < 16; ++var8) {
         var9 = (float)var8 / 16.0F;
         var10 = var2 + (var4 - var2) * var9 - 0.001953125F;
         var11 = var6 * var9 + 0.0625F;
         var1.a((double)var11, 1.0D, (double)(0.0F - var7), (double)var10, (double)var3);
         var1.a((double)var11, 1.0D, 0.0D, (double)var10, (double)var3);
         var1.a((double)var11, 0.0D, 0.0D, (double)var10, (double)var5);
         var1.a((double)var11, 0.0D, (double)(0.0F - var7), (double)var10, (double)var5);
      }

      var1.a();
      var1.b();
      var1.b(0.0F, 1.0F, 0.0F);

      for(var8 = 0; var8 < 16; ++var8) {
         var9 = (float)var8 / 16.0F;
         var10 = var5 + (var3 - var5) * var9 - 0.001953125F;
         var11 = var6 * var9 + 0.0625F;
         var1.a(0.0D, (double)var11, 0.0D, (double)var2, (double)var10);
         var1.a((double)var6, (double)var11, 0.0D, (double)var4, (double)var10);
         var1.a((double)var6, (double)var11, (double)(0.0F - var7), (double)var4, (double)var10);
         var1.a(0.0D, (double)var11, (double)(0.0F - var7), (double)var2, (double)var10);
      }

      var1.a();
      var1.b();
      var1.b(0.0F, -1.0F, 0.0F);

      for(var8 = 0; var8 < 16; ++var8) {
         var9 = (float)var8 / 16.0F;
         var10 = var5 + (var3 - var5) * var9 - 0.001953125F;
         var11 = var6 * var9;
         var1.a((double)var6, (double)var11, 0.0D, (double)var4, (double)var10);
         var1.a(0.0D, (double)var11, 0.0D, (double)var2, (double)var10);
         var1.a(0.0D, (double)var11, (double)(0.0F - var7), (double)var2, (double)var10);
         var1.a((double)var6, (double)var11, (double)(0.0F - var7), (double)var4, (double)var10);
      }

      var1.a();
   }

   public void a(float var1) {
      float var2 = this.d + (this.c - this.d) * var1;
      vq var3 = this.a.h;
      float var4 = var3.x + (var3.v - var3.x) * var1;
      GL11.glPushMatrix();
      GL11.glRotatef(var4, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var3.w + (var3.u - var3.w) * var1, 0.0F, 1.0F, 0.0F);
      tf.b();
      GL11.glPopMatrix();
      float var6;
      float var7;
      if(var3 instanceof vq) {
         vq var5 = (vq)var3;
         var6 = var5.ao + (var5.am - var5.ao) * var1;
         var7 = var5.an + (var5.e - var5.an) * var1;
         GL11.glRotatef((var3.v - var6) * 0.1F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef((var3.u - var7) * 0.1F, 0.0F, 1.0F, 0.0F);
      }

      aan var14 = this.b;
      var6 = this.a.f.c(gk.c(var3.o), gk.c(var3.p), gk.c(var3.q));
      var6 = 1.0F;
      int var15 = this.a.f.b(gk.c(var3.o), gk.c(var3.p), gk.c(var3.q), 0);
      int var8 = var15 % 65536;
      int var9 = var15 / 65536;
      es.a(es.b, (float)var8 / 1.0F, (float)var9 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var10;
      float var16;
      float var18;
      if(var14 != null) {
         var15 = yr.e[var14.c].b(var14.i(), 0);
         var16 = (float)(var15 >> 16 & 255) / 255.0F;
         var18 = (float)(var15 >> 8 & 255) / 255.0F;
         var10 = (float)(var15 & 255) / 255.0F;
         GL11.glColor4f(var6 * var16, var6 * var18, var6 * var10, 1.0F);
      } else {
         GL11.glColor4f(var6, var6, var6, 1.0F);
      }

      float var11;
      float var13;
      if(var14 != null && var14.c == yr.bd.bQ) {
         GL11.glPushMatrix();
         var7 = 0.8F;
         var16 = var3.i(var1);
         var18 = gk.a(var16 * 3.1415927F);
         var10 = gk.a(gk.c(var16) * 3.1415927F);
         GL11.glTranslatef(-var10 * 0.4F, gk.a(gk.c(var16) * 3.1415927F * 2.0F) * 0.2F, -var18 * 0.2F);
         var16 = 1.0F - var4 / 45.0F + 0.1F;
         if(var16 < 0.0F) {
            var16 = 0.0F;
         }

         if(var16 > 1.0F) {
            var16 = 1.0F;
         }

         var16 = -gk.b(var16 * 3.1415927F) * 0.5F + 0.5F;
         GL11.glTranslatef(0.0F, 0.0F * var7 - (1.0F - var2) * 1.2F - var16 * 0.5F + 0.04F, -0.9F * var7);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(var16 * -85.0F, 0.0F, 0.0F, 1.0F);
         GL11.glEnable('\u803a');
         GL11.glBindTexture(3553, this.a.p.a(this.a.h.Z, this.a.h.v_()));

         for(var9 = 0; var9 < 2; ++var9) {
            int var24 = var9 * 2 - 1;
            GL11.glPushMatrix();
            GL11.glTranslatef(-0.0F, -0.6F, 1.1F * (float)var24);
            GL11.glRotatef((float)(-45 * var24), 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(59.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef((float)(-65 * var24), 0.0F, 1.0F, 0.0F);
            um var22 = ahu.a.a((nn)this.a.h);
            we var26 = (we)var22;
            var13 = 1.0F;
            GL11.glScalef(var13, var13, var13);
            var26.b();
            GL11.glPopMatrix();
         }

         var18 = var3.i(var1);
         var10 = gk.a(var18 * var18 * 3.1415927F);
         var11 = gk.a(gk.c(var18) * 3.1415927F);
         GL11.glRotatef(-var10 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var11 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var11 * 80.0F, 1.0F, 0.0F, 0.0F);
         var18 = 0.38F;
         GL11.glScalef(var18, var18, var18);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-1.0F, -1.0F, 0.0F);
         var10 = 0.015625F;
         GL11.glScalef(var10, var10, var10);
         this.a.p.b(this.a.p.b("/mojang/misc/mapbg.png"));
         adz var23 = adz.a;
         GL11.glNormal3f(0.0F, 0.0F, -1.0F);
         var23.b();
         byte var27 = 7;
         var23.a((double)(0 - var27), (double)(128 + var27), 0.0D, 0.0D, 1.0D);
         var23.a((double)(128 + var27), (double)(128 + var27), 0.0D, 1.0D, 1.0D);
         var23.a((double)(128 + var27), (double)(0 - var27), 0.0D, 1.0D, 0.0D);
         var23.a((double)(0 - var27), (double)(0 - var27), 0.0D, 0.0D, 0.0D);
         var23.a();
         aaj var25 = yr.bd.a(var14, this.a.f);
         this.f.a(this.a.h, this.a.p, var25);
         GL11.glPopMatrix();
      } else if(var14 != null) {
         GL11.glPushMatrix();
         var7 = 0.8F;
         float var12;
         if(var3.ai() > 0) {
            aaq var17 = var14.m();
            if(var17 == aaq.b || var17 == aaq.c) {
               var18 = (float)var3.ai() - var1 + 1.0F;
               var10 = 1.0F - var18 / (float)var14.l();
               var12 = 1.0F - var10;
               var12 = var12 * var12 * var12;
               var12 = var12 * var12 * var12;
               var12 = var12 * var12 * var12;
               var13 = 1.0F - var12;
               GL11.glTranslatef(0.0F, gk.e(gk.b(var18 / 4.0F * 3.1415927F) * 0.1F) * (float)((double)var10 > 0.2D?1:0), 0.0F);
               GL11.glTranslatef(var13 * 0.6F, -var13 * 0.5F, 0.0F);
               GL11.glRotatef(var13 * 90.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(var13 * 10.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(var13 * 30.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            var16 = var3.i(var1);
            var18 = gk.a(var16 * 3.1415927F);
            var10 = gk.a(gk.c(var16) * 3.1415927F);
            GL11.glTranslatef(-var10 * 0.4F, gk.a(gk.c(var16) * 3.1415927F * 2.0F) * 0.2F, -var18 * 0.2F);
         }

         GL11.glTranslatef(0.7F * var7, -0.65F * var7 - (1.0F - var2) * 0.6F, -0.9F * var7);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable('\u803a');
         var16 = var3.i(var1);
         var18 = gk.a(var16 * var16 * 3.1415927F);
         var10 = gk.a(gk.c(var16) * 3.1415927F);
         GL11.glRotatef(-var18 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var10 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var10 * 80.0F, 1.0F, 0.0F, 0.0F);
         var16 = 0.4F;
         GL11.glScalef(var16, var16, var16);
         if(var3.ai() > 0) {
            aaq var20 = var14.m();
            if(var20 == aaq.d) {
               GL11.glTranslatef(-0.5F, 0.2F, 0.0F);
               GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-80.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(60.0F, 0.0F, 1.0F, 0.0F);
            } else if(var20 == aaq.e) {
               GL11.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
               GL11.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
               GL11.glTranslatef(-0.9F, 0.2F, 0.0F);
               var10 = (float)var14.l() - ((float)var3.ai() - var1 + 1.0F);
               var11 = var10 / 20.0F;
               var11 = (var11 * var11 + var11 * 2.0F) / 3.0F;
               if(var11 > 1.0F) {
                  var11 = 1.0F;
               }

               if(var11 > 0.1F) {
                  GL11.glTranslatef(0.0F, gk.a((var10 - 0.1F) * 1.3F) * 0.01F * (var11 - 0.1F), 0.0F);
               }

               GL11.glTranslatef(0.0F, 0.0F, var11 * 0.1F);
               GL11.glRotatef(-335.0F, 0.0F, 0.0F, 1.0F);
               GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glTranslatef(0.0F, 0.5F, 0.0F);
               var12 = 1.0F + var11 * 0.2F;
               GL11.glScalef(1.0F, 1.0F, var12);
               GL11.glTranslatef(0.0F, -0.5F, 0.0F);
               GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
            }
         }

         if(var14.a().A_()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var14.a().c()) {
            this.a(var3, var14, 0);
            var9 = yr.e[var14.c].b(var14.i(), 1);
            var10 = (float)(var9 >> 16 & 255) / 255.0F;
            var11 = (float)(var9 >> 8 & 255) / 255.0F;
            var12 = (float)(var9 & 255) / 255.0F;
            GL11.glColor4f(var6 * var10, var6 * var11, var6 * var12, 1.0F);
            this.a(var3, var14, 1);
         } else {
            this.a(var3, var14, 0);
         }

         GL11.glPopMatrix();
      } else {
         GL11.glPushMatrix();
         var7 = 0.8F;
         var16 = var3.i(var1);
         var18 = gk.a(var16 * 3.1415927F);
         var10 = gk.a(gk.c(var16) * 3.1415927F);
         GL11.glTranslatef(-var10 * 0.3F, gk.a(gk.c(var16) * 3.1415927F * 2.0F) * 0.4F, -var18 * 0.4F);
         GL11.glTranslatef(0.8F * var7, -0.75F * var7 - (1.0F - var2) * 0.6F, -0.9F * var7);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable('\u803a');
         var16 = var3.i(var1);
         var18 = gk.a(var16 * var16 * 3.1415927F);
         var10 = gk.a(gk.c(var16) * 3.1415927F);
         GL11.glRotatef(var10 * 70.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var18 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glBindTexture(3553, this.a.p.a(this.a.h.Z, this.a.h.v_()));
         GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
         GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(5.6F, 0.0F, 0.0F);
         um var19 = ahu.a.a((nn)this.a.h);
         we var21 = (we)var19;
         var10 = 1.0F;
         GL11.glScalef(var10, var10, var10);
         var21.b();
         GL11.glPopMatrix();
      }

      GL11.glDisable('\u803a');
      tf.a();
   }

   public void b(float var1) {
      GL11.glDisable(3008);
      int var2;
      if(this.a.h.T()) {
         var2 = this.a.p.b("/mojang/terrain.png");
         GL11.glBindTexture(3553, var2);
         this.d(var1);
      }

      if(this.a.h.N()) {
         var2 = gk.c(this.a.h.o);
         int var3 = gk.c(this.a.h.p);
         int var4 = gk.c(this.a.h.q);
         int var5 = this.a.p.b("/mojang/terrain.png");
         GL11.glBindTexture(3553, var5);
         int var6 = this.a.f.a(var2, var3, var4);
         if(this.a.f.h(var2, var3, var4)) {
            this.a(var1, pb.m[var6].a_(2));
         } else {
            for(int var7 = 0; var7 < 8; ++var7) {
               float var8 = ((float)((var7 >> 0) % 2) - 0.5F) * this.a.h.I * 0.9F;
               float var9 = ((float)((var7 >> 1) % 2) - 0.5F) * this.a.h.J * 0.2F;
               float var10 = ((float)((var7 >> 2) % 2) - 0.5F) * this.a.h.I * 0.9F;
               int var11 = gk.d((float)var2 + var8);
               int var12 = gk.d((float)var3 + var9);
               int var13 = gk.d((float)var4 + var10);
               if(this.a.f.h(var11, var12, var13)) {
                  var6 = this.a.f.a(var11, var12, var13);
               }
            }
         }

         if(pb.m[var6] != null) {
            this.a(var1, pb.m[var6].a_(2));
         }
      }

      if(this.a.h.a(acn.g)) {
         var2 = this.a.p.b("/mojang/misc/water.png");
         GL11.glBindTexture(3553, var2);
         this.c(var1);
      }

      GL11.glEnable(3008);
   }

   private void a(float var1, int var2) {
      adz var3 = adz.a;
      this.a.h.a(var1);
      float var4 = 0.1F;
      GL11.glColor4f(var4, var4, var4, 0.5F);
      GL11.glPushMatrix();
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = 0.0078125F;
      float var11 = (float)(var2 % 16) / 256.0F - var10;
      float var12 = ((float)(var2 % 16) + 15.99F) / 256.0F + var10;
      float var13 = (float)(var2 / 16) / 256.0F - var10;
      float var14 = ((float)(var2 / 16) + 15.99F) / 256.0F + var10;
      var3.b();
      var3.a((double)var5, (double)var7, (double)var9, (double)var12, (double)var14);
      var3.a((double)var6, (double)var7, (double)var9, (double)var11, (double)var14);
      var3.a((double)var6, (double)var8, (double)var9, (double)var11, (double)var13);
      var3.a((double)var5, (double)var8, (double)var9, (double)var12, (double)var13);
      var3.a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void c(float var1) {
      adz var2 = adz.a;
      float var3 = this.a.h.a(var1);
      GL11.glColor4f(var3, var3, var3, 0.5F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glPushMatrix();
      float var4 = 4.0F;
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = -this.a.h.u / 64.0F;
      float var11 = this.a.h.v / 64.0F;
      var2.b();
      var2.a((double)var5, (double)var7, (double)var9, (double)(var4 + var10), (double)(var4 + var11));
      var2.a((double)var6, (double)var7, (double)var9, (double)(0.0F + var10), (double)(var4 + var11));
      var2.a((double)var6, (double)var8, (double)var9, (double)(0.0F + var10), (double)(0.0F + var11));
      var2.a((double)var5, (double)var8, (double)var9, (double)(var4 + var10), (double)(0.0F + var11));
      var2.a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   private void d(float var1) {
      adz var2 = adz.a;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      float var3 = 1.0F;

      for(int var4 = 0; var4 < 2; ++var4) {
         GL11.glPushMatrix();
         int var5 = pb.ar.bN + var4 * 16;
         int var6 = (var5 & 15) << 4;
         int var7 = var5 & 240;
         float var8 = (float)var6 / 256.0F;
         float var9 = ((float)var6 + 15.99F) / 256.0F;
         float var10 = (float)var7 / 256.0F;
         float var11 = ((float)var7 + 15.99F) / 256.0F;
         float var12 = (0.0F - var3) / 2.0F;
         float var13 = var12 + var3;
         float var14 = 0.0F - var3 / 2.0F;
         float var15 = var14 + var3;
         float var16 = -0.5F;
         GL11.glTranslatef((float)(-(var4 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
         GL11.glRotatef((float)(var4 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
         var2.b();
         var2.a((double)var12, (double)var14, (double)var16, (double)var9, (double)var11);
         var2.a((double)var13, (double)var14, (double)var16, (double)var8, (double)var11);
         var2.a((double)var13, (double)var15, (double)var16, (double)var8, (double)var10);
         var2.a((double)var12, (double)var15, (double)var16, (double)var9, (double)var10);
         var2.a();
         GL11.glPopMatrix();
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   public void a() {
      this.d = this.c;
      vq var1 = this.a.h;
      aan var2 = var1.ap.b();
      boolean var4 = this.g == var1.ap.c && var2 == this.b;
      if(this.b == null && var2 == null) {
         var4 = true;
      }

      if(var2 != null && this.b != null && var2 != this.b && var2.c == this.b.c && var2.i() == this.b.i()) {
         this.b = var2;
         var4 = true;
      }

      float var5 = 0.4F;
      float var6 = var4?1.0F:0.0F;
      float var7 = var6 - this.c;
      if(var7 < -var5) {
         var7 = -var5;
      }

      if(var7 > var5) {
         var7 = var5;
      }

      this.c += var7;
      if(this.c < 0.1F) {
         this.b = var2;
         this.g = var1.ap.c;
      }

   }

   public void b() {
      this.c = 0.0F;
   }

   public void c() {
      this.c = 0.0F;
   }
}
