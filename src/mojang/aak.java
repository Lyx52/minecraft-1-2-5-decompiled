package mojang;

public class aak implements io {

   public aan[] a = new aan[36];
   public aan[] b = new aan[4];
   public int c = 0;
   public Player d;
   private aan f;
   public boolean e = false;


   public aak(Player var1) {
      this.d = var1;
   }

   public aan b() {
      return this.c < 9 && this.c >= 0?this.a[this.c]:null;
   }

   private int h(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null && this.a[var2].c == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int b(int var1, int var2) {
      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if(this.a[var3] != null && this.a[var3].c == var1 && this.a[var3].i() == var2) {
            return var3;
         }
      }

      return -1;
   }

   private int d(aan var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null && this.a[var2].c == var1.c && this.a[var2].d() && this.a[var2].a < this.a[var2].c() && this.a[var2].a < this.d() && (!this.a[var2].f() || this.a[var2].i() == var1.i()) && aan.a(this.a[var2], var1)) {
            return var2;
         }
      }

      return -1;
   }

   private int l() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   public void a(int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = true;
      int var7;
      if(var3) {
         var7 = this.b(var1, var2);
      } else {
         var7 = this.h(var1);
      }

      if(var7 >= 0 && var7 < 9) {
         this.c = var7;
      } else {
         if(var4 && var1 > 0) {
            int var6 = this.l();
            if(var6 >= 0 && var6 < 9) {
               this.c = var6;
            }

            this.a(yr.e[var1], var2);
         }

      }
   }

   public void c(int var1) {
      if(var1 > 0) {
         var1 = 1;
      }

      if(var1 < 0) {
         var1 = -1;
      }

      for(this.c -= var1; this.c < 0; this.c += 9) {
         ;
      }

      while(this.c >= 9) {
         this.c -= 9;
      }

   }

   public void a(yr var1, int var2) {
      if(var1 != null) {
         int var3 = this.b(var1.bQ, var2);
         if(var3 >= 0) {
            this.a[var3] = this.a[this.c];
         }

         this.a[this.c] = new aan(yr.e[var1.bQ], 1, var2);
      }

   }

   private int e(aan var1) {
      int var2 = var1.c;
      int var3 = var1.a;
      int var4;
      if(var1.c() == 1) {
         var4 = this.l();
         if(var4 < 0) {
            return var3;
         } else {
            if(this.a[var4] == null) {
               this.a[var4] = aan.b(var1);
            }

            return 0;
         }
      } else {
         var4 = this.d(var1);
         if(var4 < 0) {
            var4 = this.l();
         }

         if(var4 < 0) {
            return var3;
         } else {
            if(this.a[var4] == null) {
               this.a[var4] = new aan(var2, 0, var1.i());
               if(var1.n()) {
                  this.a[var4].d((CompundTag)var1.o().b());
               }
            }

            int var5 = var3;
            if(var3 > this.a[var4].c() - this.a[var4].a) {
               var5 = this.a[var4].c() - this.a[var4].a;
            }

            if(var5 > this.d() - this.a[var4].a) {
               var5 = this.d() - this.a[var4].a;
            }

            if(var5 == 0) {
               return var3;
            } else {
               var3 -= var5;
               this.a[var4].a += var5;
               this.a[var4].b = 5;
               return var3;
            }
         }
      }
   }

   public void g() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] != null) {
            this.a[var1].a(this.d.k, this.d, var1, this.c == var1);
         }
      }

   }

   public boolean d(int var1) {
      int var2 = this.h(var1);
      if(var2 < 0) {
         return false;
      } else {
         if(--this.a[var2].a <= 0) {
            this.a[var2] = null;
         }

         return true;
      }
   }

   public boolean e(int var1) {
      int var2 = this.h(var1);
      return var2 >= 0;
   }

   public boolean a(aan var1) {
      int var2;
      if(var1.g()) {
         var2 = this.l();
         if(var2 >= 0) {
            this.a[var2] = aan.b(var1);
            this.a[var2].b = 5;
            var1.a = 0;
            return true;
         } else if(this.d.aT.d) {
            var1.a = 0;
            return true;
         } else {
            return false;
         }
      } else {
         do {
            var2 = var1.a;
            var1.a = this.e(var1);
         } while(var1.a > 0 && var1.a < var2);

         if(var1.a == var2 && this.d.aT.d) {
            var1.a = 0;
            return true;
         } else {
            return var1.a < var2;
         }
      }
   }

   public aan a(int var1, int var2) {
      aan[] var3 = this.a;
      if(var1 >= this.a.length) {
         var3 = this.b;
         var1 -= this.a.length;
      }

      if(var3[var1] != null) {
         aan var4;
         if(var3[var1].a <= var2) {
            var4 = var3[var1];
            var3[var1] = null;
            return var4;
         } else {
            var4 = var3[var1].a(var2);
            if(var3[var1].a == 0) {
               var3[var1] = null;
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public aan b(int var1) {
      aan[] var2 = this.a;
      if(var1 >= this.a.length) {
         var2 = this.b;
         var1 -= this.a.length;
      }

      if(var2[var1] != null) {
         aan var3 = var2[var1];
         var2[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   public void a(int var1, aan var2) {
      aan[] var3 = this.a;
      if(var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.b;
      }

      var3[var1] = var2;
   }

   public float a(pb var1) {
      float var2 = 1.0F;
      if(this.a[this.c] != null) {
         var2 *= this.a[this.c].a(var1);
      }

      return var2;
   }

   public ListTag a(ListTag var1) {
      int var2;
      CompundTag var3;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null) {
            var3 = new CompundTag();
            var3.addByte("Slot", (byte)var2);
            this.a[var2].b(var3);
            var1.a((BaseTag)var3);
         }
      }

      for(var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null) {
            var3 = new CompundTag();
            var3.addByte("Slot", (byte)(var2 + 100));
            this.b[var2].b(var3);
            var1.a((BaseTag)var3);
         }
      }

      return var1;
   }

   public void b(ListTag var1) {
      this.a = new aan[36];
      this.b = new aan[4];

      for(int var2 = 0; var2 < var1.d(); ++var2) {
         CompundTag var3 = (CompundTag)var1.a(var2);
         int var4 = var3.getByte("Slot") & 255;
         aan var5 = aan.a(var3);
         if(var5 != null) {
            if(var4 >= 0 && var4 < this.a.length) {
               this.a[var4] = var5;
            }

            if(var4 >= 100 && var4 < this.b.length + 100) {
               this.b[var4 - 100] = var5;
            }
         }
      }

   }

   public int a() {
      return this.a.length + 4;
   }

   public aan k_(int var1) {
      aan[] var2 = this.a;
      if(var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.b;
      }

      return var2[var1];
   }

   public String c() {
      return "container.inventory";
   }

   public int d() {
      return 64;
   }

   public int a(BaseEntity var1) {
      aan var2 = this.k_(this.c);
      return var2 != null?var2.a(var1):1;
   }

   public boolean b(pb var1) {
      if(var1.cd.k()) {
         return true;
      } else {
         aan var2 = this.k_(this.c);
         return var2 != null?var2.b(var1):false;
      }
   }

   public aan f(int var1) {
      return this.b[var1];
   }

   public int h() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null && this.b[var2].a() instanceof ql) {
            int var3 = ((ql)this.b[var2].a()).b;
            var1 += var3;
         }
      }

      return var1;
   }

   public void g(int var1) {
      var1 /= 4;
      if(var1 < 1) {
         var1 = 1;
      }

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null && this.b[var2].a() instanceof ql) {
            this.b[var2].a(var1, this.d);
            if(this.b[var2].a == 0) {
               this.b[var2].a(this.d);
               this.b[var2] = null;
            }
         }
      }

   }

   public void i() {
      int var1;
      for(var1 = 0; var1 < this.a.length; ++var1) {
         if(this.a[var1] != null) {
            this.d.a(this.a[var1], true);
            this.a[var1] = null;
         }
      }

      for(var1 = 0; var1 < this.b.length; ++var1) {
         if(this.b[var1] != null) {
            this.d.a(this.b[var1], true);
            this.b[var1] = null;
         }
      }

   }

   public void j() {
      this.e = true;
   }

   public void b(aan var1) {
      this.f = var1;
      this.d.b(var1);
   }

   public aan k() {
      return this.f;
   }

   public boolean a_(Player var1) {
      return this.d.G?false:var1.f(this.d) <= 64.0D;
   }

   public boolean c(aan var1) {
      int var2;
      for(var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null && this.b[var2].c(var1)) {
            return true;
         }
      }

      for(var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2] != null && this.a[var2].c(var1)) {
            return true;
         }
      }

      return false;
   }

   public void e() {}

   public void f() {}

   public void a(aak var1) {
      int var2;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = aan.b(var1.a[var2]);
      }

      for(var2 = 0; var2 < this.b.length; ++var2) {
         this.b[var2] = aan.b(var1.b[var2]);
      }

   }
}
