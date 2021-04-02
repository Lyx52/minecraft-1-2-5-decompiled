package mojang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ack {

   public static boolean a;
   private zg[] q;
   private byte[] r;
   public int[] b;
   public boolean[] c;
   public boolean d;
   public xd e;
   public int[] f;
   public final int g;
   public final int h;
   private boolean s;
   public Map i;
   public List[] j;
   public boolean k;
   public boolean l;
   public boolean m;
   public long n;
   public boolean o;
   private int t;
   boolean p;


   public ack(xd var1, int var2, int var3) {
      this.q = new zg[16];
      this.r = new byte[256];
      this.b = new int[256];
      this.c = new boolean[256];
      this.s = false;
      this.i = new HashMap();
      this.k = false;
      this.l = false;
      this.m = false;
      this.n = 0L;
      this.o = false;
      this.t = 4096;
      this.p = false;
      this.j = new List[16];
      this.e = var1;
      this.g = var2;
      this.h = var3;
      this.f = new int[256];

      for(int var4 = 0; var4 < this.j.length; ++var4) {
         this.j[var4] = new ArrayList();
      }

      Arrays.fill(this.b, -999);
      Arrays.fill(this.r, (byte)-1);
   }

   public ack(xd var1, byte[] var2, int var3, int var4) {
      this(var1, var3, var4);
      int var5 = var2.length / 256;

      for(int var6 = 0; var6 < 16; ++var6) {
         for(int var7 = 0; var7 < 16; ++var7) {
            for(int var8 = 0; var8 < var5; ++var8) {
               byte var9 = var2[var6 << 11 | var7 << 7 | var8];
               if(var9 != 0) {
                  int var10 = var8 >> 4;
                  if(this.q[var10] == null) {
                     this.q[var10] = new zg(var10 << 4);
                  }

                  this.q[var10].a(var6, var8 & 15, var7, var9);
               }
            }
         }
      }

   }

   public boolean a(int var1, int var2) {
      return var1 == this.g && var2 == this.h;
   }

   public int b(int var1, int var2) {
      return this.f[var2 << 4 | var1];
   }

   public int h() {
      for(int var1 = this.q.length - 1; var1 >= 0; --var1) {
         if(this.q[var1] != null) {
            return this.q[var1].c();
         }
      }

      return 0;
   }

   public zg[] i() {
      return this.q;
   }

   public void a() {
      int var1 = this.h();

      for(int var2 = 0; var2 < 16; ++var2) {
         int var3 = 0;

         while(var3 < 16) {
            this.b[var2 + (var3 << 4)] = -999;
            int var4 = var1 + 16 - 1;

            while(true) {
               if(var4 > 0) {
                  int var5 = this.a(var2, var4 - 1, var3);
                  if(pb.o[var5] == 0) {
                     --var4;
                     continue;
                  }

                  this.f[var3 << 4 | var2] = var4;
               }

               ++var3;
               break;
            }
         }
      }

      this.l = true;
   }

   public void b() {
      int var1 = this.h();

      int var2;
      int var3;
      for(var2 = 0; var2 < 16; ++var2) {
         var3 = 0;

         while(var3 < 16) {
            this.b[var2 + (var3 << 4)] = -999;
            int var4 = var1 + 16 - 1;

            while(true) {
               if(var4 > 0) {
                  if(this.b(var2, var4 - 1, var3) == 0) {
                     --var4;
                     continue;
                  }

                  this.f[var3 << 4 | var2] = var4;
               }

               if(!this.e.t.e) {
                  var4 = 15;
                  int var5 = var1 + 16 - 1;

                  do {
                     var4 -= this.b(var2, var5, var3);
                     if(var4 > 0) {
                        zg var6 = this.q[var5 >> 4];
                        if(var6 != null) {
                           var6.c(var2, var5 & 15, var3, var4);
                           this.e.p((this.g << 4) + var2, var5, (this.h << 4) + var3);
                        }
                     }

                     --var5;
                  } while(var5 > 0 && var4 > 0);
               }

               ++var3;
               break;
            }
         }
      }

      this.l = true;

      for(var2 = 0; var2 < 16; ++var2) {
         for(var3 = 0; var3 < 16; ++var3) {
            this.e(var2, var3);
         }
      }

   }

   public void c() {}

   private void e(int var1, int var2) {
      this.c[var1 + var2 * 16] = true;
      this.s = true;
   }

   private void p() {
      lv.a("recheckGaps");
      if(this.e.e(this.g * 16 + 8, 0, this.h * 16 + 8, 16)) {
         for(int var1 = 0; var1 < 16; ++var1) {
            for(int var2 = 0; var2 < 16; ++var2) {
               if(this.c[var1 + var2 * 16]) {
                  this.c[var1 + var2 * 16] = false;
                  int var3 = this.b(var1, var2);
                  int var4 = this.g * 16 + var1;
                  int var5 = this.h * 16 + var2;
                  int var6 = this.e.e(var4 - 1, var5);
                  int var7 = this.e.e(var4 + 1, var5);
                  int var8 = this.e.e(var4, var5 - 1);
                  int var9 = this.e.e(var4, var5 + 1);
                  if(var7 < var6) {
                     var6 = var7;
                  }

                  if(var8 < var6) {
                     var6 = var8;
                  }

                  if(var9 < var6) {
                     var6 = var9;
                  }

                  this.g(var4, var5, var6);
                  this.g(var4 - 1, var5, var3);
                  this.g(var4 + 1, var5, var3);
                  this.g(var4, var5 - 1, var3);
                  this.g(var4, var5 + 1, var3);
               }
            }
         }

         this.s = false;
      }

      lv.b();
   }

   private void g(int var1, int var2, int var3) {
      int var4 = this.e.e(var1, var2);
      if(var4 > var3) {
         this.d(var1, var2, var3, var4 + 1);
      } else if(var4 < var3) {
         this.d(var1, var2, var4, var3 + 1);
      }

   }

   private void d(int var1, int var2, int var3, int var4) {
      if(var4 > var3 && this.e.e(var1, 0, var2, 16)) {
         for(int var5 = var3; var5 < var4; ++var5) {
            this.e.c(wl.a, var1, var5, var2);
         }

         this.l = true;
      }

   }

   private void h(int var1, int var2, int var3) {
      int var4 = this.f[var3 << 4 | var1] & 255;
      int var5 = var4;
      if(var2 > var4) {
         var5 = var2;
      }

      while(var5 > 0 && this.b(var1, var5 - 1, var3) == 0) {
         --var5;
      }

      if(var5 != var4) {
         this.e.i(var1, var3, var5, var4);
         this.f[var3 << 4 | var1] = var5;
         int var6 = this.g * 16 + var1;
         int var7 = this.h * 16 + var3;
         int var8;
         int var12;
         if(!this.e.t.e) {
            zg var9;
            if(var5 < var4) {
               for(var8 = var5; var8 < var4; ++var8) {
                  var9 = this.q[var8 >> 4];
                  if(var9 != null) {
                     var9.c(var1, var8 & 15, var3, 15);
                     this.e.p((this.g << 4) + var1, var8, (this.h << 4) + var3);
                  }
               }
            } else {
               for(var8 = var4; var8 < var5; ++var8) {
                  var9 = this.q[var8 >> 4];
                  if(var9 != null) {
                     var9.c(var1, var8 & 15, var3, 0);
                     this.e.p((this.g << 4) + var1, var8, (this.h << 4) + var3);
                  }
               }
            }

            var8 = 15;

            while(var5 > 0 && var8 > 0) {
               --var5;
               var12 = this.b(var1, var5, var3);
               if(var12 == 0) {
                  var12 = 1;
               }

               var8 -= var12;
               if(var8 < 0) {
                  var8 = 0;
               }

               zg var10 = this.q[var5 >> 4];
               if(var10 != null) {
                  var10.c(var1, var5 & 15, var3, var8);
               }
            }
         }

         var8 = this.f[var3 << 4 | var1];
         var12 = var4;
         int var13 = var8;
         if(var8 < var4) {
            var12 = var8;
            var13 = var4;
         }

         if(!this.e.t.e) {
            this.d(var6 - 1, var7, var12, var13);
            this.d(var6 + 1, var7, var12, var13);
            this.d(var6, var7 - 1, var12, var13);
            this.d(var6, var7 + 1, var12, var13);
            this.d(var6, var7, var12, var13);
         }

         this.l = true;
      }
   }

   public int b(int var1, int var2, int var3) {
      return pb.o[this.a(var1, var2, var3)];
   }

   public int a(int var1, int var2, int var3) {
      if(var2 >> 4 >= this.q.length) {
         return 0;
      } else {
         zg var4 = this.q[var2 >> 4];
         return var4 != null?var4.a(var1, var2 & 15, var3):0;
      }
   }

   public int c(int var1, int var2, int var3) {
      if(var2 >> 4 >= this.q.length) {
         return 0;
      } else {
         zg var4 = this.q[var2 >> 4];
         return var4 != null?var4.b(var1, var2 & 15, var3):0;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3, var4, 0);
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var3 << 4 | var1;
      if(var2 >= this.b[var6] - 1) {
         this.b[var6] = -999;
      }

      int var7 = this.f[var6];
      int var8 = this.a(var1, var2, var3);
      if(var8 == var4 && this.c(var1, var2, var3) == var5) {
         return false;
      } else {
         zg var9 = this.q[var2 >> 4];
         boolean var10 = false;
         if(var9 == null) {
            if(var4 == 0) {
               return false;
            }

            var9 = this.q[var2 >> 4] = new zg(var2 >> 4 << 4);
            var10 = var2 >= var7;
         }

         var9.a(var1, var2 & 15, var3, var4);
         int var11 = this.g * 16 + var1;
         int var12 = this.h * 16 + var3;
         if(var8 != 0) {
            if(!this.e.F) {
               pb.m[var8].b_(this.e, var11, var2, var12);
            } else if(pb.m[var8] instanceof agy && var8 != var4) {
               this.e.q(var11, var2, var12);
            }
         }

         if(var9.a(var1, var2 & 15, var3) != var4) {
            return false;
         } else {
            var9.b(var1, var2 & 15, var3, var5);
            if(var10) {
               this.b();
            } else {
               if(pb.o[var4 & 4095] > 0) {
                  if(var2 >= var7) {
                     this.h(var1, var2 + 1, var3);
                  }
               } else if(var2 == var7 - 1) {
                  this.h(var1, var2, var3);
               }

               this.e(var1, var3);
            }

            kw var13;
            if(var4 != 0) {
               if(!this.e.F) {
                  pb.m[var4].a(this.e, var11, var2, var12);
               }

               if(pb.m[var4] instanceof agy) {
                  var13 = this.e(var1, var2, var3);
                  if(var13 == null) {
                     var13 = ((agy)pb.m[var4]).u_();
                     this.e.a(var11, var2, var12, var13);
                  }

                  if(var13 != null) {
                     var13.b();
                  }
               }
            } else if(var8 > 0 && pb.m[var8] instanceof agy) {
               var13 = this.e(var1, var2, var3);
               if(var13 != null) {
                  var13.b();
               }
            }

            this.l = true;
            return true;
         }
      }
   }

   public boolean b(int var1, int var2, int var3, int var4) {
      zg var5 = this.q[var2 >> 4];
      if(var5 == null) {
         return false;
      } else {
         int var6 = var5.b(var1, var2 & 15, var3);
         if(var6 == var4) {
            return false;
         } else {
            this.l = true;
            var5.b(var1, var2 & 15, var3, var4);
            int var7 = var5.a(var1, var2 & 15, var3);
            if(var7 > 0 && pb.m[var7] instanceof agy) {
               kw var8 = this.e(var1, var2, var3);
               if(var8 != null) {
                  var8.b();
                  var8.n = var4;
               }
            }

            return true;
         }
      }
   }

   public int a(wl var1, int var2, int var3, int var4) {
      zg var5 = this.q[var3 >> 4];
      return var5 == null?var1.c:(var1 == wl.a?var5.c(var2, var3 & 15, var4):(var1 == wl.b?var5.d(var2, var3 & 15, var4):var1.c));
   }

   public void a(wl var1, int var2, int var3, int var4, int var5) {
      zg var6 = this.q[var3 >> 4];
      if(var6 == null) {
         var6 = this.q[var3 >> 4] = new zg(var3 >> 4 << 4);
         this.b();
      }

      this.l = true;
      if(var1 == wl.a) {
         if(!this.e.t.e) {
            var6.c(var2, var3 & 15, var4, var5);
         }
      } else {
         if(var1 != wl.b) {
            return;
         }

         var6.d(var2, var3 & 15, var4, var5);
      }

   }

   public int c(int var1, int var2, int var3, int var4) {
      zg var5 = this.q[var2 >> 4];
      if(var5 == null) {
         return !this.e.t.e && var4 < wl.a.c?wl.a.c - var4:0;
      } else {
         int var6 = this.e.t.e?0:var5.c(var1, var2 & 15, var3);
         if(var6 > 0) {
            a = true;
         }

         var6 -= var4;
         int var7 = var5.d(var1, var2 & 15, var3);
         if(var7 > var6) {
            var6 = var7;
         }

         return var6;
      }
   }

   public void a(nn var1) {
      this.m = true;
      int var2 = gk.c(var1.o / 16.0D);
      int var3 = gk.c(var1.q / 16.0D);
      if(var2 != this.g || var3 != this.h) {
         System.out.println("Wrong location! " + var1);
         Thread.dumpStack();
      }

      int var4 = gk.c(var1.p / 16.0D);
      if(var4 < 0) {
         var4 = 0;
      }

      if(var4 >= this.j.length) {
         var4 = this.j.length - 1;
      }

      var1.ad = true;
      var1.ae = this.g;
      var1.af = var4;
      var1.ag = this.h;
      this.j[var4].add(var1);
   }

   public void b(nn var1) {
      this.a(var1, var1.af);
   }

   public void a(nn var1, int var2) {
      if(var2 < 0) {
         var2 = 0;
      }

      if(var2 >= this.j.length) {
         var2 = this.j.length - 1;
      }

      this.j[var2].remove(var1);
   }

   public boolean d(int var1, int var2, int var3) {
      return var2 >= this.f[var3 << 4 | var1];
   }

   public kw e(int var1, int var2, int var3) {
      qo var4 = new qo(var1, var2, var3);
      kw var5 = (kw)this.i.get(var4);
      if(var5 == null) {
         int var6 = this.a(var1, var2, var3);
         if(var6 <= 0 || !pb.m[var6].p()) {
            return null;
         }

         if(var5 == null) {
            var5 = ((agy)pb.m[var6]).u_();
            this.e.a(this.g * 16 + var1, var2, this.h * 16 + var3, var5);
         }

         var5 = (kw)this.i.get(var4);
      }

      if(var5 != null && var5.l()) {
         this.i.remove(var4);
         return null;
      } else {
         return var5;
      }
   }

   public void a(kw var1) {
      int var2 = var1.j - this.g * 16;
      int var3 = var1.k;
      int var4 = var1.l - this.h * 16;
      this.a(var2, var3, var4, var1);
      if(this.d) {
         this.e.c.add(var1);
      }

   }

   public void a(int var1, int var2, int var3, kw var4) {
      qo var5 = new qo(var1, var2, var3);
      var4.i = this.e;
      var4.j = this.g * 16 + var1;
      var4.k = var2;
      var4.l = this.h * 16 + var3;
      if(this.a(var1, var2, var3) != 0 && pb.m[this.a(var1, var2, var3)] instanceof agy) {
         var4.m();
         this.i.put(var5, var4);
      }
   }

   public void f(int var1, int var2, int var3) {
      qo var4 = new qo(var1, var2, var3);
      if(this.d) {
         kw var5 = (kw)this.i.remove(var4);
         if(var5 != null) {
            var5.h();
         }
      }

   }

   public void d() {
      this.d = true;
      this.e.a(this.i.values());

      for(int var1 = 0; var1 < this.j.length; ++var1) {
         this.e.a(this.j[var1]);
      }

   }

   public void e() {
      this.d = false;
      Iterator var1 = this.i.values().iterator();

      while(var1.hasNext()) {
         kw var2 = (kw)var1.next();
         this.e.a(var2);
      }

      for(int var3 = 0; var3 < this.j.length; ++var3) {
         this.e.b(this.j[var3]);
      }

   }

   public void f() {
      this.l = true;
   }

   public void a(nn var1, wu var2, List var3) {
      int var4 = gk.c((var2.b - 2.0D) / 16.0D);
      int var5 = gk.c((var2.e + 2.0D) / 16.0D);
      if(var4 < 0) {
         var4 = 0;
      }

      if(var5 >= this.j.length) {
         var5 = this.j.length - 1;
      }

      for(int var6 = var4; var6 <= var5; ++var6) {
         List var7 = this.j[var6];

         for(int var8 = 0; var8 < var7.size(); ++var8) {
            nn var9 = (nn)var7.get(var8);
            if(var9 != var1 && var9.y.a(var2)) {
               var3.add(var9);
               nn[] var10 = var9.Z();
               if(var10 != null) {
                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     var9 = var10[var11];
                     if(var9 != var1 && var9.y.a(var2)) {
                        var3.add(var9);
                     }
                  }
               }
            }
         }
      }

   }

   public void a(Class var1, wu var2, List var3) {
      int var4 = gk.c((var2.b - 2.0D) / 16.0D);
      int var5 = gk.c((var2.e + 2.0D) / 16.0D);
      if(var4 < 0) {
         var4 = 0;
      } else if(var4 >= this.j.length) {
         var4 = this.j.length - 1;
      }

      if(var5 >= this.j.length) {
         var5 = this.j.length - 1;
      } else if(var5 < 0) {
         var5 = 0;
      }

      for(int var6 = var4; var6 <= var5; ++var6) {
         List var7 = this.j[var6];

         for(int var8 = 0; var8 < var7.size(); ++var8) {
            nn var9 = (nn)var7.get(var8);
            if(var1.isAssignableFrom(var9.getClass()) && var9.y.a(var2)) {
               var3.add(var9);
            }
         }
      }

   }

   public boolean a(boolean var1) {
      if(var1) {
         if(this.m && this.e.w() != this.n) {
            return true;
         }
      } else if(this.m && this.e.w() >= this.n + 600L) {
         return true;
      }

      return this.l;
   }

   public Random a(long var1) {
      return new Random(this.e.v() + (long)(this.g * this.g * 4987142) + (long)(this.g * 5947611) + (long)(this.h * this.h) * 4392871L + (long)(this.h * 389711) ^ var1);
   }

   public boolean g() {
      return false;
   }

   public void j() {
      zg[] var1 = this.q;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         zg var4 = var1[var3];
         if(var4 != null) {
            var4.e();
         }
      }

   }

   public void a(ca var1, ca var2, int var3, int var4) {
      if(!this.k && var1.a(var3 + 1, var4 + 1) && var1.a(var3, var4 + 1) && var1.a(var3 + 1, var4)) {
         var1.a(var2, var3, var4);
      }

      if(var1.a(var3 - 1, var4) && !var1.b(var3 - 1, var4).k && var1.a(var3 - 1, var4 + 1) && var1.a(var3, var4 + 1) && var1.a(var3 - 1, var4 + 1)) {
         var1.a(var2, var3 - 1, var4);
      }

      if(var1.a(var3, var4 - 1) && !var1.b(var3, var4 - 1).k && var1.a(var3 + 1, var4 - 1) && var1.a(var3 + 1, var4 - 1) && var1.a(var3 + 1, var4)) {
         var1.a(var2, var3, var4 - 1);
      }

      if(var1.a(var3 - 1, var4 - 1) && !var1.b(var3 - 1, var4 - 1).k && var1.a(var3, var4 - 1) && var1.a(var3 - 1, var4)) {
         var1.a(var2, var3 - 1, var4 - 1);
      }

   }

   public int d(int var1, int var2) {
      int var3 = var1 | var2 << 4;
      int var4 = this.b[var3];
      if(var4 == -999) {
         int var5 = this.h() + 15;
         var4 = -1;

         while(var5 > 0 && var4 == -1) {
            int var6 = this.a(var1, var5, var2);
            acn var7 = var6 == 0?acn.a:pb.m[var6].cd;
            if(!var7.c() && !var7.d()) {
               --var5;
            } else {
               var4 = var5 + 1;
            }
         }

         this.b[var3] = var4;
      }

      return var4;
   }

   public void k() {
      if(this.s && !this.e.t.e) {
         this.p();
      }

   }

   public sj l() {
      return new sj(this.g, this.h);
   }

   public boolean c(int var1, int var2) {
      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 >= 256) {
         var2 = 255;
      }

      for(int var3 = var1; var3 <= var2; var3 += 16) {
         zg var4 = this.q[var3 >> 4];
         if(var4 != null && !var4.a()) {
            return false;
         }
      }

      return true;
   }

   public void a(zg[] var1) {
      this.q = var1;
   }

   public void a(byte[] var1, int var2, int var3, boolean var4) {
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < this.q.length; ++var6) {
         if((var2 & 1 << var6) != 0) {
            if(this.q[var6] == null) {
               this.q[var6] = new zg(var6 << 4);
            }

            byte[] var7 = this.q[var6].g();
            System.arraycopy(var1, var5, var7, 0, var7.length);
            var5 += var7.length;
         } else if(var4 && this.q[var6] != null) {
            this.q[var6] = null;
         }
      }

      qq var8;
      for(var6 = 0; var6 < this.q.length; ++var6) {
         if((var2 & 1 << var6) != 0 && this.q[var6] != null) {
            var8 = this.q[var6].j();
            System.arraycopy(var1, var5, var8.a, 0, var8.a.length);
            var5 += var8.a.length;
         }
      }

      for(var6 = 0; var6 < this.q.length; ++var6) {
         if((var2 & 1 << var6) != 0 && this.q[var6] != null) {
            var8 = this.q[var6].k();
            System.arraycopy(var1, var5, var8.a, 0, var8.a.length);
            var5 += var8.a.length;
         }
      }

      for(var6 = 0; var6 < this.q.length; ++var6) {
         if((var2 & 1 << var6) != 0 && this.q[var6] != null) {
            var8 = this.q[var6].l();
            System.arraycopy(var1, var5, var8.a, 0, var8.a.length);
            var5 += var8.a.length;
         }
      }

      for(var6 = 0; var6 < this.q.length; ++var6) {
         if((var3 & 1 << var6) != 0) {
            if(this.q[var6] == null) {
               var5 += 2048;
            } else {
               var8 = this.q[var6].i();
               if(var8 == null) {
                  var8 = this.q[var6].m();
               }

               System.arraycopy(var1, var5, var8.a, 0, var8.a.length);
               var5 += var8.a.length;
            }
         } else if(var4 && this.q[var6] != null && this.q[var6].i() != null) {
            this.q[var6].h();
         }
      }

      if(var4) {
         System.arraycopy(var1, var5, this.r, 0, this.r.length);
         int var10000 = var5 + this.r.length;
      }

      for(var6 = 0; var6 < this.q.length; ++var6) {
         if(this.q[var6] != null && (var2 & 1 << var6) != 0) {
            this.q[var6].d();
         }
      }

      this.a();
      Iterator var10 = this.i.values().iterator();

      while(var10.hasNext()) {
         kw var9 = (kw)var10.next();
         var9.b();
      }

   }

   public abn a(int var1, int var2, rs var3) {
      int var4 = this.r[var2 << 4 | var1] & 255;
      if(var4 == 255) {
         abn var5 = var3.a((this.g << 4) + var1, (this.h << 4) + var2);
         var4 = var5.M;
         this.r[var2 << 4 | var1] = (byte)(var4 & 255);
      }

      return abn.a[var4] == null?abn.c:abn.a[var4];
   }

   public byte[] m() {
      return this.r;
   }

   public void a(byte[] var1) {
      this.r = var1;
   }

   public void n() {
      this.t = 0;
   }

   public void o() {
      for(int var1 = 0; var1 < 8; ++var1) {
         if(this.t >= 4096) {
            return;
         }

         int var2 = this.t % 16;
         int var3 = this.t / 16 % 16;
         int var4 = this.t / 256;
         ++this.t;
         int var5 = (this.g << 4) + var3;
         int var6 = (this.h << 4) + var4;

         for(int var7 = 0; var7 < 16; ++var7) {
            int var8 = (var2 << 4) + var7;
            if(this.q[var2] == null && (var7 == 0 || var7 == 15 || var3 == 0 || var3 == 15 || var4 == 0 || var4 == 15) || this.q[var2] != null && this.q[var2].a(var3, var7, var4) == 0) {
               if(pb.q[this.e.a(var5, var8 - 1, var6)] > 0) {
                  this.e.u(var5, var8 - 1, var6);
               }

               if(pb.q[this.e.a(var5, var8 + 1, var6)] > 0) {
                  this.e.u(var5, var8 + 1, var6);
               }

               if(pb.q[this.e.a(var5 - 1, var8, var6)] > 0) {
                  this.e.u(var5 - 1, var8, var6);
               }

               if(pb.q[this.e.a(var5 + 1, var8, var6)] > 0) {
                  this.e.u(var5 + 1, var8, var6);
               }

               if(pb.q[this.e.a(var5, var8, var6 - 1)] > 0) {
                  this.e.u(var5, var8, var6 - 1);
               }

               if(pb.q[this.e.a(var5, var8, var6 + 1)] > 0) {
                  this.e.u(var5, var8, var6 + 1);
               }

               this.e.u(var5, var8, var6);
            }
         }
      }

   }
}
