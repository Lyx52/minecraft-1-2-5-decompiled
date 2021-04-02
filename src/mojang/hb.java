package mojang;

public class hb extends kw implements io {

   private aan[] p = new aan[36];
   public boolean a = false;
   public hb b;
   public hb c;
   public hb d;
   public hb e;
   public float f;
   public float g;
   public int h;
   private int q;


   public int a() {
      return 27;
   }

   public aan k_(int var1) {
      return this.p[var1];
   }

   public aan a(int var1, int var2) {
      if(this.p[var1] != null) {
         aan var3;
         if(this.p[var1].a <= var2) {
            var3 = this.p[var1];
            this.p[var1] = null;
            this.j();
            return var3;
         } else {
            var3 = this.p[var1].a(var2);
            if(this.p[var1].a == 0) {
               this.p[var1] = null;
            }

            this.j();
            return var3;
         }
      } else {
         return null;
      }
   }

   public aan b(int var1) {
      if(this.p[var1] != null) {
         aan var2 = this.p[var1];
         this.p[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, aan var2) {
      this.p[var1] = var2;
      if(var2 != null && var2.a > this.d()) {
         var2.a = this.d();
      }

      this.j();
   }

   public String c() {
      return "container.chest";
   }

   public void a(ady var1) {
      super.a(var1);
      no var2 = var1.n("Items");
      this.p = new aan[this.a()];

      for(int var3 = 0; var3 < var2.d(); ++var3) {
         ady var4 = (ady)var2.a(var3);
         int var5 = var4.d("Slot") & 255;
         if(var5 >= 0 && var5 < this.p.length) {
            this.p[var5] = aan.a(var4);
         }
      }

   }

   public void b(ady var1) {
      super.b(var1);
      no var2 = new no();

      for(int var3 = 0; var3 < this.p.length; ++var3) {
         if(this.p[var3] != null) {
            ady var4 = new ady();
            var4.a("Slot", (byte)var3);
            this.p[var3].b(var4);
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

   public void b() {
      super.b();
      this.a = false;
   }

   public void g() {
      if(!this.a) {
         this.a = true;
         this.b = null;
         this.c = null;
         this.d = null;
         this.e = null;
         if(this.i.a(this.j - 1, this.k, this.l) == pb.au.bO) {
            this.d = (hb)this.i.b(this.j - 1, this.k, this.l);
         }

         if(this.i.a(this.j + 1, this.k, this.l) == pb.au.bO) {
            this.c = (hb)this.i.b(this.j + 1, this.k, this.l);
         }

         if(this.i.a(this.j, this.k, this.l - 1) == pb.au.bO) {
            this.b = (hb)this.i.b(this.j, this.k, this.l - 1);
         }

         if(this.i.a(this.j, this.k, this.l + 1) == pb.au.bO) {
            this.e = (hb)this.i.b(this.j, this.k, this.l + 1);
         }

         if(this.b != null) {
            this.b.b();
         }

         if(this.e != null) {
            this.e.b();
         }

         if(this.c != null) {
            this.c.b();
         }

         if(this.d != null) {
            this.d.b();
         }

      }
   }

   public void n_() {
      super.n_();
      this.g();
      if(++this.q % 20 * 4 == 0) {
         this.i.f(this.j, this.k, this.l, 1, this.h);
      }

      this.g = this.f;
      float var1 = 0.1F;
      double var4;
      if(this.h > 0 && this.f == 0.0F && this.b == null && this.d == null) {
         double var2 = (double)this.j + 0.5D;
         var4 = (double)this.l + 0.5D;
         if(this.e != null) {
            var4 += 0.5D;
         }

         if(this.c != null) {
            var2 += 0.5D;
         }

         this.i.a(var2, (double)this.k + 0.5D, var4, "random.chestopen", 0.5F, this.i.r.nextFloat() * 0.1F + 0.9F);
      }

      if(this.h == 0 && this.f > 0.0F || this.h > 0 && this.f < 1.0F) {
         float var8 = this.f;
         if(this.h > 0) {
            this.f += var1;
         } else {
            this.f -= var1;
         }

         if(this.f > 1.0F) {
            this.f = 1.0F;
         }

         float var3 = 0.5F;
         if(this.f < var3 && var8 >= var3 && this.b == null && this.d == null) {
            var4 = (double)this.j + 0.5D;
            double var6 = (double)this.l + 0.5D;
            if(this.e != null) {
               var6 += 0.5D;
            }

            if(this.c != null) {
               var4 += 0.5D;
            }

            this.i.a(var4, (double)this.k + 0.5D, var6, "random.chestclosed", 0.5F, this.i.r.nextFloat() * 0.1F + 0.9F);
         }

         if(this.f < 0.0F) {
            this.f = 0.0F;
         }
      }

   }

   public void b(int var1, int var2) {
      if(var1 == 1) {
         this.h = var2;
      }

   }

   public void e() {
      ++this.h;
      this.i.f(this.j, this.k, this.l, 1, this.h);
   }

   public void f() {
      --this.h;
      this.i.f(this.j, this.k, this.l, 1, this.h);
   }

   public void h() {
      this.b();
      this.g();
      super.h();
   }
}
