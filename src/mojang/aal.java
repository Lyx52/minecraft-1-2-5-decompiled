package mojang;

import java.awt.image.BufferedImage;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class aal {

   private int[] a = new int[16384];
   private int b;
   private OptionParser c;
   private nl d;


   public aal(nl var1, OptionParser var2, Texture var3) {
      this.c = var2;
      this.d = var1;
      this.b = var3.a(new BufferedImage(128, 128, 2));

      for(int var4 = 0; var4 < 16384; ++var4) {
         this.a[var4] = 0;
      }

   }

   public void a(Player var1, Texture var2, aaj var3) {
      for(int var4 = 0; var4 < 16384; ++var4) {
         byte var5 = var3.f[var4];
         if(var5 / 4 == 0) {
            this.a[var4] = (var4 + var4 / 128 & 1) * 8 + 16 << 24;
         } else {
            int var6 = wh.a[var5 / 4].p;
            int var7 = var5 & 3;
            short var8 = 220;
            if(var7 == 2) {
               var8 = 255;
            }

            if(var7 == 0) {
               var8 = 180;
            }

            int var9 = (var6 >> 16 & 255) * var8 / 255;
            int var10 = (var6 >> 8 & 255) * var8 / 255;
            int var11 = (var6 & 255) * var8 / 255;
            if(this.c.glyph3d) {
               int var12 = (var9 * 30 + var10 * 59 + var11 * 11) / 100;
               int var13 = (var9 * 30 + var10 * 70) / 100;
               int var14 = (var9 * 30 + var11 * 70) / 100;
               var9 = var12;
               var10 = var13;
               var11 = var14;
            }

            this.a[var4] = -16777216 | var9 << 16 | var10 << 8 | var11;
         }
      }

      var2.a(this.a, 128, 128, this.b);
      byte var15 = 0;
      byte var16 = 0;
      Tessalator var17 = Tessalator.a;
      float var18 = 0.0F;
      GL11.glBindTexture(3553, this.b);
      GL11.glEnable(3042);
      GL11.glBlendFunc(1, 771);
      GL11.glDisable(3008);
      var17.b();
      var17.a((double)((float)(var15 + 0) + var18), (double)((float)(var16 + 128) - var18), -0.009999999776482582D, 0.0D, 1.0D);
      var17.a((double)((float)(var15 + 128) - var18), (double)((float)(var16 + 128) - var18), -0.009999999776482582D, 1.0D, 1.0D);
      var17.a((double)((float)(var15 + 128) - var18), (double)((float)(var16 + 0) + var18), -0.009999999776482582D, 1.0D, 0.0D);
      var17.a((double)((float)(var15 + 0) + var18), (double)((float)(var16 + 0) + var18), -0.009999999776482582D, 0.0D, 0.0D);
      var17.a();
      GL11.glEnable(3008);
      GL11.glDisable(3042);
      var2.b(var2.b("/mojang/misc/mapicons.png"));
      Iterator var19 = var3.i.iterator();

      while(var19.hasNext()) {
         tv var20 = (tv)var19.next();
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var15 + (float)var20.b / 2.0F + 64.0F, (float)var16 + (float)var20.c / 2.0F + 64.0F, -0.02F);
         GL11.glRotatef((float)(var20.d * 360) / 16.0F, 0.0F, 0.0F, 1.0F);
         GL11.glScalef(4.0F, 4.0F, 3.0F);
         GL11.glTranslatef(-0.125F, 0.125F, 0.0F);
         float var21 = (float)(var20.a % 4 + 0) / 4.0F;
         float var22 = (float)(var20.a / 4 + 0) / 4.0F;
         float var23 = (float)(var20.a % 4 + 1) / 4.0F;
         float var24 = (float)(var20.a / 4 + 1) / 4.0F;
         var17.b();
         var17.a(-1.0D, 1.0D, 0.0D, (double)var21, (double)var22);
         var17.a(1.0D, 1.0D, 0.0D, (double)var23, (double)var22);
         var17.a(1.0D, -1.0D, 0.0D, (double)var23, (double)var24);
         var17.a(-1.0D, -1.0D, 0.0D, (double)var21, (double)var24);
         var17.a();
         GL11.glPopMatrix();
      }

      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.0F, -0.04F);
      GL11.glScalef(1.0F, 1.0F, 1.0F);
      this.d.b(var3.a, var15, var16, -16777216);
      GL11.glPopMatrix();
   }
}
