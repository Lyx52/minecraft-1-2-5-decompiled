package mojang;

import java.util.Random;

public class jz extends gz {

   public jz(int var1, int var2) {
      super(var1, var2, acn.u, false);
      this.ce = 0.98F;
      this.a(true);
   }

   public int c() {
      return 1;
   }

   public boolean a(WorldInterface var1, int var2, int var3, int var4, int var5) {
      return super.a(var1, var2, var3, var4, 1 - var5);
   }

   public void a(World var1, Player var2, int var3, int var4, int var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      acn var7 = var1.f(var3, var4 - 1, var5);
      if(var7.c() || var7.d()) {
         var1.g(var3, var4, var5, A.bO);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void a(World var1, int var2, int var3, int var4, Random var5) {
      if(var1.b(wl.b, var2, var3, var4) > 11 - o[this.bO]) {
         this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.g(var2, var3, var4, B.bO);
      }

   }

   public int f() {
      return 0;
   }

   protected aan b(int var1) {
      return null;
   }
}
