package mojang;

import org.lwjgl.opengl.GL11;

public class aw extends fe {

   private int c;


   public aw() {
      super(new sy(), 0.25F);
      this.c = ((sy)this.a).a();
   }

   public void a(aic var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = ((sy)this.a).a();
      if(var10 != this.c) {
         this.c = var10;
         this.a = new sy();
         System.out.println("new lava slime model");
      }

      super.a((acq)var1, var2, var4, var6, var8, var9);
   }

   protected void a(aic var1, float var2) {
      int var3 = var1.ap();
      float var4 = (var1.c + (var1.b - var1.c) * var2) / ((float)var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      float var6 = (float)var3;
      GL11.glScalef(var5 * var6, 1.0F / var5 * var6, var5 * var6);
   }
}
