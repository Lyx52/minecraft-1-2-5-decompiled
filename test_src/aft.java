
public class aft {

   float a;
   private double f;
   public int b;
   public float c;
   public float d = 1.0F;
   public float e = 0.0F;
   private long g;
   private long h;
   private long i;
   private double j = 1.0D;


   public aft(float var1) {
      this.a = var1;
      this.g = System.currentTimeMillis();
      this.h = System.nanoTime() / 1000000L;
   }

   public void a() {
      long var1 = System.currentTimeMillis();
      long var3 = var1 - this.g;
      long var5 = System.nanoTime() / 1000000L;
      double var7 = (double)var5 / 1000.0D;
      if(var3 > 1000L) {
         this.f = var7;
      } else if(var3 < 0L) {
         this.f = var7;
      } else {
         this.i += var3;
         if(this.i > 1000L) {
            long var9 = var5 - this.h;
            double var11 = (double)this.i / (double)var9;
            this.j += (var11 - this.j) * 0.20000000298023224D;
            this.h = var5;
            this.i = 0L;
         }

         if(this.i < 0L) {
            this.h = var5;
         }
      }

      this.g = var1;
      double var13 = (var7 - this.f) * this.j;
      this.f = var7;
      if(var13 < 0.0D) {
         var13 = 0.0D;
      }

      if(var13 > 1.0D) {
         var13 = 1.0D;
      }

      this.e = (float)((double)this.e + var13 * (double)this.d * (double)this.a);
      this.b = (int)this.e;
      this.e -= (float)this.b;
      if(this.b > 10) {
         this.b = 10;
      }

      this.c = this.e;
   }
}
