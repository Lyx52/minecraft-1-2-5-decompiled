package mojang;

import java.util.List;
import java.util.Random;

public class sh extends aas {

   public sh(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {
      this.a((aga)var1, var2, var3, 1, 0, true);
   }

   public static sh a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -1, -7, 0, 5, 14, 10, var5);
      return a(var7) && a(var0, var7) == null?new sh(var6, var1, var7, var5):null;
   }

   public boolean a(World var1, Random var2, qg var3) {
      int var4 = this.c(pb.bC.bO, 2);

      for(int var5 = 0; var5 <= 9; ++var5) {
         int var6 = Math.max(1, 7 - var5);
         int var7 = Math.min(Math.max(var6 + 5, 14 - var5), 13);
         int var8 = var5;
         this.a(var1, var3, 0, 0, var5, 4, var6, var5, pb.bA.bO, pb.bA.bO, false);
         this.a(var1, var3, 1, var6 + 1, var5, 3, var7 - 1, var5, 0, 0, false);
         if(var5 <= 6) {
            this.a(var1, pb.bC.bO, var4, 1, var6 + 1, var5, var3);
            this.a(var1, pb.bC.bO, var4, 2, var6 + 1, var5, var3);
            this.a(var1, pb.bC.bO, var4, 3, var6 + 1, var5, var3);
         }

         this.a(var1, var3, 0, var7, var5, 4, var7, var5, pb.bA.bO, pb.bA.bO, false);
         this.a(var1, var3, 0, var6 + 1, var5, 0, var7 - 1, var5, pb.bA.bO, pb.bA.bO, false);
         this.a(var1, var3, 4, var6 + 1, var5, 4, var7 - 1, var5, pb.bA.bO, pb.bA.bO, false);
         if((var5 & 1) == 0) {
            this.a(var1, var3, 0, var6 + 2, var5, 0, var6 + 3, var5, pb.bB.bO, pb.bB.bO, false);
            this.a(var1, var3, 4, var6 + 2, var5, 4, var6 + 3, var5, pb.bB.bO, pb.bB.bO, false);
         }

         for(int var9 = 0; var9 <= 4; ++var9) {
            this.b(var1, pb.bA.bO, 0, var9, -1, var8, var3);
         }
      }

      return true;
   }
}
