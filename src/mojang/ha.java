package mojang;

import java.util.Random;

public class ha extends pb {

   protected ha(int var1, int var2) {
      super(var1, var2, acn.v);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.a(true);
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4) & 7;
      return var5 >= 3?wu.b((double)var2 + this.bV, (double)var3 + this.bW, (double)var4 + this.bX, (double)var2 + this.bY, (double)((float)var3 + 0.5F), (double)var4 + this.ca):null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public void a(ali var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4) & 7;
      float var6 = (float)(2 * (1 + var5)) / 16.0F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, var6, 1.0F);
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      return var5 != 0 && (var5 == K.bO || m[var5].a())?var1.f(var2, var3 - 1, var4).c():false;
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      this.h(var1, var2, var3, var4);
   }

   private boolean h(xd var1, int var2, int var3, int var4) {
      if(!this.e(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public void a(xd var1, yw var2, int var3, int var4, int var5, int var6) {
      int var7 = yr.aD.bQ;
      float var8 = 0.7F;
      double var9 = (double)(var1.r.nextFloat() * var8) + (double)(1.0F - var8) * 0.5D;
      double var11 = (double)(var1.r.nextFloat() * var8) + (double)(1.0F - var8) * 0.5D;
      double var13 = (double)(var1.r.nextFloat() * var8) + (double)(1.0F - var8) * 0.5D;
      fq var15 = new fq(var1, (double)var3 + var9, (double)var4 + var11, (double)var5 + var13, new aan(var7, 1, 0));
      var15.c = 10;
      var1.a((nn)var15);
      var1.g(var3, var4, var5, 0);
      var2.a(gv.C[this.bO], 1);
   }

   public int a(int var1, Random var2, int var3) {
      return yr.aD.bQ;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(var1.b(wl.b, var2, var3, var4) > 11) {
         this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public boolean a(ali var1, int var2, int var3, int var4, int var5) {
      return var5 == 1?true:super.a(var1, var2, var3, var4, var5);
   }
}
