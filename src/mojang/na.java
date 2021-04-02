package mojang;

import java.util.Random;

public class na extends rc {

   private aaa a;
   private double b;
   private double c;
   private double d;
   private float e;
   private xd f;


   public na(aaa var1, float var2) {
      this.a = var1;
      this.e = var2;
      this.f = var1.k;
      this.a(1);
   }

   public boolean a() {
      if(!this.f.m()) {
         return false;
      } else if(!this.a.T()) {
         return false;
      } else if(!this.f.m(gk.c(this.a.o), (int)this.a.y.b, gk.c(this.a.q))) {
         return false;
      } else {
         bo var1 = this.h();
         if(var1 == null) {
            return false;
         } else {
            this.b = var1.a;
            this.c = var1.b;
            this.d = var1.c;
            return true;
         }
      }
   }

   public boolean b() {
      return !this.a.aM().e();
   }

   public void c() {
      this.a.aM().a(this.b, this.c, this.d, this.e);
   }

   private bo h() {
      Random var1 = this.a.aO();

      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = gk.c(this.a.o + (double)var1.nextInt(20) - 10.0D);
         int var4 = gk.c(this.a.y.b + (double)var1.nextInt(6) - 3.0D);
         int var5 = gk.c(this.a.q + (double)var1.nextInt(20) - 10.0D);
         if(!this.f.m(var3, var4, var5) && this.a.a(var3, var4, var5) < 0.0F) {
            return bo.b((double)var3, (double)var4, (double)var5);
         }
      }

      return null;
   }
}
