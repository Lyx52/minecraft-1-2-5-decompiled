package mojang;

import java.util.List;
import java.util.Random;

public class akb extends aas {

   private boolean a;


   public akb(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {}

   public static akb a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -2, 0, 0, 7, 8, 9, var5);
      return a(var7) && a(var0, var7) == null?new akb(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      this.a(var1, var3, 0, 2, 0, 6, 7, 7, 0, 0, false);
      this.a(var1, var3, 1, 0, 0, 5, 1, 7, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 1, 2, 1, 5, 2, 7, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 1, 3, 2, 5, 3, 7, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 1, 4, 3, 5, 4, 7, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 1, 2, 0, 1, 4, 2, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 5, 2, 0, 5, 4, 2, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 1, 5, 2, 1, 5, 3, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 5, 5, 2, 5, 5, 3, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 0, 5, 3, 0, 5, 8, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 6, 5, 3, 6, 5, 8, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, var3, 1, 5, 8, 5, 5, 8, pb.bA.bO, pb.bA.bO, false);
      this.a(var1, pb.bB.bO, 0, 1, 6, 3, var3);
      this.a(var1, pb.bB.bO, 0, 5, 6, 3, var3);
      this.a(var1, var3, 0, 6, 3, 0, 6, 8, pb.bB.bO, pb.bB.bO, false);
      this.a(var1, var3, 6, 6, 3, 6, 6, 8, pb.bB.bO, pb.bB.bO, false);
      this.a(var1, var3, 1, 6, 8, 5, 7, 8, pb.bB.bO, pb.bB.bO, false);
      this.a(var1, var3, 2, 8, 8, 4, 8, 8, pb.bB.bO, pb.bB.bO, false);
      int var4;
      int var5;
      if(!this.a) {
         var4 = this.b(5);
         var5 = this.a(3, 5);
         int var6 = this.b(3, 5);
         if(var3.b(var5, var4, var6)) {
            this.a = true;
            var1.g(var5, var4, var6, pb.as.bO);
            cj var7 = (cj)var1.b(var5, var4, var6);
            if(var7 != null) {
               var7.a("Blaze");
            }
         }
      }

      for(var4 = 0; var4 <= 6; ++var4) {
         for(var5 = 0; var5 <= 6; ++var5) {
            this.b(var1, pb.bA.bO, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
