import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class wn implements aca {

   private final List a = new LinkedList();


   public wn a(aca var1) {
      this.a.add(var1);
      return this;
   }

   public ly a() {
      LinkedList var1 = new LinkedList();
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         aca var3 = (aca)var2.next();
         var1.add(var3.b());
      }

      return kq.a((Iterable)var1);
   }
}
