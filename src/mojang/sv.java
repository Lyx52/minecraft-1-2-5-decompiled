package mojang;

import org.lwjgl.opengl.GL11;

public class sv extends fe {

   private ho c = new gj(2.0F);


   public sv() {
      super(new gj(), 0.5F);
   }

   protected void a(yd var1, float var2) {
      float var4 = var1.c(var2);
      float var5 = 1.0F + gk.a(var4 * 100.0F) * var4 * 0.01F;
      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      if(var4 > 1.0F) {
         var4 = 1.0F;
      }

      var4 *= var4;
      var4 *= var4;
      float var6 = (1.0F + var4 * 0.4F) * var5;
      float var7 = (1.0F + var4 * 0.1F) / var5;
      GL11.glScalef(var6, var7, var6);
   }

   protected int a(yd var1, float var2, float var3) {
      float var5 = var1.c(var3);
      if((int)(var5 * 10.0F) % 2 == 0) {
         return 0;
      } else {
         int var6 = (int)(var5 * 0.2F * 255.0F);
         if(var6 < 0) {
            var6 = 0;
         }

         if(var6 > 255) {
            var6 = 255;
         }

         short var7 = 255;
         short var8 = 255;
         short var9 = 255;
         return var6 << 24 | var7 << 16 | var8 << 8 | var9;
      }
   }

   protected int a(yd var1, int var2, float var3) {
      if(var1.af()) {
         if(var2 == 1) {
            float var4 = (float)var1.V + var3;
            this.a("/mojang/armor/power.png");
            GL11.glMatrixMode(5890);
            GL11.glLoadIdentity();
            float var5 = var4 * 0.01F;
            float var6 = var4 * 0.01F;
            GL11.glTranslatef(var5, var6, 0.0F);
            this.a(this.c);
            GL11.glMatrixMode(5888);
            GL11.glEnable(3042);
            float var7 = 0.5F;
            GL11.glColor4f(var7, var7, var7, 1.0F);
            GL11.glDisable(2896);
            GL11.glBlendFunc(1, 1);
            return 1;
         }

         if(var2 == 2) {
            GL11.glMatrixMode(5890);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glEnable(2896);
            GL11.glDisable(3042);
         }
      }

      return -1;
   }

   protected int b(yd var1, int var2, float var3) {
      return -1;
   }
}
