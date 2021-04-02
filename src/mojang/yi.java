package mojang;

import java.util.Iterator;
import java.util.List;

public class yi extends rc {

   private ed a;
   private tl b;
   private int c;
   private boolean d = false;


   public yi(ed var1) {
      this.a = var1;
      this.a(3);
   }

   public boolean a() {
      if(this.a.av() >= 0) {
         return false;
      } else if(!this.a.k.m()) {
         return false;
      } else {
         List var1 = this.a.k.a(tl.class, this.a.y.b(6.0D, 2.0D, 6.0D));
         if(var1.size() == 0) {
            return false;
         } else {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               nn var3 = (nn)var2.next();
               tl var4 = (tl)var3;
               if(var4.E_() > 0) {
                  this.b = var4;
                  break;
               }
            }

            return this.b != null;
         }
      }
   }

   public boolean b() {
      return this.b.E_() > 0;
   }

   public void c() {
      this.c = this.a.aO().nextInt(320);
      this.d = false;
      this.b.aM().f();
   }

   public void d() {
      this.b = null;
      this.a.aM().f();
   }

   public void e() {
      this.a.aJ().a(this.b, 30.0F, 30.0F);
      if(this.b.E_() == this.c) {
         this.a.aM().a((acq)this.b, 0.15F);
         this.d = true;
      }

      if(this.d && this.a.f(this.b) < 4.0D) {
         this.b.a(false);
         this.a.aM().f();
      }

   }
}
