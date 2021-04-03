import java.util.HashMap;
import java.util.Iterator;

class la extends HashMap {

   // $FF: synthetic field
   final nv a;


   la(nv var1) {
      this.a = var1;
      Iterator var2 = nv.a(this.a).iterator();

      while(var2.hasNext()) {
         afl var3 = (afl)var2.next();
         this.put(var3.b(), var3.c());
      }

   }
}
