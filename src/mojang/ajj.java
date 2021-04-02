package mojang;

public class ajj extends yr {

   public ajj(int var1) {
      super(var1);
      this.bR = 1;
   }

   public boolean a(aan var1, Player var2, World var3, int var4, int var5, int var6, int var7) {
      if(var7 == 0) {
         return false;
      } else if(!var3.f(var4, var5, var6).a()) {
         return false;
      } else {
         if(var7 == 1) {
            ++var5;
         }

         if(var7 == 2) {
            --var6;
         }

         if(var7 == 3) {
            ++var6;
         }

         if(var7 == 4) {
            --var4;
         }

         if(var7 == 5) {
            ++var4;
         }

         if(!var2.e(var4, var5, var6)) {
            return false;
         } else if(!pb.aD.e(var3, var4, var5, var6)) {
            return false;
         } else {
            if(var7 == 1) {
               int var8 = Utils.c((double)((var2.u + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;
               var3.d(var4, var5, var6, pb.aD.bO, var8);
            } else {
               var3.d(var4, var5, var6, pb.aI.bO, var7);
            }

            --var1.a;
            sc var9 = (sc)var3.b(var4, var5, var6);
            if(var9 != null) {
               var2.a(var9);
            }

            return true;
         }
      }
   }
}
