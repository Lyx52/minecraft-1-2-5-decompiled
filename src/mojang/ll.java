package mojang;

import org.lwjgl.opengl.GL11;

public class ll extends aar {

   private agn a = new agn();


   public void a(kw var1, double var2, double var4, double var6, float var8) {
      System.out.println("SC > KW");
      pb var9 = var1.k();
      GL11.glPushMatrix();
      float var10 = 0.6666667F;
      float var12;
      if(var9 == pb.aD) {
         GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var10, (float)var6 + 0.5F);
         float var11 = (float)(var1.i() * 360) / 16.0F;
         GL11.glRotatef(-var11, 0.0F, 1.0F, 0.0F);
         this.a.b.j = true;
      } else {
         int var16 = var1.i();
         var12 = 0.0F;
         if(var16 == 2) {
            var12 = 180.0F;
         }

         if(var16 == 4) {
            var12 = 90.0F;
         }

         if(var16 == 5) {
            var12 = -90.0F;
         }

         GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var10, (float)var6 + 0.5F);
         GL11.glRotatef(-var12, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
         this.a.b.j = false;
      }

      this.a("/mojang/item/sign.png");
      GL11.glPushMatrix();
      GL11.glScalef(var10, -var10, -var10);
      this.a.a();
      GL11.glPopMatrix();
      nl var17 = this.a();
      var12 = 0.016666668F * var10;
      GL11.glTranslatef(0.0F, 0.5F * var10, 0.07F * var10);
      GL11.glScalef(var12, -var12, var12);
      GL11.glNormal3f(0.0F, 0.0F, -1.0F * var12);
      GL11.glDepthMask(false);
      byte var13 = 0;

      for(int var14 = 0; var14 < ((sc)var1).a.length; ++var14) {
         String var15 = ((sc)var1).a[var14];
         if(var14 == ((sc)var1).b) {
            var15 = "> " + var15 + " <";
            var17.b(var15, -var17.a(var15) / 2, var14 * 10 - ((sc)var1).a.length * 5, var13);
         } else {
            var17.b(var15, -var17.a(var15) / 2, var14 * 10 - ((sc)var1).a.length * 5, var13);
         }
      }

      GL11.glDepthMask(true);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }
}
