import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class aga extends ma {

   public ahk a;
   public List b = new ArrayList();
   public List c;
   public ArrayList d = new ArrayList();


   public aga(Random var1, int var2, int var3) {
      super(var1, var2, var3);
      ahk[] var4 = iu.a();
      int var5 = var4.length;

      int var6;
      ahk var7;
      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var4[var6];
         var7.c = 0;
         this.b.add(var7);
      }

      this.c = new ArrayList();
      var4 = iu.b();
      var5 = var4.length;

      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var4[var6];
         var7.c = 0;
         this.c.add(var7);
      }

   }
}
