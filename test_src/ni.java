
public class ni extends rc {

   private wd d;
   private acq e;
   xd a;
   private float f;
   private rh g;
   private int h;
   float b;
   float c;
   private boolean i;


   public ni(wd var1, float var2, float var3, float var4) {
      this.d = var1;
      this.a = var1.k;
      this.f = var2;
      this.g = var1.aM();
      this.c = var3;
      this.b = var4;
      this.a(3);
   }

   public boolean a() {
      acq var1 = this.d.ah();
      if(var1 == null) {
         return false;
      } else if(this.d.af()) {
         return false;
      } else if(this.d.f(var1) < (double)(this.c * this.c)) {
         return false;
      } else {
         this.e = var1;
         return true;
      }
   }

   public boolean b() {
      return !this.g.e() && this.d.f(this.e) > (double)(this.b * this.b) && !this.d.af();
   }

   public void c() {
      this.h = 0;
      this.i = this.d.aM().a();
      this.d.aM().a(false);
   }

   public void d() {
      this.e = null;
      this.g.f();
      this.d.aM().a(this.i);
   }

   public void e() {
      this.d.aJ().a(this.e, 10.0F, (float)this.d.ak());
      if(!this.d.af()) {
         if(--this.h <= 0) {
            this.h = 10;
            if(!this.g.a(this.e, this.f)) {
               if(this.d.f(this.e) >= 144.0D) {
                  int var1 = gk.c(this.e.o) - 2;
                  int var2 = gk.c(this.e.q) - 2;
                  int var3 = gk.c(this.e.y.b);

                  for(int var4 = 0; var4 <= 4; ++var4) {
                     for(int var5 = 0; var5 <= 4; ++var5) {
                        if((var4 < 1 || var5 < 1 || var4 > 3 || var5 > 3) && this.a.h(var1 + var4, var3 - 1, var2 + var5) && !this.a.h(var1 + var4, var3, var2 + var5) && !this.a.h(var1 + var4, var3 + 1, var2 + var5)) {
                           this.d.c((double)((float)(var1 + var4) + 0.5F), (double)var3, (double)((float)(var2 + var5) + 0.5F), this.d.u, this.d.v);
                           this.g.f();
                           return;
                        }
                     }
                  }

               }
            }
         }
      }
   }
}
