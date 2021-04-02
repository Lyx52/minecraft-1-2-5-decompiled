package mojang;

public class xk extends rn {

   wd a;
   Mob b;


   public xk(wd var1) {
      super(var1, 32.0F, false);
      this.a = var1;
      this.a(1);
   }

   public boolean a() {
      if(!this.a.G_()) {
         return false;
      } else {
         Mob var1 = this.a.ah();
         if(var1 == null) {
            return false;
         } else {
            this.b = var1.aP();
            return this.a(this.b, false);
         }
      }
   }

   public void c() {
      this.c.c(this.b);
      super.c();
   }
}
