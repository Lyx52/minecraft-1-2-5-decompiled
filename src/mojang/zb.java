package mojang;

import org.lwjgl.opengl.GL11;

public class zb extends fe {

   protected vb c;


   public zb() {
      super(new vb(0.0F), 0.5F);
      this.c = (vb)this.a;
   }

   protected int a(ed var1, int var2, float var3) {
      return -1;
   }

   public void a(ed var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((acq)var1, var2, var4, var6, var8, var9);
   }

   protected void a(ed var1, double var2, double var4, double var6) {}

   protected void a(ed var1, float var2) {
      super.b(var1, var2);
   }

   protected void b(ed var1, float var2) {
      float var3 = 0.9375F;
      if(var1.av() < 0) {
         var3 = (float)((double)var3 * 0.5D);
         this.g = 0.25F;
      } else {
         this.g = 0.5F;
      }

      GL11.glScalef(var3, var3, var3);
   }
}
