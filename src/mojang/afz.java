package mojang;

import java.util.Map;

final class afz extends ba {

   // $FF: synthetic field
   final lu a;


   afz(lu var1) {
      this.a = var1;
   }

   public boolean a(Map var1) {
      return var1.containsKey(this.a);
   }

   @Override
   public boolean c(Object var1) {
      System.out.println("UNIMPLEMENTED METHOD AFZ.JAVA");
      return false;
   }

   public String a() {
      return "\"" + this.a.b() + "\"";
   }

   public fd b(Object var1) {
      return (fd)((Map)var1).get(this.a);
   }

   public String toString() {
      return "a field called [\"" + this.a.b() + "\"]";
   }
}
