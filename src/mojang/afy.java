package mojang;

import java.util.List;

final class afy extends ba {

   // $FF: synthetic field
   final int a;


   afy(int var1) {
      this.a = var1;
   }

   public boolean a(List var1) {
      return var1.size() > this.a;
   }

   @Override
   public boolean c(Object var1) {
      System.out.println("UNIMPLEMENTED METHOD AFY.JAVA");
      return false;
   }

   public String a() {
      return Integer.toString(this.a);
   }

   public fd b(Object var1) {
      return (fd) ((List) var1).get(this.a);
   }

   public String toString() {
      return "an element at index [" + this.a + "]";
   }
}
