package mojang;

public class wt extends vd {

   public wt(int var1) {
      super(var1);
      this.g(0);
      this.a(true);
   }

   public int b(int var1) {
      return pb.ak.a(2, var1);
   }

   public int a(int var1) {
      return var1;
   }

   public String a(aan var1) {
      int var2 = var1.i();
      if(var2 < 0 || var2 >= amh.a.length) {
         var2 = 0;
      }

      return super.e() + "." + amh.a[var2];
   }

   public boolean a(aan var1, yw var2, xd var3, int var4, int var5, int var6, int var7) {
      if(var1.a == 0) {
         return false;
      } else if(!var2.e(var4, var5, var6)) {
         return false;
      } else {
         int var8 = var3.a(var4, var5, var6);
         int var9 = var3.e(var4, var5, var6);
         int var10 = var9 & 7;
         boolean var11 = (var9 & 8) != 0;
         if((var7 == 1 && !var11 || var7 == 0 && var11) && var8 == pb.ak.bO && var10 == var1.i()) {
            if(var3.a(pb.aj.c(var3, var4, var5, var6)) && var3.d(var4, var5, var6, pb.aj.bO, var10)) {
               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), pb.aj.cb.d(), (pb.aj.cb.b() + 1.0F) / 2.0F, pb.aj.cb.c() * 0.8F);
               --var1.a;
            }

            return true;
         } else {
            return b(var1, var2, var3, var4, var5, var6, var7)?true:super.a(var1, var2, var3, var4, var5, var6, var7);
         }
      }
   }

   private static boolean b(aan var0, yw var1, xd var2, int var3, int var4, int var5, int var6) {
      if(var6 == 0) {
         --var4;
      }

      if(var6 == 1) {
         ++var4;
      }

      if(var6 == 2) {
         --var5;
      }

      if(var6 == 3) {
         ++var5;
      }

      if(var6 == 4) {
         --var3;
      }

      if(var6 == 5) {
         ++var3;
      }

      int var7 = var2.a(var3, var4, var5);
      int var8 = var2.e(var3, var4, var5);
      int var9 = var8 & 7;
      if(var7 == pb.ak.bO && var9 == var0.i()) {
         if(var2.a(pb.aj.c(var2, var3, var4, var5)) && var2.d(var3, var4, var5, pb.aj.bO, var9)) {
            var2.a((double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), pb.aj.cb.d(), (pb.aj.cb.b() + 1.0F) / 2.0F, pb.aj.cb.c() * 0.8F);
            --var0.a;
         }

         return true;
      } else {
         return false;
      }
   }
}
