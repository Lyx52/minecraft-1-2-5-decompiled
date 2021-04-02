package mojang;

public class agq extends aky {

   public agq(int var1) {
      super(var1, false);
   }

   public aan a(aan var1, World var2, Player var3) {
      pl var4 = this.a(var2, var3, true);
      if(var4 == null) {
         return var1;
      } else {
         if(var4.a == aat.a) {
            int var5 = var4.b;
            int var6 = var4.c;
            int var7 = var4.d;
            if(!var2.a(var3, var5, var6, var7)) {
               return var1;
            }

            if(!var3.e(var5, var6, var7)) {
               return var1;
            }

            if(var2.f(var5, var6, var7) == acn.g && var2.e(var5, var6, var7) == 0 && var2.i(var5, var6 + 1, var7)) {
               var2.g(var5, var6 + 1, var7, pb.bz.bO);
               if(!var3.aT.d) {
                  --var1.a;
               }
            }
         }

         return var1;
      }
   }

   public int b(int var1, int var2) {
      return pb.bz.d(var1);
   }
}
