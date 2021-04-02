package mojang;

public class ke extends rc {

   private aaa a;
   private float b;
   private double c;
   private double d;
   private double e;


   public ke(aaa var1, float var2) {
      this.a = var1;
      this.b = var2;
      this.a(1);
   }

   public boolean a() {
      if(this.a.aP() == null) {
         return false;
      } else {
         bo var1 = wv.a(this.a, 5, 4);
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

   public void c() {
      this.a.aM().a(this.c, this.d, this.e, this.b);
   }

   public boolean b() {
      return !this.a.aM().e();
   }
}
