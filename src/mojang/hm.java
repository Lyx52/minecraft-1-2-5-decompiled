package mojang;

public class hm extends yr {

   public static final String[] a = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
   public static final int[] b = new int[]{1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 2651799, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320};


   public hm(int var1) {
      super(var1);
      this.a(true);
      this.g(0);
   }

   public int b(int var1) {
      int var2 = gk.a(var1, 0, 15);
      return this.bS + var2 % 8 * 16 + var2 / 8;
   }

   public String a(aan var1) {
      int var2 = gk.a(var1.i(), 0, 15);
      return super.e() + "." + a[var2];
   }

   public boolean a(aan var1, yw var2, xd var3, int var4, int var5, int var6, int var7) {
      if(!var2.e(var4, var5, var6)) {
         return false;
      } else {
         if(var1.i() == 15) {
            int var8 = var3.a(var4, var5, var6);
            if(var8 == pb.y.bO) {
               if(!var3.F) {
                  ((zc)pb.y).c(var3, var4, var5, var6, var3.r);
                  --var1.a;
               }

               return true;
            }

            if(var8 == pb.af.bO || var8 == pb.ag.bO) {
               if(!var3.F && ((ahx)pb.m[var8]).c(var3, var4, var5, var6, var3.r)) {
                  --var1.a;
               }

               return true;
            }

            if(var8 == pb.bt.bO || var8 == pb.bs.bO) {
               if(!var3.F) {
                  ((aei)pb.m[var8]).i(var3, var4, var5, var6);
                  --var1.a;
               }

               return true;
            }

            if(var8 == pb.az.bO) {
               if(!var3.F) {
                  ((jx)pb.az).f(var3, var4, var5, var6);
                  --var1.a;
               }

               return true;
            }

            if(var8 == pb.u.bO) {
               if(!var3.F) {
                  --var1.a;

                  label73:
                  for(int var9 = 0; var9 < 128; ++var9) {
                     int var10 = var4;
                     int var11 = var5 + 1;
                     int var12 = var6;

                     for(int var13 = 0; var13 < var9 / 16; ++var13) {
                        var10 += d.nextInt(3) - 1;
                        var11 += (d.nextInt(3) - 1) * d.nextInt(3) / 2;
                        var12 += d.nextInt(3) - 1;
                        if(var3.a(var10, var11 - 1, var12) != pb.u.bO || var3.h(var10, var11, var12)) {
                           continue label73;
                        }
                     }

                     if(var3.a(var10, var11, var12) == 0) {
                        if(d.nextInt(10) != 0) {
                           var3.d(var10, var11, var12, pb.X.bO, 1);
                        } else if(d.nextInt(3) != 0) {
                           var3.g(var10, var11, var12, pb.ad.bO);
                        } else {
                           var3.g(var10, var11, var12, pb.ae.bO);
                        }
                     }
                  }
               }

               return true;
            }
         }

         return false;
      }
   }

   public void a(aan var1, acq var2) {
      if(var2 instanceof cu) {
         cu var3 = (cu)var2;
         int var4 = wo.e(var1.i());
         if(!var3.u() && var3.t() != var4) {
            var3.c_(var4);
            --var1.a;
         }
      }

   }

}
