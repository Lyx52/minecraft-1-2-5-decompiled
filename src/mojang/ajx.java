package mojang;

import java.util.List;
import java.util.Random;

public class ajx extends aas {

   public ajx(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {
      this.a((aga)var1, var2, var3, 2, 0, false);
      this.b((aga)var1, var2, var3, 0, 2, false);
      this.c((aga)var1, var2, var3, 0, 2, false);
   }

   public static ajx a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -2, 0, 0, 7, 9, 7, var5);
      return a(var7) && a(var0, var7) == null?new ajx(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      this.a(var1, var3, 0, 0, 0, 6, 1, 6, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 2, 0, 6, 7, 6, 0, 0, false);
      this.a(var1, var3, 0, 2, 0, 1, 6, 0, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 2, 6, 1, 6, 6, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 5, 2, 0, 6, 6, 0, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 5, 2, 6, 6, 6, 6, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 2, 0, 0, 6, 1, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 2, 5, 0, 6, 6, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 6, 2, 0, 6, 6, 1, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 6, 2, 5, 6, 6, 6, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 2, 6, 0, 4, 6, 0, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 2, 5, 0, 4, 5, 0, pb.bB.bO, pb.bB.bO, false);
      this.a(var1, var3, 2, 6, 6, 4, 6, 6, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 2, 5, 6, 4, 5, 6, pb.bB.bO, pb.bB.bO, false);
      this.a(var1, var3, 0, 6, 2, 0, 6, 4, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 5, 2, 0, 5, 4, pb.bB.bO, pb.bB.bO, false);
      this.a(var1, var3, 6, 6, 2, 6, 6, 4, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 6, 5, 2, 6, 5, 4, pb.bB.bO, pb.bB.bO, false);

      for(int var4 = 0; var4 <= 6; ++var4) {
         for(int var5 = 0; var5 <= 6; ++var5) {
            this.b(var1, pb.bA.bO, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
