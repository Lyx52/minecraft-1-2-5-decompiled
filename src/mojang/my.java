package mojang;

import java.util.Random;

public class my extends qk {

   protected my(int var1, int var2) {
      super(var1, var2, acn.k);
      float var3 = 0.4F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.8F, 0.5F + var3);
   }

   public int a(int var1, int var2) {
      return var2 == 1?this.bN:(var2 == 2?this.bN + 16 + 1:(var2 == 0?this.bN + 16:this.bN));
   }

   public int i() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return zv.a(var1, var3);
   }

   public int d(int var1) {
      return var1 == 0?16777215:gu.c();
   }

   public int c(WorldInterface var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      return var5 == 0?16777215:var1.a(var2, var4).k();
   }

   public int a(int var1, Random var2, int var3) {
      return var2.nextInt(8) == 0?yr.S.bQ:-1;
   }

   public int a(int var1, Random var2) {
      return 1 + var2.nextInt(var1 * 2 + 1);
   }

   public void a(World var1, Player var2, int var3, int var4, int var5, int var6) {
      if(!var1.F && var2.av() != null && var2.av().c == yr.be.bQ) {
         var2.a(gv.C[this.bO], 1);
         this.a(var1, var3, var4, var5, new aan(X, 1, var6));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }
}
