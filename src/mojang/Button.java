package mojang;

import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Button extends InterfaceRendererUtils {

   protected int width;
   protected int height;
   public int x;
   public int y;
   public String title;
   public int f;
   public boolean h;
   public boolean i;


   public Button(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4);
   }

   public Button(int var1, int x, int y, int width, int height, String title) {
      this.width = 200;
      this.height = 20;
      this.h = true;
      this.i = true;
      this.f = var1;
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      this.title = title;
   }

   protected int a(boolean var1) {
      byte var2 = 1;
      if(!this.h) {
         var2 = 0;
      } else if(var1) {
         var2 = 2;
      }

      return var2;
   }

   public void a(Minecraft var1, int var2, int var3) {
      if(this.i) {
         nl var4 = var1.q;
         GL11.glBindTexture(3553, var1.p.b("/mojang/gui/gui.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         boolean var5 = var2 >= this.x && var3 >= this.y && var2 < this.x + this.width && var3 < this.y + this.height;
         int var6 = this.a(var5);
         this.b(this.x, this.y, 0, 46 + var6 * 20, this.width / 2, this.height);
         this.b(this.x + this.width / 2, this.y, 200 - this.width / 2, 46 + var6 * 20, this.width / 2, this.height);
         this.b(var1, var2, var3);
         int var7 = 14737632;
         if(!this.h) {
            var7 = -6250336;
         } else if(var5) {
            var7 = 16777120;
         }

         this.a(var4, this.title, this.x + this.width / 2, this.y + (this.height - 8) / 2, var7);
      }
   }

   protected void b(Minecraft var1, int var2, int var3) {}

   public void a(int var1, int var2) {}

   public boolean c(Minecraft var1, int var2, int var3) {
      return this.h && this.i && var2 >= this.x && var3 >= this.y && var2 < this.x + this.width && var3 < this.y + this.height;
   }
}
