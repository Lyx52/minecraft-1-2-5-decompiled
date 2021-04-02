package mojang;

import java.util.Comparator;

public class iw implements Comparator {

   private Mob a;


   public iw(Mob var1) {
      this.a = var1;
   }

   public int a(ct var1, ct var2) {
      if(var1.l && !var2.l) {
         return 1;
      } else if(var2.l && !var1.l) {
         return -1;
      } else {
         double var3 = (double)var1.a((BaseEntity)this.a);
         double var5 = (double)var2.a((BaseEntity)this.a);
         return var3 < var5?1:(var3 > var5?-1:(var1.s < var2.s?1:-1));
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.a((ct) var1, (ct) var2);
   }
}
