package mojang;

public class ue extends is {

   private int i;


   public ue(acq var1) {
      super(var1);
   }

   public boolean a() {
      return !super.a()?false:!this.e.h(this.a.k, this.b, this.c, this.d);
   }

   public void c() {
      super.c();
      this.i = 240;
   }

   public boolean b() {
      double var1 = this.a.f((double)this.b, (double)this.c, (double)this.d);
      return this.i >= 0 && !this.e.h(this.a.k, this.b, this.c, this.d) && var1 < 4.0D;
   }

   public void e() {
      super.e();
      if(this.a.aO().nextInt(20) == 0) {
         this.a.k.g(1010, this.b, this.c, this.d, 0);
      }

      if(--this.i == 0 && this.a.k.q == 3) {
         this.a.k.g(this.b, this.c, this.d, 0);
         this.a.k.g(1012, this.b, this.c, this.d, 0);
         this.a.k.g(2001, this.b, this.c, this.d, this.e.bO);
      }

   }
}
