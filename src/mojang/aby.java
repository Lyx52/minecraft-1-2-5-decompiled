package mojang;

import java.util.List;
import java.util.Random;

public class aby extends fh {

   private static final fx[] c = new fx[]{new fx(yr.o.bQ, 0, 1, 5, 10), new fx(yr.p.bQ, 0, 1, 3, 5), new fx(yr.aC.bQ, 0, 4, 9, 5), new fx(yr.m.bQ, 0, 3, 8, 10), new fx(yr.U.bQ, 0, 1, 3, 15), new fx(yr.j.bQ, 0, 1, 3, 15), new fx(yr.g.bQ, 0, 1, 1, 1)};
   protected final mg a;
   protected final int b;


   public aby(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.a = this.a(var2);
      this.g = var3;
      this.b = var2.nextInt(5);
   }

   public void a(he var1, List var2, Random var3) {
      this.a((s)var1, var2, var3, 4, 1);
      this.b((s)var1, var2, var3, 1, 4);
      this.c((s)var1, var2, var3, 1, 4);
   }

   public static aby a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
      return a(var7) && a(var0, var7) == null?new aby(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 10, 6, 10, true, var2, abb.b());
         this.a(var1, var2, var3, this.a, 4, 1, 0);
         this.a(var1, var3, 4, 1, 10, 6, 3, 10, 0, 0, false);
         this.a(var1, var3, 0, 1, 4, 0, 3, 6, 0, 0, false);
         this.a(var1, var3, 10, 1, 4, 10, 3, 6, 0, 0, false);
         int var4;
         switch(this.b) {
         case 0:
            this.a(var1, pb.bm.bO, 0, 5, 1, 5, var3);
            this.a(var1, pb.bm.bO, 0, 5, 2, 5, var3);
            this.a(var1, pb.bm.bO, 0, 5, 3, 5, var3);
            this.a(var1, pb.aq.bO, 0, 4, 3, 5, var3);
            this.a(var1, pb.aq.bO, 0, 6, 3, 5, var3);
            this.a(var1, pb.aq.bO, 0, 5, 3, 4, var3);
            this.a(var1, pb.aq.bO, 0, 5, 3, 6, var3);
            this.a(var1, pb.ak.bO, 0, 4, 1, 4, var3);
            this.a(var1, pb.ak.bO, 0, 4, 1, 5, var3);
            this.a(var1, pb.ak.bO, 0, 4, 1, 6, var3);
            this.a(var1, pb.ak.bO, 0, 6, 1, 4, var3);
            this.a(var1, pb.ak.bO, 0, 6, 1, 5, var3);
            this.a(var1, pb.ak.bO, 0, 6, 1, 6, var3);
            this.a(var1, pb.ak.bO, 0, 5, 1, 4, var3);
            this.a(var1, pb.ak.bO, 0, 5, 1, 6, var3);
            break;
         case 1:
            for(var4 = 0; var4 < 5; ++var4) {
               this.a(var1, pb.bm.bO, 0, 3, 1, 3 + var4, var3);
               this.a(var1, pb.bm.bO, 0, 7, 1, 3 + var4, var3);
               this.a(var1, pb.bm.bO, 0, 3 + var4, 1, 3, var3);
               this.a(var1, pb.bm.bO, 0, 3 + var4, 1, 7, var3);
            }

            this.a(var1, pb.bm.bO, 0, 5, 1, 5, var3);
            this.a(var1, pb.bm.bO, 0, 5, 2, 5, var3);
            this.a(var1, pb.bm.bO, 0, 5, 3, 5, var3);
            this.a(var1, pb.A.bO, 0, 5, 4, 5, var3);
            break;
         case 2:
            for(var4 = 1; var4 <= 9; ++var4) {
               this.a(var1, pb.w.bO, 0, 1, 3, var4, var3);
               this.a(var1, pb.w.bO, 0, 9, 3, var4, var3);
            }

            for(var4 = 1; var4 <= 9; ++var4) {
               this.a(var1, pb.w.bO, 0, var4, 3, 1, var3);
               this.a(var1, pb.w.bO, 0, var4, 3, 9, var3);
            }

            this.a(var1, pb.w.bO, 0, 5, 1, 4, var3);
            this.a(var1, pb.w.bO, 0, 5, 1, 6, var3);
            this.a(var1, pb.w.bO, 0, 5, 3, 4, var3);
            this.a(var1, pb.w.bO, 0, 5, 3, 6, var3);
            this.a(var1, pb.w.bO, 0, 4, 1, 5, var3);
            this.a(var1, pb.w.bO, 0, 6, 1, 5, var3);
            this.a(var1, pb.w.bO, 0, 4, 3, 5, var3);
            this.a(var1, pb.w.bO, 0, 6, 3, 5, var3);

            for(var4 = 1; var4 <= 3; ++var4) {
               this.a(var1, pb.w.bO, 0, 4, var4, 4, var3);
               this.a(var1, pb.w.bO, 0, 6, var4, 4, var3);
               this.a(var1, pb.w.bO, 0, 4, var4, 6, var3);
               this.a(var1, pb.w.bO, 0, 6, var4, 6, var3);
            }

            this.a(var1, pb.aq.bO, 0, 5, 3, 5, var3);

            for(var4 = 2; var4 <= 8; ++var4) {
               this.a(var1, pb.x.bO, 0, 2, 3, var4, var3);
               this.a(var1, pb.x.bO, 0, 3, 3, var4, var3);
               if(var4 <= 3 || var4 >= 7) {
                  this.a(var1, pb.x.bO, 0, 4, 3, var4, var3);
                  this.a(var1, pb.x.bO, 0, 5, 3, var4, var3);
                  this.a(var1, pb.x.bO, 0, 6, 3, var4, var3);
               }

               this.a(var1, pb.x.bO, 0, 7, 3, var4, var3);
               this.a(var1, pb.x.bO, 0, 8, 3, var4, var3);
            }

            this.a(var1, pb.aF.bO, this.c(pb.aF.bO, 4), 9, 1, 3, var3);
            this.a(var1, pb.aF.bO, this.c(pb.aF.bO, 4), 9, 2, 3, var3);
            this.a(var1, pb.aF.bO, this.c(pb.aF.bO, 4), 9, 3, 3, var3);
            this.a(var1, var3, var2, 3, 4, 8, c, 1 + var2.nextInt(4));
         }

         return true;
      }
   }

}
