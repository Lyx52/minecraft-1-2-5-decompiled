package mojang;

public class bp extends rc {

   private aaa a;
   private adm b;
   private int c = -1;
   private int d = -1;


   public bp(aaa var1) {
      this.a = var1;
      this.a(1);
   }

   public boolean a() {
      if((!this.a.k.m() || this.a.k.G()) && !this.a.k.t.e) {
         if(this.a.aO().nextInt(50) != 0) {
            return false;
         } else if(this.c != -1 && this.a.f((double)this.c, this.a.p, (double)this.d) < 4.0D) {
            return false;
         } else {
            kd var1 = this.a.k.A.a(gk.c(this.a.o), gk.c(this.a.p), gk.c(this.a.q), 14);
            if(var1 == null) {
               return false;
            } else {
               this.b = var1.c(gk.c(this.a.o), gk.c(this.a.p), gk.c(this.a.q));
               return this.b != null;
            }
         }
      } else {
         return false;
      }
   }

   public boolean b() {
      return !this.a.aM().e();
   }

   public void c() {
      this.c = -1;
      if(this.a.f((double)this.b.a(), (double)this.b.b, (double)this.b.c()) > 256.0D) {
         bo var1 = wv.a(this.a, 14, 3, bo.b((double)this.b.a() + 0.5D, (double)this.b.b(), (double)this.b.c() + 0.5D));
         if(var1 != null) {
            this.a.aM().a(var1.a, var1.b, var1.c, 0.3F);
         }
      } else {
         this.a.aM().a((double)this.b.a() + 0.5D, (double)this.b.b(), (double)this.b.c() + 0.5D, 0.3F);
      }

   }

   public void d() {
      this.c = this.b.a();
      this.d = this.b.c();
      this.b = null;
   }
}
