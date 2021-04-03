
final class afl {

   private aca a;
   private aca b;


   static afl a() {
      return new afl();
   }

   afl a(aca var1) {
      this.a = var1;
      return this;
   }

   afl b(aca var1) {
      this.b = var1;
      return this;
   }

   lu b() {
      return (lu)this.a.b();
   }

   fd c() {
      return this.b.b();
   }
}
