import org.lwjgl.opengl.GL11;

public class alz extends fe {

   private float c;


   public alz(ho var1, float var2, float var3) {
      super(var1, var2 * var3);
      this.c = var3;
   }

   protected void a(kh var1, float var2) {
      GL11.glScalef(this.c, this.c, this.c);
   }
}
