import java.util.List;
import java.util.Random;

public class aeu extends aih {

   private int a = -1;


   public aeu(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {}

   public static aeu a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, 0, 0, 0, 5, 12, 9, var5);
      return a(var7) && he.a(var0, var7) == null?new aeu(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a < 0) {
         this.a = this.b(var1, var3);
         if(this.a < 0) {
            return true;
         }

         this.g.a(0, this.a - this.g.e + 12 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 3, 3, 7, 0, 0, false);
      this.a(var1, var3, 1, 5, 1, 3, 9, 3, 0, 0, false);
      this.a(var1, var3, 1, 0, 0, 3, 0, 8, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 1, 1, 0, 3, 10, 0, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 1, 1, 0, 10, 3, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 4, 1, 1, 4, 10, 3, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 0, 4, 0, 4, 7, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 4, 0, 4, 4, 4, 7, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 1, 1, 8, 3, 4, 8, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 1, 5, 4, 3, 10, 4, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 1, 5, 5, 3, 5, 7, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 9, 0, 4, 9, 4, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 4, 0, 4, 4, 4, pb.w.bO, pb.w.bO, false);
      this.a(var1, pb.w.bO, 0, 0, 11, 2, var3);
      this.a(var1, pb.w.bO, 0, 4, 11, 2, var3);
      this.a(var1, pb.w.bO, 0, 2, 11, 0, var3);
      this.a(var1, pb.w.bO, 0, 2, 11, 4, var3);
      this.a(var1, pb.w.bO, 0, 1, 1, 6, var3);
      this.a(var1, pb.w.bO, 0, 1, 1, 7, var3);
      this.a(var1, pb.w.bO, 0, 2, 1, 7, var3);
      this.a(var1, pb.w.bO, 0, 3, 1, 6, var3);
      this.a(var1, pb.w.bO, 0, 3, 1, 7, var3);
      this.a(var1, pb.aH.bO, this.c(pb.aH.bO, 3), 1, 1, 5, var3);
      this.a(var1, pb.aH.bO, this.c(pb.aH.bO, 3), 2, 1, 6, var3);
      this.a(var1, pb.aH.bO, this.c(pb.aH.bO, 3), 3, 1, 5, var3);
      this.a(var1, pb.aH.bO, this.c(pb.aH.bO, 1), 1, 2, 7, var3);
      this.a(var1, pb.aH.bO, this.c(pb.aH.bO, 0), 3, 2, 7, var3);
      this.a(var1, pb.bq.bO, 0, 0, 2, 2, var3);
      this.a(var1, pb.bq.bO, 0, 0, 3, 2, var3);
      this.a(var1, pb.bq.bO, 0, 4, 2, 2, var3);
      this.a(var1, pb.bq.bO, 0, 4, 3, 2, var3);
      this.a(var1, pb.bq.bO, 0, 0, 6, 2, var3);
      this.a(var1, pb.bq.bO, 0, 0, 7, 2, var3);
      this.a(var1, pb.bq.bO, 0, 4, 6, 2, var3);
      this.a(var1, pb.bq.bO, 0, 4, 7, 2, var3);
      this.a(var1, pb.bq.bO, 0, 2, 6, 0, var3);
      this.a(var1, pb.bq.bO, 0, 2, 7, 0, var3);
      this.a(var1, pb.bq.bO, 0, 2, 6, 4, var3);
      this.a(var1, pb.bq.bO, 0, 2, 7, 4, var3);
      this.a(var1, pb.bq.bO, 0, 0, 3, 6, var3);
      this.a(var1, pb.bq.bO, 0, 4, 3, 6, var3);
      this.a(var1, pb.bq.bO, 0, 2, 3, 8, var3);
      this.a(var1, pb.aq.bO, 0, 2, 4, 7, var3);
      this.a(var1, pb.aq.bO, 0, 1, 4, 6, var3);
      this.a(var1, pb.aq.bO, 0, 3, 4, 6, var3);
      this.a(var1, pb.aq.bO, 0, 2, 4, 5, var3);
      int var4 = this.c(pb.aF.bO, 4);

      int var5;
      for(var5 = 1; var5 <= 9; ++var5) {
         this.a(var1, pb.aF.bO, var4, 3, var5, 3, var3);
      }

      this.a(var1, 0, 0, 2, 1, 0, var3);
      this.a(var1, 0, 0, 2, 2, 0, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.c(pb.aE.bO, 1));
      if(this.a(var1, 2, 0, -1, var3) == 0 && this.a(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, pb.aH.bO, this.c(pb.aH.bO, 3), 2, 0, -1, var3);
      }

      for(var5 = 0; var5 < 9; ++var5) {
         for(int var6 = 0; var6 < 5; ++var6) {
            this.b(var1, var6, 12, var5, var3);
            this.b(var1, pb.w.bO, 0, var6, -1, var5, var3);
         }
      }

      this.a(var1, var3, 2, 1, 2, 1);
      return true;
   }

   protected int a(int var1) {
      return 2;
   }
}
