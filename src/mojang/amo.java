package mojang;

import org.lwjgl.opengl.GL11;

public class amo extends fe {

   public amo() {
      super(new nf(), 1.0F);
      this.a((ho)(new nf()));
   }

   protected float a(Spider var1) {
      return 180.0F;
   }

   protected int a(Spider var1, int var2, float var3) {
      if(var2 != 0) {
         return -1;
      } else {
         this.a("/mojang/mob/spider_eyes.png");
         float var4 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         char var5 = '\uf0f0';
         int var6 = var5 % 65536;
         int var7 = var5 / 65536;
         ARBTextureHelper.setMultiTexCoord2f(ARBTextureHelper.b, (float)var6 / 1.0F, (float)var7 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
         return 1;
      }
   }

   protected void a(Spider var1, float var2) {
      float var3 = var1.r();
      GL11.glScalef(var3, var3, var3);
   }
}
