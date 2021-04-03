
public class bu extends rc {

   acq a;
   acq b;
   float c;


   public bu(acq var1, float var2) {
      this.a = var1;
      this.c = var2;
      this.a(5);
   }

   public boolean a() {
      this.b = this.a.aT();
      if(this.b == null) {
         return false;
      } else {
         double var1 = this.a.f(this.b);
         return var1 >= 4.0D && var1 <= 16.0D?(!this.a.z?false:this.a.aO().nextInt(5) == 0):false;
      }
   }

   public boolean b() {
      return !this.a.z;
   }

   public void c() {
      double var1 = this.b.o - this.a.o;
      double var3 = this.b.q - this.a.q;
      float var5 = gk.a(var1 * var1 + var3 * var3);
      this.a.r += var1 / (double)var5 * 0.5D * 0.800000011920929D + this.a.r * 0.20000000298023224D;
      this.a.t += var3 / (double)var5 * 0.5D * 0.800000011920929D + this.a.t * 0.20000000298023224D;
      this.a.s = (double)this.c;
   }
}
