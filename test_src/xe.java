import java.util.Random;

public class xe extends rc {

   private ed b;
   private ed c;
   private xd d;
   private int e = 0;
   kd a;


   public xe(ed var1) {
      this.b = var1;
      this.d = var1.k;
      this.a(3);
   }

   public boolean a() {
      if(this.b.av() != 0) {
         return false;
      } else if(this.b.aO().nextInt(500) != 0) {
         return false;
      } else {
         this.a = this.d.A.a(gk.c(this.b.o), gk.c(this.b.p), gk.c(this.b.q), 0);
         if(this.a == null) {
            return false;
         } else if(!this.h()) {
            return false;
         } else {
            nn var1 = this.d.a(ed.class, this.b.y.b(8.0D, 3.0D, 8.0D), this.b);
            if(var1 == null) {
               return false;
            } else {
               this.c = (ed)var1;
               return this.c.av() == 0;
            }
         }
      }
   }

   public void c() {
      this.e = 300;
      this.b.a(true);
   }

   public void d() {
      this.a = null;
      this.c = null;
      this.b.a(false);
   }

   public boolean b() {
      return this.e >= 0 && this.h() && this.b.av() == 0;
   }

   public void e() {
      --this.e;
      this.b.aJ().a(this.c, 10.0F, 30.0F);
      if(this.b.f(this.c) > 2.25D) {
         this.b.aM().a((acq)this.c, 0.25F);
      } else if(this.e == 0 && this.c.x_()) {
         this.i();
      }

      if(this.b.aO().nextInt(35) == 0) {
         this.a(this.b);
      }

   }

   private boolean h() {
      int var1 = (int)((double)((float)this.a.c()) * 0.35D);
      return this.a.e() < var1;
   }

   private void i() {
      ed var1 = new ed(this.d);
      this.c.d(6000);
      this.b.d(6000);
      var1.d(-24000);
      var1.d_(this.b.aO().nextInt(5));
      var1.c(this.b.o, this.b.p, this.b.q, 0.0F, 0.0F);
      this.d.a((nn)var1);
      this.a(var1);
   }

   private void a(acq var1) {
      Random var2 = var1.aO();

      for(int var3 = 0; var3 < 5; ++var3) {
         double var4 = var2.nextGaussian() * 0.02D;
         double var6 = var2.nextGaussian() * 0.02D;
         double var8 = var2.nextGaussian() * 0.02D;
         this.d.a("heart", var1.o + (double)(var2.nextFloat() * var1.I * 2.0F) - (double)var1.I, var1.p + 1.0D + (double)(var2.nextFloat() * var1.J), var1.q + (double)(var2.nextFloat() * var1.I * 2.0F) - (double)var1.I, var4, var6, var8);
      }

   }
}
