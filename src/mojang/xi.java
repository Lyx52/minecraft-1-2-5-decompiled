package mojang;

public class xi extends yr {

   public xi(int var1) {
      super(var1);
   }

   public boolean e(aan var1) {
      return true;
   }

   public aan a(aan var1, World var2, Player var3) {
      if(!var3.aT.d) {
         --var1.a;
      }

      var2.a(var3, "random.bow", 0.5F, 0.4F / (d.nextFloat() * 0.4F + 0.8F));
      if(!var2.F) {
         var2.a((BaseEntity)(new ThrownExpBottle(var2, var3)));
      }

      return var1;
   }
}
