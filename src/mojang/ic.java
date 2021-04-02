package mojang;

public class ic extends yr {

   public ic(int var1, uk var2) {
      super(var1);
      this.bR = 1;
      this.g(var2.a());
   }

   public boolean a(aan var1, Player var2, World var3, int var4, int var5, int var6, int var7) {
      if(!var2.e(var4, var5, var6)) {
         return false;
      } else {
         int var8 = var3.a(var4, var5, var6);
         int var9 = var3.a(var4, var5 + 1, var6);
         if((var7 == 0 || var9 != 0 || var8 != pb.u.bO) && var8 != pb.v.bO) {
            return false;
         } else {
            pb var10 = pb.aA;
            var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var10.cb.d(), (var10.cb.b() + 1.0F) / 2.0F, var10.cb.c() * 0.8F);
            if(var3.F) {
               return true;
            } else {
               var3.g(var4, var5, var6, var10.bO);
               var1.a(1, var2);
               return true;
            }
         }
      }
   }

   public boolean a() {
      return true;
   }
}
