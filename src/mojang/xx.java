package mojang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class xx extends pg {

   private boolean c = false;


   public xx(World var1, Random var2, int var3, int var4, int var5) {
      ArrayList var7 = rz.a(var2, var5);
      g var8 = new g(var1.i(), 0, var2, (var3 << 4) + 2, (var4 << 4) + 2, var7, var5);
      this.a.add(var8);
      var8.a(var8, this.a, var2);
      ArrayList var9 = var8.f;
      ArrayList var10 = var8.e;

      int var11;
      while(!var9.isEmpty() || !var10.isEmpty()) {
         he var12;
         if(!var9.isEmpty()) {
            var11 = var2.nextInt(var9.size());
            var12 = (he)var9.remove(var11);
            var12.a((he)var8, (List)this.a, var2);
         } else {
            var11 = var2.nextInt(var10.size());
            var12 = (he)var10.remove(var11);
            var12.a((he)var8, (List)this.a, var2);
         }
      }

      this.c();
      var11 = 0;
      Iterator var14 = this.a.iterator();

      while(var14.hasNext()) {
         he var13 = (he)var14.next();
         if(!(var13 instanceof cf)) {
            ++var11;
         }
      }

      this.c = var11 > 2;
   }

   public boolean d() {
      return this.c;
   }
}
