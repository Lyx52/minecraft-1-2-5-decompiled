import java.util.Random;

public class od extends li {

   public boolean a(xd var1, Random var2, int var3, int var4, int var5) {
      int var6 = var3;

      for(int var7 = var5; var4 < 128; ++var4) {
         if(var1.i(var3, var4, var5)) {
            for(int var8 = 2; var8 <= 5; ++var8) {
               if(pb.bu.d(var1, var3, var4, var5, var8)) {
                  var1.b(var3, var4, var5, pb.bu.bO, 1 << aav.d[qs.a[var8]]);
                  break;
               }
            }
         } else {
            var3 = var6 + var2.nextInt(4) - var2.nextInt(4);
            var5 = var7 + var2.nextInt(4) - var2.nextInt(4);
         }
      }

      return true;
   }
}
