import java.util.List;
import java.util.Random;

public class gp {

   private static final fx[] a = new fx[]{new fx(yr.o.bQ, 0, 1, 5, 10), new fx(yr.p.bQ, 0, 1, 3, 5), new fx(yr.aC.bQ, 0, 4, 9, 5), new fx(yr.aW.bQ, 4, 4, 9, 5), new fx(yr.n.bQ, 0, 1, 2, 3), new fx(yr.m.bQ, 0, 3, 8, 10), new fx(yr.U.bQ, 0, 1, 3, 15), new fx(yr.g.bQ, 0, 1, 1, 1), new fx(pb.aG.bO, 0, 4, 8, 1), new fx(yr.bh.bQ, 0, 2, 4, 10), new fx(yr.bg.bQ, 0, 2, 4, 10)};


   private static he a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1.nextInt(100);
      qg var8;
      if(var7 >= 80) {
         var8 = ka.a(var0, var1, var2, var3, var4, var5);
         if(var8 != null) {
            return new ka(var6, var1, var8, var5);
         }
      } else if(var7 >= 70) {
         var8 = ia.a(var0, var1, var2, var3, var4, var5);
         if(var8 != null) {
            return new ia(var6, var1, var8, var5);
         }
      } else {
         var8 = ny.a(var0, var1, var2, var3, var4, var5);
         if(var8 != null) {
            return new ny(var6, var1, var8, var5);
         }
      }

      return null;
   }

   private static he b(he var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 8) {
         return null;
      } else if(Math.abs(var3 - var0.b().a) <= 80 && Math.abs(var5 - var0.b().c) <= 80) {
         he var8 = a(var1, var2, var3, var4, var5, var6, var7 + 1);
         if(var8 != null) {
            var1.add(var8);
            var8.a(var0, var1, var2);
         }

         return var8;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static he a(he var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return b(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static fx[] a() {
      return a;
   }

}
