
public class aco extends yr {

   public aco(int var1) {
      super(var1);
   }

   public boolean a(aan var1, yw var2, xd var3, int var4, int var5, int var6, int var7) {
      if(var7 != 1) {
         return false;
      } else {
         ++var5;
         pm var8 = (pm)pb.S;
         int var9 = gk.c((double)(var2.u * 4.0F / 360.0F) + 0.5D) & 3;
         byte var10 = 0;
         byte var11 = 0;
         if(var9 == 0) {
            var11 = 1;
         }

         if(var9 == 1) {
            var10 = -1;
         }

         if(var9 == 2) {
            var11 = -1;
         }

         if(var9 == 3) {
            var10 = 1;
         }

         if(var2.e(var4, var5, var6) && var2.e(var4 + var10, var5, var6 + var11)) {
            if(var3.i(var4, var5, var6) && var3.i(var4 + var10, var5, var6 + var11) && var3.h(var4, var5 - 1, var6) && var3.h(var4 + var10, var5 - 1, var6 + var11)) {
               var3.d(var4, var5, var6, var8.bO, var9);
               if(var3.a(var4, var5, var6) == var8.bO) {
                  var3.d(var4 + var10, var5, var6 + var11, var8.bO, var9 + 8);
               }

               --var1.a;
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }
}
