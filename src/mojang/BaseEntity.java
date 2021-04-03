package mojang;

import java.util.List;
import java.util.Random;

public abstract class BaseEntity {

   private static int a = 0;
   public int f;
   public double g;
   public boolean h;
   public BaseEntity i;
   public BaseEntity j;
   public World k;
   public double sandX;
   public double sandY;
   public double sandZ;
   public double o;
   public double p;
   public double q;
   public double r;
   public double s;
   public double t;
   public float u;
   public float v;
   public float w;
   public float x;
   public final wu y;
   public boolean z;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D;
   protected boolean E;
   public boolean F;
   public boolean G;
   public float H;
   public float I;
   public float J;
   public float K;
   public float L;
   public float fallDistance;
   private int b;
   public double N;
   public double O;
   public double P;
   public float Q;
   public float R;
   public boolean S;
   public float T;
   protected Random U;
   public int V;
   public int W;
   private int fireTime;
   protected boolean X;
   public int Y;
   private boolean d;
   public String Z;
   public String aa;
   protected boolean ab;
   protected aim ac;
   private double e;
   private double am;
   public boolean ad;
   public int ae;
   public int af;
   public int ag;
   public int ah;
   public int ai;
   public int aj;
   public boolean ak;
   public boolean al;


   public BaseEntity(World world) {
      this.f = a++;
      this.g = 1.0D;
      this.h = false;
      this.y = wu.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      this.z = false;
      this.C = false;
      this.D = false;
      this.F = true;
      this.G = false;
      this.H = 0.0F;
      this.I = 0.6F;
      this.J = 1.8F;
      this.K = 0.0F;
      this.L = 0.0F;
      this.fallDistance = 0.0F;
      this.b = 1;
      this.Q = 0.0F;
      this.R = 0.0F;
      this.S = false;
      this.T = 0.0F;
      this.U = new Random();
      this.V = 0;
      this.W = 1;
      this.fireTime = 0;
      this.X = false;
      this.Y = 0;
      this.d = true;
      this.ab = false;
      this.ac = new aim();
      this.ad = false;
      this.k = world;
      this.d(0.0D, 0.0D, 0.0D);
      this.ac.a(0, Byte.valueOf((byte)0));
      this.ac.a(1, Short.valueOf((short)300));
      this.b();
   }

   protected abstract void b();

   public aim y() {
      return this.ac;
   }

   public boolean equals(Object var1) {
      return var1 instanceof BaseEntity ?((BaseEntity)var1).f == this.f:false;
   }

   public int hashCode() {
      return this.f;
   }

   protected void z() {
      if(this.k != null) {
         while(this.p > 0.0D) {
            this.d(this.o, this.p, this.q);
            if(this.k.a(this, this.y).size() == 0) {
               break;
            }

            ++this.p;
         }

         this.r = this.s = this.t = 0.0D;
         this.v = 0.0F;
      }
   }

   public void A() {
      this.G = true;
   }

   protected void a(float var1, float var2) {
      this.I = var1;
      this.J = var2;
   }

   protected void b(float var1, float var2) {
      this.u = var1 % 360.0F;
      this.v = var2 % 360.0F;
   }

   public void d(double x, double y, double z) {
      this.o = x;
      this.p = y;
      this.q = z;
      float var7 = this.I / 2.0F;
      float var8 = this.J;
      this.y.c(x - (double)var7, y - (double)this.H + (double)this.Q, z - (double)var7, x + (double)var7, y - (double)this.H + (double)this.Q + (double)var8, z + (double)var7);
   }

   public void c(float var1, float var2) {
      float var3 = this.v;
      float var4 = this.u;
      this.u = (float)((double)this.u + (double)var1 * 0.15D);
      this.v = (float)((double)this.v - (double)var2 * 0.15D);
      if(this.v < -90.0F) {
         this.v = -90.0F;
      }

      if(this.v > 90.0F) {
         this.v = 90.0F;
      }

      this.x += this.v - var3;
      this.w += this.u - var4;
   }

   public void J_() {
      this.B();
   }

   public void B() {
      lv.a("entityBaseTick");
      if(this.j != null && this.j.G) {
         this.j = null;
      }

      ++this.V;
      this.K = this.L;
      this.sandX = this.o;
      this.sandY = this.p;
      this.sandZ = this.q;
      this.x = this.v;
      this.w = this.u;
      int var3;
      if(this.W() && !this.H()) {
         int var1 = Utils.c(this.o);
         int var2 = Utils.c(this.p - 0.20000000298023224D - (double)this.H);
         var3 = Utils.c(this.q);
         int var4 = this.k.a(var1, var2, var3);
         if(var4 > 0) {
            this.k.a("tilecrack_" + var4, this.o + ((double)this.U.nextFloat() - 0.5D) * (double)this.I, this.y.b + 0.1D, this.q + ((double)this.U.nextFloat() - 0.5D) * (double)this.I, -this.r * 4.0D, 1.5D, -this.t * 4.0D);
         }
      }

      if(this.g_()) {
         if(!this.X && !this.d) {
            float var6 = Utils.sqrt(this.r * this.r * 0.20000000298023224D + this.s * this.s + this.t * this.t * 0.20000000298023224D) * 0.2F;
            if(var6 > 1.0F) {
               var6 = 1.0F;
            }

            this.k.a(this, "random.splash", var6, 1.0F + (this.U.nextFloat() - this.U.nextFloat()) * 0.4F);
            float var7 = (float) Utils.c(this.y.b);

            float var5;
            float var8;
            for(var3 = 0; (float)var3 < 1.0F + this.I * 20.0F; ++var3) {
               var8 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
               var5 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
               this.k.a("bubble", this.o + (double)var8, (double)(var7 + 1.0F), this.q + (double)var5, this.r, this.s - (double)(this.U.nextFloat() * 0.2F), this.t);
            }

            for(var3 = 0; (float)var3 < 1.0F + this.I * 20.0F; ++var3) {
               var8 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
               var5 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
               this.k.a("splash", this.o + (double)var8, (double)(var7 + 1.0F), this.q + (double)var5, this.r, this.s, this.t);
            }
         }

         this.fallDistance = 0.0F;
         this.X = true;
         this.fireTime = 0;
      } else {
         this.X = false;
      }

      if(this.k.F) {
         this.fireTime = 0;
      } else if(this.fireTime > 0) {
         if(this.ab) {
            this.fireTime -= 4;
            if(this.fireTime < 0) {
               this.fireTime = 0;
            }
         } else {
            if(this.fireTime % 20 == 0) {
               this.a(md.c, 1);
            }

            --this.fireTime;
         }
      }

      if(this.J()) {
         this.C();
         this.fallDistance *= 0.5F;
      }

      if(this.p < -64.0D) {
         this.E();
      }

      if(!this.k.F) {
         this.a(0, this.fireTime > 0);
         this.a(2, this.j != null);
      }

      this.d = false;
      lv.b();
   }

   protected void C() {
      if(!this.ab) {
         this.a(md.d, 4);
         this.e(15);
      }

   }

   public void e(int var1) {
      int var2 = var1 * 20;
      if(this.fireTime < var2) {
         this.fireTime = var2;
      }

   }

   public void D() {
      this.fireTime = 0;
   }

   protected void E() {
      this.A();
   }

   public boolean e(double var1, double var3, double var5) {
      wu var7 = this.y.c(var1, var3, var5);
      List var8 = this.k.a(this, var7);
      return var8.size() > 0?false:!this.k.b(var7);
   }

   public void b(double var1, double var3, double var5) {
      if(this.S) {
         this.y.d(var1, var3, var5);
         this.o = (this.y.a + this.y.d) / 2.0D;
         this.p = this.y.b + (double)this.H - (double)this.Q;
         this.q = (this.y.c + this.y.f) / 2.0D;
      } else {
         lv.a("move");
         this.Q *= 0.4F;
         double var7 = this.o;
         double var9 = this.q;
         if(this.E) {
            this.E = false;
            var1 *= 0.25D;
            var3 *= 0.05000000074505806D;
            var5 *= 0.25D;
            this.r = 0.0D;
            this.s = 0.0D;
            this.t = 0.0D;
         }

         double var11 = var1;
         double var13 = var3;
         double var15 = var5;
         wu var17 = this.y.d();
         boolean var18 = this.z && this.V() && this instanceof Player;
         if(var18) {
            double var19;
            for(var19 = 0.05D; var1 != 0.0D && this.k.a(this, this.y.c(var1, -1.0D, 0.0D)).size() == 0; var11 = var1) {
               if(var1 < var19 && var1 >= -var19) {
                  var1 = 0.0D;
               } else if(var1 > 0.0D) {
                  var1 -= var19;
               } else {
                  var1 += var19;
               }
            }

            for(; var5 != 0.0D && this.k.a(this, this.y.c(0.0D, -1.0D, var5)).size() == 0; var15 = var5) {
               if(var5 < var19 && var5 >= -var19) {
                  var5 = 0.0D;
               } else if(var5 > 0.0D) {
                  var5 -= var19;
               } else {
                  var5 += var19;
               }
            }

            while(var1 != 0.0D && var5 != 0.0D && this.k.a(this, this.y.c(var1, -1.0D, var5)).size() == 0) {
               if(var1 < var19 && var1 >= -var19) {
                  var1 = 0.0D;
               } else if(var1 > 0.0D) {
                  var1 -= var19;
               } else {
                  var1 += var19;
               }

               if(var5 < var19 && var5 >= -var19) {
                  var5 = 0.0D;
               } else if(var5 > 0.0D) {
                  var5 -= var19;
               } else {
                  var5 += var19;
               }

               var11 = var1;
               var15 = var5;
            }
         }

         List var35 = this.k.a(this, this.y.a(var1, var3, var5));

         for(int var20 = 0; var20 < var35.size(); ++var20) {
            var3 = ((wu)var35.get(var20)).b(this.y, var3);
         }

         this.y.d(0.0D, var3, 0.0D);
         if(!this.F && var13 != var3) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         boolean var36 = this.z || var13 != var3 && var13 < 0.0D;

         int var21;
         for(var21 = 0; var21 < var35.size(); ++var21) {
            var1 = ((wu)var35.get(var21)).a(this.y, var1);
         }

         this.y.d(var1, 0.0D, 0.0D);
         if(!this.F && var11 != var1) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         for(var21 = 0; var21 < var35.size(); ++var21) {
            var5 = ((wu)var35.get(var21)).c(this.y, var5);
         }

         this.y.d(0.0D, 0.0D, var5);
         if(!this.F && var15 != var5) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         double var23;
         int var28;
         double var37;
         if(this.R > 0.0F && var36 && (var18 || this.Q < 0.05F) && (var11 != var1 || var15 != var5)) {
            var37 = var1;
            var23 = var3;
            double var25 = var5;
            var1 = var11;
            var3 = (double)this.R;
            var5 = var15;
            wu var27 = this.y.d();
            this.y.b(var17);
            var35 = this.k.a(this, this.y.a(var11, var3, var15));

            for(var28 = 0; var28 < var35.size(); ++var28) {
               var3 = ((wu)var35.get(var28)).b(this.y, var3);
            }

            this.y.d(0.0D, var3, 0.0D);
            if(!this.F && var13 != var3) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var28 = 0; var28 < var35.size(); ++var28) {
               var1 = ((wu)var35.get(var28)).a(this.y, var1);
            }

            this.y.d(var1, 0.0D, 0.0D);
            if(!this.F && var11 != var1) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var28 = 0; var28 < var35.size(); ++var28) {
               var5 = ((wu)var35.get(var28)).c(this.y, var5);
            }

            this.y.d(0.0D, 0.0D, var5);
            if(!this.F && var15 != var5) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            if(!this.F && var13 != var3) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            } else {
               var3 = (double)(-this.R);

               for(var28 = 0; var28 < var35.size(); ++var28) {
                  var3 = ((wu)var35.get(var28)).b(this.y, var3);
               }

               this.y.d(0.0D, var3, 0.0D);
            }

            if(var37 * var37 + var25 * var25 >= var1 * var1 + var5 * var5) {
               var1 = var37;
               var3 = var23;
               var5 = var25;
               this.y.b(var27);
            } else {
               double var40 = this.y.b - (double)((int)this.y.b);
               if(var40 > 0.0D) {
                  this.Q = (float)((double)this.Q + var40 + 0.01D);
               }
            }
         }

         lv.b();
         lv.a("rest");
         this.o = (this.y.a + this.y.d) / 2.0D;
         this.p = this.y.b + (double)this.H - (double)this.Q;
         this.q = (this.y.c + this.y.f) / 2.0D;
         this.A = var11 != var1 || var15 != var5;
         this.B = var13 != var3;
         this.z = var13 != var3 && var13 < 0.0D;
         this.C = this.A || this.B;
         this.a(var3, this.z);
         if(var11 != var1) {
            this.r = 0.0D;
         }

         if(var13 != var3) {
            this.s = 0.0D;
         }

         if(var15 != var5) {
            this.t = 0.0D;
         }

         var37 = this.o - var7;
         var23 = this.q - var9;
         int var26;
         int var38;
         int var39;
         if(this.e_() && !var18 && this.j == null) {
            this.L = (float)((double)this.L + (double) Utils.sqrt(var37 * var37 + var23 * var23) * 0.6D);
            var38 = Utils.c(this.o);
            var26 = Utils.c(this.p - 0.20000000298023224D - (double)this.H);
            var39 = Utils.c(this.q);
            var28 = this.k.a(var38, var26, var39);
            if(var28 == 0 && this.k.a(var38, var26 - 1, var39) == pb.aZ.bO) {
               var28 = this.k.a(var38, var26 - 1, var39);
            }

            if(this.L > (float)this.b && var28 > 0) {
               this.b = (int)this.L + 1;
               this.a(var38, var26, var39, var28);
               pb.m[var28].b(this.k, var38, var26, var39, this);
            }
         }

         var38 = Utils.c(this.y.a + 0.001D);
         var26 = Utils.c(this.y.b + 0.001D);
         var39 = Utils.c(this.y.c + 0.001D);
         var28 = Utils.c(this.y.d - 0.001D);
         int var29 = Utils.c(this.y.e - 0.001D);
         int var30 = Utils.c(this.y.f - 0.001D);
         if(this.k.b(var38, var26, var39, var28, var29, var30)) {
            for(int var31 = var38; var31 <= var28; ++var31) {
               for(int var32 = var26; var32 <= var29; ++var32) {
                  for(int var33 = var39; var33 <= var30; ++var33) {
                     int var34 = this.k.a(var31, var32, var33);
                     if(var34 > 0) {
                        pb.m[var34].a(this.k, var31, var32, var33, this);
                     }
                  }
               }
            }
         }

         boolean var41 = this.G();
         if(this.k.c(this.y.e(0.001D, 0.001D, 0.001D))) {
            this.a((int)1);
            if(!var41) {
               ++this.fireTime;
               if(this.fireTime == 0) {
                  this.e(8);
               }
            }
         } else if(this.fireTime <= 0) {
            this.fireTime = -this.W;
         }

         if(var41 && this.fireTime > 0) {
            this.k.a(this, "random.fizz", 0.7F, 1.6F + (this.U.nextFloat() - this.U.nextFloat()) * 0.4F);
            this.fireTime = -this.W;
         }

         lv.b();
      }
   }

   protected void a(int var1, int var2, int var3, int var4) {
      vj var5 = pb.m[var4].cb;
      if(this.k.a(var1, var2 + 1, var3) == pb.aS.bO) {
         var5 = pb.aS.cb;
         this.k.a(this, var5.d(), var5.b() * 0.15F, var5.c());
      } else if(!pb.m[var4].cd.d()) {
         this.k.a(this, var5.d(), var5.b() * 0.15F, var5.c());
      }

   }

   protected boolean e_() {
      return true;
   }

   protected void a(double var1, boolean var3) {
      if(var3) {
         if(this.fallDistance > 0.0F) {
            if(this instanceof Mob) {
               int var4 = Utils.c(this.o);
               int var5 = Utils.c(this.p - 0.20000000298023224D - (double)this.H);
               int var6 = Utils.c(this.q);
               int var7 = this.k.a(var4, var5, var6);
               if(var7 == 0 && this.k.a(var4, var5 - 1, var6) == pb.aZ.bO) {
                  var7 = this.k.a(var4, var5 - 1, var6);
               }

               if(var7 > 0) {
                  pb.m[var7].a(this.k, var4, var5, var6, this, this.fallDistance);
               }
            }

            this.e(this.fallDistance);
            this.fallDistance = 0.0F;
         }
      } else if(var1 < 0.0D) {
         this.fallDistance = (float)((double)this.fallDistance - var1);
      }

   }

   public wu f_() {
      return null;
   }

   protected void a(int var1) {
      if(!this.ab) {
         this.a(md.b, var1);
      }

   }

   public final boolean F() {
      return this.ab;
   }

   protected void e(float var1) {
      if(this.i != null) {
         this.i.e(var1);
      }

   }

   public boolean G() {
      return this.X || this.k.y(Utils.c(this.o), Utils.c(this.p), Utils.c(this.q));
   }

   public boolean H() {
      return this.X;
   }

   public boolean g_() {
      return this.k.a(this.y.b(0.0D, -0.4000000059604645D, 0.0D).e(0.001D, 0.001D, 0.001D), acn.g, this);
   }

   public boolean a(acn var1) {
      double var2 = this.p + (double)this.I();
      int var4 = Utils.c(this.o);
      int var5 = Utils.d((float) Utils.c(var2));
      int var6 = Utils.c(this.q);
      int var7 = this.k.a(var4, var5, var6);
      if(var7 != 0 && pb.m[var7].cd == var1) {
         float var8 = agv.e(this.k.e(var4, var5, var6)) - 0.11111111F;
         float var9 = (float)(var5 + 1) - var8;
         return var2 < (double)var9;
      } else {
         return false;
      }
   }

   public float I() {
      return 0.0F;
   }

   public boolean J() {
      return this.k.a(this.y.b(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), acn.h);
   }

   public void a(float var1, float var2, float var3) {
      float var4 = Utils.sqrt(var1 * var1 + var2 * var2);
      if(var4 >= 0.01F) {
         if(var4 < 1.0F) {
            var4 = 1.0F;
         }

         var4 = var3 / var4;
         var1 *= var4;
         var2 *= var4;
         float var5 = Utils.sin(this.u * 3.1415927F / 180.0F);
         float var6 = Utils.cos(this.u * 3.1415927F / 180.0F);
         this.r += (double)(var1 * var6 - var2 * var5);
         this.t += (double)(var2 * var6 + var1 * var5);
      }
   }

   public int b(float var1) {
      int var2 = Utils.c(this.o);
      int var3 = Utils.c(this.q);
      if(this.k.j(var2, 0, var3)) {
         double var4 = (this.y.e - this.y.b) * 0.66D;
         int var6 = Utils.c(this.p - (double)this.H + var4);
         return this.k.b(var2, var6, var3, 0);
      } else {
         return 0;
      }
   }

   public float a(float var1) {
      int var2 = Utils.c(this.o);
      int var3 = Utils.c(this.q);
      if(this.k.j(var2, 0, var3)) {
         double var4 = (this.y.e - this.y.b) * 0.66D;
         int var6 = Utils.c(this.p - (double)this.H + var4);
         return this.k.c(var2, var6, var3);
      } else {
         return 0.0F;
      }
   }

   public void a(World var1) {
      this.k = var1;
   }

   public void b(double var1, double var3, double var5, float var7, float var8) {
      this.sandX = this.o = var1;
      this.sandY = this.p = var3;
      this.sandZ = this.q = var5;
      this.w = this.u = var7;
      this.x = this.v = var8;
      this.Q = 0.0F;
      double var9 = (double)(this.w - var7);
      if(var9 < -180.0D) {
         this.w += 360.0F;
      }

      if(var9 >= 180.0D) {
         this.w -= 360.0F;
      }

      this.d(this.o, this.p, this.q);
      this.b(var7, var8);
   }

   public void c(double var1, double var3, double var5, float var7, float var8) {
      this.N = this.sandX = this.o = var1;
      this.O = this.sandY = this.p = var3 + (double)this.H;
      this.P = this.sandZ = this.q = var5;
      this.u = var7;
      this.v = var8;
      this.d(this.o, this.p, this.q);
   }

   public float e(BaseEntity var1) {
      float var2 = (float)(this.o - var1.o);
      float var3 = (float)(this.p - var1.p);
      float var4 = (float)(this.q - var1.q);
      return Utils.sqrt(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double f(double var1, double var3, double var5) {
      double var7 = this.o - var1;
      double var9 = this.p - var3;
      double var11 = this.q - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double g(double var1, double var3, double var5) {
      double var7 = this.o - var1;
      double var9 = this.p - var3;
      double var11 = this.q - var5;
      return (double) Utils.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double f(BaseEntity var1) {
      double var2 = this.o - var1.o;
      double var4 = this.p - var1.p;
      double var6 = this.q - var1.q;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void a(Player var1) {}

   public void g(BaseEntity var1) {
      if(var1.i != this && var1.j != this) {
         double var2 = var1.o - this.o;
         double var4 = var1.q - this.q;
         double var6 = Utils.absMax(var2, var4);
         if(var6 >= 0.009999999776482582D) {
            var6 = (double) Utils.sqrt(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = 1.0D / var6;
            if(var8 > 1.0D) {
               var8 = 1.0D;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= 0.05000000074505806D;
            var4 *= 0.05000000074505806D;
            var2 *= (double)(1.0F - this.T);
            var4 *= (double)(1.0F - this.T);
            this.c(-var2, 0.0D, -var4);
            var1.c(var2, 0.0D, var4);
         }

      }
   }

   public void c(double var1, double var3, double var5) {
      this.r += var1;
      this.s += var3;
      this.t += var5;
      this.al = true;
   }

   protected void K() {
      this.D = true;
   }

   public boolean a(md var1, int var2) {
      this.K();
      return false;
   }

   public boolean l_() {
      return false;
   }

   public boolean d_() {
      return false;
   }

   public void a(BaseEntity var1, int var2) {}

   public boolean a(bo var1) {
      double var2 = this.o - var1.a;
      double var4 = this.p - var1.b;
      double var6 = this.q - var1.c;
      double var8 = var2 * var2 + var4 * var4 + var6 * var6;
      return this.a(var8);
   }

   public boolean a(double var1) {
      double var3 = this.y.c();
      var3 *= 64.0D * this.g;
      return var1 < var3 * var3;
   }

   public String v_() {
      return null;
   }

   public boolean c(CompundTag var1) {
      String var2 = this.L();
      if(!this.G && var2 != null) {
         var1.addString("id", var2);
         this.setEntityData(var1);
         return true;
      } else {
         return false;
      }
   }

   public void setEntityData(CompundTag tag) {
      tag.addBaseTag("Pos", this.a(new double[]{this.o, this.p + (double)this.Q, this.q}));
      tag.addBaseTag("Motion", this.a(new double[]{this.r, this.s, this.t}));
      tag.addBaseTag("Rotation", this.a(new float[]{this.u, this.v}));
      tag.addFloat("FallDistance", this.fallDistance);
      tag.addShort("Fire", (short)this.fireTime);
      tag.addShort("Air", (short)this.Y());
      tag.addBoolean("OnGround", this.z);
      this.b(tag);
   }

   public void e(CompundTag var1) {
      ListTag var2 = var1.getListTag("Pos");
      ListTag var3 = var1.getListTag("Motion");
      ListTag var4 = var1.getListTag("Rotation");
      this.r = ((DoubleTag)var3.a(0)).a;
      this.s = ((DoubleTag)var3.a(1)).a;
      this.t = ((DoubleTag)var3.a(2)).a;
      if(Math.abs(this.r) > 10.0D) {
         this.r = 0.0D;
      }

      if(Math.abs(this.s) > 10.0D) {
         this.s = 0.0D;
      }

      if(Math.abs(this.t) > 10.0D) {
         this.t = 0.0D;
      }

      this.sandX = this.N = this.o = ((DoubleTag)var2.a(0)).a;
      this.sandY = this.O = this.p = ((DoubleTag)var2.a(1)).a;
      this.sandZ = this.P = this.q = ((DoubleTag)var2.a(2)).a;
      this.w = this.u = ((FloatTag)var4.a(0)).a;
      this.x = this.v = ((FloatTag)var4.a(1)).a;
      this.fallDistance = var1.getFloat("FallDistance");
      this.fireTime = var1.getShort("Fire");
      this.g(var1.getShort("Air"));
      this.z = var1.getBoolean("OnGround");
      this.d(this.o, this.p, this.q);
      this.b(this.u, this.v);
      this.a(var1);
   }

   protected final String L() {
      return EntityManager.getNameByClass(this);
   }

   protected abstract void a(CompundTag var1);

   protected abstract void b(CompundTag var1);

   protected ListTag a(double ... var1) {
      ListTag var2 = new ListTag();
      double[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         double var6 = var3[var5];
         var2.a((BaseTag)(new DoubleTag((String)null, var6)));
      }

      return var2;
   }

   protected ListTag a(float ... var1) {
      ListTag var2 = new ListTag();
      float[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         float var6 = var3[var5];
         var2.a((BaseTag)(new FloatTag((String)null, var6)));
      }

      return var2;
   }

   public float h_() {
      return this.J / 2.0F;
   }

   public Item b(int var1, int var2) {
      return this.a(var1, var2, 0.0F);
   }

   public Item a(int var1, int var2, float var3) {
      return this.a(new aan(var1, var2, 0), var3);
   }

   public Item a(aan var1, float var2) {
      Item var3 = new Item(this.k, this.o, this.p + (double)var2, this.q, var1);
      var3.c = 10;
      this.k.a((BaseEntity)var3);
      return var3;
   }

   public boolean M() {
      return !this.G;
   }

   public boolean N() {
      for(int var1 = 0; var1 < 8; ++var1) {
         float var2 = ((float)((var1 >> 0) % 2) - 0.5F) * this.I * 0.8F;
         float var3 = ((float)((var1 >> 1) % 2) - 0.5F) * 0.1F;
         float var4 = ((float)((var1 >> 2) % 2) - 0.5F) * this.I * 0.8F;
         int var5 = Utils.c(this.o + (double)var2);
         int var6 = Utils.c(this.p + (double)this.I() + (double)var3);
         int var7 = Utils.c(this.q + (double)var4);
         if(this.k.h(var5, var6, var7)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(Player var1) {
      return false;
   }

   public wu b(BaseEntity var1) {
      return null;
   }

   public void O() {
      if(this.j.G) {
         this.j = null;
      } else {
         this.r = 0.0D;
         this.s = 0.0D;
         this.t = 0.0D;
         this.J_();
         if(this.j != null) {
            this.j.i_();
            this.am += (double)(this.j.u - this.j.w);

            for(this.e += (double)(this.j.v - this.j.x); this.am >= 180.0D; this.am -= 360.0D) {
               ;
            }

            while(this.am < -180.0D) {
               this.am += 360.0D;
            }

            while(this.e >= 180.0D) {
               this.e -= 360.0D;
            }

            while(this.e < -180.0D) {
               this.e += 360.0D;
            }

            double var1 = this.am * 0.5D;
            double var3 = this.e * 0.5D;
            float var5 = 10.0F;
            if(var1 > (double)var5) {
               var1 = (double)var5;
            }

            if(var1 < (double)(-var5)) {
               var1 = (double)(-var5);
            }

            if(var3 > (double)var5) {
               var3 = (double)var5;
            }

            if(var3 < (double)(-var5)) {
               var3 = (double)(-var5);
            }

            this.am -= var1;
            this.e -= var3;
            this.u = (float)((double)this.u + var1);
            this.v = (float)((double)this.v + var3);
         }
      }
   }

   public void i_() {
      this.i.d(this.o, this.p + this.l() + this.i.P(), this.q);
   }

   public double P() {
      return (double)this.H;
   }

   public double l() {
      return (double)this.J * 0.75D;
   }

   public void h(BaseEntity var1) {
      this.e = 0.0D;
      this.am = 0.0D;
      if(var1 == null) {
         if(this.j != null) {
            this.c(this.j.o, this.j.y.b + (double)this.j.J, this.j.q, this.u, this.v);
            this.j.i = null;
         }

         this.j = null;
      } else if(this.j == var1) {
         this.j.i = null;
         this.j = null;
         this.c(var1.o, var1.y.b + (double)var1.J, var1.q, this.u, this.v);
      } else {
         if(this.j != null) {
            this.j.i = null;
         }

         if(var1.i != null) {
            var1.i.j = null;
         }

         this.j = var1;
         var1.i = this;
      }
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.d(var1, var3, var5);
      this.b(var7, var8);
      List var10 = this.k.a(this, this.y.e(0.03125D, 0.0D, 0.03125D));
      if(var10.size() > 0) {
         double var11 = 0.0D;

         for(int var13 = 0; var13 < var10.size(); ++var13) {
            wu var14 = (wu)var10.get(var13);
            if(var14.e > var11) {
               var11 = var14.e;
            }
         }

         var3 += var11 - this.y.b;
         this.d(var1, var3, var5);
      }

   }

   public float j_() {
      return 0.1F;
   }

   public bo Q() {
      return null;
   }

   public void R() {}

   public void a(double var1, double var3, double var5) {
      this.r = var1;
      this.s = var3;
      this.t = var5;
   }

   public void a(byte var1) {}

   public void k() {}

   public void S() {}

   public void b(int var1, int var2, int var3) {}

   public boolean T() {
      return this.fireTime > 0 || this.f(0);
   }

   public boolean U() {
      return this.j != null || this.f(2);
   }

   public boolean V() {
      return this.f(1);
   }

   public void c(boolean var1) {
      this.a(1, var1);
   }

   public boolean W() {
      return this.f(3);
   }

   public void d(boolean var1) {
      this.a(3, var1);
   }

   public boolean X() {
      return this.f(4);
   }

   public void e(boolean var1) {
      this.a(4, var1);
   }

   protected boolean f(int var1) {
      return (this.ac.a(0) & 1 << var1) != 0;
   }

   protected void a(int var1, boolean var2) {
      byte var3 = this.ac.a(0);
      if(var2) {
         this.ac.b(0, Byte.valueOf((byte)(var3 | 1 << var1)));
      } else {
         this.ac.b(0, Byte.valueOf((byte)(var3 & ~(1 << var1))));
      }

   }

   public int Y() {
      return this.ac.b(1);
   }

   public void g(int var1) {
      this.ac.b(1, Short.valueOf((short)var1));
   }

   public void a(d var1) {
      this.a((int)5);
      ++this.fireTime;
      if(this.fireTime == 0) {
         this.e(8);
      }

   }

   public void b(Mob var1) {}

   protected boolean h(double var1, double var3, double var5) {
      int var7 = Utils.c(var1);
      int var8 = Utils.c(var3);
      int var9 = Utils.c(var5);
      double var10 = var1 - (double)var7;
      double var12 = var3 - (double)var8;
      double var14 = var5 - (double)var9;
      if(this.k.h(var7, var8, var9)) {
         boolean var16 = !this.k.h(var7 - 1, var8, var9);
         boolean var17 = !this.k.h(var7 + 1, var8, var9);
         boolean var18 = !this.k.h(var7, var8 - 1, var9);
         boolean var19 = !this.k.h(var7, var8 + 1, var9);
         boolean var20 = !this.k.h(var7, var8, var9 - 1);
         boolean var21 = !this.k.h(var7, var8, var9 + 1);
         byte var22 = -1;
         double var23 = 9999.0D;
         if(var16 && var10 < var23) {
            var23 = var10;
            var22 = 0;
         }

         if(var17 && 1.0D - var10 < var23) {
            var23 = 1.0D - var10;
            var22 = 1;
         }

         if(var18 && var12 < var23) {
            var23 = var12;
            var22 = 2;
         }

         if(var19 && 1.0D - var12 < var23) {
            var23 = 1.0D - var12;
            var22 = 3;
         }

         if(var20 && var14 < var23) {
            var23 = var14;
            var22 = 4;
         }

         if(var21 && 1.0D - var14 < var23) {
            var23 = 1.0D - var14;
            var22 = 5;
         }

         float var25 = this.U.nextFloat() * 0.2F + 0.1F;
         if(var22 == 0) {
            this.r = (double)(-var25);
         }

         if(var22 == 1) {
            this.r = (double)var25;
         }

         if(var22 == 2) {
            this.s = (double)(-var25);
         }

         if(var22 == 3) {
            this.s = (double)var25;
         }

         if(var22 == 4) {
            this.t = (double)(-var25);
         }

         if(var22 == 5) {
            this.t = (double)var25;
         }

         return true;
      } else {
         return false;
      }
   }

   public void q() {
      this.E = true;
      this.fallDistance = 0.0F;
   }

   public BaseEntity[] Z() {
      return null;
   }

   public boolean a(BaseEntity var1) {
      return this == var1;
   }

   public void f(float var1) {}

   public boolean k_() {
      return true;
   }

}
