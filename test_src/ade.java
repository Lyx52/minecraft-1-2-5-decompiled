
public class ade implements io {

   private aan[] a;
   private int b;
   private dd c;


   public ade(dd var1, int var2, int var3) {
      int var4 = var2 * var3;
      this.a = new aan[var4];
      this.c = var1;
      this.b = var2;
   }

   public int a() {
      return this.a.length;
   }

   public aan k_(int var1) {
      return var1 >= this.a()?null:this.a[var1];
   }

   public aan b(int var1, int var2) {
      if(var1 >= 0 && var1 < this.b) {
         int var3 = var1 + var2 * this.b;
         return this.k_(var3);
      } else {
         return null;
      }
   }

   public String c() {
      return "container.crafting";
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

   public aan a(int var1, int var2) {
      if(this.a[var1] != null) {
         aan var3;
         if(this.a[var1].a <= var2) {
            var3 = this.a[var1];
            this.a[var1] = null;
            this.c.a((io)this);
            return var3;
         } else {
            var3 = this.a[var1].a(var2);
            if(this.a[var1].a == 0) {
               this.a[var1] = null;
            }

            this.c.a((io)this);
            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, aan var2) {
      this.a[var1] = var2;
      this.c.a((io)this);
   }

   public int d() {
      return 64;
   }

   public void j() {}

   public boolean a_(yw var1) {
      return true;
   }

   public void e() {}

   public void f() {}
}
