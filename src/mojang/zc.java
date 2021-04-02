package mojang;

import java.util.Random;

public class zc extends qk {

   protected zc(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.4F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
   }

   public void a(World var1, int var2, int var3, int var4, Random var5) {
      if(!var1.F) {
         super.a(var1, var2, var3, var4, var5);
         if(var1.o(var2, var3 + 1, var4) >= 9 && var5.nextInt(7) == 0) {
            int var6 = var1.e(var2, var3, var4);
            if((var6 & 8) == 0) {
               var1.f(var2, var3, var4, var6 | 8);
            } else {
               this.c(var1, var2, var3, var4, var5);
            }
         }

      }
   }

   public int a(int var1, int var2) {
      var2 &= 3;
      return var2 == 1?63:(var2 == 2?79:(var2 == 3?30:super.a(var1, var2)));
   }

   public void c(World var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4) & 3;
      Object var7 = null;
      int var8 = 0;
      int var9 = 0;
      boolean var10 = false;
      if(var6 == 1) {
         var7 = new rb(true);
      } else if(var6 == 2) {
         var7 = new i(true);
      } else if(var6 == 3) {
         for(var8 = 0; var8 >= -1; --var8) {
            for(var9 = 0; var9 >= -1; --var9) {
               if(this.f(var1, var2 + var8, var3, var4 + var9, 3) && this.f(var1, var2 + var8 + 1, var3, var4 + var9, 3) && this.f(var1, var2 + var8, var3, var4 + var9 + 1, 3) && this.f(var1, var2 + var8 + 1, var3, var4 + var9 + 1, 3)) {
                  var7 = new ajd(true, 10 + var5.nextInt(20), 3, 3);
                  var10 = true;
                  break;
               }
            }

            if(var7 != null) {
               break;
            }
         }

         if(var7 == null) {
            var9 = 0;
            var8 = 0;
            var7 = new sb(true, 4 + var5.nextInt(7), 3, 3, false);
         }
      } else {
         var7 = new sb(true);
         if(var5.nextInt(10) == 0) {
            var7 = new zz(true);
         }
      }

      if(var10) {
         var1.d(var2 + var8, var3, var4 + var9, 0);
         var1.d(var2 + var8 + 1, var3, var4 + var9, 0);
         var1.d(var2 + var8, var3, var4 + var9 + 1, 0);
         var1.d(var2 + var8 + 1, var3, var4 + var9 + 1, 0);
      } else {
         var1.d(var2, var3, var4, 0);
      }

      if(!((li)var7).a(var1, var5, var2 + var8, var3, var4 + var9)) {
         if(var10) {
            var1.b(var2 + var8, var3, var4 + var9, this.bO, var6);
            var1.b(var2 + var8 + 1, var3, var4 + var9, this.bO, var6);
            var1.b(var2 + var8, var3, var4 + var9 + 1, this.bO, var6);
            var1.b(var2 + var8 + 1, var3, var4 + var9 + 1, this.bO, var6);
         } else {
            var1.b(var2, var3, var4, this.bO, var6);
         }
      }

   }

   public boolean f(World var1, int var2, int var3, int var4, int var5) {
      return var1.a(var2, var3, var4) == this.bO && (var1.e(var2, var3, var4) & 3) == var5;
   }

   protected int c(int var1) {
      return var1 & 3;
   }
}
