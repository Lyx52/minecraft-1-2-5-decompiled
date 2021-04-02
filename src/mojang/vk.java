package mojang;

public class vk extends yr {

   public vk(int var1) {
      super(var1);
      this.g(64);
      this.f(1);
   }

   public boolean a() {
      return true;
   }

   public boolean A_() {
      return true;
   }

   public aan a(aan var1, xd var2, yw var3) {
      if(var3.aZ != null) {
         int var4 = var3.aZ.n();
         var1.a(var4, var3);
         var3.ax();
      } else {
         var2.a(var3, "random.bow", 0.5F, 0.4F / (d.nextFloat() * 0.4F + 0.8F));
         if(!var2.F) {
            var2.a((nn)(new act(var2, var3)));
         }

         var3.ax();
      }

      return var1;
   }
}
