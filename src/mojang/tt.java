package mojang;

import org.lwjgl.opengl.GL11;

public class tt {

   public byte[] f = new byte[1024];
   public int g;
   public boolean h = false;
   public int i = 0;
   public int j = 1;
   public int k = 0;


   public tt(int var1) {
      this.g = var1;
   }

   public void a() {}

   public void a(TextureManager var1) {
      if(this.k == 0) {
         GL11.glBindTexture(3553, var1.readImageFromLocation("/mojang/terrain.png"));
      } else if(this.k == 1) {
         GL11.glBindTexture(3553, var1.readImageFromLocation("/mojang/gui/items.png"));
      }

   }
}
