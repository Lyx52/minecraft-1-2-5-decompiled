package mojang;

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class tw extends um {

   private vl c = new vl();
   private Random d = new Random();
   public boolean a = true;
   public float b = 0.0F;


   public tw() {
      this.g = 0.15F;
      this.h = 0.75F;
   }
   @Override
   public void a(BaseEntity var1, double var2, double var4, double var6, float var8, float var9) {
      this.d.setSeed(187L);
      aan var10 = ((Item)var1).a;
      GL11.glPushMatrix();
      float var11 = Utils.sin(((float)((Item)var1).b + var9) / 10.0F + ((Item)var1).d) * 0.1F + 0.1F;
      float var12 = (((float)((Item)var1).b + var9) / 20.0F + ((Item)var1).d) * 57.295776F;
      byte var13 = 1;
      if(((Item)var1).a.a > 1) {
         var13 = 2;
      }

      if(((Item)var1).a.a > 5) {
         var13 = 3;
      }

      if(((Item)var1).a.a > 20) {
         var13 = 4;
      }

      GL11.glTranslatef((float)var2, (float)var4 + var11, (float)var6);
      GL11.glEnable('\u803a');
      int var15;
      float var18;
      float var19;
      float var23;
      if(var10.c < 256 && vl.a(pb.m[var10.c].d())) {
         GL11.glRotatef(var12, 0.0F, 1.0F, 0.0F);
         this.a("/mojang/terrain.png");
         float var21 = 0.25F;
         var15 = pb.m[var10.c].d();
         if(var15 == 1 || var15 == 19 || var15 == 12 || var15 == 2) {
            var21 = 0.5F;
         }

         GL11.glScalef(var21, var21, var21);

         for(int var22 = 0; var22 < var13; ++var22) {
            GL11.glPushMatrix();
            if(var22 > 0) {
               var23 = (this.d.nextFloat() * 2.0F - 1.0F) * 0.2F / var21;
               var18 = (this.d.nextFloat() * 2.0F - 1.0F) * 0.2F / var21;
               var19 = (this.d.nextFloat() * 2.0F - 1.0F) * 0.2F / var21;
               GL11.glTranslatef(var23, var18, var19);
            }

            var23 = 1.0F;
            this.c.a(pb.m[var10.c], var10.i(), var23);
            GL11.glPopMatrix();
         }
      } else {
         int var14;
         float var16;
         if(var10.a().c()) {
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            this.a("/mojang/gui/items.png");

            for(var14 = 0; var14 <= 1; ++var14) {
               var15 = var10.a().a(var10.i(), var14);
               var16 = 1.0F;
               if(this.a) {
                  int var17 = yr.e[var10.c].b(var10.i(), var14);
                  var18 = (float)(var17 >> 16 & 255) / 255.0F;
                  var19 = (float)(var17 >> 8 & 255) / 255.0F;
                  float var20 = (float)(var17 & 255) / 255.0F;
                  GL11.glColor4f(var18 * var16, var19 * var16, var20 * var16, 1.0F);
               }

               this.a(var15, var13);
            }
         } else {
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            var14 = var10.b();
            if(var10.c < 256) {
               this.a("/mojang/terrain.png");
            } else {
               this.a("/mojang/gui/items.png");
            }

            if(this.a) {
               var15 = yr.e[var10.c].b(var10.i(), 0);
               var16 = (float)(var15 >> 16 & 255) / 255.0F;
               var23 = (float)(var15 >> 8 & 255) / 255.0F;
               var18 = (float)(var15 & 255) / 255.0F;
               var19 = 1.0F;
               GL11.glColor4f(var16 * var19, var23 * var19, var18 * var19, 1.0F);
            }

            this.a(var14, var13);
         }
      }

      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
   }

   private void a(int var1, int var2) {
      Tessalator var3 = Tessalator.tessalatorInstance;
      float var4 = (float)(var1 % 16 * 16 + 0) / 256.0F;
      float var5 = (float)(var1 % 16 * 16 + 16) / 256.0F;
      float var6 = (float)(var1 / 16 * 16 + 0) / 256.0F;
      float var7 = (float)(var1 / 16 * 16 + 16) / 256.0F;
      float var8 = 1.0F;
      float var9 = 0.5F;
      float var10 = 0.25F;

      for(int var11 = 0; var11 < var2; ++var11) {
         GL11.glPushMatrix();
         if(var11 > 0) {
            float var12 = (this.d.nextFloat() * 2.0F - 1.0F) * 0.3F;
            float var13 = (this.d.nextFloat() * 2.0F - 1.0F) * 0.3F;
            float var14 = (this.d.nextFloat() * 2.0F - 1.0F) * 0.3F;
            GL11.glTranslatef(var12, var13, var14);
         }

         GL11.glRotatef(180.0F - this.e.i, 0.0F, 1.0F, 0.0F);
         var3.b();
         var3.b(0.0F, 1.0F, 0.0F);
         var3.a((double)(0.0F - var9), (double)(0.0F - var10), 0.0D, (double)var4, (double)var7);
         var3.a((double)(var8 - var9), (double)(0.0F - var10), 0.0D, (double)var5, (double)var7);
         var3.a((double)(var8 - var9), (double)(1.0F - var10), 0.0D, (double)var5, (double)var6);
         var3.a((double)(0.0F - var9), (double)(1.0F - var10), 0.0D, (double)var4, (double)var6);
         var3.a();
         GL11.glPopMatrix();
      }

   }

   public void a(nl var1, TextureManager var2, int var3, int var4, int var5, int var6, int var7) {
      int var10;
      float var11;
      float var12;
      float var13;
      if(var3 < 256 && vl.a(pb.m[var3].d())) {
         var2.b(var2.readImageFromLocation("/mojang/terrain.png"));
         pb var15 = pb.m[var3];
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(var6 - 2), (float)(var7 + 3), -3.0F + this.b);
         GL11.glScalef(10.0F, 10.0F, 10.0F);
         GL11.glTranslatef(1.0F, 0.5F, 1.0F);
         GL11.glScalef(1.0F, 1.0F, -1.0F);
         GL11.glRotatef(210.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         var10 = yr.e[var3].b(var4, 0);
         var11 = (float)(var10 >> 16 & 255) / 255.0F;
         var12 = (float)(var10 >> 8 & 255) / 255.0F;
         var13 = (float)(var10 & 255) / 255.0F;
         if(this.a) {
            GL11.glColor4f(var11, var12, var13, 1.0F);
         }

         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         this.c.c = this.a;
         this.c.a(var15, var4, 1.0F);
         this.c.c = true;
         GL11.glPopMatrix();
      } else {
         int var8;
         if(yr.e[var3].c()) {
            GL11.glDisable(2896);
            var2.b(var2.readImageFromLocation("/mojang/gui/items.png"));

            for(var8 = 0; var8 <= 1; ++var8) {
               int var9 = yr.e[var3].a(var4, var8);
               var10 = yr.e[var3].b(var4, var8);
               var11 = (float)(var10 >> 16 & 255) / 255.0F;
               var12 = (float)(var10 >> 8 & 255) / 255.0F;
               var13 = (float)(var10 & 255) / 255.0F;
               if(this.a) {
                  GL11.glColor4f(var11, var12, var13, 1.0F);
               }

               this.a(var6, var7, var9 % 16 * 16, var9 / 16 * 16, 16, 16);
            }

            GL11.glEnable(2896);
         } else if(var5 >= 0) {
            GL11.glDisable(2896);
            if(var3 < 256) {
               var2.b(var2.readImageFromLocation("/mojang/terrain.png"));
            } else {
               var2.b(var2.readImageFromLocation("/mojang/gui/items.png"));
            }

            var8 = yr.e[var3].b(var4, 0);
            float var14 = (float)(var8 >> 16 & 255) / 255.0F;
            float var16 = (float)(var8 >> 8 & 255) / 255.0F;
            var11 = (float)(var8 & 255) / 255.0F;
            if(this.a) {
               GL11.glColor4f(var14, var16, var11, 1.0F);
            }

            this.a(var6, var7, var5 % 16 * 16, var5 / 16 * 16, 16, 16);
            GL11.glEnable(2896);
         }
      }

      GL11.glEnable(2884);
   }

   public void a(nl var1, TextureManager var2, aan var3, int var4, int var5) {
      if(var3 != null) {
         this.a(var1, var2, var3.c, var3.i(), var3.b(), var4, var5);
         if(var3 != null && var3.r()) {
            GL11.glDepthFunc(516);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            var2.b(var2.readImageFromLocation("%blur%/mojang.misc/glint.png"));
            this.b -= 50.0F;
            GL11.glEnable(3042);
            GL11.glBlendFunc(774, 774);
            GL11.glColor4f(0.5F, 0.25F, 0.8F, 1.0F);
            this.a(var4 * 431278612 + var5 * 32178161, var4 - 2, var5 - 2, 20, 20);
            GL11.glDisable(3042);
            GL11.glDepthMask(true);
            this.b += 50.0F;
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
         }

      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 2; ++var6) {
         if(var6 == 0) {
            GL11.glBlendFunc(768, 1);
         }

         if(var6 == 1) {
            GL11.glBlendFunc(768, 1);
         }

         float var7 = 0.00390625F;
         float var8 = 0.00390625F;
         float var9 = (float)(System.currentTimeMillis() % (long)(3000 + var6 * 1873)) / (3000.0F + (float)(var6 * 1873)) * 256.0F;
         float var10 = 0.0F;
         Tessalator var11 = Tessalator.tessalatorInstance;
         float var12 = 4.0F;
         if(var6 == 1) {
            var12 = -1.0F;
         }

         var11.b();
         var11.a((double)(var2 + 0), (double)(var3 + var5), (double)this.b, (double)((var9 + (float)var5 * var12) * var7), (double)((var10 + (float)var5) * var8));
         var11.a((double)(var2 + var4), (double)(var3 + var5), (double)this.b, (double)((var9 + (float)var4 + (float)var5 * var12) * var7), (double)((var10 + (float)var5) * var8));
         var11.a((double)(var2 + var4), (double)(var3 + 0), (double)this.b, (double)((var9 + (float)var4) * var7), (double)((var10 + 0.0F) * var8));
         var11.a((double)(var2 + 0), (double)(var3 + 0), (double)this.b, (double)((var9 + 0.0F) * var7), (double)((var10 + 0.0F) * var8));
         var11.a();
      }

   }

   public void b(nl var1, TextureManager var2, aan var3, int var4, int var5) {
      if(var3 != null) {
         if(var3.a > 1) {
            String var6 = "" + var3.a;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            var1.a(var6, var4 + 19 - 2 - var1.a(var6), var5 + 6 + 3, 16777215);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }

         if(var3.g()) {
            int var11 = (int)Math.round(13.0D - (double)var3.h() * 13.0D / (double)var3.j());
            int var7 = (int)Math.round(255.0D - (double)var3.h() * 255.0D / (double)var3.j());
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            Tessalator var8 = Tessalator.tessalatorInstance;
            int var9 = 255 - var7 << 16 | var7 << 8;
            int var10 = (255 - var7) / 4 << 16 | 16128;
            this.a(var8, var4 + 2, var5 + 13, 13, 2, 0);
            this.a(var8, var4 + 2, var5 + 13, 12, 1, var10);
            this.a(var8, var4 + 2, var5 + 13, var11, 1, var9);
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

      }
   }

   private void a(Tessalator var1, int var2, int var3, int var4, int var5, int var6) {
      var1.b();
      var1.c(var6);
      var1.a((double)(var2 + 0), (double)(var3 + 0), 0.0D);
      var1.a((double)(var2 + 0), (double)(var3 + var5), 0.0D);
      var1.a((double)(var2 + var4), (double)(var3 + var5), 0.0D);
      var1.a((double)(var2 + var4), (double)(var3 + 0), 0.0D);
      var1.a();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      Tessalator var9 = Tessalator.tessalatorInstance;
      var9.b();
      var9.a((double)(var1 + 0), (double)(var2 + var6), (double)this.b, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + var6), (double)this.b, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + 0), (double)this.b, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.a((double)(var1 + 0), (double)(var2 + 0), (double)this.b, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.a();
   }


}
