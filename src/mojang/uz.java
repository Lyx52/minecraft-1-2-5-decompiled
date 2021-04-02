package mojang;

import java.util.Random;

public class uz extends kw {

   public int a;
   public float b;
   public float c;
   public float d;
   public float e;
   public float f;
   public float g;
   public float h;
   public float p;
   public float q;
   private static Random r = new Random();


   public void n_() {
      super.n_();
      this.g = this.f;
      this.p = this.h;
      Player var1 = this.i.a((double)((float)this.j + 0.5F), (double)((float)this.k + 0.5F), (double)((float)this.l + 0.5F), 3.0D);
      if(var1 != null) {
         double var2 = var1.o - (double)((float)this.j + 0.5F);
         double var4 = var1.q - (double)((float)this.l + 0.5F);
         this.q = (float)Math.atan2(var4, var2);
         this.f += 0.1F;
         if(this.f < 0.5F || r.nextInt(40) == 0) {
            float var6 = this.d;

            do {
               this.d += (float)(r.nextInt(4) - r.nextInt(4));
            } while(var6 == this.d);
         }
      } else {
         this.q += 0.02F;
         this.f -= 0.1F;
      }

      while(this.h >= 3.1415927F) {
         this.h -= 6.2831855F;
      }

      while(this.h < -3.1415927F) {
         this.h += 6.2831855F;
      }

      while(this.q >= 3.1415927F) {
         this.q -= 6.2831855F;
      }

      while(this.q < -3.1415927F) {
         this.q += 6.2831855F;
      }

      float var7;
      for(var7 = this.q - this.h; var7 >= 3.1415927F; var7 -= 6.2831855F) {
         ;
      }

      while(var7 < -3.1415927F) {
         var7 += 6.2831855F;
      }

      this.h += var7 * 0.4F;
      if(this.f < 0.0F) {
         this.f = 0.0F;
      }

      if(this.f > 1.0F) {
         this.f = 1.0F;
      }

      ++this.a;
      this.c = this.b;
      float var3 = (this.d - this.b) * 0.4F;
      float var8 = 0.2F;
      if(var3 < -var8) {
         var3 = -var8;
      }

      if(var3 > var8) {
         var3 = var8;
      }

      this.e += (var3 - this.e) * 0.9F;
      this.b += this.e;
   }

}
