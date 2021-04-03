package mojang;

import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class adr extends Button {

   public adr(int var1, int var2, int var3) {
      super(var1, var2, var3, 20, 20, "");
   }

   public void a(Minecraft var1, int var2, int var3) {
      if(this.i) {
         GL11.glBindTexture(3553, var1.textureManager.readImageFromLocation("/mojang/gui/gui.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         boolean var4 = var2 >= this.x && var3 >= this.y && var2 < this.x + this.width && var3 < this.y + this.height;
         int var5 = 106;
         if(var4) {
            var5 += this.height;
         }

         this.b(this.x, this.y, 0, var5, this.width, this.height);
      }
   }
}
