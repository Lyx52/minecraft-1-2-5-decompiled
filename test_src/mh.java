
class mh {

   final long a;
   Object b;
   mh c;
   final int d;


   mh(int var1, long var2, Object var4, mh var5) {
      this.b = var4;
      this.c = var5;
      this.a = var2;
      this.d = var1;
   }

   public final long a() {
      return this.a;
   }

   public final Object b() {
      return this.b;
   }

   public final boolean equals(Object var1) {
      if(!(var1 instanceof mh)) {
         return false;
      } else {
         mh var2 = (mh)var1;
         Long var3 = Long.valueOf(this.a());
         Long var4 = Long.valueOf(var2.a());
         if(var3 == var4 || var3 != null && var3.equals(var4)) {
            Object var5 = this.b();
            Object var6 = var2.b();
            if(var5 == var6 || var5 != null && var5.equals(var6)) {
               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      return en.f(this.a);
   }

   public final String toString() {
      return this.a() + "=" + this.b();
   }
}
