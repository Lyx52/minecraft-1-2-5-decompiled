package mojang;

import java.util.Random;

public class yl extends agy {

   protected yl(int var1) {
      super(var1, 166, acn.e);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
      this.f(0);
   }

   public boolean b() {
      return false;
   }

   public void b(World var1, int var2, int var3, int var4, Random var5) {
      super.b(var1, var2, var3, var4, var5);

      for(int var6 = var2 - 2; var6 <= var2 + 2; ++var6) {
         for(int var7 = var4 - 2; var7 <= var4 + 2; ++var7) {
            if(var6 > var2 - 2 && var6 < var2 + 2 && var7 == var4 - 1) {
               var7 = var4 + 2;
            }

            if(var5.nextInt(16) == 0) {
               for(int var8 = var3; var8 <= var3 + 1; ++var8) {
                  if(var1.a(var6, var8, var7) == an.bO) {
                     if(!var1.i((var6 - var2) / 2 + var2, var8, (var7 - var4) / 2 + var4)) {
                        break;
                     }

                     var1.a("enchantmenttable", (double)var2 + 0.5D, (double)var3 + 2.0D, (double)var4 + 0.5D, (double)((float)(var6 - var2) + var5.nextFloat()) - 0.5D, (double)((float)(var8 - var3) - var5.nextFloat() - 1.0F), (double)((float)(var7 - var4) + var5.nextFloat()) - 0.5D);
                  }
               }
            }
         }
      }

   }

   public boolean a() {
      return false;
   }

   public int a(int var1, int var2) {
      return this.a_(var1);
   }

   public int a_(int var1) {
      return var1 == 0?this.bN + 17:(var1 == 1?this.bN:this.bN + 16);
   }

   public kw u_() {
      return new uz();
   }

   public boolean b(World var1, int var2, int var3, int var4, Player var5) {
      if(var1.F) {
         return true;
      } else {
         var5.c(var2, var3, var4);
         return true;
      }
   }
}
