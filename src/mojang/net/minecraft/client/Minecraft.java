package mojang.net.minecraft.client;

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

import mojang.*;
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
   private static Minecraft minecraftInstance;
   public ki c;
   private boolean fullscreen = false;
   private boolean V = false;
   public int width;
   public int height;
   private vm W;
   private aft X = new aft(20.0F);
   public World f;
   public l g;
   public vq h;
   public Mob i;
   public cw j;
   public CredentialManager credentials = null;
   public String host;
   public Canvas canvas;
   public boolean appletMode = false;
   public volatile boolean _running = false;
   public TextureManager textureManager;
   public nl q;
   public nl r;
   public GUIManager guiManager = null;
   public GUIBackground guiBackground;
   public lr u;
   private ck Y;
   private int Z = 0;
   private int aa = 0;
   private int windowWidth;
   private int windowHeight;
   public qd v = new qd(this);
   public aiy w;
   public boolean x = false;
   public xg y = new xg(0.0F);
   public pl z = null;
   public OptionParser options;
   protected MinecraftApplet _minecraftApplet;
   public SoundManager soundManager = new SoundManager();
   public aka D;
   public TexturePackManager texturePackManager;
   public File gameDirectory;
   private SaveFileManager saveFileManager;
   //private SaveFileInterface saveFileManager;
   //private kb saves;
   public static long[] G = new long[512];
   public static long[] H = new long[512];
   public static int I = 0;
   public static long J = 0L;
   private int ae = 0;
   public alf K;
   private String hostname;
   private int port;
   private qa ah = new qa();
   private bv ai = new bv();
   private static File gameDir = null;
   public volatile boolean running = true;
   public String M = "";
   long lastTime = System.currentTimeMillis();
   int O = 0;
   boolean P = false;
   long Q = -1L;
   private String ak = "root";
   public boolean R = false;
   public boolean S = false;
   long T = System.currentTimeMillis();
   private int al = 0;


   public Minecraft(Component var1, Canvas canvas, MinecraftApplet applet, int width, int height, boolean isFullscreen) {
      gv.a();
      this.windowWidth = width;
      this.windowHeight = height;
      this._minecraftApplet = applet;
      afd.b = 32767;
      new TimerHackThread(this, "Timer hack thread");
      this.canvas = canvas;
      this.width = width;
      this.height = height;
      this.fullscreen = isFullscreen;

      if(applet == null || "true".equals(applet.getParameter("stand-alone"))) {
         this.appletMode = false;
      }

      minecraftInstance = this;
   }

   public void b(StopGameException exception) {
      this.V = true;
      this.throwStopGameException(exception);
   }

   public abstract void throwStopGameException(StopGameException exception);

   public void setServer(String host, int port) {
      this.hostname = host;
      this.port = port;
   }

   public void init() {
      try {

         // Initialize graphics, either applet mode or native lwjgl window
         if (this.canvas != null) {
            Graphics canvasGraphics = this.canvas.getGraphics();
            if (canvasGraphics != null) {
               canvasGraphics.setColor(Color.BLACK);
               canvasGraphics.fillRect(0, 0, this.width, this.height);
               canvasGraphics.dispose();
            }

            Display.setParent(this.canvas);
         } else if (this.fullscreen) {
            Display.setFullscreen(true);
            this.width = Display.getDisplayMode().getWidth();
            this.height = Display.getDisplayMode().getHeight();
            if (this.width <= 0) {
               this.width = 1;
            }

            if (this.height <= 0) {
               this.height = 1;
            }
         } else {
            Display.setDisplayMode(new DisplayMode(this.width, this.height));
         }

         Display.setTitle("Minecraft Minecraft 1.2.5");
         System.out.println("LWJGL Version: " + Sys.getVersion());

         try {
            PixelFormat pixelFormat = new PixelFormat();
            pixelFormat = pixelFormat.withDepthBits(24);
            Display.create(pixelFormat);

         } catch (LWJGLException lwjglException) {
            lwjglException.printStackTrace();

            try {
               Thread.sleep(1000L);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }

            Display.create();
         }

         ARBTextureHelper.init();
         this.gameDirectory = getGameDirectory();
         this.saveFileManager = new SaveFileManager(new File(this.gameDirectory, "saves"));
         this.options = new OptionParser(this, this.gameDirectory);

         this.texturePackManager = new TexturePackManager(this, this.gameDirectory);
         this.textureManager = new TextureManager(this.texturePackManager, this.options);
         this.v();
         this.q = new nl(this.options, "/mojang/font/default.png", this.textureManager, false);
         this.r = new nl(this.options, "/mojang/font/alternate.png", this.textureManager, false);
         if (this.options.lang != null) {
            LocalizationManager.getInstance().changeLocale(this.options.lang);
            this.q.a(LocalizationManager.getInstance().d());
            this.q.b(LocalizationManager.isSaudiArabicOrHebrew(this.options.lang));
         }

         zt.a(this.textureManager.a("/mojang/misc/watercolor.png"));
         zv.a(this.textureManager.a("/mojang/misc/grasscolor.png"));
         gu.a(this.textureManager.a("/mojang/misc/foliagecolor.png"));
         this.u = new lr(this);
         ahu.a.f = new mn(this);
         this.K = new alf(this.credentials, this.gameDirectory);
         dp.f.a(new hk(this));
         this.v();
         Mouse.create();
         this.D = new aka(this.canvas);

         try {
            Controllers.create();
         } catch (Exception var4) {
            var4.printStackTrace();
         }

         sendGameReport();
         this.checkGLError("Pre startup");
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
         this.checkGLError("Startup");
         this.W = new vm();
         this.soundManager.a(this.options);
         this.textureManager.a((tt) this.ai);
         this.textureManager.a((tt) this.ah);
         this.textureManager.a((tt) (new zp()));
         this.textureManager.a((tt) (new tu(this)));
         this.textureManager.a((tt) (new ht(this)));
         this.textureManager.a((tt) (new ael()));
         this.textureManager.a((tt) (new gf()));
         this.textureManager.a((tt) (new nh(0)));
         this.textureManager.a((tt) (new nh(1)));
         this.g = new l(this, this.textureManager);
         GL11.glViewport(0, 0, this.width, this.height);
         this.j = new cw(this.f, this.textureManager);

         try {
            this.Y = new ck(this.gameDirectory, this);
            this.Y.start();
         } catch (Exception var3) {
            ;
         }

         this.checkGLError("Post startup");
         this.w = new aiy(this);
         if (this.hostname != null) {
            this.addMenu((GUIManager) (new ajy(this, this.hostname, this.port)));
         } else {
            this.addMenu((GUIManager) (new xt()));
         }

         this.guiBackground = new GUIBackground(this);
      } catch (LWJGLException e) {
         e.printStackTrace();
      }
   }

   private void v() {
      WindowScaler var1 = new WindowScaler(this.options, this.width, this.height);
      GL11.glClear(16640);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, var1.widthScaled, var1.heightScaled, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glViewport(0, 0, this.width, this.height);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      Tessalator var2 = Tessalator.tessalatorInstance;
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glDisable(2912);
      GL11.glBindTexture(3553, this.textureManager.readImageFromLocation("/mojang/title/mojang.png"));
      var2.b();
      var2.c(16777215);
      var2.a(0.0D, (double)this.height, 0.0D, 0.0D, 0.0D);
      var2.a((double)this.width, (double)this.height, 0.0D, 0.0D, 0.0D);
      var2.a((double)this.width, 0.0D, 0.0D, 0.0D, 0.0D);
      var2.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      var2.a();
      short var3 = 256;
      short var4 = 256;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var2.c(16777215);
      this.a((var1.getWidth() - var3) / 2, (var1.getHeight() - var4) / 2, 0, 0, var3, var4);
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      try {
         Display.swapBuffers();
      } catch (LWJGLException lwjglException) {
         lwjglException.printStackTrace();
      }
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      Tessalator var9 = Tessalator.tessalatorInstance;
      var9.b();
      var9.a((double)(var1 + 0), (double)(var2 + var6), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + var6), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + 0), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.a((double)(var1 + 0), (double)(var2 + 0), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.a();
   }

   public static File getGameDirectory() {
      if(gameDir == null) {
         gameDir = createGameDirectory("minecraft");
      }

      return gameDir;
   }

   public static File createGameDirectory(String gameDirectoryName) {
      String homeDirectory = System.getProperty("user.home", ".");
      File gameDir;
      switch(OSTypesID.OSIDS[getOS().ordinal()]) {
         case 1:
         case 2:
            gameDir = new File(homeDirectory, '.' + gameDirectoryName + '/');
            break;
         case 3:
            String var3 = System.getenv("APPDATA");
            if(var3 != null) {
               gameDir = new File(var3, "." + gameDirectoryName + '/');
            } else {
               gameDir = new File(homeDirectory, '.' + gameDirectoryName + '/');
            }
            break;
         case 4:
            gameDir = new File(homeDirectory, "Library/Application Support/" + gameDirectoryName);
            break;
         default:
            gameDir = new File(homeDirectory, gameDirectoryName + '/');
         }

         if(!gameDir.exists() && !gameDir.mkdirs()) {
            throw new RuntimeException("The working directory could not be created: " + gameDir);
         } else {
            return gameDir;
      }
   }

   private static OSTypes getOS() {
      String osName = System.getProperty("os.name").toLowerCase();
      return osName.contains("win") ? OSTypes.WINDOWS : (osName.contains("mac") ? OSTypes.MACOS :(osName.contains("solaris")? OSTypes.SOLARIS :(osName.contains("sunos")? OSTypes.SOLARIS :(osName.contains("linux")? OSTypes.LINUX :(osName.contains("unix")? OSTypes.LINUX : OSTypes.UNKOWN)))));
   }

   public SaveFileInterface getSaveFileManager() {
      return this.saveFileManager;
   }

   public void addMenu(GUIManager guiManager) {
      if(!(this.guiManager instanceof uw)) {
         if(this.guiManager != null) {
            this.guiManager.e();
         }

         if(guiManager instanceof xt) {
            this.K.b();
         }

         this.K.c();
         if(guiManager == null && this.f == null) {
            guiManager = new xt();
         } else if(guiManager == null && this.h.bb() <= 0) {
            guiManager = new uy();
         }

         if(guiManager instanceof xt) {
            this.options.F = false;
            this.w.b();
         }

         this.guiManager = (GUIManager)guiManager;
         if(guiManager != null) {
            this.h();
            WindowScaler var2 = new WindowScaler(this.options, this.width, this.height);
            int var3 = var2.getWidth();
            int var4 = var2.getHeight();
            ((GUIManager)guiManager).a(this, var3, var4);
            this.x = false;
         } else {
            this.g();
         }

      }
   }

   private void checkGLError(String stage) {
      int errorCode = GL11.glGetError();
      if(errorCode != 0) {
         String errorString = GLU.gluErrorString(errorCode);
         System.out.println("########## GL ERROR ##########");
         System.out.println("@ " + stage);
         System.out.println(errorCode + ": " + errorString);
      }

   }

   public void d() {
      try {
         this.K.b();
         this.K.c();
         if(this._minecraftApplet != null) {
            this._minecraftApplet.c();
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
            this.a((World)null);
         } catch (Throwable var8) {
            ;
         }

         try {
            BufferManager.clearTextureLists();
         } catch (Throwable var7) {
            ;
         }

         this.soundManager.cleanup();
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
      this.running = true;

      try {
         this.init();
      } catch (Exception var11) {
         var11.printStackTrace();
         this.b(new StopGameException("Failed to start game", var11));
         return;
      }

      try {
         while(this.running) {
            try {
               this.x();
            } catch (MinecraftRuntimeException var9) {
               this.f = null;
               this.a((World)null);
               this.addMenu((GUIManager)(new afx()));
            } catch (OutOfMemoryError var10) {
               this.e();
               this.addMenu((GUIManager)(new ti()));
               System.gc();
            }
         }
      } catch (MinecraftError var12) {
         ;
      } catch (Throwable var13) {
         this.e();
         var13.printStackTrace();
         this.b(new StopGameException("Unexpected error", var13));
      } finally {
         this.d();
      }

   }

   private void x() {
      if(this._minecraftApplet != null && !this._minecraftApplet.isActive()) {
         this.running = false;
      } else {
         wu.b();
         bo.b();
         lv.a("root");
         if(this.canvas == null && Display.isCloseRequested()) {
            this.stop();
         }

         if(this._running && this.f != null) {
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
            } catch (MinecraftRuntimeException var5) {
               this.f = null;
               this.a((World)null);
               this.addMenu((GUIManager)(new afx()));
            }
         }

         lv.b();
         long var7 = System.nanoTime() - var6;
         this.checkGLError("Pre render");
         vl.b = this.options.fancyGraphics;
         lv.a("sound");
         this.soundManager.a(this.h, this.X.c);
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
            this.options.E = 0;
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
         if(!Display.isActive() && this.fullscreen) {
            this.toggleFullscreen();
         }

         lv.b();
         if(this.options.F && this.options.G) {
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
         if(this.canvas != null && !this.fullscreen && (this.canvas.getWidth() != this.width || this.canvas.getHeight() != this.height)) {
            this.width = this.canvas.getWidth();
            this.height = this.canvas.getHeight();
            if(this.width <= 0) {
               this.width = 1;
            }

            if(this.height <= 0) {
               this.height = 1;
            }

            this.a(this.width, this.height);
         }

         this.checkGLError("Post render");
         ++this.O;

         for(this._running = !this.l() && this.guiManager != null && this.guiManager.b(); System.currentTimeMillis() >= this.lastTime + 1000L; this.O = 0) {
            this.M = this.O + " fps, " + ct.b + " chunk updates";
            ct.b = 0;
            this.lastTime += 1000L;
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
         this.a((World)null);
      } catch (Throwable var2) {
         ;
      }

      System.gc();
   }

   private void y() {
      if(Keyboard.isKeyDown(60)) {
         if(!this.P) {
            this.P = true;
            this.w.a(zh.a(gameDir, this.width, this.height));
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
      GL11.glOrtho(0.0D, (double)this.width, (double)this.height, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      Tessalator var9 = Tessalator.tessalatorInstance;
      var9.a(7);
      int var10 = (int)(var5 / 200000L);
      var9.c(536870912);
      var9.a(0.0D, (double)(this.height - var10), 0.0D);
      var9.a(0.0D, (double)this.height, 0.0D);
      var9.a((double)G.length, (double)this.height, 0.0D);
      var9.a((double)G.length, (double)(this.height - var10), 0.0D);
      var9.c(538968064);
      var9.a(0.0D, (double)(this.height - var10 * 2), 0.0D);
      var9.a(0.0D, (double)(this.height - var10), 0.0D);
      var9.a((double)G.length, (double)(this.height - var10), 0.0D);
      var9.a((double)G.length, (double)(this.height - var10 * 2), 0.0D);
      var9.a();
      long var11 = 0L;

      int var13;
      for(var13 = 0; var13 < G.length; ++var13) {
         var11 += G[var13];
      }

      var13 = (int)(var11 / 200000L / (long)G.length);
      var9.a(7);
      var9.c(541065216);
      var9.a(0.0D, (double)(this.height - var13), 0.0D);
      var9.a(0.0D, (double)this.height, 0.0D);
      var9.a((double)G.length, (double)this.height, 0.0D);
      var9.a((double)G.length, (double)(this.height - var13), 0.0D);
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
         var9.a((double)((float)var14 + 0.5F), (double)((float)((long)this.height - var18) + 0.5F), 0.0D);
         var9.a((double)((float)var14 + 0.5F), (double)((float)this.height + 0.5F), 0.0D);
         var9.c(-16777216 + var16 * 65536 + var16 * 256 + var16 * 1);
         var9.a((double)((float)var14 + 0.5F), (double)((float)((long)this.height - var18) + 0.5F), 0.0D);
         var9.a((double)((float)var14 + 0.5F), (double)((float)((long)this.height - (var18 - var20)) + 0.5F), 0.0D);
      }

      var9.a();
      short var26 = 160;
      var15 = this.width - var26 - 10;
      var16 = this.height - var26 * 2;
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
         var21 = Utils.c(var29.a / 4.0D) + 1;
         var9.a(6);
         var9.c(var29.a());
         var9.a((double)var15, (double)var16, 0.0D);

         int var22;
         float var23;
         float var24;
         float var25;
         for(var22 = var21; var22 >= 0; --var22) {
            var23 = (float)((var27 + var29.a * (double)var22 / (double)var21) * 3.1415927410125732D * 2.0D / 100.0D);
            var24 = Utils.sin(var23) * (float)var26;
            var25 = Utils.cos(var23) * (float)var26 * 0.5F;
            var9.a((double)((float)var15 + var24), (double)((float)var16 - var25), 0.0D);
         }

         var9.a();
         var9.a(5);
         var9.c((var29.a() & 16711422) >> 1);

         for(var22 = var21; var22 >= 0; --var22) {
            var23 = (float)((var27 + var29.a * (double)var22 / (double)var21) * 3.1415927410125732D * 2.0D / 100.0D);
            var24 = Utils.sin(var23) * (float)var26;
            var25 = Utils.cos(var23) * (float)var26 * 0.5F;
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

   public void stop() {
      this.running = false;
   }

   public void g() {
      if(Display.isActive()) {
         if(!this.R) {
            this.R = true;
            this.D.a();
            this.addMenu((GUIManager)null);
            this.aa = 10000;
         }
      }
   }

   public void h() {
      if(this.R) {
         InputKey.a();
         this.R = false;
         this.D.b();
      }
   }

   public void i() {
      if(this.guiManager == null) {
         this.addMenu((GUIManager)(new lb()));
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

   public void toggleFullscreen() {
      try {
         this.fullscreen = !this.fullscreen;
         if(this.fullscreen) {
            Display.setDisplayMode(Display.getDesktopDisplayMode());
            this.width = Display.getDisplayMode().getWidth();
            this.height = Display.getDisplayMode().getHeight();
            if(this.width <= 0) {
               this.width = 1;
            }

            if(this.height <= 0) {
               this.height = 1;
            }
         } else {
            if(this.canvas != null) {
               this.width = this.canvas.getWidth();
               this.height = this.canvas.getHeight();
            } else {
               this.width = this.windowWidth;
               this.height = this.windowHeight;
            }

            if(this.width <= 0) {
               this.width = 1;
            }

            if(this.height <= 0) {
               this.height = 1;
            }
         }

         if(this.guiManager != null) {
            this.a(this.width, this.height);
         }

         Display.setFullscreen(this.fullscreen);
         Display.update();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void a(int width, int height) {
      if(width <= 0) {
         width = 1;
      }

      if(height <= 0) {
         height = 1;
      }

      this.width = width;
      this.height = height;
      if(this.guiManager != null) {
         WindowScaler scaler = new WindowScaler(this.options, width, height);
         this.guiManager.a(this, scaler.getWidth(), scaler.getHeight());
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
      lv.c("mojang/gui");
      if(!this._running) {
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
            var3 = Utils.d((float)((int)this.h.o)) >> 4;
            int var4 = Utils.d((float)((int)this.h.q)) >> 4;
            var2.d(var3, var4);
         }
      }

      lv.c("gameMode");
      if(!this._running && this.f != null) {
         this.c.c();
      }

      GL11.glBindTexture(3553, this.textureManager.readImageFromLocation("/mojang/terrain.png"));
      lv.c("textures");
      if(!this._running) {
         this.textureManager.a();
      }

      if(this.guiManager == null && this.h != null) {
         if(this.h.bb() <= 0) {
            this.addMenu((GUIManager)null);
         } else if(this.h.az() && this.f != null && this.f.F) {
            this.addMenu((GUIManager)(new yj()));
         }
      } else if(this.guiManager != null && this.guiManager instanceof yj && !this.h.az()) {
         this.addMenu((GUIManager)null);
      }

      if(this.guiManager != null) {
         this.aa = 10000;
      }

      if(this.guiManager != null) {
         this.guiManager.i();
         if(this.guiManager != null) {
            this.guiManager.v.a();
            this.guiManager.a();
         }
      }

      if(this.guiManager == null || this.guiManager.t) {
         lv.c("mouse");

         while(Mouse.next()) {
            InputKey.a(Mouse.getEventButton() - 100, Mouse.getEventButtonState());
            if(Mouse.getEventButtonState()) {
               InputKey.a(Mouse.getEventButton() - 100);
            }

            long var5 = System.currentTimeMillis() - this.T;
            if(var5 <= 200L) {
               var3 = Mouse.getEventDWheel();
               if(var3 != 0) {
                  this.h.ap.c(var3);
                  if(this.options.I) {
                     if(var3 > 0) {
                        var3 = 1;
                     }

                     if(var3 < 0) {
                        var3 = -1;
                     }

                     this.options.L += (float)var3 * 0.25F;
                  }
               }

               if(this.guiManager == null) {
                  if(!this.R && Mouse.getEventButtonState()) {
                     this.g();
                  }
               } else if(this.guiManager != null) {
                  this.guiManager.f();
               }
            }
         }

         if(this.aa > 0) {
            --this.aa;
         }

         lv.c("keyboard");

         while(Keyboard.next()) {
            InputKey.a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
            if(Keyboard.getEventKeyState()) {
               InputKey.a(Keyboard.getEventKey());
            }

            if(Keyboard.getEventKeyState()) {
               if(Keyboard.getEventKey() == 87) {
                  this.toggleFullscreen();
               } else {
                  if(this.guiManager != null) {
                     this.guiManager.j();
                  } else {
                     if(Keyboard.getEventKey() == 1) {
                        this.i();
                     }

                     if(Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61)) {
                        this.A();
                     }

                     if(Keyboard.getEventKey() == 20 && Keyboard.isKeyDown(61)) {
                        this.textureManager.b();
                     }

                     if(Keyboard.getEventKey() == 33 && Keyboard.isKeyDown(61)) {
                        boolean var6 = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
                        this.options.a(DefaultOptions.RENDER_DISTANCE, var6?-1:1);
                     }

                     if(Keyboard.getEventKey() == 30 && Keyboard.isKeyDown(61)) {
                        this.g.a();
                     }

                     if(Keyboard.getEventKey() == 59) {
                        this.options.D = !this.options.D;
                     }

                     if(Keyboard.getEventKey() == 61) {
                        this.options.F = !this.options.F;
                        this.options.G = !GUIManager.m();
                     }

                     if(Keyboard.getEventKey() == 63) {
                        ++this.options.E;
                        if(this.options.E > 2) {
                           this.options.E = 0;
                        }
                     }

                     if(Keyboard.getEventKey() == 66) {
                        this.options.J = !this.options.J;
                     }
                  }

                  int var7;
                  for(var7 = 0; var7 < 9; ++var7) {
                     if(Keyboard.getEventKey() == 2 + var7) {
                        this.h.ap.c = var7;
                     }
                  }

                  if(this.options.F && this.options.G) {
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

         while(this.options.key_inventory.c()) {
            this.addMenu((GUIManager)(new ain(this.h)));
         }

         while(this.options.key_drop.c()) {
            this.h.as();
         }

         while(this.l() && this.options.key_chat.c()) {
            this.addMenu((GUIManager)(new yf()));
         }

         if(this.l() && this.guiManager == null && (Keyboard.isKeyDown(53) || Keyboard.isKeyDown(181))) {
            this.addMenu((GUIManager)(new yf("/")));
         }

         if(this.h.aj()) {
            if(!this.options.key_use.e) {
               this.c.c(this.h);
            }

            label320:
            while(true) {
               if(!this.options.key_attack.c()) {
                  while(this.options.key_use.c()) {
                     ;
                  }

                  while(true) {
                     if(this.options.key_pick_item.c()) {
                        continue;
                     }
                     break label320;
                  }
               }
            }
         } else {
            while(this.options.key_attack.c()) {
               this.c(0);
            }

            while(this.options.key_use.c()) {
               this.c(1);
            }

            while(this.options.key_pick_item.c()) {
               this.B();
            }
         }

         if(this.options.key_use.e && this.ae == 0 && !this.h.aj()) {
            this.c(1);
         }

         this.a(0, this.guiManager == null && this.options.key_attack.e && this.R);
      }

      if(this.f != null) {
         if(this.h != null) {
            ++this.al;
            if(this.al == 30) {
               this.al = 0;
               this.f.g(this.h);
            }
         }

         if(this.f.B().isHardcore()) {
            this.f.q = 3;
         } else {
            this.f.q = this.options.gameDifficulty;
         }

         if(this.f.F) {
            this.f.q = 1;
         }

         lv.c("gameRenderer");
         if(!this._running) {
            this.u.a();
         }

         lv.c("levelRenderer");
         if(!this._running) {
            this.g.d();
         }

         lv.c("level");
         if(!this._running) {
            if(this.f.n > 0) {
               --this.f.n;
            }

            this.f.n();
         }

         if(!this._running || this.l()) {
            this.f.a(this.f.q > 0, true);
            this.f.c();
         }

         lv.c("animateTick");
         if(!this._running && this.f != null) {
            this.f.v(Utils.c(this.h.o), Utils.c(this.h.p), Utils.c(this.h.q));
         }

         lv.c("particles");
         if(!this._running) {
            this.j.a();
         }
      }

      lv.b();
      this.T = System.currentTimeMillis();
   }

   private void A() {
      System.out.println("FORCING RELOAD!");
      this.soundManager = new SoundManager();
      this.soundManager.a(this.options);
      this.Y.a();
   }

   public boolean l() {
      return this.f != null && this.f.F;
   }

   public void loadWorld(String worldLocation, String worldName, WorldStub stub) {
      this.a((World)null);
      System.gc();
      if(((SaveFileManager)this.saveFileManager).isWorldValid(worldLocation)) {
         this.convertWorld(worldLocation, worldName);
      } else {
         if(this.guiBackground != null) {
            this.guiBackground.switchBackgroundString(LocalizationManagerWrapper.getLocaleString("menu.switchingLevel"));
            this.guiBackground.changeSecondaryString("");
         }

         WorldFileInterface fileInterface = ((SaveFileManager)this.saveFileManager).getWorldFile(worldLocation, false);
         World world = new World(fileInterface, worldName, stub);
         if(world.s) {
            this.K.a(gv.g, 1);
            this.K.a(gv.f, 1);
            this.a(world, LocalizationManagerWrapper.getLocaleString("menu.generatingLevel"));
         } else {
            this.K.a(gv.h, 1);
            this.K.a(gv.f, 1);
            this.a(world, LocalizationManagerWrapper.getLocaleString("menu.loadingLevel"));
         }
      }

   }

   public void a(int var1) {
      int var2 = this.h.aB;
      this.h.aB = var1;
      this.f.b((BaseEntity)this.h);
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
      World var9;
      if(this.h.aB == -1) {
         this.h.c(var3, this.h.p, var5, this.h.u, this.h.v);
         if(this.h.M()) {
            this.f.a((BaseEntity)this.h, false);
         }

         var9 = null;
         var9 = new World(this.f, alb.a(this.h.aB));
         this.a(var9, "Entering the Nether", (Player)this.h);
      } else if(this.h.aB == 0) {
         if(this.h.M()) {
            this.h.c(var3, this.h.p, var5, this.h.u, this.h.v);
            this.f.a((BaseEntity)this.h, false);
         }

         var9 = null;
         var9 = new World(this.f, alb.a(this.h.aB));
         if(var2 == -1) {
            this.a(var9, "Leaving the Nether", (Player)this.h);
         } else {
            this.a(var9, "Leaving the End", (Player)this.h);
         }
      } else {
         var9 = null;
         var9 = new World(this.f, alb.a(this.h.aB));
         uh var10 = var9.k();
         var3 = (double)var10.a;
         this.h.p = (double)var10.b;
         var5 = (double)var10.c;
         this.h.c(var3, this.h.p, var5, 90.0F, 0.0F);
         if(this.h.M()) {
            var9.a((BaseEntity)this.h, false);
         }

         this.a(var9, "Entering the End", (Player)this.h);
      }

      this.h.k = this.f;
      System.out.println("Teleported to " + this.f.t.g);
      if(this.h.M() && var2 < 1) {
         this.h.c(var3, this.h.p, var5, this.h.u, this.h.v);
         this.f.a((BaseEntity)this.h, false);
         (new ox()).a(this.f, this.h);
      }

   }

   public void b(String var1) {
      this.f = null;
      this.a((World)null, var1);
   }

   public void a(World worldName) {
      this.a(worldName, "");
   }

   public void a(World worldName, String id) {
      this.a(worldName, id, (Player)null);
   }

   public void a(World worldName, String id, Player player) {
      this.K.b();
      this.K.c();
      this.i = null;
      if(this.guiBackground != null) {
         this.guiBackground.switchBackgroundString(id);
         this.guiBackground.changeSecondaryString("");
      }

      this.soundManager.a((String)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      if(this.f != null) {
         this.f.a((GUIBackgroundInterface)this.guiBackground);
      }

      this.f = worldName;
      if(worldName != null) {
         if(this.c != null) {
            this.c.a(worldName);
         }

         if(!this.l()) {
            if(player == null) {
               this.h = (vq)worldName.a(vq.class);
            }
         } else if(this.h != null) {
            this.h.z();
            if(worldName != null) {
               worldName.a((BaseEntity)this.h);
            }
         }

         if(!worldName.F) {
            this.e(id);
         }

         if(this.h == null) {
            this.h = (vq)this.c.b(worldName);
            this.h.z();
            this.c.a((Player)this.h);
         }

         this.h.a = new ij(this.options);
         if(this.g != null) {
            this.g.a(worldName);
         }

         if(this.j != null) {
            this.j.a(worldName);
         }

         if(player != null) {
            worldName.l();
         }

         ca var4 = worldName.z();
         if(var4 instanceof hy) {
            hy var5 = (hy)var4;
            int var6 = Utils.d((float)((int)this.h.o)) >> 4;
            int var7 = Utils.d((float)((int)this.h.q)) >> 4;
            var5.d(var6, var7);
         }

         worldName.a((Player)this.h);
         this.c.b((Player)this.h);
         if(worldName.s) {
            worldName.a((GUIBackgroundInterface)this.guiBackground);
         }

         this.i = this.h;
      } else {
         this.saveFileManager.d();
         this.h = null;
      }

      System.gc();
      this.T = 0L;
   }

   private void convertWorld(String var1, String var2) {
      this.guiBackground.switchBackgroundString("Converting World to " + this.saveFileManager.isOld());
      this.guiBackground.changeSecondaryString("This may take a while :)");
      this.saveFileManager.a(var1, (GUIBackgroundInterface)this.guiBackground);
      this.loadWorld(var1, var2, new WorldStub(0L, 0, true, false, WorldGeneratorTypes.defaultWorld));
   }

   private void e(String var1) {
      if(this.guiBackground != null) {
         this.guiBackground.switchBackgroundString(var1);
         this.guiBackground.changeSecondaryString(LocalizationManagerWrapper.getLocaleString("menu.generatingTerrain"));
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
            if(this.guiBackground != null) {
               this.guiBackground.createBackground(var3++ * 100 / var4);
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
         if(this.guiBackground != null) {
            this.guiBackground.changeSecondaryString(LocalizationManagerWrapper.getLocaleString("menu.simulating"));
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
         this.soundManager.a(var1, var2);
      } else if(var4.equalsIgnoreCase("newsound")) {
         this.soundManager.a(var1, var2);
      } else if(var4.equalsIgnoreCase("streaming")) {
         this.soundManager.b(var1, var2);
      } else if(var4.equalsIgnoreCase("music")) {
         this.soundManager.c(var1, var2);
      } else if(var4.equalsIgnoreCase("newmusic")) {
         this.soundManager.c(var1, var2);
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
            var5 = Player.a(this.f, var4);
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
         this.f.b((BaseEntity)this.h);
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

      this.c.a((Player)this.h);
      this.f.a((Player)this.h);
      this.h.a = new ij(this.options);
      this.h.f = var10;
      this.h.ab();
      this.c.b((Player)this.h);
      this.e(LocalizationManagerWrapper.getLocaleString("menu.respawning"));
      if(this.guiManager instanceof uy) {
         this.addMenu((GUIManager) null);
      }

   }

   public static void initServerlessFrame(String username, String sessionid) {
      initFrame(username, sessionid, null);
   }

   public static void initFrame(String username, String sessionid, String server) {
      boolean fullscreen = false;
      Frame gameFrame = new Frame("Minecraft");
      Canvas gameCanvas = new Canvas();
      gameFrame.setLayout(new BorderLayout());
      gameFrame.add(gameCanvas, "Center");
      gameCanvas.setPreferredSize(new Dimension(854, 480));
      gameFrame.pack();
      gameFrame.setLocationRelativeTo(null);
      MinecraftChildFrame minecraftChildFrame = new MinecraftChildFrame(gameFrame, gameCanvas, null, 854, 480, fullscreen, gameFrame);
      Thread mainThread = new Thread(minecraftChildFrame, "Minecraft main thread");
      mainThread.setPriority(10);
      minecraftChildFrame.host = "www.minecraft.net";

      if(username != null && sessionid != null) {
         minecraftChildFrame.credentials = new CredentialManager(username, sessionid);
      } else {
         minecraftChildFrame.credentials = new CredentialManager("Player" + System.currentTimeMillis() % 1000L, "");
      }

      if(server != null) {
         String[] serverParams = server.split(":");
         minecraftChildFrame.setServer(serverParams[0], Integer.parseInt(serverParams[1]));
      }

      gameFrame.setVisible(true);
      gameFrame.addWindowListener(new hl(minecraftChildFrame, mainThread));
      mainThread.start();
   }

   public adl q() {
      return this.h instanceof ahv ? ((ahv)this.h).cl:null;
   }

   public static void main(String[] args) {
      String username = "";
      String sessionid = "";
      username = "Player" + System.currentTimeMillis() % 1000L;
      if(args.length > 0) {
         username = args[0];
      }

      sessionid = "-";
      if(args.length > 1) {
         sessionid = args[1];
      }

      initServerlessFrame(username, sessionid);
   }

   public static boolean r() {
      return minecraftInstance == null || !minecraftInstance.options.D;
   }

   public static boolean getFancyGraphics() {
      return minecraftInstance != null && minecraftInstance.options.fancyGraphics;
   }

   public static boolean t() {
      return minecraftInstance != null && minecraftInstance.options.aoSetting;
   }

   public static boolean u() {
      return minecraftInstance != null && minecraftInstance.options.F;
   }

   public boolean startsWithSlash(String str) {
      return str.startsWith("/");
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

   public static String getVersion() {
      return "1.2.5";
   }

   public static void sendGameReport() {
      AppReport report = new AppReport("client");
      report.addValue("version", getVersion());
      report.addValue("os_name", System.getProperty("os.name"));
      report.addValue("os_version", System.getProperty("os.version"));
      report.addValue("os_architecture", System.getProperty("os.arch"));
      report.addValue("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
      report.addValue("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
      report.addValue("java_version", System.getProperty("java.version"));
      report.addValue("opengl_version", GL11.glGetString(7938));
      report.addValue("opengl_vendor", GL11.glGetString(7936));
      report.init();
   }

}
