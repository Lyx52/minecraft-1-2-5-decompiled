package mojang;

public class mm extends yr {

   public mm(int var1) {
      super(var1);
      this.bR = 1;
      this.g(384);
   }

   public void a(aan var1, xd var2, yw var3, int var4) {
      boolean var5 = var3.aT.d || ais.a(jt.v.w, var1) > 0;
      if(var5 || var3.ap.e(yr.l.bQ)) {
         int var6 = this.b(var1) - var4;
         float var7 = (float)var6 / 20.0F;
         var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;
         if((double)var7 < 0.1D) {
            return;
         }

         if(var7 > 1.0F) {
            var7 = 1.0F;
         }

         nm var8 = new nm(var2, var3, var7 * 2.0F);
         if(var7 == 1.0F) {
            var8.d = true;
         }

         int var9 = ais.a(jt.s.w, var1);
         if(var9 > 0) {
            var8.b(var8.n() + (double)var9 * 0.5D + 0.5D);
         }

         int var10 = ais.a(jt.t.w, var1);
         if(var10 > 0) {
            var8.b(var10);
         }

         if(ais.a(jt.u.w, var1) > 0) {
            var8.e(100);
         }

         var1.a(1, var3);
         var2.a(var3, "random.bow", 1.0F, 1.0F / (d.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);
         if(!var5) {
            var3.ap.d(yr.l.bQ);
         } else {
            var8.a = false;
         }

         if(!var2.F) {
            var2.a((nn)var8);
         }
      }

   }

   public aan b(aan var1, xd var2, yw var3) {
      return var1;
   }

   public int b(aan var1) {
      return 72000;
   }

   public aaq c(aan var1) {
      return aaq.e;
   }

   public aan a(aan var1, xd var2, yw var3) {
      if(var3.aT.d || var3.ap.e(yr.l.bQ)) {
         var3.c(var1, this.b(var1));
      }

      return var1;
   }

   public int b() {
      return 1;
   }
}
