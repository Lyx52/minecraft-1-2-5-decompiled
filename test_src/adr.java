import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class adr extends abp {

   public adr(int var1, int var2, int var3) {
      super(var1, var2, var3, 20, 20, "");
   }

   public void a(Minecraft var1, int var2, int var3) {
      if(this.i) {
         GL11.glBindTexture(3553, var1.p.b("/gui/gui.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         boolean var4 = var2 >= this.c && var3 >= this.d && var2 < this.c + this.a && var3 < this.d + this.b;
         int var5 = 106;
         if(var4) {
            var5 += this.b;
         }

         this.b(this.c, this.d, 0, var5, this.a, this.b);
      }
   }
}
