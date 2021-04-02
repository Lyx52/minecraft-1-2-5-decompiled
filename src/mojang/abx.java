package mojang;

import java.util.Random;

public class abx extends pb {

   protected abx(int var1) {
      super(var1, acn.d);
      this.bN = 26;
   }

   public int d(ali var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return this.bN - 1;
      } else if(var5 == 0) {
         return this.bN - 1;
      } else {
         int var6 = var1.a(var2, var3, var4 - 1);
         int var7 = var1.a(var2, var3, var4 + 1);
         int var8 = var1.a(var2 - 1, var3, var4);
         int var9 = var1.a(var2 + 1, var3, var4);
         byte var10 = 3;
         if(pb.n[var6] && !pb.n[var7]) {
            var10 = 3;
         }

         if(pb.n[var7] && !pb.n[var6]) {
            var10 = 2;
         }

         if(pb.n[var8] && !pb.n[var9]) {
            var10 = 5;
         }

         if(pb.n[var9] && !pb.n[var8]) {
            var10 = 4;
         }

         return var5 == var10?this.bN + 1:this.bN;
      }
   }

   public int a_(int var1) {
      return var1 == 1?this.bN - 1:(var1 == 0?this.bN - 1:(var1 == 3?this.bN + 1:this.bN));
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      var1.g(var2, var3, var4, 0);
   }
}
