package mojang;

import java.util.Iterator;
import java.util.List;

public class ux extends rc {

   private ed a;
   private acq b;
   private float c;
   private int d;


   public ux(ed var1, float var2) {
      this.a = var1;
      this.c = var2;
      this.a(1);
   }

   public boolean a() {
      if(this.a.av() >= 0) {
         return false;
      } else if(this.a.aO().nextInt(400) != 0) {
         return false;
      } else {
         List var1 = this.a.k.a(ed.class, this.a.y.b(6.0D, 3.0D, 6.0D));
         double var2 = Double.MAX_VALUE;
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            nn var5 = (nn)var4.next();
            if(var5 != this.a) {
               ed var6 = (ed)var5;
               if(!var6.x() && var6.av() < 0) {
                  double var7 = var6.f(this.a);
                  if(var7 <= var2) {
                     var2 = var7;
                     this.b = var6;
                  }
               }
            }
         }

         if(this.b == null) {
            bo var9 = wv.a(this.a, 16, 3);
            if(var9 == null) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean b() {
      return this.d > 0;
   }

   public void c() {
      if(this.b != null) {
         this.a.b(true);
      }

      this.d = 1000;
   }

   public void d() {
      this.a.b(false);
      this.b = null;
   }

   public void e() {
      --this.d;
      if(this.b != null) {
         if(this.a.f(this.b) > 4.0D) {
            this.a.aM().a(this.b, this.c);
         }
      } else if(this.a.aM().e()) {
         bo var1 = wv.a(this.a, 16, 3);
         if(var1 == null) {
            return;
         }

         this.a.aM().a(var1.a, var1.b, var1.c, this.c);
      }

   }
}
