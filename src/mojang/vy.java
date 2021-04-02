package mojang;

public class vy extends jt {

   protected vy(int var1, int var2) {
      super(var1, var2, mb.h);
      this.a("digging");
   }

   public int a(int var1) {
      return 1 + 15 * (var1 - 1);
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int a() {
      return 5;
   }
}
