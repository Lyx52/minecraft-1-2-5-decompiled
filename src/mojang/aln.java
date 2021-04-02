package mojang;

import java.util.Random;

public class aln extends li {

   public boolean a(World var1, Random var2, int var3, int var4, int var5) {
      while(var1.i(var3, var4, var5) && var4 > 2) {
         --var4;
      }

      int var6 = var1.a(var3, var4, var5);
      if(var6 != pb.E.bO) {
         return false;
      } else {
         int var7;
         int var8;
         for(var7 = -2; var7 <= 2; ++var7) {
            for(var8 = -2; var8 <= 2; ++var8) {
               if(var1.i(var3 + var7, var4 - 1, var5 + var8) && var1.i(var3 + var7, var4 - 2, var5 + var8)) {
                  return false;
               }
            }
         }

         for(var7 = -1; var7 <= 0; ++var7) {
            for(var8 = -2; var8 <= 2; ++var8) {
               for(int var9 = -2; var9 <= 2; ++var9) {
                  var1.d(var3 + var8, var4 + var7, var5 + var9, pb.Q.bO);
               }
            }
         }

         var1.d(var3, var4, var5, pb.A.bO);
         var1.d(var3 - 1, var4, var5, pb.A.bO);
         var1.d(var3 + 1, var4, var5, pb.A.bO);
         var1.d(var3, var4, var5 - 1, pb.A.bO);
         var1.d(var3, var4, var5 + 1, pb.A.bO);

         for(var7 = -2; var7 <= 2; ++var7) {
            for(var8 = -2; var8 <= 2; ++var8) {
               if(var7 == -2 || var7 == 2 || var8 == -2 || var8 == 2) {
                  var1.d(var3 + var7, var4 + 1, var5 + var8, pb.Q.bO);
               }
            }
         }

         var1.b(var3 + 2, var4 + 1, var5, pb.ak.bO, 1);
         var1.b(var3 - 2, var4 + 1, var5, pb.ak.bO, 1);
         var1.b(var3, var4 + 1, var5 + 2, pb.ak.bO, 1);
         var1.b(var3, var4 + 1, var5 - 2, pb.ak.bO, 1);

         for(var7 = -1; var7 <= 1; ++var7) {
            for(var8 = -1; var8 <= 1; ++var8) {
               if(var7 == 0 && var8 == 0) {
                  var1.d(var3 + var7, var4 + 4, var5 + var8, pb.Q.bO);
               } else {
                  var1.b(var3 + var7, var4 + 4, var5 + var8, pb.ak.bO, 1);
               }
            }
         }

         for(var7 = 1; var7 <= 3; ++var7) {
            var1.d(var3 - 1, var4 + var7, var5 - 1, pb.Q.bO);
            var1.d(var3 - 1, var4 + var7, var5 + 1, pb.Q.bO);
            var1.d(var3 + 1, var4 + var7, var5 - 1, pb.Q.bO);
            var1.d(var3 + 1, var4 + var7, var5 + 1, pb.Q.bO);
         }

         return true;
      }
   }
}
