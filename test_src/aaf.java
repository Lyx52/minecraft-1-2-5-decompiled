
public final class aaf implements Comparable {

   public double a;
   public double b;
   public String c;


   public aaf(String var1, double var2, double var4) {
      this.c = var1;
      this.a = var2;
      this.b = var4;
   }

   public int a(aaf var1) {
      return var1.a < this.a?-1:(var1.a > this.a?1:var1.c.compareTo(this.c));
   }

   public int a() {
      return (this.c.hashCode() & 11184810) + 4473924;
   }
}
