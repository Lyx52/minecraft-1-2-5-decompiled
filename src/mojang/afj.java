package mojang;

import org.lwjgl.opengl.GL11;

public class afj extends um {

   public void a(BaseEntity var1, double var2, double var4, double var6, float var8, float var9) {
      System.out.println("ACT > NN");
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable('\u803a');
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      byte var10 = 1;
      byte var11 = 2;
      this.a("/mojang/particles.png");
      Tessalator var12 = Tessalator.tessalatorInstance;
      float var13 = (float)(var10 * 8 + 0) / 128.0F;
      float var14 = (float)(var10 * 8 + 8) / 128.0F;
      float var15 = (float)(var11 * 8 + 0) / 128.0F;
      float var16 = (float)(var11 * 8 + 8) / 128.0F;
      float var17 = 1.0F;
      float var18 = 0.5F;
      float var19 = 0.5F;
      GL11.glRotatef(180.0F - this.e.i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.e.j, 1.0F, 0.0F, 0.0F);
      var12.b();
      var12.b(0.0F, 1.0F, 0.0F);
      var12.a((double)(0.0F - var18), (double)(0.0F - var19), 0.0D, (double)var13, (double)var16);
      var12.a((double)(var17 - var18), (double)(0.0F - var19), 0.0D, (double)var14, (double)var16);
      var12.a((double)(var17 - var18), (double)(1.0F - var19), 0.0D, (double)var14, (double)var15);
      var12.a((double)(0.0F - var18), (double)(1.0F - var19), 0.0D, (double)var13, (double)var15);
      var12.a();
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
      if(((act)var1).b != null) {
         float var20 = (((act)var1).b.w + (((act)var1).b.u - ((act)var1).b.w) * var9) * 3.1415927F / 180.0F;
         double var21 = (double) Utils.sin(var20);
         double var23 = (double) Utils.cos(var20);
         float var25 = ((act)var1).b.i(var9);
         float var26 = Utils.sin(Utils.sqrt(var25) * 3.1415927F);
         bo var27 = bo.b(-0.5D, 0.03D, 0.8D);
         var27.a(-(((act)var1).b.x + (((act)var1).b.v - ((act)var1).b.x) * var9) * 3.1415927F / 180.0F);
         var27.b(-(((act)var1).b.w + (((act)var1).b.u - ((act)var1).b.w) * var9) * 3.1415927F / 180.0F);
         var27.b(var26 * 0.5F);
         var27.a(-var26 * 0.7F);
         double var28 = ((act)var1).b.sandX + (((act)var1).b.o - ((act)var1).b.sandX) * (double)var9 + var27.a;
         double var30 = ((act)var1).b.sandY + (((act)var1).b.p - ((act)var1).b.sandY) * (double)var9 + var27.b;
         double var32 = ((act)var1).b.sandZ + (((act)var1).b.q - ((act)var1).b.sandZ) * (double)var9 + var27.c;
         if(this.e.k.E > 0) {
            var20 = (((act)var1).b.be + (((act)var1).b.bd - ((act)var1).b.be) * var9) * 3.1415927F / 180.0F;
            var21 = (double) Utils.sin(var20);
            var23 = (double) Utils.cos(var20);
            var28 = ((act)var1).b.sandX + (((act)var1).b.o - ((act)var1).b.sandX) * (double)var9 - var23 * 0.35D - var21 * 0.85D;
            var30 = ((act)var1).b.sandY + (((act)var1).b.p - ((act)var1).b.sandY) * (double)var9 - 0.45D;
            var32 = ((act)var1).b.sandZ + (((act)var1).b.q - ((act)var1).b.sandZ) * (double)var9 - var21 * 0.35D + var23 * 0.85D;
         }

         double var34 = ((act)var1).sandX + (((act)var1).o - ((act)var1).sandX) * (double)var9;
         double var36 = ((act)var1).sandY + (((act)var1).p - ((act)var1).sandY) * (double)var9 + 0.25D;
         double var38 = ((act)var1).sandZ + (((act)var1).q - ((act)var1).sandZ) * (double)var9;
         double var40 = (double)((float)(var28 - var34));
         double var42 = (double)((float)(var30 - var36));
         double var44 = (double)((float)(var32 - var38));
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         var12.a(3);
         var12.c(0);
         byte var46 = 16;

         for(int var47 = 0; var47 <= var46; ++var47) {
            float var48 = (float)var47 / (float)var46;
            var12.a(var2 + var40 * (double)var48, var4 + var42 * (double)(var48 * var48 + var48) * 0.5D + 0.25D, var6 + var44 * (double)var48);
         }

         var12.a();
         GL11.glEnable(2896);
         GL11.glEnable(3553);
      }

   }
}
