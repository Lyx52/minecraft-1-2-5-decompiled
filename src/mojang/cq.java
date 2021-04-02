package mojang;

import java.util.List;
import java.util.Random;

public class cq extends aih {

   private static final fx[] a = new fx[]{new fx(yr.n.bQ, 0, 1, 3, 3), new fx(yr.o.bQ, 0, 1, 5, 10), new fx(yr.p.bQ, 0, 1, 3, 5), new fx(yr.U.bQ, 0, 1, 3, 15), new fx(yr.j.bQ, 0, 1, 3, 15), new fx(yr.g.bQ, 0, 1, 1, 5), new fx(yr.q.bQ, 0, 1, 1, 5), new fx(yr.ae.bQ, 0, 1, 1, 5), new fx(yr.ad.bQ, 0, 1, 1, 5), new fx(yr.af.bQ, 0, 1, 1, 5), new fx(yr.ag.bQ, 0, 1, 1, 5), new fx(pb.ap.bO, 0, 3, 7, 5), new fx(pb.y.bO, 0, 3, 7, 5)};
   private int b = -1;
   private boolean c;


   public cq(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {}

   public static cq a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, 0, 0, 0, 10, 6, 7, var5);
      return a(var7) && a(var0, var7) == null?new cq(var6, var1, var7, var5):null;
   }

   public boolean a(World var1, Random var2, qg var3) {
      if(this.b < 0) {
         this.b = this.b(var1, var3);
         if(this.b < 0) {
            return true;
         }

         this.g.a(0, this.b - this.g.e + 6 - 1, 0);
      }

      this.a(var1, var3, 0, 1, 0, 9, 4, 6, 0, 0, false);
      this.a(var1, var3, 0, 0, 0, 9, 0, 6, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 4, 0, 9, 4, 6, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 5, 0, 9, 5, 6, pb.ak.bO, pb.ak.bO, false);
      this.a(var1, var3, 1, 5, 1, 8, 5, 5, 0, 0, false);
      this.a(var1, var3, 1, 1, 0, 2, 3, 0, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 0, 1, 0, 0, 4, 0, pb.J.bO, pb.J.bO, false);
      this.a(var1, var3, 3, 1, 0, 3, 4, 0, pb.J.bO, pb.J.bO, false);
      this.a(var1, var3, 0, 1, 6, 0, 4, 6, pb.J.bO, pb.J.bO, false);
      this.a(var1, pb.x.bO, 0, 3, 3, 1, var3);
      this.a(var1, var3, 3, 1, 2, 3, 3, 2, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 4, 1, 3, 5, 3, 3, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 0, 1, 1, 0, 3, 5, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 1, 1, 6, 5, 3, 6, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 5, 1, 0, 5, 3, 0, pb.aZ.bO, pb.aZ.bO, false);
      this.a(var1, var3, 9, 1, 0, 9, 3, 0, pb.aZ.bO, pb.aZ.bO, false);
      this.a(var1, var3, 6, 1, 4, 9, 4, 6, pb.w.bO, pb.w.bO, false);
      this.a(var1, pb.C.bO, 0, 7, 1, 5, var3);
      this.a(var1, pb.C.bO, 0, 8, 1, 5, var3);
      this.a(var1, pb.bp.bO, 0, 9, 2, 5, var3);
      this.a(var1, pb.bp.bO, 0, 9, 2, 4, var3);
      this.a(var1, var3, 7, 2, 4, 8, 2, 5, 0, 0, false);
      this.a(var1, pb.w.bO, 0, 6, 1, 3, var3);
      this.a(var1, pb.aB.bO, 0, 6, 2, 3, var3);
      this.a(var1, pb.aB.bO, 0, 6, 3, 3, var3);
      this.a(var1, pb.aj.bO, 0, 8, 1, 1, var3);
      this.a(var1, pb.bq.bO, 0, 0, 2, 2, var3);
      this.a(var1, pb.bq.bO, 0, 0, 2, 4, var3);
      this.a(var1, pb.bq.bO, 0, 2, 2, 6, var3);
      this.a(var1, pb.bq.bO, 0, 4, 2, 6, var3);
      this.a(var1, pb.aZ.bO, 0, 2, 1, 4, var3);
      this.a(var1, pb.aM.bO, 0, 2, 2, 4, var3);
      this.a(var1, pb.x.bO, 0, 1, 1, 5, var3);
      this.a(var1, pb.at.bO, this.c(pb.at.bO, 3), 2, 1, 5, var3);
      this.a(var1, pb.at.bO, this.c(pb.at.bO, 1), 1, 1, 4, var3);
      int var4;
      int var5;
      if(!this.c) {
         var4 = this.b(1);
         var5 = this.a(5, 5);
         int var6 = this.b(5, 5);
         if(var3.b(var5, var4, var6)) {
            this.c = true;
            this.a(var1, var3, var2, 5, 1, 5, a, 3 + var2.nextInt(6));
         }
      }

      for(var4 = 6; var4 <= 8; ++var4) {
         if(this.a(var1, var4, 0, -1, var3) == 0 && this.a(var1, var4, -1, -1, var3) != 0) {
            this.a(var1, pb.aH.bO, this.c(pb.aH.bO, 3), var4, 0, -1, var3);
         }
      }

      for(var4 = 0; var4 < 7; ++var4) {
         for(var5 = 0; var5 < 10; ++var5) {
            this.b(var1, var5, 6, var4, var3);
            this.b(var1, pb.w.bO, 0, var5, -1, var4, var3);
         }
      }

      this.a(var1, var3, 7, 1, 1, 1);
      return true;
   }

   protected int a(int var1) {
      return 3;
   }

}
