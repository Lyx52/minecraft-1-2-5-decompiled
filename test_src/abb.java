import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class abb {

   private static final ahh[] b = new ahh[]{new ahh(kp.class, 40, 0), new ahh(aex.class, 5, 5), new ahh(oi.class, 20, 0), new ahh(ku.class, 20, 0), new ahh(aby.class, 10, 6), new ahh(aed.class, 5, 5), new ahh(gd.class, 5, 5), new ahh(ajs.class, 5, 4), new ahh(ys.class, 5, 4), new as(adf.class, 10, 2), new ar(acl.class, 20, 1)};
   private static List c;
   private static Class d;
   static int a = 0;
   private static final ajl e = new ajl((as)null);


   public static void a() {
      c = new ArrayList();
      ahh[] var0 = b;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         ahh var3 = var0[var2];
         var3.c = 0;
         c.add(var3);
      }

      d = null;
   }

   private static boolean c() {
      boolean var0 = false;
      a = 0;

      ahh var2;
      for(Iterator var1 = c.iterator(); var1.hasNext(); a += var2.b) {
         var2 = (ahh)var1.next();
         if(var2.d > 0 && var2.c < var2.d) {
            var0 = true;
         }
      }

      return var0;
   }

   private static fh a(Class var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      Object var8 = null;
      if(var0 == kp.class) {
         var8 = kp.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == aex.class) {
         var8 = aex.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == oi.class) {
         var8 = oi.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == ku.class) {
         var8 = ku.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == aby.class) {
         var8 = aby.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == aed.class) {
         var8 = aed.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == gd.class) {
         var8 = gd.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == ajs.class) {
         var8 = ajs.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == ys.class) {
         var8 = ys.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == adf.class) {
         var8 = adf.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == acl.class) {
         var8 = acl.a(var1, var2, var3, var4, var5, var6, var7);
      }

      return (fh)var8;
   }

   private static fh b(s var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(!c()) {
         return null;
      } else {
         if(d != null) {
            fh var8 = a(d, var1, var2, var3, var4, var5, var6, var7);
            d = null;
            if(var8 != null) {
               return var8;
            }
         }

         int var13 = 0;

         while(var13 < 5) {
            ++var13;
            int var9 = var2.nextInt(a);
            Iterator var10 = c.iterator();

            while(var10.hasNext()) {
               ahh var11 = (ahh)var10.next();
               var9 -= var11.b;
               if(var9 < 0) {
                  if(!var11.a(var7) || var11 == var0.a) {
                     break;
                  }

                  fh var12 = a(var11.a, var1, var2, var3, var4, var5, var6, var7);
                  if(var12 != null) {
                     ++var11.c;
                     var0.a = var11;
                     if(!var11.a()) {
                        c.remove(var11);
                     }

                     return var12;
                  }
               }
            }
         }

         qg var14 = kj.a(var1, var2, var3, var4, var5, var6);
         if(var14 != null && var14.b > 1) {
            return new kj(var7, var2, var14, var6);
         } else {
            return null;
         }
      }
   }

   private static he c(s var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 50) {
         return null;
      } else if(Math.abs(var3 - var0.b().a) <= 112 && Math.abs(var5 - var0.b().c) <= 112) {
         fh var8 = b(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if(var8 != null) {
            var1.add(var8);
            var0.c.add(var8);
         }

         return var8;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static he a(s var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return c(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static Class a(Class var0) {
      d = var0;
      return var0;
   }

   // $FF: synthetic method
   static ajl b() {
      return e;
   }

}
