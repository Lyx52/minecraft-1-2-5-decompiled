package mojang;

import java.util.Random;

public class wv {

   private static bo a = bo.a(0.0D, 0.0D, 0.0D);


   public static bo a(aaa var0, int var1, int var2) {
      return c(var0, var1, var2, (bo)null);
   }

   public static bo a(aaa var0, int var1, int var2, bo var3) {
      a.a = var3.a - var0.o;
      a.b = var3.b - var0.p;
      a.c = var3.c - var0.q;
      return c(var0, var1, var2, a);
   }

   public static bo b(aaa var0, int var1, int var2, bo var3) {
      a.a = var0.o - var3.a;
      a.b = var0.p - var3.b;
      a.c = var0.q - var3.c;
      return c(var0, var1, var2, a);
   }

   private static bo c(aaa var0, int var1, int var2, bo var3) {
      Random var4 = var0.aO();
      boolean var5 = false;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      float var9 = -99999.0F;
      boolean var10;
      if(var0.aY()) {
         double var11 = var0.aV().b(gk.c(var0.o), gk.c(var0.p), gk.c(var0.q)) + 4.0D;
         var10 = var11 < (double)(var0.aW() + (float)var1);
      } else {
         var10 = false;
      }

      for(int var16 = 0; var16 < 10; ++var16) {
         int var12 = var4.nextInt(2 * var1) - var1;
         int var13 = var4.nextInt(2 * var2) - var2;
         int var14 = var4.nextInt(2 * var1) - var1;
         if(var3 == null || (double)var12 * var3.a + (double)var14 * var3.c >= 0.0D) {
            var12 += gk.c(var0.o);
            var13 += gk.c(var0.p);
            var14 += gk.c(var0.q);
            if(!var10 || var0.f(var12, var13, var14)) {
               float var15 = var0.a(var12, var13, var14);
               if(var15 > var9) {
                  var9 = var15;
                  var6 = var12;
                  var7 = var13;
                  var8 = var14;
                  var5 = true;
               }
            }
         }
      }

      if(var5) {
         return bo.b((double)var6, (double)var7, (double)var8);
      } else {
         return null;
      }
   }

}
