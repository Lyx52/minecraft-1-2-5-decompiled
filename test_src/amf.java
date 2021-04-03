import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class amf extends rn {

   acq a;
   Class b;
   int f;
   private bq g;


   public amf(acq var1, Class var2, float var3, int var4, boolean var5) {
      this(var1, var2, var3, var4, var5, false);
   }

   public amf(acq var1, Class var2, float var3, int var4, boolean var5, boolean var6) {
      super(var1, var3, var5, var6);
      this.b = var2;
      this.d = var3;
      this.f = var4;
      this.g = new bq(this, var1);
      this.a(1);
   }

   public boolean a() {
      if(this.f > 0 && this.c.aO().nextInt(this.f) != 0) {
         return false;
      } else {
         if(this.b == yw.class) {
            yw var1 = this.c.k.b(this.c, (double)this.d);
            if(this.a(var1, false)) {
               this.a = var1;
               return true;
            }
         } else {
            List var5 = this.c.k.a(this.b, this.c.y.b((double)this.d, 4.0D, (double)this.d));
            Collections.sort(var5, this.g);
            Iterator var2 = var5.iterator();

            while(var2.hasNext()) {
               nn var3 = (nn)var2.next();
               acq var4 = (acq)var3;
               if(this.a(var4, false)) {
                  this.a = var4;
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void c() {
      this.c.c(this.a);
      super.c();
   }
}
