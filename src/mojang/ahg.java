package mojang;

public class ahg extends kw implements io {

   private aan[] d = new aan[3];
   public int a = 0;
   public int b = 0;
   public int c = 0;


   public int a() {
      return this.d.length;
   }

   public aan k_(int var1) {
      return this.d[var1];
   }

   public aan a(int var1, int var2) {
      if(this.d[var1] != null) {
         aan var3;
         if(this.d[var1].a <= var2) {
            var3 = this.d[var1];
            this.d[var1] = null;
            return var3;
         } else {
            var3 = this.d[var1].a(var2);
            if(this.d[var1].a == 0) {
               this.d[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public aan b(int var1) {
      if(this.d[var1] != null) {
         aan var2 = this.d[var1];
         this.d[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, aan var2) {
      this.d[var1] = var2;
      if(var2 != null && var2.a > this.d()) {
         var2.a = this.d();
      }

   }

   public String c() {
      return "container.furnace";
   }

   public void a(CompundTag var1) {
      super.a(var1);
      ListTag var2 = var1.getListTag("Items");
      this.d = new aan[this.a()];

      for(int var3 = 0; var3 < var2.d(); ++var3) {
         CompundTag var4 = (CompundTag)var2.a(var3);
         byte var5 = var4.getByte("Slot");
         if(var5 >= 0 && var5 < this.d.length) {
            this.d[var5] = aan.a(var4);
         }
      }

      this.a = var1.getShort("BurnTime");
      this.c = var1.getShort("CookTime");
      this.b = a(this.d[1]);
   }

   public void b(CompundTag var1) {
      super.b(var1);
      var1.addShort("BurnTime", (short)this.a);
      var1.addShort("CookTime", (short)this.c);
      ListTag var2 = new ListTag();

      for(int var3 = 0; var3 < this.d.length; ++var3) {
         if(this.d[var3] != null) {
            CompundTag var4 = new CompundTag();
            var4.addByte("Slot", (byte)var3);
            this.d[var3].b(var4);
            var2.a((BaseTag)var4);
         }
      }

      var1.addBaseTag("Items", (BaseTag)var2);
   }

   public int d() {
      return 64;
   }

   public int c(int var1) {
      return this.c * var1 / 200;
   }

   public int d(int var1) {
      if(this.b == 0) {
         this.b = 200;
      }

      return this.a * var1 / this.b;
   }

   public boolean g() {
      return this.a > 0;
   }

   public void n_() {
      boolean var1 = this.a > 0;
      boolean var2 = false;
      if(this.a > 0) {
         --this.a;
      }

      if(!this.i.F) {
         if(this.a == 0 && this.o()) {
            this.b = this.a = a(this.d[1]);
            if(this.a > 0) {
               var2 = true;
               if(this.d[1] != null) {
                  --this.d[1].a;
                  if(this.d[1].a == 0) {
                     this.d[1] = null;
                  }
               }
            }
         }

         if(this.g() && this.o()) {
            ++this.c;
            if(this.c == 200) {
               this.c = 0;
               this.n();
               var2 = true;
            }
         } else {
            this.c = 0;
         }

         if(var1 != this.a > 0) {
            var2 = true;
            aho.a(this.a > 0, this.i, this.j, this.k, this.l);
         }
      }

      if(var2) {
         this.j();
      }

   }

   private boolean o() {
      if(this.d[0] == null) {
         return false;
      } else {
         aan var1 = dy.a().a(this.d[0].a().bQ);
         return var1 == null?false:(this.d[2] == null?true:(!this.d[2].a(var1)?false:(this.d[2].a < this.d() && this.d[2].a < this.d[2].c()?true:this.d[2].a < var1.c())));
      }
   }

   public void n() {
      if(this.o()) {
         aan var1 = dy.a().a(this.d[0].a().bQ);
         if(this.d[2] == null) {
            this.d[2] = var1.k();
         } else if(this.d[2].c == var1.c) {
            ++this.d[2].a;
         }

         --this.d[0].a;
         if(this.d[0].a <= 0) {
            this.d[0] = null;
         }

      }
   }

   public static int a(aan var0) {
      if(var0 == null) {
         return 0;
      } else {
         int var1 = var0.a().bQ;
         return var1 < 256 && pb.m[var1].cd == acn.d?300:(var1 == yr.D.bQ?100:(var1 == yr.m.bQ?1600:(var1 == yr.ay.bQ?20000:(var1 == pb.y.bO?100:(var1 == yr.bo.bQ?2400:0)))));
      }
   }

   public static boolean b(aan var0) {
      return a(var0) > 0;
   }

   public boolean a_(Player var1) {
      return this.i.b(this.j, this.k, this.l) != this?false:var1.f((double)this.j + 0.5D, (double)this.k + 0.5D, (double)this.l + 0.5D) <= 64.0D;
   }

   public void e() {}

   public void f() {}
}
