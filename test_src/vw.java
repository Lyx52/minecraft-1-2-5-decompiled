
public class vw extends rc {

   private aaa a;
   private double b;
   private double c;
   private double d;
   private float e;


   public vw(aaa var1, float var2) {
      this.a = var1;
      this.e = var2;
      this.a(1);
   }

   public boolean a() {
      if(this.a.aU()) {
         return false;
      } else {
         uh var1 = this.a.aV();
         bo var2 = wv.a(this.a, 16, 7, bo.b((double)var1.a, (double)var1.b, (double)var1.c));
         if(var2 == null) {
            return false;
         } else {
            this.b = var2.a;
            this.c = var2.b;
            this.d = var2.c;
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
