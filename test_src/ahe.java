
public class ahe extends rc {

   yd a;
   acq b;


   public ahe(yd var1) {
      this.a = var1;
      this.a(1);
   }

   public boolean a() {
      acq var1 = this.a.aT();
      return this.a.ag() > 0 || var1 != null && this.a.f(var1) < 9.0D;
   }

   public void c() {
      this.a.aM().f();
      this.b = this.a.aT();
   }

   public void d() {
      this.b = null;
   }

   public void e() {
      if(this.b == null) {
         this.a.d(-1);
      } else if(this.a.f(this.b) > 49.0D) {
         this.a.d(-1);
      } else if(!this.a.aN().a(this.b)) {
         this.a.d(-1);
      } else {
         this.a.d(1);
      }
   }
}
