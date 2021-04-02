package mojang;

import java.util.List;

public class Minecart extends BaseEntity implements io {

   private aan[] d;
   private int e;
   private boolean am;
   public int a;
   public double b;
   public double c;
   private static final int[][][] an = new int[][][]{{{0, 0, -1}, {0, 0, 1}}, {{-1, 0, 0}, {1, 0, 0}}, {{-1, -1, 0}, {1, 0, 0}}, {{-1, 0, 0}, {1, -1, 0}}, {{0, 0, -1}, {0, -1, 1}}, {{0, -1, -1}, {0, 0, 1}}, {{0, 0, 1}, {1, 0, 0}}, {{0, 0, 1}, {-1, 0, 0}}, {{0, 0, -1}, {-1, 0, 0}}, {{0, 0, -1}, {1, 0, 0}}};
   private int ao;
   private double ap;
   private double aq;
   private double ar;
   private double as;
   private double at;
   private double au;
   private double av;
   private double aw;


   public Minecart(World var1) {
      super(var1);
      this.d = new aan[36];
      this.e = 0;
      this.am = false;
      this.h = true;
      this.a(0.98F, 0.7F);
      this.H = this.J / 2.0F;
   }

   protected boolean e_() {
      return false;
   }

   protected void b() {
      this.ac.a(16, new Byte((byte)0));
      this.ac.a(17, new Integer(0));
      this.ac.a(18, new Integer(1));
      this.ac.a(19, new Integer(0));
   }

   public wu b(BaseEntity var1) {
      return var1.y;
   }

   public wu f_() {
      return null;
   }

   public boolean d_() {
      return true;
   }

   public Minecart(World var1, double var2, double var4, double var6, int var8) {
      this(var1);
      this.d(var2, var4 + (double)this.H, var6);
      this.r = 0.0D;
      this.s = 0.0D;
      this.t = 0.0D;
      this.sandX = var2;
      this.sandY = var4;
      this.sandZ = var6;
      this.a = var8;
   }

   public double l() {
      return (double)this.J * 0.0D - 0.30000001192092896D;
   }

   public boolean a(md var1, int var2) {
      if(!this.k.F && !this.G) {
         this.h(-this.r());
         this.d(10);
         this.K();
         this.c(this.o() + var2 * 10);
         if(this.o() > 40) {
            if(this.i != null) {
               this.i.h(this);
            }

            this.A();
            this.a(yr.az.bQ, 1, 0.0F);
            if(this.a == 1) {
               Minecart var3 = this;

               for(int var4 = 0; var4 < var3.a(); ++var4) {
                  aan var5 = var3.k_(var4);
                  if(var5 != null) {
                     float var6 = this.U.nextFloat() * 0.8F + 0.1F;
                     float var7 = this.U.nextFloat() * 0.8F + 0.1F;
                     float var8 = this.U.nextFloat() * 0.8F + 0.1F;

                     while(var5.a > 0) {
                        int var9 = this.U.nextInt(21) + 10;
                        if(var9 > var5.a) {
                           var9 = var5.a;
                        }

                        var5.a -= var9;
                        Item var10 = new Item(this.k, this.o + (double)var6, this.p + (double)var7, this.q + (double)var8, new aan(var5.c, var9, var5.i()));
                        float var11 = 0.05F;
                        var10.r = (double)((float)this.U.nextGaussian() * var11);
                        var10.s = (double)((float)this.U.nextGaussian() * var11 + 0.2F);
                        var10.t = (double)((float)this.U.nextGaussian() * var11);
                        this.k.a((BaseEntity)var10);
                     }
                  }
               }

               this.a(pb.au.bO, 1, 0.0F);
            } else if(this.a == 2) {
               this.a(pb.aB.bO, 1, 0.0F);
            }
         }

         return true;
      } else {
         return true;
      }
   }

   public void k() {
      this.h(-this.r());
      this.d(10);
      this.c(this.o() + this.o() * 10);
   }

   public boolean l_() {
      return !this.G;
   }

   public void A() {
      for(int var1 = 0; var1 < this.a(); ++var1) {
         aan var2 = this.k_(var1);
         if(var2 != null) {
            float var3 = this.U.nextFloat() * 0.8F + 0.1F;
            float var4 = this.U.nextFloat() * 0.8F + 0.1F;
            float var5 = this.U.nextFloat() * 0.8F + 0.1F;

            while(var2.a > 0) {
               int var6 = this.U.nextInt(21) + 10;
               if(var6 > var2.a) {
                  var6 = var2.a;
               }

               var2.a -= var6;
               Item var7 = new Item(this.k, this.o + (double)var3, this.p + (double)var4, this.q + (double)var5, new aan(var2.c, var6, var2.i()));
               if(var2.n()) {
                  var7.a.d((CompundTag)var2.o().b());
               }

               float var8 = 0.05F;
               var7.r = (double)((float)this.U.nextGaussian() * var8);
               var7.s = (double)((float)this.U.nextGaussian() * var8 + 0.2F);
               var7.t = (double)((float)this.U.nextGaussian() * var8);
               this.k.a((BaseEntity)var7);
            }
         }
      }

      super.A();
   }

   public void J_() {
      if(this.p() > 0) {
         this.d(this.p() - 1);
      }

      if(this.o() > 0) {
         this.c(this.o() - 1);
      }

      if(this.p < -64.0D) {
         this.E();
      }

      if(this.n() && this.U.nextInt(4) == 0) {
         this.k.a("largesmoke", this.o, this.p + 0.8D, this.q, 0.0D, 0.0D, 0.0D);
      }

      if(this.k.F) {
         if(this.ao > 0) {
            double var45 = this.o + (this.ap - this.o) / (double)this.ao;
            double var46 = this.p + (this.aq - this.p) / (double)this.ao;
            double var5 = this.q + (this.ar - this.q) / (double)this.ao;

            double var7;
            for(var7 = this.as - (double)this.u; var7 < -180.0D; var7 += 360.0D) {
               ;
            }

            while(var7 >= 180.0D) {
               var7 -= 360.0D;
            }

            this.u = (float)((double)this.u + var7 / (double)this.ao);
            this.v = (float)((double)this.v + (this.at - (double)this.v) / (double)this.ao);
            --this.ao;
            this.d(var45, var46, var5);
            this.b(this.u, this.v);
         } else {
            this.d(this.o, this.p, this.q);
            this.b(this.u, this.v);
         }

      } else {
         this.sandX = this.o;
         this.sandY = this.p;
         this.sandZ = this.q;
         this.s -= 0.03999999910593033D;
         int var1 = Utils.c(this.o);
         int var2 = Utils.c(this.p);
         int var3 = Utils.c(this.q);
         if(aez.h(this.k, var1, var2 - 1, var3)) {
            --var2;
         }

         double var4 = 0.4D;
         double var6 = 0.0078125D;
         int var8 = this.k.a(var1, var2, var3);
         if(aez.e(var8)) {
            bo var9 = this.i(this.o, this.p, this.q);
            int var10 = this.k.e(var1, var2, var3);
            this.p = (double)var2;
            boolean var11 = false;
            boolean var12 = false;
            if(var8 == pb.T.bO) {
               var11 = (var10 & 8) != 0;
               var12 = !var11;
            }

            if(((aez)pb.m[var8]).v()) {
               var10 &= 7;
            }

            if(var10 >= 2 && var10 <= 5) {
               this.p = (double)(var2 + 1);
            }

            if(var10 == 2) {
               this.r -= var6;
            }

            if(var10 == 3) {
               this.r += var6;
            }

            if(var10 == 4) {
               this.t += var6;
            }

            if(var10 == 5) {
               this.t -= var6;
            }

            int[][] var13 = an[var10];
            double var14 = (double)(var13[1][0] - var13[0][0]);
            double var16 = (double)(var13[1][2] - var13[0][2]);
            double var18 = Math.sqrt(var14 * var14 + var16 * var16);
            double var20 = this.r * var14 + this.t * var16;
            if(var20 < 0.0D) {
               var14 = -var14;
               var16 = -var16;
            }

            double var22 = Math.sqrt(this.r * this.r + this.t * this.t);
            this.r = var22 * var14 / var18;
            this.t = var22 * var16 / var18;
            double var24;
            if(var12) {
               var24 = Math.sqrt(this.r * this.r + this.t * this.t);
               if(var24 < 0.03D) {
                  this.r *= 0.0D;
                  this.s *= 0.0D;
                  this.t *= 0.0D;
               } else {
                  this.r *= 0.5D;
                  this.s *= 0.0D;
                  this.t *= 0.5D;
               }
            }

            var24 = 0.0D;
            double var26 = (double)var1 + 0.5D + (double)var13[0][0] * 0.5D;
            double var28 = (double)var3 + 0.5D + (double)var13[0][2] * 0.5D;
            double var30 = (double)var1 + 0.5D + (double)var13[1][0] * 0.5D;
            double var32 = (double)var3 + 0.5D + (double)var13[1][2] * 0.5D;
            var14 = var30 - var26;
            var16 = var32 - var28;
            double var34;
            double var36;
            double var38;
            if(var14 == 0.0D) {
               this.o = (double)var1 + 0.5D;
               var24 = this.q - (double)var3;
            } else if(var16 == 0.0D) {
               this.q = (double)var3 + 0.5D;
               var24 = this.o - (double)var1;
            } else {
               var34 = this.o - var26;
               var36 = this.q - var28;
               var38 = (var34 * var14 + var36 * var16) * 2.0D;
               var24 = var38;
            }

            this.o = var26 + var14 * var24;
            this.q = var28 + var16 * var24;
            this.d(this.o, this.p + (double)this.H, this.q);
            var34 = this.r;
            var36 = this.t;
            if(this.i != null) {
               var34 *= 0.75D;
               var36 *= 0.75D;
            }

            if(var34 < -var4) {
               var34 = -var4;
            }

            if(var34 > var4) {
               var34 = var4;
            }

            if(var36 < -var4) {
               var36 = -var4;
            }

            if(var36 > var4) {
               var36 = var4;
            }

            this.b(var34, 0.0D, var36);
            if(var13[0][1] != 0 && Utils.c(this.o) - var1 == var13[0][0] && Utils.c(this.q) - var3 == var13[0][2]) {
               this.d(this.o, this.p + (double)var13[0][1], this.q);
            } else if(var13[1][1] != 0 && Utils.c(this.o) - var1 == var13[1][0] && Utils.c(this.q) - var3 == var13[1][2]) {
               this.d(this.o, this.p + (double)var13[1][1], this.q);
            }

            if(this.i != null) {
               this.r *= 0.996999979019165D;
               this.s *= 0.0D;
               this.t *= 0.996999979019165D;
            } else {
               if(this.a == 2) {
                  var38 = (double) Utils.sqrt(this.b * this.b + this.c * this.c);
                  if(var38 > 0.01D) {
                     this.b /= var38;
                     this.c /= var38;
                     double var40 = 0.04D;
                     this.r *= 0.800000011920929D;
                     this.s *= 0.0D;
                     this.t *= 0.800000011920929D;
                     this.r += this.b * var40;
                     this.t += this.c * var40;
                  } else {
                     this.r *= 0.8999999761581421D;
                     this.s *= 0.0D;
                     this.t *= 0.8999999761581421D;
                  }
               }

               this.r *= 0.9599999785423279D;
               this.s *= 0.0D;
               this.t *= 0.9599999785423279D;
            }

            bo var51 = this.i(this.o, this.p, this.q);
            if(var51 != null && var9 != null) {
               double var39 = (var9.b - var51.b) * 0.05D;
               var22 = Math.sqrt(this.r * this.r + this.t * this.t);
               if(var22 > 0.0D) {
                  this.r = this.r / var22 * (var22 + var39);
                  this.t = this.t / var22 * (var22 + var39);
               }

               this.d(this.o, var51.b, this.q);
            }

            int var52 = Utils.c(this.o);
            int var53 = Utils.c(this.q);
            if(var52 != var1 || var53 != var3) {
               var22 = Math.sqrt(this.r * this.r + this.t * this.t);
               this.r = var22 * (double)(var52 - var1);
               this.t = var22 * (double)(var53 - var3);
            }

            double var41;
            if(this.a == 2) {
               var41 = (double) Utils.sqrt(this.b * this.b + this.c * this.c);
               if(var41 > 0.01D && this.r * this.r + this.t * this.t > 0.001D) {
                  this.b /= var41;
                  this.c /= var41;
                  if(this.b * this.r + this.c * this.t < 0.0D) {
                     this.b = 0.0D;
                     this.c = 0.0D;
                  } else {
                     this.b = this.r;
                     this.c = this.t;
                  }
               }
            }

            if(var11) {
               var41 = Math.sqrt(this.r * this.r + this.t * this.t);
               if(var41 > 0.01D) {
                  double var43 = 0.06D;
                  this.r += this.r / var41 * var43;
                  this.t += this.t / var41 * var43;
               } else if(var10 == 1) {
                  if(this.k.h(var1 - 1, var2, var3)) {
                     this.r = 0.02D;
                  } else if(this.k.h(var1 + 1, var2, var3)) {
                     this.r = -0.02D;
                  }
               } else if(var10 == 0) {
                  if(this.k.h(var1, var2, var3 - 1)) {
                     this.t = 0.02D;
                  } else if(this.k.h(var1, var2, var3 + 1)) {
                     this.t = -0.02D;
                  }
               }
            }
         } else {
            if(this.r < -var4) {
               this.r = -var4;
            }

            if(this.r > var4) {
               this.r = var4;
            }

            if(this.t < -var4) {
               this.t = -var4;
            }

            if(this.t > var4) {
               this.t = var4;
            }

            if(this.z) {
               this.r *= 0.5D;
               this.s *= 0.5D;
               this.t *= 0.5D;
            }

            this.b(this.r, this.s, this.t);
            if(!this.z) {
               this.r *= 0.949999988079071D;
               this.s *= 0.949999988079071D;
               this.t *= 0.949999988079071D;
            }
         }

         this.v = 0.0F;
         double var47 = this.sandX - this.o;
         double var48 = this.sandZ - this.q;
         if(var47 * var47 + var48 * var48 > 0.001D) {
            this.u = (float)(Math.atan2(var48, var47) * 180.0D / 3.141592653589793D);
            if(this.am) {
               this.u += 180.0F;
            }
         }

         double var49;
         for(var49 = (double)(this.u - this.w); var49 >= 180.0D; var49 -= 360.0D) {
            ;
         }

         while(var49 < -180.0D) {
            var49 += 360.0D;
         }

         if(var49 < -170.0D || var49 >= 170.0D) {
            this.u += 180.0F;
            this.am = !this.am;
         }

         this.b(this.u, this.v);
         List var15 = this.k.b((BaseEntity)this, this.y.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
         if(var15 != null && var15.size() > 0) {
            for(int var50 = 0; var50 < var15.size(); ++var50) {
               BaseEntity var17 = (BaseEntity)var15.get(var50);
               if(var17 != this.i && var17.d_() && var17 instanceof Minecart) {
                  var17.g(this);
               }
            }
         }

         if(this.i != null && this.i.G) {
            if(this.i.j == this) {
               this.i.j = null;
            }

            this.i = null;
         }

         if(this.e > 0) {
            --this.e;
         }

         if(this.e <= 0) {
            this.b = this.c = 0.0D;
         }

         this.a(this.e > 0);
      }
   }

   public bo a(double var1, double var3, double var5, double var7) {
      int var9 = Utils.c(var1);
      int var10 = Utils.c(var3);
      int var11 = Utils.c(var5);
      if(aez.h(this.k, var9, var10 - 1, var11)) {
         --var10;
      }

      int var12 = this.k.a(var9, var10, var11);
      if(!aez.e(var12)) {
         return null;
      } else {
         int var13 = this.k.e(var9, var10, var11);
         if(((aez)pb.m[var12]).v()) {
            var13 &= 7;
         }

         var3 = (double)var10;
         if(var13 >= 2 && var13 <= 5) {
            var3 = (double)(var10 + 1);
         }

         int[][] var14 = an[var13];
         double var15 = (double)(var14[1][0] - var14[0][0]);
         double var17 = (double)(var14[1][2] - var14[0][2]);
         double var19 = Math.sqrt(var15 * var15 + var17 * var17);
         var15 /= var19;
         var17 /= var19;
         var1 += var15 * var7;
         var5 += var17 * var7;
         if(var14[0][1] != 0 && Utils.c(var1) - var9 == var14[0][0] && Utils.c(var5) - var11 == var14[0][2]) {
            var3 += (double)var14[0][1];
         } else if(var14[1][1] != 0 && Utils.c(var1) - var9 == var14[1][0] && Utils.c(var5) - var11 == var14[1][2]) {
            var3 += (double)var14[1][1];
         }

         return this.i(var1, var3, var5);
      }
   }

   public bo i(double var1, double var3, double var5) {
      int var7 = Utils.c(var1);
      int var8 = Utils.c(var3);
      int var9 = Utils.c(var5);
      if(aez.h(this.k, var7, var8 - 1, var9)) {
         --var8;
      }

      int var10 = this.k.a(var7, var8, var9);
      if(aez.e(var10)) {
         int var11 = this.k.e(var7, var8, var9);
         var3 = (double)var8;
         if(((aez)pb.m[var10]).v()) {
            var11 &= 7;
         }

         if(var11 >= 2 && var11 <= 5) {
            var3 = (double)(var8 + 1);
         }

         int[][] var12 = an[var11];
         double var13 = 0.0D;
         double var15 = (double)var7 + 0.5D + (double)var12[0][0] * 0.5D;
         double var17 = (double)var8 + 0.5D + (double)var12[0][1] * 0.5D;
         double var19 = (double)var9 + 0.5D + (double)var12[0][2] * 0.5D;
         double var21 = (double)var7 + 0.5D + (double)var12[1][0] * 0.5D;
         double var23 = (double)var8 + 0.5D + (double)var12[1][1] * 0.5D;
         double var25 = (double)var9 + 0.5D + (double)var12[1][2] * 0.5D;
         double var27 = var21 - var15;
         double var29 = (var23 - var17) * 2.0D;
         double var31 = var25 - var19;
         if(var27 == 0.0D) {
            var1 = (double)var7 + 0.5D;
            var13 = var5 - (double)var9;
         } else if(var31 == 0.0D) {
            var5 = (double)var9 + 0.5D;
            var13 = var1 - (double)var7;
         } else {
            double var33 = var1 - var15;
            double var35 = var5 - var19;
            double var37 = (var33 * var27 + var35 * var31) * 2.0D;
            var13 = var37;
         }

         var1 = var15 + var27 * var13;
         var3 = var17 + var29 * var13;
         var5 = var19 + var31 * var13;
         if(var29 < 0.0D) {
            ++var3;
         }

         if(var29 > 0.0D) {
            var3 += 0.5D;
         }

         return bo.b(var1, var3, var5);
      } else {
         return null;
      }
   }

   protected void b(CompundTag var1) {
      var1.addInt("Type", this.a);
      if(this.a == 2) {
         var1.addDouble("PushX", this.b);
         var1.addDouble("PushZ", this.c);
         var1.addShort("Fuel", (short)this.e);
      } else if(this.a == 1) {
         ListTag var2 = new ListTag();

         for(int var3 = 0; var3 < this.d.length; ++var3) {
            if(this.d[var3] != null) {
               CompundTag var4 = new CompundTag();
               var4.addByte("Slot", (byte)var3);
               this.d[var3].b(var4);
               var2.a((BaseTag)var4);
            }
         }

         var1.addBaseTag("Items", (BaseTag)var2);
      }

   }

   protected void a(CompundTag var1) {
      this.a = var1.getInt("Type");
      if(this.a == 2) {
         this.b = var1.getDouble("PushX");
         this.c = var1.getDouble("PushZ");
         this.e = var1.getShort("Fuel");
      } else if(this.a == 1) {
         ListTag var2 = var1.getListTag("Items");
         this.d = new aan[this.a()];

         for(int var3 = 0; var3 < var2.d(); ++var3) {
            CompundTag var4 = (CompundTag)var2.a(var3);
            int var5 = var4.getByte("Slot") & 255;
            if(var5 >= 0 && var5 < this.d.length) {
               this.d[var5] = aan.a(var4);
            }
         }
      }

   }

   public float h_() {
      return 0.0F;
   }

   public void g(BaseEntity var1) {
      if(!this.k.F) {
         if(var1 != this.i) {
            if(var1 instanceof Mob && !(var1 instanceof Player) && !(var1 instanceof VillagerGolem) && this.a == 0 && this.r * this.r + this.t * this.t > 0.01D && this.i == null && var1.j == null) {
               var1.h(this);
            }

            double var2 = var1.o - this.o;
            double var4 = var1.q - this.q;
            double var6 = var2 * var2 + var4 * var4;
            if(var6 >= 9.999999747378752E-5D) {
               var6 = (double) Utils.sqrt(var6);
               var2 /= var6;
               var4 /= var6;
               double var8 = 1.0D / var6;
               if(var8 > 1.0D) {
                  var8 = 1.0D;
               }

               var2 *= var8;
               var4 *= var8;
               var2 *= 0.10000000149011612D;
               var4 *= 0.10000000149011612D;
               var2 *= (double)(1.0F - this.T);
               var4 *= (double)(1.0F - this.T);
               var2 *= 0.5D;
               var4 *= 0.5D;
               if(var1 instanceof Minecart) {
                  double var10 = var1.o - this.o;
                  double var12 = var1.q - this.q;
                  bo var14 = bo.b(var10, 0.0D, var12).c();
                  bo var15 = bo.b((double) Utils.cos(this.u * 3.1415927F / 180.0F), 0.0D, (double) Utils.sin(this.u * 3.1415927F / 180.0F)).c();
                  double var16 = Math.abs(var14.b(var15));
                  if(var16 < 0.800000011920929D) {
                     return;
                  }

                  double var18 = var1.r + this.r;
                  double var20 = var1.t + this.t;
                  if(((Minecart)var1).a == 2 && this.a != 2) {
                     this.r *= 0.20000000298023224D;
                     this.t *= 0.20000000298023224D;
                     this.c(var1.r - var2, 0.0D, var1.t - var4);
                     var1.r *= 0.949999988079071D;
                     var1.t *= 0.949999988079071D;
                  } else if(((Minecart)var1).a != 2 && this.a == 2) {
                     var1.r *= 0.20000000298023224D;
                     var1.t *= 0.20000000298023224D;
                     var1.c(this.r + var2, 0.0D, this.t + var4);
                     this.r *= 0.949999988079071D;
                     this.t *= 0.949999988079071D;
                  } else {
                     var18 /= 2.0D;
                     var20 /= 2.0D;
                     this.r *= 0.20000000298023224D;
                     this.t *= 0.20000000298023224D;
                     this.c(var18 - var2, 0.0D, var20 - var4);
                     var1.r *= 0.20000000298023224D;
                     var1.t *= 0.20000000298023224D;
                     var1.c(var18 + var2, 0.0D, var20 + var4);
                  }
               } else {
                  this.c(-var2, 0.0D, -var4);
                  var1.c(var2 / 4.0D, 0.0D, var4 / 4.0D);
               }
            }

         }
      }
   }

   public int a() {
      return 27;
   }

   public aan k_(int var1) {
      return this.d[var1];
   }

   public aan a(int var1, int var2) {
      if(this.d[var1] != null) {
         aan var3;
         if(this.d[var1].a <= var2) {
            var3 = this.d[var1];
            this.d[var1] = null;
            return var3;
         } else {
            var3 = this.d[var1].a(var2);
            if(this.d[var1].a == 0) {
               this.d[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public aan b(int var1) {
      if(this.d[var1] != null) {
         aan var2 = this.d[var1];
         this.d[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, aan var2) {
      this.d[var1] = var2;
      if(var2 != null && var2.a > this.d()) {
         var2.a = this.d();
      }

   }

   public String c() {
      return "container.minecart";
   }

   public int d() {
      return 64;
   }

   public void j() {}

   public boolean c(Player var1) {
      if(this.a == 0) {
         if(this.i != null && this.i instanceof Player && this.i != var1) {
            return true;
         }

         if(!this.k.F) {
            var1.h(this);
         }
      } else if(this.a == 1) {
         if(!this.k.F) {
            var1.a((io)this);
         }
      } else if(this.a == 2) {
         aan var2 = var1.ap.b();
         if(var2 != null && var2.c == yr.m.bQ) {
            if(--var2.a == 0) {
               var1.ap.a(var1.ap.c, (aan)null);
            }

            this.e += 3600;
         }

         this.b = this.o - var1.o;
         this.c = this.q - var1.q;
      }

      return true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.ap = var1;
      this.aq = var3;
      this.ar = var5;
      this.as = (double)var7;
      this.at = (double)var8;
      this.ao = var9 + 2;
      this.r = this.au;
      this.s = this.av;
      this.t = this.aw;
   }

   public void a(double var1, double var3, double var5) {
      this.au = this.r = var1;
      this.av = this.s = var3;
      this.aw = this.t = var5;
   }

   public boolean a_(Player var1) {
      return this.G?false:var1.f(this) <= 64.0D;
   }

   protected boolean n() {
      return (this.ac.a(16) & 1) != 0;
   }

   protected void a(boolean var1) {
      if(var1) {
         this.ac.b(16, Byte.valueOf((byte)(this.ac.a(16) | 1)));
      } else {
         this.ac.b(16, Byte.valueOf((byte)(this.ac.a(16) & -2)));
      }

   }

   public void e() {}

   public void f() {}

   public void c(int var1) {
      this.ac.b(19, Integer.valueOf(var1));
   }

   public int o() {
      return this.ac.c(19);
   }

   public void d(int var1) {
      this.ac.b(17, Integer.valueOf(var1));
   }

   public int p() {
      return this.ac.c(17);
   }

   public void h(int var1) {
      this.ac.b(18, Integer.valueOf(var1));
   }

   public int r() {
      return this.ac.c(18);
   }

}
