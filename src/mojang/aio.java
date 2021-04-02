package mojang;

public class aio extends yr {

   public aio(int var1) {
      super(var1);
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

            if(var2.f(var5, var6, var7) == acn.g) {
               --var1.a;
               if(var1.a <= 0) {
                  return new aan(bs);
               }

               if(!var3.ap.a(new aan(bs))) {
                  var3.a(new aan(bs.bQ, 1, 0));
               }
            }
         }

         return var1;
      }
   }
}
