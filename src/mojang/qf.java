package mojang;

import java.util.List;
import java.util.Random;

public class qf extends aih {

   private int a = -1;


   public qf(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {}

   public static qf a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, 0, 0, 0, 7, 4, 9, var5);
      return a(var7) && a(var0, var7) == null?new qf(var6, var1, var7, var5):null;
   }

   public boolean a(World var1, Random var2, qg var3) {
      if(this.a < 0) {
         this.a = this.b(var1, var3);
         if(this.a < 0) {
            return true;
         }

         this.g.a(0, this.a - this.g.e + 4 - 1, 0);
      }

      this.a(var1, var3, 0, 1, 0, 6, 4, 8, 0, 0, false);
      this.a(var1, var3, 1, 0, 1, 2, 0, 7, pb.aA.bO, pb.aA.bO, false);
      this.a(var1, var3, 4, 0, 1, 5, 0, 7, pb.aA.bO, pb.aA.bO, false);
      this.a(var1, var3, 0, 0, 0, 0, 0, 8, pb.J.bO, pb.J.bO, false);
      this.a(var1, var3, 6, 0, 0, 6, 0, 8, pb.J.bO, pb.J.bO, false);
      this.a(var1, var3, 1, 0, 0, 5, 0, 0, pb.J.bO, pb.J.bO, false);
      this.a(var1, var3, 1, 0, 8, 5, 0, 8, pb.J.bO, pb.J.bO, false);
      this.a(var1, var3, 3, 0, 1, 3, 0, 7, pb.A.bO, pb.A.bO, false);

      int var4;
      for(var4 = 1; var4 <= 7; ++var4) {
         this.a(var1, pb.az.bO, Utils.a(var2, 2, 7), 1, 1, var4, var3);
         this.a(var1, pb.az.bO, Utils.a(var2, 2, 7), 2, 1, var4, var3);
         this.a(var1, pb.az.bO, Utils.a(var2, 2, 7), 4, 1, var4, var3);
         this.a(var1, pb.az.bO, Utils.a(var2, 2, 7), 5, 1, var4, var3);
      }

      for(var4 = 0; var4 < 9; ++var4) {
         for(int var5 = 0; var5 < 7; ++var5) {
            this.b(var1, var5, 4, var4, var3);
            this.b(var1, pb.v.bO, 0, var5, -1, var4, var3);
         }
      }

      return true;
   }
}
