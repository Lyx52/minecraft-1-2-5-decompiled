import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class vf {

   private static HashMap b = new HashMap();
   protected static final Class[] a = new Class[]{cb.class, ajg.class, xr.class};


   protected static qo a(xd var0, int var1, int var2) {
      ack var3 = var0.d(var1, var2);
      int var4 = var1 * 16 + var0.r.nextInt(16);
      int var5 = var0.r.nextInt(var3 == null?128:Math.max(128, var3.h()));
      int var6 = var2 * 16 + var0.r.nextInt(16);
      return new qo(var4, var5, var6);
   }

   public static final int a(xd var0, boolean var1, boolean var2) {
      if(!var1 && !var2) {
         return 0;
      } else {
         b.clear();

         int var3;
         int var6;
         for(var3 = 0; var3 < var0.d.size(); ++var3) {
            yw var4 = (yw)var0.d.get(var3);
            int var5 = gk.c(var4.o / 16.0D);
            var6 = gk.c(var4.q / 16.0D);
            byte var7 = 8;

            for(int var8 = -var7; var8 <= var7; ++var8) {
               for(int var9 = -var7; var9 <= var7; ++var9) {
                  boolean var10 = var8 == -var7 || var8 == var7 || var9 == -var7 || var9 == var7;
                  sj var11 = new sj(var8 + var5, var9 + var6);
                  if(!var10) {
                     b.put(var11, Boolean.valueOf(false));
                  } else if(!b.containsKey(var11)) {
                     b.put(var11, Boolean.valueOf(true));
                  }
               }
            }
         }

         var3 = 0;
         uh var31 = var0.x();
         acf[] var32 = acf.values();
         var6 = var32.length;

         for(int var33 = 0; var33 < var6; ++var33) {
            acf var34 = var32[var33];
            if((!var34.d() || var2) && (var34.d() || var1) && var0.b(var34.a()) <= var34.b() * b.size() / 256) {
               Iterator var35 = b.keySet().iterator();

               label108:
               while(var35.hasNext()) {
                  sj var36 = (sj)var35.next();
                  if(!((Boolean)b.get(var36)).booleanValue()) {
                     qo var37 = a(var0, var36.a, var36.b);
                     int var12 = var37.a;
                     int var13 = var37.b;
                     int var14 = var37.c;
                     if(!var0.h(var12, var13, var14) && var0.f(var12, var13, var14) == var34.c()) {
                        int var15 = 0;
                        int var16 = 0;

                        while(var16 < 3) {
                           int var17 = var12;
                           int var18 = var13;
                           int var19 = var14;
                           byte var20 = 6;
                           bg var21 = null;
                           int var22 = 0;

                           while(true) {
                              if(var22 < 4) {
                                 label101: {
                                    var17 += var0.r.nextInt(var20) - var0.r.nextInt(var20);
                                    var18 += var0.r.nextInt(1) - var0.r.nextInt(1);
                                    var19 += var0.r.nextInt(var20) - var0.r.nextInt(var20);
                                    if(a(var34, var0, var17, var18, var19)) {
                                       float var23 = (float)var17 + 0.5F;
                                       float var24 = (float)var18;
                                       float var25 = (float)var19 + 0.5F;
                                       if(var0.a((double)var23, (double)var24, (double)var25, 24.0D) == null) {
                                          float var26 = var23 - (float)var31.a;
                                          float var27 = var24 - (float)var31.b;
                                          float var28 = var25 - (float)var31.c;
                                          float var29 = var26 * var26 + var27 * var27 + var28 * var28;
                                          if(var29 >= 576.0F) {
                                             if(var21 == null) {
                                                var21 = var0.a(var34, var17, var18, var19);
                                                if(var21 == null) {
                                                   break label101;
                                                }
                                             }

                                             acq var38;
                                             try {
                                                var38 = (acq)var21.a.getConstructor(new Class[]{xd.class}).newInstance(new Object[]{var0});
                                             } catch (Exception var30) {
                                                var30.printStackTrace();
                                                return var3;
                                             }

                                             var38.c((double)var23, (double)var24, (double)var25, var0.r.nextFloat() * 360.0F, 0.0F);
                                             if(var38.i()) {
                                                ++var15;
                                                var0.a((nn)var38);
                                                a(var38, var0, var23, var24, var25);
                                                if(var15 >= var38.ac()) {
                                                   continue label108;
                                                }
                                             }

                                             var3 += var15;
                                          }
                                       }
                                    }

                                    ++var22;
                                    continue;
                                 }
                              }

                              ++var16;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         return var3;
      }
   }

   public static boolean a(acf var0, xd var1, int var2, int var3, int var4) {
      if(var0.c() == acn.g) {
         return var1.f(var2, var3, var4).d() && !var1.h(var2, var3 + 1, var4);
      } else {
         int var5 = var1.a(var2, var3 - 1, var4);
         return pb.g(var5) && var5 != pb.z.bO && !var1.h(var2, var3, var4) && !var1.f(var2, var3, var4).d() && !var1.h(var2, var3 + 1, var4);
      }
   }

   private static void a(acq var0, xd var1, float var2, float var3, float var4) {
      if(var0 instanceof cb && var1.r.nextInt(100) == 0) {
         xr var7 = new xr(var1);
         var7.c((double)var2, (double)var3, (double)var4, var0.u, 0.0F);
         var1.a((nn)var7);
         var7.h(var0);
      } else if(var0 instanceof cu) {
         ((cu)var0).c_(cu.a(var1.r));
      } else if(var0 instanceof uo && var1.r.nextInt(7) == 0) {
         for(int var5 = 0; var5 < 2; ++var5) {
            uo var6 = new uo(var1);
            var6.c((double)var2, (double)var3, (double)var4, var0.u, 0.0F);
            var6.d(-24000);
            var1.a((nn)var6);
         }
      }

   }

   public static void a(xd var0, abn var1, int var2, int var3, int var4, int var5, Random var6) {
      List var7 = var1.a(acf.b);
      if(!var7.isEmpty()) {
         while(var6.nextFloat() < var1.f()) {
            bg var8 = (bg)pk.a(var0.r, (Collection)var7);
            int var9 = var8.b + var6.nextInt(1 + var8.c - var8.b);
            int var10 = var2 + var6.nextInt(var4);
            int var11 = var3 + var6.nextInt(var5);
            int var12 = var10;
            int var13 = var11;

            for(int var14 = 0; var14 < var9; ++var14) {
               boolean var15 = false;

               for(int var16 = 0; !var15 && var16 < 4; ++var16) {
                  int var17 = var0.g(var10, var11);
                  if(a(acf.b, var0, var10, var17, var11)) {
                     float var18 = (float)var10 + 0.5F;
                     float var19 = (float)var17;
                     float var20 = (float)var11 + 0.5F;

                     acq var21;
                     try {
                        var21 = (acq)var8.a.getConstructor(new Class[]{xd.class}).newInstance(new Object[]{var0});
                     } catch (Exception var23) {
                        var23.printStackTrace();
                        continue;
                     }

                     var21.c((double)var18, (double)var19, (double)var20, var6.nextFloat() * 360.0F, 0.0F);
                     var0.a((nn)var21);
                     a(var21, var0, var18, var19, var20);
                     var15 = true;
                  }

                  var10 += var6.nextInt(5) - var6.nextInt(5);

                  for(var11 += var6.nextInt(5) - var6.nextInt(5); var10 < var2 || var10 >= var2 + var4 || var11 < var3 || var11 >= var3 + var4; var11 = var13 + var6.nextInt(5) - var6.nextInt(5)) {
                     var10 = var12 + var6.nextInt(5) - var6.nextInt(5);
                  }
               }
            }
         }

      }
   }

}
