package mojang;

public abstract class is extends rc {

   protected acq a;
   protected int b;
   protected int c;
   protected int d;
   protected acb e;
   boolean f;
   float g;
   float h;


   public is(acq var1) {
      this.a = var1;
   }

   public boolean a() {
      if(!this.a.A) {
         return false;
      } else {
         rh var1 = this.a.aM();
         vu var2 = var1.c();
         if(var2 != null && !var2.b() && var1.b()) {
            for(int var3 = 0; var3 < Math.min(var2.e() + 2, var2.d()); ++var3) {
               e var4 = var2.a(var3);
               this.b = var4.a;
               this.c = var4.b + 1;
               this.d = var4.c;
               if(this.a.f((double)this.b, this.a.p, (double)this.d) <= 2.25D) {
                  this.e = this.a(this.b, this.c, this.d);
                  if(this.e != null) {
                     return true;
                  }
               }
            }

            this.b = gk.c(this.a.o);
            this.c = gk.c(this.a.p + 1.0D);
            this.d = gk.c(this.a.q);
            this.e = this.a(this.b, this.c, this.d);
            return this.e != null;
         } else {
            return false;
         }
      }
   }

   public boolean b() {
      return !this.f;
   }

   public void c() {
      this.f = false;
      this.g = (float)((double)((float)this.b + 0.5F) - this.a.o);
      this.h = (float)((double)((float)this.d + 0.5F) - this.a.q);
   }

   public void e() {
      float var1 = (float)((double)((float)this.b + 0.5F) - this.a.o);
      float var2 = (float)((double)((float)this.d + 0.5F) - this.a.q);
      float var3 = this.g * var1 + this.h * var2;
      if(var3 < 0.0F) {
         this.f = true;
      }

   }

   private acb a(int var1, int var2, int var3) {
      int var4 = this.a.k.a(var1, var2, var3);
      if(var4 != pb.aE.bO) {
         return null;
      } else {
         acb var5 = (acb)pb.m[var4];
         return var5;
      }
   }
}
