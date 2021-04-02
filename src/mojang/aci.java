package mojang;

public class aci extends jt {

   protected aci(int var1, int var2) {
      super(var1, var2, mb.h);
      this.a("untouching");
   }

   public int a(int var1) {
      return 25;
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int a() {
      return 1;
   }

   public boolean a(jt var1) {
      return super.a(var1) && var1.w != r.w;
   }
}
