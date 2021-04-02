package mojang.net.minecraft.client;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import mojang.GameCanvas;
import mojang.MinecraftChild;
import mojang.CredentialManager;
public class MinecraftApplet extends Applet {

   private Canvas canvas;
   private Minecraft minecraftApplication;
   private Thread mainThread = null;


   public void init() {
      this.canvas = new GameCanvas(this);
      boolean fullscreen = false;
      if(this.getParameter("fullscreen") != null) {
         fullscreen = this.getParameter("fullscreen").equalsIgnoreCase("true");
      }

      this.minecraftApplication = new MinecraftChild(this, this, this.canvas, this, this.getWidth(), this.getHeight(), fullscreen);
      this.minecraftApplication.host = this.getDocumentBase().getHost();
      if(this.getDocumentBase().getPort() > 0) {
         this.minecraftApplication.host = this.minecraftApplication.host + ":" + this.getDocumentBase().getPort();
      }

      if(this.getParameter("username") != null && this.getParameter("sessionid") != null) {
         this.minecraftApplication.credentials = new CredentialManager(this.getParameter("username"), this.getParameter("sessionid"));
         System.out.println("Setting user: " + this.minecraftApplication.credentials.username + ", " + this.minecraftApplication.credentials.sessionid);
         if(this.getParameter("mppass") != null) {
            this.minecraftApplication.credentials.mppass = this.getParameter("mppass");
         }
      } else {
         this.minecraftApplication.credentials = new CredentialManager("Player", "");
      }

      if(this.getParameter("server") != null && this.getParameter("port") != null) {
         this.minecraftApplication.setServer(this.getParameter("server"), Integer.parseInt(this.getParameter("port")));
      }

      this.minecraftApplication.appletMode = true;
      if ("true".equals(this.getParameter("stand-alone"))) {
         this.minecraftApplication.appletMode = false;
      }

      this.setLayout(new BorderLayout());
      this.add(this.canvas, "Center");
      this.canvas.setFocusable(true);
      this.validate();
   }

   public void startMainThread() {
      if(this.mainThread == null) {
         this.mainThread = new Thread(this.minecraftApplication, "Minecraft main thread");
         this.mainThread.start();
      }
   }

   public void start() {
      if(this.minecraftApplication != null) {
         this.minecraftApplication._running = false;
      }

   }

   public void stop() {
      if(this.minecraftApplication != null) {
         this.minecraftApplication._running = true;
      }

   }

   public void destroy() {
      if(this.mainThread != null) {
         this.minecraftApplication.stop();

         try {
            this.mainThread.join(10000L);
         } catch (InterruptedException var4) {
            try {
               this.minecraftApplication.d();
            } catch (Exception e) {
               e.printStackTrace();
            }
         }

         this.mainThread = null;
      }
   }

   public void c() {
      this.canvas = null;
      this.minecraftApplication = null;
      this.mainThread = null;

      try {
         this.removeAll();
         this.validate();
      } catch (Exception var2) {
         ;
      }

   }
}
