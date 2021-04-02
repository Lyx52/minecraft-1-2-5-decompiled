package mojang;

import java.util.Random;

public class ji extends li {

   private int a;
   private int b;


   public ji(int var1) {
      this.a = pb.aW.bO;
      this.b = var1;
   }

   public boolean a(xd var1, Random var2, int var3, int var4, int var5) {
      if(var1.f(var3, var4, var5) != acn.g) {
         return false;
      } else {
         int var6 = var2.nextInt(this.b - 2) + 2;
         byte var7 = 1;

         for(int var8 = var3 - var6; var8 <= var3 + var6; ++var8) {
            for(int var9 = var5 - var6; var9 <= var5 + var6; ++var9) {
               int var10 = var8 - var3;
               int var11 = var9 - var5;
               if(var10 * var10 + var11 * var11 <= var6 * var6) {
                  for(int var12 = var4 - var7; var12 <= var4 + var7; ++var12) {
                     int var13 = var1.a(var8, var12, var9);
                     if(var13 == pb.v.bO || var13 == pb.aW.bO) {
                        var1.d(var8, var12, var9, this.a);
                     }
                  }
               }
            }
         }

         return true;
      }
   }
}
