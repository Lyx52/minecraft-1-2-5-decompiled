package mojang;

import java.util.Random;

public class pt extends pb {

   protected pt(int var1, int var2) {
      super(var1, var2, acn.p);
      this.a(true);
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int d() {
      return 2;
   }

   private boolean h(xd var1, int var2, int var3, int var4) {
      if(var1.b(var2, var3, var4, true)) {
         return true;
      } else {
         int var5 = var1.a(var2, var3, var4);
         if(var5 != aZ.bO && var5 != bB.bO && var5 != M.bO) {
            if(m[var5] != null && m[var5] instanceof nr) {
               int var6 = var1.e(var2, var3, var4);
               if((4 & var6) != 0) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      }
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return var1.b(var2 - 1, var3, var4, true)?true:(var1.b(var2 + 1, var3, var4, true)?true:(var1.b(var2, var3, var4 - 1, true)?true:(var1.b(var2, var3, var4 + 1, true)?true:this.h(var1, var2, var3 - 1, var4))));
   }

   public void c(xd var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      if(var5 == 1 && this.h(var1, var2, var3 - 1, var4)) {
         var6 = 5;
      }

      if(var5 == 2 && var1.b(var2, var3, var4 + 1, true)) {
         var6 = 4;
      }

      if(var5 == 3 && var1.b(var2, var3, var4 - 1, true)) {
         var6 = 3;
      }

      if(var5 == 4 && var1.b(var2 + 1, var3, var4, true)) {
         var6 = 2;
      }

      if(var5 == 5 && var1.b(var2 - 1, var3, var4, true)) {
         var6 = 1;
      }

      var1.f(var2, var3, var4, var6);
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.e(var2, var3, var4) == 0) {
         this.a(var1, var2, var3, var4);
      }

   }

   public void a(xd var1, int var2, int var3, int var4) {
      if(var1.b(var2 - 1, var3, var4, true)) {
         var1.f(var2, var3, var4, 1);
      } else if(var1.b(var2 + 1, var3, var4, true)) {
         var1.f(var2, var3, var4, 2);
      } else if(var1.b(var2, var3, var4 - 1, true)) {
         var1.f(var2, var3, var4, 3);
      } else if(var1.b(var2, var3, var4 + 1, true)) {
         var1.f(var2, var3, var4, 4);
      } else if(this.h(var1, var2, var3 - 1, var4)) {
         var1.f(var2, var3, var4, 5);
      }

      this.i(var1, var2, var3, var4);
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      if(this.i(var1, var2, var3, var4)) {
         int var6 = var1.e(var2, var3, var4);
         boolean var7 = false;
         if(!var1.b(var2 - 1, var3, var4, true) && var6 == 1) {
            var7 = true;
         }

         if(!var1.b(var2 + 1, var3, var4, true) && var6 == 2) {
            var7 = true;
         }

         if(!var1.b(var2, var3, var4 - 1, true) && var6 == 3) {
            var7 = true;
         }

         if(!var1.b(var2, var3, var4 + 1, true) && var6 == 4) {
            var7 = true;
         }

         if(!this.h(var1, var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if(var7) {
            this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
            var1.g(var2, var3, var4, 0);
         }
      }

   }

   private boolean i(xd var1, int var2, int var3, int var4) {
      if(!this.e(var1, var2, var3, var4)) {
         if(var1.a(var2, var3, var4) == this.bO) {
            this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
            var1.g(var2, var3, var4, 0);
         }

         return false;
      } else {
         return true;
      }
   }

   public pl a(xd var1, int var2, int var3, int var4, bo var5, bo var6) {
      int var7 = var1.e(var2, var3, var4) & 7;
      float var8 = 0.15F;
      if(var7 == 1) {
         this.a(0.0F, 0.2F, 0.5F - var8, var8 * 2.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 2) {
         this.a(1.0F - var8 * 2.0F, 0.2F, 0.5F - var8, 1.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 3) {
         this.a(0.5F - var8, 0.2F, 0.0F, 0.5F + var8, 0.8F, var8 * 2.0F);
      } else if(var7 == 4) {
         this.a(0.5F - var8, 0.2F, 1.0F - var8 * 2.0F, 0.5F + var8, 0.8F, 1.0F);
      } else {
         var8 = 0.1F;
         this.a(0.5F - var8, 0.0F, 0.5F - var8, 0.5F + var8, 0.6F, 0.5F + var8);
      }

      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void b(xd var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      double var7 = (double)((float)var2 + 0.5F);
      double var9 = (double)((float)var3 + 0.7F);
      double var11 = (double)((float)var4 + 0.5F);
      double var13 = 0.2199999988079071D;
      double var15 = 0.27000001072883606D;
      if(var6 == 1) {
         var1.a("smoke", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      } else if(var6 == 2) {
         var1.a("smoke", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      } else if(var6 == 3) {
         var1.a("smoke", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
      } else if(var6 == 4) {
         var1.a("smoke", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
      } else {
         var1.a("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
         var1.a("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
      }

   }
}
