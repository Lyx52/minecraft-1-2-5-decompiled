package mojang;

public class hd extends rn {

   VillagerGolem a;
   Mob b;


   public hd(VillagerGolem var1) {
      super(var1, 16.0F, false, true);
      this.a = var1;
      this.a(1);
   }

   public boolean a() {
      kd var1 = this.a.aa();
      if(var1 == null) {
         return false;
      } else {
         this.b = var1.b(this.a);
         return this.a(this.b, false);
      }
   }

   public void c() {
      this.a.c(this.b);
      super.c();
   }
}
