package mojang;

import java.util.List;
import java.util.Random;

public class akc extends aih {

   private int a = -1;


   public akc(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {}

   public static akc a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, 0, 0, 0, 9, 9, 6, var5);
      return a(var7) && a(var0, var7) == null?new akc(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a < 0) {
         this.a = this.b(var1, var3);
         if(this.a < 0) {
            return true;
         }

         this.g.a(0, this.a - this.g.e + 9 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 7, 5, 4, 0, 0, false);
      this.a(var1, var3, 0, 0, 0, 8, 0, 5, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 5, 0, 8, 5, 5, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 6, 1, 8, 6, 4, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 7, 2, 8, 7, 3, pb.w.bO, pb.w.bO, false);
      int var4 = this.c(pb.at.bO, 3);
      int var5 = this.c(pb.at.bO, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, pb.at.bO, var4, var7, 6 + var6, var6, var3);
            this.a(var1, pb.at.bO, var5, var7, 6 + var6, 5 - var6, var3);
         }
      }

      this.a(var1, var3, 0, 1, 0, 0, 1, 5, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 1, 1, 5, 8, 1, 5, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 8, 1, 0, 8, 1, 4, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 2, 1, 0, 7, 1, 0, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 2, 0, 0, 4, 0, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 2, 5, 0, 4, 5, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 8, 2, 5, 8, 4, 5, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 8, 2, 0, 8, 4, 0, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 2, 1, 0, 4, 4, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 1, 2, 5, 7, 4, 5, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 8, 2, 1, 8, 4, 4, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 1, 2, 0, 7, 4, 0, pb.x.bO, pb.x.bO, false);
      this.a(var1, pb.bq.bO, 0, 4, 2, 0, var3);
      this.a(var1, pb.bq.bO, 0, 5, 2, 0, var3);
      this.a(var1, pb.bq.bO, 0, 6, 2, 0, var3);
      this.a(var1, pb.bq.bO, 0, 4, 3, 0, var3);
      this.a(var1, pb.bq.bO, 0, 5, 3, 0, var3);
      this.a(var1, pb.bq.bO, 0, 6, 3, 0, var3);
      this.a(var1, pb.bq.bO, 0, 0, 2, 2, var3);
      this.a(var1, pb.bq.bO, 0, 0, 2, 3, var3);
      this.a(var1, pb.bq.bO, 0, 0, 3, 2, var3);
      this.a(var1, pb.bq.bO, 0, 0, 3, 3, var3);
      this.a(var1, pb.bq.bO, 0, 8, 2, 2, var3);
      this.a(var1, pb.bq.bO, 0, 8, 2, 3, var3);
      this.a(var1, pb.bq.bO, 0, 8, 3, 2, var3);
      this.a(var1, pb.bq.bO, 0, 8, 3, 3, var3);
      this.a(var1, pb.bq.bO, 0, 2, 2, 5, var3);
      this.a(var1, pb.bq.bO, 0, 3, 2, 5, var3);
      this.a(var1, pb.bq.bO, 0, 5, 2, 5, var3);
      this.a(var1, pb.bq.bO, 0, 6, 2, 5, var3);
      this.a(var1, var3, 1, 4, 1, 7, 4, 1, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 1, 4, 4, 7, 4, 4, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 1, 3, 4, 7, 3, 4, pb.an.bO, pb.an.bO, false);
      this.a(var1, pb.x.bO, 0, 7, 1, 4, var3);
      this.a(var1, pb.at.bO, this.c(pb.at.bO, 0), 7, 1, 3, var3);
      var6 = this.c(pb.at.bO, 3);
      this.a(var1, pb.at.bO, var6, 6, 1, 4, var3);
      this.a(var1, pb.at.bO, var6, 5, 1, 4, var3);
      this.a(var1, pb.at.bO, var6, 4, 1, 4, var3);
      this.a(var1, pb.at.bO, var6, 3, 1, 4, var3);
      this.a(var1, pb.aZ.bO, 0, 6, 1, 3, var3);
      this.a(var1, pb.aM.bO, 0, 6, 2, 3, var3);
      this.a(var1, pb.aZ.bO, 0, 4, 1, 3, var3);
      this.a(var1, pb.aM.bO, 0, 4, 2, 3, var3);
      this.a(var1, pb.ay.bO, 0, 7, 1, 1, var3);
      this.a(var1, 0, 0, 1, 1, 0, var3);
      this.a(var1, 0, 0, 1, 2, 0, var3);
      this.a(var1, var3, var2, 1, 1, 0, this.c(pb.aE.bO, 1));
      if(this.a(var1, 1, 0, -1, var3) == 0 && this.a(var1, 1, -1, -1, var3) != 0) {
         this.a(var1, pb.aH.bO, this.c(pb.aH.bO, 3), 1, 0, -1, var3);
      }

      for(var7 = 0; var7 < 6; ++var7) {
         for(int var8 = 0; var8 < 9; ++var8) {
            this.b(var1, var8, 9, var7, var3);
            this.b(var1, pb.w.bO, 0, var8, -1, var7, var3);
         }
      }

      this.a(var1, var3, 2, 1, 2, 1);
      return true;
   }

   protected int a(int var1) {
      return 1;
   }
}
