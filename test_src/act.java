import java.util.List;

public class act extends nn {

   private int d;
   private int e;
   private int am;
   private int an;
   private boolean ao;
   public int a;
   public yw b;
   private int ap;
   private int aq;
   private int ar;
   public nn c;
   private int as;
   private double at;
   private double au;
   private double av;
   private double aw;
   private double ax;
   private double ay;
   private double az;
   private double aA;


   public act(xd var1) {
      super(var1);
      this.d = -1;
      this.e = -1;
      this.am = -1;
      this.an = 0;
      this.ao = false;
      this.a = 0;
      this.aq = 0;
      this.ar = 0;
      this.c = null;
      this.a(0.25F, 0.25F);
      this.ak = true;
   }

   public act(xd var1, double var2, double var4, double var6) {
      this(var1);
      this.d(var2, var4, var6);
      this.ak = true;
   }

   public act(xd var1, yw var2) {
      super(var1);
      this.d = -1;
      this.e = -1;
      this.am = -1;
      this.an = 0;
      this.ao = false;
      this.a = 0;
      this.aq = 0;
      this.ar = 0;
      this.c = null;
      this.ak = true;
      this.b = var2;
      this.b.aZ = this;
      this.a(0.25F, 0.25F);
      this.c(var2.o, var2.p + 1.62D - (double)var2.H, var2.q, var2.u, var2.v);
      this.o -= (double)(gk.b(this.u / 180.0F * 3.1415927F) * 0.16F);
      this.p -= 0.10000000149011612D;
      this.q -= (double)(gk.a(this.u / 180.0F * 3.1415927F) * 0.16F);
      this.d(this.o, this.p, this.q);
      this.H = 0.0F;
      float var3 = 0.4F;
      this.r = (double)(-gk.a(this.u / 180.0F * 3.1415927F) * gk.b(this.v / 180.0F * 3.1415927F) * var3);
      this.t = (double)(gk.b(this.u / 180.0F * 3.1415927F) * gk.b(this.v / 180.0F * 3.1415927F) * var3);
      this.s = (double)(-gk.a(this.v / 180.0F * 3.1415927F) * var3);
      this.a(this.r, this.s, this.t, 1.5F, 1.0F);
   }

   protected void b() {}

   public boolean a(double var1) {
      double var3 = this.y.c() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      float var9 = gk.a(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.U.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.U.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.U.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.r = var1;
      this.s = var3;
      this.t = var5;
      float var10 = gk.a(var1 * var1 + var5 * var5);
      this.w = this.u = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.x = this.v = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.ap = 0;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.at = var1;
      this.au = var3;
      this.av = var5;
      this.aw = (double)var7;
      this.ax = (double)var8;
      this.as = var9;
      this.r = this.ay;
      this.s = this.az;
      this.t = this.aA;
   }

   public void a(double var1, double var3, double var5) {
      this.ay = this.r = var1;
      this.az = this.s = var3;
      this.aA = this.t = var5;
   }

   public void J_() {
      super.J_();
      if(this.as > 0) {
         double var21 = this.o + (this.at - this.o) / (double)this.as;
         double var22 = this.p + (this.au - this.p) / (double)this.as;
         double var23 = this.q + (this.av - this.q) / (double)this.as;

         double var7;
         for(var7 = this.aw - (double)this.u; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.u = (float)((double)this.u + var7 / (double)this.as);
         this.v = (float)((double)this.v + (this.ax - (double)this.v) / (double)this.as);
         --this.as;
         this.d(var21, var22, var23);
         this.b(this.u, this.v);
      } else {
         if(!this.k.F) {
            aan var1 = this.b.av();
            if(this.b.G || !this.b.M() || var1 == null || var1.a() != yr.aR || this.f(this.b) > 1024.0D) {
               this.A();
               this.b.aZ = null;
               return;
            }

            if(this.c != null) {
               if(!this.c.G) {
                  this.o = this.c.o;
                  this.p = this.c.y.b + (double)this.c.J * 0.8D;
                  this.q = this.c.q;
                  return;
               }

               this.c = null;
            }
         }

         if(this.a > 0) {
            --this.a;
         }

         if(this.ao) {
            int var19 = this.k.a(this.d, this.e, this.am);
            if(var19 == this.an) {
               ++this.ap;
               if(this.ap == 1200) {
                  this.A();
               }

               return;
            }

            this.ao = false;
            this.r *= (double)(this.U.nextFloat() * 0.2F);
            this.s *= (double)(this.U.nextFloat() * 0.2F);
            this.t *= (double)(this.U.nextFloat() * 0.2F);
            this.ap = 0;
            this.aq = 0;
         } else {
            ++this.aq;
         }

         bo var20 = bo.b(this.o, this.p, this.q);
         bo var2 = bo.b(this.o + this.r, this.p + this.s, this.q + this.t);
         pl var3 = this.k.a(var20, var2);
         var20 = bo.b(this.o, this.p, this.q);
         var2 = bo.b(this.o + this.r, this.p + this.s, this.q + this.t);
         if(var3 != null) {
            var2 = bo.b(var3.f.a, var3.f.b, var3.f.c);
         }

         nn var4 = null;
         List var5 = this.k.b((nn)this, this.y.a(this.r, this.s, this.t).b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         double var13;
         for(int var8 = 0; var8 < var5.size(); ++var8) {
            nn var9 = (nn)var5.get(var8);
            if(var9.l_() && (var9 != this.b || this.aq >= 5)) {
               float var10 = 0.3F;
               wu var11 = var9.y.b((double)var10, (double)var10, (double)var10);
               pl var12 = var11.a(var20, var2);
               if(var12 != null) {
                  var13 = var20.d(var12.f);
                  if(var13 < var6 || var6 == 0.0D) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if(var4 != null) {
            var3 = new pl(var4);
         }

         if(var3 != null) {
            if(var3.g != null) {
               if(var3.g.a(md.a((nn)this, this.b), 0)) {
                  this.c = var3.g;
               }
            } else {
               this.ao = true;
            }
         }

         if(!this.ao) {
            this.b(this.r, this.s, this.t);
            float var24 = gk.a(this.r * this.r + this.t * this.t);
            this.u = (float)(Math.atan2(this.r, this.t) * 180.0D / 3.1415927410125732D);

            for(this.v = (float)(Math.atan2(this.s, (double)var24) * 180.0D / 3.1415927410125732D); this.v - this.x < -180.0F; this.x -= 360.0F) {
               ;
            }

            while(this.v - this.x >= 180.0F) {
               this.x += 360.0F;
            }

            while(this.u - this.w < -180.0F) {
               this.w -= 360.0F;
            }

            while(this.u - this.w >= 180.0F) {
               this.w += 360.0F;
            }

            this.v = this.x + (this.v - this.x) * 0.2F;
            this.u = this.w + (this.u - this.w) * 0.2F;
            float var25 = 0.92F;
            if(this.z || this.A) {
               var25 = 0.5F;
            }

            byte var26 = 5;
            double var27 = 0.0D;

            for(int var28 = 0; var28 < var26; ++var28) {
               double var14 = this.y.b + (this.y.e - this.y.b) * (double)(var28 + 0) / (double)var26 - 0.125D + 0.125D;
               double var16 = this.y.b + (this.y.e - this.y.b) * (double)(var28 + 1) / (double)var26 - 0.125D + 0.125D;
               wu var18 = wu.b(this.y.a, var14, this.y.c, this.y.d, var16, this.y.f);
               if(this.k.b(var18, acn.g)) {
                  var27 += 1.0D / (double)var26;
               }
            }

            if(var27 > 0.0D) {
               if(this.ar > 0) {
                  --this.ar;
               } else {
                  short var29 = 500;
                  if(this.k.y(gk.c(this.o), gk.c(this.p) + 1, gk.c(this.q))) {
                     var29 = 300;
                  }

                  if(this.U.nextInt(var29) == 0) {
                     this.ar = this.U.nextInt(30) + 10;
                     this.s -= 0.20000000298023224D;
                     this.k.a(this, "random.splash", 0.25F, 1.0F + (this.U.nextFloat() - this.U.nextFloat()) * 0.4F);
                     float var30 = (float)gk.c(this.y.b);

                     int var15;
                     float var17;
                     float var31;
                     for(var15 = 0; (float)var15 < 1.0F + this.I * 20.0F; ++var15) {
                        var31 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
                        var17 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
                        this.k.a("bubble", this.o + (double)var31, (double)(var30 + 1.0F), this.q + (double)var17, this.r, this.s - (double)(this.U.nextFloat() * 0.2F), this.t);
                     }

                     for(var15 = 0; (float)var15 < 1.0F + this.I * 20.0F; ++var15) {
                        var31 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
                        var17 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I;
                        this.k.a("splash", this.o + (double)var31, (double)(var30 + 1.0F), this.q + (double)var17, this.r, this.s, this.t);
                     }
                  }
               }
            }

            if(this.ar > 0) {
               this.s -= (double)(this.U.nextFloat() * this.U.nextFloat() * this.U.nextFloat()) * 0.2D;
            }

            var13 = var27 * 2.0D - 1.0D;
            this.s += 0.03999999910593033D * var13;
            if(var27 > 0.0D) {
               var25 = (float)((double)var25 * 0.9D);
               this.s *= 0.8D;
            }

            this.r *= (double)var25;
            this.s *= (double)var25;
            this.t *= (double)var25;
            this.d(this.o, this.p, this.q);
         }
      }
   }

   public void b(ady var1) {
      var1.a("xTile", (short)this.d);
      var1.a("yTile", (short)this.e);
      var1.a("zTile", (short)this.am);
      var1.a("inTile", (byte)this.an);
      var1.a("shake", (byte)this.a);
      var1.a("inGround", (byte)(this.ao?1:0));
   }

   public void a(ady var1) {
      this.d = var1.e("xTile");
      this.e = var1.e("yTile");
      this.am = var1.e("zTile");
      this.an = var1.d("inTile") & 255;
      this.a = var1.d("shake") & 255;
      this.ao = var1.d("inGround") == 1;
   }

   public float h_() {
      return 0.0F;
   }

   public int n() {
      byte var1 = 0;
      if(this.c != null) {
         double var2 = this.b.o - this.o;
         double var4 = this.b.p - this.p;
         double var6 = this.b.q - this.q;
         double var8 = (double)gk.a(var2 * var2 + var4 * var4 + var6 * var6);
         double var10 = 0.1D;
         this.c.r += var2 * var10;
         this.c.s += var4 * var10 + (double)gk.a(var8) * 0.08D;
         this.c.t += var6 * var10;
         var1 = 3;
      } else if(this.ar > 0) {
         fq var13 = new fq(this.k, this.o, this.p, this.q, new aan(yr.aU));
         double var3 = this.b.o - this.o;
         double var5 = this.b.p - this.p;
         double var7 = this.b.q - this.q;
         double var9 = (double)gk.a(var3 * var3 + var5 * var5 + var7 * var7);
         double var11 = 0.1D;
         var13.r = var3 * var11;
         var13.s = var5 * var11 + (double)gk.a(var9) * 0.08D;
         var13.t = var7 * var11;
         this.k.a((nn)var13);
         this.b.a(gv.B, 1);
         var1 = 1;
      }

      if(this.ao) {
         var1 = 2;
      }

      this.A();
      this.b.aZ = null;
      return var1;
   }
}
