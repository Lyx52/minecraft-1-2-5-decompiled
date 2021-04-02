package mojang;

import java.util.List;

public class amc extends kw implements io {

   private aan[] a = new aan[4];
   private int b;
   private int c;
   private int d;


   public String c() {
      return "container.brewing";
   }

   public int a() {
      return this.a.length;
   }

   public void n_() {
      if(this.b > 0) {
         --this.b;
         if(this.b == 0) {
            this.p();
            this.j();
         } else if(!this.o()) {
            this.b = 0;
            this.j();
         } else if(this.d != this.a[3].c) {
            this.b = 0;
            this.j();
         }
      } else if(this.o()) {
         this.b = 400;
         this.d = this.a[3].c;
      }

      int var1 = this.n();
      if(var1 != this.c) {
         this.c = var1;
         this.i.f(this.j, this.k, this.l, var1);
      }

      super.n_();
   }

   public int g() {
      return this.b;
   }

   private boolean o() {
      if(this.a[3] != null && this.a[3].a > 0) {
         aan var1 = this.a[3];
         if(!yr.e[var1.c].p()) {
            return false;
         } else {
            boolean var2 = false;

            for(int var3 = 0; var3 < 3; ++var3) {
               if(this.a[var3] != null && this.a[var3].c == yr.bs.bQ) {
                  int var4 = this.a[var3].i();
                  int var5 = this.b(var4, var1);
                  if(!ei.c(var4) && ei.c(var5)) {
                     var2 = true;
                     break;
                  }

                  List var6 = yr.bs.e_(var4);
                  List var7 = yr.bs.e_(var5);
                  if((var4 <= 0 || var6 != var7) && (var6 == null || !var6.equals(var7) && var7 != null) && var4 != var5) {
                     var2 = true;
                     break;
                  }
               }
            }

            return var2;
         }
      } else {
         return false;
      }
   }

   private void p() {
      if(this.o()) {
         aan var1 = this.a[3];

         for(int var2 = 0; var2 < 3; ++var2) {
            if(this.a[var2] != null && this.a[var2].c == yr.bs.bQ) {
               int var3 = this.a[var2].i();
               int var4 = this.b(var3, var1);
               List var5 = yr.bs.e_(var3);
               List var6 = yr.bs.e_(var4);
               if((var3 <= 0 || var5 != var6) && (var5 == null || !var5.equals(var6) && var6 != null)) {
                  if(var3 != var4) {
                     this.a[var2].b(var4);
                  }
               } else if(!ei.c(var3) && ei.c(var4)) {
                  this.a[var2].b(var4);
               }
            }
         }

         if(yr.e[var1.c].m()) {
            this.a[3] = new aan(yr.e[var1.c].l());
         } else {
            --this.a[3].a;
            if(this.a[3].a <= 0) {
               this.a[3] = null;
            }
         }

      }
   }

   private int b(int var1, aan var2) {
      return var2 == null?var1:(yr.e[var2.c].p()?hx.a(var1, yr.e[var2.c].o()):var1);
   }

   public void a(ady var1) {
      super.a(var1);
      no var2 = var1.n("Items");
      this.a = new aan[this.a()];

      for(int var3 = 0; var3 < var2.d(); ++var3) {
         ady var4 = (ady)var2.a(var3);
         byte var5 = var4.d("Slot");
         if(var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = aan.a(var4);
         }
      }

      this.b = var1.e("BrewTime");
   }

   public void b(ady var1) {
      super.b(var1);
      var1.a("BrewTime", (short)this.b);
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

   public aan k_(int var1) {
      return var1 >= 0 && var1 < this.a.length?this.a[var1]:null;
   }

   public aan a(int var1, int var2) {
      if(var1 >= 0 && var1 < this.a.length) {
         aan var3 = this.a[var1];
         this.a[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   public aan b(int var1) {
      if(var1 >= 0 && var1 < this.a.length) {
         aan var2 = this.a[var1];
         this.a[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, aan var2) {
      if(var1 >= 0 && var1 < this.a.length) {
         this.a[var1] = var2;
      }

   }

   public int d() {
      return 1;
   }

   public boolean a_(yw var1) {
      return this.i.b(this.j, this.k, this.l) != this?false:var1.f((double)this.j + 0.5D, (double)this.k + 0.5D, (double)this.l + 0.5D) <= 64.0D;
   }

   public void e() {}

   public void f() {}

   public void c(int var1) {
      this.b = var1;
   }

   public int n() {
      int var1 = 0;

      for(int var2 = 0; var2 < 3; ++var2) {
         if(this.a[var2] != null) {
            var1 |= 1 << var2;
         }
      }

      return var1;
   }
}
