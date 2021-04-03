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

   public String a() {
      return "\"" + this.a.b() + "\"";
   }

   public fd b(Map var1) {
      return (fd)var1.get(this.a);
   }

   public String toString() {
      return "a field called [\"" + this.a.b() + "\"]";
   }
}
