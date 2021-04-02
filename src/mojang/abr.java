package mojang;

public class abr extends yr {

   public abr(int var1) {
      super(var1);
      this.bR = 16;
   }

   public aan a(aan var1, World var2, Player var3) {
      if(var3.aT.d) {
         return var1;
      } else if(var3.j != null) {
         return var1;
      } else {
         --var1.a;
         var2.a(var3, "random.bow", 0.5F, 0.4F / (d.nextFloat() * 0.4F + 0.8F));
         if(!var2.F) {
            var2.a((BaseEntity)(new ThrownEnderpearl(var2, var3)));
         }

         return var1;
      }
   }
}
