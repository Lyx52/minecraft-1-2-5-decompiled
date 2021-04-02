package mojang;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class l implements afk {

   public List a = new ArrayList();
   private xd i;
   private aaw j;
   private List k = new ArrayList();
   private ct[] l;
   private ct[] m;
   private int n;
   private int o;
   private int p;
   private int q;
   private Minecraft r;
   private vl s;
   private IntBuffer t;
   private boolean u = false;
   private int v = 0;
   private int w;
   private int x;
   private int y;
   private int z;
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F = -1;
   private int G = 2;
   private int H;
   private int I;
   private int J;
   int[] b = new int['\uc350'];
   IntBuffer c = ew.d(64);
   private int K;
   private int L;
   private int M;
   private int N;
   private int O;
   private int P;
   private int Q;
   private List R = new ArrayList();
   private oc[] S = new oc[]{new oc(), new oc(), new oc(), new oc()};
   double d = -9999.0D;
   double e = -9999.0D;
   double f = -9999.0D;
   public float g;
   int h = 0;


   public l(Minecraft var1, aaw var2) {
      this.r = var1;
      this.j = var2;
      byte var3 = 34;
      byte var4 = 32;
      this.q = ew.a(var3 * var3 * var4 * 3);
      this.u = vm.a();
      if(this.u) {
         this.c.clear();
         this.t = ew.d(var3 * var3 * var4);
         this.t.clear();
         this.t.position(0);
         this.t.limit(var3 * var3 * var4);
         ARBOcclusionQuery.glGenQueriesARB(this.t);
      }

      this.w = ew.a(3);
      GL11.glPushMatrix();
      GL11.glNewList(this.w, 4864);
      this.f();
      GL11.glEndList();
      GL11.glPopMatrix();
      adz var5 = adz.a;
      this.x = this.w + 1;
      GL11.glNewList(this.x, 4864);
      byte var7 = 64;
      int var8 = 256 / var7 + 2;
      float var6 = 16.0F;

      int var9;
      int var10;
      for(var9 = -var7 * var8; var9 <= var7 * var8; var9 += var7) {
         for(var10 = -var7 * var8; var10 <= var7 * var8; var10 += var7) {
            var5.b();
            var5.a((double)(var9 + 0), (double)var6, (double)(var10 + 0));
            var5.a((double)(var9 + var7), (double)var6, (double)(var10 + 0));
            var5.a((double)(var9 + var7), (double)var6, (double)(var10 + var7));
            var5.a((double)(var9 + 0), (double)var6, (double)(var10 + var7));
            var5.a();
         }
      }

      GL11.glEndList();
      this.y = this.w + 2;
      GL11.glNewList(this.y, 4864);
      var6 = -16.0F;
      var5.b();

      for(var9 = -var7 * var8; var9 <= var7 * var8; var9 += var7) {
         for(var10 = -var7 * var8; var10 <= var7 * var8; var10 += var7) {
            var5.a((double)(var9 + var7), (double)var6, (double)(var10 + 0));
            var5.a((double)(var9 + 0), (double)var6, (double)(var10 + 0));
            var5.a((double)(var9 + 0), (double)var6, (double)(var10 + var7));
            var5.a((double)(var9 + var7), (double)var6, (double)(var10 + var7));
         }
      }

      var5.a();
      GL11.glEndList();
   }

   private void f() {
      Random var1 = new Random(10842L);
      adz var2 = adz.a;
      var2.b();

      for(int var3 = 0; var3 < 1500; ++var3) {
         double var4 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var10 = (double)(0.25F + var1.nextFloat() * 0.25F);
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if(var12 < 1.0D && var12 > 0.01D) {
            var12 = 1.0D / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * 100.0D;
            double var16 = var6 * 100.0D;
            double var18 = var8 * 100.0D;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var1.nextDouble() * 3.141592653589793D * 2.0D;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for(int var38 = 0; var38 < 4; ++var38) {
               double var39 = 0.0D;
               double var41 = (double)((var38 & 2) - 1) * var10;
               double var43 = (double)((var38 + 1 & 2) - 1) * var10;
               double var47 = var41 * var36 - var43 * var34;
               double var49 = var43 * var36 + var41 * var34;
               double var53 = var47 * var28 + var39 * var30;
               double var55 = var39 * var28 - var47 * var30;
               double var57 = var55 * var22 - var49 * var24;
               double var61 = var49 * var22 + var55 * var24;
               var2.a(var14 + var57, var16 + var53, var18 + var61);
            }
         }
      }

      var2.a();
   }

   public void a(xd var1) {
      if(this.i != null) {
         this.i.b((afk)this);
      }

      this.d = -9999.0D;
      this.e = -9999.0D;
      this.f = -9999.0D;
      ahu.a.a(var1);
      this.i = var1;
      this.s = new vl(var1);
      if(var1 != null) {
         var1.a((afk)this);
         this.a();
      }

   }

   public void a() {
      if(this.i != null) {
         pb.K.b(this.r.A.j);
         this.F = this.r.A.e;
         int var1;
         if(this.m != null) {
            for(var1 = 0; var1 < this.m.length; ++var1) {
               this.m[var1].c();
            }
         }

         var1 = 64 << 3 - this.F;
         if(var1 > 400) {
            var1 = 400;
         }

         this.n = var1 / 16 + 1;
         this.o = 16;
         this.p = var1 / 16 + 1;
         this.m = new ct[this.n * this.o * this.p];
         this.l = new ct[this.n * this.o * this.p];
         int var2 = 0;
         int var3 = 0;
         this.z = 0;
         this.A = 0;
         this.B = 0;
         this.C = this.n;
         this.D = this.o;
         this.E = this.p;

         int var4;
         for(var4 = 0; var4 < this.k.size(); ++var4) {
            ((ct)this.k.get(var4)).q = false;
         }

         this.k.clear();
         this.a.clear();

         for(var4 = 0; var4 < this.n; ++var4) {
            for(int var5 = 0; var5 < this.o; ++var5) {
               for(int var6 = 0; var6 < this.p; ++var6) {
                  this.m[(var6 * this.o + var5) * this.n + var4] = new ct(this.i, this.a, var4 * 16, var5 * 16, var6 * 16, this.q + var2);
                  if(this.u) {
                     this.m[(var6 * this.o + var5) * this.n + var4].v = this.t.get(var3);
                  }

                  this.m[(var6 * this.o + var5) * this.n + var4].u = false;
                  this.m[(var6 * this.o + var5) * this.n + var4].t = true;
                  this.m[(var6 * this.o + var5) * this.n + var4].l = true;
                  this.m[(var6 * this.o + var5) * this.n + var4].s = var3++;
                  this.m[(var6 * this.o + var5) * this.n + var4].f();
                  this.l[(var6 * this.o + var5) * this.n + var4] = this.m[(var6 * this.o + var5) * this.n + var4];
                  this.k.add(this.m[(var6 * this.o + var5) * this.n + var4]);
                  var2 += 3;
               }
            }
         }

         if(this.i != null) {
            acq var7 = this.r.i;
            if(var7 != null) {
               this.c(gk.c(var7.o), gk.c(var7.p), gk.c(var7.q));
               Arrays.sort(this.l, new gw(var7));
            }
         }

         this.G = 2;
      }
   }

   public void a(bo var1, amd var2, float var3) {
      if(this.G > 0) {
         --this.G;
      } else {
         lv.a("prepare");
         ach.a.a(this.i, this.j, this.r.q, this.r.i, var3);
         ahu.a.a(this.i, this.j, this.r.q, this.r.i, this.r.A, var3);
         ach.a.a();
         this.H = 0;
         this.I = 0;
         this.J = 0;
         acq var4 = this.r.i;
         ahu.b = var4.N + (var4.o - var4.N) * (double)var3;
         ahu.c = var4.O + (var4.p - var4.O) * (double)var3;
         ahu.d = var4.P + (var4.q - var4.P) * (double)var3;
         ach.b = var4.N + (var4.o - var4.N) * (double)var3;
         ach.c = var4.O + (var4.p - var4.O) * (double)var3;
         ach.d = var4.P + (var4.q - var4.P) * (double)var3;
         this.r.u.b((double)var3);
         lv.c("global");
         List var5 = this.i.s();
         this.H = var5.size();

         int var6;
         nn var7;
         for(var6 = 0; var6 < this.i.e.size(); ++var6) {
            var7 = (nn)this.i.e.get(var6);
            ++this.I;
            if(var7.a(var1)) {
               ahu.a.a(var7, var3);
            }
         }

         lv.c("entities");

         for(var6 = 0; var6 < var5.size(); ++var6) {
            var7 = (nn)var5.get(var6);
            if(var7.a(var1) && (var7.ak || var2.a(var7.y)) && (var7 != this.r.i || this.r.A.E != 0 || this.r.i.az()) && this.i.j(gk.c(var7.o), 0, gk.c(var7.q))) {
               ++this.I;
               ahu.a.a(var7, var3);
            }
         }

         lv.c("tileentities");
         tf.b();

         for(var6 = 0; var6 < this.a.size(); ++var6) {
            ach.a.a((kw)this.a.get(var6), var3);
         }

         this.r.u.a((double)var3);
         lv.b();
      }
   }

   public String b() {
      return "C: " + this.N + "/" + this.K + ". F: " + this.L + ", O: " + this.M + ", E: " + this.O;
   }

   public String c() {
      return "E: " + this.I + "/" + this.H + ". B: " + this.J + ", I: " + (this.H - this.J - this.I);
   }

   private void c(int var1, int var2, int var3) {
      var1 -= 8;
      var2 -= 8;
      var3 -= 8;
      this.z = Integer.MAX_VALUE;
      this.A = Integer.MAX_VALUE;
      this.B = Integer.MAX_VALUE;
      this.C = Integer.MIN_VALUE;
      this.D = Integer.MIN_VALUE;
      this.E = Integer.MIN_VALUE;
      int var4 = this.n * 16;
      int var5 = var4 / 2;

      for(int var6 = 0; var6 < this.n; ++var6) {
         int var7 = var6 * 16;
         int var8 = var7 + var5 - var1;
         if(var8 < 0) {
            var8 -= var4 - 1;
         }

         var8 /= var4;
         var7 -= var8 * var4;
         if(var7 < this.z) {
            this.z = var7;
         }

         if(var7 > this.C) {
            this.C = var7;
         }

         for(int var9 = 0; var9 < this.p; ++var9) {
            int var10 = var9 * 16;
            int var11 = var10 + var5 - var3;
            if(var11 < 0) {
               var11 -= var4 - 1;
            }

            var11 /= var4;
            var10 -= var11 * var4;
            if(var10 < this.B) {
               this.B = var10;
            }

            if(var10 > this.E) {
               this.E = var10;
            }

            for(int var12 = 0; var12 < this.o; ++var12) {
               int var13 = var12 * 16;
               if(var13 < this.A) {
                  this.A = var13;
               }

               if(var13 > this.D) {
                  this.D = var13;
               }

               ct var14 = this.m[(var9 * this.o + var12) * this.n + var6];
               boolean var15 = var14.q;
               var14.a(var7, var13, var10);
               if(!var15 && var14.q) {
                  this.k.add(var14);
               }
            }
         }
      }

   }

   public int a(acq var1, int var2, double var3) {
      lv.a("sortchunks");

      for(int var5 = 0; var5 < 10; ++var5) {
         this.Q = (this.Q + 1) % this.m.length;
         ct var6 = this.m[this.Q];
         if(var6.q && !this.k.contains(var6)) {
            this.k.add(var6);
         }
      }

      if(this.r.A.e != this.F) {
         this.a();
      }

      if(var2 == 0) {
         this.K = 0;
         this.P = 0;
         this.L = 0;
         this.M = 0;
         this.N = 0;
         this.O = 0;
      }

      double var33 = var1.N + (var1.o - var1.N) * var3;
      double var7 = var1.O + (var1.p - var1.O) * var3;
      double var9 = var1.P + (var1.q - var1.P) * var3;
      double var11 = var1.o - this.d;
      double var13 = var1.p - this.e;
      double var15 = var1.q - this.f;
      if(var11 * var11 + var13 * var13 + var15 * var15 > 16.0D) {
         this.d = var1.o;
         this.e = var1.p;
         this.f = var1.q;
         this.c(gk.c(var1.o), gk.c(var1.p), gk.c(var1.q));
         Arrays.sort(this.l, new gw(var1));
      }

      tf.a();
      byte var17 = 0;
      int var34;
      if(this.u && this.r.A.h && !this.r.A.g && var2 == 0) {
         byte var18 = 0;
         int var19 = 16;
         this.a(var18, var19);

         for(int var20 = var18; var20 < var19; ++var20) {
            this.l[var20].t = true;
         }

         lv.c("render");
         var34 = var17 + this.a(var18, var19, var2, var3);

         do {
            lv.c("occ");
            int var35 = var19;
            var19 *= 2;
            if(var19 > this.l.length) {
               var19 = this.l.length;
            }

            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glDisable(3008);
            GL11.glDisable(2912);
            GL11.glColorMask(false, false, false, false);
            GL11.glDepthMask(false);
            lv.a("check");
            this.a(var35, var19);
            lv.b();
            GL11.glPushMatrix();
            float var36 = 0.0F;
            float var21 = 0.0F;
            float var22 = 0.0F;

            for(int var23 = var35; var23 < var19; ++var23) {
               if(this.l[var23].e()) {
                  this.l[var23].l = false;
               } else {
                  if(!this.l[var23].l) {
                     this.l[var23].t = true;
                  }

                  if(this.l[var23].l && !this.l[var23].u) {
                     float var24 = gk.c(this.l[var23].a((nn)var1));
                     int var25 = (int)(1.0F + var24 / 128.0F);
                     if(this.v % var25 == var23 % var25) {
                        ct var26 = this.l[var23];
                        float var27 = (float)((double)var26.f - var33);
                        float var28 = (float)((double)var26.g - var7);
                        float var29 = (float)((double)var26.h - var9);
                        float var30 = var27 - var36;
                        float var31 = var28 - var21;
                        float var32 = var29 - var22;
                        if(var30 != 0.0F || var31 != 0.0F || var32 != 0.0F) {
                           GL11.glTranslatef(var30, var31, var32);
                           var36 += var30;
                           var21 += var31;
                           var22 += var32;
                        }

                        lv.a("bb");
                        ARBOcclusionQuery.glBeginQueryARB('\u8914', this.l[var23].v);
                        this.l[var23].d();
                        ARBOcclusionQuery.glEndQueryARB('\u8914');
                        lv.b();
                        this.l[var23].u = true;
                     }
                  }
               }
            }

            GL11.glPopMatrix();
            if(this.r.A.g) {
               if(lr.b == 0) {
                  GL11.glColorMask(false, true, true, true);
               } else {
                  GL11.glColorMask(true, false, false, true);
               }
            } else {
               GL11.glColorMask(true, true, true, true);
            }

            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glEnable(3008);
            GL11.glEnable(2912);
            lv.c("render");
            var34 += this.a(var35, var19, var2, var3);
         } while(var19 < this.l.length);
      } else {
         lv.c("render");
         var34 = var17 + this.a(0, this.l.length, var2, var3);
      }

      lv.b();
      return var34;
   }

   private void a(int var1, int var2) {
      for(int var3 = var1; var3 < var2; ++var3) {
         if(this.l[var3].u) {
            this.c.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(this.l[var3].v, '\u8867', this.c);
            if(this.c.get(0) != 0) {
               this.l[var3].u = false;
               this.c.clear();
               ARBOcclusionQuery.glGetQueryObjectuARB(this.l[var3].v, '\u8866', this.c);
               this.l[var3].t = this.c.get(0) != 0;
            }
         }
      }

   }

   private int a(int var1, int var2, int var3, double var4) {
      this.R.clear();
      int var6 = 0;

      for(int var7 = var1; var7 < var2; ++var7) {
         if(var3 == 0) {
            ++this.K;
            if(this.l[var7].m[var3]) {
               ++this.O;
            } else if(!this.l[var7].l) {
               ++this.L;
            } else if(this.u && !this.l[var7].t) {
               ++this.M;
            } else {
               ++this.N;
            }
         }

         if(!this.l[var7].m[var3] && this.l[var7].l && (!this.u || this.l[var7].t)) {
            int var8 = this.l[var7].a(var3);
            if(var8 >= 0) {
               this.R.add(this.l[var7]);
               ++var6;
            }
         }
      }

      acq var19 = this.r.i;
      double var20 = var19.N + (var19.o - var19.N) * var4;
      double var10 = var19.O + (var19.p - var19.O) * var4;
      double var12 = var19.P + (var19.q - var19.P) * var4;
      int var14 = 0;

      int var15;
      for(var15 = 0; var15 < this.S.length; ++var15) {
         this.S[var15].b();
      }

      for(var15 = 0; var15 < this.R.size(); ++var15) {
         ct var16 = (ct)this.R.get(var15);
         int var17 = -1;

         for(int var18 = 0; var18 < var14; ++var18) {
            if(this.S[var18].a(var16.f, var16.g, var16.h)) {
               var17 = var18;
            }
         }

         if(var17 < 0) {
            var17 = var14++;
            this.S[var17].a(var16.f, var16.g, var16.h, var20, var10, var12);
         }

         this.S[var17].a(var16.a(var3));
      }

      this.a(var3, var4);
      return var6;
   }

   public void a(int var1, double var2) {
      this.r.u.b(var2);

      for(int var4 = 0; var4 < this.S.length; ++var4) {
         this.S[var4].a();
      }

      this.r.u.a(var2);
   }

   public void d() {
      ++this.v;
   }

   public void a(float var1) {
      if(this.r.f.t.g == 1) {
         GL11.glDisable(2912);
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         tf.a();
         GL11.glDepthMask(false);
         this.j.b(this.j.b("/mojang/misc/tunnel.png"));
         adz var19 = adz.a;

         for(int var20 = 0; var20 < 6; ++var20) {
            GL11.glPushMatrix();
            if(var20 == 1) {
               GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            }

            if(var20 == 2) {
               GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            }

            if(var20 == 3) {
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            }

            if(var20 == 4) {
               GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
            }

            if(var20 == 5) {
               GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
            }

            var19.b();
            var19.c(1579032);
            var19.a(-100.0D, -100.0D, -100.0D, 0.0D, 0.0D);
            var19.a(-100.0D, -100.0D, 100.0D, 0.0D, 16.0D);
            var19.a(100.0D, -100.0D, 100.0D, 16.0D, 16.0D);
            var19.a(100.0D, -100.0D, -100.0D, 16.0D, 0.0D);
            var19.a();
            GL11.glPopMatrix();
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
         GL11.glEnable(3008);
      } else if(this.r.f.t.e()) {
         GL11.glDisable(3553);
         bo var2 = this.i.a(this.r.i, var1);
         float var3 = (float)var2.a;
         float var4 = (float)var2.b;
         float var5 = (float)var2.c;
         float var7;
         float var8;
         if(this.r.A.g) {
            float var6 = (var3 * 30.0F + var4 * 59.0F + var5 * 11.0F) / 100.0F;
            var7 = (var3 * 30.0F + var4 * 70.0F) / 100.0F;
            var8 = (var3 * 30.0F + var5 * 70.0F) / 100.0F;
            var3 = var6;
            var4 = var7;
            var5 = var8;
         }

         GL11.glColor3f(var3, var4, var5);
         adz var21 = adz.a;
         GL11.glDepthMask(false);
         GL11.glEnable(2912);
         GL11.glColor3f(var3, var4, var5);
         GL11.glCallList(this.x);
         GL11.glDisable(2912);
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         tf.a();
         float[] var22 = this.i.t.a(this.i.c(var1), var1);
         float var9;
         float var10;
         float var11;
         float var12;
         float var15;
         int var25;
         if(var22 != null) {
            GL11.glDisable(3553);
            GL11.glShadeModel(7425);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(gk.a(this.i.e(var1)) < 0.0F?180.0F:0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
            var8 = var22[0];
            var9 = var22[1];
            var10 = var22[2];
            float var13;
            if(this.r.A.g) {
               var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
               var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
               var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
               var8 = var11;
               var9 = var12;
               var10 = var13;
            }

            var21.a(6);
            var21.a(var8, var9, var10, var22[3]);
            var21.a(0.0D, 100.0D, 0.0D);
            byte var24 = 16;
            var21.a(var22[0], var22[1], var22[2], 0.0F);

            for(var25 = 0; var25 <= var24; ++var25) {
               var13 = (float)var25 * 3.1415927F * 2.0F / (float)var24;
               float var14 = gk.a(var13);
               var15 = gk.b(var13);
               var21.a((double)(var14 * 120.0F), (double)(var15 * 120.0F), (double)(-var15 * 40.0F * var22[3]));
            }

            var21.a();
            GL11.glPopMatrix();
            GL11.glShadeModel(7424);
         }

         GL11.glEnable(3553);
         GL11.glBlendFunc(770, 1);
         GL11.glPushMatrix();
         var7 = 1.0F - this.i.j(var1);
         var8 = 0.0F;
         var9 = 0.0F;
         var10 = 0.0F;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var7);
         GL11.glTranslatef(var8, var9, var10);
         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.i.c(var1) * 360.0F, 1.0F, 0.0F, 0.0F);
         var11 = 30.0F;
         GL11.glBindTexture(3553, this.j.b("/mojang/terrain/sun.png"));
         var21.b();
         var21.a((double)(-var11), 100.0D, (double)(-var11), 0.0D, 0.0D);
         var21.a((double)var11, 100.0D, (double)(-var11), 1.0D, 0.0D);
         var21.a((double)var11, 100.0D, (double)var11, 1.0D, 1.0D);
         var21.a((double)(-var11), 100.0D, (double)var11, 0.0D, 1.0D);
         var21.a();
         var11 = 20.0F;
         GL11.glBindTexture(3553, this.j.b("/mojang/terrain/moon_phases.png"));
         var25 = this.i.d(var1);
         int var26 = var25 % 4;
         int var27 = var25 / 4 % 2;
         var15 = (float)(var26 + 0) / 4.0F;
         float var16 = (float)(var27 + 0) / 2.0F;
         float var17 = (float)(var26 + 1) / 4.0F;
         float var18 = (float)(var27 + 1) / 2.0F;
         var21.b();
         var21.a((double)(-var11), -100.0D, (double)var11, (double)var17, (double)var18);
         var21.a((double)var11, -100.0D, (double)var11, (double)var15, (double)var18);
         var21.a((double)var11, -100.0D, (double)(-var11), (double)var15, (double)var16);
         var21.a((double)(-var11), -100.0D, (double)(-var11), (double)var17, (double)var16);
         var21.a();
         GL11.glDisable(3553);
         var12 = this.i.h(var1) * var7;
         if(var12 > 0.0F) {
            GL11.glColor4f(var12, var12, var12, var12);
            GL11.glCallList(this.w);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(3008);
         GL11.glEnable(2912);
         GL11.glPopMatrix();
         GL11.glDisable(3553);
         GL11.glColor3f(0.0F, 0.0F, 0.0F);
         double var23 = this.r.h.j(var1).b - this.i.I();
         if(var23 < 0.0D) {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 12.0F, 0.0F);
            GL11.glCallList(this.y);
            GL11.glPopMatrix();
            var9 = 1.0F;
            var10 = -((float)(var23 + 65.0D));
            var11 = -var9;
            var21.b();
            var21.a(0, 255);
            var21.a((double)(-var9), (double)var10, (double)var9);
            var21.a((double)var9, (double)var10, (double)var9);
            var21.a((double)var9, (double)var11, (double)var9);
            var21.a((double)(-var9), (double)var11, (double)var9);
            var21.a((double)(-var9), (double)var11, (double)(-var9));
            var21.a((double)var9, (double)var11, (double)(-var9));
            var21.a((double)var9, (double)var10, (double)(-var9));
            var21.a((double)(-var9), (double)var10, (double)(-var9));
            var21.a((double)var9, (double)var11, (double)(-var9));
            var21.a((double)var9, (double)var11, (double)var9);
            var21.a((double)var9, (double)var10, (double)var9);
            var21.a((double)var9, (double)var10, (double)(-var9));
            var21.a((double)(-var9), (double)var10, (double)(-var9));
            var21.a((double)(-var9), (double)var10, (double)var9);
            var21.a((double)(-var9), (double)var11, (double)var9);
            var21.a((double)(-var9), (double)var11, (double)(-var9));
            var21.a((double)(-var9), (double)var11, (double)(-var9));
            var21.a((double)(-var9), (double)var11, (double)var9);
            var21.a((double)var9, (double)var11, (double)var9);
            var21.a((double)var9, (double)var11, (double)(-var9));
            var21.a();
         }

         if(this.i.t.c()) {
            GL11.glColor3f(var3 * 0.2F + 0.04F, var4 * 0.2F + 0.04F, var5 * 0.6F + 0.1F);
         } else {
            GL11.glColor3f(var3, var4, var5);
         }

         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, -((float)(var23 - 16.0D)), 0.0F);
         GL11.glCallList(this.y);
         GL11.glPopMatrix();
         GL11.glEnable(3553);
         GL11.glDepthMask(true);
      }
   }

   public void b(float var1) {
      if(this.r.f.t.e()) {
         if(this.r.A.j) {
            this.c(var1);
         } else {
            GL11.glDisable(2884);
            float var2 = (float)(this.r.i.O + (this.r.i.p - this.r.i.O) * (double)var1);
            byte var3 = 32;
            int var4 = 256 / var3;
            adz var5 = adz.a;
            GL11.glBindTexture(3553, this.j.b("/mojang/environment/clouds.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            bo var6 = this.i.f(var1);
            float var7 = (float)var6.a;
            float var8 = (float)var6.b;
            float var9 = (float)var6.c;
            float var10;
            if(this.r.A.g) {
               var10 = (var7 * 30.0F + var8 * 59.0F + var9 * 11.0F) / 100.0F;
               float var11 = (var7 * 30.0F + var8 * 70.0F) / 100.0F;
               float var12 = (var7 * 30.0F + var9 * 70.0F) / 100.0F;
               var7 = var10;
               var8 = var11;
               var9 = var12;
            }

            var10 = 4.8828125E-4F;
            double var24 = (double)((float)this.v + var1);
            double var13 = this.r.i.l + (this.r.i.o - this.r.i.l) * (double)var1 + var24 * 0.029999999329447746D;
            double var15 = this.r.i.n + (this.r.i.q - this.r.i.n) * (double)var1;
            int var17 = gk.c(var13 / 2048.0D);
            int var18 = gk.c(var15 / 2048.0D);
            var13 -= (double)(var17 * 2048);
            var15 -= (double)(var18 * 2048);
            float var19 = this.i.t.f() - var2 + 0.33F;
            float var20 = (float)(var13 * (double)var10);
            float var21 = (float)(var15 * (double)var10);
            var5.b();
            var5.a(var7, var8, var9, 0.8F);

            for(int var22 = -var3 * var4; var22 < var3 * var4; var22 += var3) {
               for(int var23 = -var3 * var4; var23 < var3 * var4; var23 += var3) {
                  var5.a((double)(var22 + 0), (double)var19, (double)(var23 + var3), (double)((float)(var22 + 0) * var10 + var20), (double)((float)(var23 + var3) * var10 + var21));
                  var5.a((double)(var22 + var3), (double)var19, (double)(var23 + var3), (double)((float)(var22 + var3) * var10 + var20), (double)((float)(var23 + var3) * var10 + var21));
                  var5.a((double)(var22 + var3), (double)var19, (double)(var23 + 0), (double)((float)(var22 + var3) * var10 + var20), (double)((float)(var23 + 0) * var10 + var21));
                  var5.a((double)(var22 + 0), (double)var19, (double)(var23 + 0), (double)((float)(var22 + 0) * var10 + var20), (double)((float)(var23 + 0) * var10 + var21));
               }
            }

            var5.a();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(3042);
            GL11.glEnable(2884);
         }
      }
   }

   public boolean a(double var1, double var3, double var5, float var7) {
      return false;
   }

   public void c(float var1) {
      GL11.glDisable(2884);
      float var2 = (float)(this.r.i.O + (this.r.i.p - this.r.i.O) * (double)var1);
      adz var3 = adz.a;
      float var4 = 12.0F;
      float var5 = 4.0F;
      double var6 = (double)((float)this.v + var1);
      double var8 = (this.r.i.l + (this.r.i.o - this.r.i.l) * (double)var1 + var6 * 0.029999999329447746D) / (double)var4;
      double var10 = (this.r.i.n + (this.r.i.q - this.r.i.n) * (double)var1) / (double)var4 + 0.33000001311302185D;
      float var12 = this.i.t.f() - var2 + 0.33F;
      int var13 = gk.c(var8 / 2048.0D);
      int var14 = gk.c(var10 / 2048.0D);
      var8 -= (double)(var13 * 2048);
      var10 -= (double)(var14 * 2048);
      GL11.glBindTexture(3553, this.j.b("/mojang/environment/clouds.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      bo var15 = this.i.f(var1);
      float var16 = (float)var15.a;
      float var17 = (float)var15.b;
      float var18 = (float)var15.c;
      float var19;
      float var20;
      float var21;
      if(this.r.A.g) {
         var19 = (var16 * 30.0F + var17 * 59.0F + var18 * 11.0F) / 100.0F;
         var20 = (var16 * 30.0F + var17 * 70.0F) / 100.0F;
         var21 = (var16 * 30.0F + var18 * 70.0F) / 100.0F;
         var16 = var19;
         var17 = var20;
         var18 = var21;
      }

      var19 = (float)(var8 * 0.0D);
      var20 = (float)(var10 * 0.0D);
      var21 = 0.00390625F;
      var19 = (float)gk.c(var8) * var21;
      var20 = (float)gk.c(var10) * var21;
      float var22 = (float)(var8 - (double)gk.c(var8));
      float var23 = (float)(var10 - (double)gk.c(var10));
      byte var24 = 8;
      byte var25 = 4;
      float var26 = 9.765625E-4F;
      GL11.glScalef(var4, 1.0F, var4);

      for(int var27 = 0; var27 < 2; ++var27) {
         if(var27 == 0) {
            GL11.glColorMask(false, false, false, false);
         } else if(this.r.A.g) {
            if(lr.b == 0) {
               GL11.glColorMask(false, true, true, true);
            } else {
               GL11.glColorMask(true, false, false, true);
            }
         } else {
            GL11.glColorMask(true, true, true, true);
         }

         for(int var28 = -var25 + 1; var28 <= var25; ++var28) {
            for(int var29 = -var25 + 1; var29 <= var25; ++var29) {
               var3.b();
               float var30 = (float)(var28 * var24);
               float var31 = (float)(var29 * var24);
               float var32 = var30 - var22;
               float var33 = var31 - var23;
               if(var12 > -var5 - 1.0F) {
                  var3.a(var16 * 0.7F, var17 * 0.7F, var18 * 0.7F, 0.8F);
                  var3.b(0.0F, -1.0F, 0.0F);
                  var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
               }

               if(var12 <= var5 + 1.0F) {
                  var3.a(var16, var17, var18, 0.8F);
                  var3.b(0.0F, 1.0F, 0.0F);
                  var3.a((double)(var32 + 0.0F), (double)(var12 + var5 - var26), (double)(var33 + (float)var24), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + var5 - var26), (double)(var33 + (float)var24), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.a((double)(var32 + (float)var24), (double)(var12 + var5 - var26), (double)(var33 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  var3.a((double)(var32 + 0.0F), (double)(var12 + var5 - var26), (double)(var33 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
               }

               var3.a(var16 * 0.9F, var17 * 0.9F, var18 * 0.9F, 0.8F);
               int var34;
               if(var28 > -1) {
                  var3.b(-1.0F, 0.0F, 0.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + var5), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  }
               }

               if(var28 <= 1) {
                  var3.b(1.0F, 0.0F, 0.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + var5), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + var5), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                     var3.a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  }
               }

               var3.a(var16 * 0.8F, var17 * 0.8F, var18 * 0.8F, 0.8F);
               if(var29 > -1) {
                  var3.b(0.0F, 0.0F, -1.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.a((double)(var32 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + var5), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                  }
               }

               if(var29 <= 1) {
                  var3.b(0.0F, 0.0F, 1.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.a((double)(var32 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + var5), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                  }
               }

               var3.a();
            }
         }
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(2884);
   }

   public boolean a(acq var1, boolean var2) {
      boolean var3 = false;
      if(var3) {
         Collections.sort(this.k, new iw(var1));
         int var17 = this.k.size() - 1;
         int var18 = this.k.size();

         for(int var19 = 0; var19 < var18; ++var19) {
            ct var20 = (ct)this.k.get(var17 - var19);
            if(!var2) {
               if(var20.a((nn)var1) > 256.0F) {
                  if(var20.l) {
                     if(var19 >= 30) {
                        return false;
                     }
                  } else if(var19 >= 1) {
                     return false;
                  }
               }
            } else if(!var20.l) {
               continue;
            }

            var20.a();
            this.k.remove(var20);
            var20.q = false;
         }

         return this.k.size() == 0;
      } else {
         byte var4 = 2;
         iw var5 = new iw(var1);
         ct[] var6 = new ct[var4];
         ArrayList var7 = null;
         int var8 = this.k.size();
         int var9 = 0;

         int var10;
         ct var11;
         int var12;
         int var13;
         label168:
         for(var10 = 0; var10 < var8; ++var10) {
            var11 = (ct)this.k.get(var10);
            if(!var2) {
               if(var11.a((nn)var1) > 256.0F) {
                  for(var12 = 0; var12 < var4 && (var6[var12] == null || var5.a(var6[var12], var11) <= 0); ++var12) {
                     ;
                  }

                  --var12;
                  if(var12 > 0) {
                     var13 = var12;

                     while(true) {
                        --var13;
                        if(var13 == 0) {
                           var6[var12] = var11;
                           continue label168;
                        }

                        var6[var13 - 1] = var6[var13];
                     }
                  }
                  continue;
               }
            } else if(!var11.l) {
               continue;
            }

            if(var7 == null) {
               var7 = new ArrayList();
            }

            ++var9;
            var7.add(var11);
            this.k.set(var10, (Object)null);
         }

         if(var7 != null) {
            if(var7.size() > 1) {
               Collections.sort(var7, var5);
            }

            for(var10 = var7.size() - 1; var10 >= 0; --var10) {
               var11 = (ct)var7.get(var10);
               var11.a();
               var11.q = false;
            }
         }

         var10 = 0;

         int var21;
         for(var21 = var4 - 1; var21 >= 0; --var21) {
            ct var22 = var6[var21];
            if(var22 != null) {
               if(!var22.l && var21 != var4 - 1) {
                  var6[var21] = null;
                  var6[0] = null;
                  break;
               }

               var6[var21].a();
               var6[var21].q = false;
               ++var10;
            }
         }

         var21 = 0;
         var12 = 0;

         for(var13 = this.k.size(); var21 != var13; ++var21) {
            ct var14 = (ct)this.k.get(var21);
            if(var14 != null) {
               boolean var15 = false;

               for(int var16 = 0; var16 < var4 && !var15; ++var16) {
                  if(var14 == var6[var16]) {
                     var15 = true;
                  }
               }

               if(!var15) {
                  if(var12 != var21) {
                     this.k.set(var12, var14);
                  }

                  ++var12;
               }
            }
         }

         while(true) {
            --var21;
            if(var21 < var12) {
               return var8 == var9 + var10;
            }

            this.k.remove(var21);
         }
      }
   }

   public void a(yw var1, pl var2, int var3, aan var4, float var5) {
      adz var6 = adz.a;
      GL11.glEnable(3042);
      GL11.glEnable(3008);
      GL11.glBlendFunc(770, 1);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, (gk.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.4F) * 0.5F);
      int var8;
      if(var3 == 0) {
         if(this.g > 0.0F) {
            GL11.glBlendFunc(774, 768);
            int var7 = this.j.b("/mojang/terrain.png");
            GL11.glBindTexture(3553, var7);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
            GL11.glPushMatrix();
            var8 = this.i.a(var2.b, var2.c, var2.d);
            pb var9 = var8 > 0?pb.m[var8]:null;
            GL11.glDisable(3008);
            GL11.glPolygonOffset(-3.0F, -3.0F);
            GL11.glEnable('\u8037');
            double var10 = var1.N + (var1.o - var1.N) * (double)var5;
            double var12 = var1.O + (var1.p - var1.O) * (double)var5;
            double var14 = var1.P + (var1.q - var1.P) * (double)var5;
            if(var9 == null) {
               var9 = pb.t;
            }

            GL11.glEnable(3008);
            var6.b();
            var6.b(-var10, -var12, -var14);
            var6.c();
            this.s.a(var9, var2.b, var2.c, var2.d, 240 + (int)(this.g * 10.0F));
            var6.a();
            var6.b(0.0D, 0.0D, 0.0D);
            GL11.glDisable(3008);
            GL11.glPolygonOffset(0.0F, 0.0F);
            GL11.glDisable('\u8037');
            GL11.glEnable(3008);
            GL11.glDepthMask(true);
            GL11.glPopMatrix();
         }
      } else if(var4 != null) {
         GL11.glBlendFunc(770, 771);
         float var16 = gk.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.8F;
         GL11.glColor4f(var16, var16, var16, gk.a((float)System.currentTimeMillis() / 200.0F) * 0.2F + 0.5F);
         var8 = this.j.b("/mojang/terrain.png");
         GL11.glBindTexture(3553, var8);
         int var17 = var2.b;
         int var18 = var2.c;
         int var11 = var2.d;
         if(var2.e == 0) {
            --var18;
         }

         if(var2.e == 1) {
            ++var18;
         }

         if(var2.e == 2) {
            --var11;
         }

         if(var2.e == 3) {
            ++var11;
         }

         if(var2.e == 4) {
            --var17;
         }

         if(var2.e == 5) {
            ++var17;
         }
      }

      GL11.glDisable(3042);
      GL11.glDisable(3008);
   }

   public void b(yw var1, pl var2, int var3, aan var4, float var5) {
      if(var3 == 0 && var2.a == aat.a) {
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
         GL11.glLineWidth(2.0F);
         GL11.glDisable(3553);
         GL11.glDepthMask(false);
         float var6 = 0.002F;
         int var7 = this.i.a(var2.b, var2.c, var2.d);
         if(var7 > 0) {
            pb.m[var7].a((ali)this.i, var2.b, var2.c, var2.d);
            double var8 = var1.N + (var1.o - var1.N) * (double)var5;
            double var10 = var1.O + (var1.p - var1.O) * (double)var5;
            double var12 = var1.P + (var1.q - var1.P) * (double)var5;
            this.a(pb.m[var7].d(this.i, var2.b, var2.c, var2.d).b((double)var6, (double)var6, (double)var6).c(-var8, -var10, -var12));
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
      }

   }

   private void a(wu var1) {
      adz var2 = adz.a;
      var2.a(3);
      var2.a(var1.a, var1.b, var1.c);
      var2.a(var1.d, var1.b, var1.c);
      var2.a(var1.d, var1.b, var1.f);
      var2.a(var1.a, var1.b, var1.f);
      var2.a(var1.a, var1.b, var1.c);
      var2.a();
      var2.a(3);
      var2.a(var1.a, var1.e, var1.c);
      var2.a(var1.d, var1.e, var1.c);
      var2.a(var1.d, var1.e, var1.f);
      var2.a(var1.a, var1.e, var1.f);
      var2.a(var1.a, var1.e, var1.c);
      var2.a();
      var2.a(1);
      var2.a(var1.a, var1.b, var1.c);
      var2.a(var1.a, var1.e, var1.c);
      var2.a(var1.d, var1.b, var1.c);
      var2.a(var1.d, var1.e, var1.c);
      var2.a(var1.d, var1.b, var1.f);
      var2.a(var1.d, var1.e, var1.f);
      var2.a(var1.a, var1.b, var1.f);
      var2.a(var1.a, var1.e, var1.f);
      var2.a();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = gk.a(var1, 16);
      int var8 = gk.a(var2, 16);
      int var9 = gk.a(var3, 16);
      int var10 = gk.a(var4, 16);
      int var11 = gk.a(var5, 16);
      int var12 = gk.a(var6, 16);

      for(int var13 = var7; var13 <= var10; ++var13) {
         int var14 = var13 % this.n;
         if(var14 < 0) {
            var14 += this.n;
         }

         for(int var15 = var8; var15 <= var11; ++var15) {
            int var16 = var15 % this.o;
            if(var16 < 0) {
               var16 += this.o;
            }

            for(int var17 = var9; var17 <= var12; ++var17) {
               int var18 = var17 % this.p;
               if(var18 < 0) {
                  var18 += this.p;
               }

               int var19 = (var18 * this.o + var16) * this.n + var14;
               ct var20 = this.m[var19];
               if(!var20.q) {
                  this.k.add(var20);
                  var20.f();
               }
            }
         }
      }

   }

   public void a(int var1, int var2, int var3) {
      this.a(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   public void b(int var1, int var2, int var3) {
      this.a(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1);
   }

   public void a(amd var1, float var2) {
      for(int var3 = 0; var3 < this.m.length; ++var3) {
         if(!this.m[var3].e() && (!this.m[var3].l || (var3 + this.h & 15) == 0)) {
            this.m[var3].a(var1);
         }
      }

      ++this.h;
   }

   public void a(String var1, int var2, int var3, int var4) {
      if(var1 != null) {
         this.r.w.b("C418 - " + var1);
      }

      this.r.C.a(var1, (float)var2, (float)var3, (float)var4, 1.0F, 1.0F);
   }

   public void a(String var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = 16.0F;
      if(var8 > 1.0F) {
         var10 *= var8;
      }

      if(this.r.i.f(var2, var4, var6) < (double)(var10 * var10)) {
         this.r.C.b(var1, (float)var2, (float)var4, (float)var6, var8, var9);
      }

   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.b(var1, var2, var4, var6, var8, var10, var12);
   }

   public rt b(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      if(this.r != null && this.r.i != null && this.r.j != null) {
         int var14 = this.r.A.Q;
         if(var14 == 1 && this.i.r.nextInt(3) == 0) {
            var14 = 2;
         }

         double var15 = this.r.i.o - var2;
         double var17 = this.r.i.p - var4;
         double var19 = this.r.i.q - var6;
         Object var21 = null;
         if(var1.equals("hugeexplosion")) {
            this.r.j.a((rt)(var21 = new akw(this.i, var2, var4, var6, var8, var10, var12)));
         } else if(var1.equals("largeexplode")) {
            this.r.j.a((rt)(var21 = new im(this.j, this.i, var2, var4, var6, var8, var10, var12)));
         }

         if(var21 != null) {
            return (rt)var21;
         } else {
            double var22 = 16.0D;
            if(var15 * var15 + var17 * var17 + var19 * var19 > var22 * var22) {
               return null;
            } else if(var14 > 1) {
               return null;
            } else {
               if(var1.equals("bubble")) {
                  var21 = new vg(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("suspended")) {
                  var21 = new ky(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("depthsuspend")) {
                  var21 = new xy(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("townaura")) {
                  var21 = new xy(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("crit")) {
                  var21 = new sk(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("magicCrit")) {
                  var21 = new sk(this.i, var2, var4, var6, var8, var10, var12);
                  ((rt)var21).b(((rt)var21).o() * 0.3F, ((rt)var21).p() * 0.8F, ((rt)var21).r());
                  ((rt)var21).c(((rt)var21).s() + 1);
               } else if(var1.equals("smoke")) {
                  var21 = new alh(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("mobSpell")) {
                  var21 = new px(this.i, var2, var4, var6, 0.0D, 0.0D, 0.0D);
                  ((rt)var21).b((float)var8, (float)var10, (float)var12);
               } else if(var1.equals("spell")) {
                  var21 = new px(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("instantSpell")) {
                  var21 = new px(this.i, var2, var4, var6, var8, var10, var12);
                  ((px)var21).b(144);
               } else if(var1.equals("note")) {
                  var21 = new ac(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("portal")) {
                  var21 = new aep(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("enchantmenttable")) {
                  var21 = new afc(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("explode")) {
                  var21 = new yx(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("flame")) {
                  var21 = new mj(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("lava")) {
                  var21 = new ec(this.i, var2, var4, var6);
               } else if(var1.equals("footstep")) {
                  var21 = new yq(this.j, this.i, var2, var4, var6);
               } else if(var1.equals("splash")) {
                  var21 = new nw(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("largesmoke")) {
                  var21 = new alh(this.i, var2, var4, var6, var8, var10, var12, 2.5F);
               } else if(var1.equals("cloud")) {
                  var21 = new ajb(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("reddust")) {
                  var21 = new aab(this.i, var2, var4, var6, (float)var8, (float)var10, (float)var12);
               } else if(var1.equals("snowballpoof")) {
                  var21 = new ld(this.i, var2, var4, var6, yr.aD);
               } else if(var1.equals("dripWater")) {
                  var21 = new ga(this.i, var2, var4, var6, acn.g);
               } else if(var1.equals("dripLava")) {
                  var21 = new ga(this.i, var2, var4, var6, acn.h);
               } else if(var1.equals("snowshovel")) {
                  var21 = new jk(this.i, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("slime")) {
                  var21 = new ld(this.i, var2, var4, var6, yr.aM);
               } else if(var1.equals("heart")) {
                  var21 = new abm(this.i, var2, var4, var6, var8, var10, var12);
               } else {
                  int var24;
                  if(var1.startsWith("iconcrack_")) {
                     var24 = Integer.parseInt(var1.substring(var1.indexOf("_") + 1));
                     var21 = new ld(this.i, var2, var4, var6, var8, var10, var12, yr.e[var24]);
                  } else if(var1.startsWith("tilecrack_")) {
                     var24 = Integer.parseInt(var1.substring(var1.indexOf("_") + 1));
                     var21 = new mc(this.i, var2, var4, var6, var8, var10, var12, pb.m[var24], 0, 0);
                  }
               }

               if(var21 != null) {
                  this.r.j.a((rt)var21);
               }

               return (rt)var21;
            }
         }
      } else {
         return null;
      }
   }

   public void a(nn var1) {
      var1.S();
      if(var1.Z != null) {
         this.j.a(var1.Z, (js)(new mx()));
      }

      if(var1.aa != null) {
         this.j.a(var1.aa, (js)(new mx()));
      }

   }

   public void b(nn var1) {
      if(var1.Z != null) {
         this.j.c(var1.Z);
      }

      if(var1.aa != null) {
         this.j.c(var1.aa);
      }

   }

   public void a(int var1, int var2, int var3, kw var4) {}

   public void e() {
      ew.b(this.q);
   }

   public void a(yw var1, int var2, int var3, int var4, int var5, int var6) {
      Random var7 = this.i.r;
      int var8;
      double var10;
      double var12;
      String var14;
      int var15;
      double var21;
      double var23;
      double var25;
      double var27;
      double var29;
      double var33;
      switch(var2) {
      case 1000:
         this.i.a((double)var3, (double)var4, (double)var5, "random.click", 1.0F, 1.0F);
         break;
      case 1001:
         this.i.a((double)var3, (double)var4, (double)var5, "random.click", 1.0F, 1.2F);
         break;
      case 1002:
         this.i.a((double)var3, (double)var4, (double)var5, "random.bow", 1.0F, 1.2F);
         break;
      case 1003:
         if(Math.random() < 0.5D) {
            this.i.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "random.door_open", 1.0F, this.i.r.nextFloat() * 0.1F + 0.9F);
         } else {
            this.i.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "random.door_close", 1.0F, this.i.r.nextFloat() * 0.1F + 0.9F);
         }
         break;
      case 1004:
         this.i.a((double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), "random.fizz", 0.5F, 2.6F + (var7.nextFloat() - var7.nextFloat()) * 0.8F);
         break;
      case 1005:
         if(yr.e[var6] instanceof aid) {
            this.i.a(((aid)yr.e[var6]).a, var3, var4, var5);
         } else {
            this.i.a((String)null, var3, var4, var5);
         }
         break;
      case 1007:
         this.i.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mojang.mob.ghast.charge", 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1008:
         this.i.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mojang.mob.ghast.fireball", 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1010:
         this.i.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mojang.mob.zombie.wood", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1011:
         this.i.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mojang.mob.zombie.metal", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1012:
         this.i.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mojang.mob.zombie.woodbreak", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 2000:
         var8 = var6 % 3 - 1;
         int var35 = var6 / 3 % 3 - 1;
         var10 = (double)var3 + (double)var8 * 0.6D + 0.5D;
         var12 = (double)var4 + 0.5D;
         double var36 = (double)var5 + (double)var35 * 0.6D + 0.5D;

         for(int var38 = 0; var38 < 10; ++var38) {
            double var39 = var7.nextDouble() * 0.2D + 0.01D;
            double var40 = var10 + (double)var8 * 0.01D + (var7.nextDouble() - 0.5D) * (double)var35 * 0.5D;
            var21 = var12 + (var7.nextDouble() - 0.5D) * 0.5D;
            var23 = var36 + (double)var35 * 0.01D + (var7.nextDouble() - 0.5D) * (double)var8 * 0.5D;
            var25 = (double)var8 * var39 + var7.nextGaussian() * 0.01D;
            var27 = -0.03D + var7.nextGaussian() * 0.01D;
            var29 = (double)var35 * var39 + var7.nextGaussian() * 0.01D;
            this.a("smoke", var40, var21, var23, var25, var27, var29);
         }

         return;
      case 2001:
         var8 = var6 & 4095;
         if(var8 > 0) {
            pb var34 = pb.m[var8];
            this.r.C.b(var34.cb.a(), (float)var3 + 0.5F, (float)var4 + 0.5F, (float)var5 + 0.5F, (var34.cb.b() + 1.0F) / 2.0F, var34.cb.c() * 0.8F);
         }

         this.r.j.a(var3, var4, var5, var6 & 4095, var6 >> 12 & 255);
         break;
      case 2002:
         var33 = (double)var3;
         var10 = (double)var4;
         var12 = (double)var5;
         var14 = "iconcrack_" + yr.bs.bQ;

         for(var15 = 0; var15 < 8; ++var15) {
            this.a(var14, var33, var10, var12, var7.nextGaussian() * 0.15D, var7.nextDouble() * 0.2D, var7.nextGaussian() * 0.15D);
         }

         var15 = yr.bs.b(var6, 0);
         float var16 = (float)(var15 >> 16 & 255) / 255.0F;
         float var17 = (float)(var15 >> 8 & 255) / 255.0F;
         float var18 = (float)(var15 >> 0 & 255) / 255.0F;
         String var19 = "spell";
         if(yr.bs.d(var6)) {
            var19 = "instantSpell";
         }

         for(int var20 = 0; var20 < 100; ++var20) {
            var21 = var7.nextDouble() * 4.0D;
            var23 = var7.nextDouble() * 3.141592653589793D * 2.0D;
            var25 = Math.cos(var23) * var21;
            var27 = 0.01D + var7.nextDouble() * 0.5D;
            var29 = Math.sin(var23) * var21;
            rt var31 = this.b(var19, var33 + var25 * 0.1D, var10 + 0.3D, var12 + var29 * 0.1D, var25, var27, var29);
            if(var31 != null) {
               float var32 = 0.75F + var7.nextFloat() * 0.25F;
               var31.b(var16 * var32, var17 * var32, var18 * var32);
               var31.c((float)var21);
            }
         }

         this.i.a((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "random.glass", 1.0F, this.i.r.nextFloat() * 0.1F + 0.9F);
         break;
      case 2003:
         var33 = (double)var3 + 0.5D;
         var10 = (double)var4;
         var12 = (double)var5 + 0.5D;
         var14 = "iconcrack_" + yr.bA.bQ;

         for(var15 = 0; var15 < 8; ++var15) {
            this.a(var14, var33, var10, var12, var7.nextGaussian() * 0.15D, var7.nextDouble() * 0.2D, var7.nextGaussian() * 0.15D);
         }

         for(double var37 = 0.0D; var37 < 6.283185307179586D; var37 += 0.15707963267948966D) {
            this.a("portal", var33 + Math.cos(var37) * 5.0D, var10 - 0.4D, var12 + Math.sin(var37) * 5.0D, Math.cos(var37) * -5.0D, 0.0D, Math.sin(var37) * -5.0D);
            this.a("portal", var33 + Math.cos(var37) * 5.0D, var10 - 0.4D, var12 + Math.sin(var37) * 5.0D, Math.cos(var37) * -7.0D, 0.0D, Math.sin(var37) * -7.0D);
         }

         return;
      case 2004:
         for(var8 = 0; var8 < 20; ++var8) {
            double var9 = (double)var3 + 0.5D + ((double)this.i.r.nextFloat() - 0.5D) * 2.0D;
            double var11 = (double)var4 + 0.5D + ((double)this.i.r.nextFloat() - 0.5D) * 2.0D;
            double var13 = (double)var5 + 0.5D + ((double)this.i.r.nextFloat() - 0.5D) * 2.0D;
            this.i.a("smoke", var9, var11, var13, 0.0D, 0.0D, 0.0D);
            this.i.a("flame", var9, var11, var13, 0.0D, 0.0D, 0.0D);
         }
      }

   }
}
