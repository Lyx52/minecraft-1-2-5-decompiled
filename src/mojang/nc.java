package mojang;

public class nc extends yr {

   public nc(int var1) {
      super(var1);
      this.bR = 1;
   }

   public void a(aan var1, Mob var2) {
      if(var2 instanceof Pig) {
         Pig var3 = (Pig)var2;
         if(!var3.aa() && !var3.bi()) {
            var3.a(true);
            --var1.a;
         }
      }

   }

   public boolean a(aan var1, Mob var2, Mob var3) {
      this.a(var1, var2);
      return true;
   }
}
