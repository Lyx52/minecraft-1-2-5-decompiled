package mojang;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Component;
import mojang.net.minecraft.client.Minecraft;
import mojang.net.minecraft.client.MinecraftApplet;

public class MinecraftChild extends Minecraft {

   final MinecraftApplet minecraftApplet;


   public MinecraftChild(MinecraftApplet applet, Component componentApplet, Canvas canvas, MinecraftApplet minecraftApplet, int width, int height, boolean fullscreen) {
      super(componentApplet, canvas, minecraftApplet, width, height, fullscreen);
      this.minecraftApplet = applet;
   }

   public void throwStopGameException(StopGameException exception) {
      this.minecraftApplet.removeAll();
      this.minecraftApplet.setLayout(new BorderLayout());
      this.minecraftApplet.add(new ErrorPanel(exception), "Center");
      this.minecraftApplet.validate();
   }
}
