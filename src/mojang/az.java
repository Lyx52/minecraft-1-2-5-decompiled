package mojang;

import java.util.Random;

public class az extends kw implements io {

   private aan[] a = new aan[9];
   private Random b = new Random();


   public int a() {
      return 9;
   }

   public aan k_(int var1) {
      return this.a[var1];
   }

   public aan a(int var1, int var2) {
      if(this.a[var1] != null) {
         aan var3;
         if(this.a[var1].a <= var2) {
            var3 = this.a[var1];
            this.a[var1] = null;
            this.j();
            return var3;
         } else {
            var3 = this.a[var1].a(var2);
            if(this.a[var1].a == 0) {
               this.a[var1] = null;
            }

            this.j();
            return var3;
         }
      } else {
         return null;
      }
   }

   public aan b(int var1) {
      if(this.a[var1] != null) {
         aan var2 = this.a[var1];
         this.a[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public aan m_() {
      int var1 = -1;
      int var2 = 1;

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if(this.a[var3] != null && this.b.nextInt(var2++) == 0) {
            var1 = var3;
         }
      }

      if(var1 >= 0) {
         return this.a(var1, 1);
      } else {
         return null;
      }
   }

   public void a(int var1, aan var2) {
      this.a[var1] = var2;
      if(var2 != null && var2.a > this.d()) {
         var2.a = this.d();
      }

      this.j();
   }

   public String c() {
      return "container.dispenser";
   }

   public void a(ady var1) {
      super.a(var1);
      no var2 = var1.n("Items");
      this.a = new aan[this.a()];

      for(int var3 = 0; var3 < var2.d(); ++var3) {
         ady var4 = (ady)var2.a(var3);
         int var5 = var4.d("Slot") & 255;
         if(var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = aan.a(var4);
         }
      }

   }

   public void b(ady var1) {
      super.b(var1);
      no var2 = new no();

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if(this.a[var3] != null) {
            ady var4 = new ady();
            var4.a("Slot", (byte)var3);
            this.a[var3].b(var4);
            var2.a((gh)var4);
         }
      }

      var1.a("Items", (gh)var2);
   }

   public int d() {
      return 64;
   }

   public boolean a_(yw var1) {
      return this.i.b(this.j, this.k, this.l) != this?false:var1.f((double)this.j + 0.5D, (double)this.k + 0.5D, (double)this.l + 0.5D) <= 64.0D;
   }

   public void e() {}

   public void f() {}
}
