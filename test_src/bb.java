
public class bb extends yr {

   private int a;


   public bb(int var1, int var2) {
      super(var1);
      this.bR = 1;
      this.a = var2;
   }

   public aan a(aan var1, xd var2, yw var3) {
      float var4 = 1.0F;
      double var5 = var3.l + (var3.o - var3.l) * (double)var4;
      double var7 = var3.m + (var3.p - var3.m) * (double)var4 + 1.62D - (double)var3.H;
      double var9 = var3.n + (var3.q - var3.n) * (double)var4;
      boolean var11 = this.a == 0;
      pl var12 = this.a(var2, var3, var11);
      if(var12 == null) {
         return var1;
      } else {
         if(var12.a == aat.a) {
            int var13 = var12.b;
            int var14 = var12.c;
            int var15 = var12.d;
            if(!var2.a(var3, var13, var14, var15)) {
               return var1;
            }

            if(this.a == 0) {
               if(!var3.e(var13, var14, var15)) {
                  return var1;
               }

               if(var2.f(var13, var14, var15) == acn.g && var2.e(var13, var14, var15) == 0) {
                  var2.g(var13, var14, var15, 0);
                  if(var3.aT.d) {
                     return var1;
                  }

                  return new aan(yr.ax);
               }

               if(var2.f(var13, var14, var15) == acn.h && var2.e(var13, var14, var15) == 0) {
                  var2.g(var13, var14, var15, 0);
                  if(var3.aT.d) {
                     return var1;
                  }

                  return new aan(yr.ay);
               }
            } else {
               if(this.a < 0) {
                  return new aan(yr.aw);
               }

               if(var12.e == 0) {
                  --var14;
               }

               if(var12.e == 1) {
                  ++var14;
               }

               if(var12.e == 2) {
                  --var15;
               }

               if(var12.e == 3) {
                  ++var15;
               }

               if(var12.e == 4) {
                  --var13;
               }

               if(var12.e == 5) {
                  ++var13;
               }

               if(!var3.e(var13, var14, var15)) {
                  return var1;
               }

               if(var2.i(var13, var14, var15) || !var2.f(var13, var14, var15).a()) {
                  if(var2.t.d && this.a == pb.A.bO) {
                     var2.a(var5 + 0.5D, var7 + 0.5D, var9 + 0.5D, "random.fizz", 0.5F, 2.6F + (var2.r.nextFloat() - var2.r.nextFloat()) * 0.8F);

                     for(int var16 = 0; var16 < 8; ++var16) {
                        var2.a("largesmoke", (double)var13 + Math.random(), (double)var14 + Math.random(), (double)var15 + Math.random(), 0.0D, 0.0D, 0.0D);
                     }
                  } else {
                     var2.d(var13, var14, var15, this.a, 0);
                  }

                  if(var3.aT.d) {
                     return var1;
                  }

                  return new aan(yr.aw);
               }
            }
         } else if(this.a == 0 && var12.g instanceof un) {
            return new aan(yr.aG);
         }

         return var1;
      }
   }
}
