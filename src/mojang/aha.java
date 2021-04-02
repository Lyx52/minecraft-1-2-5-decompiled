package mojang;

public class aha extends jt {

   public aha(int var1, int var2) {
      super(var1, var2, mb.i);
      this.a("arrowDamage");
   }

   public int a(int var1) {
      return 1 + (var1 - 1) * 10;
   }

   public int b(int var1) {
      return this.a(var1) + 15;
   }

   public int a() {
      return 5;
   }
}
