package mojang;

import java.util.Random;

public class rr extends qk {

   protected rr(int var1) {
      super(var1, 226);
      this.a(true);
      float var2 = 0.5F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 0.25F, 0.5F + var2);
   }

   protected boolean f_(int var1) {
      return var1 == bc.bO;
   }

   public boolean g(xd var1, int var2, int var3, int var4) {
      return this.f_(var1.a(var2, var3 - 1, var4));
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      if(var6 < 3) {
         abn var7 = var1.a(var2, var4);
         if(var7 instanceof td && var5.nextInt(10) == 0) {
            ++var6;
            var1.f(var2, var3, var4, var6);
         }
      }

      super.a(var1, var2, var3, var4, var5);
   }

   public int a(int var1, int var2) {
      return var2 >= 3?this.bN + 2:(var2 > 0?this.bN + 1:this.bN);
   }

   public int d() {
      return 6;
   }

   public void a(xd var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.F) {
         int var8 = 1;
         if(var5 >= 3) {
            var8 = 2 + var1.r.nextInt(3);
            if(var7 > 0) {
               var8 += var1.r.nextInt(var7 + 1);
            }
         }

         for(int var9 = 0; var9 < var8; ++var9) {
            this.a(var1, var2, var3, var4, new aan(yr.br));
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }
}
