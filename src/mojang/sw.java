package mojang;

import org.lwjgl.opengl.GL11;

public class sw extends fe {

   public sw(ho var1, float var2) {
      super(var1, var2);
   }

   public void a(Ozelot var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((Mob)var1, var2, var4, var6, var8, var9);
   }

   protected void a(Ozelot var1, float var2) {
      super.a(var1, var2);
      if(var1.G_()) {
         GL11.glScalef(0.8F, 0.8F, 0.8F);
      }

   }
}
