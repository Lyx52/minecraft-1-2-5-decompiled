package mojang;

import java.util.Comparator;

public class gw implements Comparator {

   private double a;
   private double b;
   private double c;


   public gw(nn var1) {
      this.a = -var1.o;
      this.b = -var1.p;
      this.c = -var1.q;
   }

   public int a(ct var1, ct var2) {
      double var3 = (double)var1.n + this.a;
      double var5 = (double)var1.o + this.b;
      double var7 = (double)var1.p + this.c;
      double var9 = (double)var2.n + this.a;
      double var11 = (double)var2.o + this.b;
      double var13 = (double)var2.p + this.c;
      return (int)((var3 * var3 + var5 * var5 + var7 * var7 - (var9 * var9 + var11 * var11 + var13 * var13)) * 1024.0D);
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.a((ct)var1, (ct) var2);
   }
}
