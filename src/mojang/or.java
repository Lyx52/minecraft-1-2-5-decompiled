package mojang;

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class or extends fe {

   public static EnderDragon c;
   private static int i = 0;
   protected aks d;


   public or() {
      super(new aks(0.0F), 0.5F);
      this.d = (aks)this.a;
      this.a(this.a);
   }

   protected void a(EnderDragon var1, float var2, float var3, float var4) {
      float var5 = (float)var1.a(7, var4)[0];
      float var6 = (float)(var1.a(5, var4)[1] - var1.a(10, var4)[1]);
      GL11.glRotatef(-var5, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var6 * 10.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 1.0F);
      if(var1.bD > 0) {
         float var7 = ((float)var1.bD + var4 - 1.0F) / 20.0F * 1.6F;
         var7 = Utils.sqrt(var7);
         if(var7 > 1.0F) {
            var7 = 1.0F;
         }

         GL11.glRotatef(var7 * this.a(var1), 0.0F, 0.0F, 1.0F);
      }

   }

   protected void a(EnderDragon var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if(var1.ay > 0) {
         float var8 = (float)var1.ay / 200.0F;
         GL11.glDepthFunc(515);
         GL11.glEnable(3008);
         GL11.glAlphaFunc(516, var8);
         this.a(var1.Z, "/mojang/mob/enderdragon/shuffle.png");
         this.a.a(var1, var2, var3, var4, var5, var6, var7);
         GL11.glAlphaFunc(516, 0.1F);
         GL11.glDepthFunc(514);
      }

      this.a(var1.Z, var1.v_());
      this.a.a(var1, var2, var3, var4, var5, var6, var7);
      if(var1.bA > 0) {
         GL11.glDepthFunc(514);
         GL11.glDisable(3553);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.5F);
         this.a.a(var1, var2, var3, var4, var5, var6, var7);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         GL11.glDepthFunc(515);
      }

   }

   public void a(EnderDragon var1, double var2, double var4, double var6, float var8, float var9) {
      c = var1;
      if(i != 4) {
         this.a = new aks(0.0F);
         i = 4;
      }

      super.a((Mob)var1, var2, var4, var6, var8, var9);
      if(var1.az != null) {
         float var10 = (float)var1.az.a + var9;
         float var11 = Utils.sin(var10 * 0.2F) / 2.0F + 0.5F;
         var11 = (var11 * var11 + var11) * 0.2F;
         float var12 = (float)(var1.az.o - var1.o - (var1.sandX - var1.o) * (double)(1.0F - var9));
         float var13 = (float)((double)var11 + var1.az.p - 1.0D - var1.p - (var1.sandY - var1.p) * (double)(1.0F - var9));
         float var14 = (float)(var1.az.q - var1.q - (var1.sandZ - var1.q) * (double)(1.0F - var9));
         float var15 = Utils.sqrt(var12 * var12 + var14 * var14);
         float var16 = Utils.sqrt(var12 * var12 + var13 * var13 + var14 * var14);
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2, (float)var4 + 2.0F, (float)var6);
         GL11.glRotatef((float)(-Math.atan2((double)var14, (double)var12)) * 180.0F / 3.1415927F - 90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef((float)(-Math.atan2((double)var15, (double)var13)) * 180.0F / 3.1415927F - 90.0F, 1.0F, 0.0F, 0.0F);
         Tessalator var17 = Tessalator.tessalatorInstance;
         tf.a();
         GL11.glDisable(2884);
         this.a("/mojang/mob/enderdragon/beam.png");
         GL11.glShadeModel(7425);
         float var18 = 0.0F - ((float)var1.V + var9) * 0.01F;
         float var19 = Utils.sqrt(var12 * var12 + var13 * var13 + var14 * var14) / 32.0F - ((float)var1.V + var9) * 0.01F;
         var17.a(5);
         byte var20 = 8;

         for(int var21 = 0; var21 <= var20; ++var21) {
            float var22 = Utils.sin((float)(var21 % var20) * 3.1415927F * 2.0F / (float)var20) * 0.75F;
            float var23 = Utils.cos((float)(var21 % var20) * 3.1415927F * 2.0F / (float)var20) * 0.75F;
            float var24 = (float)(var21 % var20) * 1.0F / (float)var20;
            var17.c(0);
            var17.a((double)(var22 * 0.2F), (double)(var23 * 0.2F), 0.0D, (double)var24, (double)var19);
            var17.c(16777215);
            var17.a((double)var22, (double)var23, (double)var16, (double)var24, (double)var18);
         }

         var17.a();
         GL11.glEnable(2884);
         GL11.glShadeModel(7424);
         tf.b();
         GL11.glPopMatrix();
      }

   }

   protected void a(EnderDragon var1, float var2) {
      super.b(var1, var2);
      Tessalator var3 = Tessalator.tessalatorInstance;
      if(var1.ay > 0) {
         tf.a();
         float var4 = ((float)var1.ay + var2) / 200.0F;
         float var5 = 0.0F;
         if(var4 > 0.8F) {
            var5 = (var4 - 0.8F) / 0.2F;
         }

         Random var6 = new Random(432L);
         GL11.glDisable(3553);
         GL11.glShadeModel(7425);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 1);
         GL11.glDisable(3008);
         GL11.glEnable(2884);
         GL11.glDepthMask(false);
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, -1.0F, -2.0F);

         for(int var7 = 0; (float)var7 < (var4 + var4 * var4) / 2.0F * 60.0F; ++var7) {
            GL11.glRotatef(var6.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F + var4 * 90.0F, 0.0F, 0.0F, 1.0F);
            var3.a(6);
            float var8 = var6.nextFloat() * 20.0F + 5.0F + var5 * 10.0F;
            float var9 = var6.nextFloat() * 2.0F + 1.0F + var5 * 2.0F;
            var3.a(16777215, (int)(255.0F * (1.0F - var5)));
            var3.a(0.0D, 0.0D, 0.0D);
            var3.a(16711935, 0);
            var3.a(-0.866D * (double)var9, (double)var8, (double)(-0.5F * var9));
            var3.a(0.866D * (double)var9, (double)var8, (double)(-0.5F * var9));
            var3.a(0.0D, (double)var8, (double)(1.0F * var9));
            var3.a(-0.866D * (double)var9, (double)var8, (double)(-0.5F * var9));
            var3.a();
         }

         GL11.glPopMatrix();
         GL11.glDepthMask(true);
         GL11.glDisable(2884);
         GL11.glDisable(3042);
         GL11.glShadeModel(7424);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(3553);
         GL11.glEnable(3008);
         tf.b();
      }

   }

   protected int a(EnderDragon var1, int var2, float var3) {
      if(var2 == 1) {
         GL11.glDepthFunc(515);
      }

      if(var2 != 0) {
         return -1;
      } else {
         this.a("/mojang/mob/enderdragon/ender_eyes.png");
         float var4 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         GL11.glDisable(2896);
         GL11.glDepthFunc(514);
         char var5 = '\uf0f0';
         int var6 = var5 % 65536;
         int var7 = var5 / 65536;
         ARBTextureHelper.setMultiTexCoord2f(ARBTextureHelper.b, (float)var6 / 1.0F, (float)var7 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(2896);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
         return 1;
      }
   }

}
