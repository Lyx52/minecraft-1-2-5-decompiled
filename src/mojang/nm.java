package mojang;

import java.util.List;

public class nm extends nn {

   private int e = -1;
   private int am = -1;
   private int an = -1;
   private int ao = 0;
   private int ap = 0;
   private boolean aq = false;
   public boolean a = false;
   public int b = 0;
   public nn c;
   private int ar;
   private int as = 0;
   private double at = 2.0D;
   private int au;
   public boolean d = false;


   public nm(xd var1) {
      super(var1);
      this.a(0.5F, 0.5F);
   }

   public nm(xd var1, double var2, double var4, double var6) {
      super(var1);
      this.a(0.5F, 0.5F);
      this.d(var2, var4, var6);
      this.H = 0.0F;
   }

   public nm(xd var1, acq var2, acq var3, float var4, float var5) {
      super(var1);
      this.c = var2;
      this.a = var2 instanceof yw;
      this.p = var2.p + (double)var2.I() - 0.10000000149011612D;
      double var6 = var3.o - var2.o;
      double var8 = var3.p + (double)var3.I() - 0.699999988079071D - this.p;
      double var10 = var3.q - var2.q;
      double var12 = (double)gk.a(var6 * var6 + var10 * var10);
      if(var12 >= 1.0E-7D) {
         float var14 = (float)(Math.atan2(var10, var6) * 180.0D / 3.1415927410125732D) - 90.0F;
         float var15 = (float)(-(Math.atan2(var8, var12) * 180.0D / 3.1415927410125732D));
         double var16 = var6 / var12;
         double var18 = var10 / var12;
         this.c(var2.o + var16, this.p, var2.q + var18, var14, var15);
         this.H = 0.0F;
         float var20 = (float)var12 * 0.2F;
         this.a(var6, var8 + (double)var20, var10, var4, var5);
      }
   }

   public nm(xd var1, acq var2, float var3) {
      super(var1);
      this.c = var2;
      this.a = var2 instanceof yw;
      this.a(0.5F, 0.5F);
      this.c(var2.o, var2.p + (double)var2.I(), var2.q, var2.u, var2.v);
      this.o -= (double)(gk.b(this.u / 180.0F * 3.1415927F) * 0.16F);
      this.p -= 0.10000000149011612D;
      this.q -= (double)(gk.a(this.u / 180.0F * 3.1415927F) * 0.16F);
      this.d(this.o, this.p, this.q);
      this.H = 0.0F;
      this.r = (double)(-gk.a(this.u / 180.0F * 3.1415927F) * gk.b(this.v / 180.0F * 3.1415927F));
      this.t = (double)(gk.b(this.u / 180.0F * 3.1415927F) * gk.b(this.v / 180.0F * 3.1415927F));
      this.s = (double)(-gk.a(this.v / 180.0F * 3.1415927F));
      this.a(this.r, this.s, this.t, var3 * 1.5F, 1.0F);
   }

   protected void b() {}

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
      this.ar = 0;
   }

   public void a(double var1, double var3, double var5) {
      this.r = var1;
      this.s = var3;
      this.t = var5;
      if(this.x == 0.0F && this.w == 0.0F) {
         float var7 = gk.a(var1 * var1 + var5 * var5);
         this.w = this.u = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
         this.x = this.v = (float)(Math.atan2(var3, (double)var7) * 180.0D / 3.1415927410125732D);
         this.x = this.v;
         this.w = this.u;
         this.c(this.o, this.p, this.q, this.u, this.v);
         this.ar = 0;
      }

   }

   public void J_() {
      super.J_();
      if(this.x == 0.0F && this.w == 0.0F) {
         float var1 = gk.a(this.r * this.r + this.t * this.t);
         this.w = this.u = (float)(Math.atan2(this.r, this.t) * 180.0D / 3.1415927410125732D);
         this.x = this.v = (float)(Math.atan2(this.s, (double)var1) * 180.0D / 3.1415927410125732D);
      }

      int var15 = this.k.a(this.e, this.am, this.an);
      if(var15 > 0) {
         pb.m[var15].a((ali)this.k, this.e, this.am, this.an);
         wu var2 = pb.m[var15].c(this.k, this.e, this.am, this.an);
         if(var2 != null && var2.a(bo.b(this.o, this.p, this.q))) {
            this.aq = true;
         }
      }

      if(this.b > 0) {
         --this.b;
      }

      if(this.aq) {
         var15 = this.k.a(this.e, this.am, this.an);
         int var18 = this.k.e(this.e, this.am, this.an);
         if(var15 == this.ao && var18 == this.ap) {
            ++this.ar;
            if(this.ar == 1200) {
               this.A();
            }

         } else {
            this.aq = false;
            this.r *= (double)(this.U.nextFloat() * 0.2F);
            this.s *= (double)(this.U.nextFloat() * 0.2F);
            this.t *= (double)(this.U.nextFloat() * 0.2F);
            this.ar = 0;
            this.as = 0;
         }
      } else {
         ++this.as;
         bo var16 = bo.b(this.o, this.p, this.q);
         bo var17 = bo.b(this.o + this.r, this.p + this.s, this.q + this.t);
         pl var3 = this.k.a(var16, var17, false, true);
         var16 = bo.b(this.o, this.p, this.q);
         var17 = bo.b(this.o + this.r, this.p + this.s, this.q + this.t);
         if(var3 != null) {
            var17 = bo.b(var3.f.a, var3.f.b, var3.f.c);
         }

         nn var4 = null;
         List var5 = this.k.b((nn)this, this.y.a(this.r, this.s, this.t).b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         int var8;
         float var10;
         for(var8 = 0; var8 < var5.size(); ++var8) {
            nn var9 = (nn)var5.get(var8);
            if(var9.l_() && (var9 != this.c || this.as >= 5)) {
               var10 = 0.3F;
               wu var11 = var9.y.b((double)var10, (double)var10, (double)var10);
               pl var12 = var11.a(var16, var17);
               if(var12 != null) {
                  double var13 = var16.d(var12.f);
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

         float var19;
         if(var3 != null) {
            if(var3.g != null) {
               var19 = gk.a(this.r * this.r + this.s * this.s + this.t * this.t);
               int var20 = (int)Math.ceil((double)var19 * this.at);
               if(this.d) {
                  var20 += this.U.nextInt(var20 / 2 + 2);
               }

               md var21 = null;
               if(this.c == null) {
                  var21 = md.a(this, this);
               } else {
                  var21 = md.a(this, this.c);
               }

               if(this.T()) {
                  var3.g.e(5);
               }

               if(var3.g.a(var21, var20)) {
                  if(var3.g instanceof acq) {
                     ++((acq)var3.g).bQ;
                     if(this.au > 0) {
                        float var23 = gk.a(this.r * this.r + this.t * this.t);
                        if(var23 > 0.0F) {
                           var3.g.c(this.r * (double)this.au * 0.6000000238418579D / (double)var23, 0.1D, this.t * (double)this.au * 0.6000000238418579D / (double)var23);
                        }
                     }
                  }

                  this.k.a(this, "random.bowhit", 1.0F, 1.2F / (this.U.nextFloat() * 0.2F + 0.9F));
                  this.A();
               } else {
                  this.r *= -0.10000000149011612D;
                  this.s *= -0.10000000149011612D;
                  this.t *= -0.10000000149011612D;
                  this.u += 180.0F;
                  this.w += 180.0F;
                  this.as = 0;
               }
            } else {
               this.e = var3.b;
               this.am = var3.c;
               this.an = var3.d;
               this.ao = this.k.a(this.e, this.am, this.an);
               this.ap = this.k.e(this.e, this.am, this.an);
               this.r = (double)((float)(var3.f.a - this.o));
               this.s = (double)((float)(var3.f.b - this.p));
               this.t = (double)((float)(var3.f.c - this.q));
               var19 = gk.a(this.r * this.r + this.s * this.s + this.t * this.t);
               this.o -= this.r / (double)var19 * 0.05000000074505806D;
               this.p -= this.s / (double)var19 * 0.05000000074505806D;
               this.q -= this.t / (double)var19 * 0.05000000074505806D;
               this.k.a(this, "random.bowhit", 1.0F, 1.2F / (this.U.nextFloat() * 0.2F + 0.9F));
               this.aq = true;
               this.b = 7;
               this.d = false;
            }
         }

         if(this.d) {
            for(var8 = 0; var8 < 4; ++var8) {
               this.k.a("crit", this.o + this.r * (double)var8 / 4.0D, this.p + this.s * (double)var8 / 4.0D, this.q + this.t * (double)var8 / 4.0D, -this.r, -this.s + 0.2D, -this.t);
            }
         }

         this.o += this.r;
         this.p += this.s;
         this.q += this.t;
         var19 = gk.a(this.r * this.r + this.t * this.t);
         this.u = (float)(Math.atan2(this.r, this.t) * 180.0D / 3.1415927410125732D);

         for(this.v = (float)(Math.atan2(this.s, (double)var19) * 180.0D / 3.1415927410125732D); this.v - this.x < -180.0F; this.x -= 360.0F) {
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
         float var22 = 0.99F;
         var10 = 0.05F;
         if(this.H()) {
            for(int var24 = 0; var24 < 4; ++var24) {
               float var25 = 0.25F;
               this.k.a("bubble", this.o - this.r * (double)var25, this.p - this.s * (double)var25, this.q - this.t * (double)var25, this.r, this.s, this.t);
            }

            var22 = 0.8F;
         }

         this.r *= (double)var22;
         this.s *= (double)var22;
         this.t *= (double)var22;
         this.s -= (double)var10;
         this.d(this.o, this.p, this.q);
      }
   }

   public void b(ady var1) {
      var1.a("xTile", (short)this.e);
      var1.a("yTile", (short)this.am);
      var1.a("zTile", (short)this.an);
      var1.a("inTile", (byte)this.ao);
      var1.a("inData", (byte)this.ap);
      var1.a("shake", (byte)this.b);
      var1.a("inGround", (byte)(this.aq?1:0));
      var1.a("player", this.a);
      var1.a("damage", this.at);
   }

   public void a(ady var1) {
      this.e = var1.e("xTile");
      this.am = var1.e("yTile");
      this.an = var1.e("zTile");
      this.ao = var1.d("inTile") & 255;
      this.ap = var1.d("inData") & 255;
      this.b = var1.d("shake") & 255;
      this.aq = var1.d("inGround") == 1;
      this.a = var1.o("player");
      if(var1.c("damage")) {
         this.at = var1.i("damage");
      }

   }

   public void a(yw var1) {
      if(!this.k.F) {
         if(this.aq && this.a && this.b <= 0 && var1.ap.a(new aan(yr.l, 1))) {
            this.k.a(this, "random.pop", 0.2F, ((this.U.nextFloat() - this.U.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.b((nn)this, 1);
            this.A();
         }

      }
   }

   public float h_() {
      return 0.0F;
   }

   public void b(double var1) {
      this.at = var1;
   }

   public double n() {
      return this.at;
   }

   public void b(int var1) {
      this.au = var1;
   }

   public boolean k_() {
      return false;
   }
}
