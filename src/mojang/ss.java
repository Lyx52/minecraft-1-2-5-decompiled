package mojang;

final class ss implements se {

   private final abe a;
   private final abe b;


   ss(abe var1, abe var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean c(Object var1) {
      return this.a.a(var1) && this.b.a(this.a.b(var1));
   }

   public Object a(Object var1) {
      Object var2;
      try {
         var2 = this.a.b(var1);
      } catch (adj var6) {
         throw adj.b(var6, this.a);
      }

      try {
         Object var3 = this.b.b(var2);
         return var3;
      } catch (adj var5) {
         throw adj.a(var5, this.a);
      }
   }

   public String a() {
      return this.b.a();
   }

   public String toString() {
      return this.a.toString() + ", with " + this.b.toString();
   }
}
