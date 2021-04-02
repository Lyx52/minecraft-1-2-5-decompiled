package mojang;

import java.util.List;

public class ajk extends yr {

   public ajk(int var1) {
      super(var1);
      this.bR = 1;
   }

   public aan a(aan var1, xd var2, yw var3) {
      float var4 = 1.0F;
      float var5 = var3.x + (var3.v - var3.x) * var4;
      float var6 = var3.w + (var3.u - var3.w) * var4;
      double var7 = var3.l + (var3.o - var3.l) * (double)var4;
      double var9 = var3.m + (var3.p - var3.m) * (double)var4 + 1.62D - (double)var3.H;
      double var11 = var3.n + (var3.q - var3.n) * (double)var4;
      bo var13 = mojang.bo.b(var7, var9, var11);
      float var14 = gk.b(-var6 * 0.017453292F - 3.1415927F);
      float var15 = gk.a(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -gk.b(-var5 * 0.017453292F);
      float var17 = gk.a(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = 5.0D;
      bo var23 = var13.c((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      pl var24 = var2.a(var13, var23, true);
      if(var24 == null) {
         return var1;
      } else {
         bo var25 = var3.k(var4);
         boolean var26 = false;
         float var27 = 1.0F;
         List var28 = var2.b((nn)var3, var3.y.a(var25.a * var21, var25.b * var21, var25.c * var21).b((double)var27, (double)var27, (double)var27));

         for(int var29 = 0; var29 < var28.size(); ++var29) {
            nn var30 = (nn)var28.get(var29);
            if(var30.l_()) {
               float var31 = var30.j_();
               wu var32 = var30.y.b((double)var31, (double)var31, (double)var31);
               if(var32.a(var13)) {
                  var26 = true;
               }
            }
         }

         if(var26) {
            return var1;
         } else {
            if(var24.a == aat.a) {
               int var33 = var24.b;
               int var34 = var24.c;
               int var35 = var24.d;
               if(!var2.F) {
                  if(var2.a(var33, var34, var35) == pb.aS.bO) {
                     --var34;
                  }

                  var2.a((nn)(new ep(var2, (double)((float)var33 + 0.5F), (double)((float)var34 + 1.0F), (double)((float)var35 + 0.5F))));
               }

               if(!var3.aT.d) {
                  --var1.a;
               }
            }

            return var1;
         }
      }
   }
}
