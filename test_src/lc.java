import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class lc extends h {

   private int e = -1;
   private BufferedImage f;


   public lc() {
      this.a = "Default";
      this.b = "The default look of Minecraft";

      try {
         this.f = ImageIO.read(lc.class.getResource("/pack.png"));
      } catch (IOException var2) {
         var2.printStackTrace();
      }

   }

   public void b(Minecraft var1) {
      if(this.f != null) {
         var1.p.a(this.e);
      }

   }

   public void c(Minecraft var1) {
      if(this.f != null && this.e < 0) {
         this.e = var1.p.a(this.f);
      }

      if(this.f != null) {
         var1.p.b(this.e);
      } else {
         GL11.glBindTexture(3553, var1.p.b("/gui/unknown_pack.png"));
      }

   }
}
