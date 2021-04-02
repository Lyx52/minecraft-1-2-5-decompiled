package mojang;

public class acu extends rc {

   private aaa a;
   private double b;
   private double c;
   private double d;
   private float e;


   public acu(aaa var1, float var2) {
      this.a = var1;
      this.e = var2;
      this.a(1);
   }

   public boolean a() {
      if(this.a.aR() >= 100) {
         return false;
      } else if(this.a.aO().nextInt(120) != 0) {
         return false;
      } else {
         bo var1 = wv.a(this.a, 10, 7);
         if(var1 == null) {
            return false;
         } else {
            this.b = var1.a;
            this.c = var1.b;
            this.d = var1.c;
            return true;
         }
      }
   }

   public boolean b() {
      return !this.a.aM().e();
   }

   public void c() {
      this.a.aM().a(this.b, this.c, this.d, this.e);
   }
}
