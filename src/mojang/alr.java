package mojang;

import java.util.Random;

public class alr extends pb {

   protected alr(int var1) {
      super(var1, acn.b);
      this.bN = 77;
      this.a(true);
   }

   public int a(int var1, int var2) {
      return var1 == 1?78:(var1 == 0?2:77);
   }

   public int d(ali var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return 78;
      } else if(var5 == 0) {
         return 2;
      } else {
         acn var6 = var1.f(var2, var3 + 1, var4);
         return var6 != acn.v && var6 != acn.w?77:68;
      }
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(!var1.F) {
         if(var1.o(var2, var3 + 1, var4) < 4 && o[var1.a(var2, var3 + 1, var4)] > 2) {
            var1.g(var2, var3, var4, v.bO);
         } else if(var1.o(var2, var3 + 1, var4) >= 9) {
            for(int var6 = 0; var6 < 4; ++var6) {
               int var7 = var2 + var5.nextInt(3) - 1;
               int var8 = var3 + var5.nextInt(5) - 3;
               int var9 = var4 + var5.nextInt(3) - 1;
               int var10 = var1.a(var7, var8 + 1, var9);
               if(var1.a(var7, var8, var9) == v.bO && var1.o(var7, var8 + 1, var9) >= 4 && o[var10] <= 2) {
                  var1.g(var7, var8, var9, this.bO);
               }
            }
         }

      }
   }

   public void b(xd var1, int var2, int var3, int var4, Random var5) {
      super.b(var1, var2, var3, var4, var5);
      if(var5.nextInt(10) == 0) {
         var1.a("townaura", (double)((float)var2 + var5.nextFloat()), (double)((float)var3 + 1.1F), (double)((float)var4 + var5.nextFloat()), 0.0D, 0.0D, 0.0D);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return v.a(0, var2, var3);
   }
}
