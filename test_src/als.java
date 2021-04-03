import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class als extends rc {

   private bc d;
   xd a;
   private bc e;
   int b = 0;
   float c;


   public als(bc var1, float var2) {
      this.d = var1;
      this.a = var1.k;
      this.c = var2;
      this.a(3);
   }

   public boolean a() {
      if(!this.d.o_()) {
         return false;
      } else {
         this.e = this.h();
         return this.e != null;
      }
   }

   public boolean b() {
      return this.e.M() && this.e.o_() && this.b < 60;
   }

   public void d() {
      this.e = null;
      this.b = 0;
   }

   public void e() {
      this.d.aJ().a(this.e, 10.0F, (float)this.d.ak());
      this.d.aM().a((acq)this.e, this.c);
      ++this.b;
      if(this.b == 60) {
         this.i();
      }

   }

   private bc h() {
      float var1 = 8.0F;
      List var2 = this.a.a(this.d.getClass(), this.d.y.b((double)var1, (double)var1, (double)var1));
      Iterator var3 = var2.iterator();

      bc var5;
      do {
         if(!var3.hasNext()) {
            return null;
         }

         nn var4 = (nn)var3.next();
         var5 = (bc)var4;
      } while(!this.d.b(var5));

      return var5;
   }

   private void i() {
      bc var1 = this.d.a(this.e);
      if(var1 != null) {
         this.d.d(6000);
         this.e.d(6000);
         this.d.p_();
         this.e.p_();
         var1.d(-24000);
         var1.c(this.d.o, this.d.p, this.d.q, 0.0F, 0.0F);
         this.a.a((nn)var1);
         Random var2 = this.d.aO();

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = var2.nextGaussian() * 0.02D;
            double var6 = var2.nextGaussian() * 0.02D;
            double var8 = var2.nextGaussian() * 0.02D;
            this.a.a("heart", this.d.o + (double)(var2.nextFloat() * this.d.I * 2.0F) - (double)this.d.I, this.d.p + 0.5D + (double)(var2.nextFloat() * this.d.J), this.d.q + (double)(var2.nextFloat() * this.d.I * 2.0F) - (double)this.d.I, var4, var6, var8);
         }

      }
   }
}
