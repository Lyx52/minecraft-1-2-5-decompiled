package mojang;

public class alx extends yr {

   public alx(int var1) {
      super(var1);
      this.bR = 1;
      this.g(64);
   }

   public boolean a(aan var1, Player var2, World var3, int var4, int var5, int var6, int var7) {
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

      if(!var2.e(var4, var5, var6)) {
         return false;
      } else {
         int var8 = var3.a(var4, var5, var6);
         if(var8 == 0) {
            var3.a((double)var4 + 0.5D, (double)var5 + 0.5D, (double)var6 + 0.5D, "fire.ignite", 1.0F, d.nextFloat() * 0.4F + 0.8F);
            var3.g(var4, var5, var6, pb.ar.bO);
         }

         var1.a(1, var2);
         return true;
      }
   }
}
