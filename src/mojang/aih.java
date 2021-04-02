package mojang;

import java.util.List;
import java.util.Random;

abstract class aih extends he {

   private int a;


   protected aih(int var1) {
      super(var1);
   }

   protected he a(g var1, List var2, Random var3, int var4, int var5) {
      switch(this.h) {
      case 0:
         return rz.a(var1, var2, var3, this.g.a - 1, this.g.b + var4, this.g.c + var5, 1, this.c());
      case 1:
         return rz.a(var1, var2, var3, this.g.a + var5, this.g.b + var4, this.g.c - 1, 2, this.c());
      case 2:
         return rz.a(var1, var2, var3, this.g.a - 1, this.g.b + var4, this.g.c + var5, 1, this.c());
      case 3:
         return rz.a(var1, var2, var3, this.g.a + var5, this.g.b + var4, this.g.c - 1, 2, this.c());
      default:
         return null;
      }
   }

   protected he b(g var1, List var2, Random var3, int var4, int var5) {
      switch(this.h) {
      case 0:
         return rz.a(var1, var2, var3, this.g.d + 1, this.g.b + var4, this.g.c + var5, 3, this.c());
      case 1:
         return rz.a(var1, var2, var3, this.g.a + var5, this.g.b + var4, this.g.f + 1, 0, this.c());
      case 2:
         return rz.a(var1, var2, var3, this.g.d + 1, this.g.b + var4, this.g.c + var5, 3, this.c());
      case 3:
         return rz.a(var1, var2, var3, this.g.a + var5, this.g.b + var4, this.g.f + 1, 0, this.c());
      default:
         return null;
      }
   }

   protected int b(xd var1, qg var2) {
      int var3 = 0;
      int var4 = 0;

      for(int var5 = this.g.c; var5 <= this.g.f; ++var5) {
         for(int var6 = this.g.a; var6 <= this.g.d; ++var6) {
            if(var2.b(var6, 64, var5)) {
               var3 += Math.max(var1.g(var6, var5), var1.t.h());
               ++var4;
            }
         }
      }

      if(var4 == 0) {
         return -1;
      } else {
         return var3 / var4;
      }
   }

   protected static boolean a(qg var0) {
      return var0 != null && var0.b > 10;
   }

   protected void a(xd var1, qg var2, int var3, int var4, int var5, int var6) {
      if(this.a < var6) {
         for(int var7 = this.a; var7 < var6; ++var7) {
            int var8 = this.a(var3 + var7, var5);
            int var9 = this.b(var4);
            int var10 = this.b(var3 + var7, var5);
            if(!var2.b(var8, var9, var10)) {
               break;
            }

            ++this.a;
            ed var11 = new ed(var1, this.a(var7));
            var11.c((double)var8 + 0.5D, (double)var9, (double)var10 + 0.5D, 0.0F, 0.0F);
            var1.a((nn)var11);
         }

      }
   }

   protected int a(int var1) {
      return 0;
   }
}
