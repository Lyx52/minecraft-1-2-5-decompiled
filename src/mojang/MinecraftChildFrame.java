package mojang;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Frame;
import mojang.net.minecraft.client.Minecraft;
import mojang.net.minecraft.client.MinecraftApplet;

public final class MinecraftChildFrame extends Minecraft {

   final Frame gameFrame;


   public MinecraftChildFrame(Component component, Canvas canvas, MinecraftApplet minecraftApplet, int width, int height, boolean fullscreen, Frame gameFrame) {
      super(component, canvas, minecraftApplet, width, height, fullscreen);
      this.gameFrame = gameFrame;
   }

   public void throwStopGameException(StopGameException exception) {
      this.gameFrame.removeAll();
      this.gameFrame.add(new ErrorPanel(exception), "Center");
      this.gameFrame.validate();
   }
}
