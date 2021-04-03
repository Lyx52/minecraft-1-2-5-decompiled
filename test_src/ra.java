
public class ra extends ve {

   protected ra(int var1) {
      super(var1);
      this.f(1);
   }

   public static aaj a(short var0, xd var1) {
      "map_" + var0;
      aaj var3 = (aaj)var1.a(aaj.class, "map_" + var0);
      if(var3 == null) {
         int var4 = var1.b("map");
         String var2 = "map_" + var4;
         var3 = new aaj(var2);
         var1.a(var2, (zk)var3);
      }

      return var3;
   }

   public aaj a(aan var1, xd var2) {
      "map_" + var1.i();
      aaj var4 = (aaj)var2.a(aaj.class, "map_" + var1.i());
      if(var4 == null) {
         var1.b(var2.b("map"));
         String var3 = "map_" + var1.i();
         var4 = new aaj(var3);
         var4.b = var2.B().c();
         var4.c = var2.B().e();
         var4.e = 3;
         var4.d = (byte)var2.t.g;
         var4.a();
         var2.a(var3, (zk)var4);
      }

      return var4;
   }

   public void a(xd var1, nn var2, aaj var3) {
      if(var1.t.g == var3.d) {
         short var4 = 128;
         short var5 = 128;
         int var6 = 1 << var3.e;
         int var7 = var3.b;
         int var8 = var3.c;
         int var9 = gk.c(var2.o - (double)var7) / var6 + var4 / 2;
         int var10 = gk.c(var2.q - (double)var8) / var6 + var5 / 2;
         int var11 = 128 / var6;
         if(var1.t.e) {
            var11 /= 2;
         }

         ++var3.g;

         for(int var12 = var9 - var11 + 1; var12 < var9 + var11; ++var12) {
            if((var12 & 15) == (var3.g & 15)) {
               int var13 = 255;
               int var14 = 0;
               double var15 = 0.0D;

               for(int var17 = var10 - var11 - 1; var17 < var10 + var11; ++var17) {
                  if(var12 >= 0 && var17 >= -1 && var12 < var4 && var17 < var5) {
                     int var18 = var12 - var9;
                     int var19 = var17 - var10;
                     boolean var20 = var18 * var18 + var19 * var19 > (var11 - 2) * (var11 - 2);
                     int var21 = (var7 / var6 + var12 - var4 / 2) * var6;
                     int var22 = (var8 / var6 + var17 - var5 / 2) * var6;
                     byte var23 = 0;
                     byte var24 = 0;
                     byte var25 = 0;
                     int[] var26 = new int[256];
                     ack var27 = var1.c(var21, var22);
                     int var28 = var21 & 15;
                     int var29 = var22 & 15;
                     int var30 = 0;
                     double var31 = 0.0D;
                     int var33;
                     int var34;
                     int var35;
                     int var38;
                     if(var1.t.e) {
                        var33 = var21 + var22 * 231871;
                        var33 = var33 * var33 * 31287121 + var33 * 11;
                        if((var33 >> 20 & 1) == 0) {
                           var26[pb.v.bO] += 10;
                        } else {
                           var26[pb.t.bO] += 10;
                        }

                        var31 = 100.0D;
                     } else {
                        for(var33 = 0; var33 < var6; ++var33) {
                           for(var34 = 0; var34 < var6; ++var34) {
                              var35 = var27.b(var33 + var28, var34 + var29) + 1;
                              int var36 = 0;
                              if(var35 > 1) {
                                 boolean var37 = false;

                                 do {
                                    var37 = true;
                                    var36 = var27.a(var33 + var28, var35 - 1, var34 + var29);
                                    if(var36 == 0) {
                                       var37 = false;
                                    } else if(var35 > 0 && var36 > 0 && pb.m[var36].cd.F == wh.b) {
                                       var37 = false;
                                    }

                                    if(!var37) {
                                       --var35;
                                       var36 = var27.a(var33 + var28, var35 - 1, var34 + var29);
                                    }
                                 } while(var35 > 0 && !var37);

                                 if(var35 > 0 && var36 != 0 && pb.m[var36].cd.d()) {
                                    var38 = var35 - 1;
                                    boolean var39 = false;

                                    int var43;
                                    do {
                                       var43 = var27.a(var33 + var28, var38--, var34 + var29);
                                       ++var30;
                                    } while(var38 > 0 && var43 != 0 && pb.m[var43].cd.d());
                                 }
                              }

                              var31 += (double)var35 / (double)(var6 * var6);
                              ++var26[var36];
                           }
                        }
                     }

                     var30 /= var6 * var6;
                     int var10000 = var23 / (var6 * var6);
                     var10000 = var24 / (var6 * var6);
                     var10000 = var25 / (var6 * var6);
                     var33 = 0;
                     var34 = 0;

                     for(var35 = 0; var35 < 256; ++var35) {
                        if(var26[var35] > var33) {
                           var34 = var35;
                           var33 = var26[var35];
                        }
                     }

                     double var41 = (var31 - var15) * 4.0D / (double)(var6 + 4) + ((double)(var12 + var17 & 1) - 0.5D) * 0.4D;
                     byte var42 = 1;
                     if(var41 > 0.6D) {
                        var42 = 2;
                     }

                     if(var41 < -0.6D) {
                        var42 = 0;
                     }

                     var38 = 0;
                     if(var34 > 0) {
                        wh var44 = pb.m[var34].cd.F;
                        if(var44 == wh.n) {
                           var41 = (double)var30 * 0.1D + (double)(var12 + var17 & 1) * 0.2D;
                           var42 = 1;
                           if(var41 < 0.5D) {
                              var42 = 2;
                           }

                           if(var41 > 0.9D) {
                              var42 = 0;
                           }
                        }

                        var38 = var44.q;
                     }

                     var15 = var31;
                     if(var17 >= 0 && var18 * var18 + var19 * var19 < var11 * var11 && (!var20 || (var12 + var17 & 1) != 0)) {
                        byte var45 = var3.f[var12 + var17 * var4];
                        byte var40 = (byte)(var38 * 4 + var42);
                        if(var45 != var40) {
                           if(var13 > var17) {
                              var13 = var17;
                           }

                           if(var14 < var17) {
                              var14 = var17;
                           }

                           var3.f[var12 + var17 * var4] = var40;
                        }
                     }
                  }
               }

               if(var13 <= var14) {
                  var3.a(var12, var13, var14);
               }
            }
         }

      }
   }

   public void a(aan var1, xd var2, nn var3, int var4, boolean var5) {
      if(!var2.F) {
         aaj var6 = this.a(var1, var2);
         if(var3 instanceof yw) {
            yw var7 = (yw)var3;
            var6.a(var7, var1);
         }

         if(var5) {
            this.a(var2, var3, var6);
         }

      }
   }

   public void c(aan var1, xd var2, yw var3) {
      var1.b(var2.b("map"));
      String var4 = "map_" + var1.i();
      aaj var5 = new aaj(var4);
      var2.a(var4, (zk)var5);
      var5.b = gk.c(var3.o);
      var5.c = gk.c(var3.q);
      var5.e = 3;
      var5.d = (byte)var2.t.g;
      var5.a();
   }
}
