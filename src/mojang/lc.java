package mojang;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class lc extends Resource {

   private int e = -1;
   private BufferedImage f;


   public lc() {
      this.a = "Default";
      this.b = "The default look of Minecraft";

      try {
         this.f = ImageIO.read(lc.class.getResource("/mojang/pack.png"));
      } catch (IOException var2) {
         var2.printStackTrace();
      }

   }

   public void b(Minecraft minecraft) {
      if(this.f != null) {
         minecraft.textureManager.a(this.e);
      }

   }

   public void c(Minecraft minecraft) {
      if(this.f != null && this.e < 0) {
         this.e = minecraft.textureManager.a(this.f);
      }

      if(this.f != null) {
         minecraft.textureManager.b(this.e);
      } else {
         GL11.glBindTexture(3553, minecraft.textureManager.readImageFromLocation("/mojang/gui/unknown_pack.png"));
      }

   }
}
