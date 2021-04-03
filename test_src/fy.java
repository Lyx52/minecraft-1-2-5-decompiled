
public class fy extends rc {

   private wd a;
   private boolean b = false;


   public fy(wd var1) {
      this.a = var1;
      this.a(5);
   }

   public boolean a() {
      if(!this.a.G_()) {
         return false;
      } else if(this.a.H()) {
         return false;
      } else if(!this.a.z) {
         return false;
      } else {
         acq var1 = this.a.ah();
         return var1 == null?true:(this.a.f(var1) < 144.0D && var1.aP() != null?false:this.b);
      }
   }

   public void c() {
      this.a.aM().f();
      this.a.f(true);
   }

   public void d() {
      this.a.f(false);
   }

   public void a(boolean var1) {
      this.b = var1;
   }
}
