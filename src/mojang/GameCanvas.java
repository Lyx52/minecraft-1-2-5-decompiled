package mojang;

import java.awt.Canvas;
import mojang.net.minecraft.client.MinecraftApplet;

public class GameCanvas extends Canvas {

   final MinecraftApplet applet;


   public GameCanvas(MinecraftApplet applet) {
      this.applet = applet;
   }

   public synchronized void addNotify() {
      super.addNotify();
      this.applet.startMainThread();
   }

   public synchronized void removeNotify() {
      this.applet.destroy();
      super.removeNotify();
   }
}
