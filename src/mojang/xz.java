package mojang;

public class xz extends rc {

   private aaa a;
   private Mob b;
   private double c;
   private double d;
   private double e;
   private float f;
   private float g;


   public xz(aaa var1, float var2, float var3) {
      this.a = var1;
      this.f = var2;
      this.g = var3;
      this.a(1);
   }

   public boolean a() {
      this.b = this.a.aT();
      if(this.b == null) {
         return false;
      } else if(this.b.f(this.a) > (double)(this.g * this.g)) {
         return false;
      } else {
         bo var1 = wv.a(this.a, 16, 7, bo.b(this.b.o, this.b.p, this.b.q));
         if(var1 == null) {
            return false;
         } else {
            this.c = var1.a;
            this.d = var1.b;
            this.e = var1.c;
            return true;
         }
      }
   }

   public boolean b() {
      return !this.a.aM().e() && this.b.M() && this.b.f(this.a) < (double)(this.g * this.g);
   }

   public void d() {
      this.b = null;
   }

   public void c() {
      this.a.aM().a(this.c, this.d, this.e, this.f);
   }
}
