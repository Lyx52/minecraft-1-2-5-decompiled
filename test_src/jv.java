import java.util.Random;

public class jv extends li {

   public boolean a(xd var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 10; ++var6) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if(var1.i(var7, var8, var9) && pb.bz.e(var1, var7, var8, var9)) {
            var1.d(var7, var8, var9, pb.bz.bO);
         }
      }

      return true;
   }
}
