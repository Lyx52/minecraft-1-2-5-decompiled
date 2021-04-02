package mojang;

import java.util.List;

public class Boat extends BaseEntity {

   private int a;
   private double b;
   private double c;
   private double d;
   private double e;
   private double am;
   private double an;
   private double ao;
   private double ap;


   public Boat(World var1) {
      super(var1);
      this.h = true;
      this.a(1.5F, 0.6F);
      this.H = this.J / 2.0F;
   }

   protected boolean e_() {
      return false;
   }

   protected void b() {
      this.ac.a(17, new Integer(0));
      this.ac.a(18, new Integer(1));
      this.ac.a(19, new Integer(0));
   }

   public wu b(BaseEntity var1) {
      return var1.y;
   }

   public wu f_() {
      return this.y;
   }

   public boolean d_() {
      return true;
   }

   public Boat(World var1, double var2, double var4, double var6) {
      this(var1);
      this.d(var2, var4 + (double)this.H, var6);
      this.r = 0.0D;
      this.s = 0.0D;
      this.t = 0.0D;
      this.sandX = var2;
      this.sandY = var4;
      this.sandZ = var6;
   }

   public double l() {
      return (double)this.J * 0.0D - 0.30000001192092896D;
   }

   public boolean a(md var1, int var2) {
      if(!this.k.F && !this.G) {
         this.d(-this.p());
         this.c(10);
         this.b(this.n() + var2 * 10);
         this.K();
         if(this.n() > 40) {
            if(this.i != null) {
               this.i.h(this);
            }

            int var3;
            for(var3 = 0; var3 < 3; ++var3) {
               this.a(pb.x.bO, 1, 0.0F);
            }

            for(var3 = 0; var3 < 2; ++var3) {
               this.a(yr.D.bQ, 1, 0.0F);
            }

            this.A();
         }

         return true;
      } else {
         return true;
      }
   }

   public void k() {
      this.d(-this.p());
      this.c(10);
      this.b(this.n() * 11);
   }

   public boolean l_() {
      return !this.G;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.b = var1;
      this.c = var3;
      this.d = var5;
      this.e = (double)var7;
      this.am = (double)var8;
      this.a = var9 + 4;
      this.r = this.an;
      this.s = this.ao;
      this.t = this.ap;
   }

   public void a(double var1, double var3, double var5) {
      this.an = this.r = var1;
      this.ao = this.s = var3;
      this.ap = this.t = var5;
   }

   public void J_() {
      super.J_();
      if(this.o() > 0) {
         this.c(this.o() - 1);
      }

      if(this.n() > 0) {
         this.b(this.n() - 1);
      }

      this.sandX = this.o;
      this.sandY = this.p;
      this.sandZ = this.q;
      byte var1 = 5;
      double var2 = 0.0D;

      for(int var4 = 0; var4 < var1; ++var4) {
         double var5 = this.y.b + (this.y.e - this.y.b) * (double)(var4 + 0) / (double)var1 - 0.125D;
         double var7 = this.y.b + (this.y.e - this.y.b) * (double)(var4 + 1) / (double)var1 - 0.125D;
         wu var9 = wu.b(this.y.a, var5, this.y.c, this.y.d, var7, this.y.f);
         if(this.k.b(var9, acn.g)) {
            var2 += 1.0D / (double)var1;
         }
      }

      double var21 = Math.sqrt(this.r * this.r + this.t * this.t);
      double var6;
      double var8;
      if(var21 > 0.15D) {
         var6 = Math.cos((double)this.u * 3.141592653589793D / 180.0D);
         var8 = Math.sin((double)this.u * 3.141592653589793D / 180.0D);

         for(int var10 = 0; (double)var10 < 1.0D + var21 * 60.0D; ++var10) {
            double var11 = (double)(this.U.nextFloat() * 2.0F - 1.0F);
            double var13 = (double)(this.U.nextInt(2) * 2 - 1) * 0.7D;
            double var15;
            double var17;
            if(this.U.nextBoolean()) {
               var15 = this.o - var6 * var11 * 0.8D + var8 * var13;
               var17 = this.q - var8 * var11 * 0.8D - var6 * var13;
               this.k.a("splash", var15, this.p - 0.125D, var17, this.r, this.s, this.t);
            } else {
               var15 = this.o + var6 + var8 * var11 * 0.7D;
               var17 = this.q + var8 - var6 * var11 * 0.7D;
               this.k.a("splash", var15, this.p - 0.125D, var17, this.r, this.s, this.t);
            }
         }
      }

      double var12;
      double var23;
      if(this.k.F) {
         if(this.a > 0) {
            var6 = this.o + (this.b - this.o) / (double)this.a;
            var8 = this.p + (this.c - this.p) / (double)this.a;
            var23 = this.q + (this.d - this.q) / (double)this.a;

            for(var12 = this.e - (double)this.u; var12 < -180.0D; var12 += 360.0D) {
               ;
            }

            while(var12 >= 180.0D) {
               var12 -= 360.0D;
            }

            this.u = (float)((double)this.u + var12 / (double)this.a);
            this.v = (float)((double)this.v + (this.am - (double)this.v) / (double)this.a);
            --this.a;
            this.d(var6, var8, var23);
            this.b(this.u, this.v);
         } else {
            var6 = this.o + this.r;
            var8 = this.p + this.s;
            var23 = this.q + this.t;
            this.d(var6, var8, var23);
            if(this.z) {
               this.r *= 0.5D;
               this.s *= 0.5D;
               this.t *= 0.5D;
            }

            this.r *= 0.9900000095367432D;
            this.s *= 0.949999988079071D;
            this.t *= 0.9900000095367432D;
         }

      } else {
         if(var2 < 1.0D) {
            var6 = var2 * 2.0D - 1.0D;
            this.s += 0.03999999910593033D * var6;
         } else {
            if(this.s < 0.0D) {
               this.s /= 2.0D;
            }

            this.s += 0.007000000216066837D;
         }

         if(this.i != null) {
            this.r += this.i.r * 0.2D;
            this.t += this.i.t * 0.2D;
         }

         var6 = 0.4D;
         if(this.r < -var6) {
            this.r = -var6;
         }

         if(this.r > var6) {
            this.r = var6;
         }

         if(this.t < -var6) {
            this.t = -var6;
         }

         if(this.t > var6) {
            this.t = var6;
         }

         if(this.z) {
            this.r *= 0.5D;
            this.s *= 0.5D;
            this.t *= 0.5D;
         }

         this.b(this.r, this.s, this.t);
         if(this.A && var21 > 0.2D) {
            if(!this.k.F) {
               this.A();

               int var22;
               for(var22 = 0; var22 < 3; ++var22) {
                  this.a(pb.x.bO, 1, 0.0F);
               }

               for(var22 = 0; var22 < 2; ++var22) {
                  this.a(yr.D.bQ, 1, 0.0F);
               }
            }
         } else {
            this.r *= 0.9900000095367432D;
            this.s *= 0.949999988079071D;
            this.t *= 0.9900000095367432D;
         }

         this.v = 0.0F;
         var8 = (double)this.u;
         var23 = this.sandX - this.o;
         var12 = this.sandZ - this.q;
         if(var23 * var23 + var12 * var12 > 0.001D) {
            var8 = (double)((float)(Math.atan2(var12, var23) * 180.0D / 3.141592653589793D));
         }

         double var14;
         for(var14 = var8 - (double)this.u; var14 >= 180.0D; var14 -= 360.0D) {
            ;
         }

         while(var14 < -180.0D) {
            var14 += 360.0D;
         }

         if(var14 > 20.0D) {
            var14 = 20.0D;
         }

         if(var14 < -20.0D) {
            var14 = -20.0D;
         }

         this.u = (float)((double)this.u + var14);
         this.b(this.u, this.v);
         List var16 = this.k.b((BaseEntity)this, this.y.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
         int var24;
         if(var16 != null && var16.size() > 0) {
            for(var24 = 0; var24 < var16.size(); ++var24) {
               BaseEntity var18 = (BaseEntity)var16.get(var24);
               if(var18 != this.i && var18.d_() && var18 instanceof Boat) {
                  var18.g(this);
               }
            }
         }

         for(var24 = 0; var24 < 4; ++var24) {
            int var25 = Utils.c(this.o + ((double)(var24 % 2) - 0.5D) * 0.8D);
            int var19 = Utils.c(this.p);
            int var20 = Utils.c(this.q + ((double)(var24 / 2) - 0.5D) * 0.8D);
            if(this.k.a(var25, var19, var20) == pb.aS.bO) {
               this.k.g(var25, var19, var20, 0);
            }
         }

         if(this.i != null && this.i.G) {
            this.i = null;
         }

      }
   }

   public void i_() {
      if(this.i != null) {
         double var1 = Math.cos((double)this.u * 3.141592653589793D / 180.0D) * 0.4D;
         double var3 = Math.sin((double)this.u * 3.141592653589793D / 180.0D) * 0.4D;
         this.i.d(this.o + var1, this.p + this.l() + this.i.P(), this.q + var3);
      }
   }

   protected void b(CompundTag var1) {}

   protected void a(CompundTag var1) {}

   public float h_() {
      return 0.0F;
   }

   public boolean c(Player var1) {
      if(this.i != null && this.i instanceof Player && this.i != var1) {
         return true;
      } else {
         if(!this.k.F) {
            var1.h(this);
         }

         return true;
      }
   }

   public void b(int var1) {
      this.ac.b(19, Integer.valueOf(var1));
   }

   public int n() {
      return this.ac.c(19);
   }

   public void c(int var1) {
      this.ac.b(17, Integer.valueOf(var1));
   }

   public int o() {
      return this.ac.c(17);
   }

   public void d(int var1) {
      this.ac.b(18, Integer.valueOf(var1));
   }

   public int p() {
      return this.ac.c(18);
   }
}
