package mojang;

import org.lwjgl.opengl.GL11;

public class ik extends um {

   private int a = -1;
   private ho b;


   public ik() {
      this.g = 0.5F;
   }

   public void a(BaseEntity var1, double var2, double var4, double var6, float var8, float var9) {
      System.out.println("EL > NN");
      if(this.a != 1) {
         this.b = new aml(0.0F);
         this.a = 1;
      }

      float var10 = (float)((EnderCrystal)var1).a + var9;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.a("/mojang/mob/enderdragon/crystal.png");
      float var11 = Utils.sin(var10 * 0.2F) / 2.0F + 0.5F;
      var11 += var11 * var11;
      this.b.a(((EnderCrystal)var1), 0.0F, var10 * 3.0F, var11 * 0.2F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }
}
