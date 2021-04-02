package mojang;

public class amb extends yr {

   public amb(int var1) {
      super(var1);
   }

   public boolean a(aan var1, yw var2, xd var3, int var4, int var5, int var6, int var7) {
      if(var7 == 0) {
         return false;
      } else if(var7 == 1) {
         return false;
      } else {
         byte var8 = 0;
         if(var7 == 4) {
            var8 = 1;
         }

         if(var7 == 3) {
            var8 = 2;
         }

         if(var7 == 5) {
            var8 = 3;
         }

         if(!var2.e(var4, var5, var6)) {
            return false;
         } else {
            mk var9 = new mk(var3, var4, var5, var6, var8);
            if(var9.n()) {
               if(!var3.F) {
                  var3.a((nn)var9);
               }

               --var1.a;
            }

            return true;
         }
      }
   }
}
