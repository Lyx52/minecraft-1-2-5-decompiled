package mojang;

public class po extends yr {

   public po(int var1) {
      super(var1);
   }

   public boolean a(aan var1, Player var2, World var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      int var9 = var3.e(var4, var5, var6);
      if(var2.e(var4, var5, var6) && var8 == pb.bI.bO && !amj.e(var9)) {
         if(var3.F) {
            return true;
         } else {
            var3.f(var4, var5, var6, var9 + 4);
            --var1.a;

            int var10;
            for(var10 = 0; var10 < 16; ++var10) {
               double var11 = (double)((float)var4 + (5.0F + d.nextFloat() * 6.0F) / 16.0F);
               double var13 = (double)((float)var5 + 0.8125F);
               double var15 = (double)((float)var6 + (5.0F + d.nextFloat() * 6.0F) / 16.0F);
               double var17 = 0.0D;
               double var19 = 0.0D;
               double var21 = 0.0D;
               var3.a("smoke", var11, var13, var15, var17, var19, var21);
            }

            var10 = var9 & 3;
            int var23 = 0;
            int var12 = 0;
            boolean var24 = false;
            boolean var14 = true;
            int var25 = aav.f[var10];

            int var16;
            int var18;
            int var20;
            int var26;
            int var27;
            for(var16 = -2; var16 <= 2; ++var16) {
               var26 = var4 + aav.a[var25] * var16;
               var18 = var6 + aav.b[var25] * var16;
               var27 = var3.a(var26, var5, var18);
               if(var27 == pb.bI.bO) {
                  var20 = var3.e(var26, var5, var18);
                  if(!amj.e(var20)) {
                     var14 = false;
                     break;
                  }

                  if(!var24) {
                     var23 = var16;
                     var12 = var16;
                     var24 = true;
                  } else {
                     var12 = var16;
                  }
               }
            }

            if(var14 && var12 == var23 + 2) {
               for(var16 = var23; var16 <= var12; ++var16) {
                  var26 = var4 + aav.a[var25] * var16;
                  var18 = var6 + aav.b[var25] * var16;
                  var26 += aav.a[var10] * 4;
                  var18 += aav.b[var10] * 4;
                  var27 = var3.a(var26, var5, var18);
                  var20 = var3.e(var26, var5, var18);
                  if(var27 != pb.bI.bO || !amj.e(var20)) {
                     var14 = false;
                     break;
                  }
               }

               for(var16 = var23 - 1; var16 <= var12 + 1; var16 += 4) {
                  for(var26 = 1; var26 <= 3; ++var26) {
                     var18 = var4 + aav.a[var25] * var16;
                     var27 = var6 + aav.b[var25] * var16;
                     var18 += aav.a[var10] * var26;
                     var27 += aav.b[var10] * var26;
                     var20 = var3.a(var18, var5, var27);
                     int var28 = var3.e(var18, var5, var27);
                     if(var20 != pb.bI.bO || !amj.e(var28)) {
                        var14 = false;
                        break;
                     }
                  }
               }

               if(var14) {
                  for(var16 = var23; var16 <= var12; ++var16) {
                     for(var26 = 1; var26 <= 3; ++var26) {
                        var18 = var4 + aav.a[var25] * var16;
                        var27 = var6 + aav.b[var25] * var16;
                        var18 += aav.a[var10] * var26;
                        var27 += aav.b[var10] * var26;
                        var3.g(var18, var5, var27, pb.bH.bO);
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public aan a(aan var1, World var2, Player var3) {
      pl var4 = this.a(var2, var3, false);
      if(var4 != null && var4.a == aat.a) {
         int var5 = var2.a(var4.b, var4.c, var4.d);
         if(var5 == pb.bI.bO) {
            return var1;
         }
      }

      if(!var2.F) {
         qo var7 = var2.b("Stronghold", (int)var3.o, (int)var3.p, (int)var3.q);
         if(var7 != null) {
            EyeOfEnderSignal var6 = new EyeOfEnderSignal(var2, var3.o, var3.p + 1.62D - (double)var3.H, var3.q);
            var6.a((double)var7.a, var7.b, (double)var7.c);
            var2.a((BaseEntity)var6);
            var2.a(var3, "random.bow", 0.5F, 0.4F / (d.nextFloat() * 0.4F + 0.8F));
            var2.a((Player)null, 1002, (int)var3.o, (int)var3.p, (int)var3.q, 0);
            if(!var3.aT.d) {
               --var1.a;
            }
         }
      }

      return var1;
   }
}
