package mojang;

import java.util.Random;

public class ox {

   private Random a = new Random();


   public void a(xd var1, nn var2) {
      if(var1.t.g != 1) {
         if(!this.b(var1, var2)) {
            this.c(var1, var2);
            this.b(var1, var2);
         }
      } else {
         int var3 = gk.c(var2.o);
         int var4 = gk.c(var2.p) - 1;
         int var5 = gk.c(var2.q);
         byte var6 = 1;
         byte var7 = 0;

         for(int var8 = -2; var8 <= 2; ++var8) {
            for(int var9 = -2; var9 <= 2; ++var9) {
               for(int var10 = -1; var10 < 3; ++var10) {
                  int var11 = var3 + var9 * var6 + var8 * var7;
                  int var12 = var4 + var10;
                  int var13 = var5 + var9 * var7 - var8 * var6;
                  boolean var14 = var10 < 0;
                  var1.g(var11, var12, var13, var14?pb.ap.bO:0);
               }
            }
         }

         var2.c((double)var3, (double)var4, (double)var5, var2.u, 0.0F);
         var2.r = var2.s = var2.t = 0.0D;
      }
   }

   public boolean b(xd var1, nn var2) {
      short var3 = 128;
      double var4 = -1.0D;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = gk.c(var2.o);
      int var10 = gk.c(var2.q);

      double var18;
      for(int var11 = var9 - var3; var11 <= var9 + var3; ++var11) {
         double var12 = (double)var11 + 0.5D - var2.o;

         for(int var14 = var10 - var3; var14 <= var10 + var3; ++var14) {
            double var15 = (double)var14 + 0.5D - var2.q;

            for(int var17 = 127; var17 >= 0; --var17) {
               if(var1.a(var11, var17, var14) == pb.be.bO) {
                  while(var1.a(var11, var17 - 1, var14) == pb.be.bO) {
                     --var17;
                  }

                  var18 = (double)var17 + 0.5D - var2.p;
                  double var20 = var12 * var12 + var18 * var18 + var15 * var15;
                  if(var4 < 0.0D || var20 < var4) {
                     var4 = var20;
                     var6 = var11;
                     var7 = var17;
                     var8 = var14;
                  }
               }
            }
         }
      }

      if(var4 >= 0.0D) {
         double var22 = (double)var6 + 0.5D;
         double var16 = (double)var7 + 0.5D;
         var18 = (double)var8 + 0.5D;
         if(var1.a(var6 - 1, var7, var8) == pb.be.bO) {
            var22 -= 0.5D;
         }

         if(var1.a(var6 + 1, var7, var8) == pb.be.bO) {
            var22 += 0.5D;
         }

         if(var1.a(var6, var7, var8 - 1) == pb.be.bO) {
            var18 -= 0.5D;
         }

         if(var1.a(var6, var7, var8 + 1) == pb.be.bO) {
            var18 += 0.5D;
         }

         var2.c(var22, var16, var18, var2.u, 0.0F);
         var2.r = var2.s = var2.t = 0.0D;
         return true;
      } else {
         return false;
      }
   }

   public boolean c(xd var1, nn var2) {
      byte var3 = 16;
      double var4 = -1.0D;
      int var6 = gk.c(var2.o);
      int var7 = gk.c(var2.p);
      int var8 = gk.c(var2.q);
      int var9 = var6;
      int var10 = var7;
      int var11 = var8;
      int var12 = 0;
      int var13 = this.a.nextInt(4);

      int var14;
      double var15;
      int var17;
      double var18;
      int var20;
      int var21;
      int var22;
      int var23;
      int var24;
      int var25;
      int var26;
      int var27;
      int var28;
      double var32;
      double var33;
      for(var14 = var6 - var3; var14 <= var6 + var3; ++var14) {
         var15 = (double)var14 + 0.5D - var2.o;

         for(var17 = var8 - var3; var17 <= var8 + var3; ++var17) {
            var18 = (double)var17 + 0.5D - var2.q;

            label274:
            for(var20 = 127; var20 >= 0; --var20) {
               if(var1.i(var14, var20, var17)) {
                  while(var20 > 0 && var1.i(var14, var20 - 1, var17)) {
                     --var20;
                  }

                  for(var21 = var13; var21 < var13 + 4; ++var21) {
                     var22 = var21 % 2;
                     var23 = 1 - var22;
                     if(var21 % 4 >= 2) {
                        var22 = -var22;
                        var23 = -var23;
                     }

                     for(var24 = 0; var24 < 3; ++var24) {
                        for(var25 = 0; var25 < 4; ++var25) {
                           for(var26 = -1; var26 < 4; ++var26) {
                              var27 = var14 + (var25 - 1) * var22 + var24 * var23;
                              var28 = var20 + var26;
                              int var29 = var17 + (var25 - 1) * var23 - var24 * var22;
                              if(var26 < 0 && !var1.f(var27, var28, var29).a() || var26 >= 0 && !var1.i(var27, var28, var29)) {
                                 continue label274;
                              }
                           }
                        }
                     }

                     var32 = (double)var20 + 0.5D - var2.p;
                     var33 = var15 * var15 + var32 * var32 + var18 * var18;
                     if(var4 < 0.0D || var33 < var4) {
                        var4 = var33;
                        var9 = var14;
                        var10 = var20;
                        var11 = var17;
                        var12 = var21 % 4;
                     }
                  }
               }
            }
         }
      }

      if(var4 < 0.0D) {
         for(var14 = var6 - var3; var14 <= var6 + var3; ++var14) {
            var15 = (double)var14 + 0.5D - var2.o;

            for(var17 = var8 - var3; var17 <= var8 + var3; ++var17) {
               var18 = (double)var17 + 0.5D - var2.q;

               label222:
               for(var20 = 127; var20 >= 0; --var20) {
                  if(var1.i(var14, var20, var17)) {
                     while(var20 > 0 && var1.i(var14, var20 - 1, var17)) {
                        --var20;
                     }

                     for(var21 = var13; var21 < var13 + 2; ++var21) {
                        var22 = var21 % 2;
                        var23 = 1 - var22;

                        for(var24 = 0; var24 < 4; ++var24) {
                           for(var25 = -1; var25 < 4; ++var25) {
                              var26 = var14 + (var24 - 1) * var22;
                              var27 = var20 + var25;
                              var28 = var17 + (var24 - 1) * var23;
                              if(var25 < 0 && !var1.f(var26, var27, var28).a() || var25 >= 0 && !var1.i(var26, var27, var28)) {
                                 continue label222;
                              }
                           }
                        }

                        var32 = (double)var20 + 0.5D - var2.p;
                        var33 = var15 * var15 + var32 * var32 + var18 * var18;
                        if(var4 < 0.0D || var33 < var4) {
                           var4 = var33;
                           var9 = var14;
                           var10 = var20;
                           var11 = var17;
                           var12 = var21 % 2;
                        }
                     }
                  }
               }
            }
         }
      }

      int var30 = var9;
      int var16 = var10;
      var17 = var11;
      int var31 = var12 % 2;
      int var19 = 1 - var31;
      if(var12 % 4 >= 2) {
         var31 = -var31;
         var19 = -var19;
      }

      boolean var34;
      if(var4 < 0.0D) {
         if(var10 < 70) {
            var10 = 70;
         }

         if(var10 > 118) {
            var10 = 118;
         }

         var16 = var10;

         for(var20 = -1; var20 <= 1; ++var20) {
            for(var21 = 1; var21 < 3; ++var21) {
               for(var22 = -1; var22 < 3; ++var22) {
                  var23 = var30 + (var21 - 1) * var31 + var20 * var19;
                  var24 = var16 + var22;
                  var25 = var17 + (var21 - 1) * var19 - var20 * var31;
                  var34 = var22 < 0;
                  var1.g(var23, var24, var25, var34?pb.ap.bO:0);
               }
            }
         }
      }

      for(var20 = 0; var20 < 4; ++var20) {
         var1.o = true;

         for(var21 = 0; var21 < 4; ++var21) {
            for(var22 = -1; var22 < 4; ++var22) {
               var23 = var30 + (var21 - 1) * var31;
               var24 = var16 + var22;
               var25 = var17 + (var21 - 1) * var19;
               var34 = var21 == 0 || var21 == 3 || var22 == -1 || var22 == 3;
               var1.g(var23, var24, var25, var34?pb.ap.bO:pb.be.bO);
            }
         }

         var1.o = false;

         for(var21 = 0; var21 < 4; ++var21) {
            for(var22 = -1; var22 < 4; ++var22) {
               var23 = var30 + (var21 - 1) * var31;
               var24 = var16 + var22;
               var25 = var17 + (var21 - 1) * var19;
               var1.j(var23, var24, var25, var1.a(var23, var24, var25));
            }
         }
      }

      return true;
   }
}
