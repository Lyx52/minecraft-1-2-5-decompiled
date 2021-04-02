package mojang;

import java.util.ArrayList;
import java.util.Random;

public class amj extends pb {

   public amj(int var1) {
      super(var1, 159, acn.q);
   }

   public int a(int var1, int var2) {
      return var1 == 1?this.bN - 1:(var1 == 0?this.bN + 16:this.bN);
   }

   public boolean a() {
      return false;
   }

   public int d() {
      return 26;
   }

   public void h() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
   }

   public void a(World var1, int var2, int var3, int var4, wu var5, ArrayList var6) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
      int var7 = var1.e(var2, var3, var4);
      if(e(var7)) {
         this.a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
         super.a(var1, var2, var3, var4, var5, var6);
      }

      this.h();
   }

   public static boolean e(int var0) {
      return (var0 & 4) != 0;
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public void a(World var1, int var2, int var3, int var4, Mob var5) {
      int var6 = ((Utils.c((double)(var5.u * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.f(var2, var3, var4, var6);
   }
}
