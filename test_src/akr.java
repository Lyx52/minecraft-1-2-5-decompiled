import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class akr extends rc {

   private aaa a;
   private float b;
   private vu c;
   private adm d;
   private boolean e;
   private List f = new ArrayList();


   public akr(aaa var1, float var2, boolean var3) {
      this.a = var1;
      this.b = var2;
      this.e = var3;
      this.a(1);
   }

   public boolean a() {
      this.h();
      if(this.e && this.a.k.m()) {
         return false;
      } else {
         kd var1 = this.a.k.A.a(gk.c(this.a.o), gk.c(this.a.p), gk.c(this.a.q), 0);
         if(var1 == null) {
            return false;
         } else {
            this.d = this.a(var1);
            if(this.d == null) {
               return false;
            } else {
               boolean var2 = this.a.aM().b();
               this.a.aM().b(false);
               this.c = this.a.aM().a((double)this.d.a, (double)this.d.b, (double)this.d.c);
               this.a.aM().b(var2);
               if(this.c != null) {
                  return true;
               } else {
                  bo var3 = wv.a(this.a, 10, 7, bo.b((double)this.d.a, (double)this.d.b, (double)this.d.c));
                  if(var3 == null) {
                     return false;
                  } else {
                     this.a.aM().b(false);
                     this.c = this.a.aM().a(var3.a, var3.b, var3.c);
                     this.a.aM().b(var2);
                     return this.c != null;
                  }
               }
            }
         }
      }
   }

   public boolean b() {
      if(this.a.aM().e()) {
         return false;
      } else {
         float var1 = this.a.I + 4.0F;
         return this.a.f((double)this.d.a, (double)this.d.b, (double)this.d.c) > (double)(var1 * var1);
      }
   }

   public void c() {
      this.a.aM().a(this.c, this.b);
   }

   public void d() {
      if(this.a.aM().e() || this.a.f((double)this.d.a, (double)this.d.b, (double)this.d.c) < 16.0D) {
         this.f.add(this.d);
      }

   }

   private adm a(kd var1) {
      adm var2 = null;
      int var3 = Integer.MAX_VALUE;
      List var4 = var1.f();
      Iterator var5 = var4.iterator();

      while(var5.hasNext()) {
         adm var6 = (adm)var5.next();
         int var7 = var6.a(gk.c(this.a.o), gk.c(this.a.p), gk.c(this.a.q));
         if(var7 < var3 && !this.a(var6)) {
            var2 = var6;
            var3 = var7;
         }
      }

      return var2;
   }

   private boolean a(adm var1) {
      Iterator var2 = this.f.iterator();

      adm var3;
      do {
         if(!var2.hasNext()) {
            return false;
         }

         var3 = (adm)var2.next();
      } while(var1.a != var3.a || var1.b != var3.b || var1.c != var3.c);

      return true;
   }

   private void h() {
      if(this.f.size() > 15) {
         this.f.remove(0);
      }

   }
}
