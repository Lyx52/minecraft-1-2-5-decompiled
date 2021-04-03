package net.minecraft.client;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.File;
import java.text.DecimalFormat;
import java.util.List;
import net.minecraft.client.MinecraftApplet;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public abstract class Minecraft implements Runnable {

   public static byte[] b = new byte[10485760];
   private static Minecraft a;
   public ki c;
   private boolean U = false;
   private boolean V = false;
   public int d;
   public int e;
   private vm W;
   private aft X = new aft(20.0F);
   public xd f;
   public l g;
   public vq h;
   public acq i;
   public cw j;
   public fc k = null;
   public String l;
   public Canvas m;
   public boolean n = false;
   public volatile boolean o = false;
   public aaw p;
   public nl q;
   public nl r;
   public vp s = null;
   public jc t;
   public lr u;
   private ck Y;
   private int Z = 0;
   private int aa = 0;
   private int ab;
   private int ac;
   public qd v = new qd(this);
   public aiy w;
   public boolean x = false;
   public xg y = new xg(0.0F);
   public pl z = null;
   public hu A;
   protected MinecraftApplet B;
   public sd C = new sd();
   public aka D;
   public gi E;
   public File F;
   private kb ad;
   public static long[] G = new long[512];
   public static long[] H = new long[512];
   public static int I = 0;
   public static long J = 0L;
   private int ae = 0;
   public alf K;
   private String af;
   private int ag;
   private qa ah = new qa();
   private bv ai = new bv();
   private static File aj = null;
   public volatile boolean L = true;
   public String M = "";
   long N = System.currentTimeMillis();
   int O = 0;
   boolean P = false;
   long Q = -1L;
   private String ak = "root";
   public boolean R = false;
   public boolean S = false;
   long T = System.currentTimeMillis();
   private int al = 0;


   public Minecraft(Component var1, Canvas var2, MinecraftApplet var3, int var4, int var5, boolean var6) {
      gv.a();
      this.ac = var5;
      this.U = var6;
      this.B = var3;
      afd.b = 32767;
      new hj(this, "Timer hack thread");
      this.m = var2;
      this.d = var4;
      this.e = var5;
      this.U = var6;
      if(var3 == null || "true".equals(var3.getParameter("stand-alone"))) {
         this.n = false;
      }

      a = this;
   }

   public void b(ja var1) {
      this.V = true;
      this.a(var1);
   }

   public abstract void a(ja var1);

   public void a(String var1, int var2) {
      this.af = var1;
      this.ag = var2;
   }

   public void a() {
      if(this.m != null) {
         Graphics var1 = this.m.getGraphics();
         if(var1 != null) {
            var1.setColor(Color.BLACK);
            var1.fillRect(0, 0, this.d, this.e);
            var1.dispose();
         }

         Display.setParent(this.m);
      } else if(this.U) {
         Display.setFullscreen(true);
         this.d = Display.getDisplayMode().getWidth();
         this.e = Display.getDisplayMode().getHeight();
         if(this.d <= 0) {
            this.d = 1;
         }

         if(this.e <= 0) {
            this.e = 1;
         }
      } else {
         Display.setDisplayMode(new DisplayMode(this.d, this.e));
      }

      Display.setTitle("Minecraft Minecraft 1.2.5");
      System.out.println("LWJGL Version: " + Sys.getVersion());

      try {
         PixelFormat var7 = new PixelFormat();
         var7 = var7.withDepthBits(24);
         Display.create(var7);
      } catch (LWJGLException var6) {
         var6.printStackTrace();

         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var5) {
            ;
         }

         Display.create();
      }

      es.a();
      this.F = b();
      this.ad = new fp(new File(this.F, "saves"));
      this.A = new hu(this, this.F);
      this.E = new gi(this, this.F);
      this.p = new aaw(this.E, this.A);
      this.v();
      this.q = new nl(this.A, "/font/default.png", this.p, false);
      this.r = new nl(this.A, "/font/alternate.png", this.p, false);
      if(this.A.R != null) {
         adn.a().a(this.A.R);
         this.q.a(adn.a().d());
         this.q.b(adn.d(this.A.R));
      }

      zt.a(this.p.a("/misc/watercolor.png"));
      zv.a(this.p.a("/misc/grasscolor.png"));
      gu.a(this.p.a("/misc/foliagecolor.png"));
      this.u = new lr(this);
      ahu.a.f = new mn(this);
      this.K = new alf(this.k, this.F);
      dp.f.a(new hk(this));
      this.v();
      Mouse.create();
      this.D = new aka(this.m);

      try {
         Controllers.create();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      D();
      this.d("Pre startup");
      GL11.glEnable(3553);
      GL11.glShadeModel(7425);
      GL11.glClearDepth(1.0D);
      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glCullFace(1029);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      this.d("Startup");
      this.W = new vm();
      this.C.a(this.A);
      this.p.a((tt)this.ai);
      this.p.a((tt)this.ah);
      this.p.a((tt)(new zp()));
      this.p.a((tt)(new tu(this)));
      this.p.a((tt)(new ht(this)));
      this.p.a((tt)(new ael()));
      this.p.a((tt)(new gf()));
      this.p.a((tt)(new nh(0)));
      this.p.a((tt)(new nh(1)));
      this.g = new l(this, this.p);
      GL11.glViewport(0, 0, this.d, this.e);
      this.j = new cw(this.f, this.p);

      try {
         this.Y = new ck(this.F, this);
         this.Y.start();
      } catch (Exception var3) {
         ;
      }

      this.d("Post startup");
      this.w = new aiy(this);
      if(this.af != null) {
         this.a((vp)(new ajy(this, this.af, this.ag)));
      } else {
         this.a((vp)(new xt()));
      }

      this.t = new jc(this);
   }

   private void v() {
      agd var1 = new agd(this.A, this.d, this.e);
      GL11.glClear(16640);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, var1.a, var1.b, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glViewport(0, 0, this.d, this.e);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      adz var2 = adz.a;
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glDisable(2912);
      GL11.glBindTexture(3553, this.p.b("/title/mojang.png"));
      var2.b();
      var2.c(16777215);
      var2.a(0.0D, (double)this.e, 0.0D, 0.0D, 0.0D);
      var2.a((double)this.d, (double)this.e, 0.0D, 0.0D, 0.0D);
      var2.a((double)this.d, 0.0D, 0.0D, 0.0D, 0.0D);
      var2.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      var2.a();
      short var3 = 256;
      short var4 = 256;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var2.c(16777215);
      this.a((var1.a() - var3) / 2, (var1.b() - var4) / 2, 0, 0, var3, var4);
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      Display.swapBuffers();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      adz var9 = adz.a;
      var9.b();
      var9.a((double)(var1 + 0), (double)(var2 + var6), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + var6), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + 0), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.a((double)(var1 + 0), (double)(var2 + 0), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.a();
   }

   public static File b() {
      if(aj == null) {
         aj = a("minecraft");
      }

      return aj;
   }

   public static File a(String var0) {
      String var1 = System.getProperty("user.home", ".");
      File var2;
      switch(hn.a[w().ordinal()]) {
      case 1:
      case 2:
         var2 = new File(var1, '.' + var0 + '/');
         break;
      case 3:
         String var3 = System.getenv("APPDATA");
         if(var3 != null) {
            var2 = new File(var3, "." + var0 + '/');
         } else {
            var2 = new File(var1, '.' + var0 + '/');
         }
         break;
      case 4:
         var2 = new File(var1, "Library/Application Support/" + var0);
         break;
      default:
         var2 = new File(var1, var0 + '/');
      }

      if(!var2.exists() && !var2.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + var2);
      } else {
         return var2;
      }
   }

   private static afa w() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")?afa.c:(var0.contains("mac")?afa.d:(var0.contains("solaris")?afa.b:(var0.contains("sunos")?afa.b:(var0.contains("linux")?afa.a:(var0.contains("unix")?afa.a:afa.e)))));
   }

   public kb c() {
      return this.ad;
   }

   public void a(vp var1) {
      if(!(this.s instanceof uw)) {
         if(this.s != null) {
            this.s.e();
         }

         if(var1 instanceof xt) {
            this.K.b();
         }

         this.K.c();
         if(var1 == null && this.f == null) {
            var1 = new xt();
         } else if(var1 == null && this.h.bb() <= 0) {
            var1 = new uy();
         }

         if(var1 instanceof xt) {
            this.A.F = false;
            this.w.b();
         }

         this.s = (vp)var1;
         if(var1 != null) {
            this.h();
            agd var2 = new agd(this.A, this.d, this.e);
            int var3 = var2.a();
            int var4 = var2.b();
            ((vp)var1).a(this, var3, var4);
            this.x = false;
         } else {
            this.g();
         }

      }
   }

   private void d(String var1) {
      int var2 = GL11.glGetError();
      if(var2 != 0) {
         String var3 = GLU.gluErrorString(var2);
         System.out.println("########## GL ERROR ##########");
         System.out.println("@ " + var1);
         System.out.println(var2 + ": " + var3);
      }

   }

   public void d() {
      try {
         this.K.b();
         this.K.c();
         if(this.B != null) {
            this.B.c();
         }

         try {
            if(this.Y != null) {
               this.Y.b();
            }
         } catch (Exception var9) {
            ;
         }

         System.out.println("Stopping!");

         try {
            this.a((xd)null);
         } catch (Throwable var8) {
            ;
         }

         try {
            ew.a();
         } catch (Throwable var7) {
            ;
         }

         this.C.b();
         Mouse.destroy();
         Keyboard.destroy();
      } finally {
         Display.destroy();
         if(!this.V) {
            System.exit(0);
         }

      }

      System.gc();
   }

   public void run() {
      this.L = true;

      try {
         this.a();
      } catch (Exception var11) {
         var11.printStackTrace();
         this.b(new ja("Failed to start game", var11));
         return;
      }

      try {
         while(this.L) {
            try {
               this.x();
            } catch (aiz var9) {
               this.f = null;
               this.a((xd)null);
               this.a((vp)(new afx()));
            } catch (OutOfMemoryError var10) {
               this.e();
               this.a((vp)(new ti()));
               System.gc();
            }
         }
      } catch (ru var12) {
         ;
      } catch (Throwable var13) {
         this.e();
         var13.printStackTrace();
         this.b(new ja("Unexpected error", var13));
      } finally {
         this.d();
      }

   }

   private void x() {
      if(this.B != null && !this.B.isActive()) {
         this.L = false;
      } else {
         wu.b();
         bo.b();
         lv.a("root");
         if(this.m == null && Display.isCloseRequested()) {
            this.f();
         }

         if(this.o && this.f != null) {
            float var1 = this.X.c;
            this.X.a();
            this.X.c = var1;
         } else {
            this.X.a();
         }

         long var6 = System.nanoTime();
         lv.a("tick");

         for(int var3 = 0; var3 < this.X.b; ++var3) {
            ++this.Z;

            try {
               this.k();
            } catch (aiz var5) {
               this.f = null;
               this.a((xd)null);
               this.a((vp)(new afx()));
            }
         }

         lv.b();
         long var7 = System.nanoTime() - var6;
         this.d("Pre render");
         vl.b = this.A.j;
         lv.a("sound");
         this.C.a(this.h, this.X.c);
         lv.c("updatelights");
         if(this.f != null) {
            this.f.H();
         }

         lv.b();
         lv.a("render");
         lv.a("display");
         GL11.glEnable(3553);
         if(!Keyboard.isKeyDown(65)) {
            Display.update();
         }

         if(this.h != null && this.h.N()) {
            this.A.E = 0;
         }

         lv.b();
         if(!this.x) {
            lv.a("gameMode");
            if(this.c != null) {
               this.c.a(this.X.c);
            }

            lv.c("gameRenderer");
            this.u.b(this.X.c);
            lv.b();
         }

         GL11.glFlush();
         lv.b();
         if(!Display.isActive() && this.U) {
            this.j();
         }

         lv.b();
         if(this.A.F && this.A.G) {
            if(!lv.a) {
               lv.a();
            }

            lv.a = true;
            this.a(var7);
         } else {
            lv.a = false;
            this.Q = System.nanoTime();
         }

         this.v.a();
         lv.a("root");
         Thread.yield();
         if(Keyboard.isKeyDown(65)) {
            Display.update();
         }

         this.y();
         if(this.m != null && !this.U && (this.m.getWidth() != this.d || this.m.getHeight() != this.e)) {
            this.d = this.m.getWidth();
            this.e = this.m.getHeight();
            if(this.d <= 0) {
               this.d = 1;
            }

            if(this.e <= 0) {
               this.e = 1;
            }

            this.a(this.d, this.e);
         }

         this.d("Post render");
         ++this.O;

         for(this.o = !this.l() && this.s != null && this.s.b(); System.currentTimeMillis() >= this.N + 1000L; this.O = 0) {
            this.M = this.O + " fps, " + ct.b + " chunk updates";
            ct.b = 0;
            this.N += 1000L;
         }

         lv.b();
      }
   }

   public void e() {
      try {
         b = new byte[0];
         this.g.e();
      } catch (Throwable var4) {
         ;
      }

      try {
         System.gc();
         wu.a();
         bo.a();
      } catch (Throwable var3) {
         ;
      }

      try {
         System.gc();
         this.a((xd)null);
      } catch (Throwable var2) {
         ;
      }

      System.gc();
   }

   private void y() {
      if(Keyboard.isKeyDown(60)) {
         if(!this.P) {
            this.P = true;
            this.w.a(zh.a(aj, this.d, this.e));
         }
      } else {
         this.P = false;
      }

   }

   private void b(int var1) {
      List var2 = lv.b(this.ak);
      if(var2 != null && var2.size() != 0) {
         aaf var3 = (aaf)var2.remove(0);
         if(var1 == 0) {
            if(var3.c.length() > 0) {
               int var4 = this.ak.lastIndexOf(".");
               if(var4 >= 0) {
                  this.ak = this.ak.substring(0, var4);
               }
            }
         } else {
            --var1;
            if(var1 < var2.size() && !((aaf)var2.get(var1)).c.equals("unspecified")) {
               if(this.ak.length() > 0) {
                  this.ak = this.ak + ".";
               }

               this.ak = this.ak + ((aaf)var2.get(var1)).c;
            }
         }

      }
   }

   private void a(long var1) {
      List var3 = lv.b(this.ak);
      aaf var4 = (aaf)var3.remove(0);
      long var5 = 16666666L;
      if(this.Q == -1L) {
         this.Q = System.nanoTime();
      }

      long var7 = System.nanoTime();
      H[I & G.length - 1] = var1;
      G[I++ & G.length - 1] = var7 - this.Q;
      this.Q = var7;
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glEnable(2903);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)this.d, (double)this.e, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      adz var9 = adz.a;
      var9.a(7);
      int var10 = (int)(var5 / 200000L);
      var9.c(536870912);
      var9.a(0.0D, (double)(this.e - var10), 0.0D);
      var9.a(0.0D, (double)this.e, 0.0D);
      var9.a((double)G.length, (double)this.e, 0.0D);
      var9.a((double)G.length, (double)(this.e - var10), 0.0D);
      var9.c(538968064);
      var9.a(0.0D, (double)(this.e - var10 * 2), 0.0D);
      var9.a(0.0D, (double)(this.e - var10), 0.0D);
      var9.a((double)G.length, (double)(this.e - var10), 0.0D);
      var9.a((double)G.length, (double)(this.e - var10 * 2), 0.0D);
      var9.a();
      long var11 = 0L;

      int var13;
      for(var13 = 0; var13 < G.length; ++var13) {
         var11 += G[var13];
      }

      var13 = (int)(var11 / 200000L / (long)G.length);
      var9.a(7);
      var9.c(541065216);
      var9.a(0.0D, (double)(this.e - var13), 0.0D);
      var9.a(0.0D, (double)this.e, 0.0D);
      var9.a((double)G.length, (double)this.e, 0.0D);
      var9.a((double)G.length, (double)(this.e - var13), 0.0D);
      var9.a();
      var9.a(1);

      int var15;
      int var16;
      for(int var14 = 0; var14 < G.length; ++var14) {
         var15 = (var14 - I & G.length - 1) * 255 / G.length;
         var16 = var15 * var15 / 255;
         var16 = var16 * var16 / 255;
         int var17 = var16 * var16 / 255;
         var17 = var17 * var17 / 255;
         if(G[var14] > var5) {
            var9.c(-16777216 + var16 * 65536);
         } else {
            var9.c(-16777216 + var16 * 256);
         }

         long var18 = G[var14] / 200000L;
         long var20 = H[var14] / 200000L;
         var9.a((double)((float)var14 + 0.5F), (double)((float)((long)this.e - var18) + 0.5F), 0.0D);
         var9.a((double)((float)var14 + 0.5F), (double)((float)this.e + 0.5F), 0.0D);
         var9.c(-16777216 + var16 * 65536 + var16 * 256 + var16 * 1);
         var9.a((double)((float)var14 + 0.5F), (double)((float)((long)this.e - var18) + 0.5F), 0.0D);
         var9.a((double)((float)var14 + 0.5F), (double)((float)((long)this.e - (var18 - var20)) + 0.5F), 0.0D);
      }

      var9.a();
      short var26 = 160;
      var15 = this.d - var26 - 10;
      var16 = this.e - var26 * 2;
      GL11.glEnable(3042);
      var9.b();
      var9.a(0, 200);
      var9.a((double)((float)var15 - (float)var26 * 1.1F), (double)((float)var16 - (float)var26 * 0.6F - 16.0F), 0.0D);
      var9.a((double)((float)var15 - (float)var26 * 1.1F), (double)(var16 + var26 * 2), 0.0D);
      var9.a((double)((float)var15 + (float)var26 * 1.1F), (double)(var16 + var26 * 2), 0.0D);
      var9.a((double)((float)var15 + (float)var26 * 1.1F), (double)((float)var16 - (float)var26 * 0.6F - 16.0F), 0.0D);
      var9.a();
      GL11.glDisable(3042);
      double var27 = 0.0D;

      int var21;
      for(int var19 = 0; var19 < var3.size(); ++var19) {
         aaf var29 = (aaf)var3.get(var19);
         var21 = gk.c(var29.a / 4.0D) + 1;
         var9.a(6);
         var9.c(var29.a());
         var9.a((double)var15, (double)var16, 0.0D);

         int var22;
         float var23;
         float var24;
         float var25;
         for(var22 = var21; var22 >= 0; --var22) {
            var23 = (float)((var27 + var29.a * (double)var22 / (double)var21) * 3.1415927410125732D * 2.0D / 100.0D);
            var24 = gk.a(var23) * (float)var26;
            var25 = gk.b(var23) * (float)var26 * 0.5F;
            var9.a((double)((float)var15 + var24), (double)((float)var16 - var25), 0.0D);
         }

         var9.a();
         var9.a(5);
         var9.c((var29.a() & 16711422) >> 1);

         for(var22 = var21; var22 >= 0; --var22) {
            var23 = (float)((var27 + var29.a * (double)var22 / (double)var21) * 3.1415927410125732D * 2.0D / 100.0D);
            var24 = gk.a(var23) * (float)var26;
            var25 = gk.b(var23) * (float)var26 * 0.5F;
            var9.a((double)((float)var15 + var24), (double)((float)var16 - var25), 0.0D);
            var9.a((double)((float)var15 + var24), (double)((float)var16 - var25 + 10.0F), 0.0D);
         }

         var9.a();
         var27 += var29.a;
      }

      DecimalFormat var28 = new DecimalFormat("##0.00");
      GL11.glEnable(3553);
      String var30 = "";
      if(!var4.c.equals("unspecified")) {
         var30 = var30 + "[0] ";
      }

      if(var4.c.length() == 0) {
         var30 = var30 + "ROOT ";
      } else {
         var30 = var30 + var4.c + " ";
      }

      var21 = 16777215;
      this.q.a(var30, var15 - var26, var16 - var26 / 2 - 16, var21);
      this.q.a(var30 = var28.format(var4.b) + "%", var15 + var26 - this.q.a(var30), var16 - var26 / 2 - 16, var21);

      for(int var32 = 0; var32 < var3.size(); ++var32) {
         aaf var31 = (aaf)var3.get(var32);
         String var33 = "";
         if(!var31.c.equals("unspecified")) {
            var33 = var33 + "[" + (var32 + 1) + "] ";
         } else {
            var33 = var33 + "[?] ";
         }

         var33 = var33 + var31.c;
         this.q.a(var33, var15 - var26, var16 + var26 / 2 + var32 * 8 + 20, var31.a());
         this.q.a(var33 = var28.format(var31.a) + "%", var15 + var26 - 50 - this.q.a(var33), var16 + var26 / 2 + var32 * 8 + 20, var31.a());
         this.q.a(var33 = var28.format(var31.b) + "%", var15 + var26 - this.q.a(var33), var16 + var26 / 2 + var32 * 8 + 20, var31.a());
      }

   }

   public void f() {
      this.L = false;
   }

   public void g() {
      if(Display.isActive()) {
         if(!this.R) {
            this.R = true;
            this.D.a();
            this.a((vp)null);
            this.aa = 10000;
         }
      }
   }

   public void h() {
      if(this.R) {
         afu.a();
         this.R = false;
         this.D.b();
      }
   }

   public void i() {
      if(this.s == null) {
         this.a((vp)(new lb()));
      }
   }

   private void a(int var1, boolean var2) {
      if(!var2) {
         this.aa = 0;
      }

      if(var1 != 0 || this.aa <= 0) {
         if(var2 && this.z != null && this.z.a == aat.a && var1 == 0) {
            int var3 = this.z.b;
            int var4 = this.z.c;
            int var5 = this.z.d;
            this.c.c(var3, var4, var5, this.z.e);
            if(this.h.e(var3, var4, var5)) {
               this.j.a(var3, var4, var5, this.z.e);
               this.h.ax();
            }
         } else {
            this.c.a();
         }

      }
   }

   private void c(int var1) {
      if(var1 != 0 || this.aa <= 0) {
         if(var1 == 0) {
            this.h.ax();
         }

         if(var1 == 1) {
            this.ae = 4;
         }

         boolean var2 = true;
         aan var3 = this.h.ap.b();
         if(this.z == null) {
            if(var1 == 0 && this.c.g()) {
               this.aa = 10;
            }
         } else if(this.z.a == aat.b) {
            if(var1 == 0) {
               this.c.b(this.h, this.z.g);
            }

            if(var1 == 1) {
               this.c.a(this.h, this.z.g);
            }
         } else if(this.z.a == aat.a) {
            int var4 = this.z.b;
            int var5 = this.z.c;
            int var6 = this.z.d;
            int var7 = this.z.e;
            if(var1 == 0) {
               this.c.a(var4, var5, var6, this.z.e);
            } else {
               int var9 = var3 != null?var3.a:0;
               if(this.c.a(this.h, this.f, var3, var4, var5, var6, var7)) {
                  var2 = false;
                  this.h.ax();
               }

               if(var3 == null) {
                  return;
               }

               if(var3.a == 0) {
                  this.h.ap.a[this.h.ap.c] = null;
               } else if(var3.a != var9 || this.c.h()) {
                  this.u.c.b();
               }
            }
         }

         if(var2 && var1 == 1) {
            aan var10 = this.h.ap.b();
            if(var10 != null && this.c.a(this.h, this.f, var10)) {
               this.u.c.c();
            }
         }

      }
   }

   public void j() {
      try {
         this.U = !this.U;
         if(this.U) {
            Display.setDisplayMode(Display.getDesktopDisplayMode());
            this.d = Display.getDisplayMode().getWidth();
            this.e = Display.getDisplayMode().getHeight();
            if(this.d <= 0) {
               this.d = 1;
            }

            if(this.e <= 0) {
               this.e = 1;
            }
         } else {
            if(this.m != null) {
               this.d = this.m.getWidth();
               this.e = this.m.getHeight();
            } else {
               this.d = this.ab;
               this.e = this.ac;
            }

            if(this.d <= 0) {
               this.d = 1;
            }

            if(this.e <= 0) {
               this.e = 1;
            }
         }

         if(this.s != null) {
            this.a(this.d, this.e);
         }

         Display.setFullscreen(this.U);
         Display.update();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void a(int var1, int var2) {
      if(var1 <= 0) {
         var1 = 1;
      }

      if(var2 <= 0) {
         var2 = 1;
      }

      this.d = var1;
      this.e = var2;
      if(this.s != null) {
         agd var3 = new agd(this.A, var1, var2);
         int var4 = var3.a();
         int var5 = var3.b();
         this.s.a(this, var4, var5);
      }

   }

   private void z() {
      (new hp(this)).start();
   }

   public void k() {
      if(this.ae > 0) {
         --this.ae;
      }

      if(this.Z == 6000) {
         this.z();
      }

      lv.a("stats");
      this.K.d();
      lv.c("gui");
      if(!this.o) {
         this.w.a();
      }

      lv.c("pick");
      this.u.a(1.0F);
      lv.c("centerChunkSource");
      int var3;
      if(this.h != null) {
         ca var1 = this.f.z();
         if(var1 instanceof hy) {
            hy var2 = (hy)var1;
            var3 = gk.d((float)((int)this.h.o)) >> 4;
            int var4 = gk.d((float)((int)this.h.q)) >> 4;
            var2.d(var3, var4);
         }
      }

      lv.c("gameMode");
      if(!this.o && this.f != null) {
         this.c.c();
      }

      GL11.glBindTexture(3553, this.p.b("/terrain.png"));
      lv.c("textures");
      if(!this.o) {
         this.p.a();
      }

      if(this.s == null && this.h != null) {
         if(this.h.bb() <= 0) {
            this.a((vp)null);
         } else if(this.h.az() && this.f != null && this.f.F) {
            this.a((vp)(new yj()));
         }
      } else if(this.s != null && this.s instanceof yj && !this.h.az()) {
         this.a((vp)null);
      }

      if(this.s != null) {
         this.aa = 10000;
      }

      if(this.s != null) {
         this.s.i();
         if(this.s != null) {
            this.s.v.a();
            this.s.a();
         }
      }

      if(this.s == null || this.s.t) {
         lv.c("mouse");

         while(Mouse.next()) {
            afu.a(Mouse.getEventButton() - 100, Mouse.getEventButtonState());
            if(Mouse.getEventButtonState()) {
               afu.a(Mouse.getEventButton() - 100);
            }

            long var5 = System.currentTimeMillis() - this.T;
            if(var5 <= 200L) {
               var3 = Mouse.getEventDWheel();
               if(var3 != 0) {
                  this.h.ap.c(var3);
                  if(this.A.I) {
                     if(var3 > 0) {
                        var3 = 1;
                     }

                     if(var3 < 0) {
                        var3 = -1;
                     }

                     this.A.L += (float)var3 * 0.25F;
                  }
               }

               if(this.s == null) {
                  if(!this.R && Mouse.getEventButtonState()) {
                     this.g();
                  }
               } else if(this.s != null) {
                  this.s.f();
               }
            }
         }

         if(this.aa > 0) {
            --this.aa;
         }

         lv.c("keyboard");

         while(Keyboard.next()) {
            afu.a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
            if(Keyboard.getEventKeyState()) {
               afu.a(Keyboard.getEventKey());
            }

            if(Keyboard.getEventKeyState()) {
               if(Keyboard.getEventKey() == 87) {
                  this.j();
               } else {
                  if(this.s != null) {
                     this.s.j();
                  } else {
                     if(Keyboard.getEventKey() == 1) {
                        this.i();
                     }

                     if(Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61)) {
                        this.A();
                     }

                     if(Keyboard.getEventKey() == 20 && Keyboard.isKeyDown(61)) {
                        this.p.b();
                     }

                     if(Keyboard.getEventKey() == 33 && Keyboard.isKeyDown(61)) {
                        boolean var6 = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
                        this.A.a(zq.g, var6?-1:1);
                     }

                     if(Keyboard.getEventKey() == 30 && Keyboard.isKeyDown(61)) {
                        this.g.a();
                     }

                     if(Keyboard.getEventKey() == 59) {
                        this.A.D = !this.A.D;
                     }

                     if(Keyboard.getEventKey() == 61) {
                        this.A.F = !this.A.F;
                        this.A.G = !vp.m();
                     }

                     if(Keyboard.getEventKey() == 63) {
                        ++this.A.E;
                        if(this.A.E > 2) {
                           this.A.E = 0;
                        }
                     }

                     if(Keyboard.getEventKey() == 66) {
                        this.A.J = !this.A.J;
                     }
                  }

                  int var7;
                  for(var7 = 0; var7 < 9; ++var7) {
                     if(Keyboard.getEventKey() == 2 + var7) {
                        this.h.ap.c = var7;
                     }
                  }

                  if(this.A.F && this.A.G) {
                     if(Keyboard.getEventKey() == 11) {
                        this.b(0);
                     }

                     for(var7 = 0; var7 < 9; ++var7) {
                        if(Keyboard.getEventKey() == 2 + var7) {
                           this.b(var7 + 1);
                        }
                     }
                  }
               }
            }
         }

         while(this.A.s.c()) {
            this.a((vp)(new ain(this.h)));
         }

         while(this.A.t.c()) {
            this.h.as();
         }

         while(this.l() && this.A.u.c()) {
            this.a((vp)(new yf()));
         }

         if(this.l() && this.s == null && (Keyboard.isKeyDown(53) || Keyboard.isKeyDown(181))) {
            this.a((vp)(new yf("/")));
         }

         if(this.h.aj()) {
            if(!this.A.x.e) {
               this.c.c(this.h);
            }

            label320:
            while(true) {
               if(!this.A.w.c()) {
                  while(this.A.x.c()) {
                     ;
                  }

                  while(true) {
                     if(this.A.z.c()) {
                        continue;
                     }
                     break label320;
                  }
               }
            }
         } else {
            while(this.A.w.c()) {
               this.c(0);
            }

            while(this.A.x.c()) {
               this.c(1);
            }

            while(this.A.z.c()) {
               this.B();
            }
         }

         if(this.A.x.e && this.ae == 0 && !this.h.aj()) {
            this.c(1);
         }

         this.a(0, this.s == null && this.A.w.e && this.R);
      }

      if(this.f != null) {
         if(this.h != null) {
            ++this.al;
            if(this.al == 30) {
               this.al = 0;
               this.f.g(this.h);
            }
         }

         if(this.f.B().s()) {
            this.f.q = 3;
         } else {
            this.f.q = this.A.C;
         }

         if(this.f.F) {
            this.f.q = 1;
         }

         lv.c("gameRenderer");
         if(!this.o) {
            this.u.a();
         }

         lv.c("levelRenderer");
         if(!this.o) {
            this.g.d();
         }

         lv.c("level");
         if(!this.o) {
            if(this.f.n > 0) {
               --this.f.n;
            }

            this.f.n();
         }

         if(!this.o || this.l()) {
            this.f.a(this.f.q > 0, true);
            this.f.c();
         }

         lv.c("animateTick");
         if(!this.o && this.f != null) {
            this.f.v(gk.c(this.h.o), gk.c(this.h.p), gk.c(this.h.q));
         }

         lv.c("particles");
         if(!this.o) {
            this.j.a();
         }
      }

      lv.b();
      this.T = System.currentTimeMillis();
   }

   private void A() {
      System.out.println("FORCING RELOAD!");
      this.C = new sd();
      this.C.a(this.A);
      this.Y.a();
   }

   public boolean l() {
      return this.f != null && this.f.F;
   }

   public void a(String var1, String var2, fj var3) {
      this.a((xd)null);
      System.gc();
      if(this.ad.a(var1)) {
         this.b(var1, var2);
      } else {
         if(this.t != null) {
            this.t.a(cy.a("menu.switchingLevel"));
            this.t.d("");
         }

         akp var4 = this.ad.a(var1, false);
         xd var5 = null;
         var5 = new xd(var4, var2, var3);
         if(var5.s) {
            this.K.a(gv.g, 1);
            this.K.a(gv.f, 1);
            this.a(var5, cy.a("menu.generatingLevel"));
         } else {
            this.K.a(gv.h, 1);
            this.K.a(gv.f, 1);
            this.a(var5, cy.a("menu.loadingLevel"));
         }
      }

   }

   public void a(int var1) {
      int var2 = this.h.aB;
      this.h.aB = var1;
      this.f.b((nn)this.h);
      this.h.G = false;
      double var3 = this.h.o;
      double var5 = this.h.q;
      double var7 = 1.0D;
      if(var2 > -1 && this.h.aB == -1) {
         var7 = 0.125D;
      } else if(var2 == -1 && this.h.aB > -1) {
         var7 = 8.0D;
      }

      var3 *= var7;
      var5 *= var7;
      xd var9;
      if(this.h.aB == -1) {
         this.h.c(var3, this.h.p, var5, this.h.u, this.h.v);
         if(this.h.M()) {
            this.f.a((nn)this.h, false);
         }

         var9 = null;
         var9 = new xd(this.f, alb.a(this.h.aB));
         this.a(var9, "Entering the Nether", (yw)this.h);
      } else if(this.h.aB == 0) {
         if(this.h.M()) {
            this.h.c(var3, this.h.p, var5, this.h.u, this.h.v);
            this.f.a((nn)this.h, false);
         }

         var9 = null;
         var9 = new xd(this.f, alb.a(this.h.aB));
         if(var2 == -1) {
            this.a(var9, "Leaving the Nether", (yw)this.h);
         } else {
            this.a(var9, "Leaving the End", (yw)this.h);
         }
      } else {
         var9 = null;
         var9 = new xd(this.f, alb.a(this.h.aB));
         uh var10 = var9.k();
         var3 = (double)var10.a;
         this.h.p = (double)var10.b;
         var5 = (double)var10.c;
         this.h.c(var3, this.h.p, var5, 90.0F, 0.0F);
         if(this.h.M()) {
            var9.a((nn)this.h, false);
         }

         this.a(var9, "Entering the End", (yw)this.h);
      }

      this.h.k = this.f;
      System.out.println("Teleported to " + this.f.t.g);
      if(this.h.M() && var2 < 1) {
         this.h.c(var3, this.h.p, var5, this.h.u, this.h.v);
         this.f.a((nn)this.h, false);
         (new ox()).a(this.f, this.h);
      }

   }

   public void b(String var1) {
      this.f = null;
      this.a((xd)null, var1);
   }

   public void a(xd var1) {
      this.a(var1, "");
   }

   public void a(xd var1, String var2) {
      this.a(var1, var2, (yw)null);
   }

   public void a(xd var1, String var2, yw var3) {
      this.K.b();
      this.K.c();
      this.i = null;
      if(this.t != null) {
         this.t.a(var2);
         this.t.d("");
      }

      this.C.a((String)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      if(this.f != null) {
         this.f.a((rw)this.t);
      }

      this.f = var1;
      if(var1 != null) {
         if(this.c != null) {
            this.c.a(var1);
         }

         if(!this.l()) {
            if(var3 == null) {
               this.h = (vq)var1.a(vq.class);
            }
         } else if(this.h != null) {
            this.h.z();
            if(var1 != null) {
               var1.a((nn)this.h);
            }
         }

         if(!var1.F) {
            this.e(var2);
         }

         if(this.h == null) {
            this.h = (vq)this.c.b(var1);
            this.h.z();
            this.c.a((yw)this.h);
         }

         this.h.a = new ij(this.A);
         if(this.g != null) {
            this.g.a(var1);
         }

         if(this.j != null) {
            this.j.a(var1);
         }

         if(var3 != null) {
            var1.l();
         }

         ca var4 = var1.z();
         if(var4 instanceof hy) {
            hy var5 = (hy)var4;
            int var6 = gk.d((float)((int)this.h.o)) >> 4;
            int var7 = gk.d((float)((int)this.h.q)) >> 4;
            var5.d(var6, var7);
         }

         var1.a((yw)this.h);
         this.c.b((yw)this.h);
         if(var1.s) {
            var1.a((rw)this.t);
         }

         this.i = this.h;
      } else {
         this.ad.d();
         this.h = null;
      }

      System.gc();
      this.T = 0L;
   }

   private void b(String var1, String var2) {
      this.t.a("Converting World to " + this.ad.a());
      this.t.d("This may take a while :)");
      this.ad.a(var1, (rw)this.t);
      this.a(var1, var2, new fj(0L, 0, true, false, vx.b));
   }

   private void e(String var1) {
      if(this.t != null) {
         this.t.a(var1);
         this.t.d(cy.a("menu.generatingTerrain"));
      }

      short var2 = 128;
      if(this.c.e()) {
         var2 = 64;
      }

      int var3 = 0;
      int var4 = var2 * 2 / 16 + 1;
      var4 *= var4;
      ca var5 = this.f.z();
      uh var6 = this.f.x();
      if(this.h != null) {
         var6.a = (int)this.h.o;
         var6.c = (int)this.h.q;
      }

      if(var5 instanceof hy) {
         hy var7 = (hy)var5;
         var7.d(var6.a >> 4, var6.c >> 4);
      }

      for(int var10 = -var2; var10 <= var2; var10 += 16) {
         for(int var8 = -var2; var8 <= var2; var8 += 16) {
            if(this.t != null) {
               this.t.a(var3++ * 100 / var4);
            }

            this.f.a(var6.a + var10, 64, var6.c + var8);
            if(!this.c.e()) {
               while(true) {
                  if(this.f.H()) {
                     continue;
                  }
               }
            }
         }
      }

      if(!this.c.e()) {
         if(this.t != null) {
            this.t.d(cy.a("menu.simulating"));
         }

         boolean var9 = true;
         this.f.t();
      }

   }

   public void a(String var1, File var2) {
      int var3 = var1.indexOf("/");
      String var4 = var1.substring(0, var3);
      var1 = var1.substring(var3 + 1);
      if(var4.equalsIgnoreCase("sound")) {
         this.C.a(var1, var2);
      } else if(var4.equalsIgnoreCase("newsound")) {
         this.C.a(var1, var2);
      } else if(var4.equalsIgnoreCase("streaming")) {
         this.C.b(var1, var2);
      } else if(var4.equalsIgnoreCase("music")) {
         this.C.c(var1, var2);
      } else if(var4.equalsIgnoreCase("newmusic")) {
         this.C.c(var1, var2);
      }

   }

   public String m() {
      return this.g.b();
   }

   public String n() {
      return this.g.c();
   }

   public String o() {
      return this.f.p();
   }

   public String p() {
      return "P: " + this.j.b() + ". T: " + this.f.o();
   }

   public void a(boolean var1, int var2, boolean var3) {
      if(!this.f.F && !this.f.t.d()) {
         this.a(0);
      }

      uh var4 = null;
      uh var5 = null;
      boolean var6 = true;
      if(this.h != null && !var1) {
         var4 = this.h.aC();
         if(var4 != null) {
            var5 = yw.a(this.f, var4);
            if(var5 == null) {
               this.h.b("tile.bed.notValid");
            }
         }
      }

      if(var5 == null) {
         var5 = this.f.x();
         var6 = false;
      }

      ca var7 = this.f.z();
      if(var7 instanceof hy) {
         hy var8 = (hy)var7;
         var8.d(var5.a >> 4, var5.c >> 4);
      }

      this.f.e();
      this.f.y();
      int var10 = 0;
      if(this.h != null) {
         var10 = this.h.f;
         this.f.b((nn)this.h);
      }

      vq var9 = this.h;
      this.i = null;
      this.h = (vq)this.c.b(this.f);
      if(var3) {
         this.h.d(var9);
      }

      this.h.aB = var2;
      this.i = this.h;
      this.h.z();
      if(var6) {
         this.h.a(var4);
         this.h.c((double)((float)var5.a + 0.5F), (double)((float)var5.b + 0.1F), (double)((float)var5.c + 0.5F), 0.0F, 0.0F);
      }

      this.c.a((yw)this.h);
      this.f.a((yw)this.h);
      this.h.a = new ij(this.A);
      this.h.f = var10;
      this.h.ab();
      this.c.b((yw)this.h);
      this.e(cy.a("menu.respawning"));
      if(this.s instanceof uy) {
         this.a((vp)null);
      }

   }

   public static void a(String var0, String var1) {
      a(var0, var1, (String)null);
   }

   public static void a(String var0, String var1, String var2) {
      boolean var3 = false;
      Frame var5 = new Frame("Minecraft");
      Canvas var6 = new Canvas();
      var5.setLayout(new BorderLayout());
      var5.add(var6, "Center");
      var6.setPreferredSize(new Dimension(854, 480));
      var5.pack();
      var5.setLocationRelativeTo((Component)null);
      hq var7 = new hq(var5, var6, (MinecraftApplet)null, 854, 480, var3, var5);
      Thread var8 = new Thread(var7, "Minecraft main thread");
      var8.setPriority(10);
      var7.l = "www.minecraft.net";
      if(var0 != null && var1 != null) {
         var7.k = new fc(var0, var1);
      } else {
         var7.k = new fc("Player" + System.currentTimeMillis() % 1000L, "");
      }

      if(var2 != null) {
         String[] var9 = var2.split(":");
         var7.a(var9[0], Integer.parseInt(var9[1]));
      }

      var5.setVisible(true);
      var5.addWindowListener(new hl(var7, var8));
      var8.start();
   }

   public adl q() {
      return this.h instanceof ahv?((ahv)this.h).cl:null;
   }

   public static void main(String[] var0) {
      String var1 = null;
      String var2 = null;
      var1 = "Player" + System.currentTimeMillis() % 1000L;
      if(var0.length > 0) {
         var1 = var0[0];
      }

      var2 = "-";
      if(var0.length > 1) {
         var2 = var0[1];
      }

      a(var1, var2);
   }

   public static boolean r() {
      return a == null || !a.A.D;
   }

   public static boolean s() {
      return a != null && a.A.j;
   }

   public static boolean t() {
      return a != null && a.A.k;
   }

   public static boolean u() {
      return a != null && a.A.F;
   }

   public boolean c(String var1) {
      if(var1.startsWith("/")) {
         ;
      }

      return false;
   }

   private void B() {
      if(this.z != null) {
         boolean var1 = this.h.aT.d;
         int var2 = this.f.a(this.z.b, this.z.c, this.z.d);
         if(!var1) {
            if(var2 == pb.u.bO) {
               var2 = pb.v.bO;
            }

            if(var2 == pb.aj.bO) {
               var2 = pb.ak.bO;
            }

            if(var2 == pb.z.bO) {
               var2 = pb.t.bO;
            }
         }

         int var3 = 0;
         boolean var4 = false;
         if(yr.e[var2] != null && yr.e[var2].g()) {
            var3 = this.f.e(this.z.b, this.z.c, this.z.d);
            var4 = true;
         }

         if(yr.e[var2] != null && yr.e[var2] instanceof vd) {
            pb var5 = pb.m[var2];
            int var6 = var5.a(var3, this.h.k.r, 0);
            if(var6 > 0) {
               var2 = var6;
            }
         }

         this.h.ap.a(var2, var3, var4, var1);
         if(var1) {
            int var7 = this.h.aq.e.size() - 9 + this.h.ap.c;
            this.c.a(this.h.ap.k_(this.h.ap.c), var7);
         }
      }

   }

   public static String C() {
      return "1.2.5";
   }

   public static void D() {
      vt var0 = new vt("client");
      var0.a("version", C());
      var0.a("os_name", System.getProperty("os.name"));
      var0.a("os_version", System.getProperty("os.version"));
      var0.a("os_architecture", System.getProperty("os.arch"));
      var0.a("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
      var0.a("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
      var0.a("java_version", System.getProperty("java.version"));
      var0.a("opengl_version", GL11.glGetString(7938));
      var0.a("opengl_vendor", GL11.glGetString(7936));
      var0.a();
   }

}
