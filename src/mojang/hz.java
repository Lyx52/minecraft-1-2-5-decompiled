package mojang;

import java.util.List;
import java.util.Random;

public class hz extends aas {

   private int a;


   public hz(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
      this.a = var2.nextInt();
   }

   public void a(he var1, List var2, Random var3) {}

   public static hz a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      return a(var7) && a(var0, var7) == null?new hz(var6, var1, var7, var5):null;
   }

   public boolean a(World var1, Random var2, qg var3) {
      Random var4 = new Random((long)this.a);

      int var5;
      int var6;
      int var7;
      for(var5 = 0; var5 <= 4; ++var5) {
         for(var6 = 3; var6 <= 4; ++var6) {
            var7 = var4.nextInt(8);
            this.a(var1, var3, var5, var6, 0, var5, var6, var7, pb.bA.bO, pb.bA.bO, false);
         }
      }

      var5 = var4.nextInt(8);
      this.a(var1, var3, 0, 5, 0, 0, 5, var5, pb.bA.bO, pb.bA.bO, false);
      var5 = var4.nextInt(8);
      this.a(var1, var3, 4, 5, 0, 4, 5, var5, pb.bA.bO, pb.bA.bO, false);

      for(var5 = 0; var5 <= 4; ++var5) {
         var6 = var4.nextInt(5);
         this.a(var1, var3, var5, 2, 0, var5, 2, var6, pb.bA.bO, pb.bA.bO, false);
      }

      for(var5 = 0; var5 <= 4; ++var5) {
         for(var6 = 0; var6 <= 1; ++var6) {
            var7 = var4.nextInt(3);
            this.a(var1, var3, var5, var6, 0, var5, var6, var7, pb.bA.bO, pb.bA.bO, false);
         }
      }

      return true;
   }
}
