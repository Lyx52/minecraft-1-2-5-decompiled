package mojang;

import java.util.List;
import java.util.Random;

public class alv extends aas {

   public alv(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {
      this.a((aga)var1, var2, var3, 1, 0, true);
      this.b((aga)var1, var2, var3, 0, 1, true);
      this.c((aga)var1, var2, var3, 0, 1, true);
   }

   public static alv a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      return a(var7) && a(var0, var7) == null?new alv(var6, var1, var7, var5):null;
   }

   public boolean a(World var1, Random var2, qg var3) {
      this.a(var1, var3, 0, 0, 0, 4, 1, 4, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 2, 0, 4, 5, 4, 0, 0, false);
      this.a(var1, var3, 0, 2, 0, 0, 5, 0, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 4, 2, 0, 4, 5, 0, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 2, 4, 0, 5, 4, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 4, 2, 4, 4, 5, 4, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 6, 0, 4, 6, 4, pb.bA.bO, pb.bA.bO, false);

      for(int var4 = 0; var4 <= 4; ++var4) {
         for(int var5 = 0; var5 <= 4; ++var5) {
            this.b(var1, pb.bA.bO, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
