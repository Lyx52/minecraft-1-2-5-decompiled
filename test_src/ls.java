
public class ls extends jt {

   protected ls(int var1, int var2) {
      super(var1, var2, mb.g);
      this.a("knockback");
   }

   public int a(int var1) {
      return 5 + 20 * (var1 - 1);
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int a() {
      return 2;
   }
}
