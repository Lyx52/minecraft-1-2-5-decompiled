package mojang;

import java.util.List;
import java.util.Random;

public class p extends aih {

   private int a = -1;


   public p(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {}

   public static p a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, 0, 0, 0, 9, 7, 11, var5);
      return a(var7) && a(var0, var7) == null?new p(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a < 0) {
         this.a = this.b(var1, var3);
         if(this.a < 0) {
            return true;
         }

         this.g.a(0, this.a - this.g.e + 7 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 7, 4, 4, 0, 0, false);
      this.a(var1, var3, 2, 1, 6, 8, 4, 10, 0, 0, false);
      this.a(var1, var3, 2, 0, 6, 8, 0, 10, pb.v.bO, pb.v.bO, false);
      this.a(var1, pb.w.bO, 0, 6, 0, 6, var3);
      this.a(var1, var3, 2, 1, 6, 2, 1, 10, pb.aZ.bO, pb.aZ.bO, false);
      this.a(var1, var3, 8, 1, 6, 8, 1, 10, pb.aZ.bO, pb.aZ.bO, false);
      this.a(var1, var3, 3, 1, 10, 7, 1, 10, pb.aZ.bO, pb.aZ.bO, false);
      this.a(var1, var3, 1, 0, 1, 7, 0, 4, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 0, 0, 0, 0, 3, 5, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 8, 0, 0, 8, 3, 5, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 1, 0, 0, 7, 1, 0, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 1, 0, 5, 7, 1, 5, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 1, 2, 0, 7, 3, 0, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 1, 2, 5, 7, 3, 5, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 0, 4, 1, 8, 4, 1, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 0, 4, 4, 8, 4, 4, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 0, 5, 2, 8, 5, 3, pb.x.bO, pb.x.bO, false);
      this.a(var1, pb.x.bO, 0, 0, 4, 2, var3);
      this.a(var1, pb.x.bO, 0, 0, 4, 3, var3);
      this.a(var1, pb.x.bO, 0, 8, 4, 2, var3);
      this.a(var1, pb.x.bO, 0, 8, 4, 3, var3);
      int var4 = this.c(pb.at.bO, 3);
      int var5 = this.c(pb.at.bO, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, pb.at.bO, var4, var7, 4 + var6, var6, var3);
            this.a(var1, pb.at.bO, var5, var7, 4 + var6, 5 - var6, var3);
         }
      }

      this.a(var1, pb.J.bO, 0, 0, 2, 1, var3);
      this.a(var1, pb.J.bO, 0, 0, 2, 4, var3);
      this.a(var1, pb.J.bO, 0, 8, 2, 1, var3);
      this.a(var1, pb.J.bO, 0, 8, 2, 4, var3);
      this.a(var1, pb.bq.bO, 0, 0, 2, 2, var3);
      this.a(var1, pb.bq.bO, 0, 0, 2, 3, var3);
      this.a(var1, pb.bq.bO, 0, 8, 2, 2, var3);
      this.a(var1, pb.bq.bO, 0, 8, 2, 3, var3);
      this.a(var1, pb.bq.bO, 0, 2, 2, 5, var3);
      this.a(var1, pb.bq.bO, 0, 3, 2, 5, var3);
      this.a(var1, pb.bq.bO, 0, 5, 2, 0, var3);
      this.a(var1, pb.bq.bO, 0, 6, 2, 5, var3);
      this.a(var1, pb.aZ.bO, 0, 2, 1, 3, var3);
      this.a(var1, pb.aM.bO, 0, 2, 2, 3, var3);
      this.a(var1, pb.x.bO, 0, 1, 1, 4, var3);
      this.a(var1, pb.at.bO, this.c(pb.at.bO, 3), 2, 1, 4, var3);
      this.a(var1, pb.at.bO, this.c(pb.at.bO, 1), 1, 1, 3, var3);
      this.a(var1, var3, 5, 0, 1, 7, 0, 3, pb.aj.bO, pb.aj.bO, false);
      this.a(var1, pb.aj.bO, 0, 6, 1, 1, var3);
      this.a(var1, pb.aj.bO, 0, 6, 1, 2, var3);
      this.a(var1, 0, 0, 2, 1, 0, var3);
      this.a(var1, 0, 0, 2, 2, 0, var3);
      this.a(var1, pb.aq.bO, 0, 2, 3, 1, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.c(pb.aE.bO, 1));
      if(this.a(var1, 2, 0, -1, var3) == 0 && this.a(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, pb.aH.bO, this.c(pb.aH.bO, 3), 2, 0, -1, var3);
      }

      this.a(var1, 0, 0, 6, 1, 5, var3);
      this.a(var1, 0, 0, 6, 2, 5, var3);
      this.a(var1, pb.aq.bO, 0, 6, 3, 4, var3);
      this.a(var1, var3, var2, 6, 1, 5, this.c(pb.aE.bO, 1));

      for(var6 = 0; var6 < 5; ++var6) {
         for(var7 = 0; var7 < 9; ++var7) {
            this.b(var1, var7, 7, var6, var3);
            this.b(var1, pb.w.bO, 0, var7, -1, var6, var3);
         }
      }

      this.a(var1, var3, 4, 1, 2, 2);
      return true;
   }

   protected int a(int var1) {
      return var1 == 0?4:0;
   }
}
