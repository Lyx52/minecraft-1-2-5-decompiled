package mojang;

import java.util.ArrayList;
import java.util.Iterator;

final class v extends ArrayList {

   // $FF: synthetic field
   final Iterable a;


   v(Iterable var1) {
      this.a = var1;
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         fd var3 = (fd)var2.next();
         this.add(var3);
      }

   }
}
