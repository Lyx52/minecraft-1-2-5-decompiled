import java.util.Iterator;
import java.util.List;

public class oq extends ajn {

   public double a;
   public double b;
   public double c;
   public double[][] d = new double[64][3];
   public int e = -1;
   public dg[] am;
   public dg an;
   public dg ao;
   public dg ap;
   public dg aq;
   public dg ar;
   public dg as;
   public dg at;
   public float au = 0.0F;
   public float av = 0.0F;
   public boolean aw = false;
   public boolean ax = false;
   private nn aB;
   public int ay = 0;
   public el az = null;


   public oq(xd var1) {
      super(var1);
      this.am = new dg[]{this.an = new dg(this, "head", 6.0F, 6.0F), this.ao = new dg(this, "body", 8.0F, 8.0F), this.ap = new dg(this, "tail", 4.0F, 4.0F), this.aq = new dg(this, "tail", 4.0F, 4.0F), this.ar = new dg(this, "tail", 4.0F, 4.0F), this.as = new dg(this, "wing", 4.0F, 4.0F), this.at = new dg(this, "wing", 4.0F, 4.0F)};
      this.aA = 200;
      this.l(this.aA);
      this.bm = "/mob/enderdragon/ender.png";
      this.a(16.0F, 8.0F);
      this.S = true;
      this.ab = true;
      this.b = 100.0D;
      this.ak = true;
   }

   protected void b() {
      super.b();
      this.ac.a(16, new Integer(this.aA));
   }

   public double[] a(int var1, float var2) {
      if(this.bx <= 0) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var3 = this.e - var1 * 1 & 63;
      int var4 = this.e - var1 * 1 - 1 & 63;
      double[] var5 = new double[3];
      double var6 = this.d[var3][0];

      double var8;
      for(var8 = this.d[var4][0] - var6; var8 < -180.0D; var8 += 360.0D) {
         ;
      }

      while(var8 >= 180.0D) {
         var8 -= 360.0D;
      }

      var5[0] = var6 + var8 * (double)var2;
      var6 = this.d[var3][1];
      var8 = this.d[var4][1] - var6;
      var5[1] = var6 + var8 * (double)var2;
      var5[2] = this.d[var3][2] + (this.d[var4][2] - this.d[var3][2]) * (double)var2;
      return var5;
   }

   public void e() {
      this.au = this.av;
      if(!this.k.F) {
         this.ac.b(16, Integer.valueOf(this.bx));
      }

      float var1;
      float var3;
      float var26;
      if(this.bx <= 0) {
         var1 = (this.U.nextFloat() - 0.5F) * 8.0F;
         var26 = (this.U.nextFloat() - 0.5F) * 4.0F;
         var3 = (this.U.nextFloat() - 0.5F) * 8.0F;
         this.k.a("largeexplode", this.o + (double)var1, this.p + 2.0D + (double)var26, this.q + (double)var3, 0.0D, 0.0D, 0.0D);
      } else {
         this.af();
         var1 = 0.2F / (gk.a(this.r * this.r + this.t * this.t) * 10.0F + 1.0F);
         var1 *= (float)Math.pow(2.0D, this.s);
         if(this.ax) {
            this.av += var1 * 0.5F;
         } else {
            this.av += var1;
         }

         while(this.u >= 180.0F) {
            this.u -= 360.0F;
         }

         while(this.u < -180.0F) {
            this.u += 360.0F;
         }

         if(this.e < 0) {
            for(int var2 = 0; var2 < this.d.length; ++var2) {
               this.d[var2][0] = (double)this.u;
               this.d[var2][1] = this.p;
            }
         }

         if(++this.e == this.d.length) {
            this.e = 0;
         }

         this.d[this.e][0] = (double)this.u;
         this.d[this.e][1] = this.p;
         double var4;
         double var6;
         double var8;
         double var25;
         float var31;
         if(this.k.F) {
            if(this.bV > 0) {
               var25 = this.o + (this.bW - this.o) / (double)this.bV;
               var4 = this.p + (this.bX - this.p) / (double)this.bV;
               var6 = this.q + (this.bY - this.q) / (double)this.bV;

               for(var8 = this.bZ - (double)this.u; var8 < -180.0D; var8 += 360.0D) {
                  ;
               }

               while(var8 >= 180.0D) {
                  var8 -= 360.0D;
               }

               this.u = (float)((double)this.u + var8 / (double)this.bV);
               this.v = (float)((double)this.v + (this.ca - (double)this.v) / (double)this.bV);
               --this.bV;
               this.d(var25, var4, var6);
               this.b(this.u, this.v);
            }
         } else {
            var25 = this.a - this.o;
            var4 = this.b - this.p;
            var6 = this.c - this.q;
            var8 = var25 * var25 + var4 * var4 + var6 * var6;
            if(this.aB != null) {
               this.a = this.aB.o;
               this.c = this.aB.q;
               double var10 = this.a - this.o;
               double var12 = this.c - this.q;
               double var14 = Math.sqrt(var10 * var10 + var12 * var12);
               double var16 = 0.4000000059604645D + var14 / 80.0D - 1.0D;
               if(var16 > 10.0D) {
                  var16 = 10.0D;
               }

               this.b = this.aB.y.b + var16;
            } else {
               this.a += this.U.nextGaussian() * 2.0D;
               this.c += this.U.nextGaussian() * 2.0D;
            }

            if(this.aw || var8 < 100.0D || var8 > 22500.0D || this.A || this.B) {
               this.ah();
            }

            var4 /= (double)gk.a(var25 * var25 + var6 * var6);
            var31 = 0.6F;
            if(var4 < (double)(-var31)) {
               var4 = (double)(-var31);
            }

            if(var4 > (double)var31) {
               var4 = (double)var31;
            }

            for(this.s += var4 * 0.10000000149011612D; this.u < -180.0F; this.u += 360.0F) {
               ;
            }

            while(this.u >= 180.0F) {
               this.u -= 360.0F;
            }

            double var11 = 180.0D - Math.atan2(var25, var6) * 180.0D / 3.1415927410125732D;

            double var13;
            for(var13 = var11 - (double)this.u; var13 < -180.0D; var13 += 360.0D) {
               ;
            }

            while(var13 >= 180.0D) {
               var13 -= 360.0D;
            }

            if(var13 > 50.0D) {
               var13 = 50.0D;
            }

            if(var13 < -50.0D) {
               var13 = -50.0D;
            }

            bo var15 = bo.b(this.a - this.o, this.b - this.p, this.c - this.q).c();
            bo var39 = bo.b((double)gk.a(this.u * 3.1415927F / 180.0F), this.s, (double)(-gk.b(this.u * 3.1415927F / 180.0F))).c();
            float var17 = (float)(var39.b(var15) + 0.5D) / 1.5F;
            if(var17 < 0.0F) {
               var17 = 0.0F;
            }

            this.cg *= 0.8F;
            float var18 = gk.a(this.r * this.r + this.t * this.t) * 1.0F + 1.0F;
            double var19 = Math.sqrt(this.r * this.r + this.t * this.t) * 1.0D + 1.0D;
            if(var19 > 40.0D) {
               var19 = 40.0D;
            }

            this.cg = (float)((double)this.cg + var13 * (0.699999988079071D / var19 / (double)var18));
            this.u += this.cg * 0.1F;
            float var21 = (float)(2.0D / (var19 + 1.0D));
            float var22 = 0.06F;
            this.a(0.0F, -1.0F, var22 * (var17 * var21 + (1.0F - var21)));
            if(this.ax) {
               this.b(this.r * 0.800000011920929D, this.s * 0.800000011920929D, this.t * 0.800000011920929D);
            } else {
               this.b(this.r, this.s, this.t);
            }

            bo var23 = bo.b(this.r, this.s, this.t).c();
            float var24 = (float)(var23.b(var39) + 1.0D) / 2.0F;
            var24 = 0.8F + 0.15F * var24;
            this.r *= (double)var24;
            this.t *= (double)var24;
            this.s *= 0.9100000262260437D;
         }

         this.bd = this.u;
         this.an.I = this.an.J = 3.0F;
         this.ap.I = this.ap.J = 2.0F;
         this.aq.I = this.aq.J = 2.0F;
         this.ar.I = this.ar.J = 2.0F;
         this.ao.J = 3.0F;
         this.ao.I = 5.0F;
         this.as.J = 2.0F;
         this.as.I = 4.0F;
         this.at.J = 3.0F;
         this.at.I = 4.0F;
         var26 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F / 180.0F * 3.1415927F;
         var3 = gk.b(var26);
         float var27 = -gk.a(var26);
         float var5 = this.u * 3.1415927F / 180.0F;
         float var28 = gk.a(var5);
         float var7 = gk.b(var5);
         this.ao.J_();
         this.ao.c(this.o + (double)(var28 * 0.5F), this.p, this.q - (double)(var7 * 0.5F), 0.0F, 0.0F);
         this.as.J_();
         this.as.c(this.o + (double)(var7 * 4.5F), this.p + 2.0D, this.q + (double)(var28 * 4.5F), 0.0F, 0.0F);
         this.at.J_();
         this.at.c(this.o - (double)(var7 * 4.5F), this.p + 2.0D, this.q - (double)(var28 * 4.5F), 0.0F, 0.0F);
         if(!this.k.F) {
            this.ag();
         }

         if(!this.k.F && this.bB == 0) {
            this.a(this.k.b((nn)this, this.as.y.b(4.0D, 2.0D, 4.0D).d(0.0D, -2.0D, 0.0D)));
            this.a(this.k.b((nn)this, this.at.y.b(4.0D, 2.0D, 4.0D).d(0.0D, -2.0D, 0.0D)));
            this.b(this.k.b((nn)this, this.an.y.b(1.0D, 1.0D, 1.0D)));
         }

         double[] var29 = this.a(5, 1.0F);
         double[] var9 = this.a(0, 1.0F);
         var31 = gk.a(this.u * 3.1415927F / 180.0F - this.cg * 0.01F);
         float var33 = gk.b(this.u * 3.1415927F / 180.0F - this.cg * 0.01F);
         this.an.J_();
         this.an.c(this.o + (double)(var31 * 5.5F * var3), this.p + (var9[1] - var29[1]) * 1.0D + (double)(var27 * 5.5F), this.q - (double)(var33 * 5.5F * var3), 0.0F, 0.0F);

         for(int var30 = 0; var30 < 3; ++var30) {
            dg var32 = null;
            if(var30 == 0) {
               var32 = this.ap;
            }

            if(var30 == 1) {
               var32 = this.aq;
            }

            if(var30 == 2) {
               var32 = this.ar;
            }

            double[] var34 = this.a(12 + var30 * 2, 1.0F);
            float var35 = this.u * 3.1415927F / 180.0F + this.b(var34[0] - var29[0]) * 3.1415927F / 180.0F * 1.0F;
            float var37 = gk.a(var35);
            float var36 = gk.b(var35);
            float var38 = 1.5F;
            float var40 = (float)(var30 + 1) * 2.0F;
            var32.J_();
            var32.c(this.o - (double)((var28 * var38 + var37 * var40) * var3), this.p + (var34[1] - var29[1]) * 1.0D - (double)((var40 + var38) * var27) + 1.5D, this.q + (double)((var7 * var38 + var36 * var40) * var3), 0.0F, 0.0F);
         }

         if(!this.k.F) {
            this.ax = this.a(this.an.y) | this.a(this.ao.y);
         }

      }
   }

   private void af() {
      if(this.az != null) {
         if(this.az.G) {
            if(!this.k.F) {
               this.a(this.an, md.l, 10);
            }

            this.az = null;
         } else if(this.V % 10 == 0 && this.bx < this.aA) {
            ++this.bx;
         }
      }

      if(this.U.nextInt(10) == 0) {
         float var1 = 32.0F;
         List var2 = this.k.a(el.class, this.y.b((double)var1, (double)var1, (double)var1));
         el var3 = null;
         double var4 = Double.MAX_VALUE;
         Iterator var6 = var2.iterator();

         while(var6.hasNext()) {
            nn var7 = (nn)var6.next();
            double var8 = var7.f(this);
            if(var8 < var4) {
               var4 = var8;
               var3 = (el)var7;
            }
         }

         this.az = var3;
      }

   }

   private void ag() {}

   private void a(List var1) {
      double var2 = (this.ao.y.a + this.ao.y.d) / 2.0D;
      double var4 = (this.ao.y.c + this.ao.y.f) / 2.0D;
      Iterator var6 = var1.iterator();

      while(var6.hasNext()) {
         nn var7 = (nn)var6.next();
         if(var7 instanceof acq) {
            double var8 = var7.o - var2;
            double var10 = var7.q - var4;
            double var12 = var8 * var8 + var10 * var10;
            var7.c(var8 / var12 * 4.0D, 0.20000000298023224D, var10 / var12 * 4.0D);
         }
      }

   }

   private void b(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         nn var3 = (nn)var1.get(var2);
         if(var3 instanceof acq) {
            var3.a(md.a((acq)this), 10);
         }
      }

   }

   private void ah() {
      this.aw = false;
      if(this.U.nextInt(2) == 0 && this.k.d.size() > 0) {
         this.aB = (nn)this.k.d.get(this.U.nextInt(this.k.d.size()));
      } else {
         boolean var1 = false;

         do {
            this.a = 0.0D;
            this.b = (double)(70.0F + this.U.nextFloat() * 50.0F);
            this.c = 0.0D;
            this.a += (double)(this.U.nextFloat() * 120.0F - 60.0F);
            this.c += (double)(this.U.nextFloat() * 120.0F - 60.0F);
            double var2 = this.o - this.a;
            double var4 = this.p - this.b;
            double var6 = this.q - this.c;
            var1 = var2 * var2 + var4 * var4 + var6 * var6 > 100.0D;
         } while(!var1);

         this.aB = null;
      }

   }

   private float b(double var1) {
      while(var1 >= 180.0D) {
         var1 -= 360.0D;
      }

      while(var1 < -180.0D) {
         var1 += 360.0D;
      }

      return (float)var1;
   }

   private boolean a(wu var1) {
      int var2 = gk.c(var1.a);
      int var3 = gk.c(var1.b);
      int var4 = gk.c(var1.c);
      int var5 = gk.c(var1.d);
      int var6 = gk.c(var1.e);
      int var7 = gk.c(var1.f);
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var2; var10 <= var5; ++var10) {
         for(int var11 = var3; var11 <= var6; ++var11) {
            for(int var12 = var4; var12 <= var7; ++var12) {
               int var13 = this.k.a(var10, var11, var12);
               if(var13 != 0) {
                  if(var13 != pb.ap.bO && var13 != pb.bJ.bO && var13 != pb.z.bO) {
                     var9 = true;
                     this.k.g(var10, var11, var12, 0);
                  } else {
                     var8 = true;
                  }
               }
            }
         }
      }

      if(var9) {
         double var16 = var1.a + (var1.d - var1.a) * (double)this.U.nextFloat();
         double var17 = var1.b + (var1.e - var1.b) * (double)this.U.nextFloat();
         double var14 = var1.c + (var1.f - var1.c) * (double)this.U.nextFloat();
         this.k.a("largeexplode", var16, var17, var14, 0.0D, 0.0D, 0.0D);
      }

      return var8;
   }

   public boolean a(dg var1, md var2, int var3) {
      if(var1 != this.an) {
         var3 = var3 / 4 + 1;
      }

      float var4 = this.u * 3.1415927F / 180.0F;
      float var5 = gk.a(var4);
      float var6 = gk.b(var4);
      this.a = this.o + (double)(var5 * 5.0F) + (double)((this.U.nextFloat() - 0.5F) * 2.0F);
      this.b = this.p + (double)(this.U.nextFloat() * 3.0F) + 1.0D;
      this.c = this.q - (double)(var6 * 5.0F) + (double)((this.U.nextFloat() - 0.5F) * 2.0F);
      this.aB = null;
      if(var2.a() instanceof yw || var2 == md.l) {
         this.e(var2, var3);
      }

      return true;
   }

   protected void w_() {
      ++this.ay;
      if(this.ay >= 180 && this.ay <= 200) {
         float var1 = (this.U.nextFloat() - 0.5F) * 8.0F;
         float var2 = (this.U.nextFloat() - 0.5F) * 4.0F;
         float var3 = (this.U.nextFloat() - 0.5F) * 8.0F;
         this.k.a("hugeexplosion", this.o + (double)var1, this.p + 2.0D + (double)var2, this.q + (double)var3, 0.0D, 0.0D, 0.0D);
      }

      int var4;
      int var5;
      if(!this.k.F && this.ay > 150 && this.ay % 5 == 0) {
         var4 = 1000;

         while(var4 > 0) {
            var5 = bz.b(var4);
            var4 -= var5;
            this.k.a((nn)(new bz(this.k, this.o, this.p, this.q, var5)));
         }
      }

      this.b(0.0D, 0.10000000149011612D, 0.0D);
      this.bd = this.u += 20.0F;
      if(this.ay == 200) {
         var4 = 10000;

         while(var4 > 0) {
            var5 = bz.b(var4);
            var4 -= var5;
            this.k.a((nn)(new bz(this.k, this.o, this.p, this.q, var5)));
         }

         this.a(gk.c(this.o), gk.c(this.q));
         this.bc();
         this.A();
      }

   }

   private void a(int var1, int var2) {
      byte var3 = 64;
      tc.a = true;
      byte var4 = 4;

      for(int var5 = var3 - 1; var5 <= var3 + 32; ++var5) {
         for(int var6 = var1 - var4; var6 <= var1 + var4; ++var6) {
            for(int var7 = var2 - var4; var7 <= var2 + var4; ++var7) {
               double var8 = (double)(var6 - var1);
               double var10 = (double)(var7 - var2);
               double var12 = (double)gk.a(var8 * var8 + var10 * var10);
               if(var12 <= (double)var4 - 0.5D) {
                  if(var5 < var3) {
                     if(var12 <= (double)(var4 - 1) - 0.5D) {
                        this.k.g(var6, var5, var7, pb.z.bO);
                     }
                  } else if(var5 > var3) {
                     this.k.g(var6, var5, var7, 0);
                  } else if(var12 > (double)(var4 - 1) - 0.5D) {
                     this.k.g(var6, var5, var7, pb.z.bO);
                  } else {
                     this.k.g(var6, var5, var7, pb.bH.bO);
                  }
               }
            }
         }
      }

      this.k.g(var1, var3 + 0, var2, pb.z.bO);
      this.k.g(var1, var3 + 1, var2, pb.z.bO);
      this.k.g(var1, var3 + 2, var2, pb.z.bO);
      this.k.g(var1 - 1, var3 + 2, var2, pb.aq.bO);
      this.k.g(var1 + 1, var3 + 2, var2, pb.aq.bO);
      this.k.g(var1, var3 + 2, var2 - 1, pb.aq.bO);
      this.k.g(var1, var3 + 2, var2 + 1, pb.aq.bO);
      this.k.g(var1, var3 + 3, var2, pb.z.bO);
      this.k.g(var1, var3 + 4, var2, pb.bK.bO);
      tc.a = false;
   }

   protected void w() {}

   public nn[] Z() {
      return this.am;
   }

   public boolean l_() {
      return false;
   }

   public int x() {
      return this.ac.c(16);
   }
}
