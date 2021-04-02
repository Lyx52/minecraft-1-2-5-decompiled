package mojang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class xd implements ali {

   public boolean a;
   public List b;
   private List G;
   private TreeSet H;
   private Set I;
   public List c;
   private List J;
   private List K;
   public List d;
   public List e;
   private long L;
   public int f;
   protected int g;
   protected final int h;
   protected float i;
   protected float j;
   protected float k;
   protected float l;
   protected int m;
   public int n;
   public boolean o;
   private long M;
   protected int p;
   public int q;
   public Random r;
   public boolean s;
   public final alb t;
   protected List u;
   protected ca v;
   protected final akp w;
   protected wq x;
   public boolean y;
   private boolean N;
   public za z;
   public final ln A;
   private final adq O;
   private ArrayList P;
   private boolean Q;
   protected boolean B;
   protected boolean C;
   protected Set D;
   private int R;
   int[] E;
   private List S;
   public boolean F;


   public abn a(int var1, int var2) {
      if(this.j(var1, 0, var2)) {
         ack var3 = this.c(var1, var2);
         if(var3 != null) {
            return var3.a(var1 & 15, var2 & 15, this.t.c);
         }
      }

      return this.t.c.a(var1, var2);
   }

   public rs i() {
      return this.t.c;
   }

   public xd(akp var1, String var2, alb var3, fj var4) {
      this.a = false;
      this.b = new ArrayList();
      this.G = new ArrayList();
      this.H = new TreeSet();
      this.I = new HashSet();
      this.c = new ArrayList();
      this.J = new ArrayList();
      this.K = new ArrayList();
      this.d = new ArrayList();
      this.e = new ArrayList();
      this.L = 16777215L;
      this.f = 0;
      this.g = (new Random()).nextInt();
      this.h = 1013904223;
      this.m = 0;
      this.n = 0;
      this.o = false;
      this.M = System.currentTimeMillis();
      this.p = 40;
      this.r = new Random();
      this.s = false;
      this.u = new ArrayList();
      this.A = new ln(this);
      this.O = new adq(this);
      this.P = new ArrayList();
      this.B = true;
      this.C = true;
      this.D = new HashSet();
      this.R = this.r.nextInt(12000);
      this.E = new int['\u8000'];
      this.S = new ArrayList();
      this.F = false;
      this.w = var1;
      this.x = new wq(var4, var2);
      this.t = var3;
      this.z = new za(var1);
      var3.a(this);
      this.v = this.d();
      this.q();
      this.K();
   }

   public xd(xd var1, alb var2) {
      this.a = false;
      this.b = new ArrayList();
      this.G = new ArrayList();
      this.H = new TreeSet();
      this.I = new HashSet();
      this.c = new ArrayList();
      this.J = new ArrayList();
      this.K = new ArrayList();
      this.d = new ArrayList();
      this.e = new ArrayList();
      this.L = 16777215L;
      this.f = 0;
      this.g = (new Random()).nextInt();
      this.h = 1013904223;
      this.m = 0;
      this.n = 0;
      this.o = false;
      this.M = System.currentTimeMillis();
      this.p = 40;
      this.r = new Random();
      this.s = false;
      this.u = new ArrayList();
      this.A = new ln(this);
      this.O = new adq(this);
      this.P = new ArrayList();
      this.B = true;
      this.C = true;
      this.D = new HashSet();
      this.R = this.r.nextInt(12000);
      this.E = new int['\u8000'];
      this.S = new ArrayList();
      this.F = false;
      this.M = var1.M;
      this.w = var1.w;
      this.x = new wq(var1.x);
      this.z = new za(this.w);
      this.t = var2;
      var2.a(this);
      this.v = this.d();
      this.q();
      this.K();
   }

   public xd(akp var1, String var2, fj var3) {
      this(var1, var2, var3, (alb)null);
   }

   public xd(akp var1, String var2, fj var3, alb var4) {
      this.a = false;
      this.b = new ArrayList();
      this.G = new ArrayList();
      this.H = new TreeSet();
      this.I = new HashSet();
      this.c = new ArrayList();
      this.J = new ArrayList();
      this.K = new ArrayList();
      this.d = new ArrayList();
      this.e = new ArrayList();
      this.L = 16777215L;
      this.f = 0;
      this.g = (new Random()).nextInt();
      this.h = 1013904223;
      this.m = 0;
      this.n = 0;
      this.o = false;
      this.M = System.currentTimeMillis();
      this.p = 40;
      this.r = new Random();
      this.s = false;
      this.u = new ArrayList();
      this.A = new ln(this);
      this.O = new adq(this);
      this.P = new ArrayList();
      this.B = true;
      this.C = true;
      this.D = new HashSet();
      this.R = this.r.nextInt(12000);
      this.E = new int['\u8000'];
      this.S = new ArrayList();
      this.F = false;
      this.w = var1;
      this.z = new za(var1);
      this.x = var1.c();
      this.s = this.x == null;
      if(var4 != null) {
         this.t = var4;
      } else if(this.x != null && this.x.i() != 0) {
         this.t = alb.a(this.x.i());
      } else {
         this.t = alb.a(0);
      }

      boolean var5 = false;
      if(this.x == null) {
         this.x = new wq(var3, var2);
         var5 = true;
      } else {
         this.x.a(var2);
      }

      this.t.a(this);
      this.v = this.d();
      if(var5) {
         this.j();
      }

      this.q();
      this.K();
   }

   protected ca d() {
      ua var1 = this.w.a(this.t);
      return new ko(this, var1, this.t.b());
   }

   protected void j() {
      if(!this.t.d()) {
         this.x.a(0, this.t.h(), 0);
      } else {
         this.y = true;
         rs var1 = this.t.c;
         List var2 = var1.a();
         Random var3 = new Random(this.v());
         qo var4 = var1.a(0, 0, 256, var2, var3);
         int var5 = 0;
         int var6 = this.t.h();
         int var7 = 0;
         if(var4 != null) {
            var5 = var4.a;
            var7 = var4.c;
         } else {
            System.out.println("Unable to find spawn biome");
         }

         int var8 = 0;

         while(!this.t.a(var5, var7)) {
            var5 += var3.nextInt(64) - var3.nextInt(64);
            var7 += var3.nextInt(64) - var3.nextInt(64);
            ++var8;
            if(var8 == 1000) {
               break;
            }
         }

         this.x.a(var5, var6, var7);
         this.y = false;
      }
   }

   public uh k() {
      return this.t.g();
   }

   public void e() {
      if(this.x.d() <= 0) {
         this.x.b(64);
      }

      int var1 = this.x.c();
      int var2 = this.x.e();
      int var3 = 0;

      while(this.b(var1, var2) == 0) {
         var1 += this.r.nextInt(8) - this.r.nextInt(8);
         var2 += this.r.nextInt(8) - this.r.nextInt(8);
         ++var3;
         if(var3 == 10000) {
            break;
         }
      }

      this.x.a(var1);
      this.x.c(var2);
   }

   public int b(int var1, int var2) {
      int var3;
      for(var3 = 63; !this.i(var1, var3 + 1, var2); ++var3) {
         ;
      }

      return this.a(var1, var3, var2);
   }

   public void l() {}

   public void a(yw var1) {
      try {
         ady var2 = this.x.h();
         if(var2 != null) {
            var1.e(var2);
            this.x.a((ady)null);
         }

         if(this.v instanceof hy) {
            hy var3 = (hy)this.v;
            int var4 = gk.d((float)((int)var1.o)) >> 4;
            int var5 = gk.d((float)((int)var1.q)) >> 4;
            var3.d(var4, var5);
         }

         this.a((nn)var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public void a(boolean var1, rw var2) {
      if(this.v.b()) {
         if(var2 != null) {
            var2.b("Saving level");
         }

         this.J();
         if(var2 != null) {
            var2.d("Saving chunks");
         }

         this.v.a(var1, var2);
      }
   }

   private void J() {
      this.u();
      this.w.a(this.x, this.d);
      this.z.a();
   }

   public boolean c(int var1) {
      if(!this.v.b()) {
         return true;
      } else {
         if(var1 == 0) {
            this.J();
         }

         return this.v.a(false, (rw)null);
      }
   }

   public int a(int var1, int var2, int var3) {
      return var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000?(var2 < 0?0:(var2 >= 256?0:this.d(var1 >> 4, var3 >> 4).a(var1 & 15, var2, var3 & 15))):0;
   }

   public int d(int var1, int var2, int var3) {
      return var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000?(var2 < 0?0:(var2 >= 256?0:this.d(var1 >> 4, var3 >> 4).b(var1 & 15, var2, var3 & 15))):0;
   }

   public boolean i(int var1, int var2, int var3) {
      return this.a(var1, var2, var3) == 0;
   }

   public boolean j(int var1, int var2, int var3) {
      return var2 >= 0 && var2 < 256?this.h(var1 >> 4, var3 >> 4):false;
   }

   public boolean e(int var1, int var2, int var3, int var4) {
      return this.b(var1 - var4, var2 - var4, var3 - var4, var1 + var4, var2 + var4, var3 + var4);
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 >= 0 && var2 < 256) {
         var1 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var6 >>= 4;

         for(int var7 = var1; var7 <= var4; ++var7) {
            for(int var8 = var3; var8 <= var6; ++var8) {
               if(!this.h(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean h(int var1, int var2) {
      return this.v.a(var1, var2);
   }

   public ack c(int var1, int var2) {
      return this.d(var1 >> 4, var2 >> 4);
   }

   public ack d(int var1, int var2) {
      return this.v.b(var1, var2);
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 256) {
            return false;
         } else {
            ack var6 = this.d(var1 >> 4, var3 >> 4);
            boolean var7 = var6.a(var1 & 15, var2, var3 & 15, var4, var5);
            lv.a("checkLight");
            this.u(var1, var2, var3);
            lv.b();
            return var7;
         }
      } else {
         return false;
      }
   }

   public boolean d(int var1, int var2, int var3, int var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 256) {
            return false;
         } else {
            ack var5 = this.d(var1 >> 4, var3 >> 4);
            boolean var6 = var5.a(var1 & 15, var2, var3 & 15, var4);
            lv.a("checkLight");
            this.u(var1, var2, var3);
            lv.b();
            return var6;
         }
      } else {
         return false;
      }
   }

   public acn f(int var1, int var2, int var3) {
      int var4 = this.a(var1, var2, var3);
      return var4 == 0?acn.a:pb.m[var4].cd;
   }

   public int e(int var1, int var2, int var3) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var2 < 0) {
            return 0;
         } else if(var2 >= 256) {
            return 0;
         } else {
            ack var4 = this.d(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var4.c(var1, var2, var3);
         }
      } else {
         return 0;
      }
   }

   public void f(int var1, int var2, int var3, int var4) {
      if(this.c(var1, var2, var3, var4)) {
         int var5 = this.a(var1, var2, var3);
         if(pb.r[var5 & 4095]) {
            this.h(var1, var2, var3, var5);
         } else {
            this.j(var1, var2, var3, var5);
         }
      }

   }

   public boolean c(int var1, int var2, int var3, int var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 256) {
            return false;
         } else {
            ack var5 = this.d(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var5.b(var1, var2, var3, var4);
         }
      } else {
         return false;
      }
   }

   public boolean g(int var1, int var2, int var3, int var4) {
      if(this.d(var1, var2, var3, var4)) {
         this.h(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public boolean d(int var1, int var2, int var3, int var4, int var5) {
      if(this.b(var1, var2, var3, var4, var5)) {
         this.h(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void k(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.u.size(); ++var4) {
         ((afk)this.u.get(var4)).a(var1, var2, var3);
      }

   }

   public void h(int var1, int var2, int var3, int var4) {
      this.k(var1, var2, var3);
      this.j(var1, var2, var3, var4);
   }

   public void i(int var1, int var2, int var3, int var4) {
      int var5;
      if(var3 > var4) {
         var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      if(!this.t.e) {
         for(var5 = var3; var5 <= var4; ++var5) {
            this.c(wl.a, var1, var5, var2);
         }
      }

      this.c(var1, var3, var2, var1, var4, var2);
   }

   public void l(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.u.size(); ++var4) {
         ((afk)this.u.get(var4)).b(var1, var2, var3, var1, var2, var3);
      }

   }

   public void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.u.size(); ++var7) {
         ((afk)this.u.get(var7)).b(var1, var2, var3, var4, var5, var6);
      }

   }

   public void j(int var1, int var2, int var3, int var4) {
      this.m(var1 - 1, var2, var3, var4);
      this.m(var1 + 1, var2, var3, var4);
      this.m(var1, var2 - 1, var3, var4);
      this.m(var1, var2 + 1, var3, var4);
      this.m(var1, var2, var3 - 1, var4);
      this.m(var1, var2, var3 + 1, var4);
   }

   private void m(int var1, int var2, int var3, int var4) {
      if(!this.o && !this.F) {
         pb var5 = pb.m[this.a(var1, var2, var3)];
         if(var5 != null) {
            var5.a(this, var1, var2, var3, var4);
         }

      }
   }

   public boolean m(int var1, int var2, int var3) {
      return this.d(var1 >> 4, var3 >> 4).d(var1 & 15, var2, var3 & 15);
   }

   public int n(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else {
         if(var2 >= 256) {
            var2 = 255;
         }

         return this.d(var1 >> 4, var3 >> 4).c(var1 & 15, var2, var3 & 15, 0);
      }
   }

   public int o(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, true);
   }

   public int a(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var4) {
            int var5 = this.a(var1, var2, var3);
            if(var5 == pb.ak.bO || var5 == pb.aA.bO || var5 == pb.aH.bO || var5 == pb.at.bO) {
               int var6 = this.a(var1, var2 + 1, var3, false);
               int var7 = this.a(var1 + 1, var2, var3, false);
               int var8 = this.a(var1 - 1, var2, var3, false);
               int var9 = this.a(var1, var2, var3 + 1, false);
               int var10 = this.a(var1, var2, var3 - 1, false);
               if(var7 > var6) {
                  var6 = var7;
               }

               if(var8 > var6) {
                  var6 = var8;
               }

               if(var9 > var6) {
                  var6 = var9;
               }

               if(var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if(var2 < 0) {
            return 0;
         } else {
            if(var2 >= 256) {
               var2 = 255;
            }

            ack var11 = this.d(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var11.c(var1, var2, var3, this.f);
         }
      } else {
         return 15;
      }
   }

   public int e(int var1, int var2) {
      if(var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         if(!this.h(var1 >> 4, var2 >> 4)) {
            return 0;
         } else {
            ack var3 = this.d(var1 >> 4, var2 >> 4);
            return var3.b(var1 & 15, var2 & 15);
         }
      } else {
         return 0;
      }
   }

   public int a(wl var1, int var2, int var3, int var4) {
      if(this.t.e && var1 == wl.a) {
         return 0;
      } else {
         if(var3 < 0) {
            var3 = 0;
         }

         if(var3 >= 256) {
            return var1.c;
         } else if(var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
            int var5 = var2 >> 4;
            int var6 = var4 >> 4;
            if(!this.h(var5, var6)) {
               return var1.c;
            } else if(pb.s[this.a(var2, var3, var4)]) {
               int var12 = this.b(var1, var2, var3 + 1, var4);
               int var8 = this.b(var1, var2 + 1, var3, var4);
               int var9 = this.b(var1, var2 - 1, var3, var4);
               int var10 = this.b(var1, var2, var3, var4 + 1);
               int var11 = this.b(var1, var2, var3, var4 - 1);
               if(var8 > var12) {
                  var12 = var8;
               }

               if(var9 > var12) {
                  var12 = var9;
               }

               if(var10 > var12) {
                  var12 = var10;
               }

               if(var11 > var12) {
                  var12 = var11;
               }

               return var12;
            } else {
               ack var7 = this.d(var5, var6);
               return var7.a(var1, var2 & 15, var3, var4 & 15);
            }
         } else {
            return var1.c;
         }
      }
   }

   public int b(wl var1, int var2, int var3, int var4) {
      if(var3 < 0) {
         var3 = 0;
      }

      if(var3 >= 256) {
         var3 = 255;
      }

      if(var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
         int var5 = var2 >> 4;
         int var6 = var4 >> 4;
         if(!this.h(var5, var6)) {
            return var1.c;
         } else {
            ack var7 = this.d(var5, var6);
            return var7.a(var1, var2 & 15, var3, var4 & 15);
         }
      } else {
         return var1.c;
      }
   }

   public void a(wl var1, int var2, int var3, int var4, int var5) {
      if(var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
         if(var3 >= 0) {
            if(var3 < 256) {
               if(this.h(var2 >> 4, var4 >> 4)) {
                  ack var6 = this.d(var2 >> 4, var4 >> 4);
                  var6.a(var1, var2 & 15, var3, var4 & 15, var5);

                  for(int var7 = 0; var7 < this.u.size(); ++var7) {
                     ((afk)this.u.get(var7)).b(var2, var3, var4);
                  }

               }
            }
         }
      }
   }

   public void p(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.u.size(); ++var4) {
         ((afk)this.u.get(var4)).b(var1, var2, var3);
      }

   }

   public int b(int var1, int var2, int var3, int var4) {
      int var5 = this.a(wl.a, var1, var2, var3);
      int var6 = this.a(wl.b, var1, var2, var3);
      if(var6 < var4) {
         var6 = var4;
      }

      return var5 << 20 | var6 << 4;
   }

   public float a(int var1, int var2, int var3, int var4) {
      int var5 = this.o(var1, var2, var3);
      if(var5 < var4) {
         var5 = var4;
      }

      return this.t.f[var5];
   }

   public float c(int var1, int var2, int var3) {
      return this.t.f[this.o(var1, var2, var3)];
   }

   public boolean m() {
      return this.f < 4;
   }

   public pl a(bo var1, bo var2) {
      return this.a(var1, var2, false, false);
   }

   public pl a(bo var1, bo var2, boolean var3) {
      return this.a(var1, var2, var3, false);
   }

   public pl a(bo var1, bo var2, boolean var3, boolean var4) {
      if(!Double.isNaN(var1.a) && !Double.isNaN(var1.b) && !Double.isNaN(var1.c)) {
         if(!Double.isNaN(var2.a) && !Double.isNaN(var2.b) && !Double.isNaN(var2.c)) {
            int var5 = gk.c(var2.a);
            int var6 = gk.c(var2.b);
            int var7 = gk.c(var2.c);
            int var8 = gk.c(var1.a);
            int var9 = gk.c(var1.b);
            int var10 = gk.c(var1.c);
            int var11 = this.a(var8, var9, var10);
            int var12 = this.e(var8, var9, var10);
            pb var13 = pb.m[var11];
            if((!var4 || var13 == null || var13.c(this, var8, var9, var10) != null) && var11 > 0 && var13.a(var12, var3)) {
               pl var14 = var13.a(this, var8, var9, var10, var1, var2);
               if(var14 != null) {
                  return var14;
               }
            }

            var11 = 200;

            while(var11-- >= 0) {
               if(Double.isNaN(var1.a) || Double.isNaN(var1.b) || Double.isNaN(var1.c)) {
                  return null;
               }

               if(var8 == var5 && var9 == var6 && var10 == var7) {
                  return null;
               }

               boolean var39 = true;
               boolean var40 = true;
               boolean var41 = true;
               double var15 = 999.0D;
               double var17 = 999.0D;
               double var19 = 999.0D;
               if(var5 > var8) {
                  var15 = (double)var8 + 1.0D;
               } else if(var5 < var8) {
                  var15 = (double)var8 + 0.0D;
               } else {
                  var39 = false;
               }

               if(var6 > var9) {
                  var17 = (double)var9 + 1.0D;
               } else if(var6 < var9) {
                  var17 = (double)var9 + 0.0D;
               } else {
                  var40 = false;
               }

               if(var7 > var10) {
                  var19 = (double)var10 + 1.0D;
               } else if(var7 < var10) {
                  var19 = (double)var10 + 0.0D;
               } else {
                  var41 = false;
               }

               double var21 = 999.0D;
               double var23 = 999.0D;
               double var25 = 999.0D;
               double var27 = var2.a - var1.a;
               double var29 = var2.b - var1.b;
               double var31 = var2.c - var1.c;
               if(var39) {
                  var21 = (var15 - var1.a) / var27;
               }

               if(var40) {
                  var23 = (var17 - var1.b) / var29;
               }

               if(var41) {
                  var25 = (var19 - var1.c) / var31;
               }

               boolean var33 = false;
               byte var42;
               if(var21 < var23 && var21 < var25) {
                  if(var5 > var8) {
                     var42 = 4;
                  } else {
                     var42 = 5;
                  }

                  var1.a = var15;
                  var1.b += var29 * var21;
                  var1.c += var31 * var21;
               } else if(var23 < var25) {
                  if(var6 > var9) {
                     var42 = 0;
                  } else {
                     var42 = 1;
                  }

                  var1.a += var27 * var23;
                  var1.b = var17;
                  var1.c += var31 * var23;
               } else {
                  if(var7 > var10) {
                     var42 = 2;
                  } else {
                     var42 = 3;
                  }

                  var1.a += var27 * var25;
                  var1.b += var29 * var25;
                  var1.c = var19;
               }

               bo var34 = bo.b(var1.a, var1.b, var1.c);
               var8 = (int)(var34.a = (double)gk.c(var1.a));
               if(var42 == 5) {
                  --var8;
                  ++var34.a;
               }

               var9 = (int)(var34.b = (double)gk.c(var1.b));
               if(var42 == 1) {
                  --var9;
                  ++var34.b;
               }

               var10 = (int)(var34.c = (double)gk.c(var1.c));
               if(var42 == 3) {
                  --var10;
                  ++var34.c;
               }

               int var35 = this.a(var8, var9, var10);
               int var36 = this.e(var8, var9, var10);
               pb var37 = pb.m[var35];
               if((!var4 || var37 == null || var37.c(this, var8, var9, var10) != null) && var35 > 0 && var37.a(var36, var3)) {
                  pl var38 = var37.a(this, var8, var9, var10, var1, var2);
                  if(var38 != null) {
                     return var38;
                  }
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void a(nn var1, String var2, float var3, float var4) {
      for(int var5 = 0; var5 < this.u.size(); ++var5) {
         ((afk)this.u.get(var5)).a(var2, var1.o, var1.p - (double)var1.H, var1.q, var3, var4);
      }

   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9) {
      for(int var10 = 0; var10 < this.u.size(); ++var10) {
         ((afk)this.u.get(var10)).a(var7, var1, var3, var5, var8, var9);
      }

   }

   public void a(String var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < this.u.size(); ++var5) {
         ((afk)this.u.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      for(int var14 = 0; var14 < this.u.size(); ++var14) {
         ((afk)this.u.get(var14)).a(var1, var2, var4, var6, var8, var10, var12);
      }

   }

   public boolean e(nn var1) {
      this.e.add(var1);
      return true;
   }

   public boolean a(nn var1) {
      int var2 = gk.c(var1.o / 16.0D);
      int var3 = gk.c(var1.q / 16.0D);
      boolean var4 = false;
      if(var1 instanceof yw) {
         var4 = true;
      }

      if(!var4 && !this.h(var2, var3)) {
         return false;
      } else {
         if(var1 instanceof yw) {
            yw var5 = (yw)var1;
            this.d.add(var5);
            this.C();
         }

         this.d(var2, var3).a(var1);
         this.b.add(var1);
         this.c(var1);
         return true;
      }
   }

   protected void c(nn var1) {
      for(int var2 = 0; var2 < this.u.size(); ++var2) {
         ((afk)this.u.get(var2)).a(var1);
      }

   }

   protected void d(nn var1) {
      for(int var2 = 0; var2 < this.u.size(); ++var2) {
         ((afk)this.u.get(var2)).b(var1);
      }

   }

   public void b(nn var1) {
      if(var1.i != null) {
         var1.i.h((nn)null);
      }

      if(var1.j != null) {
         var1.h((nn)null);
      }

      var1.A();
      if(var1 instanceof yw) {
         this.d.remove((yw)var1);
         this.C();
      }

   }

   public void a(afk var1) {
      this.u.add(var1);
   }

   public void b(afk var1) {
      this.u.remove(var1);
   }

   public List a(nn var1, wu var2) {
      this.P.clear();
      int var3 = gk.c(var2.a);
      int var4 = gk.c(var2.d + 1.0D);
      int var5 = gk.c(var2.b);
      int var6 = gk.c(var2.e + 1.0D);
      int var7 = gk.c(var2.c);
      int var8 = gk.c(var2.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var7; var10 < var8; ++var10) {
            if(this.j(var9, 64, var10)) {
               for(int var11 = var5 - 1; var11 < var6; ++var11) {
                  pb var12 = pb.m[this.a(var9, var11, var10)];
                  if(var12 != null) {
                     var12.a(this, var9, var11, var10, var2, this.P);
                  }
               }
            }
         }
      }

      double var14 = 0.25D;
      List var15 = this.b(var1, var2.b(var14, var14, var14));

      for(int var16 = 0; var16 < var15.size(); ++var16) {
         wu var13 = ((nn)var15.get(var16)).f_();
         if(var13 != null && var13.a(var2)) {
            this.P.add(var13);
         }

         var13 = var1.b((nn)var15.get(var16));
         if(var13 != null && var13.a(var2)) {
            this.P.add(var13);
         }
      }

      return this.P;
   }

   public int a(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (gk.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.j(var1) * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.i(var1) * 5.0F) / 16.0D));
      var3 = 1.0F - var3;
      return (int)(var3 * 11.0F);
   }

   public float b(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (gk.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.2F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.j(var1) * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.i(var1) * 5.0F) / 16.0D));
      return var3 * 0.8F + 0.2F;
   }

   public bo a(nn var1, float var2) {
      float var3 = this.c(var2);
      float var4 = gk.b(var3 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      if(var4 > 1.0F) {
         var4 = 1.0F;
      }

      int var5 = gk.c(var1.o);
      int var6 = gk.c(var1.q);
      abn var7 = this.a(var5, var6);
      float var8 = var7.j();
      int var9 = var7.a(var8);
      float var10 = (float)(var9 >> 16 & 255) / 255.0F;
      float var11 = (float)(var9 >> 8 & 255) / 255.0F;
      float var12 = (float)(var9 & 255) / 255.0F;
      var10 *= var4;
      var11 *= var4;
      var12 *= var4;
      float var13 = this.j(var2);
      float var14;
      float var15;
      if(var13 > 0.0F) {
         var14 = (var10 * 0.3F + var11 * 0.59F + var12 * 0.11F) * 0.6F;
         var15 = 1.0F - var13 * 0.75F;
         var10 = var10 * var15 + var14 * (1.0F - var15);
         var11 = var11 * var15 + var14 * (1.0F - var15);
         var12 = var12 * var15 + var14 * (1.0F - var15);
      }

      var14 = this.i(var2);
      if(var14 > 0.0F) {
         var15 = (var10 * 0.3F + var11 * 0.59F + var12 * 0.11F) * 0.2F;
         float var16 = 1.0F - var14 * 0.75F;
         var10 = var10 * var16 + var15 * (1.0F - var16);
         var11 = var11 * var16 + var15 * (1.0F - var16);
         var12 = var12 * var16 + var15 * (1.0F - var16);
      }

      if(this.n > 0) {
         var15 = (float)this.n - var2;
         if(var15 > 1.0F) {
            var15 = 1.0F;
         }

         var15 *= 0.45F;
         var10 = var10 * (1.0F - var15) + 0.8F * var15;
         var11 = var11 * (1.0F - var15) + 0.8F * var15;
         var12 = var12 * (1.0F - var15) + 1.0F * var15;
      }

      return bo.b((double)var10, (double)var11, (double)var12);
   }

   public float c(float var1) {
      return this.t.a(this.x.f(), var1);
   }

   public int d(float var1) {
      return this.t.b(this.x.f(), var1);
   }

   public float e(float var1) {
      float var2 = this.c(var1);
      return var2 * 3.1415927F * 2.0F;
   }

   public bo f(float var1) {
      float var2 = this.c(var1);
      float var3 = gk.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.L >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.L >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.L & 255L) / 255.0F;
      float var7 = this.j(var1);
      float var8;
      float var9;
      if(var7 > 0.0F) {
         var8 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.6F;
         var9 = 1.0F - var7 * 0.95F;
         var4 = var4 * var9 + var8 * (1.0F - var9);
         var5 = var5 * var9 + var8 * (1.0F - var9);
         var6 = var6 * var9 + var8 * (1.0F - var9);
      }

      var4 *= var3 * 0.9F + 0.1F;
      var5 *= var3 * 0.9F + 0.1F;
      var6 *= var3 * 0.85F + 0.15F;
      var8 = this.i(var1);
      if(var8 > 0.0F) {
         var9 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.2F;
         float var10 = 1.0F - var8 * 0.95F;
         var4 = var4 * var10 + var9 * (1.0F - var10);
         var5 = var5 * var10 + var9 * (1.0F - var10);
         var6 = var6 * var10 + var9 * (1.0F - var10);
      }

      return bo.b((double)var4, (double)var5, (double)var6);
   }

   public bo g(float var1) {
      float var2 = this.c(var1);
      return this.t.b(var2, var1);
   }

   public int f(int var1, int var2) {
      return this.c(var1, var2).d(var1 & 15, var2 & 15);
   }

   public int g(int var1, int var2) {
      ack var3 = this.c(var1, var2);
      int var4 = var3.h() + 16;
      var1 &= 15;

      for(var2 &= 15; var4 > 0; --var4) {
         int var5 = var3.a(var1, var4, var2);
         if(var5 != 0 && pb.m[var5].cd.c() && pb.m[var5].cd != acn.i) {
            return var4 + 1;
         }
      }

      return -1;
   }

   public float h(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (gk.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.75F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3 * var3 * 0.5F;
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      ml var6 = new ml(var1, var2, var3, var4);
      byte var7 = 8;
      if(this.a) {
         if(this.b(var6.a - var7, var6.b - var7, var6.c - var7, var6.a + var7, var6.b + var7, var6.c + var7)) {
            int var8 = this.a(var6.a, var6.b, var6.c);
            if(var8 == var6.d && var8 > 0) {
               pb.m[var8].a(this, var6.a, var6.b, var6.c, this.r);
            }
         }

      } else {
         if(this.b(var1 - var7, var2 - var7, var3 - var7, var1 + var7, var2 + var7, var3 + var7)) {
            if(var4 > 0) {
               var6.a((long)var5 + this.x.f());
            }

            if(!this.I.contains(var6)) {
               this.I.add(var6);
               this.H.add(var6);
            }
         }

      }
   }

   public void e(int var1, int var2, int var3, int var4, int var5) {
      ml var6 = new ml(var1, var2, var3, var4);
      if(var4 > 0) {
         var6.a((long)var5 + this.x.f());
      }

      if(!this.I.contains(var6)) {
         this.I.add(var6);
         this.H.add(var6);
      }

   }

   public void n() {
      lv.a("entities");
      lv.a("global");

      int var1;
      nn var2;
      for(var1 = 0; var1 < this.e.size(); ++var1) {
         var2 = (nn)this.e.get(var1);
         var2.J_();
         if(var2.G) {
            this.e.remove(var1--);
         }
      }

      lv.c("remove");
      this.b.removeAll(this.G);

      int var3;
      int var4;
      for(var1 = 0; var1 < this.G.size(); ++var1) {
         var2 = (nn)this.G.get(var1);
         var3 = var2.ae;
         var4 = var2.ag;
         if(var2.ad && this.h(var3, var4)) {
            this.d(var3, var4).b(var2);
         }
      }

      for(var1 = 0; var1 < this.G.size(); ++var1) {
         this.d((nn)this.G.get(var1));
      }

      this.G.clear();
      lv.c("regular");

      for(var1 = 0; var1 < this.b.size(); ++var1) {
         var2 = (nn)this.b.get(var1);
         if(var2.j != null) {
            if(!var2.j.G && var2.j.i == var2) {
               continue;
            }

            var2.j.i = null;
            var2.j = null;
         }

         if(!var2.G) {
            this.f(var2);
         }

         lv.a("remove");
         if(var2.G) {
            var3 = var2.ae;
            var4 = var2.ag;
            if(var2.ad && this.h(var3, var4)) {
               this.d(var3, var4).b(var2);
            }

            this.b.remove(var1--);
            this.d(var2);
         }

         lv.b();
      }

      lv.c("tileEntities");
      this.Q = true;
      Iterator var10 = this.c.iterator();

      while(var10.hasNext()) {
         kw var5 = (kw)var10.next();
         if(!var5.l() && var5.i != null && this.j(var5.j, var5.k, var5.l)) {
            var5.n_();
         }

         if(var5.l()) {
            var10.remove();
            if(this.h(var5.j >> 4, var5.l >> 4)) {
               ack var7 = this.d(var5.j >> 4, var5.l >> 4);
               if(var7 != null) {
                  var7.f(var5.j & 15, var5.k, var5.l & 15);
               }
            }
         }
      }

      this.Q = false;
      if(!this.K.isEmpty()) {
         this.c.removeAll(this.K);
         this.K.clear();
      }

      lv.c("pendingTileEntities");
      if(!this.J.isEmpty()) {
         Iterator var6 = this.J.iterator();

         while(var6.hasNext()) {
            kw var8 = (kw)var6.next();
            if(!var8.l()) {
               if(!this.c.contains(var8)) {
                  this.c.add(var8);
               }

               if(this.h(var8.j >> 4, var8.l >> 4)) {
                  ack var9 = this.d(var8.j >> 4, var8.l >> 4);
                  if(var9 != null) {
                     var9.a(var8.j & 15, var8.k, var8.l & 15, var8);
                  }
               }

               this.k(var8.j, var8.k, var8.l);
            }
         }

         this.J.clear();
      }

      lv.b();
      lv.b();
   }

   public void a(Collection var1) {
      if(this.Q) {
         this.J.addAll(var1);
      } else {
         this.c.addAll(var1);
      }

   }

   public void f(nn var1) {
      this.a(var1, true);
   }

   public void a(nn var1, boolean var2) {
      int var3 = gk.c(var1.o);
      int var4 = gk.c(var1.q);
      byte var5 = 32;
      if(!var2 || this.b(var3 - var5, 0, var4 - var5, var3 + var5, 0, var4 + var5)) {
         var1.N = var1.o;
         var1.O = var1.p;
         var1.P = var1.q;
         var1.w = var1.u;
         var1.x = var1.v;
         if(var2 && var1.ad) {
            if(var1.j != null) {
               var1.O();
            } else {
               var1.J_();
            }
         }

         lv.a("chunkCheck");
         if(Double.isNaN(var1.o) || Double.isInfinite(var1.o)) {
            var1.o = var1.N;
         }

         if(Double.isNaN(var1.p) || Double.isInfinite(var1.p)) {
            var1.p = var1.O;
         }

         if(Double.isNaN(var1.q) || Double.isInfinite(var1.q)) {
            var1.q = var1.P;
         }

         if(Double.isNaN((double)var1.v) || Double.isInfinite((double)var1.v)) {
            var1.v = var1.x;
         }

         if(Double.isNaN((double)var1.u) || Double.isInfinite((double)var1.u)) {
            var1.u = var1.w;
         }

         int var6 = gk.c(var1.o / 16.0D);
         int var7 = gk.c(var1.p / 16.0D);
         int var8 = gk.c(var1.q / 16.0D);
         if(!var1.ad || var1.ae != var6 || var1.af != var7 || var1.ag != var8) {
            if(var1.ad && this.h(var1.ae, var1.ag)) {
               this.d(var1.ae, var1.ag).a(var1, var1.af);
            }

            if(this.h(var6, var8)) {
               var1.ad = true;
               this.d(var6, var8).a(var1);
            } else {
               var1.ad = false;
            }
         }

         lv.b();
         if(var2 && var1.ad && var1.i != null) {
            if(!var1.i.G && var1.i.j == var1) {
               this.f(var1.i);
            } else {
               var1.i.j = null;
               var1.i = null;
            }
         }

      }
   }

   public boolean a(wu var1) {
      List var2 = this.b((nn)null, var1);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         nn var4 = (nn)var2.get(var3);
         if(!var4.G && var4.h) {
            return false;
         }
      }

      return true;
   }

   public boolean b(wu var1) {
      int var2 = gk.c(var1.a);
      int var3 = gk.c(var1.d + 1.0D);
      int var4 = gk.c(var1.b);
      int var5 = gk.c(var1.e + 1.0D);
      int var6 = gk.c(var1.c);
      int var7 = gk.c(var1.f + 1.0D);
      if(var1.a < 0.0D) {
         --var2;
      }

      if(var1.b < 0.0D) {
         --var4;
      }

      if(var1.c < 0.0D) {
         --var6;
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               pb var11 = pb.m[this.a(var8, var9, var10)];
               if(var11 != null && var11.cd.d()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean c(wu var1) {
      int var2 = gk.c(var1.a);
      int var3 = gk.c(var1.d + 1.0D);
      int var4 = gk.c(var1.b);
      int var5 = gk.c(var1.e + 1.0D);
      int var6 = gk.c(var1.c);
      int var7 = gk.c(var1.f + 1.0D);
      if(this.b(var2, var4, var6, var3, var5, var7)) {
         for(int var8 = var2; var8 < var3; ++var8) {
            for(int var9 = var4; var9 < var5; ++var9) {
               for(int var10 = var6; var10 < var7; ++var10) {
                  int var11 = this.a(var8, var9, var10);
                  if(var11 == pb.ar.bO || var11 == pb.C.bO || var11 == pb.D.bO) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public boolean a(wu var1, acn var2, nn var3) {
      int var4 = gk.c(var1.a);
      int var5 = gk.c(var1.d + 1.0D);
      int var6 = gk.c(var1.b);
      int var7 = gk.c(var1.e + 1.0D);
      int var8 = gk.c(var1.c);
      int var9 = gk.c(var1.f + 1.0D);
      if(!this.b(var4, var6, var8, var5, var7, var9)) {
         return false;
      } else {
         boolean var10 = false;
         bo var11 = bo.b(0.0D, 0.0D, 0.0D);

         for(int var12 = var4; var12 < var5; ++var12) {
            for(int var13 = var6; var13 < var7; ++var13) {
               for(int var14 = var8; var14 < var9; ++var14) {
                  pb var15 = pb.m[this.a(var12, var13, var14)];
                  if(var15 != null && var15.cd == var2) {
                     double var16 = (double)((float)(var13 + 1) - agv.e(this.e(var12, var13, var14)));
                     if((double)var7 >= var16) {
                        var10 = true;
                        var15.a(this, var12, var13, var14, var3, var11);
                     }
                  }
               }
            }
         }

         if(var11.d() > 0.0D) {
            var11 = var11.c();
            double var18 = 0.014D;
            var3.r += var11.a * var18;
            var3.s += var11.b * var18;
            var3.t += var11.c * var18;
         }

         return var10;
      }
   }

   public boolean a(wu var1, acn var2) {
      int var3 = gk.c(var1.a);
      int var4 = gk.c(var1.d + 1.0D);
      int var5 = gk.c(var1.b);
      int var6 = gk.c(var1.e + 1.0D);
      int var7 = gk.c(var1.c);
      int var8 = gk.c(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               pb var12 = pb.m[this.a(var9, var10, var11)];
               if(var12 != null && var12.cd == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean b(wu var1, acn var2) {
      int var3 = gk.c(var1.a);
      int var4 = gk.c(var1.d + 1.0D);
      int var5 = gk.c(var1.b);
      int var6 = gk.c(var1.e + 1.0D);
      int var7 = gk.c(var1.c);
      int var8 = gk.c(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               pb var12 = pb.m[this.a(var9, var10, var11)];
               if(var12 != null && var12.cd == var2) {
                  int var13 = this.e(var9, var10, var11);
                  double var14 = (double)(var10 + 1);
                  if(var13 < 8) {
                     var14 = (double)(var10 + 1) - (double)var13 / 8.0D;
                  }

                  if(var14 >= var1.b) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public agh a(nn var1, double var2, double var4, double var6, float var8) {
      return this.a(var1, var2, var4, var6, var8, false);
   }

   public agh a(nn var1, double var2, double var4, double var6, float var8, boolean var9) {
      agh var10 = new agh(this, var1, var2, var4, var6, var8);
      var10.a = var9;
      var10.a();
      var10.a(true);
      return var10;
   }

   public float a(bo var1, wu var2) {
      double var3 = 1.0D / ((var2.d - var2.a) * 2.0D + 1.0D);
      double var5 = 1.0D / ((var2.e - var2.b) * 2.0D + 1.0D);
      double var7 = 1.0D / ((var2.f - var2.c) * 2.0D + 1.0D);
      int var9 = 0;
      int var10 = 0;

      for(float var11 = 0.0F; var11 <= 1.0F; var11 = (float)((double)var11 + var3)) {
         for(float var12 = 0.0F; var12 <= 1.0F; var12 = (float)((double)var12 + var5)) {
            for(float var13 = 0.0F; var13 <= 1.0F; var13 = (float)((double)var13 + var7)) {
               double var14 = var2.a + (var2.d - var2.a) * (double)var11;
               double var16 = var2.b + (var2.e - var2.b) * (double)var12;
               double var18 = var2.c + (var2.f - var2.c) * (double)var13;
               if(this.a(bo.b(var14, var16, var18), var1) == null) {
                  ++var9;
               }

               ++var10;
            }
         }
      }

      return (float)var9 / (float)var10;
   }

   public boolean a(yw var1, int var2, int var3, int var4, int var5) {
      if(var5 == 0) {
         --var3;
      }

      if(var5 == 1) {
         ++var3;
      }

      if(var5 == 2) {
         --var4;
      }

      if(var5 == 3) {
         ++var4;
      }

      if(var5 == 4) {
         --var2;
      }

      if(var5 == 5) {
         ++var2;
      }

      if(this.a(var2, var3, var4) == pb.ar.bO) {
         this.a(var1, 1004, var2, var3, var4, 0);
         this.g(var2, var3, var4, 0);
         return true;
      } else {
         return false;
      }
   }

   public nn a(Class var1) {
      return null;
   }

   public String o() {
      return "All: " + this.b.size();
   }

   public String p() {
      return this.v.c();
   }

   public kw b(int var1, int var2, int var3) {
      if(var2 >= 256) {
         return null;
      } else {
         ack var4 = this.d(var1 >> 4, var3 >> 4);
         if(var4 == null) {
            return null;
         } else {
            kw var5 = var4.e(var1 & 15, var2, var3 & 15);
            if(var5 == null) {
               Iterator var6 = this.J.iterator();

               while(var6.hasNext()) {
                  kw var7 = (kw)var6.next();
                  if(!var7.l() && var7.j == var1 && var7.k == var2 && var7.l == var3) {
                     var5 = var7;
                     break;
                  }
               }
            }

            return var5;
         }
      }
   }

   public void a(int var1, int var2, int var3, kw var4) {
      if(var4 != null && !var4.l()) {
         if(this.Q) {
            var4.j = var1;
            var4.k = var2;
            var4.l = var3;
            this.J.add(var4);
         } else {
            this.c.add(var4);
            ack var5 = this.d(var1 >> 4, var3 >> 4);
            if(var5 != null) {
               var5.a(var1 & 15, var2, var3 & 15, var4);
            }
         }
      }

   }

   public void q(int var1, int var2, int var3) {
      kw var4 = this.b(var1, var2, var3);
      if(var4 != null && this.Q) {
         var4.h();
         this.J.remove(var4);
      } else {
         if(var4 != null) {
            this.J.remove(var4);
            this.c.remove(var4);
         }

         ack var5 = this.d(var1 >> 4, var3 >> 4);
         if(var5 != null) {
            var5.f(var1 & 15, var2, var3 & 15);
         }
      }

   }

   public void a(kw var1) {
      this.K.add(var1);
   }

   public boolean g(int var1, int var2, int var3) {
      pb var4 = pb.m[this.a(var1, var2, var3)];
      return var4 == null?false:var4.a();
   }

   public boolean h(int var1, int var2, int var3) {
      return pb.g(this.a(var1, var2, var3));
   }

   public boolean b(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         ack var5 = this.v.b(var1 >> 4, var3 >> 4);
         if(var5 != null && !var5.g()) {
            pb var6 = pb.m[this.a(var1, var2, var3)];
            return var6 == null?false:var6.cd.j() && var6.b();
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public void a(rw var1) {
      this.a(true, var1);

      try {
         ce.a.a();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void q() {
      int var1 = this.a(1.0F);
      if(var1 != this.f) {
         this.f = var1;
      }

   }

   public void a(boolean var1, boolean var2) {
      this.B = var1;
      this.C = var2;
   }

   public void c() {
      if(this.B().s() && this.q < 3) {
         this.q = 3;
      }

      this.t.c.b();
      this.h();
      long var2;
      if(this.E()) {
         boolean var1 = false;
         if(this.B && this.q >= 1) {
            ;
         }

         if(!var1) {
            var2 = this.x.f() + 24000L;
            this.x.a(var2 - var2 % 24000L);
            this.D();
         }
      }

      lv.a("mobSpawner");
      vf.a(this, this.B, this.C && this.x.f() % 400L == 0L);
      lv.c("chunkSource");
      this.v.a();
      int var4 = this.a(1.0F);
      if(var4 != this.f) {
         this.f = var4;
      }

      var2 = this.x.f() + 1L;
      if(var2 % (long)this.p == 0L) {
         lv.c("save");
         this.a(false, (rw)null);
      }

      this.x.a(var2);
      lv.c("tickPending");
      this.a(false);
      lv.c("tickTiles");
      this.f();
      lv.c("village");
      this.A.a();
      this.O.a();
      lv.b();
   }

   private void K() {
      if(this.x.o()) {
         this.j = 1.0F;
         if(this.x.m()) {
            this.l = 1.0F;
         }
      }

   }

   protected void h() {
      if(!this.t.e) {
         if(this.m > 0) {
            --this.m;
         }

         int var1 = this.x.n();
         if(var1 <= 0) {
            if(this.x.m()) {
               this.x.e(this.r.nextInt(12000) + 3600);
            } else {
               this.x.e(this.r.nextInt(168000) + 12000);
            }
         } else {
            --var1;
            this.x.e(var1);
            if(var1 <= 0) {
               this.x.a(!this.x.m());
            }
         }

         int var2 = this.x.p();
         if(var2 <= 0) {
            if(this.x.o()) {
               this.x.f(this.r.nextInt(12000) + 12000);
            } else {
               this.x.f(this.r.nextInt(168000) + 12000);
            }
         } else {
            --var2;
            this.x.f(var2);
            if(var2 <= 0) {
               this.x.b(!this.x.o());
            }
         }

         this.i = this.j;
         if(this.x.o()) {
            this.j = (float)((double)this.j + 0.01D);
         } else {
            this.j = (float)((double)this.j - 0.01D);
         }

         if(this.j < 0.0F) {
            this.j = 0.0F;
         }

         if(this.j > 1.0F) {
            this.j = 1.0F;
         }

         this.k = this.l;
         if(this.x.m()) {
            this.l = (float)((double)this.l + 0.01D);
         } else {
            this.l = (float)((double)this.l - 0.01D);
         }

         if(this.l < 0.0F) {
            this.l = 0.0F;
         }

         if(this.l > 1.0F) {
            this.l = 1.0F;
         }

      }
   }

   private void L() {
      this.x.f(0);
      this.x.b(false);
      this.x.e(0);
      this.x.a(false);
   }

   protected void r() {
      this.D.clear();
      lv.a("buildList");

      int var1;
      yw var2;
      int var3;
      int var4;
      for(var1 = 0; var1 < this.d.size(); ++var1) {
         var2 = (yw)this.d.get(var1);
         var3 = gk.c(var2.o / 16.0D);
         var4 = gk.c(var2.q / 16.0D);
         byte var5 = 7;

         for(int var6 = -var5; var6 <= var5; ++var6) {
            for(int var7 = -var5; var7 <= var5; ++var7) {
               this.D.add(new sj(var6 + var3, var7 + var4));
            }
         }
      }

      lv.b();
      if(this.R > 0) {
         --this.R;
      }

      lv.a("playerCheckLight");
      if(!this.d.isEmpty()) {
         var1 = this.r.nextInt(this.d.size());
         var2 = (yw)this.d.get(var1);
         var3 = gk.c(var2.o) + this.r.nextInt(11) - 5;
         var4 = gk.c(var2.p) + this.r.nextInt(11) - 5;
         int var8 = gk.c(var2.q) + this.r.nextInt(11) - 5;
         this.u(var3, var4, var8);
      }

      lv.b();
   }

   protected void a(int var1, int var2, ack var3) {
      lv.c("tickChunk");
      var3.k();
      lv.c("moodSound");
      if(this.R == 0) {
         this.g = this.g * 3 + 1013904223;
         int var4 = this.g >> 2;
         int var5 = var4 & 15;
         int var6 = var4 >> 8 & 15;
         int var7 = var4 >> 16 & 127;
         int var8 = var3.a(var5, var7, var6);
         var5 += var1;
         var6 += var2;
         if(var8 == 0 && this.n(var5, var7, var6) <= this.r.nextInt(8) && this.b(wl.a, var5, var7, var6) <= 0) {
            yw var9 = this.a((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D, 8.0D);
            if(var9 != null && var9.f((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D) > 4.0D) {
               this.a((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.r.nextFloat() * 0.2F);
               this.R = this.r.nextInt(12000) + 6000;
            }
         }
      }

      lv.c("checkLight");
      var3.o();
   }

   protected void f() {
      this.r();
      int var1 = 0;
      int var2 = 0;
      Iterator var3 = this.D.iterator();

      while(var3.hasNext()) {
         sj var4 = (sj)var3.next();
         int var5 = var4.a * 16;
         int var6 = var4.b * 16;
         lv.a("getChunk");
         ack var7 = this.d(var4.a, var4.b);
         this.a(var5, var6, var7);
         lv.c("thunder");
         int var8;
         int var9;
         int var10;
         int var11;
         if(this.r.nextInt(100000) == 0 && this.G() && this.F()) {
            this.g = this.g * 3 + 1013904223;
            var8 = this.g >> 2;
            var9 = var5 + (var8 & 15);
            var10 = var6 + (var8 >> 8 & 15);
            var11 = this.f(var9, var10);
            if(this.y(var9, var11, var10)) {
               this.e(new d(this, (double)var9, (double)var11, (double)var10));
               this.m = 2;
            }
         }

         lv.c("iceandsnow");
         if(this.r.nextInt(16) == 0) {
            this.g = this.g * 3 + 1013904223;
            var8 = this.g >> 2;
            var9 = var8 & 15;
            var10 = var8 >> 8 & 15;
            var11 = this.f(var9 + var5, var10 + var6);
            if(this.s(var9 + var5, var11 - 1, var10 + var6)) {
               this.g(var9 + var5, var11 - 1, var10 + var6, pb.aT.bO);
            }

            if(this.G() && this.t(var9 + var5, var11, var10 + var6)) {
               this.g(var9 + var5, var11, var10 + var6, pb.aS.bO);
            }
         }

         lv.c("tickTiles");
         zg[] var19 = var7.i();
         var9 = var19.length;

         for(var10 = 0; var10 < var9; ++var10) {
            zg var20 = var19[var10];
            if(var20 != null && var20.b()) {
               for(int var12 = 0; var12 < 3; ++var12) {
                  this.g = this.g * 3 + 1013904223;
                  int var13 = this.g >> 2;
                  int var14 = var13 & 15;
                  int var15 = var13 >> 8 & 15;
                  int var16 = var13 >> 16 & 15;
                  int var17 = var20.a(var14, var16, var15);
                  ++var2;
                  pb var18 = pb.m[var17];
                  if(var18 != null && var18.o()) {
                     ++var1;
                     var18.a(this, var14 + var5, var16 + var20.c(), var15 + var6, this.r);
                  }
               }
            }
         }

         lv.b();
      }

   }

   public boolean r(int var1, int var2, int var3) {
      return this.c(var1, var2, var3, false);
   }

   public boolean s(int var1, int var2, int var3) {
      return this.c(var1, var2, var3, true);
   }

   public boolean c(int var1, int var2, int var3, boolean var4) {
      abn var5 = this.a(var1, var3);
      float var6 = var5.j();
      if(var6 > 0.15F) {
         return false;
      } else {
         if(var2 >= 0 && var2 < 256 && this.b(wl.b, var1, var2, var3) < 10) {
            int var7 = this.a(var1, var2, var3);
            if((var7 == pb.B.bO || var7 == pb.A.bO) && this.e(var1, var2, var3) == 0) {
               if(!var4) {
                  return true;
               }

               boolean var8 = true;
               if(var8 && this.f(var1 - 1, var2, var3) != acn.g) {
                  var8 = false;
               }

               if(var8 && this.f(var1 + 1, var2, var3) != acn.g) {
                  var8 = false;
               }

               if(var8 && this.f(var1, var2, var3 - 1) != acn.g) {
                  var8 = false;
               }

               if(var8 && this.f(var1, var2, var3 + 1) != acn.g) {
                  var8 = false;
               }

               if(!var8) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean t(int var1, int var2, int var3) {
      abn var4 = this.a(var1, var3);
      float var5 = var4.j();
      if(var5 > 0.15F) {
         return false;
      } else {
         if(var2 >= 0 && var2 < 256 && this.b(wl.b, var1, var2, var3) < 10) {
            int var6 = this.a(var1, var2 - 1, var3);
            int var7 = this.a(var1, var2, var3);
            if(var7 == 0 && pb.aS.e(this, var1, var2, var3) && var6 != 0 && var6 != pb.aT.bO && pb.m[var6].cd.c()) {
               return true;
            }
         }

         return false;
      }
   }

   public void u(int var1, int var2, int var3) {
      if(!this.t.e) {
         this.c(wl.a, var1, var2, var3);
      }

      this.c(wl.b, var1, var2, var3);
   }

   private int a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if(this.m(var2, var3, var4)) {
         var7 = 15;
      } else {
         if(var6 == 0) {
            var6 = 1;
         }

         int var8 = this.b(wl.a, var2 - 1, var3, var4) - var6;
         int var9 = this.b(wl.a, var2 + 1, var3, var4) - var6;
         int var10 = this.b(wl.a, var2, var3 - 1, var4) - var6;
         int var11 = this.b(wl.a, var2, var3 + 1, var4) - var6;
         int var12 = this.b(wl.a, var2, var3, var4 - 1) - var6;
         int var13 = this.b(wl.a, var2, var3, var4 + 1) - var6;
         if(var8 > var7) {
            var7 = var8;
         }

         if(var9 > var7) {
            var7 = var9;
         }

         if(var10 > var7) {
            var7 = var10;
         }

         if(var11 > var7) {
            var7 = var11;
         }

         if(var12 > var7) {
            var7 = var12;
         }

         if(var13 > var7) {
            var7 = var13;
         }
      }

      return var7;
   }

   private int d(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = pb.q[var5];
      int var8 = this.b(wl.b, var2 - 1, var3, var4) - var6;
      int var9 = this.b(wl.b, var2 + 1, var3, var4) - var6;
      int var10 = this.b(wl.b, var2, var3 - 1, var4) - var6;
      int var11 = this.b(wl.b, var2, var3 + 1, var4) - var6;
      int var12 = this.b(wl.b, var2, var3, var4 - 1) - var6;
      int var13 = this.b(wl.b, var2, var3, var4 + 1) - var6;
      if(var8 > var7) {
         var7 = var8;
      }

      if(var9 > var7) {
         var7 = var9;
      }

      if(var10 > var7) {
         var7 = var10;
      }

      if(var11 > var7) {
         var7 = var11;
      }

      if(var12 > var7) {
         var7 = var12;
      }

      if(var13 > var7) {
         var7 = var13;
      }

      return var7;
   }

   public void c(wl var1, int var2, int var3, int var4) {
      if(this.e(var2, var3, var4, 17)) {
         int var5 = 0;
         int var6 = 0;
         lv.a("getBrightness");
         int var7 = this.b(var1, var2, var3, var4);
         boolean var8 = false;
         int var10 = this.a(var2, var3, var4);
         int var11 = this.d(var2, var3, var4);
         if(var11 == 0) {
            var11 = 1;
         }

         boolean var12 = false;
         int var25;
         if(var1 == wl.a) {
            var25 = this.a(var7, var2, var3, var4, var10, var11);
         } else {
            var25 = this.d(var7, var2, var3, var4, var10, var11);
         }

         int var9;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         if(var25 > var7) {
            this.E[var6++] = 133152;
         } else if(var25 < var7) {
            if(var1 != wl.b) {
               ;
            }

            this.E[var6++] = 133152 + (var7 << 18);

            while(var5 < var6) {
               var9 = this.E[var5++];
               var10 = (var9 & 63) - 32 + var2;
               var11 = (var9 >> 6 & 63) - 32 + var3;
               var25 = (var9 >> 12 & 63) - 32 + var4;
               var13 = var9 >> 18 & 15;
               var14 = this.b(var1, var10, var11, var25);
               if(var14 == var13) {
                  this.a(var1, var10, var11, var25, 0);
                  if(var13 > 0) {
                     var15 = var10 - var2;
                     var16 = var11 - var3;
                     var17 = var25 - var4;
                     if(var15 < 0) {
                        var15 = -var15;
                     }

                     if(var16 < 0) {
                        var16 = -var16;
                     }

                     if(var17 < 0) {
                        var17 = -var17;
                     }

                     if(var15 + var16 + var17 < 17) {
                        for(int var18 = 0; var18 < 6; ++var18) {
                           int var19 = var18 % 2 * 2 - 1;
                           int var20 = var10 + var18 / 2 % 3 / 2 * var19;
                           int var21 = var11 + (var18 / 2 + 1) % 3 / 2 * var19;
                           int var22 = var25 + (var18 / 2 + 2) % 3 / 2 * var19;
                           var14 = this.b(var1, var20, var21, var22);
                           int var23 = pb.o[this.a(var20, var21, var22)];
                           if(var23 == 0) {
                              var23 = 1;
                           }

                           if(var14 == var13 - var23 && var6 < this.E.length) {
                              this.E[var6++] = var20 - var2 + 32 + (var21 - var3 + 32 << 6) + (var22 - var4 + 32 << 12) + (var13 - var23 << 18);
                           }
                        }
                     }
                  }
               }
            }

            var5 = 0;
         }

         lv.b();
         lv.a("tcp < tcc");

         while(var5 < var6) {
            var7 = this.E[var5++];
            int var24 = (var7 & 63) - 32 + var2;
            var9 = (var7 >> 6 & 63) - 32 + var3;
            var10 = (var7 >> 12 & 63) - 32 + var4;
            var11 = this.b(var1, var24, var9, var10);
            var25 = this.a(var24, var9, var10);
            var13 = pb.o[var25];
            if(var13 == 0) {
               var13 = 1;
            }

            boolean var26 = false;
            if(var1 == wl.a) {
               var14 = this.a(var11, var24, var9, var10, var25, var13);
            } else {
               var14 = this.d(var11, var24, var9, var10, var25, var13);
            }

            if(var14 != var11) {
               this.a(var1, var24, var9, var10, var14);
               if(var14 > var11) {
                  var15 = var24 - var2;
                  var16 = var9 - var3;
                  var17 = var10 - var4;
                  if(var15 < 0) {
                     var15 = -var15;
                  }

                  if(var16 < 0) {
                     var16 = -var16;
                  }

                  if(var17 < 0) {
                     var17 = -var17;
                  }

                  if(var15 + var16 + var17 < 17 && var6 < this.E.length - 6) {
                     if(this.b(var1, var24 - 1, var9, var10) < var14) {
                        this.E[var6++] = var24 - 1 - var2 + 32 + (var9 - var3 + 32 << 6) + (var10 - var4 + 32 << 12);
                     }

                     if(this.b(var1, var24 + 1, var9, var10) < var14) {
                        this.E[var6++] = var24 + 1 - var2 + 32 + (var9 - var3 + 32 << 6) + (var10 - var4 + 32 << 12);
                     }

                     if(this.b(var1, var24, var9 - 1, var10) < var14) {
                        this.E[var6++] = var24 - var2 + 32 + (var9 - 1 - var3 + 32 << 6) + (var10 - var4 + 32 << 12);
                     }

                     if(this.b(var1, var24, var9 + 1, var10) < var14) {
                        this.E[var6++] = var24 - var2 + 32 + (var9 + 1 - var3 + 32 << 6) + (var10 - var4 + 32 << 12);
                     }

                     if(this.b(var1, var24, var9, var10 - 1) < var14) {
                        this.E[var6++] = var24 - var2 + 32 + (var9 - var3 + 32 << 6) + (var10 - 1 - var4 + 32 << 12);
                     }

                     if(this.b(var1, var24, var9, var10 + 1) < var14) {
                        this.E[var6++] = var24 - var2 + 32 + (var9 - var3 + 32 << 6) + (var10 + 1 - var4 + 32 << 12);
                     }
                  }
               }
            }
         }

         lv.b();
      }
   }

   public boolean a(boolean var1) {
      int var2 = this.H.size();
      if(var2 != this.I.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if(var2 > 1000) {
            var2 = 1000;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            ml var4 = (ml)this.H.first();
            if(!var1 && var4.e > this.x.f()) {
               break;
            }

            this.H.remove(var4);
            this.I.remove(var4);
            byte var5 = 8;
            if(this.b(var4.a - var5, var4.b - var5, var4.c - var5, var4.a + var5, var4.b + var5, var4.c + var5)) {
               int var6 = this.a(var4.a, var4.b, var4.c);
               if(var6 == var4.d && var6 > 0) {
                  pb.m[var6].a(this, var4.a, var4.b, var4.c, this.r);
               }
            }
         }

         return this.H.size() != 0;
      }
   }

   public List a(ack var1, boolean var2) {
      ArrayList var3 = null;
      sj var4 = var1.l();
      int var5 = var4.a << 4;
      int var6 = var5 + 16;
      int var7 = var4.b << 4;
      int var8 = var7 + 16;
      Iterator var9 = this.I.iterator();

      while(var9.hasNext()) {
         ml var10 = (ml)var9.next();
         if(var10.a >= var5 && var10.a < var6 && var10.c >= var7 && var10.c < var8) {
            if(var2) {
               this.H.remove(var10);
               var9.remove();
            }

            if(var3 == null) {
               var3 = new ArrayList();
            }

            var3.add(var10);
         }
      }

      return var3;
   }

   public void v(int var1, int var2, int var3) {
      byte var4 = 16;
      Random var5 = new Random();

      for(int var6 = 0; var6 < 1000; ++var6) {
         int var7 = var1 + this.r.nextInt(var4) - this.r.nextInt(var4);
         int var8 = var2 + this.r.nextInt(var4) - this.r.nextInt(var4);
         int var9 = var3 + this.r.nextInt(var4) - this.r.nextInt(var4);
         int var10 = this.a(var7, var8, var9);
         if(var10 == 0 && this.r.nextInt(8) > var8 && this.t.j()) {
            this.a("depthsuspend", (double)((float)var7 + this.r.nextFloat()), (double)((float)var8 + this.r.nextFloat()), (double)((float)var9 + this.r.nextFloat()), 0.0D, 0.0D, 0.0D);
         } else if(var10 > 0) {
            pb.m[var10].b(this, var7, var8, var9, var5);
         }
      }

   }

   public List b(nn var1, wu var2) {
      this.S.clear();
      int var3 = gk.c((var2.a - 2.0D) / 16.0D);
      int var4 = gk.c((var2.d + 2.0D) / 16.0D);
      int var5 = gk.c((var2.c - 2.0D) / 16.0D);
      int var6 = gk.c((var2.f + 2.0D) / 16.0D);

      for(int var7 = var3; var7 <= var4; ++var7) {
         for(int var8 = var5; var8 <= var6; ++var8) {
            if(this.h(var7, var8)) {
               this.d(var7, var8).a(var1, var2, this.S);
            }
         }
      }

      return this.S;
   }

   public List a(Class var1, wu var2) {
      int var3 = gk.c((var2.a - 2.0D) / 16.0D);
      int var4 = gk.c((var2.d + 2.0D) / 16.0D);
      int var5 = gk.c((var2.c - 2.0D) / 16.0D);
      int var6 = gk.c((var2.f + 2.0D) / 16.0D);
      ArrayList var7 = new ArrayList();

      for(int var8 = var3; var8 <= var4; ++var8) {
         for(int var9 = var5; var9 <= var6; ++var9) {
            if(this.h(var8, var9)) {
               this.d(var8, var9).a(var1, var2, var7);
            }
         }
      }

      return var7;
   }

   public nn a(Class var1, wu var2, nn var3) {
      List var4 = this.a(var1, var2);
      nn var5 = null;
      double var6 = Double.MAX_VALUE;
      Iterator var8 = var4.iterator();

      while(var8.hasNext()) {
         nn var9 = (nn)var8.next();
         if(var9 != var3) {
            double var10 = var3.f(var9);
            if(var10 <= var6) {
               var5 = var9;
               var6 = var10;
            }
         }
      }

      return var5;
   }

   public List s() {
      return this.b;
   }

   public void b(int var1, int var2, int var3, kw var4) {
      if(this.j(var1, var2, var3)) {
         this.c(var1, var3).f();
      }

      for(int var5 = 0; var5 < this.u.size(); ++var5) {
         ((afk)this.u.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public int b(Class var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.b.size(); ++var3) {
         nn var4 = (nn)this.b.get(var3);
         if(var1.isAssignableFrom(var4.getClass())) {
            ++var2;
         }
      }

      return var2;
   }

   public void a(List var1) {
      this.b.addAll(var1);

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.c((nn)var1.get(var2));
      }

   }

   public void b(List var1) {
      this.G.addAll(var1);
   }

   public void t() {
      while(this.v.a()) {
         ;
      }

   }

   public boolean a(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      int var7 = this.a(var2, var3, var4);
      pb var8 = pb.m[var7];
      pb var9 = pb.m[var1];
      wu var10 = var9.c(this, var2, var3, var4);
      if(var5) {
         var10 = null;
      }

      if(var10 != null && !this.a(var10)) {
         return false;
      } else {
         if(var8 != null && (var8 == pb.A || var8 == pb.B || var8 == pb.C || var8 == pb.D || var8 == pb.ar || var8.cd.i())) {
            var8 = null;
         }

         return var1 > 0 && var8 == null && var9.d(this, var2, var3, var4, var6);
      }
   }

   public vu a(nn var1, nn var2, float var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      lv.a("pathfind");
      int var8 = gk.c(var1.o);
      int var9 = gk.c(var1.p + 1.0D);
      int var10 = gk.c(var1.q);
      int var11 = (int)(var3 + 16.0F);
      int var12 = var8 - var11;
      int var13 = var9 - var11;
      int var14 = var10 - var11;
      int var15 = var8 + var11;
      int var16 = var9 + var11;
      int var17 = var10 + var11;
      dv var18 = new dv(this, var12, var13, var14, var15, var16, var17);
      vu var19 = (new xv(var18, var4, var5, var6, var7)).a(var1, var2, var3);
      lv.b();
      return var19;
   }

   public vu a(nn var1, int var2, int var3, int var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      lv.a("pathfind");
      int var10 = gk.c(var1.o);
      int var11 = gk.c(var1.p);
      int var12 = gk.c(var1.q);
      int var13 = (int)(var5 + 8.0F);
      int var14 = var10 - var13;
      int var15 = var11 - var13;
      int var16 = var12 - var13;
      int var17 = var10 + var13;
      int var18 = var11 + var13;
      int var19 = var12 + var13;
      dv var20 = new dv(this, var14, var15, var16, var17, var18, var19);
      vu var21 = (new xv(var20, var6, var7, var8, var9)).a(var1, var2, var3, var4, var5);
      lv.b();
      return var21;
   }

   public boolean k(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      return var5 == 0?false:pb.m[var5].e(this, var1, var2, var3, var4);
   }

   public boolean w(int var1, int var2, int var3) {
      return this.k(var1, var2 - 1, var3, 0)?true:(this.k(var1, var2 + 1, var3, 1)?true:(this.k(var1, var2, var3 - 1, 2)?true:(this.k(var1, var2, var3 + 1, 3)?true:(this.k(var1 - 1, var2, var3, 4)?true:this.k(var1 + 1, var2, var3, 5)))));
   }

   public boolean l(int var1, int var2, int var3, int var4) {
      if(this.h(var1, var2, var3)) {
         return this.w(var1, var2, var3);
      } else {
         int var5 = this.a(var1, var2, var3);
         return var5 == 0?false:pb.m[var5].b((ali)this, var1, var2, var3, var4);
      }
   }

   public boolean x(int var1, int var2, int var3) {
      return this.l(var1, var2 - 1, var3, 0)?true:(this.l(var1, var2 + 1, var3, 1)?true:(this.l(var1, var2, var3 - 1, 2)?true:(this.l(var1, var2, var3 + 1, 3)?true:(this.l(var1 - 1, var2, var3, 4)?true:this.l(var1 + 1, var2, var3, 5)))));
   }

   public yw a(nn var1, double var2) {
      return this.a(var1.o, var1.p, var1.q, var2);
   }

   public yw a(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      yw var11 = null;

      for(int var12 = 0; var12 < this.d.size(); ++var12) {
         yw var13 = (yw)this.d.get(var12);
         double var14 = var13.f(var1, var3, var5);
         if((var7 < 0.0D || var14 < var7 * var7) && (var9 == -1.0D || var14 < var9)) {
            var9 = var14;
            var11 = var13;
         }
      }

      return var11;
   }

   public yw a(double var1, double var3, double var5) {
      double var7 = -1.0D;
      yw var9 = null;

      for(int var10 = 0; var10 < this.d.size(); ++var10) {
         yw var11 = (yw)this.d.get(var10);
         double var12 = var11.f(var1, var11.p, var3);
         if((var5 < 0.0D || var12 < var5 * var5) && (var7 == -1.0D || var12 < var7)) {
            var7 = var12;
            var9 = var11;
         }
      }

      return var9;
   }

   public yw b(nn var1, double var2) {
      return this.b(var1.o, var1.p, var1.q, var2);
   }

   public yw b(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      yw var11 = null;

      for(int var12 = 0; var12 < this.d.size(); ++var12) {
         yw var13 = (yw)this.d.get(var12);
         if(!var13.aT.a) {
            double var14 = var13.f(var1, var3, var5);
            if((var7 < 0.0D || var14 < var7 * var7) && (var9 == -1.0D || var14 < var9)) {
               var9 = var14;
               var11 = var13;
            }
         }
      }

      return var11;
   }

   public yw a(String var1) {
      for(int var2 = 0; var2 < this.d.size(); ++var2) {
         if(var1.equals(((yw)this.d.get(var2)).aA)) {
            return (yw)this.d.get(var2);
         }
      }

      return null;
   }

   public void g() {}

   public void u() {
      this.w.b();
   }

   public void a(long var1) {
      this.x.a(var1);
   }

   public long v() {
      return this.x.b();
   }

   public long w() {
      return this.x.f();
   }

   public uh x() {
      return new uh(this.x.c(), this.x.d(), this.x.e());
   }

   public void a(uh var1) {
      this.x.a(var1.a, var1.b, var1.c);
   }

   public void g(nn var1) {
      int var2 = gk.c(var1.o / 16.0D);
      int var3 = gk.c(var1.q / 16.0D);
      byte var4 = 2;

      for(int var5 = var2 - var4; var5 <= var2 + var4; ++var5) {
         for(int var6 = var3 - var4; var6 <= var3 + var4; ++var6) {
            this.d(var5, var6);
         }
      }

      if(!this.b.contains(var1)) {
         this.b.add(var1);
      }

   }

   public boolean a(yw var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(nn var1, byte var2) {}

   public void y() {
      this.b.removeAll(this.G);

      int var1;
      nn var2;
      int var3;
      int var4;
      for(var1 = 0; var1 < this.G.size(); ++var1) {
         var2 = (nn)this.G.get(var1);
         var3 = var2.ae;
         var4 = var2.ag;
         if(var2.ad && this.h(var3, var4)) {
            this.d(var3, var4).b(var2);
         }
      }

      for(var1 = 0; var1 < this.G.size(); ++var1) {
         this.d((nn)this.G.get(var1));
      }

      this.G.clear();

      for(var1 = 0; var1 < this.b.size(); ++var1) {
         var2 = (nn)this.b.get(var1);
         if(var2.j != null) {
            if(!var2.j.G && var2.j.i == var2) {
               continue;
            }

            var2.j.i = null;
            var2.j = null;
         }

         if(var2.G) {
            var3 = var2.ae;
            var4 = var2.ag;
            if(var2.ad && this.h(var3, var4)) {
               this.d(var3, var4).b(var2);
            }

            this.b.remove(var1--);
            this.d(var2);
         }
      }

   }

   public ca z() {
      return this.v;
   }

   public void f(int var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a(var1, var2, var3);
      if(var6 > 0) {
         pb.m[var6].b(this, var1, var2, var3, var4, var5);
      }

   }

   public akp A() {
      return this.w;
   }

   public wq B() {
      return this.x;
   }

   public void C() {
      this.N = !this.d.isEmpty();
      Iterator var1 = this.d.iterator();

      while(var1.hasNext()) {
         yw var2 = (yw)var1.next();
         if(!var2.az()) {
            this.N = false;
            break;
         }
      }

   }

   protected void D() {
      this.N = false;
      Iterator var1 = this.d.iterator();

      while(var1.hasNext()) {
         yw var2 = (yw)var1.next();
         if(var2.az()) {
            var2.a(false, false, true);
         }
      }

      this.L();
   }

   public boolean E() {
      if(this.N && !this.F) {
         Iterator var1 = this.d.iterator();

         yw var2;
         do {
            if(!var1.hasNext()) {
               return true;
            }

            var2 = (yw)var1.next();
         } while(var2.aA());

         return false;
      } else {
         return false;
      }
   }

   public float i(float var1) {
      return (this.k + (this.l - this.k) * var1) * this.j(var1);
   }

   public float j(float var1) {
      return this.i + (this.j - this.i) * var1;
   }

   public void k(float var1) {
      this.i = var1;
      this.j = var1;
   }

   public boolean F() {
      return (double)this.i(1.0F) > 0.9D;
   }

   public boolean G() {
      return (double)this.j(1.0F) > 0.2D;
   }

   public boolean y(int var1, int var2, int var3) {
      if(!this.G()) {
         return false;
      } else if(!this.m(var1, var2, var3)) {
         return false;
      } else if(this.f(var1, var3) > var2) {
         return false;
      } else {
         abn var4 = this.a(var1, var3);
         return var4.c()?false:var4.d();
      }
   }

   public boolean z(int var1, int var2, int var3) {
      abn var4 = this.a(var1, var3);
      return var4.e();
   }

   public void a(String var1, zk var2) {
      this.z.a(var1, var2);
   }

   public zk a(Class var1, String var2) {
      return this.z.a(var1, var2);
   }

   public int b(String var1) {
      return this.z.a(var1);
   }

   public void g(int var1, int var2, int var3, int var4, int var5) {
      this.a((yw)null, var1, var2, var3, var4, var5);
   }

   public void a(yw var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.u.size(); ++var7) {
         ((afk)this.u.get(var7)).a(var1, var2, var3, var4, var5, var6);
      }

   }

   public int b() {
      return 256;
   }

   public Random A(int var1, int var2, int var3) {
      long var4 = (long)var1 * 341873128712L + (long)var2 * 132897987541L + this.B().b() + (long)var3;
      this.r.setSeed(var4);
      return this.r;
   }

   public boolean H() {
      return false;
   }

   public bg a(acf var1, int var2, int var3, int var4) {
      List var5 = this.z().a(var1, var2, var3, var4);
      return var5 != null && !var5.isEmpty()?(bg)pk.a(this.r, (Collection)var5):null;
   }

   public qo b(String var1, int var2, int var3, int var4) {
      return this.z().a(this, var1, var2, var3, var4);
   }

   public boolean a() {
      return false;
   }

   public double I() {
      return this.x.t() == vx.c?0.0D:63.0D;
   }
}
