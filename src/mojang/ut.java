package mojang;

public class ut extends rc {

   World a;
   Mob b;
   Mob c;
   int d = 0;


   public ut(Mob var1) {
      this.b = var1;
      this.a = var1.k;
      this.a(3);
   }

   public boolean a() {
      Mob var1 = this.b.aT();
      if(var1 == null) {
         return false;
      } else {
         this.c = var1;
         return true;
      }
   }

   public boolean b() {
      return !this.c.M()?false:(this.b.f(this.c) > 225.0D?false:!this.b.aM().e() || this.a());
   }

   public void d() {
      this.c = null;
      this.b.aM().f();
   }

   public void e() {
      this.b.aJ().a(this.c, 30.0F, 30.0F);
      double var1 = (double)(this.b.I * 2.0F * this.b.I * 2.0F);
      double var3 = this.b.f(this.c.o, this.c.y.b, this.c.q);
      float var5 = 0.23F;
      if(var3 > var1 && var3 < 16.0D) {
         var5 = 0.4F;
      } else if(var3 < 225.0D) {
         var5 = 0.18F;
      }

      this.b.aM().a(this.c, var5);
      this.d = Math.max(this.d - 1, 0);
      if(var3 <= var1) {
         if(this.d <= 0) {
            this.d = 20;
            this.b.c((BaseEntity)this.c);
         }
      }
   }
}
