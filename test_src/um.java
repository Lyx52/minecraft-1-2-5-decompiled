import org.lwjgl.opengl.GL11;

public abstract class um {

   protected ahu e;
   private ho a = new xg();
   protected vl f = new vl();
   protected float g = 0.0F;
   protected float h = 1.0F;


   public abstract void a(nn var1, double var2, double var4, double var6, float var8, float var9);

   protected void a(String var1) {
      aaw var2 = this.e.e;
      var2.b(var2.b(var1));
   }

   protected boolean a(String var1, String var2) {
      aaw var3 = this.e.e;
      int var4 = var3.a(var1, var2);
      if(var4 >= 0) {
         var3.b(var4);
         return true;
      } else {
         return false;
      }
   }

   private void a(nn var1, double var2, double var4, double var6, float var8) {
      GL11.glDisable(2896);
      int var9 = pb.ar.bN;
      int var10 = (var9 & 15) << 4;
      int var11 = var9 & 240;
      float var12 = (float)var10 / 256.0F;
      float var13 = ((float)var10 + 15.99F) / 256.0F;
      float var14 = (float)var11 / 256.0F;
      float var15 = ((float)var11 + 15.99F) / 256.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var16 = var1.I * 1.4F;
      GL11.glScalef(var16, var16, var16);
      this.a("/terrain.png");
      adz var17 = adz.a;
      float var18 = 0.5F;
      float var19 = 0.0F;
      float var20 = var1.J / var16;
      float var21 = (float)(var1.p - var1.y.b);
      GL11.glRotatef(-this.e.i, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, -0.3F + (float)((int)var20) * 0.02F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var22 = 0.0F;
      int var23 = 0;
      var17.b();

      while(var20 > 0.0F) {
         if(var23 % 2 == 0) {
            var12 = (float)var10 / 256.0F;
            var13 = ((float)var10 + 15.99F) / 256.0F;
            var14 = (float)var11 / 256.0F;
            var15 = ((float)var11 + 15.99F) / 256.0F;
         } else {
            var12 = (float)var10 / 256.0F;
            var13 = ((float)var10 + 15.99F) / 256.0F;
            var14 = (float)(var11 + 16) / 256.0F;
            var15 = ((float)(var11 + 16) + 15.99F) / 256.0F;
         }

         if(var23 / 2 % 2 == 0) {
            float var24 = var13;
            var13 = var12;
            var12 = var24;
         }

         var17.a((double)(var18 - var19), (double)(0.0F - var21), (double)var22, (double)var13, (double)var15);
         var17.a((double)(-var18 - var19), (double)(0.0F - var21), (double)var22, (double)var12, (double)var15);
         var17.a((double)(-var18 - var19), (double)(1.4F - var21), (double)var22, (double)var12, (double)var14);
         var17.a((double)(var18 - var19), (double)(1.4F - var21), (double)var22, (double)var13, (double)var14);
         var20 -= 0.45F;
         var21 -= 0.45F;
         var18 *= 0.9F;
         var22 += 0.03F;
         ++var23;
      }

      var17.a();
      GL11.glPopMatrix();
      GL11.glEnable(2896);
   }

   private void c(nn var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      aaw var10 = this.e.e;
      var10.b(var10.b("%clamp%/misc/shadow.png"));
      xd var11 = this.b();
      GL11.glDepthMask(false);
      float var12 = this.g;
      if(var1 instanceof acq) {
         acq var13 = (acq)var1;
         var12 *= var13.bd();
         if(var13 instanceof bc) {
            bc var14 = (bc)var13;
            if(var14.bi()) {
               var12 *= 0.5F;
            }
         }
      }

      double var36 = var1.N + (var1.o - var1.N) * (double)var9;
      double var15 = var1.O + (var1.p - var1.O) * (double)var9 + (double)var1.h_();
      double var17 = var1.P + (var1.q - var1.P) * (double)var9;
      int var19 = gk.c(var36 - (double)var12);
      int var20 = gk.c(var36 + (double)var12);
      int var21 = gk.c(var15 - (double)var12);
      int var22 = gk.c(var15);
      int var23 = gk.c(var17 - (double)var12);
      int var24 = gk.c(var17 + (double)var12);
      double var25 = var2 - var36;
      double var27 = var4 - var15;
      double var29 = var6 - var17;
      adz var31 = adz.a;
      var31.b();

      for(int var32 = var19; var32 <= var20; ++var32) {
         for(int var33 = var21; var33 <= var22; ++var33) {
            for(int var34 = var23; var34 <= var24; ++var34) {
               int var35 = var11.a(var32, var33 - 1, var34);
               if(var35 > 0 && var11.o(var32, var33, var34) > 3) {
                  this.a(pb.m[var35], var2, var4 + (double)var1.h_(), var6, var32, var33, var34, var8, var12, var25, var27 + (double)var1.h_(), var29);
               }
            }
         }
      }

      var31.a();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glDepthMask(true);
   }

   private xd b() {
      return this.e.g;
   }

   private void a(pb var1, double var2, double var4, double var6, int var8, int var9, int var10, float var11, float var12, double var13, double var15, double var17) {
      adz var19 = adz.a;
      if(var1.b()) {
         double var20 = ((double)var11 - (var4 - ((double)var9 + var15)) / 2.0D) * 0.5D * (double)this.b().c(var8, var9, var10);
         if(var20 >= 0.0D) {
            if(var20 > 1.0D) {
               var20 = 1.0D;
            }

            var19.a(1.0F, 1.0F, 1.0F, (float)var20);
            double var22 = (double)var8 + var1.bV + var13;
            double var24 = (double)var8 + var1.bY + var13;
            double var26 = (double)var9 + var1.bW + var15 + 0.015625D;
            double var28 = (double)var10 + var1.bX + var17;
            double var30 = (double)var10 + var1.ca + var17;
            float var32 = (float)((var2 - var22) / 2.0D / (double)var12 + 0.5D);
            float var33 = (float)((var2 - var24) / 2.0D / (double)var12 + 0.5D);
            float var34 = (float)((var6 - var28) / 2.0D / (double)var12 + 0.5D);
            float var35 = (float)((var6 - var30) / 2.0D / (double)var12 + 0.5D);
            var19.a(var22, var26, var28, (double)var32, (double)var34);
            var19.a(var22, var26, var30, (double)var32, (double)var35);
            var19.a(var24, var26, var30, (double)var33, (double)var35);
            var19.a(var24, var26, var28, (double)var33, (double)var34);
         }
      }
   }

   public static void a(wu var0, double var1, double var3, double var5) {
      GL11.glDisable(3553);
      adz var7 = adz.a;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var7.b();
      var7.b(var1, var3, var5);
      var7.b(0.0F, 0.0F, -1.0F);
      var7.a(var0.a, var0.e, var0.c);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.a, var0.b, var0.c);
      var7.b(0.0F, 0.0F, 1.0F);
      var7.a(var0.a, var0.b, var0.f);
      var7.a(var0.d, var0.b, var0.f);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.a, var0.e, var0.f);
      var7.b(0.0F, -1.0F, 0.0F);
      var7.a(var0.a, var0.b, var0.c);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.d, var0.b, var0.f);
      var7.a(var0.a, var0.b, var0.f);
      var7.b(0.0F, 1.0F, 0.0F);
      var7.a(var0.a, var0.e, var0.f);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.a, var0.e, var0.c);
      var7.b(-1.0F, 0.0F, 0.0F);
      var7.a(var0.a, var0.b, var0.f);
      var7.a(var0.a, var0.e, var0.f);
      var7.a(var0.a, var0.e, var0.c);
      var7.a(var0.a, var0.b, var0.c);
      var7.b(1.0F, 0.0F, 0.0F);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.d, var0.b, var0.f);
      var7.b(0.0D, 0.0D, 0.0D);
      var7.a();
      GL11.glEnable(3553);
   }

   public static void a(wu var0) {
      adz var1 = adz.a;
      var1.b();
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.d, var0.b, var0.f);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.f);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.d, var0.b, var0.f);
      var1.a();
   }

   public void a(ahu var1) {
      this.e = var1;
   }

   public void b(nn var1, double var2, double var4, double var6, float var8, float var9) {
      if(this.e.k.j && this.g > 0.0F) {
         double var10 = this.e.a(var1.o, var1.p, var1.q);
         float var12 = (float)((1.0D - var10 / 256.0D) * (double)this.h);
         if(var12 > 0.0F) {
            this.c(var1, var2, var4, var6, var12, var9);
         }
      }

      if(var1.T()) {
         this.a(var1, var2, var4, var6, var9);
      }

   }

   public nl a() {
      return this.e.a();
   }
}
