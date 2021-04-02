package mojang;

import java.util.Random;

public class aho extends agy {

   private Random a = new Random();
   private final boolean b;
   private static boolean c = false;


   protected aho(int var1, boolean var2) {
      super(var1, acn.e);
      this.b = var2;
      this.bN = 45;
   }

   public int a(int var1, Random var2, int var3) {
      return aB.bO;
   }

   public void a(xd var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      this.h(var1, var2, var3, var4);
   }

   private void h(xd var1, int var2, int var3, int var4) {
      if(!var1.F) {
         int var5 = var1.a(var2, var3, var4 - 1);
         int var6 = var1.a(var2, var3, var4 + 1);
         int var7 = var1.a(var2 - 1, var3, var4);
         int var8 = var1.a(var2 + 1, var3, var4);
         byte var9 = 3;
         if(n[var5] && !n[var6]) {
            var9 = 3;
         }

         if(n[var6] && !n[var5]) {
            var9 = 2;
         }

         if(n[var7] && !n[var8]) {
            var9 = 5;
         }

         if(n[var8] && !n[var7]) {
            var9 = 4;
         }

         var1.f(var2, var3, var4, var9);
      }
   }

   public int d(ali var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return this.bN + 17;
      } else if(var5 == 0) {
         return this.bN + 17;
      } else {
         int var6 = var1.e(var2, var3, var4);
         return var5 != var6?this.bN:(this.b?this.bN + 16:this.bN - 1);
      }
   }

   public void b(xd var1, int var2, int var3, int var4, Random var5) {
      if(this.b) {
         int var6 = var1.e(var2, var3, var4);
         float var7 = (float)var2 + 0.5F;
         float var8 = (float)var3 + 0.0F + var5.nextFloat() * 6.0F / 16.0F;
         float var9 = (float)var4 + 0.5F;
         float var10 = 0.52F;
         float var11 = var5.nextFloat() * 0.6F - 0.3F;
         if(var6 == 4) {
            var1.a("smoke", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 5) {
            var1.a("smoke", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 2) {
            var1.a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 3) {
            var1.a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
         }

      }
   }

   public int a_(int var1) {
      return var1 == 1?this.bN + 17:(var1 == 0?this.bN + 17:(var1 == 3?this.bN - 1:this.bN));
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      if(var1.F) {
         return true;
      } else {
         ahg var6 = (ahg)var1.b(var2, var3, var4);
         if(var6 != null) {
            var5.a(var6);
         }

         return true;
      }
   }

   public static void a(boolean var0, xd var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      kw var6 = var1.b(var2, var3, var4);
      c = true;
      if(var0) {
         var1.g(var2, var3, var4, aC.bO);
      } else {
         var1.g(var2, var3, var4, aB.bO);
      }

      c = false;
      var1.f(var2, var3, var4, var5);
      if(var6 != null) {
         var6.m();
         var1.a(var2, var3, var4, var6);
      }

   }

   public kw u_() {
      return new ahg();
   }

   public void a(xd var1, int var2, int var3, int var4, acq var5) {
      int var6 = gk.c((double)(var5.u * 4.0F / 360.0F) + 0.5D) & 3;
      if(var6 == 0) {
         var1.f(var2, var3, var4, 2);
      }

      if(var6 == 1) {
         var1.f(var2, var3, var4, 5);
      }

      if(var6 == 2) {
         var1.f(var2, var3, var4, 3);
      }

      if(var6 == 3) {
         var1.f(var2, var3, var4, 4);
      }

   }

   public void b_(xd var1, int var2, int var3, int var4) {
      if(!c) {
         ahg var5 = (ahg)var1.b(var2, var3, var4);
         if(var5 != null) {
            for(int var6 = 0; var6 < var5.a(); ++var6) {
               aan var7 = var5.k_(var6);
               if(var7 != null) {
                  float var8 = this.a.nextFloat() * 0.8F + 0.1F;
                  float var9 = this.a.nextFloat() * 0.8F + 0.1F;
                  float var10 = this.a.nextFloat() * 0.8F + 0.1F;

                  while(var7.a > 0) {
                     int var11 = this.a.nextInt(21) + 10;
                     if(var11 > var7.a) {
                        var11 = var7.a;
                     }

                     var7.a -= var11;
                     fq var12 = new fq(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new aan(var7.c, var11, var7.i()));
                     if(var7.n()) {
                        var12.a.d((ady)var7.o().b());
                     }

                     float var13 = 0.05F;
                     var12.r = (double)((float)this.a.nextGaussian() * var13);
                     var12.s = (double)((float)this.a.nextGaussian() * var13 + 0.2F);
                     var12.t = (double)((float)this.a.nextGaussian() * var13);
                     var1.a((nn)var12);
                  }
               }
            }
         }
      }

      super.b_(var1, var2, var3, var4);
   }

}
