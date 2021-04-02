package mojang;

import java.util.List;
import java.util.Random;

public class aev extends aih {

   private int a = -1;


   public aev(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {}

   public static qg a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      qg var6 = qg.a(var2, var3, var4, 0, 0, 0, 3, 4, 2, var5);
      return a(var0, var6) != null?null:var6;
   }

   public boolean a(World var1, Random var2, qg var3) {
      if(this.a < 0) {
         this.a = this.b(var1, var3);
         if(this.a < 0) {
            return true;
         }

         this.g.a(0, this.a - this.g.e + 4 - 1, 0);
      }

      this.a(var1, var3, 0, 0, 0, 2, 3, 1, 0, 0, false);
      this.a(var1, pb.aZ.bO, 0, 1, 0, 0, var3);
      this.a(var1, pb.aZ.bO, 0, 1, 1, 0, var3);
      this.a(var1, pb.aZ.bO, 0, 1, 2, 0, var3);
      this.a(var1, pb.ab.bO, 15, 1, 3, 0, var3);
      this.a(var1, pb.aq.bO, 15, 0, 3, 0, var3);
      this.a(var1, pb.aq.bO, 15, 1, 3, 1, var3);
      this.a(var1, pb.aq.bO, 15, 2, 3, 0, var3);
      this.a(var1, pb.aq.bO, 15, 1, 3, -1, var3);
      return true;
   }
}
