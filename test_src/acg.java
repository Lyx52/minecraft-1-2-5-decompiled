
public class acg extends jt {

   protected acg(int var1, int var2) {
      super(var1, var2, mb.g);
      this.a("fire");
   }

   public int a(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int a() {
      return 2;
   }
}
