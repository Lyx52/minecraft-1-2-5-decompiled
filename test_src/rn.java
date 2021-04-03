
public abstract class rn extends rc {

   protected acq c;
   protected float d;
   protected boolean e;
   private boolean a;
   private int b;
   private int f;
   private int g;


   public rn(acq var1, float var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public rn(acq var1, float var2, boolean var3, boolean var4) {
      this.b = 0;
      this.f = 0;
      this.g = 0;
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.a = var4;
   }

   public boolean b() {
      acq var1 = this.c.aT();
      if(var1 == null) {
         return false;
      } else if(!var1.M()) {
         return false;
      } else if(this.c.f(var1) > (double)(this.d * this.d)) {
         return false;
      } else {
         if(this.e) {
            if(!this.c.aN().a(var1)) {
               if(++this.g > 60) {
                  return false;
               }
            } else {
               this.g = 0;
            }
         }

         return true;
      }
   }

   public void c() {
      this.b = 0;
      this.f = 0;
      this.g = 0;
   }

   public void d() {
      this.c.c((acq)null);
   }

   protected boolean a(acq var1, boolean var2) {
      if(var1 == null) {
         return false;
      } else if(var1 == this.c) {
         return false;
      } else if(!var1.M()) {
         return false;
      } else if(var1.y.e > this.c.y.b && var1.y.b < this.c.y.e) {
         if(!this.c.a(var1.getClass())) {
            return false;
         } else {
            if(this.c instanceof wd && ((wd)this.c).G_()) {
               if(var1 instanceof wd && ((wd)var1).G_()) {
                  return false;
               }

               if(var1 == ((wd)this.c).ah()) {
                  return false;
               }
            } else if(var1 instanceof yw && !var2 && ((yw)var1).aT.a) {
               return false;
            }

            if(!this.c.f(gk.c(var1.o), gk.c(var1.p), gk.c(var1.q))) {
               return false;
            } else if(this.e && !this.c.aN().a(var1)) {
               return false;
            } else {
               if(this.a) {
                  if(--this.f <= 0) {
                     this.b = 0;
                  }

                  if(this.b == 0) {
                     this.b = this.a(var1)?1:2;
                  }

                  if(this.b == 2) {
                     return false;
                  }
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   private boolean a(acq var1) {
      this.f = 10 + this.c.aO().nextInt(5);
      vu var2 = this.c.aM().a(var1);
      if(var2 == null) {
         return false;
      } else {
         e var3 = var2.c();
         if(var3 == null) {
            return false;
         } else {
            int var4 = var3.a - gk.c(var1.o);
            int var5 = var3.c - gk.c(var1.q);
            return (double)(var4 * var4 + var5 * var5) <= 2.25D;
         }
      }
   }
}
