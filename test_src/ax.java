
public class ax extends rc {

   xd a;
   acq b;
   acq c;
   int d;
   float e;
   boolean f;
   vu g;
   Class h;
   private int i;


   public ax(acq var1, Class var2, float var3, boolean var4) {
      this(var1, var3, var4);
      this.h = var2;
   }

   public ax(acq var1, float var2, boolean var3) {
      this.d = 0;
      this.b = var1;
      this.a = var1.k;
      this.e = var2;
      this.f = var3;
      this.a(3);
   }

   public boolean a() {
      acq var1 = this.b.aT();
      if(var1 == null) {
         return false;
      } else if(this.h != null && !this.h.isAssignableFrom(var1.getClass())) {
         return false;
      } else {
         this.c = var1;
         this.g = this.b.aM().a(this.c);
         return this.g != null;
      }
   }

   public boolean b() {
      acq var1 = this.b.aT();
      return var1 == null?false:(!this.c.M()?false:(!this.f?!this.b.aM().e():this.b.f(gk.c(this.c.o), gk.c(this.c.p), gk.c(this.c.q))));
   }

   public void c() {
      this.b.aM().a(this.g, this.e);
      this.i = 0;
   }

   public void d() {
      this.c = null;
      this.b.aM().f();
   }

   public void e() {
      this.b.aJ().a(this.c, 30.0F, 30.0F);
      if((this.f || this.b.aN().a(this.c)) && --this.i <= 0) {
         this.i = 4 + this.b.aO().nextInt(7);
         this.b.aM().a(this.c, this.e);
      }

      this.d = Math.max(this.d - 1, 0);
      double var1 = (double)(this.b.I * 2.0F * this.b.I * 2.0F);
      if(this.b.f(this.c.o, this.c.y.b, this.c.q) <= var1) {
         if(this.d <= 0) {
            this.d = 20;
            this.b.c((nn)this.c);
         }
      }
   }
}
