package mojang;

import java.util.List;
import java.util.Random;

public class ia extends he {

   public ia(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public static qg a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      qg var6 = new qg(var2, var3 - 5, var4, var2, var3 + 2, var4);
      switch(var5) {
      case 0:
         var6.d = var2 + 2;
         var6.f = var4 + 8;
         break;
      case 1:
         var6.a = var2 - 8;
         var6.f = var4 + 2;
         break;
      case 2:
         var6.d = var2 + 2;
         var6.c = var4 - 8;
         break;
      case 3:
         var6.d = var2 + 8;
         var6.f = var4 + 2;
      }

      return a(var0, var6) != null?null:var6;
   }

   public void a(he var1, List var2, Random var3) {
      int var4 = this.c();
      switch(this.h) {
      case 0:
         gp.a(var1, var2, var3, this.g.a, this.g.b, this.g.f + 1, 0, var4);
         break;
      case 1:
         gp.a(var1, var2, var3, this.g.a - 1, this.g.b, this.g.c, 1, var4);
         break;
      case 2:
         gp.a(var1, var2, var3, this.g.a, this.g.b, this.g.c - 1, 2, var4);
         break;
      case 3:
         gp.a(var1, var2, var3, this.g.d + 1, this.g.b, this.g.c, 3, var4);
      }

   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 5, 0, 2, 7, 1, 0, 0, false);
         this.a(var1, var3, 0, 0, 7, 2, 2, 8, 0, 0, false);

         for(int var4 = 0; var4 < 5; ++var4) {
            this.a(var1, var3, 0, 5 - var4 - (var4 < 4?1:0), 2 + var4, 2, 7 - var4, 2 + var4, 0, 0, false);
         }

         return true;
      }
   }
}
