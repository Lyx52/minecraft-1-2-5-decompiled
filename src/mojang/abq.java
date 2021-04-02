package mojang;

import java.util.List;

final class abq extends ba {

   public boolean a(fd var1) {
      return ts.b == var1.a();
   }

   @Override
   public boolean c(Object var1) {
      System.out.println("UNIMPLEMENTED METHOD ABQ.JAVA");
      return false;
   }

   public String a() {
      return "A short form array";
   }
   @Override
   public List b(Object var1) {
      return ((fd)var1).d();
   }

   public String toString() {
      return "an array";
   }
}
