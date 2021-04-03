
public class wi extends rc {

   private yo a;
   private yw b;
   private xd c;
   private float d;
   private int e;


   public wi(yo var1, float var2) {
      this.a = var1;
      this.c = var1.k;
      this.d = var2;
      this.a(2);
   }

   public boolean a() {
      this.b = this.c.a(this.a, (double)this.d);
      return this.b == null?false:this.a(this.b);
   }

   public boolean b() {
      return !this.b.M()?false:(this.a.f(this.b) > (double)(this.d * this.d)?false:this.e > 0 && this.a(this.b));
   }

   public void c() {
      this.a.h(true);
      this.e = 40 + this.a.aO().nextInt(40);
   }

   public void d() {
      this.a.h(false);
      this.b = null;
   }

   public void e() {
      this.a.aJ().a(this.b.o, this.b.p + (double)this.b.I(), this.b.q, 10.0F, (float)this.a.ak());
      --this.e;
   }

   private boolean a(yw var1) {
      aan var2 = var1.ap.b();
      return var2 == null?false:(!this.a.G_() && var2.c == yr.aX.bQ?true:this.a.a(var2));
   }
}
