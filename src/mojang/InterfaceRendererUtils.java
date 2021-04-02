package mojang;

import org.lwjgl.opengl.GL11;

public class InterfaceRendererUtils {

   protected float g = 0.0F;


   protected void a(int var1, int var2, int var3, int var4) {
      if(var2 < var1) {
         int var5 = var1;
         var1 = var2;
         var2 = var5;
      }

      a(var1, var3, var2 + 1, var3 + 1, var4);
   }

   protected void b(int var1, int var2, int var3, int var4) {
      if(var3 < var2) {
         int var5 = var2;
         var2 = var3;
         var3 = var5;
      }

      a(var1, var2 + 1, var1 + 1, var3, var4);
   }

   public static void a(int var0, int var1, int var2, int var3, int var4) {
      int var5;
      if(var0 < var2) {
         var5 = var0;
         var0 = var2;
         var2 = var5;
      }

      if(var1 < var3) {
         var5 = var1;
         var1 = var3;
         var3 = var5;
      }

      float var10 = (float)(var4 >> 24 & 255) / 255.0F;
      float var6 = (float)(var4 >> 16 & 255) / 255.0F;
      float var7 = (float)(var4 >> 8 & 255) / 255.0F;
      float var8 = (float)(var4 & 255) / 255.0F;
      Tessalator var9 = Tessalator.a;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(var6, var7, var8, var10);
      var9.b();
      var9.a((double)var0, (double)var3, 0.0D);
      var9.a((double)var2, (double)var3, 0.0D);
      var9.a((double)var2, (double)var1, 0.0D);
      var9.a((double)var0, (double)var1, 0.0D);
      var9.a();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
   }

   protected void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)(var5 >> 24 & 255) / 255.0F;
      float var8 = (float)(var5 >> 16 & 255) / 255.0F;
      float var9 = (float)(var5 >> 8 & 255) / 255.0F;
      float var10 = (float)(var5 & 255) / 255.0F;
      float var11 = (float)(var6 >> 24 & 255) / 255.0F;
      float var12 = (float)(var6 >> 16 & 255) / 255.0F;
      float var13 = (float)(var6 >> 8 & 255) / 255.0F;
      float var14 = (float)(var6 & 255) / 255.0F;
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glBlendFunc(770, 771);
      GL11.glShadeModel(7425);
      Tessalator var15 = Tessalator.a;
      var15.b();
      var15.a(var8, var9, var10, var7);
      var15.a((double)var3, (double)var2, (double)this.g);
      var15.a((double)var1, (double)var2, (double)this.g);
      var15.a(var12, var13, var14, var11);
      var15.a((double)var1, (double)var4, (double)this.g);
      var15.a((double)var3, (double)var4, (double)this.g);
      var15.a();
      GL11.glShadeModel(7424);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glEnable(3553);
   }

   public void a(nl var1, String var2, int var3, int var4, int var5) {
      var1.a(var2, var3 - var1.a(var2) / 2, var4, var5);
   }

   public void b(nl var1, String var2, int var3, int var4, int var5) {
      var1.a(var2, var3, var4, var5);
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      Tessalator var9 = Tessalator.a;
      var9.b();
      var9.a((double)(var1 + 0), (double)(var2 + var6), (double)this.g, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + var6), (double)this.g, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + 0), (double)this.g, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.a((double)(var1 + 0), (double)(var2 + 0), (double)this.g, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.a();
   }
}
