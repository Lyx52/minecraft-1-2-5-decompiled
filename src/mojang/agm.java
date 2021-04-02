package mojang;

import java.util.Random;

public class agm extends li {

   private int a;
   private int b;


   public agm(int var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public boolean a(xd var1, Random var2, int var3, int var4, int var5) {
      int var15;
      for(boolean var6 = false; ((var15 = var1.a(var3, var4, var5)) == 0 || var15 == pb.K.bO) && var4 > 0; --var4) {
         ;
      }

      int var7 = var1.a(var3, var4, var5);
      if(var7 == pb.v.bO || var7 == pb.u.bO) {
         ++var4;
         this.a(var1, var3, var4, var5, pb.J.bO, this.b);

         for(int var8 = var4; var8 <= var4 + 2; ++var8) {
            int var9 = var8 - var4;
            int var10 = 2 - var9;

            for(int var11 = var3 - var10; var11 <= var3 + var10; ++var11) {
               int var12 = var11 - var3;

               for(int var13 = var5 - var10; var13 <= var5 + var10; ++var13) {
                  int var14 = var13 - var5;
                  if((Math.abs(var12) != var10 || Math.abs(var14) != var10 || var2.nextInt(2) != 0) && !pb.n[var1.a(var11, var8, var13)]) {
                     this.a(var1, var11, var8, var13, pb.K.bO, this.a);
                  }
               }
            }
         }
      }

      return true;
   }
}
