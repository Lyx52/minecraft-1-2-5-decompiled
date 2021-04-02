package mojang;

import java.util.Iterator;
import java.util.Random;

public class pm extends w {

   public static final int[][] a = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};


   public pm(int var1) {
      super(var1, 134, acn.m);
      this.v();
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      if(var1.F) {
         return true;
      } else {
         int var6 = var1.e(var2, var3, var4);
         if(!e(var6)) {
            int var7 = a(var6);
            var2 += a[var7][0];
            var4 += a[var7][1];
            if(var1.a(var2, var3, var4) != this.bO) {
               return true;
            }

            var6 = var1.e(var2, var3, var4);
         }

         if(!var1.t.d()) {
            double var16 = (double)var2 + 0.5D;
            double var17 = (double)var3 + 0.5D;
            double var11 = (double)var4 + 0.5D;
            var1.g(var2, var3, var4, 0);
            int var13 = a(var6);
            var2 += a[var13][0];
            var4 += a[var13][1];
            if(var1.a(var2, var3, var4) == this.bO) {
               var1.g(var2, var3, var4, 0);
               var16 = (var16 + (double)var2 + 0.5D) / 2.0D;
               var17 = (var17 + (double)var3 + 0.5D) / 2.0D;
               var11 = (var11 + (double)var4 + 0.5D) / 2.0D;
            }

            var1.a((nn)null, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), 5.0F, true);
            return true;
         } else {
            if(h(var6)) {
               yw var14 = null;
               Iterator var8 = var1.d.iterator();

               while(var8.hasNext()) {
                  yw var9 = (yw)var8.next();
                  if(var9.az()) {
                     uh var10 = var9.aL;
                     if(var10.a == var2 && var10.b == var3 && var10.c == var4) {
                        var14 = var9;
                     }
                  }
               }

               if(var14 != null) {
                  var5.b("tile.bed.occupied");
                  return true;
               }

               a(var1, var2, var3, var4, false);
            }

            ci var15 = var5.d(var2, var3, var4);
            if(var15 == ci.a) {
               a(var1, var2, var3, var4, true);
               return true;
            } else {
               if(var15 == ci.c) {
                  var5.b("tile.bed.noSleep");
               } else if(var15 == ci.f) {
                  var5.b("tile.bed.notSafe");
               }

               return true;
            }
         }
      }
   }

   public int a(int var1, int var2) {
      if(var1 == 0) {
         return x.bN;
      } else {
         int var3 = a(var2);
         int var4 = aav.h[var3][var1];
         return e(var2)?(var4 == 2?this.bN + 2 + 16:(var4 != 5 && var4 != 4?this.bN + 1:this.bN + 1 + 16)):(var4 == 3?this.bN - 1 + 16:(var4 != 5 && var4 != 4?this.bN:this.bN + 16));
      }
   }

   public int d() {
      return 14;
   }

   public boolean b() {
      return false;
   }

   public boolean a() {
      return false;
   }

   public void a(ali var1, int var2, int var3, int var4) {
      this.v();
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      int var7 = a(var6);
      if(e(var6)) {
         if(var1.a(var2 - a[var7][0], var3, var4 - a[var7][1]) != this.bO) {
            var1.g(var2, var3, var4, 0);
         }
      } else if(var1.a(var2 + a[var7][0], var3, var4 + a[var7][1]) != this.bO) {
         var1.g(var2, var3, var4, 0);
         if(!var1.F) {
            this.a(var1, var2, var3, var4, var6, 0);
         }
      }

   }

   public int a(int var1, Random var2, int var3) {
      return e(var1)?0:yr.ba.bQ;
   }

   private void v() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
   }

   public static boolean e(int var0) {
      return (var0 & 8) != 0;
   }

   public static boolean h(int var0) {
      return (var0 & 4) != 0;
   }

   public static void a(xd var0, int var1, int var2, int var3, boolean var4) {
      int var5 = var0.e(var1, var2, var3);
      if(var4) {
         var5 |= 4;
      } else {
         var5 &= -5;
      }

      var0.f(var1, var2, var3, var5);
   }

   public static uh f(xd var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.e(var1, var2, var3);
      int var6 = mojang.w.a(var5);

      for(int var7 = 0; var7 <= 1; ++var7) {
         int var8 = var1 - a[var6][0] * var7 - 1;
         int var9 = var3 - a[var6][1] * var7 - 1;
         int var10 = var8 + 2;
         int var11 = var9 + 2;

         for(int var12 = var8; var12 <= var10; ++var12) {
            for(int var13 = var9; var13 <= var11; ++var13) {
               if(var0.h(var12, var2 - 1, var13) && var0.i(var12, var2, var13) && var0.i(var12, var2 + 1, var13)) {
                  if(var4 <= 0) {
                     return new uh(var12, var2, var13);
                  }

                  --var4;
               }
            }
         }
      }

      return null;
   }

   public void a(xd var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!e(var5)) {
         super.a(var1, var2, var3, var4, var5, var6, 0);
      }

   }

   public int f() {
      return 1;
   }

}
