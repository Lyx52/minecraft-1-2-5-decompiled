package mojang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ajo extends pg {

   public ajo(World var1, Random var2, int var3, int var4) {
      abb.a();
      s var5 = new s(0, var2, (var3 << 4) + 2, (var4 << 4) + 2);
      this.a.add(var5);
      var5.a(var5, this.a, var2);
      ArrayList var6 = var5.c;

      while(!var6.isEmpty()) {
         int var7 = var2.nextInt(var6.size());
         he var8 = (he)var6.remove(var7);
         var8.a((he)var5, (List)this.a, var2);
      }

      this.c();
      this.a(var1, var2, 10);
   }
}
