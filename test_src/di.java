
public class di extends jt {

   protected di(int var1, int var2) {
      super(var1, var2, mb.h);
      this.a("durability");
   }

   public int a(int var1) {
      return 5 + (var1 - 1) * 10;
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int a() {
      return 3;
   }
}
