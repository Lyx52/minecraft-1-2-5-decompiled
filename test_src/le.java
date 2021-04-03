
public class le extends jt {

   protected le(int var1, int var2, mb var3) {
      super(var1, var2, var3);
      this.a("lootBonus");
      if(var3 == mb.h) {
         this.a("lootBonusDigger");
      }

   }

   public int a(int var1) {
      return 20 + (var1 - 1) * 12;
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int a() {
      return 3;
   }

   public boolean a(jt var1) {
      return super.a(var1) && var1.w != p.w;
   }
}
