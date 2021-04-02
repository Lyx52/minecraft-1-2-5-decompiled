package mojang;

import java.util.List;
import java.util.Random;

public class aed extends fh {

   private final mg a;


   public aed(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.a = this.a(var2);
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {
      this.a((s)var1, var2, var3, 1, 1);
   }

   public static aed a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
      return a(var7) && he.a(var0, var7) == null?new aed(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 10, 7, true, var2, abb.b());
         this.a(var1, var2, var3, this.a, 1, 7, 0);
         this.a(var1, var2, var3, mg.a, 1, 1, 7);
         int var4 = this.c(pb.aH.bO, 2);

         for(int var5 = 0; var5 < 6; ++var5) {
            this.a(var1, pb.aH.bO, var4, 1, 6 - var5, 1 + var5, var3);
            this.a(var1, pb.aH.bO, var4, 2, 6 - var5, 1 + var5, var3);
            this.a(var1, pb.aH.bO, var4, 3, 6 - var5, 1 + var5, var3);
            if(var5 < 5) {
               this.a(var1, pb.bm.bO, 0, 1, 5 - var5, 1 + var5, var3);
               this.a(var1, pb.bm.bO, 0, 2, 5 - var5, 1 + var5, var3);
               this.a(var1, pb.bm.bO, 0, 3, 5 - var5, 1 + var5, var3);
            }
         }

         return true;
      }
   }
}
