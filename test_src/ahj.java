import java.util.Random;

public class ahj extends xu {

   protected void a(long var1, int var3, int var4, byte[] var5, double var6, double var8, double var10) {
      this.a(var1, var3, var4, var5, var6, var8, var10, 1.0F + this.c.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
   }

   protected void a(long var1, int var3, int var4, byte[] var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      double var19 = (double)(var3 * 16 + 8);
      double var21 = (double)(var4 * 16 + 8);
      float var23 = 0.0F;
      float var24 = 0.0F;
      Random var25 = new Random(var1);
      if(var16 <= 0) {
         int var26 = this.b * 16 - 16;
         var16 = var26 - var25.nextInt(var26 / 4);
      }

      boolean var54 = false;
      if(var15 == -1) {
         var15 = var16 / 2;
         var54 = true;
      }

      int var27 = var25.nextInt(var16 / 2) + var16 / 4;

      for(boolean var28 = var25.nextInt(6) == 0; var15 < var16; ++var15) {
         double var29 = 1.5D + (double)(gk.a((float)var15 * 3.1415927F / (float)var16) * var12 * 1.0F);
         double var31 = var29 * var17;
         float var33 = gk.b(var14);
         float var34 = gk.a(var14);
         var6 += (double)(gk.b(var13) * var33);
         var8 += (double)var34;
         var10 += (double)(gk.a(var13) * var33);
         if(var28) {
            var14 *= 0.92F;
         } else {
            var14 *= 0.7F;
         }

         var14 += var24 * 0.1F;
         var13 += var23 * 0.1F;
         var24 *= 0.9F;
         var23 *= 0.75F;
         var24 += (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 2.0F;
         var23 += (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 4.0F;
         if(!var54 && var15 == var27 && var12 > 1.0F && var16 > 0) {
            this.a(var25.nextLong(), var3, var4, var5, var6, var8, var10, var25.nextFloat() * 0.5F + 0.5F, var13 - 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
            this.a(var25.nextLong(), var3, var4, var5, var6, var8, var10, var25.nextFloat() * 0.5F + 0.5F, var13 + 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
            return;
         }

         if(var54 || var25.nextInt(4) != 0) {
            double var35 = var6 - var19;
            double var37 = var10 - var21;
            double var39 = (double)(var16 - var15);
            double var41 = (double)(var12 + 2.0F + 16.0F);
            if(var35 * var35 + var37 * var37 - var39 * var39 > var41 * var41) {
               return;
            }

            if(var6 >= var19 - 16.0D - var29 * 2.0D && var10 >= var21 - 16.0D - var29 * 2.0D && var6 <= var19 + 16.0D + var29 * 2.0D && var10 <= var21 + 16.0D + var29 * 2.0D) {
               int var55 = gk.c(var6 - var29) - var3 * 16 - 1;
               int var36 = gk.c(var6 + var29) - var3 * 16 + 1;
               int var56 = gk.c(var8 - var31) - 1;
               int var38 = gk.c(var8 + var31) + 1;
               int var57 = gk.c(var10 - var29) - var4 * 16 - 1;
               int var40 = gk.c(var10 + var29) - var4 * 16 + 1;
               if(var55 < 0) {
                  var55 = 0;
               }

               if(var36 > 16) {
                  var36 = 16;
               }

               if(var56 < 1) {
                  var56 = 1;
               }

               if(var38 > 120) {
                  var38 = 120;
               }

               if(var57 < 0) {
                  var57 = 0;
               }

               if(var40 > 16) {
                  var40 = 16;
               }

               boolean var58 = false;

               int var42;
               int var45;
               for(var42 = var55; !var58 && var42 < var36; ++var42) {
                  for(int var43 = var57; !var58 && var43 < var40; ++var43) {
                     for(int var44 = var38 + 1; !var58 && var44 >= var56 - 1; --var44) {
                        var45 = (var42 * 16 + var43) * 128 + var44;
                        if(var44 >= 0 && var44 < 128) {
                           if(var5[var45] == pb.A.bO || var5[var45] == pb.B.bO) {
                              var58 = true;
                           }

                           if(var44 != var56 - 1 && var42 != var55 && var42 != var36 - 1 && var43 != var57 && var43 != var40 - 1) {
                              var44 = var56;
                           }
                        }
                     }
                  }
               }

               if(!var58) {
                  for(var42 = var55; var42 < var36; ++var42) {
                     double var59 = ((double)(var42 + var3 * 16) + 0.5D - var6) / var29;

                     for(var45 = var57; var45 < var40; ++var45) {
                        double var46 = ((double)(var45 + var4 * 16) + 0.5D - var10) / var29;
                        int var48 = (var42 * 16 + var45) * 128 + var38;
                        boolean var49 = false;
                        if(var59 * var59 + var46 * var46 < 1.0D) {
                           for(int var50 = var38 - 1; var50 >= var56; --var50) {
                              double var51 = ((double)var50 + 0.5D - var8) / var31;
                              if(var51 > -0.7D && var59 * var59 + var51 * var51 + var46 * var46 < 1.0D) {
                                 byte var53 = var5[var48];
                                 if(var53 == pb.u.bO) {
                                    var49 = true;
                                 }

                                 if(var53 == pb.t.bO || var53 == pb.v.bO || var53 == pb.u.bO) {
                                    if(var50 < 10) {
                                       var5[var48] = (byte)pb.C.bO;
                                    } else {
                                       var5[var48] = 0;
                                       if(var49 && var5[var48 - 1] == pb.v.bO) {
                                          var5[var48 - 1] = this.d.a(var42 + var3 * 16, var45 + var4 * 16).A;
                                       }
                                    }
                                 }
                              }

                              --var48;
                           }
                        }
                     }
                  }

                  if(var54) {
                     break;
                  }
               }
            }
         }
      }

   }

   protected void a(xd var1, int var2, int var3, int var4, int var5, byte[] var6) {
      int var7 = this.c.nextInt(this.c.nextInt(this.c.nextInt(40) + 1) + 1);
      if(this.c.nextInt(15) != 0) {
         var7 = 0;
      }

      for(int var8 = 0; var8 < var7; ++var8) {
         double var9 = (double)(var2 * 16 + this.c.nextInt(16));
         double var11 = (double)this.c.nextInt(this.c.nextInt(120) + 8);
         double var13 = (double)(var3 * 16 + this.c.nextInt(16));
         int var15 = 1;
         if(this.c.nextInt(4) == 0) {
            this.a(this.c.nextLong(), var4, var5, var6, var9, var11, var13);
            var15 += this.c.nextInt(4);
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            float var17 = this.c.nextFloat() * 3.1415927F * 2.0F;
            float var18 = (this.c.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.c.nextFloat() * 2.0F + this.c.nextFloat();
            if(this.c.nextInt(10) == 0) {
               var19 *= this.c.nextFloat() * this.c.nextFloat() * 3.0F + 1.0F;
            }

            this.a(this.c.nextLong(), var4, var5, var6, var9, var11, var13, var19, var17, var18, 0, 0, 1.0D);
         }
      }

   }
}
