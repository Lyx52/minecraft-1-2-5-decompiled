import java.util.Iterator;
import java.util.List;

public class ek extends rc {

   bc a;
   bc b;
   float c;
   private int d;


   public ek(bc var1, float var2) {
      this.a = var1;
      this.c = var2;
   }

   public boolean a() {
      if(this.a.av() >= 0) {
         return false;
      } else {
         List var1 = this.a.k.a(this.a.getClass(), this.a.y.b(8.0D, 4.0D, 8.0D));
         bc var2 = null;
         double var3 = Double.MAX_VALUE;
         Iterator var5 = var1.iterator();

         while(var5.hasNext()) {
            nn var6 = (nn)var5.next();
            bc var7 = (bc)var6;
            if(var7.av() >= 0) {
               double var8 = this.a.f(var7);
               if(var8 <= var3) {
                  var3 = var8;
                  var2 = var7;
               }
            }
         }

         if(var2 == null) {
            return false;
         } else if(var3 < 9.0D) {
            return false;
         } else {
            this.b = var2;
            return true;
         }
      }
   }

   public boolean b() {
      if(!this.b.M()) {
         return false;
      } else {
         double var1 = this.a.f(this.b);
         return var1 >= 9.0D && var1 <= 256.0D;
      }
   }

   public void c() {
      this.d = 0;
   }

   public void d() {
      this.b = null;
   }

   public void e() {
      if(--this.d <= 0) {
         this.d = 10;
         this.a.aM().a((acq)this.b, this.c);
      }
   }
}
