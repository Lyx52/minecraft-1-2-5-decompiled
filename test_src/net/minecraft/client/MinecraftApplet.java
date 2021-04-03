package net.minecraft.client;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import net.minecraft.client.Minecraft;

public class MinecraftApplet extends Applet {

   private Canvas a;
   private Minecraft b;
   private Thread c = null;


   public void init() {
      this.a = new o(this);
      boolean var1 = false;
      if(this.getParameter("fullscreen") != null) {
         var1 = this.getParameter("fullscreen").equalsIgnoreCase("true");
      }

      this.b = new n(this, this, this.a, this, this.getWidth(), this.getHeight(), var1);
      this.b.l = this.getDocumentBase().getHost();
      if(this.getDocumentBase().getPort() > 0) {
         this.b.l = this.b.l + ":" + this.getDocumentBase().getPort();
      }

      if(this.getParameter("username") != null && this.getParameter("sessionid") != null) {
         this.b.k = new fc(this.getParameter("username"), this.getParameter("sessionid"));
         System.out.println("Setting user: " + this.b.k.b + ", " + this.b.k.c);
         if(this.getParameter("mppass") != null) {
            this.b.k.d = this.getParameter("mppass");
         }
      } else {
         this.b.k = new fc("Player", "");
      }

      if(this.getParameter("server") != null && this.getParameter("port") != null) {
         this.b.a(this.getParameter("server"), Integer.parseInt(this.getParameter("port")));
      }

      this.b.n = true;
      if("true".equals(this.getParameter("stand-alone"))) {
         this.b.n = false;
      }

      this.setLayout(new BorderLayout());
      this.add(this.a, "Center");
      this.a.setFocusable(true);
      this.validate();
   }

   public void a() {
      if(this.c == null) {
         this.c = new Thread(this.b, "Minecraft main thread");
         this.c.start();
      }
   }

   public void start() {
      if(this.b != null) {
         this.b.o = false;
      }

   }

   public void stop() {
      if(this.b != null) {
         this.b.o = true;
      }

   }

   public void destroy() {
      this.b();
   }

   public void b() {
      if(this.c != null) {
         this.b.f();

         try {
            this.c.join(10000L);
         } catch (InterruptedException var4) {
            try {
               this.b.d();
            } catch (Exception var3) {
               var3.printStackTrace();
            }
         }

         this.c = null;
      }
   }

   public void c() {
      this.a = null;
      this.b = null;
      this.c = null;

      try {
         this.removeAll();
         this.validate();
      } catch (Exception var2) {
         ;
      }

   }
}
