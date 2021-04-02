package mojang;

import java.util.Random;

public abstract class agv extends pb {

   protected agv(int var1, acn var2) {
      super(var1, (var2 == acn.h?14:12) * 16 + 13, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      this.a(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
      this.a(true);
   }

   public boolean b(ali var1, int var2, int var3, int var4) {
      return this.cd != acn.h;
   }

   public int i() {
      return 16777215;
   }

   public int c(ali var1, int var2, int var3, int var4) {
      if(this.cd != acn.g) {
         return 16777215;
      } else {
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;

         for(int var8 = -1; var8 <= 1; ++var8) {
            for(int var9 = -1; var9 <= 1; ++var9) {
               int var10 = var1.a(var2 + var9, var4 + var8).H;
               var5 += (var10 & 16711680) >> 16;
               var6 += (var10 & '\uff00') >> 8;
               var7 += var10 & 255;
            }
         }

         return (var5 / 9 & 255) << 16 | (var6 / 9 & 255) << 8 | var7 / 9 & 255;
      }
   }

   public static float e(int var0) {
      if(var0 >= 8) {
         var0 = 0;
      }

      float var1 = (float)(var0 + 1) / 9.0F;
      return var1;
   }

   public int a_(int var1) {
      return var1 != 0 && var1 != 1?this.bN + 1:this.bN;
   }

   protected int h(xd var1, int var2, int var3, int var4) {
      return var1.f(var2, var3, var4) != this.cd?-1:var1.e(var2, var3, var4);
   }

   protected int g(ali var1, int var2, int var3, int var4) {
      if(var1.f(var2, var3, var4) != this.cd) {
         return -1;
      } else {
         int var5 = var1.e(var2, var3, var4);
         if(var5 >= 8) {
            var5 = 0;
         }

         return var5;
      }
   }

   public boolean b() {
      return false;
   }

   public boolean a() {
      return false;
   }

   public boolean a(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   public boolean c(ali var1, int var2, int var3, int var4, int var5) {
      acn var6 = var1.f(var2, var3, var4);
      return var6 == this.cd?false:(var5 == 1?true:(var6 == acn.u?false:super.c(var1, var2, var3, var4, var5)));
   }

   public boolean a(ali var1, int var2, int var3, int var4, int var5) {
      acn var6 = var1.f(var2, var3, var4);
      return var6 == this.cd?false:(var5 == 1?true:(var6 == acn.u?false:super.a(var1, var2, var3, var4, var5)));
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      return null;
   }

   public int d() {
      return 4;
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }

   private bo h(ali var1, int var2, int var3, int var4) {
      bo var5 = mojang.bo.b(0.0D, 0.0D, 0.0D);
      int var6 = this.g(var1, var2, var3, var4);

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var2;
         int var10 = var4;
         if(var7 == 0) {
            var8 = var2 - 1;
         }

         if(var7 == 1) {
            var10 = var4 - 1;
         }

         if(var7 == 2) {
            ++var8;
         }

         if(var7 == 3) {
            ++var10;
         }

         int var11 = this.g(var1, var8, var3, var10);
         int var12;
         if(var11 < 0) {
            if(!var1.f(var8, var3, var10).c()) {
               var11 = this.g(var1, var8, var3 - 1, var10);
               if(var11 >= 0) {
                  var12 = var11 - (var6 - 8);
                  var5 = var5.c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
               }
            }
         } else if(var11 >= 0) {
            var12 = var11 - var6;
            var5 = var5.c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
         }
      }

      if(var1.e(var2, var3, var4) >= 8) {
         boolean var13 = false;
         if(var13 || this.c(var1, var2, var3, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2, var3, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2 - 1, var3, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2 + 1, var3, var4, 5)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2, var3 + 1, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2, var3 + 1, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2 - 1, var3 + 1, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2 + 1, var3 + 1, var4, 5)) {
            var13 = true;
         }

         if(var13) {
            var5 = var5.c().c(0.0D, -6.0D, 0.0D);
         }
      }

      var5 = var5.c();
      return var5;
   }

   public void a(xd var1, int var2, int var3, int var4, nn var5, bo var6) {
      bo var7 = this.h((ali)var1, var2, var3, var4);
      var6.a += var7.a;
      var6.b += var7.b;
      var6.c += var7.c;
   }

   public int e() {
      return this.cd == acn.g?5:(this.cd == acn.h?30:0);
   }

   public int d(ali var1, int var2, int var3, int var4) {
      int var5 = var1.b(var2, var3, var4, 0);
      int var6 = var1.b(var2, var3 + 1, var4, 0);
      int var7 = var5 & 255;
      int var8 = var6 & 255;
      int var9 = var5 >> 16 & 255;
      int var10 = var6 >> 16 & 255;
      return (var7 > var8?var7:var8) | (var9 > var10?var9:var10) << 16;
   }

   public float e(ali var1, int var2, int var3, int var4) {
      float var5 = var1.c(var2, var3, var4);
      float var6 = var1.c(var2, var3 + 1, var4);
      return var5 > var6?var5:var6;
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
   }

   public int c() {
      return this.cd == acn.g?1:0;
   }

   public void b(xd var1, int var2, int var3, int var4, Random var5) {
      int var6;
      if(this.cd == acn.g) {
         if(var5.nextInt(10) == 0) {
            var6 = var1.e(var2, var3, var4);
            if(var6 <= 0 || var6 >= 8) {
               var1.a("suspended", (double)((float)var2 + var5.nextFloat()), (double)((float)var3 + var5.nextFloat()), (double)((float)var4 + var5.nextFloat()), 0.0D, 0.0D, 0.0D);
            }
         }

         for(var6 = 0; var6 < 0; ++var6) {
            int var7 = var5.nextInt(4);
            int var8 = var2;
            int var9 = var4;
            if(var7 == 0) {
               var8 = var2 - 1;
            }

            if(var7 == 1) {
               ++var8;
            }

            if(var7 == 2) {
               var9 = var4 - 1;
            }

            if(var7 == 3) {
               ++var9;
            }

            if(var1.f(var8, var3, var9) == acn.a && (var1.f(var8, var3 - 1, var9).c() || var1.f(var8, var3 - 1, var9).d())) {
               float var10 = 0.0625F;
               double var11 = (double)((float)var2 + var5.nextFloat());
               double var13 = (double)((float)var3 + var5.nextFloat());
               double var15 = (double)((float)var4 + var5.nextFloat());
               if(var7 == 0) {
                  var11 = (double)((float)var2 - var10);
               }

               if(var7 == 1) {
                  var11 = (double)((float)(var2 + 1) + var10);
               }

               if(var7 == 2) {
                  var15 = (double)((float)var4 - var10);
               }

               if(var7 == 3) {
                  var15 = (double)((float)(var4 + 1) + var10);
               }

               double var17 = 0.0D;
               double var19 = 0.0D;
               if(var7 == 0) {
                  var17 = (double)(-var10);
               }

               if(var7 == 1) {
                  var17 = (double)var10;
               }

               if(var7 == 2) {
                  var19 = (double)(-var10);
               }

               if(var7 == 3) {
                  var19 = (double)var10;
               }

               var1.a("splash", var11, var13, var15, var17, 0.0D, var19);
            }
         }
      }

      if(this.cd == acn.g && var5.nextInt(64) == 0) {
         var6 = var1.e(var2, var3, var4);
         if(var6 > 0 && var6 < 8) {
            var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "liquid.water", var5.nextFloat() * 0.25F + 0.75F, var5.nextFloat() * 1.0F + 0.5F);
         }
      }

      double var21;
      double var22;
      double var23;
      if(this.cd == acn.h && var1.f(var2, var3 + 1, var4) == acn.a && !var1.g(var2, var3 + 1, var4)) {
         if(var5.nextInt(100) == 0) {
            var21 = (double)((float)var2 + var5.nextFloat());
            var22 = (double)var3 + this.bZ;
            var23 = (double)((float)var4 + var5.nextFloat());
            var1.a("lava", var21, var22, var23, 0.0D, 0.0D, 0.0D);
            var1.a(var21, var22, var23, "liquid.lavapop", 0.2F + var5.nextFloat() * 0.2F, 0.9F + var5.nextFloat() * 0.15F);
         }

         if(var5.nextInt(200) == 0) {
            var1.a((double)var2, (double)var3, (double)var4, "liquid.lava", 0.2F + var5.nextFloat() * 0.2F, 0.9F + var5.nextFloat() * 0.15F);
         }
      }

      if(var5.nextInt(10) == 0 && var1.h(var2, var3 - 1, var4) && !var1.f(var2, var3 - 2, var4).c()) {
         var21 = (double)((float)var2 + var5.nextFloat());
         var22 = (double)var3 - 1.05D;
         var23 = (double)((float)var4 + var5.nextFloat());
         if(this.cd == acn.g) {
            var1.a("dripWater", var21, var22, var23, 0.0D, 0.0D, 0.0D);
         } else {
            var1.a("dripLava", var21, var22, var23, 0.0D, 0.0D, 0.0D);
         }
      }

   }

   public static double a(ali var0, int var1, int var2, int var3, acn var4) {
      bo var5 = null;
      if(var4 == acn.g) {
         var5 = ((agv) A).h(var0, var1, var2, var3);
      }

      if(var4 == acn.h) {
         var5 = ((agv) C).h(var0, var1, var2, var3);
      }

      return var5.a == 0.0D && var5.c == 0.0D?-1000.0D:Math.atan2(var5.c, var5.a) - 1.5707963267948966D;
   }

   public void a(xd var1, int var2, int var3, int var4) {
      this.j(var1, var2, var3, var4);
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      this.j(var1, var2, var3, var4);
   }

   private void j(xd var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this.bO) {
         if(this.cd == acn.h) {
            boolean var5 = false;
            if(var5 || var1.f(var2, var3, var4 - 1) == acn.g) {
               var5 = true;
            }

            if(var5 || var1.f(var2, var3, var4 + 1) == acn.g) {
               var5 = true;
            }

            if(var5 || var1.f(var2 - 1, var3, var4) == acn.g) {
               var5 = true;
            }

            if(var5 || var1.f(var2 + 1, var3, var4) == acn.g) {
               var5 = true;
            }

            if(var5 || var1.f(var2, var3 + 1, var4) == acn.g) {
               var5 = true;
            }

            if(var5) {
               int var6 = var1.e(var2, var3, var4);
               if(var6 == 0) {
                  var1.g(var2, var3, var4, ap.bO);
               } else if(var6 <= 4) {
                  var1.g(var2, var3, var4, w.bO);
               }

               this.i(var1, var2, var3, var4);
            }
         }

      }
   }

   protected void i(xd var1, int var2, int var3, int var4) {
      var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.r.nextFloat() - var1.r.nextFloat()) * 0.8F);

      for(int var5 = 0; var5 < 8; ++var5) {
         var1.a("largesmoke", (double)var2 + Math.random(), (double)var3 + 1.2D, (double)var4 + Math.random(), 0.0D, 0.0D, 0.0D);
      }

   }
}
