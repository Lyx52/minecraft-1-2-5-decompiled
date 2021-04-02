package mojang;

import java.util.Random;

public class gs extends qk {

   protected gs(int var1, int var2) {
      super(var1, var2, acn.k);
      float var3 = 0.4F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.8F, 0.5F + var3);
   }

   protected boolean f_(int var1) {
      return var1 == E.bO;
   }

   public int a(int var1, int var2) {
      return this.bN;
   }

   public int a(int var1, Random var2, int var3) {
      return -1;
   }

   public void a(xd var1, yw var2, int var3, int var4, int var5, int var6) {
      if(!var1.F && var2.av() != null && var2.av().c == yr.be.bQ) {
         var2.a(gv.C[this.bO], 1);
         this.a(var1, var3, var4, var5, new aan(Y, 1, var6));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }
}
