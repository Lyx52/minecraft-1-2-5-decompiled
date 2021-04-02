package mojang;

import java.util.Random;

public class yp extends pb {

   public static boolean a = false;


   public yp(int var1, int var2) {
      super(var1, var2, acn.o);
   }

   public void a(World var1, int var2, int var3, int var4) {
      var1.a(var2, var3, var4, this.bO, this.e());
   }

   public void a(World var1, int var2, int var3, int var4, int var5) {
      var1.a(var2, var3, var4, this.bO, this.e());
   }

   public void a(World var1, int var2, int var3, int var4, Random var5) {
      this.i(var1, var2, var3, var4);
   }

   private void i(World var1, int var2, int var3, int var4) {
      if(h(var1, var2, var3 - 1, var4) && var3 >= 0) {
         byte var8 = 32;
         if(!a && var1.b(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
            if(!var1.F) {
               FallingSand var9 = new FallingSand(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this.bO);
               var1.a((BaseEntity)var9);
            }
         } else {
            var1.g(var2, var3, var4, 0);

            while(h(var1, var2, var3 - 1, var4) && var3 > 0) {
               --var3;
            }

            if(var3 > 0) {
               var1.g(var2, var3, var4, this.bO);
            }
         }
      }

   }

   public int e() {
      return 3;
   }

   public static boolean h(World var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      if(var4 == 0) {
         return true;
      } else if(var4 == ar.bO) {
         return true;
      } else {
         acn var5 = m[var4].cd;
         return var5 == acn.g?true:var5 == acn.h;
      }
   }

}
