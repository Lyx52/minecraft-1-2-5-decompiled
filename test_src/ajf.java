
public class ajf extends w {

   public ajf(int var1, int var2) {
      super(var1, var2, acn.d);
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return !var1.f(var2, var3 - 1, var4).a()?false:super.e(var1, var2, var3, var4);
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      return e(var5)?null:(var5 != 2 && var5 != 0?wu.b((double)((float)var2 + 0.375F), (double)var3, (double)var4, (double)((float)var2 + 0.625F), (double)((float)var3 + 1.5F), (double)(var4 + 1)):wu.b((double)var2, (double)var3, (double)((float)var4 + 0.375F), (double)(var2 + 1), (double)((float)var3 + 1.5F), (double)((float)var4 + 0.625F)));
   }

   public void a(ali var1, int var2, int var3, int var4) {
      int var5 = a(var1.e(var2, var3, var4));
      if(var5 != 2 && var5 != 0) {
         this.a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
      }

   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean b(ali var1, int var2, int var3, int var4) {
      return e(var1.e(var2, var3, var4));
   }

   public int d() {
      return 21;
   }

   public void a(xd var1, int var2, int var3, int var4, acq var5) {
      int var6 = (gk.c((double)(var5.u * 4.0F / 360.0F) + 0.5D) & 3) % 4;
      var1.f(var2, var3, var4, var6);
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      int var6 = var1.e(var2, var3, var4);
      if(e(var6)) {
         var1.f(var2, var3, var4, var6 & -5);
      } else {
         int var7 = (gk.c((double)(var5.u * 4.0F / 360.0F) + 0.5D) & 3) % 4;
         int var8 = a(var6);
         if(var8 == (var7 + 2) % 4) {
            var6 = var7;
         }

         var1.f(var2, var3, var4, var6 | 4);
      }

      var1.a(var5, 1003, var2, var3, var4, 0);
      return true;
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      if(!var1.F) {
         int var6 = var1.e(var2, var3, var4);
         boolean var7 = var1.x(var2, var3, var4);
         if(var7 || var5 > 0 && pb.m[var5].g() || var5 == 0) {
            if(var7 && !e(var6)) {
               var1.f(var2, var3, var4, var6 | 4);
               var1.a((yw)null, 1003, var2, var3, var4, 0);
            } else if(!var7 && e(var6)) {
               var1.f(var2, var3, var4, var6 & -5);
               var1.a((yw)null, 1003, var2, var3, var4, 0);
            }
         }

      }
   }

   public static boolean e(int var0) {
      return (var0 & 4) != 0;
   }
}
