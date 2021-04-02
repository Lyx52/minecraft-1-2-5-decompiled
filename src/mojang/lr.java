package mojang;

import java.awt.image.BufferedImage;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

public class lr {

   public static boolean a = false;
   public static int b;
   private Minecraft r;
   private float s = 0.0F;
   public mn c;
   private int t;
   private nn u = null;
   private ch v = new ch();
   private ch w = new ch();
   private ch x = new ch();
   private ch y = new ch();
   private ch z = new ch();
   private ch A = new ch();
   private float B = 4.0F;
   private float C = 4.0F;
   private float D = 0.0F;
   private float E = 0.0F;
   private float F = 0.0F;
   private float G = 0.0F;
   private float H;
   private float I;
   private float J;
   private float K;
   private float L;
   private float M = 0.0F;
   private float N = 0.0F;
   private float O = 0.0F;
   private float P = 0.0F;
   public int d;
   private int[] Q;
   private float R;
   private float S;
   private float T;
   private boolean U = false;
   private double V = 1.0D;
   private double W = 0.0D;
   private double X = 0.0D;
   private long Y = System.currentTimeMillis();
   private long Z = 0L;
   private boolean aa = false;
   float e = 0.0F;
   float f = 0.0F;
   float g = 0.0F;
   float h = 0.0F;
   private Random ab = new Random();
   private int ac = 0;
   float[] i;
   float[] j;
   volatile int k = 0;
   volatile int l = 0;
   FloatBuffer m = ew.e(16);
   float n;
   float o;
   float p;
   private float ad;
   private float ae;
   public int q;


   public lr(Minecraft var1) {
      this.r = var1;
      this.c = new mn(var1);
      this.d = var1.p.a(new BufferedImage(16, 16, 1));
      this.Q = new int[256];
   }

   public void a() {
      this.c();
      this.d();
      this.ad = this.ae;
      this.C = this.B;
      this.E = this.D;
      this.G = this.F;
      this.N = this.M;
      this.P = this.O;
      float var1;
      float var2;
      if(this.r.A.J) {
         var1 = this.r.A.c * 0.6F + 0.2F;
         var2 = var1 * var1 * var1 * 8.0F;
         this.J = this.v.a(this.H, 0.05F * var2);
         this.K = this.w.a(this.I, 0.05F * var2);
         this.L = 0.0F;
         this.H = 0.0F;
         this.I = 0.0F;
      }

      if(this.r.i == null) {
         this.r.i = this.r.h;
      }

      var1 = this.r.f.c(gk.c(this.r.i.o), gk.c(this.r.i.p), gk.c(this.r.i.q));
      var2 = (float)(3 - this.r.A.e) / 3.0F;
      float var3 = var1 * (1.0F - var2) + var2;
      this.ae += (var3 - this.ae) * 0.1F;
      ++this.t;
      this.c.a();
      this.f();
   }

   public void a(float var1) {
      if(this.r.i != null) {
         if(this.r.f != null) {
            double var2 = (double)this.r.c.b();
            this.r.z = this.r.i.a(var2, var1);
            double var4 = var2;
            bo var6 = this.r.i.j(var1);
            if(this.r.c.i()) {
               var2 = 6.0D;
               var4 = 6.0D;
            } else {
               if(var2 > 3.0D) {
                  var4 = 3.0D;
               }

               var2 = var4;
            }

            if(this.r.z != null) {
               var4 = this.r.z.f.d(var6);
            }

            bo var7 = this.r.i.k(var1);
            bo var8 = var6.c(var7.a * var2, var7.b * var2, var7.c * var2);
            this.u = null;
            float var9 = 1.0F;
            List var10 = this.r.f.b((nn)this.r.i, this.r.i.y.a(var7.a * var2, var7.b * var2, var7.c * var2).b((double)var9, (double)var9, (double)var9));
            double var11 = var4;

            for(int var13 = 0; var13 < var10.size(); ++var13) {
               nn var14 = (nn)var10.get(var13);
               if(var14.l_()) {
                  float var15 = var14.j_();
                  wu var16 = var14.y.b((double)var15, (double)var15, (double)var15);
                  pl var17 = var16.a(var6, var8);
                  if(var16.a(var6)) {
                     if(0.0D < var11 || var11 == 0.0D) {
                        this.u = var14;
                        var11 = 0.0D;
                     }
                  } else if(var17 != null) {
                     double var18 = var6.d(var17.f);
                     if(var18 < var11 || var11 == 0.0D) {
                        this.u = var14;
                        var11 = var18;
                     }
                  }
               }
            }

            if(this.u != null && (var11 < var4 || this.r.z == null)) {
               this.r.z = new pl(this.u);
            }

         }
      }
   }

   private void c() {
      vq var1 = (vq)this.r.i;
      this.T = var1.I_();
      this.S = this.R;
      this.R += (this.T - this.R) * 0.5F;
   }

   private float a(float var1, boolean var2) {
      if(this.q > 0) {
         return 90.0F;
      } else {
         yw var3 = (yw)this.r.i;
         float var4 = 70.0F;
         if(var2) {
            var4 += this.r.A.N * 40.0F;
            var4 *= this.S + (this.R - this.S) * var1;
         }

         if(var3.bb() <= 0) {
            float var5 = (float)var3.bD + var1;
            var4 /= (1.0F - 500.0F / (var5 + 500.0F)) * 2.0F + 1.0F;
         }

         int var6 = aau.a(this.r.f, var3, var1);
         if(var6 != 0 && pb.m[var6].cd == acn.g) {
            var4 = var4 * 60.0F / 70.0F;
         }

         return var4 + this.N + (this.M - this.N) * var1;
      }
   }

   private void d(float var1) {
      acq var2 = this.r.i;
      float var3 = (float)var2.bA - var1;
      float var4;
      if(var2.bb() <= 0) {
         var4 = (float)var2.bD + var1;
         GL11.glRotatef(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
      }

      if(var3 >= 0.0F) {
         var3 /= (float)var2.bB;
         var3 = gk.a(var3 * var3 * var3 * var3 * 3.1415927F);
         var4 = var2.bC;
         GL11.glRotatef(-var4, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(var4, 0.0F, 1.0F, 0.0F);
      }
   }

   private void e(float var1) {
      if(this.r.i instanceof yw) {
         yw var2 = (yw)this.r.i;
         float var3 = var2.L - var2.K;
         float var4 = -(var2.L + var3 * var1);
         float var5 = var2.aw + (var2.ax - var2.aw) * var1;
         float var6 = var2.bF + (var2.bG - var2.bF) * var1;
         GL11.glTranslatef(gk.a(var4 * 3.1415927F) * var5 * 0.5F, -Math.abs(gk.b(var4 * 3.1415927F) * var5), 0.0F);
         GL11.glRotatef(gk.a(var4 * 3.1415927F) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(Math.abs(gk.b(var4 * 3.1415927F - 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
      }
   }

   private void f(float var1) {
      acq var2 = this.r.i;
      float var3 = var2.H - 1.62F;
      double var4 = var2.l + (var2.o - var2.l) * (double)var1;
      double var6 = var2.m + (var2.p - var2.m) * (double)var1 - (double)var3;
      double var8 = var2.n + (var2.q - var2.n) * (double)var1;
      GL11.glRotatef(this.P + (this.O - this.P) * var1, 0.0F, 0.0F, 1.0F);
      if(var2.az()) {
         var3 = (float)((double)var3 + 1.0D);
         GL11.glTranslatef(0.0F, 0.3F, 0.0F);
         if(!this.r.A.K) {
            int var10 = this.r.f.a(gk.c(var2.o), gk.c(var2.p), gk.c(var2.q));
            if(var10 == pb.S.bO) {
               int var11 = this.r.f.e(gk.c(var2.o), gk.c(var2.p), gk.c(var2.q));
               int var12 = var11 & 3;
               GL11.glRotatef((float)(var12 * 90), 0.0F, 1.0F, 0.0F);
            }

            GL11.glRotatef(var2.w + (var2.u - var2.w) * var1 + 180.0F, 0.0F, -1.0F, 0.0F);
            GL11.glRotatef(var2.x + (var2.v - var2.x) * var1, -1.0F, 0.0F, 0.0F);
         }
      } else if(this.r.A.E > 0) {
         double var27 = (double)(this.C + (this.B - this.C) * var1);
         float var13;
         float var28;
         if(this.r.A.K) {
            var28 = this.E + (this.D - this.E) * var1;
            var13 = this.G + (this.F - this.G) * var1;
            GL11.glTranslatef(0.0F, 0.0F, (float)(-var27));
            GL11.glRotatef(var13, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var28, 0.0F, 1.0F, 0.0F);
         } else {
            var28 = var2.u;
            var13 = var2.v;
            if(this.r.A.E == 2) {
               var13 += 180.0F;
            }

            double var14 = (double)(-gk.a(var28 / 180.0F * 3.1415927F) * gk.b(var13 / 180.0F * 3.1415927F)) * var27;
            double var16 = (double)(gk.b(var28 / 180.0F * 3.1415927F) * gk.b(var13 / 180.0F * 3.1415927F)) * var27;
            double var18 = (double)(-gk.a(var13 / 180.0F * 3.1415927F)) * var27;

            for(int var20 = 0; var20 < 8; ++var20) {
               float var21 = (float)((var20 & 1) * 2 - 1);
               float var22 = (float)((var20 >> 1 & 1) * 2 - 1);
               float var23 = (float)((var20 >> 2 & 1) * 2 - 1);
               var21 *= 0.1F;
               var22 *= 0.1F;
               var23 *= 0.1F;
               pl var24 = this.r.f.a(bo.b(var4 + (double)var21, var6 + (double)var22, var8 + (double)var23), bo.b(var4 - var14 + (double)var21 + (double)var23, var6 - var18 + (double)var22, var8 - var16 + (double)var23));
               if(var24 != null) {
                  double var25 = var24.f.d(bo.b(var4, var6, var8));
                  if(var25 < var27) {
                     var27 = var25;
                  }
               }
            }

            if(this.r.A.E == 2) {
               GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            }

            GL11.glRotatef(var2.v - var13, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var2.u - var28, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, 0.0F, (float)(-var27));
            GL11.glRotatef(var28 - var2.u, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var13 - var2.v, 1.0F, 0.0F, 0.0F);
         }
      } else {
         GL11.glTranslatef(0.0F, 0.0F, -0.1F);
      }

      if(!this.r.A.K) {
         GL11.glRotatef(var2.x + (var2.v - var2.x) * var1, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var2.w + (var2.u - var2.w) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
      }

      GL11.glTranslatef(0.0F, var3, 0.0F);
      var4 = var2.l + (var2.o - var2.l) * (double)var1;
      var6 = var2.m + (var2.p - var2.m) * (double)var1 - (double)var3;
      var8 = var2.n + (var2.q - var2.n) * (double)var1;
      this.U = this.r.g.a(var4, var6, var8, var1);
   }

   private void a(float var1, int var2) {
      this.s = (float)(256 >> this.r.A.e);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      float var3 = 0.07F;
      if(this.r.A.g) {
         GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
      }

      if(this.V != 1.0D) {
         GL11.glTranslatef((float)this.W, (float)(-this.X), 0.0F);
         GL11.glScaled(this.V, this.V, 1.0D);
      }

      GLU.gluPerspective(this.a(var1, true), (float)this.r.d / (float)this.r.e, 0.05F, this.s * 2.0F);
      float var4;
      if(this.r.c.e()) {
         var4 = 0.6666667F;
         GL11.glScalef(1.0F, var4, 1.0F);
      }

      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      if(this.r.A.g) {
         GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }

      this.d(var1);
      if(this.r.A.f) {
         this.e(var1);
      }

      var4 = this.r.h.aS + (this.r.h.aR - this.r.h.aS) * var1;
      if(var4 > 0.0F) {
         byte var5 = 20;
         if(this.r.h.a(aad.k)) {
            var5 = 7;
         }

         float var6 = 5.0F / (var4 * var4 + 5.0F) - var4 * 0.04F;
         var6 *= var6;
         GL11.glRotatef(((float)this.t + var1) * (float)var5, 0.0F, 1.0F, 1.0F);
         GL11.glScalef(1.0F / var6, 1.0F, 1.0F);
         GL11.glRotatef(-((float)this.t + var1) * (float)var5, 0.0F, 1.0F, 1.0F);
      }

      this.f(var1);
      if(this.q > 0) {
         int var7 = this.q - 1;
         if(var7 == 1) {
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var7 == 2) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var7 == 3) {
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var7 == 4) {
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         }

         if(var7 == 5) {
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
         }
      }

   }

   private void b(float var1, int var2) {
      if(this.q <= 0) {
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         float var3 = 0.07F;
         if(this.r.A.g) {
            GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
         }

         if(this.V != 1.0D) {
            GL11.glTranslatef((float)this.W, (float)(-this.X), 0.0F);
            GL11.glScaled(this.V, this.V, 1.0D);
         }

         GLU.gluPerspective(this.a(var1, false), (float)this.r.d / (float)this.r.e, 0.05F, this.s * 2.0F);
         if(this.r.c.e()) {
            float var4 = 0.6666667F;
            GL11.glScalef(1.0F, var4, 1.0F);
         }

         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         if(this.r.A.g) {
            GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
         }

         GL11.glPushMatrix();
         this.d(var1);
         if(this.r.A.f) {
            this.e(var1);
         }

         if(this.r.A.E == 0 && !this.r.i.az() && !this.r.A.D && !this.r.c.e()) {
            this.b((double)var1);
            this.c.a(var1);
            this.a((double)var1);
         }

         GL11.glPopMatrix();
         if(this.r.A.E == 0 && !this.r.i.az()) {
            this.c.b(var1);
            this.d(var1);
         }

         if(this.r.A.f) {
            this.e(var1);
         }

      }
   }

   public void a(double var1) {
      es.a(es.b);
      GL11.glDisable(3553);
      es.a(es.a);
   }

   public void b(double var1) {
      es.a(es.b);
      GL11.glMatrixMode(5890);
      GL11.glLoadIdentity();
      float var3 = 0.00390625F;
      GL11.glScalef(var3, var3, var3);
      GL11.glTranslatef(8.0F, 8.0F, 8.0F);
      GL11.glMatrixMode(5888);
      this.r.p.b(this.d);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 10496);
      GL11.glTexParameteri(3553, 10243, 10496);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      es.a(es.a);
   }

   private void d() {
      this.f = (float)((double)this.f + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.h = (float)((double)this.h + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.f = (float)((double)this.f * 0.9D);
      this.h = (float)((double)this.h * 0.9D);
      this.e += (this.f - this.e) * 1.0F;
      this.g += (this.h - this.g) * 1.0F;
      this.aa = true;
   }

   private void e() {
      xd var1 = this.r.f;
      if(var1 != null) {
         for(int var2 = 0; var2 < 256; ++var2) {
            float var3 = var1.b(1.0F) * 0.95F + 0.05F;
            float var4 = var1.t.f[var2 / 16] * var3;
            float var5 = var1.t.f[var2 % 16] * (this.e * 0.1F + 1.5F);
            if(var1.n > 0) {
               var4 = var1.t.f[var2 / 16];
            }

            float var6 = var4 * (var1.b(1.0F) * 0.65F + 0.35F);
            float var7 = var4 * (var1.b(1.0F) * 0.65F + 0.35F);
            float var10 = var5 * ((var5 * 0.6F + 0.4F) * 0.6F + 0.4F);
            float var11 = var5 * (var5 * var5 * 0.6F + 0.4F);
            float var12 = var6 + var5;
            float var13 = var7 + var10;
            float var14 = var4 + var11;
            var12 = var12 * 0.96F + 0.03F;
            var13 = var13 * 0.96F + 0.03F;
            var14 = var14 * 0.96F + 0.03F;
            if(var1.t.g == 1) {
               var12 = 0.22F + var5 * 0.75F;
               var13 = 0.28F + var10 * 0.75F;
               var14 = 0.25F + var11 * 0.75F;
            }

            float var15 = this.r.A.O;
            if(var12 > 1.0F) {
               var12 = 1.0F;
            }

            if(var13 > 1.0F) {
               var13 = 1.0F;
            }

            if(var14 > 1.0F) {
               var14 = 1.0F;
            }

            float var16 = 1.0F - var12;
            float var17 = 1.0F - var13;
            float var18 = 1.0F - var14;
            var16 = 1.0F - var16 * var16 * var16 * var16;
            var17 = 1.0F - var17 * var17 * var17 * var17;
            var18 = 1.0F - var18 * var18 * var18 * var18;
            var12 = var12 * (1.0F - var15) + var16 * var15;
            var13 = var13 * (1.0F - var15) + var17 * var15;
            var14 = var14 * (1.0F - var15) + var18 * var15;
            var12 = var12 * 0.96F + 0.03F;
            var13 = var13 * 0.96F + 0.03F;
            var14 = var14 * 0.96F + 0.03F;
            if(var12 > 1.0F) {
               var12 = 1.0F;
            }

            if(var13 > 1.0F) {
               var13 = 1.0F;
            }

            if(var14 > 1.0F) {
               var14 = 1.0F;
            }

            if(var12 < 0.0F) {
               var12 = 0.0F;
            }

            if(var13 < 0.0F) {
               var13 = 0.0F;
            }

            if(var14 < 0.0F) {
               var14 = 0.0F;
            }

            short var19 = 255;
            int var20 = (int)(var12 * 255.0F);
            int var21 = (int)(var13 * 255.0F);
            int var22 = (int)(var14 * 255.0F);
            this.Q[var2] = var19 << 24 | var20 << 16 | var21 << 8 | var22;
         }

         this.r.p.a(this.Q, 16, 16, this.d);
      }
   }

   public void b(float var1) {
      lv.a("lightTex");
      if(this.aa) {
         this.e();
      }

      lv.b();
      if(!Display.isActive()) {
         if(System.currentTimeMillis() - this.Y > 500L) {
            this.r.i();
         }
      } else {
         this.Y = System.currentTimeMillis();
      }

      lv.a("mouse");
      if(this.r.R) {
         this.r.D.c();
         float var2 = this.r.A.c * 0.6F + 0.2F;
         float var3 = var2 * var2 * var2 * 8.0F;
         float var4 = (float)this.r.D.a * var3;
         float var5 = (float)this.r.D.b * var3;
         byte var6 = 1;
         if(this.r.A.d) {
            var6 = -1;
         }

         if(this.r.A.J) {
            this.H += var4;
            this.I += var5;
            float var7 = var1 - this.L;
            this.L = var1;
            var4 = this.J * var7;
            var5 = this.K * var7;
            this.r.h.c(var4, var5 * (float)var6);
         } else {
            this.r.h.c(var4, var5 * (float)var6);
         }
      }

      lv.b();
      if(!this.r.x) {
         a = this.r.A.g;
         agd var13 = new agd(this.r.A, this.r.d, this.r.e);
         int var14 = var13.a();
         int var15 = var13.b();
         int var16 = Mouse.getX() * var14 / this.r.d;
         int var17 = var15 - Mouse.getY() * var15 / this.r.e - 1;
         short var18 = 200;
         if(this.r.A.i == 1) {
            var18 = 120;
         }

         if(this.r.A.i == 2) {
            var18 = 40;
         }

         long var8;
         if(this.r.f != null) {
            lv.a("level");
            if(this.r.A.i == 0) {
               this.a(var1, 0L);
            } else {
               this.a(var1, this.Z + (long)(1000000000 / var18));
            }

            lv.c("sleep");
            if(this.r.A.i == 2) {
               var8 = (this.Z + (long)(1000000000 / var18) - System.nanoTime()) / 1000000L;
               if(var8 > 0L && var8 < 500L) {
                  try {
                     Thread.sleep(var8);
                  } catch (InterruptedException var12) {
                     var12.printStackTrace();
                  }
               }
            }

            this.Z = System.nanoTime();
            lv.c("mojang/gui");
            if(!this.r.A.D || this.r.s != null) {
               this.r.w.a(var1, this.r.s != null, var16, var17);
            }

            lv.b();
         } else {
            GL11.glViewport(0, 0, this.r.d, this.r.e);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            this.b();
            var8 = (this.Z + (long)(1000000000 / var18) - System.nanoTime()) / 1000000L;
            if(var8 < 0L) {
               var8 += 10L;
            }

            if(var8 > 0L && var8 < 500L) {
               try {
                  Thread.sleep(var8);
               } catch (InterruptedException var11) {
                  var11.printStackTrace();
               }
            }

            this.Z = System.nanoTime();
         }

         if(this.r.s != null) {
            GL11.glClear(256);
            this.r.s.a(var16, var17, var1);
            if(this.r.s != null && this.r.s.v != null) {
               this.r.s.v.a(var1);
            }
         }

      }
   }

   public void a(float var1, long var2) {
      lv.a("lightTex");
      if(this.aa) {
         this.e();
      }

      GL11.glEnable(2884);
      GL11.glEnable(2929);
      if(this.r.i == null) {
         this.r.i = this.r.h;
      }

      lv.c("pick");
      this.a(var1);
      acq var4 = this.r.i;
      l var5 = this.r.g;
      cw var6 = this.r.j;
      double var7 = var4.N + (var4.o - var4.N) * (double)var1;
      double var9 = var4.O + (var4.p - var4.O) * (double)var1;
      double var11 = var4.P + (var4.q - var4.P) * (double)var1;
      lv.c("center");
      ca var13 = this.r.f.z();
      int var16;
      if(var13 instanceof hy) {
         hy var14 = (hy)var13;
         int var15 = gk.d((float)((int)var7)) >> 4;
         var16 = gk.d((float)((int)var11)) >> 4;
         var14.d(var15, var16);
      }

      for(int var18 = 0; var18 < 2; ++var18) {
         if(this.r.A.g) {
            b = var18;
            if(b == 0) {
               GL11.glColorMask(false, true, true, false);
            } else {
               GL11.glColorMask(true, false, false, false);
            }
         }

         lv.c("clear");
         GL11.glViewport(0, 0, this.r.d, this.r.e);
         this.g(var1);
         GL11.glClear(16640);
         GL11.glEnable(2884);
         lv.c("camera");
         this.a(var1, var18);
         aau.a(this.r.h, this.r.A.E == 2);
         lv.c("frustrum");
         r.init();
         if(this.r.A.e < 2) {
            this.a(-1, var1);
            lv.c("sky");
            var5.a(var1);
         }

         GL11.glEnable(2912);
         this.a(1, var1);
         if(this.r.A.k) {
            GL11.glShadeModel(7425);
         }

         lv.c("culling");
         nq var19 = new nq();
         var19.a(var7, var9, var11);
         this.r.g.a(var19, var1);
         if(var18 == 0) {
            lv.c("updatechunks");

            while(!this.r.g.a(var4, false) && var2 != 0L) {
               long var20 = var2 - System.nanoTime();
               if(var20 < 0L || var20 > 1000000000L) {
                  break;
               }
            }
         }

         this.a(0, var1);
         GL11.glEnable(2912);
         GL11.glBindTexture(3553, this.r.p.b("/mojang/terrain.png"));
         tf.a();
         lv.c("mojang/terrain");
         var5.a(var4, 0, (double)var1);
         GL11.glShadeModel(7424);
         yw var21;
         if(this.q == 0) {
            tf.b();
            lv.c("entities");
            var5.a(var4.j(var1), var19, var1);
            this.b((double)var1);
            lv.c("litParticles");
            var6.b(var4, var1);
            tf.a();
            this.a(0, var1);
            lv.c("particles");
            var6.a(var4, var1);
            this.a((double)var1);
            if(this.r.z != null && var4.a(acn.g) && var4 instanceof yw && !this.r.A.D) {
               var21 = (yw)var4;
               GL11.glDisable(3008);
               lv.c("outline");
               var5.a(var21, this.r.z, 0, var21.ap.b(), var1);
               var5.b(var21, this.r.z, 0, var21.ap.b(), var1);
               GL11.glEnable(3008);
            }
         }

         GL11.glDisable(3042);
         GL11.glEnable(2884);
         GL11.glBlendFunc(770, 771);
         GL11.glDepthMask(true);
         this.a(0, var1);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         GL11.glBindTexture(3553, this.r.p.b("/mojang/terrain.png"));
         if(this.r.A.j) {
            lv.c("water");
            if(this.r.A.k) {
               GL11.glShadeModel(7425);
            }

            GL11.glColorMask(false, false, false, false);
            var16 = var5.a(var4, 1, (double)var1);
            if(this.r.A.g) {
               if(b == 0) {
                  GL11.glColorMask(false, true, true, true);
               } else {
                  GL11.glColorMask(true, false, false, true);
               }
            } else {
               GL11.glColorMask(true, true, true, true);
            }

            if(var16 > 0) {
               var5.a(1, (double)var1);
            }

            GL11.glShadeModel(7424);
         } else {
            lv.c("water");
            var5.a(var4, 1, (double)var1);
         }

         GL11.glDepthMask(true);
         GL11.glEnable(2884);
         GL11.glDisable(3042);
         if(this.V == 1.0D && var4 instanceof yw && !this.r.A.D && this.r.z != null && !var4.a(acn.g)) {
            var21 = (yw)var4;
            GL11.glDisable(3008);
            lv.c("outline");
            var5.a(var21, this.r.z, 0, var21.ap.b(), var1);
            var5.b(var21, this.r.z, 0, var21.ap.b(), var1);
            GL11.glEnable(3008);
         }

         lv.c("weather");
         this.c(var1);
         GL11.glDisable(2912);
         if(this.u != null) {
            ;
         }

         if(this.r.A.c()) {
            lv.c("clouds");
            GL11.glPushMatrix();
            this.a(0, var1);
            GL11.glEnable(2912);
            var5.b(var1);
            GL11.glDisable(2912);
            this.a(1, var1);
            GL11.glPopMatrix();
         }

         lv.c("hand");
         if(this.V == 1.0D) {
            GL11.glClear(256);
            this.b(var1, var18);
         }

         if(!this.r.A.g) {
            lv.b();
            return;
         }
      }

      GL11.glColorMask(true, true, true, false);
      lv.b();
   }

   private void f() {
      float var1 = this.r.f.j(1.0F);
      if(!this.r.A.j) {
         var1 /= 2.0F;
      }

      if(var1 != 0.0F) {
         this.ab.setSeed((long)this.t * 312987231L);
         acq var2 = this.r.i;
         xd var3 = this.r.f;
         int var4 = gk.c(var2.o);
         int var5 = gk.c(var2.p);
         int var6 = gk.c(var2.q);
         byte var7 = 10;
         double var8 = 0.0D;
         double var10 = 0.0D;
         double var12 = 0.0D;
         int var14 = 0;
         int var15 = (int)(100.0F * var1 * var1);
         if(this.r.A.Q == 1) {
            var15 >>= 1;
         } else if(this.r.A.Q == 2) {
            var15 = 0;
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            int var17 = var4 + this.ab.nextInt(var7) - this.ab.nextInt(var7);
            int var18 = var6 + this.ab.nextInt(var7) - this.ab.nextInt(var7);
            int var19 = var3.f(var17, var18);
            int var20 = var3.a(var17, var19 - 1, var18);
            abn var21 = var3.a(var17, var18);
            if(var19 <= var5 + var7 && var19 >= var5 - var7 && var21.d() && var21.j() > 0.2F) {
               float var22 = this.ab.nextFloat();
               float var23 = this.ab.nextFloat();
               if(var20 > 0) {
                  if(pb.m[var20].cd == acn.h) {
                     this.r.j.a((rt)(new alh(var3, (double)((float)var17 + var22), (double)((float)var19 + 0.1F) - pb.m[var20].bW, (double)((float)var18 + var23), 0.0D, 0.0D, 0.0D)));
                  } else {
                     ++var14;
                     if(this.ab.nextInt(var14) == 0) {
                        var8 = (double)((float)var17 + var22);
                        var10 = (double)((float)var19 + 0.1F) - pb.m[var20].bW;
                        var12 = (double)((float)var18 + var23);
                     }

                     this.r.j.a((rt)(new rg(var3, (double)((float)var17 + var22), (double)((float)var19 + 0.1F) - pb.m[var20].bW, (double)((float)var18 + var23))));
                  }
               }
            }
         }

         if(var14 > 0 && this.ab.nextInt(3) < this.ac++) {
            this.ac = 0;
            if(var10 > var2.p + 1.0D && var3.f(gk.c(var2.o), gk.c(var2.q)) > gk.c(var2.p)) {
               this.r.f.a(var8, var10, var12, "ambient.weather.rain", 0.1F, 0.5F);
            } else {
               this.r.f.a(var8, var10, var12, "ambient.weather.rain", 0.2F, 1.0F);
            }
         }

      }
   }

   protected void c(float var1) {
      float var2 = this.r.f.j(var1);
      if(var2 > 0.0F) {
         this.b((double)var1);
         if(this.i == null) {
            this.i = new float[1024];
            this.j = new float[1024];

            for(int var3 = 0; var3 < 32; ++var3) {
               for(int var4 = 0; var4 < 32; ++var4) {
                  float var5 = (float)(var4 - 16);
                  float var6 = (float)(var3 - 16);
                  float var7 = gk.c(var5 * var5 + var6 * var6);
                  this.i[var3 << 5 | var4] = -var6 / var7;
                  this.j[var3 << 5 | var4] = var5 / var7;
               }
            }
         }

         acq var41 = this.r.i;
         xd var42 = this.r.f;
         int var43 = gk.c(var41.o);
         int var44 = gk.c(var41.p);
         int var45 = gk.c(var41.q);
         adz var8 = adz.a;
         GL11.glDisable(2884);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glAlphaFunc(516, 0.01F);
         GL11.glBindTexture(3553, this.r.p.b("/mojang/environment/snow.png"));
         double var9 = var41.N + (var41.o - var41.N) * (double)var1;
         double var11 = var41.O + (var41.p - var41.O) * (double)var1;
         double var13 = var41.P + (var41.q - var41.P) * (double)var1;
         int var15 = gk.c(var11);
         byte var16 = 5;
         if(this.r.A.j) {
            var16 = 10;
         }

         boolean var17 = false;
         byte var18 = -1;
         float var19 = (float)this.t + var1;
         if(this.r.A.j) {
            var16 = 10;
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var17 = false;

         for(int var20 = var45 - var16; var20 <= var45 + var16; ++var20) {
            for(int var21 = var43 - var16; var21 <= var43 + var16; ++var21) {
               int var22 = (var20 - var45 + 16) * 32 + var21 - var43 + 16;
               float var23 = this.i[var22] * 0.5F;
               float var24 = this.j[var22] * 0.5F;
               abn var25 = var42.a(var21, var20);
               if(var25.d() || var25.c()) {
                  int var26 = var42.f(var21, var20);
                  int var27 = var44 - var16;
                  int var28 = var44 + var16;
                  if(var27 < var26) {
                     var27 = var26;
                  }

                  if(var28 < var26) {
                     var28 = var26;
                  }

                  float var29 = 1.0F;
                  int var30 = var26;
                  if(var26 < var15) {
                     var30 = var15;
                  }

                  if(var27 != var28) {
                     this.ab.setSeed((long)(var21 * var21 * 3121 + var21 * 45238971 ^ var20 * var20 * 418711 + var20 * 13761));
                     float var31 = var25.j();
                     float var32;
                     double var35;
                     if(var42.i().a(var31, var26) >= 0.15F) {
                        if(var18 != 0) {
                           if(var18 >= 0) {
                              var8.a();
                           }

                           var18 = 0;
                           GL11.glBindTexture(3553, this.r.p.b("/mojang/environment/rain.png"));
                           var8.b();
                        }

                        var32 = ((float)(this.t + var21 * var21 * 3121 + var21 * 45238971 + var20 * var20 * 418711 + var20 * 13761 & 31) + var1) / 32.0F * (3.0F + this.ab.nextFloat());
                        double var33 = (double)((float)var21 + 0.5F) - var41.o;
                        var35 = (double)((float)var20 + 0.5F) - var41.q;
                        float var37 = gk.a(var33 * var33 + var35 * var35) / (float)var16;
                        float var38 = 1.0F;
                        var8.b(var42.b(var21, var30, var20, 0));
                        var8.a(var38, var38, var38, ((1.0F - var37 * var37) * 0.5F + 0.5F) * var2);
                        var8.b(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var27, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29), (double)((float)var27 * var29 / 4.0F + var32 * var29));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var27, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29), (double)((float)var27 * var29 / 4.0F + var32 * var29));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var28, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29), (double)((float)var28 * var29 / 4.0F + var32 * var29));
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var28, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29), (double)((float)var28 * var29 / 4.0F + var32 * var29));
                        var8.b(0.0D, 0.0D, 0.0D);
                     } else {
                        if(var18 != 1) {
                           if(var18 >= 0) {
                              var8.a();
                           }

                           var18 = 1;
                           GL11.glBindTexture(3553, this.r.p.b("/mojang/environment/snow.png"));
                           var8.b();
                        }

                        var32 = ((float)(this.t & 511) + var1) / 512.0F;
                        float var46 = this.ab.nextFloat() + var19 * 0.01F * (float)this.ab.nextGaussian();
                        float var34 = this.ab.nextFloat() + var19 * (float)this.ab.nextGaussian() * 0.001F;
                        var35 = (double)((float)var21 + 0.5F) - var41.o;
                        double var47 = (double)((float)var20 + 0.5F) - var41.q;
                        float var39 = gk.a(var35 * var35 + var47 * var47) / (float)var16;
                        float var40 = 1.0F;
                        var8.b((var42.b(var21, var30, var20, 0) * 3 + 15728880) / 4);
                        var8.a(var40, var40, var40, ((1.0F - var39 * var39) * 0.3F + 0.5F) * var2);
                        var8.b(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var27, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29 + var46), (double)((float)var27 * var29 / 4.0F + var32 * var29 + var34));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var27, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29 + var46), (double)((float)var27 * var29 / 4.0F + var32 * var29 + var34));
                        var8.a((double)((float)var21 + var23) + 0.5D, (double)var28, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29 + var46), (double)((float)var28 * var29 / 4.0F + var32 * var29 + var34));
                        var8.a((double)((float)var21 - var23) + 0.5D, (double)var28, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29 + var46), (double)((float)var28 * var29 / 4.0F + var32 * var29 + var34));
                        var8.b(0.0D, 0.0D, 0.0D);
                     }
                  }
               }
            }
         }

         if(var18 >= 0) {
            var8.a();
         }

         GL11.glEnable(2884);
         GL11.glDisable(3042);
         GL11.glAlphaFunc(516, 0.1F);
         this.a((double)var1);
      }
   }

   public void b() {
      agd var1 = new agd(this.r.A, this.r.d, this.r.e);
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, var1.a, var1.b, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   private void g(float var1) {
      xd var2 = this.r.f;
      acq var3 = this.r.i;
      float var4 = 1.0F / (float)(4 - this.r.A.e);
      var4 = 1.0F - (float)Math.pow((double)var4, 0.25D);
      bo var5 = var2.a(this.r.i, var1);
      float var6 = (float)var5.a;
      float var7 = (float)var5.b;
      float var8 = (float)var5.c;
      bo var9 = var2.g(var1);
      this.n = (float)var9.a;
      this.o = (float)var9.b;
      this.p = (float)var9.c;
      float var11;
      if(this.r.A.e < 2) {
         bo var10 = gk.a(var2.e(var1)) > 0.0F?bo.b(-1.0D, 0.0D, 0.0D):bo.b(1.0D, 0.0D, 0.0D);
         var11 = (float)var3.k(var1).b(var10);
         if(var11 < 0.0F) {
            var11 = 0.0F;
         }

         if(var11 > 0.0F) {
            float[] var12 = var2.t.a(var2.c(var1), var1);
            if(var12 != null) {
               var11 *= var12[3];
               this.n = this.n * (1.0F - var11) + var12[0] * var11;
               this.o = this.o * (1.0F - var11) + var12[1] * var11;
               this.p = this.p * (1.0F - var11) + var12[2] * var11;
            }
         }
      }

      this.n += (var6 - this.n) * var4;
      this.o += (var7 - this.o) * var4;
      this.p += (var8 - this.p) * var4;
      float var19 = var2.j(var1);
      float var20;
      if(var19 > 0.0F) {
         var11 = 1.0F - var19 * 0.5F;
         var20 = 1.0F - var19 * 0.4F;
         this.n *= var11;
         this.o *= var11;
         this.p *= var20;
      }

      var11 = var2.i(var1);
      if(var11 > 0.0F) {
         var20 = 1.0F - var11 * 0.5F;
         this.n *= var20;
         this.o *= var20;
         this.p *= var20;
      }

      int var21 = aau.a(this.r.f, var3, var1);
      if(this.U) {
         bo var13 = var2.f(var1);
         this.n = (float)var13.a;
         this.o = (float)var13.b;
         this.p = (float)var13.c;
      } else if(var21 != 0 && pb.m[var21].cd == acn.g) {
         this.n = 0.02F;
         this.o = 0.02F;
         this.p = 0.2F;
      } else if(var21 != 0 && pb.m[var21].cd == acn.h) {
         this.n = 0.6F;
         this.o = 0.1F;
         this.p = 0.0F;
      }

      float var22 = this.ad + (this.ae - this.ad) * var1;
      this.n *= var22;
      this.o *= var22;
      this.p *= var22;
      double var14 = (var3.O + (var3.p - var3.O) * (double)var1) * var2.t.k();
      if(var3.a(aad.q)) {
         int var16 = var3.b(aad.q).b();
         if(var16 < 20) {
            var14 *= (double)(1.0F - (float)var16 / 20.0F);
         } else {
            var14 = 0.0D;
         }
      }

      if(var14 < 1.0D) {
         if(var14 < 0.0D) {
            var14 = 0.0D;
         }

         var14 *= var14;
         this.n = (float)((double)this.n * var14);
         this.o = (float)((double)this.o * var14);
         this.p = (float)((double)this.p * var14);
      }

      if(this.r.A.g) {
         float var23 = (this.n * 30.0F + this.o * 59.0F + this.p * 11.0F) / 100.0F;
         float var17 = (this.n * 30.0F + this.o * 70.0F) / 100.0F;
         float var18 = (this.n * 30.0F + this.p * 70.0F) / 100.0F;
         this.n = var23;
         this.o = var17;
         this.p = var18;
      }

      GL11.glClearColor(this.n, this.o, this.p, 0.0F);
   }

   private void a(int var1, float var2) {
      acq var3 = this.r.i;
      boolean var4 = false;
      if(var3 instanceof yw) {
         var4 = ((yw)var3).aT.d;
      }

      if(var1 == 999) {
         GL11.glFog(2918, this.a(0.0F, 0.0F, 0.0F, 1.0F));
         GL11.glFogi(2917, 9729);
         GL11.glFogf(2915, 0.0F);
         GL11.glFogf(2916, 8.0F);
         if(GLContext.getCapabilities().GL_NV_fog_distance) {
            GL11.glFogi('\u855a', '\u855b');
         }

         GL11.glFogf(2915, 0.0F);
      } else {
         GL11.glFog(2918, this.a(this.n, this.o, this.p, 1.0F));
         GL11.glNormal3f(0.0F, -1.0F, 0.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var5 = aau.a(this.r.f, var3, var2);
         float var6;
         if(var3.a(aad.q)) {
            var6 = 5.0F;
            int var7 = var3.b(aad.q).b();
            if(var7 < 20) {
               var6 = 5.0F + (this.s - 5.0F) * (1.0F - (float)var7 / 20.0F);
            }

            GL11.glFogi(2917, 9729);
            if(var1 < 0) {
               GL11.glFogf(2915, 0.0F);
               GL11.glFogf(2916, var6 * 0.8F);
            } else {
               GL11.glFogf(2915, var6 * 0.25F);
               GL11.glFogf(2916, var6);
            }

            if(GLContext.getCapabilities().GL_NV_fog_distance) {
               GL11.glFogi('\u855a', '\u855b');
            }
         } else {
            float var8;
            float var9;
            float var10;
            float var11;
            float var12;
            if(this.U) {
               GL11.glFogi(2917, 2048);
               GL11.glFogf(2914, 0.1F);
               var6 = 1.0F;
               var12 = 1.0F;
               var8 = 1.0F;
               if(this.r.A.g) {
                  var9 = (var6 * 30.0F + var12 * 59.0F + var8 * 11.0F) / 100.0F;
                  var10 = (var6 * 30.0F + var12 * 70.0F) / 100.0F;
                  var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
               }
            } else if(var5 > 0 && pb.m[var5].cd == acn.g) {
               GL11.glFogi(2917, 2048);
               if(!var3.a(aad.o)) {
                  GL11.glFogf(2914, 0.1F);
               } else {
                  GL11.glFogf(2914, 0.05F);
               }

               var6 = 0.4F;
               var12 = 0.4F;
               var8 = 0.9F;
               if(this.r.A.g) {
                  var9 = (var6 * 30.0F + var12 * 59.0F + var8 * 11.0F) / 100.0F;
                  var10 = (var6 * 30.0F + var12 * 70.0F) / 100.0F;
                  var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
               }
            } else if(var5 > 0 && pb.m[var5].cd == acn.h) {
               GL11.glFogi(2917, 2048);
               GL11.glFogf(2914, 2.0F);
               var6 = 0.4F;
               var12 = 0.3F;
               var8 = 0.3F;
               if(this.r.A.g) {
                  var9 = (var6 * 30.0F + var12 * 59.0F + var8 * 11.0F) / 100.0F;
                  var10 = (var6 * 30.0F + var12 * 70.0F) / 100.0F;
                  var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
               }
            } else {
               var6 = this.s;
               if(this.r.f.t.j() && !var4) {
                  double var13 = (double)((var3.b(var2) & 15728640) >> 20) / 16.0D + (var3.O + (var3.p - var3.O) * (double)var2 + 4.0D) / 32.0D;
                  if(var13 < 1.0D) {
                     if(var13 < 0.0D) {
                        var13 = 0.0D;
                     }

                     var13 *= var13;
                     var9 = 100.0F * (float)var13;
                     if(var9 < 5.0F) {
                        var9 = 5.0F;
                     }

                     if(var6 > var9) {
                        var6 = var9;
                     }
                  }
               }

               GL11.glFogi(2917, 9729);
               if(var1 < 0) {
                  GL11.glFogf(2915, 0.0F);
                  GL11.glFogf(2916, var6 * 0.8F);
               } else {
                  GL11.glFogf(2915, var6 * 0.25F);
                  GL11.glFogf(2916, var6);
               }

               if(GLContext.getCapabilities().GL_NV_fog_distance) {
                  GL11.glFogi('\u855a', '\u855b');
               }

               if(this.r.f.t.b((int)var3.o, (int)var3.q)) {
                  GL11.glFogf(2915, var6 * 0.05F);
                  GL11.glFogf(2916, Math.min(var6, 192.0F) * 0.5F);
               }
            }
         }

         GL11.glEnable(2903);
         GL11.glColorMaterial(1028, 4608);
      }
   }

   private FloatBuffer a(float var1, float var2, float var3, float var4) {
      this.m.clear();
      this.m.put(var1).put(var2).put(var3).put(var4);
      this.m.flip();
      return this.m;
   }

}
