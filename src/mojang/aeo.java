package mojang;

import org.lwjgl.opengl.GL11;

public class aeo extends um {

   private vl a = new vl();


   public aeo() {
      this.g = 0.5F;
   }

   @Override
   public void a(BaseEntity var1, double var2, double var4, double var6, float var8, float var9) {
      System.out.println("AGG > NN");
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var10;
      if((float)((PrimeTnt)var1).a - var9 + 1.0F < 10.0F) {
         var10 = 1.0F - ((float)((PrimeTnt)var1).a - var9 + 1.0F) / 10.0F;
         if(var10 < 0.0F) {
            var10 = 0.0F;
         }

         if(var10 > 1.0F) {
            var10 = 1.0F;
         }

         var10 *= var10;
         var10 *= var10;
         float var11 = 1.0F + var10 * 0.3F;
         GL11.glScalef(var11, var11, var11);
      }

      var10 = (1.0F - ((float)((PrimeTnt)var1).a - var9 + 1.0F) / 100.0F) * 0.8F;
      this.a("/mojang/terrain.png");
      this.a.a(pb.am, 0, var1.a(var9));
      if(((PrimeTnt)var1).a / 5 % 2 == 0) {
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 772);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var10);
         this.a.a(pb.am, 0, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(2896);
         GL11.glEnable(3553);
      }

      GL11.glPopMatrix();
   }


}
