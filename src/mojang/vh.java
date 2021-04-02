package mojang;

public class vh {

   private acq a;
   private int b = 0;
   private float c = 0.0F;


   public vh(acq var1) {
      this.a = var1;
   }

   public void a() {
      double var1 = this.a.o - this.a.l;
      double var3 = this.a.q - this.a.n;
      if(var1 * var1 + var3 * var3 > 2.500000277905201E-7D) {
         this.a.bd = this.a.u;
         this.a.bf = this.a(this.a.bd, this.a.bf, 75.0F);
         this.c = this.a.bf;
         this.b = 0;
      } else {
         float var5 = 75.0F;
         if(Math.abs(this.a.bf - this.c) > 15.0F) {
            this.b = 0;
            this.c = this.a.bf;
         } else {
            ++this.b;
            if(this.b > 10) {
               var5 = Math.max(1.0F - (float)(this.b - 10) / 10.0F, 0.0F) * 75.0F;
            }
         }

         this.a.bd = this.a(this.a.bf, this.a.bd, var5);
      }
   }

   private float a(float var1, float var2, float var3) {
      float var4;
      for(var4 = var1 - var2; var4 < -180.0F; var4 += 360.0F) {
         ;
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      if(var4 >= var3) {
         var4 = var3;
      }

      return var1 - var4;
   }
}
