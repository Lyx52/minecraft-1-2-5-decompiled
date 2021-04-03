import java.util.Random;

public class dq extends li {

   public boolean a(xd var1, Random var2, int var3, int var4, int var5) {
      byte var6 = 3;
      int var7 = var2.nextInt(2) + 2;
      int var8 = var2.nextInt(2) + 2;
      int var9 = 0;

      int var10;
      int var11;
      int var12;
      for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
         for(var11 = var4 - 1; var11 <= var4 + var6 + 1; ++var11) {
            for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
               acn var13 = var1.f(var10, var11, var12);
               if(var11 == var4 - 1 && !var13.a()) {
                  return false;
               }

               if(var11 == var4 + var6 + 1 && !var13.a()) {
                  return false;
               }

               if((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1) && var11 == var4 && var1.i(var10, var11, var12) && var1.i(var10, var11 + 1, var12)) {
                  ++var9;
               }
            }
         }
      }

      if(var9 >= 1 && var9 <= 5) {
         for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
            for(var11 = var4 + var6; var11 >= var4 - 1; --var11) {
               for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
                  if(var10 != var3 - var7 - 1 && var11 != var4 - 1 && var12 != var5 - var8 - 1 && var10 != var3 + var7 + 1 && var11 != var4 + var6 + 1 && var12 != var5 + var8 + 1) {
                     var1.g(var10, var11, var12, 0);
                  } else if(var11 >= 0 && !var1.f(var10, var11 - 1, var12).a()) {
                     var1.g(var10, var11, var12, 0);
                  } else if(var1.f(var10, var11, var12).a()) {
                     if(var11 == var4 - 1 && var2.nextInt(4) != 0) {
                        var1.g(var10, var11, var12, pb.ao.bO);
                     } else {
                        var1.g(var10, var11, var12, pb.w.bO);
                     }
                  }
               }
            }
         }

         var10 = 0;

         while(var10 < 2) {
            var11 = 0;

            while(true) {
               if(var11 < 3) {
                  label113: {
                     var12 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
                     int var14 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
                     if(var1.i(var12, var4, var14)) {
                        int var15 = 0;
                        if(var1.f(var12 - 1, var4, var14).a()) {
                           ++var15;
                        }

                        if(var1.f(var12 + 1, var4, var14).a()) {
                           ++var15;
                        }

                        if(var1.f(var12, var4, var14 - 1).a()) {
                           ++var15;
                        }

                        if(var1.f(var12, var4, var14 + 1).a()) {
                           ++var15;
                        }

                        if(var15 == 1) {
                           var1.g(var12, var4, var14, pb.au.bO);
                           hb var16 = (hb)var1.b(var12, var4, var14);
                           if(var16 != null) {
                              for(int var17 = 0; var17 < 8; ++var17) {
                                 aan var18 = this.a(var2);
                                 if(var18 != null) {
                                    var16.a(var2.nextInt(var16.a()), var18);
                                 }
                              }
                           }
                           break label113;
                        }
                     }

                     ++var11;
                     continue;
                  }
               }

               ++var10;
               break;
            }
         }

         var1.g(var3, var4, var5, pb.as.bO);
         cj var19 = (cj)var1.b(var3, var4, var5);
         if(var19 != null) {
            var19.a(this.b(var2));
         } else {
            System.err.println("Failed to fetch mob spawner entity at (" + var3 + ", " + var4 + ", " + var5 + ")");
         }

         return true;
      } else {
         return false;
      }
   }

   private aan a(Random var1) {
      int var2 = var1.nextInt(11);
      return var2 == 0?new aan(yr.aA):(var2 == 1?new aan(yr.o, var1.nextInt(4) + 1):(var2 == 2?new aan(yr.U):(var2 == 3?new aan(yr.T, var1.nextInt(4) + 1):(var2 == 4?new aan(yr.M, var1.nextInt(4) + 1):(var2 == 5?new aan(yr.K, var1.nextInt(4) + 1):(var2 == 6?new aan(yr.aw):(var2 == 7 && var1.nextInt(100) == 0?new aan(yr.at):(var2 == 8 && var1.nextInt(2) == 0?new aan(yr.aC, var1.nextInt(4) + 1):(var2 == 9 && var1.nextInt(10) == 0?new aan(yr.e[yr.bF.bQ + var1.nextInt(2)]):(var2 == 10?new aan(yr.aW, 1, 3):null))))))))));
   }

   private String b(Random var1) {
      int var2 = var1.nextInt(4);
      return var2 == 0?"Skeleton":(var2 == 1?"Zombie":(var2 == 2?"Zombie":(var2 == 3?"Spider":"")));
   }
}
