package mojang.net.minecraft.isom;

import java.applet.Applet;
import java.awt.BorderLayout;
import mojang.IsomCanvas;
public class IsomPreviewApplet extends Applet {

   private IsomCanvas canvas = new IsomCanvas();


   public IsomPreviewApplet() {
      this.setLayout(new BorderLayout());
      this.add(this.canvas, "Center");
   }

   public void start() {
      this.canvas.start();
   }

   public void stop() {
      this.canvas.stop();
   }
}
