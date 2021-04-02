package mojang;

import java.util.Random;

public class ahx extends qk {

   protected ahx(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.2F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
      this.a(true);
   }

   public void a(World var1, int var2, int var3, int var4, Random var5) {
      if(var5.nextInt(25) == 0) {
         byte var6 = 4;
         int var7 = 5;

         int var8;
         int var9;
         int var10;
         for(var8 = var2 - var6; var8 <= var2 + var6; ++var8) {
            for(var9 = var4 - var6; var9 <= var4 + var6; ++var9) {
               for(var10 = var3 - 1; var10 <= var3 + 1; ++var10) {
                  if(var1.a(var8, var10, var9) == this.bO) {
                     --var7;
                     if(var7 <= 0) {
                        return;
                     }
                  }
               }
            }
         }

         var8 = var2 + var5.nextInt(3) - 1;
         var9 = var3 + var5.nextInt(2) - var5.nextInt(2);
         var10 = var4 + var5.nextInt(3) - 1;

         for(int var11 = 0; var11 < 4; ++var11) {
            if(var1.i(var8, var9, var10) && this.g(var1, var8, var9, var10)) {
               var2 = var8;
               var3 = var9;
               var4 = var10;
            }

            var8 = var2 + var5.nextInt(3) - 1;
            var9 = var3 + var5.nextInt(2) - var5.nextInt(2);
            var10 = var4 + var5.nextInt(3) - 1;
         }

         if(var1.i(var8, var9, var10) && this.g(var1, var8, var9, var10)) {
            var1.g(var8, var9, var10, this.bO);
         }
      }

   }

   public boolean e(World var1, int var2, int var3, int var4) {
      return super.e(var1, var2, var3, var4) && this.g(var1, var2, var3, var4);
   }

   protected boolean f_(int var1) {
      return n[var1];
   }

   public boolean g(World var1, int var2, int var3, int var4) {
      if(var3 >= 0 && var3 < 256) {
         int var5 = var1.a(var2, var3 - 1, var4);
         return var5 == by.bO || var1.n(var2, var3, var4) < 13 && this.f_(var5);
      } else {
         return false;
      }
   }

   public boolean c(World var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      var1.d(var2, var3, var4, 0);
      qm var7 = null;
      if(this.bO == af.bO) {
         var7 = new qm(0);
      } else if(this.bO == ag.bO) {
         var7 = new qm(1);
      }

      if(var7 != null && var7.a(var1, var5, var2, var3, var4)) {
         return true;
      } else {
         var1.b(var2, var3, var4, this.bO, var6);
         return false;
      }
   }
}
