import java.util.Comparator;

public class bq implements Comparator {

   private nn b;
   // $FF: synthetic field
   final amf a;


   public bq(amf var1, nn var2) {
      this.a = var1;
      this.b = var2;
   }

   public int a(nn var1, nn var2) {
      double var3 = this.b.f(var1);
      double var5 = this.b.f(var2);
      return var3 < var5?-1:(var3 > var5?1:0);
   }
}
