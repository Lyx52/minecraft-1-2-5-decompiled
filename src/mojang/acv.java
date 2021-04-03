package mojang;

public class acv extends yr {

   public acv(int var1) {
      super(var1);
      this.a(true);
   }

   public String d(aan var1) {
      String var2 = ("" + LocalizationManagerWrapper.getLocaleString(this.e() + ".name")).trim();
      String var3 = EntityManager.getNameByID(var1.i());
      if(var3 != null) {
         var2 = var2 + " " + LocalizationManagerWrapper.getLocaleString("entity." + var3 + ".name");
      }

      return var2;
   }

   public int b(int var1, int var2) {
      hr var3 = (hr) EntityManager.a.get(Integer.valueOf(var1));
      return var3 != null?(var2 == 0?var3.b:var3.c):16777215;
   }

   public boolean c() {
      return true;
   }

   public int a(int var1, int var2) {
      return var2 > 0?super.a(var1, var2) + 16:super.a(var1, var2);
   }

   public boolean a(aan var1, Player var2, World var3, int var4, int var5, int var6, int var7) {
      if(var3.F) {
         return true;
      } else {
         int var8 = var3.a(var4, var5, var6);
         var4 += qs.b[var7];
         var5 += qs.c[var7];
         var6 += qs.d[var7];
         double var9 = 0.0D;
         if(var7 == 1 && var8 == pb.aZ.bO || var8 == pb.bB.bO) {
            var9 = 0.5D;
         }

         if(a(var3, var1.i(), (double)var4 + 0.5D, (double)var5 + var9, (double)var6 + 0.5D) && !var2.aT.d) {
            --var1.a;
         }

         return true;
      }
   }

   public static boolean a(World var0, int var1, double var2, double var4, double var6) {
      if(!EntityManager.a.containsKey(Integer.valueOf(var1))) {
         return false;
      } else {
         BaseEntity var8 = EntityManager.createEntity(var1, var0);
         if(var8 != null) {
            var8.c(var2, var4, var6, var0.r.nextFloat() * 360.0F, 0.0F);
            var0.a(var8);
            ((Mob)var8).aZ();
         }

         return var8 != null;
      }
   }
}
