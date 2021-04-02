package mojang;

import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class fe extends um {

   protected ho a;
   protected ho b;


   public fe(ho var1, float var2) {
      this.a = var1;
      this.g = var2;
   }

   public void a(ho var1) {
      this.b = var1;
   }

   private float a(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
         ;
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      return var1 + var3 * var4;
   }

   public void a(nn var1, double var2, double var4, double var6, float var8, float var9) {
      System.out.println("ACQ > NN");
      GL11.glPushMatrix();
      GL11.glDisable(2884);
      this.a.h = this.c(((acq)var1), var9);
      if(this.b != null) {
         this.b.h = this.a.h;
      }

      this.a.i = ((acq)var1).U();
      if(this.b != null) {
         this.b.i = this.a.i;
      }

      this.a.k = ((acq)var1).bi();
      if(this.b != null) {
         this.b.k = this.a.k;
      }

      try {
         float var10 = this.a(((acq)var1).be, ((acq)var1).bd, var9);
         float var11 = this.a(((acq)var1).bg, ((acq)var1).bf, var9);
         float var12 = var1.x + (var1.v - var1.x) * var9;
         this.a(((acq)var1), var2, var4, var6);
         float var13 = this.d(((acq)var1), var9);
         this.a(((acq)var1), var13, var10, var9);
         float var14 = 0.0625F;
         GL11.glEnable('\u803a');
         GL11.glScalef(-1.0F, -1.0F, 1.0F);
         this.a(((acq)var1), var9);
         GL11.glTranslatef(0.0F, -24.0F * var14 - 0.0078125F, 0.0F);
         float var15 = ((acq)var1).bL + (((acq)var1).bM - ((acq)var1).bL) * var9;
         float var16 = ((acq)var1).bN - ((acq)var1).bM * (1.0F - var9);
         if(((acq)var1).bi()) {
            var16 *= 3.0F;
         }

         if(var15 > 1.0F) {
            var15 = 1.0F;
         }

         GL11.glEnable(3008);
         this.a.a(((acq)var1), var16, var15, var9);
         this.a(((acq)var1), var16, var15, var13, var11 - var10, var12, var14);

         int var18;
         float var19;
         float var20;
         float var22;
         for(int var17 = 0; var17 < 4; ++var17) {
            var18 = this.b(((acq)var1), var17, var9);
            if(var18 > 0) {
               this.b.a(((acq)var1), var16, var15, var9);
               this.b.a(((acq)var1), var16, var15, var13, var11 - var10, var12, var14);
               if(var18 == 15) {
                  var19 = (float)((acq)var1).V + var9;
                  this.a("%blur%/mojang.misc/glint.png");
                  GL11.glEnable(3042);
                  var20 = 0.5F;
                  GL11.glColor4f(var20, var20, var20, 1.0F);
                  GL11.glDepthFunc(514);
                  GL11.glDepthMask(false);

                  for(int var21 = 0; var21 < 2; ++var21) {
                     GL11.glDisable(2896);
                     var22 = 0.76F;
                     GL11.glColor4f(0.5F * var22, 0.25F * var22, 0.8F * var22, 1.0F);
                     GL11.glBlendFunc(768, 1);
                     GL11.glMatrixMode(5890);
                     GL11.glLoadIdentity();
                     float var23 = var19 * (0.001F + (float)var21 * 0.003F) * 20.0F;
                     float var24 = 0.33333334F;
                     GL11.glScalef(var24, var24, var24);
                     GL11.glRotatef(30.0F - (float)var21 * 60.0F, 0.0F, 0.0F, 1.0F);
                     GL11.glTranslatef(0.0F, var23, 0.0F);
                     GL11.glMatrixMode(5888);
                     this.b.a(((acq)var1), var16, var15, var13, var11 - var10, var12, var14);
                  }

                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                  GL11.glMatrixMode(5890);
                  GL11.glDepthMask(true);
                  GL11.glLoadIdentity();
                  GL11.glMatrixMode(5888);
                  GL11.glEnable(2896);
                  GL11.glDisable(3042);
                  GL11.glDepthFunc(515);
               }

               GL11.glDisable(3042);
               GL11.glEnable(3008);
            }
         }

         this.b(((acq)var1), var9);
         float var26 = ((acq)var1).a(var9);
         var18 = this.a(((acq)var1), var26, var9);
         es.a(es.b);
         GL11.glDisable(3553);
         es.a(es.a);
         if((var18 >> 24 & 255) > 0 || ((acq)var1).bA > 0 || ((acq)var1).bD > 0) {
            GL11.glDisable(3553);
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glDepthFunc(514);
            if(((acq)var1).bA > 0 || ((acq)var1).bD > 0) {
               GL11.glColor4f(var26, 0.0F, 0.0F, 0.4F);
               this.a.a(((acq)var1), var16, var15, var13, var11 - var10, var12, var14);

               for(int var27 = 0; var27 < 4; ++var27) {
                  if(this.a(((acq)var1), var27, var9) >= 0) {
                     GL11.glColor4f(var26, 0.0F, 0.0F, 0.4F);
                     this.b.a(var1, var16, var15, var13, var11 - var10, var12, var14);
                  }
               }
            }

            if((var18 >> 24 & 255) > 0) {
               var19 = (float)(var18 >> 16 & 255) / 255.0F;
               var20 = (float)(var18 >> 8 & 255) / 255.0F;
               float var28 = (float)(var18 & 255) / 255.0F;
               var22 = (float)(var18 >> 24 & 255) / 255.0F;
               GL11.glColor4f(var19, var20, var28, var22);
               this.a.a(((acq)var1), var16, var15, var13, var11 - var10, var12, var14);

               for(int var29 = 0; var29 < 4; ++var29) {
                  if(this.a(((acq)var1), var29, var9) >= 0) {
                     GL11.glColor4f(var19, var20, var28, var22);
                     this.b.a(((acq)var1), var16, var15, var13, var11 - var10, var12, var14);
                  }
               }
            }

            GL11.glDepthFunc(515);
            GL11.glDisable(3042);
            GL11.glEnable(3008);
            GL11.glEnable(3553);
         }

         GL11.glDisable('\u803a');
      } catch (Exception var25) {
         var25.printStackTrace();
      }

      es.a(es.b);
      GL11.glEnable(3553);
      es.a(es.a);
      GL11.glEnable(2884);
      GL11.glPopMatrix();
      this.b(((acq)var1), var2, var4, var6);
   }

   protected void a(acq var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var1.Z, var1.v_());
      this.a.a(var1, var2, var3, var4, var5, var6, var7);
   }

   protected void a(acq var1, double var2, double var4, double var6) {
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
   }

   protected void a(acq var1, float var2, float var3, float var4) {
      GL11.glRotatef(180.0F - var3, 0.0F, 1.0F, 0.0F);
      if(var1.bD > 0) {
         float var5 = ((float)var1.bD + var4 - 1.0F) / 20.0F * 1.6F;
         var5 = gk.c(var5);
         if(var5 > 1.0F) {
            var5 = 1.0F;
         }

         GL11.glRotatef(var5 * this.a(var1), 0.0F, 0.0F, 1.0F);
      }

   }

   protected float c(acq var1, float var2) {
      return var1.i(var2);
   }

   protected float d(acq var1, float var2) {
      return (float)var1.V + var2;
   }

   protected void b(acq var1, float var2) {}

   protected int a(acq var1, int var2, float var3) {
      return this.b(var1, var2, var3);
   }

   protected int b(acq var1, int var2, float var3) {
      return -1;
   }

   protected float a(acq var1) {
      return 90.0F;
   }

   protected int a(acq var1, float var2, float var3) {
      return 0;
   }

   protected void a(acq var1, float var2) {}

   protected void b(acq var1, double var2, double var4, double var6) {
      if(Minecraft.u()) {
         ;
      }

   }

   protected void a(acq var1, String var2, double var3, double var5, double var7, int var9) {
      float var10 = var1.e(this.e.h);
      if(var10 <= (float)var9) {
         nl var11 = this.a();
         float var12 = 1.6F;
         float var13 = 0.016666668F * var12;
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var3 + 0.0F, (float)var5 + 2.3F, (float)var7);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-this.e.i, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.e.j, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(-var13, -var13, var13);
         GL11.glDisable(2896);
         GL11.glDepthMask(false);
         GL11.glDisable(2929);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         adz var14 = adz.a;
         byte var15 = 0;
         if(var2.equals("deadmau5")) {
            var15 = -10;
         }

         GL11.glDisable(3553);
         var14.b();
         int var16 = var11.a(var2) / 2;
         var14.a(0.0F, 0.0F, 0.0F, 0.25F);
         var14.a((double)(-var16 - 1), (double)(-1 + var15), 0.0D);
         var14.a((double)(-var16 - 1), (double)(8 + var15), 0.0D);
         var14.a((double)(var16 + 1), (double)(8 + var15), 0.0D);
         var14.a((double)(var16 + 1), (double)(-1 + var15), 0.0D);
         var14.a();
         GL11.glEnable(3553);
         var11.b(var2, -var11.a(var2) / 2, var15, 553648127);
         GL11.glEnable(2929);
         GL11.glDepthMask(true);
         var11.b(var2, -var11.a(var2) / 2, var15, -1);
         GL11.glEnable(2896);
         GL11.glDisable(3042);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glPopMatrix();
      }
   }
}
