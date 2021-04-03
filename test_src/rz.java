import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class rz {

   public static ArrayList a(Random var0, int var1) {
      ArrayList var2 = new ArrayList();
      var2.add(new dt(ey.class, 4, gk.a(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new dt(aeu.class, 20, gk.a(var0, 0 + var1, 1 + var1)));
      var2.add(new dt(akc.class, 20, gk.a(var0, 0 + var1, 2 + var1)));
      var2.add(new dt(amk.class, 3, gk.a(var0, 2 + var1, 5 + var1 * 3)));
      var2.add(new dt(p.class, 15, gk.a(var0, 0 + var1, 2 + var1)));
      var2.add(new dt(k.class, 3, gk.a(var0, 1 + var1, 4 + var1)));
      var2.add(new dt(qf.class, 3, gk.a(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new dt(cq.class, 15, gk.a(var0, 0, 1 + var1)));
      var2.add(new dt(yb.class, 8, gk.a(var0, 0 + var1, 3 + var1 * 2)));
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         if(((dt)var3.next()).d == 0) {
            var3.remove();
         }
      }

      return var2;
   }

   private static int a(ArrayList var0) {
      boolean var1 = false;
      int var2 = 0;

      dt var4;
      for(Iterator var3 = var0.iterator(); var3.hasNext(); var2 += var4.b) {
         var4 = (dt)var3.next();
         if(var4.d > 0 && var4.c < var4.d) {
            var1 = true;
         }
      }

      return var1?var2:-1;
   }

   private static aih a(dt var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      Class var8 = var0.a;
      Object var9 = null;
      if(var8 == ey.class) {
         var9 = ey.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == aeu.class) {
         var9 = aeu.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == akc.class) {
         var9 = akc.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == amk.class) {
         var9 = amk.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == p.class) {
         var9 = p.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == k.class) {
         var9 = k.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == qf.class) {
         var9 = qf.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == cq.class) {
         var9 = cq.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == yb.class) {
         var9 = yb.a(var1, var2, var3, var4, var5, var6, var7);
      }

      return (aih)var9;
   }

   private static aih c(g var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = a(var0.d);
      if(var8 <= 0) {
         return null;
      } else {
         int var9 = 0;

         while(var9 < 5) {
            ++var9;
            int var10 = var2.nextInt(var8);
            Iterator var11 = var0.d.iterator();

            while(var11.hasNext()) {
               dt var12 = (dt)var11.next();
               var10 -= var12.b;
               if(var10 < 0) {
                  if(!var12.a(var7) || var12 == var0.c && var0.d.size() > 1) {
                     break;
                  }

                  aih var13 = a(var12, var1, var2, var3, var4, var5, var6, var7);
                  if(var13 != null) {
                     ++var12.c;
                     var0.c = var12;
                     if(!var12.a()) {
                        var0.d.remove(var12);
                     }

                     return var13;
                  }
               }
            }
         }

         qg var14 = aev.a(var1, var2, var3, var4, var5, var6);
         if(var14 != null) {
            return new aev(var7, var2, var14, var6);
         } else {
            return null;
         }
      }
   }

   private static he d(g var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 50) {
         return null;
      } else if(Math.abs(var3 - var0.b().a) <= 112 && Math.abs(var5 - var0.b().c) <= 112) {
         aih var8 = c(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if(var8 != null) {
            int var9 = (var8.g.a + var8.g.d) / 2;
            int var10 = (var8.g.c + var8.g.f) / 2;
            int var11 = var8.g.d - var8.g.a;
            int var12 = var8.g.f - var8.g.c;
            int var13 = var11 > var12?var11:var12;
            if(var0.a().a(var9, var10, var13 / 2 + 4, an.a)) {
               var1.add(var8);
               var0.e.add(var8);
               return var8;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static he e(g var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 3 + var0.b) {
         return null;
      } else if(Math.abs(var3 - var0.b().a) <= 112 && Math.abs(var5 - var0.b().c) <= 112) {
         qg var8 = aie.a(var0, var1, var2, var3, var4, var5, var6);
         if(var8 != null && var8.b > 10) {
            aie var9 = new aie(var7, var2, var8, var6);
            int var10 = (var9.g.a + var9.g.d) / 2;
            int var11 = (var9.g.c + var9.g.f) / 2;
            int var12 = var9.g.d - var9.g.a;
            int var13 = var9.g.f - var9.g.c;
            int var14 = var12 > var13?var12:var13;
            if(var0.a().a(var10, var11, var14 / 2 + 4, an.a)) {
               var1.add(var9);
               var0.f.add(var9);
               return var9;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static he a(g var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return d(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static he b(g var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return e(var0, var1, var2, var3, var4, var5, var6, var7);
   }
}
