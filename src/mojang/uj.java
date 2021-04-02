package mojang;

import java.util.Random;

public class uj extends pb {

   private boolean a;


   public uj(int var1, int var2, boolean var3) {
      super(var1, var2, acn.e);
      if(var3) {
         this.a(true);
      }

      this.a = var3;
   }

   public int e() {
      return 30;
   }

   public void a(xd var1, int var2, int var3, int var4, yw var5) {
      this.h(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5);
   }

   public void b(xd var1, int var2, int var3, int var4, nn var5) {
      this.h(var1, var2, var3, var4);
      super.b(var1, var2, var3, var4, var5);
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      this.h(var1, var2, var3, var4);
      return super.b(var1, var2, var3, var4, var5);
   }

   private void h(xd var1, int var2, int var3, int var4) {
      this.i(var1, var2, var3, var4);
      if(this.bO == aN.bO) {
         var1.g(var2, var3, var4, aO.bO);
      }

   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(this.bO == aO.bO) {
         var1.g(var2, var3, var4, aN.bO);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return yr.aC.bQ;
   }

   public int a(int var1, Random var2) {
      return this.a(var2) + var2.nextInt(var1 + 1);
   }

   public int a(Random var1) {
      return 4 + var1.nextInt(2);
   }

   public void b(xd var1, int var2, int var3, int var4, Random var5) {
      if(this.a) {
         this.i(var1, var2, var3, var4);
      }

   }

   private void i(xd var1, int var2, int var3, int var4) {
      Random var5 = var1.r;
      double var6 = 0.0625D;

      for(int var8 = 0; var8 < 6; ++var8) {
         double var9 = (double)((float)var2 + var5.nextFloat());
         double var11 = (double)((float)var3 + var5.nextFloat());
         double var13 = (double)((float)var4 + var5.nextFloat());
         if(var8 == 0 && !var1.g(var2, var3 + 1, var4)) {
            var11 = (double)(var3 + 1) + var6;
         }

         if(var8 == 1 && !var1.g(var2, var3 - 1, var4)) {
            var11 = (double)(var3 + 0) - var6;
         }

         if(var8 == 2 && !var1.g(var2, var3, var4 + 1)) {
            var13 = (double)(var4 + 1) + var6;
         }

         if(var8 == 3 && !var1.g(var2, var3, var4 - 1)) {
            var13 = (double)(var4 + 0) - var6;
         }

         if(var8 == 4 && !var1.g(var2 + 1, var3, var4)) {
            var9 = (double)(var2 + 1) + var6;
         }

         if(var8 == 5 && !var1.g(var2 - 1, var3, var4)) {
            var9 = (double)(var2 + 0) - var6;
         }

         if(var9 < (double)var2 || var9 > (double)(var2 + 1) || var11 < 0.0D || var11 > (double)(var3 + 1) || var13 < (double)var4 || var13 > (double)(var4 + 1)) {
            var1.a("reddust", var9, var11, var13, 0.0D, 0.0D, 0.0D);
         }
      }

   }

   protected aan b(int var1) {
      return new aan(aN);
   }
}
