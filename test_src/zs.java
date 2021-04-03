
public class zs extends yr {

   private acn a;


   public zs(int var1, acn var2) {
      super(var1);
      this.a = var2;
      this.bR = 1;
   }

   public boolean a(aan var1, yw var2, xd var3, int var4, int var5, int var6, int var7) {
      if(var7 != 1) {
         return false;
      } else {
         ++var5;
         pb var8;
         if(this.a == acn.d) {
            var8 = pb.aE;
         } else {
            var8 = pb.aL;
         }

         if(var2.e(var4, var5, var6) && var2.e(var4, var5 + 1, var6)) {
            if(!var8.e(var3, var4, var5, var6)) {
               return false;
            } else {
               int var9 = gk.c((double)((var2.u + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
               a(var3, var4, var5, var6, var9, var8);
               --var1.a;
               return true;
            }
         } else {
            return false;
         }
      }
   }

   public static void a(xd var0, int var1, int var2, int var3, int var4, pb var5) {
      byte var6 = 0;
      byte var7 = 0;
      if(var4 == 0) {
         var7 = 1;
      }

      if(var4 == 1) {
         var6 = -1;
      }

      if(var4 == 2) {
         var7 = -1;
      }

      if(var4 == 3) {
         var6 = 1;
      }

      int var8 = (var0.h(var1 - var6, var2, var3 - var7)?1:0) + (var0.h(var1 - var6, var2 + 1, var3 - var7)?1:0);
      int var9 = (var0.h(var1 + var6, var2, var3 + var7)?1:0) + (var0.h(var1 + var6, var2 + 1, var3 + var7)?1:0);
      boolean var10 = var0.a(var1 - var6, var2, var3 - var7) == var5.bO || var0.a(var1 - var6, var2 + 1, var3 - var7) == var5.bO;
      boolean var11 = var0.a(var1 + var6, var2, var3 + var7) == var5.bO || var0.a(var1 + var6, var2 + 1, var3 + var7) == var5.bO;
      boolean var12 = false;
      if(var10 && !var11) {
         var12 = true;
      } else if(var9 > var8) {
         var12 = true;
      }

      var0.o = true;
      var0.d(var1, var2, var3, var5.bO, var4);
      var0.d(var1, var2 + 1, var3, var5.bO, 8 | (var12?1:0));
      var0.o = false;
      var0.j(var1, var2, var3, var5.bO);
      var0.j(var1, var2 + 1, var3, var5.bO);
   }
}
