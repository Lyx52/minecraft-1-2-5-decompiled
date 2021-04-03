import java.util.List;
import java.util.Random;

public class ys extends fh {

   private static final fx[] a = new fx[]{new fx(yr.bn.bQ, 0, 1, 1, 10), new fx(yr.n.bQ, 0, 1, 3, 3), new fx(yr.o.bQ, 0, 1, 5, 10), new fx(yr.p.bQ, 0, 1, 3, 5), new fx(yr.aC.bQ, 0, 4, 9, 5), new fx(yr.U.bQ, 0, 1, 3, 15), new fx(yr.j.bQ, 0, 1, 3, 15), new fx(yr.g.bQ, 0, 1, 1, 5), new fx(yr.q.bQ, 0, 1, 1, 5), new fx(yr.ae.bQ, 0, 1, 1, 5), new fx(yr.ad.bQ, 0, 1, 1, 5), new fx(yr.af.bQ, 0, 1, 1, 5), new fx(yr.ag.bQ, 0, 1, 1, 5), new fx(yr.at.bQ, 0, 1, 1, 1)};
   private final mg b;
   private boolean c;


   public ys(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.b = this.a(var2);
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {
      this.a((s)var1, var2, var3, 1, 1);
   }

   public static ys a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return a(var7) && he.a(var0, var7) == null?new ys(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, abb.b());
         this.a(var1, var2, var3, this.b, 1, 1, 0);
         this.a(var1, var2, var3, mg.a, 1, 1, 6);
         this.a(var1, var3, 3, 1, 2, 3, 1, 4, pb.bm.bO, pb.bm.bO, false);
         this.a(var1, pb.ak.bO, 5, 3, 1, 1, var3);
         this.a(var1, pb.ak.bO, 5, 3, 1, 5, var3);
         this.a(var1, pb.ak.bO, 5, 3, 2, 2, var3);
         this.a(var1, pb.ak.bO, 5, 3, 2, 4, var3);

         int var4;
         for(var4 = 2; var4 <= 4; ++var4) {
            this.a(var1, pb.ak.bO, 5, 2, 1, var4, var3);
         }

         if(!this.c) {
            var4 = this.b(2);
            int var5 = this.a(3, 3);
            int var6 = this.b(3, 3);
            if(var3.b(var5, var4, var6)) {
               this.c = true;
               this.a(var1, var3, var2, 3, 2, 3, a, 2 + var2.nextInt(2));
            }
         }

         return true;
      }
   }

}
