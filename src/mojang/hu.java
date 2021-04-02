package mojang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class hu {

   private static final String[] S = new String[]{"options.renderDistance.far", "options.renderDistance.normal", "options.renderDistance.short", "options.renderDistance.tiny"};
   private static final String[] T = new String[]{"options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard"};
   private static final String[] U = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
   private static final String[] V = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
   private static final String[] W = new String[]{"performance.max", "performance.balanced", "performance.powersaver"};
   public float a = 1.0F;
   public float b = 1.0F;
   public float c = 0.5F;
   public boolean d = false;
   public int e = 0;
   public boolean f = true;
   public boolean g = false;
   public boolean h = false;
   public int i = 1;
   public boolean j = true;
   public boolean k = true;
   public boolean l = true;
   public String m = "Default";
   public afu n = new afu("key.forward", 17);
   public afu o = new afu("key.left", 30);
   public afu p = new afu("key.back", 31);
   public afu q = new afu("key.right", 32);
   public afu r = new afu("key.jump", 57);
   public afu s = new afu("key.inventory", 18);
   public afu t = new afu("key.drop", 16);
   public afu u = new afu("key.chat", 20);
   public afu v = new afu("key.sneak", 42);
   public afu w = new afu("key.attack", -100);
   public afu x = new afu("key.use", -99);
   public afu y = new afu("key.playerlist", 15);
   public afu z = new afu("key.pickItem", -98);
   public afu[] A;
   protected Minecraft B;
   private File X;
   public int C;
   public boolean D;
   public int E;
   public boolean F;
   public boolean G;
   public String H;
   public boolean I;
   public boolean J;
   public boolean K;
   public float L;
   public float M;
   public float N;
   public float O;
   public int P;
   public int Q;
   public String R;


   public hu(Minecraft var1, File var2) {
      this.A = new afu[]{this.w, this.x, this.n, this.o, this.p, this.q, this.r, this.v, this.t, this.s, this.u, this.y, this.z};
      this.C = 2;
      this.D = false;
      this.E = 0;
      this.F = false;
      this.G = false;
      this.H = "";
      this.I = false;
      this.J = false;
      this.K = false;
      this.L = 1.0F;
      this.M = 1.0F;
      this.N = 0.0F;
      this.O = 0.0F;
      this.P = 0;
      this.Q = 0;
      this.R = "en_US";
      this.B = var1;
      this.X = new File(var2, "options.txt");
      this.a();
   }

   public hu() {
      this.A = new afu[]{this.w, this.x, this.n, this.o, this.p, this.q, this.r, this.v, this.t, this.s, this.u, this.y, this.z};
      this.C = 2;
      this.D = false;
      this.E = 0;
      this.F = false;
      this.G = false;
      this.H = "";
      this.I = false;
      this.J = false;
      this.K = false;
      this.L = 1.0F;
      this.M = 1.0F;
      this.N = 0.0F;
      this.O = 0.0F;
      this.P = 0;
      this.Q = 0;
      this.R = "en_US";
   }

   public String a(int var1) {
      adn var2 = adn.a();
      return var2.b(this.A[var1].c);
   }

   public String b(int var1) {
      int var2 = this.A[var1].d;
      return c(var2);
   }

   public static String c(int var0) {
      return var0 < 0?cy.a("key.mouseButton", new Object[]{Integer.valueOf(var0 + 101)}):Keyboard.getKeyName(var0);
   }

   public void a(int var1, int var2) {
      this.A[var1].d = var2;
      this.b();
   }

   public void a(zq var1, float var2) {
      if(var1 == zq.a) {
         this.a = var2;
         this.B.C.a();
      }

      if(var1 == zq.b) {
         this.b = var2;
         this.B.C.a();
      }

      if(var1 == zq.d) {
         this.c = var2;
      }

      if(var1 == zq.e) {
         this.N = var2;
      }

      if(var1 == zq.f) {
         this.O = var2;
      }

   }

   public void a(zq var1, int var2) {
      if(var1 == zq.c) {
         this.d = !this.d;
      }

      if(var1 == zq.g) {
         this.e = this.e + var2 & 3;
      }

      if(var1 == zq.o) {
         this.P = this.P + var2 & 3;
      }

      if(var1 == zq.q) {
         this.Q = (this.Q + var2) % 3;
      }

      if(var1 == zq.h) {
         this.f = !this.f;
      }

      if(var1 == zq.p) {
         this.l = !this.l;
      }

      if(var1 == zq.j) {
         this.h = !this.h;
         this.B.g.a();
      }

      if(var1 == zq.i) {
         this.g = !this.g;
         this.B.p.b();
      }

      if(var1 == zq.k) {
         this.i = (this.i + var2 + 3) % 3;
      }

      if(var1 == zq.l) {
         this.C = this.C + var2 & 3;
      }

      if(var1 == zq.m) {
         this.j = !this.j;
         this.B.g.a();
      }

      if(var1 == zq.n) {
         this.k = !this.k;
         this.B.g.a();
      }

      this.b();
   }

   public float a(zq var1) {
      return var1 == zq.e?this.N:(var1 == zq.f?this.O:(var1 == zq.a?this.a:(var1 == zq.b?this.b:(var1 == zq.d?this.c:0.0F))));
   }

   public boolean b(zq var1) {
      switch(xp.a[var1.ordinal()]) {
      case 1:
         return this.d;
      case 2:
         return this.f;
      case 3:
         return this.g;
      case 4:
         return this.h;
      case 5:
         return this.k;
      case 6:
         return this.l;
      default:
         return false;
      }
   }

   private static String a(String[] var0, int var1) {
      if(var1 < 0 || var1 >= var0.length) {
         var1 = 0;
      }

      adn var2 = adn.a();
      return var2.b(var0[var1]);
   }

   public String c(zq var1) {
      adn var2 = adn.a();
      String var3 = var2.b(var1.d()) + ": ";
      if(var1.a()) {
         float var5 = this.a(var1);
         return var1 == zq.d?(var5 == 0.0F?var3 + var2.b("options.sensitivity.min"):(var5 == 1.0F?var3 + var2.b("options.sensitivity.max"):var3 + (int)(var5 * 200.0F) + "%")):(var1 == zq.e?(var5 == 0.0F?var3 + var2.b("options.fov.min"):(var5 == 1.0F?var3 + var2.b("options.fov.max"):var3 + (int)(70.0F + var5 * 40.0F))):(var1 == zq.f?(var5 == 0.0F?var3 + var2.b("options.gamma.min"):(var5 == 1.0F?var3 + var2.b("options.gamma.max"):var3 + "+" + (int)(var5 * 100.0F) + "%")):(var5 == 0.0F?var3 + var2.b("options.off"):var3 + (int)(var5 * 100.0F) + "%")));
      } else if(var1.b()) {
         boolean var4 = this.b(var1);
         return var4?var3 + var2.b("options.on"):var3 + var2.b("options.off");
      } else {
         return var1 == zq.g?var3 + a(S, this.e):(var1 == zq.l?var3 + a(T, this.C):(var1 == zq.o?var3 + a(U, this.P):(var1 == zq.q?var3 + a(V, this.Q):(var1 == zq.k?var3 + a(W, this.i):(var1 == zq.m?(this.j?var3 + var2.b("options.graphics.fancy"):var3 + var2.b("options.graphics.fast")):var3)))));
      }
   }

   public void a() {
      try {
         if(!this.X.exists()) {
            return;
         }

         BufferedReader var1 = new BufferedReader(new FileReader(this.X));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            try {
               String[] var3 = var2.split(":");
               if(var3[0].equals("music")) {
                  this.a = this.a(var3[1]);
               }

               if(var3[0].equals("sound")) {
                  this.b = this.a(var3[1]);
               }

               if(var3[0].equals("mouseSensitivity")) {
                  this.c = this.a(var3[1]);
               }

               if(var3[0].equals("fov")) {
                  this.N = this.a(var3[1]);
               }

               if(var3[0].equals("gamma")) {
                  this.O = this.a(var3[1]);
               }

               if(var3[0].equals("invertYMouse")) {
                  this.d = var3[1].equals("true");
               }

               if(var3[0].equals("viewDistance")) {
                  this.e = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("guiScale")) {
                  this.P = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("particles")) {
                  this.Q = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("bobView")) {
                  this.f = var3[1].equals("true");
               }

               if(var3[0].equals("anaglyph3d")) {
                  this.g = var3[1].equals("true");
               }

               if(var3[0].equals("advancedOpengl")) {
                  this.h = var3[1].equals("true");
               }

               if(var3[0].equals("fpsLimit")) {
                  this.i = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("difficulty")) {
                  this.C = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("fancyGraphics")) {
                  this.j = var3[1].equals("true");
               }

               if(var3[0].equals("ao")) {
                  this.k = var3[1].equals("true");
               }

               if(var3[0].equals("clouds")) {
                  this.l = var3[1].equals("true");
               }

               if(var3[0].equals("skin")) {
                  this.m = var3[1];
               }

               if(var3[0].equals("lastServer") && var3.length >= 2) {
                  this.H = var3[1];
               }

               if(var3[0].equals("mojang/lang") && var3.length >= 2) {
                  this.R = var3[1];
               }

               for(int var4 = 0; var4 < this.A.length; ++var4) {
                  if(var3[0].equals("key_" + this.A[var4].c)) {
                     this.A[var4].d = Integer.parseInt(var3[1]);
                  }
               }
            } catch (Exception var5) {
               System.out.println("Skipping bad option: " + var2);
            }
         }

         afu.b();
         var1.close();
      } catch (Exception var6) {
         System.out.println("Failed to load options");
         var6.printStackTrace();
      }

   }

   private float a(String var1) {
      return var1.equals("true")?1.0F:(var1.equals("false")?0.0F:Float.parseFloat(var1));
   }

   public void b() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.X));
         var1.println("music:" + this.a);
         var1.println("sound:" + this.b);
         var1.println("invertYMouse:" + this.d);
         var1.println("mouseSensitivity:" + this.c);
         var1.println("fov:" + this.N);
         var1.println("gamma:" + this.O);
         var1.println("viewDistance:" + this.e);
         var1.println("guiScale:" + this.P);
         var1.println("particles:" + this.Q);
         var1.println("bobView:" + this.f);
         var1.println("anaglyph3d:" + this.g);
         var1.println("advancedOpengl:" + this.h);
         var1.println("fpsLimit:" + this.i);
         var1.println("difficulty:" + this.C);
         var1.println("fancyGraphics:" + this.j);
         var1.println("ao:" + this.k);
         var1.println("clouds:" + this.l);
         var1.println("skin:" + this.m);
         var1.println("lastServer:" + this.H);
         var1.println("mojang.lang:" + this.R);

         for(int var2 = 0; var2 < this.A.length; ++var2) {
            var1.println("key_" + this.A[var2].c + ":" + this.A[var2].d);
         }

         var1.close();
      } catch (Exception var3) {
         System.out.println("Failed to save options");
         var3.printStackTrace();
      }

   }

   public boolean c() {
      return this.e < 2 && this.l;
   }

}
