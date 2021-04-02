package mojang;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;

public class ErrorPanel extends Panel {

   public ErrorPanel(StopGameException exception) {
      this.setBackground(new Color(3028036));
      this.setLayout(new BorderLayout());
      StringWriter writer = new StringWriter();
      exception.exception.printStackTrace(new PrintWriter(writer));
      String var3 = writer.toString();
      String var4 = "";
      String panelBody = "";

      try {
         panelBody = panelBody + "Generated " + (new SimpleDateFormat()).format(new Date()) + "\n";
         panelBody = panelBody + "\n";
         panelBody = panelBody + "Minecraft: Minecraft 1.2.5\n";
         panelBody = panelBody + "OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version") + "\n";
         panelBody = panelBody + "Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor") + "\n";
         panelBody = panelBody + "VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor") + "\n";
         panelBody = panelBody + "LWJGL: " + Sys.getVersion() + "\n";
         var4 = GL11.glGetString(7936);
         panelBody = panelBody + "OpenGL: " + GL11.glGetString(7937) + " version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936) + "\n";
      } catch (Throwable var8) {
         panelBody = panelBody + "[failed to get system properties (" + var8 + ")]\n";
      }

      panelBody = panelBody + "\n";
      panelBody = panelBody + var3;
      String var6 = "";
      var6 = var6 + "\n";
      var6 = var6 + "\n";
      if(var3.contains("Pixel format not accelerated")) {
         var6 = var6 + "      Bad video card drivers!      \n";
         var6 = var6 + "      -----------------------      \n";
         var6 = var6 + "\n";
         var6 = var6 + "Minecraft was unable to start because it failed to find an accelerated OpenGL mode.\n";
         var6 = var6 + "This can usually be fixed by updating the video card drivers.\n";
         if(var4.toLowerCase().contains("nvidia")) {
            var6 = var6 + "\n";
            var6 = var6 + "You might be able to find drivers for your video card here:\n";
            var6 = var6 + "  http://www.nvidia.com/\n";
         } else if(var4.toLowerCase().contains("ati")) {
            var6 = var6 + "\n";
            var6 = var6 + "You might be able to find drivers for your video card here:\n";
            var6 = var6 + "  http://www.amd.com/\n";
         }
      } else {
         var6 = var6 + "      Minecraft has crashed!      \n";
         var6 = var6 + "      ----------------------      \n";
         var6 = var6 + "\n";
         var6 = var6 + "Minecraft has stopped running because it encountered a problem.\n";
         var6 = var6 + "\n";
      }

      var6 = var6 + "\n";
      var6 = var6 + "\n";
      var6 = var6 + "\n";
      var6 = var6 + "--- BEGIN ERROR REPORT " + Integer.toHexString(var6.hashCode()) + " --------\n";
      var6 = var6 + panelBody;
      var6 = var6 + "--- END ERROR REPORT " + Integer.toHexString(var6.hashCode()) + " ----------\n";
      var6 = var6 + "\n";
      var6 = var6 + "\n";
      TextArea var7 = new TextArea(var6, 0, 0, 1);
      var7.setFont(new Font("Monospaced", 0, 12));
      this.add(new eo(), "North");
      this.add(new aku(80), "East");
      this.add(new aku(80), "West");
      this.add(new aku(100), "South");
      this.add(var7, "Center");
   }
}
