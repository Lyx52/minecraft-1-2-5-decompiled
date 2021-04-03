import java.util.ArrayList;
import java.util.Random;

public class xm extends pb {

   public xm(int var1) {
      super(var1, acn.f);
      this.bN = 154;
   }

   public int a(int var1, int var2) {
      return var1 == 1?138:(var1 == 0?155:154);
   }

   public void a(xd var1, int var2, int var3, int var4, wu var5, ArrayList var6) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
      float var7 = 0.125F;
      this.a(0.0F, 0.0F, 0.0F, var7, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var7);
      super.a(var1, var2, var3, var4, var5, var6);
      this.a(1.0F - var7, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
      this.a(0.0F, 0.0F, 1.0F - var7, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
      this.h();
   }

   public void h() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public boolean a() {
      return false;
   }

   public int d() {
      return 24;
   }

   public boolean b() {
      return false;
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      if(var1.F) {
         return true;
      } else {
         aan var6 = var5.ap.b();
         if(var6 == null) {
            return true;
         } else {
            int var7 = var1.e(var2, var3, var4);
            if(var6.c == yr.ax.bQ) {
               if(var7 < 3) {
                  if(!var5.aT.d) {
                     var5.ap.a(var5.ap.c, new aan(yr.aw));
                  }

                  var1.f(var2, var3, var4, 3);
               }

               return true;
            } else {
               if(var6.c == yr.bt.bQ && var7 > 0) {
                  aan var8 = new aan(yr.bs, 1, 0);
                  if(!var5.ap.a(var8)) {
                     var1.a((nn)(new fq(var1, (double)var2 + 0.5D, (double)var3 + 1.5D, (double)var4 + 0.5D, var8)));
                  }

                  --var6.a;
                  if(var6.a <= 0) {
                     var5.ap.a(var5.ap.c, (aan)null);
                  }

                  var1.f(var2, var3, var4, var7 - 1);
               }

               return true;
            }
         }
      }
   }

   public int a(int var1, Random var2, int var3) {
      return yr.bz.bQ;
   }
}
