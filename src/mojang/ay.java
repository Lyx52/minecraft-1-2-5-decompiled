package mojang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ay extends pg {

   public ay(xd var1, Random var2, int var3, int var4) {
      aga var5 = new aga(var2, (var3 << 4) + 2, (var4 << 4) + 2);
      this.a.add(var5);
      var5.a(var5, this.a, var2);
      ArrayList var6 = var5.d;

      while(!var6.isEmpty()) {
         int var7 = var2.nextInt(var6.size());
         he var8 = (he)var6.remove(var7);
         var8.a((he)var5, (List)this.a, var2);
      }

      this.c();
      this.a(var1, var2, 48, 70);
   }
}
