package mojang;

import org.lwjgl.opengl.GL11;

public class alq extends fe {

   public alq(ho var1, ho var2, float var3) {
      super(var1, var3);
      this.a(var2);
   }

   protected int a(Sheep var1, int var2, float var3) {
      if(var2 == 0 && !var1.u()) {
         this.a("/mojang/mob/sheep_fur.png");
         float var4 = 1.0F;
         int var5 = var1.t();
         GL11.glColor3f(var4 * Sheep.a[var5][0], var4 * Sheep.a[var5][1], var4 * Sheep.a[var5][2]);
         return 1;
      } else {
         return -1;
      }
   }

   public void a(Sheep var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((Mob)var1, var2, var4, var6, var8, var9);
   }
}
