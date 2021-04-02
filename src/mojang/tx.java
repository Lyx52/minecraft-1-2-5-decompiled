package mojang;

public class tx extends rc {

   private aaa a;
   private adm b;


   public tx(aaa var1) {
      this.a = var1;
   }

   public boolean a() {
      if(this.a.k.m()) {
         return false;
      } else {
         kd var1 = this.a.k.A.a(Utils.c(this.a.o), Utils.c(this.a.p), Utils.c(this.a.q), 16);
         if(var1 == null) {
            return false;
         } else {
            this.b = var1.b(Utils.c(this.a.o), Utils.c(this.a.p), Utils.c(this.a.q));
            return this.b == null?false:(double)this.b.b(Utils.c(this.a.o), Utils.c(this.a.p), Utils.c(this.a.q)) < 2.25D;
         }
      }
   }

   public boolean b() {
      return this.a.k.m()?false:!this.b.g && this.b.a(Utils.c(this.a.o), Utils.c(this.a.q));
   }

   public void c() {
      this.a.aM().b(false);
      this.a.aM().c(false);
   }

   public void d() {
      this.a.aM().b(true);
      this.a.aM().c(true);
      this.b = null;
   }

   public void e() {
      this.b.e();
   }
}
