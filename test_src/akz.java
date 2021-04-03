
public class akz extends rc {

   private aaa a;
   private float b;
   private double c;
   private double d;
   private double e;
   private double f;
   private double g;
   private yw h;
   private int i = 0;
   private boolean j;
   private int k;
   private boolean l;
   private boolean m;


   public akz(aaa var1, float var2, int var3, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.k = var3;
      this.l = var4;
      this.a(3);
   }

   public boolean a() {
      if(this.i > 0) {
         --this.i;
         return false;
      } else {
         this.h = this.a.k.a(this.a, 10.0D);
         if(this.h == null) {
            return false;
         } else {
            aan var1 = this.h.av();
            return var1 == null?false:var1.c == this.k;
         }
      }
   }

   public boolean b() {
      if(this.l) {
         if(this.a.f(this.h) < 36.0D) {
            if(this.h.f(this.c, this.d, this.e) > 0.010000000000000002D) {
               return false;
            }

            if(Math.abs((double)this.h.v - this.f) > 5.0D || Math.abs((double)this.h.u - this.g) > 5.0D) {
               return false;
            }
         } else {
            this.c = this.h.o;
            this.d = this.h.p;
            this.e = this.h.q;
         }

         this.f = (double)this.h.v;
         this.g = (double)this.h.u;
      }

      return this.a();
   }

   public void c() {
      this.c = this.h.o;
      this.d = this.h.p;
      this.e = this.h.q;
      this.j = true;
      this.m = this.a.aM().a();
      this.a.aM().a(false);
   }

   public void d() {
      this.h = null;
      this.a.aM().f();
      this.i = 100;
      this.j = false;
      this.a.aM().a(this.m);
   }

   public void e() {
      this.a.aJ().a(this.h, 30.0F, (float)this.a.ak());
      if(this.a.f(this.h) < 6.25D) {
         this.a.aM().f();
      } else {
         this.a.aM().a((acq)this.h, this.b);
      }

   }

   public boolean h() {
      return this.j;
   }
}
