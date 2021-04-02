package mojang;

import java.util.List;

public class me implements io {

   private String a;
   private int b;
   private aan[] c;
   private List d;


   public me(String var1, int var2) {
      this.a = var1;
      this.b = var2;
      this.c = new aan[var2];
   }

   public aan k_(int var1) {
      return this.c[var1];
   }

   public aan a(int var1, int var2) {
      if(this.c[var1] != null) {
         aan var3;
         if(this.c[var1].a <= var2) {
            var3 = this.c[var1];
            this.c[var1] = null;
            this.j();
            return var3;
         } else {
            var3 = this.c[var1].a(var2);
            if(this.c[var1].a == 0) {
               this.c[var1] = null;
            }

            this.j();
            return var3;
         }
      } else {
         return null;
      }
   }

   public aan b(int var1) {
      if(this.c[var1] != null) {
         aan var2 = this.c[var1];
         this.c[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, aan var2) {
      this.c[var1] = var2;
      if(var2 != null && var2.a > this.d()) {
         var2.a = this.d();
      }

      this.j();
   }

   public int a() {
      return this.b;
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return 64;
   }

   public void j() {
      if(this.d != null) {
         for(int var1 = 0; var1 < this.d.size(); ++var1) {
            ((zr)this.d.get(var1)).a(this);
         }
      }

   }

   public boolean a_(yw var1) {
      return true;
   }

   public void e() {}

   public void f() {}
}
