
public class zx extends yr {

   public zx(int var1) {
      super(var1);
   }

   public boolean a(aan var1, yw var2, xd var3, int var4, int var5, int var6, int var7) {
      if(var3.a(var4, var5, var6) != pb.aS.bO) {
         if(var7 == 0) {
            --var5;
         }

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

         if(!var3.i(var4, var5, var6)) {
            return false;
         }
      }

      if(!var2.e(var4, var5, var6)) {
         return false;
      } else {
         if(pb.av.e(var3, var4, var5, var6)) {
            --var1.a;
            var3.g(var4, var5, var6, pb.av.bO);
         }

         return true;
      }
   }
}
