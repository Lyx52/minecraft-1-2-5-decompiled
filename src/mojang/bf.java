package mojang;

import java.util.Random;

public class bf extends li {

   public boolean a(World var1, Random var2, int var3, int var4, int var5) {
      int var6;
      for(var6 = var2.nextInt(4) + 5; var1.f(var3, var4 - 1, var5) == acn.g; --var4) {
         ;
      }

      boolean var7 = true;
      if(var4 >= 1 && var4 + var6 + 1 <= 128) {
         int var8;
         int var10;
         int var11;
         int var12;
         for(var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            byte var9 = 1;
            if(var8 == var4) {
               var9 = 0;
            }

            if(var8 >= var4 + 1 + var6 - 2) {
               var9 = 3;
            }

            for(var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if(var8 >= 0 && var8 < 128) {
                     var12 = var1.a(var10, var8, var11);
                     if(var12 != 0 && var12 != pb.K.bO) {
                        if(var12 != pb.B.bO && var12 != pb.A.bO) {
                           var7 = false;
                        } else if(var8 > var4) {
                           var7 = false;
                        }
                     }
                  } else {
                     var7 = false;
                  }
               }
            }
         }

         if(!var7) {
            return false;
         } else {
            var8 = var1.a(var3, var4 - 1, var5);
            if((var8 == pb.u.bO || var8 == pb.v.bO) && var4 < 128 - var6 - 1) {
               this.a(var1, var3, var4 - 1, var5, pb.v.bO);

               int var13;
               int var16;
               for(var16 = var4 - 3 + var6; var16 <= var4 + var6; ++var16) {
                  var10 = var16 - (var4 + var6);
                  var11 = 2 - var10 / 2;

                  for(var12 = var3 - var11; var12 <= var3 + var11; ++var12) {
                     var13 = var12 - var3;

                     for(int var14 = var5 - var11; var14 <= var5 + var11; ++var14) {
                        int var15 = var14 - var5;
                        if((Math.abs(var13) != var11 || Math.abs(var15) != var11 || var2.nextInt(2) != 0 && var10 != 0) && !pb.n[var1.a(var12, var16, var14)]) {
                           this.a(var1, var12, var16, var14, pb.K.bO);
                        }
                     }
                  }
               }

               for(var16 = 0; var16 < var6; ++var16) {
                  var10 = var1.a(var3, var4 + var16, var5);
                  if(var10 == 0 || var10 == pb.K.bO || var10 == pb.A.bO || var10 == pb.B.bO) {
                     this.a(var1, var3, var4 + var16, var5, pb.J.bO);
                  }
               }

               for(var16 = var4 - 3 + var6; var16 <= var4 + var6; ++var16) {
                  var10 = var16 - (var4 + var6);
                  var11 = 2 - var10 / 2;

                  for(var12 = var3 - var11; var12 <= var3 + var11; ++var12) {
                     for(var13 = var5 - var11; var13 <= var5 + var11; ++var13) {
                        if(var1.a(var12, var16, var13) == pb.K.bO) {
                           if(var2.nextInt(4) == 0 && var1.a(var12 - 1, var16, var13) == 0) {
                              this.b(var1, var12 - 1, var16, var13, 8);
                           }

                           if(var2.nextInt(4) == 0 && var1.a(var12 + 1, var16, var13) == 0) {
                              this.b(var1, var12 + 1, var16, var13, 2);
                           }

                           if(var2.nextInt(4) == 0 && var1.a(var12, var16, var13 - 1) == 0) {
                              this.b(var1, var12, var16, var13 - 1, 1);
                           }

                           if(var2.nextInt(4) == 0 && var1.a(var12, var16, var13 + 1) == 0) {
                              this.b(var1, var12, var16, var13 + 1, 4);
                           }
                        }
                     }
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void b(World var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, pb.bu.bO, var5);
      int var6 = 4;

      while(true) {
         --var3;
         if(var1.a(var2, var3, var4) != 0 || var6 <= 0) {
            return;
         }

         this.a(var1, var2, var3, var4, pb.bu.bO, var5);
         --var6;
      }
   }
}
