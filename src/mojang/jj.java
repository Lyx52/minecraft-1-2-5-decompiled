package mojang;

import java.util.Random;

public class jj extends pb {

   public jj(int var1, int var2) {
      super(var1, var2, acn.e);
   }

   public int a(int var1, Random var2, int var3) {
      return this.bO == I.bO?yr.m.bQ:(this.bO == aw.bO?yr.n.bQ:(this.bO == N.bO?yr.aW.bQ:this.bO));
   }

   public int a(Random var1) {
      return this.bO == N.bO?4 + var1.nextInt(5):1;
   }

   public int a(int var1, Random var2) {
      if(var1 > 0 && this.bO != this.a(0, var2, var1)) {
         int var3 = var2.nextInt(var1 + 2) - 1;
         if(var3 < 0) {
            var3 = 0;
         }

         return this.a(var2) * (var3 + 1);
      } else {
         return this.a(var2);
      }
   }

   protected int c(int var1) {
      return this.bO == N.bO?4:0;
   }
}
