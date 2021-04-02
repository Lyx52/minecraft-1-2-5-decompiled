package mojang;

import java.util.Random;

public class ame extends pb {

   private int[] a = new int[256];
   private int[] b = new int[256];


   protected ame(int var1, int var2) {
      super(var1, var2, acn.n);
      this.a(true);
   }

   public void l() {
      this.a(x.bO, 5, 20);
      this.a(aZ.bO, 5, 20);
      this.a(at.bO, 5, 20);
      this.a(J.bO, 5, 5);
      this.a(K.bO, 30, 60);
      this.a(an.bO, 30, 20);
      this.a(am.bO, 15, 100);
      this.a(X.bO, 60, 100);
      this.a(ab.bO, 30, 60);
      this.a(bu.bO, 15, 100);
   }

   private void a(int var1, int var2, int var3) {
      this.a[var1] = var2;
      this.b[var1] = var3;
   }

   public wu c(World var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int d() {
      return 3;
   }

   public int a(Random var1) {
      return 0;
   }

   public int e() {
      return 30;
   }

   public void a(World var1, int var2, int var3, int var4, Random var5) {
      boolean var6 = var1.a(var2, var3 - 1, var4) == bb.bO;
      if(var1.t instanceof ii && var1.a(var2, var3 - 1, var4) == z.bO) {
         var6 = true;
      }

      if(!this.e(var1, var2, var3, var4)) {
         var1.g(var2, var3, var4, 0);
      }

      if(!var6 && var1.G() && (var1.y(var2, var3, var4) || var1.y(var2 - 1, var3, var4) || var1.y(var2 + 1, var3, var4) || var1.y(var2, var3, var4 - 1) || var1.y(var2, var3, var4 + 1))) {
         var1.g(var2, var3, var4, 0);
      } else {
         int var7 = var1.e(var2, var3, var4);
         if(var7 < 15) {
            var1.c(var2, var3, var4, var7 + var5.nextInt(3) / 2);
         }

         var1.a(var2, var3, var4, this.bO, this.e() + var5.nextInt(10));
         if(!var6 && !this.h(var1, var2, var3, var4)) {
            if(!var1.h(var2, var3 - 1, var4) || var7 > 3) {
               var1.g(var2, var3, var4, 0);
            }

         } else if(!var6 && !this.g(var1, var2, var3 - 1, var4) && var7 == 15 && var5.nextInt(4) == 0) {
            var1.g(var2, var3, var4, 0);
         } else {
            boolean var8 = var1.z(var2, var3, var4);
            byte var9 = 0;
            if(var8) {
               var9 = -50;
            }

            this.a(var1, var2 + 1, var3, var4, 300 + var9, var5, var7);
            this.a(var1, var2 - 1, var3, var4, 300 + var9, var5, var7);
            this.a(var1, var2, var3 - 1, var4, 250 + var9, var5, var7);
            this.a(var1, var2, var3 + 1, var4, 250 + var9, var5, var7);
            this.a(var1, var2, var3, var4 - 1, 300 + var9, var5, var7);
            this.a(var1, var2, var3, var4 + 1, 300 + var9, var5, var7);

            for(int var10 = var2 - 1; var10 <= var2 + 1; ++var10) {
               for(int var11 = var4 - 1; var11 <= var4 + 1; ++var11) {
                  for(int var12 = var3 - 1; var12 <= var3 + 4; ++var12) {
                     if(var10 != var2 || var12 != var3 || var11 != var4) {
                        int var13 = 100;
                        if(var12 > var3 + 1) {
                           var13 += (var12 - (var3 + 1)) * 100;
                        }

                        int var14 = this.i(var1, var10, var12, var11);
                        if(var14 > 0) {
                           int var15 = (var14 + 40) / (var7 + 30);
                           if(var8) {
                              var15 /= 2;
                           }

                           if(var15 > 0 && var5.nextInt(var13) <= var15 && (!var1.G() || !var1.y(var10, var12, var11)) && !var1.y(var10 - 1, var12, var4) && !var1.y(var10 + 1, var12, var11) && !var1.y(var10, var12, var11 - 1) && !var1.y(var10, var12, var11 + 1)) {
                              int var16 = var7 + var5.nextInt(5) / 4;
                              if(var16 > 15) {
                                 var16 = 15;
                              }

                              var1.d(var10, var12, var11, this.bO, var16);
                           }
                        }
                     }
                  }
               }
            }

         }
      }
   }

   private void a(World var1, int var2, int var3, int var4, int var5, Random var6, int var7) {
      int var8 = this.b[var1.a(var2, var3, var4)];
      if(var6.nextInt(var5) < var8) {
         boolean var9 = var1.a(var2, var3, var4) == am.bO;
         if(var6.nextInt(var7 + 10) < 5 && !var1.y(var2, var3, var4)) {
            int var10 = var7 + var6.nextInt(5) / 4;
            if(var10 > 15) {
               var10 = 15;
            }

            var1.d(var2, var3, var4, this.bO, var10);
         } else {
            var1.g(var2, var3, var4, 0);
         }

         if(var9) {
            am.b(var1, var2, var3, var4, 1);
         }
      }

   }

   private boolean h(World var1, int var2, int var3, int var4) {
      return this.g(var1, var2 + 1, var3, var4)?true:(this.g(var1, var2 - 1, var3, var4)?true:(this.g(var1, var2, var3 - 1, var4)?true:(this.g(var1, var2, var3 + 1, var4)?true:(this.g(var1, var2, var3, var4 - 1)?true:this.g(var1, var2, var3, var4 + 1)))));
   }

   private int i(World var1, int var2, int var3, int var4) {
      byte var5 = 0;
      if(!var1.i(var2, var3, var4)) {
         return 0;
      } else {
         int var6 = this.f(var1, var2 + 1, var3, var4, var5);
         var6 = this.f(var1, var2 - 1, var3, var4, var6);
         var6 = this.f(var1, var2, var3 - 1, var4, var6);
         var6 = this.f(var1, var2, var3 + 1, var4, var6);
         var6 = this.f(var1, var2, var3, var4 - 1, var6);
         var6 = this.f(var1, var2, var3, var4 + 1, var6);
         return var6;
      }
   }

   public boolean j() {
      return false;
   }

   public boolean g(WorldInterface var1, int var2, int var3, int var4) {
      return this.a[var1.a(var2, var3, var4)] > 0;
   }

   public int f(World var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a[var1.a(var2, var3, var4)];
      return var6 > var5?var6:var5;
   }

   public boolean e(World var1, int var2, int var3, int var4) {
      return var1.h(var2, var3 - 1, var4) || this.h(var1, var2, var3, var4);
   }

   public void a(World var1, int var2, int var3, int var4, int var5) {
      if(!var1.h(var2, var3 - 1, var4) && !this.h(var1, var2, var3, var4)) {
         var1.g(var2, var3, var4, 0);
      }
   }

   public void a(World var1, int var2, int var3, int var4) {
      if(var1.t.g > 0 || var1.a(var2, var3 - 1, var4) != ap.bO || !be.a_(var1, var2, var3, var4)) {
         if(!var1.h(var2, var3 - 1, var4) && !this.h(var1, var2, var3, var4)) {
            var1.g(var2, var3, var4, 0);
         } else {
            var1.a(var2, var3, var4, this.bO, this.e() + var1.r.nextInt(10));
         }
      }
   }

   public void b(World var1, int var2, int var3, int var4, Random var5) {
      if(var5.nextInt(24) == 0) {
         var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "fire.fire", 1.0F + var5.nextFloat(), var5.nextFloat() * 0.7F + 0.3F);
      }

      int var6;
      float var7;
      float var8;
      float var9;
      if(!var1.h(var2, var3 - 1, var4) && !ar.g(var1, var2, var3 - 1, var4)) {
         if(ar.g(var1, var2 - 1, var3, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat() * 0.1F;
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(ar.g(var1, var2 + 1, var3, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)(var2 + 1) - var5.nextFloat() * 0.1F;
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(ar.g(var1, var2, var3, var4 - 1)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat() * 0.1F;
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(ar.g(var1, var2, var3, var4 + 1)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)(var4 + 1) - var5.nextFloat() * 0.1F;
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(ar.g(var1, var2, var3 + 1, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)(var3 + 1) - var5.nextFloat() * 0.1F;
               var9 = (float)var4 + var5.nextFloat();
               var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }
      } else {
         for(var6 = 0; var6 < 3; ++var6) {
            var7 = (float)var2 + var5.nextFloat();
            var8 = (float)var3 + var5.nextFloat() * 0.5F + 0.5F;
            var9 = (float)var4 + var5.nextFloat();
            var1.a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
         }
      }

   }
}
