package mojang;

public class ml implements Comparable {

   private static long f = 0L;
   public int a;
   public int b;
   public int c;
   public int d;
   public long e;
   private long g;


   public ml(int var1, int var2, int var3, int var4) {
      this.g = (long)(f++);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof ml)) {
         return false;
      } else {
         ml var2 = (ml)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c && this.d == var2.d;
      }
   }

   public int hashCode() {
      return (this.a * 1024 * 1024 + this.c * 1024 + this.b) * 256 + this.d;
   }

   public ml a(long var1) {
      this.e = var1;
      return this;
   }

   public int compareTo(Object var1) {
      return this.e < ((ml)var1).e?-1:(this.e > ((ml)var1).e?1:(this.g < ((ml)var1).g?-1:(this.g > ((ml)var1).g?1:0)));
   }
}
