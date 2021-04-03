package mojang;

import java.util.List;
import java.util.Random;

public class aie extends cf {

   private int a;


   public aie(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
      this.a = Math.max(var3.b(), var3.d());
   }

   public void a(he var1, List var2, Random var3) {
      boolean var4 = false;

      int var5;
      he var6;
      for(var5 = var3.nextInt(5); var5 < this.a - 8; var5 += 2 + var3.nextInt(5)) {
         var6 = this.a((g)var1, var2, var3, 0, var5);
         if(var6 != null) {
            var5 += Math.max(var6.g.b(), var6.g.d());
            var4 = true;
         }
      }

      for(var5 = var3.nextInt(5); var5 < this.a - 8; var5 += 2 + var3.nextInt(5)) {
         var6 = this.b((g)var1, var2, var3, 0, var5);
         if(var6 != null) {
            var5 += Math.max(var6.g.b(), var6.g.d());
            var4 = true;
         }
      }

      if(var4 && var3.nextInt(3) > 0) {
         switch(this.h) {
         case 0:
            rz.b((g)var1, var2, var3, this.g.a - 1, this.g.b, this.g.f - 2, 1, this.c());
            break;
         case 1:
            rz.b((g)var1, var2, var3, this.g.a, this.g.b, this.g.c - 1, 2, this.c());
            break;
         case 2:
            rz.b((g)var1, var2, var3, this.g.a - 1, this.g.b, this.g.c, 1, this.c());
            break;
         case 3:
            rz.b((g)var1, var2, var3, this.g.d - 2, this.g.b, this.g.c - 1, 2, this.c());
         }
      }

      if(var4 && var3.nextInt(3) > 0) {
         switch(this.h) {
         case 0:
            rz.b((g)var1, var2, var3, this.g.d + 1, this.g.b, this.g.f - 2, 3, this.c());
            break;
         case 1:
            rz.b((g)var1, var2, var3, this.g.a, this.g.b, this.g.f + 1, 0, this.c());
            break;
         case 2:
            rz.b((g)var1, var2, var3, this.g.d + 1, this.g.b, this.g.c, 3, this.c());
            break;
         case 3:
            rz.b((g)var1, var2, var3, this.g.d - 2, this.g.b, this.g.f + 1, 0, this.c());
         }
      }

   }

   public static qg a(g var0, List var1, Random var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 7 * Utils.randInt(var2, 3, 5); var7 >= 7; var7 -= 7) {
         qg var8 = qg.a(var3, var4, var5, 0, 0, 0, 3, 3, var7, var6);
         if(he.a(var1, var8) == null) {
            return var8;
         }
      }

      return null;
   }

   public boolean a(World var1, Random var2, qg var3) {
      for(int var4 = this.g.a; var4 <= this.g.d; ++var4) {
         for(int var5 = this.g.c; var5 <= this.g.f; ++var5) {
            if(var3.b(var4, 64, var5)) {
               int var6 = var1.g(var4, var5) - 1;
               var1.d(var4, var6, var5, pb.F.bO);
            }
         }
      }

      return true;
   }
}
