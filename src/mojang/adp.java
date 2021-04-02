package mojang;

import java.util.List;
import java.util.Random;

public class adp extends aas {

   public adp(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {
      this.c((aga)var1, var2, var3, 6, 2, false);
   }

   public static adp a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -2, 0, 0, 7, 11, 7, var5);
      return a(var7) && he.a(var0, var7) == null?new adp(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      this.a(var1, var3, 0, 0, 0, 6, 1, 6, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 2, 0, 6, 10, 6, 0, 0, false);
      this.a(var1, var3, 0, 2, 0, 1, 8, 0, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 5, 2, 0, 6, 8, 0, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 2, 1, 0, 8, 6, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 6, 2, 1, 6, 8, 6, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 1, 2, 6, 5, 8, 6, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 3, 2, 0, 5, 4, pb.bB.bO, pb.bB.bO, false);
      this.a(var1, var3, 6, 3, 2, 6, 5, 2, pb.bB.bO, pb.bB.bO, false);
      this.a(var1, var3, 6, 3, 4, 6, 5, 4, pb.bB.bO, pb.bB.bO, false);
      this.a(var1, pb.bA.bO, 0, 5, 2, 5, var3);
      this.a(var1, var3, 4, 2, 5, 4, 3, 5, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 3, 2, 5, 3, 4, 5, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 2, 2, 5, 2, 5, 5, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 1, 2, 5, 1, 6, 5, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 1, 7, 1, 5, 7, 4, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 6, 8, 2, 6, 8, 4, 0, 0, false);
      this.a(var1, var3, 2, 6, 0, 4, 8, 0, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 2, 5, 0, 4, 5, 0, pb.bB.bO, pb.bB.bO, false);

      for(int var4 = 0; var4 <= 6; ++var4) {
         for(int var5 = 0; var5 <= 6; ++var5) {
            this.b(var1, pb.bA.bO, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
