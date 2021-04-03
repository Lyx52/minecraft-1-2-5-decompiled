import java.util.Random;

public class re extends xu {

   private float[] a = new float[1024];


   protected void a(long var1, int var3, int var4, byte[] var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      Random var19 = new Random(var1);
      double var20 = (double)(var3 * 16 + 8);
      double var22 = (double)(var4 * 16 + 8);
      float var24 = 0.0F;
      float var25 = 0.0F;
      if(var16 <= 0) {
         int var26 = this.b * 16 - 16;
         var16 = var26 - var19.nextInt(var26 / 4);
      }

      boolean var53 = false;
      if(var15 == -1) {
         var15 = var16 / 2;
         var53 = true;
      }

      float var27 = 1.0F;

      for(int var28 = 0; var28 < 128; ++var28) {
         if(var28 == 0 || var19.nextInt(3) == 0) {
            var27 = 1.0F + var19.nextFloat() * var19.nextFloat() * 1.0F;
         }

         this.a[var28] = var27 * var27;
      }

      for(; var15 < var16; ++var15) {
         double var54 = 1.5D + (double)(gk.a((float)var15 * 3.1415927F / (float)var16) * var12 * 1.0F);
         double var30 = var54 * var17;
         var54 *= (double)var19.nextFloat() * 0.25D + 0.75D;
         var30 *= (double)var19.nextFloat() * 0.25D + 0.75D;
         float var32 = gk.b(var14);
         float var33 = gk.a(var14);
         var6 += (double)(gk.b(var13) * var32);
         var8 += (double)var33;
         var10 += (double)(gk.a(var13) * var32);
         var14 *= 0.7F;
         var14 += var25 * 0.05F;
         var13 += var24 * 0.05F;
         var25 *= 0.8F;
         var24 *= 0.5F;
         var25 += (var19.nextFloat() - var19.nextFloat()) * var19.nextFloat() * 2.0F;
         var24 += (var19.nextFloat() - var19.nextFloat()) * var19.nextFloat() * 4.0F;
         if(var53 || var19.nextInt(4) != 0) {
            double var34 = var6 - var20;
            double var36 = var10 - var22;
            double var38 = (double)(var16 - var15);
            double var40 = (double)(var12 + 2.0F + 16.0F);
            if(var34 * var34 + var36 * var36 - var38 * var38 > var40 * var40) {
               return;
            }

            if(var6 >= var20 - 16.0D - var54 * 2.0D && var10 >= var22 - 16.0D - var54 * 2.0D && var6 <= var20 + 16.0D + var54 * 2.0D && var10 <= var22 + 16.0D + var54 * 2.0D) {
               int var55 = gk.c(var6 - var54) - var3 * 16 - 1;
               int var35 = gk.c(var6 + var54) - var3 * 16 + 1;
               int var56 = gk.c(var8 - var30) - 1;
               int var37 = gk.c(var8 + var30) + 1;
               int var57 = gk.c(var10 - var54) - var4 * 16 - 1;
               int var39 = gk.c(var10 + var54) - var4 * 16 + 1;
               if(var55 < 0) {
                  var55 = 0;
               }

               if(var35 > 16) {
                  var35 = 16;
               }

               if(var56 < 1) {
                  var56 = 1;
               }

               if(var37 > 120) {
                  var37 = 120;
               }

               if(var57 < 0) {
                  var57 = 0;
               }

               if(var39 > 16) {
                  var39 = 16;
               }

               boolean var58 = false;

               int var41;
               int var44;
               for(var41 = var55; !var58 && var41 < var35; ++var41) {
                  for(int var42 = var57; !var58 && var42 < var39; ++var42) {
                     for(int var43 = var37 + 1; !var58 && var43 >= var56 - 1; --var43) {
                        var44 = (var41 * 16 + var42) * 128 + var43;
                        if(var43 >= 0 && var43 < 128) {
                           if(var5[var44] == pb.A.bO || var5[var44] == pb.B.bO) {
                              var58 = true;
                           }

                           if(var43 != var56 - 1 && var41 != var55 && var41 != var35 - 1 && var42 != var57 && var42 != var39 - 1) {
                              var43 = var56;
                           }
                        }
                     }
                  }
               }

               if(!var58) {
                  for(var41 = var55; var41 < var35; ++var41) {
                     double var59 = ((double)(var41 + var3 * 16) + 0.5D - var6) / var54;

                     for(var44 = var57; var44 < var39; ++var44) {
                        double var45 = ((double)(var44 + var4 * 16) + 0.5D - var10) / var54;
                        int var47 = (var41 * 16 + var44) * 128 + var37;
                        boolean var48 = false;
                        if(var59 * var59 + var45 * var45 < 1.0D) {
                           for(int var49 = var37 - 1; var49 >= var56; --var49) {
                              double var50 = ((double)var49 + 0.5D - var8) / var30;
                              if((var59 * var59 + var45 * var45) * (double)this.a[var49] + var50 * var50 / 6.0D < 1.0D) {
                                 byte var52 = var5[var47];
                                 if(var52 == pb.u.bO) {
                                    var48 = true;
                                 }

                                 if(var52 == pb.t.bO || var52 == pb.v.bO || var52 == pb.u.bO) {
                                    if(var49 < 10) {
                                       var5[var47] = (byte)pb.C.bO;
                                    } else {
                                       var5[var47] = 0;
                                       if(var48 && var5[var47 - 1] == pb.v.bO) {
                                          var5[var47 - 1] = this.d.a(var41 + var3 * 16, var44 + var4 * 16).A;
                                       }
                                    }
                                 }
                              }

                              --var47;
                           }
                        }
                     }
                  }

                  if(var53) {
                     break;
                  }
               }
            }
         }
      }

   }

   protected void a(xd var1, int var2, int var3, int var4, int var5, byte[] var6) {
      if(this.c.nextInt(50) == 0) {
         double var7 = (double)(var2 * 16 + this.c.nextInt(16));
         double var9 = (double)(this.c.nextInt(this.c.nextInt(40) + 8) + 20);
         double var11 = (double)(var3 * 16 + this.c.nextInt(16));
         byte var13 = 1;

         for(int var14 = 0; var14 < var13; ++var14) {
            float var15 = this.c.nextFloat() * 3.1415927F * 2.0F;
            float var16 = (this.c.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var17 = (this.c.nextFloat() * 2.0F + this.c.nextFloat()) * 2.0F;
            this.a(this.c.nextLong(), var4, var5, var6, var7, var9, var11, var17, var15, var16, 0, 0, 3.0D);
         }

      }
   }
}
