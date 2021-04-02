package mojang;

import java.util.Random;

public class ov extends pb {

   protected ov(int var1, int var2) {
      super(var1, var2, acn.C);
      this.a(true);
   }

   public void a(WorldInterface var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      this.a(var7, 0.0F, var6, 1.0F - var6, var8, 1.0F - var6);
   }

   public void h() {
      float var1 = 0.0625F;
      float var2 = 0.5F;
      this.a(var1, 0.0F, var1, 1.0F - var1, var2, 1.0F - var1);
   }

   public wu c(World var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      return wu.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)var3 + var8 - var6), (double)((float)(var4 + 1) - var6));
   }

   public wu d(World var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      return wu.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)var3 + var8), (double)((float)(var4 + 1) - var6));
   }

   public int a(int var1, int var2) {
      return var1 == 1?this.bN:(var1 == 0?this.bN + 3:(var2 > 0 && var1 == 4?this.bN + 2:this.bN + 1));
   }

   public int a_(int var1) {
      return var1 == 1?this.bN:(var1 == 0?this.bN + 3:this.bN + 1);
   }

   public boolean b() {
      return false;
   }

   public boolean a() {
      return false;
   }

   public boolean b(World var1, int var2, int var3, int var4, Player var5) {
      this.c(var1, var2, var3, var4, var5);
      return true;
   }

   public void a(World var1, int var2, int var3, int var4, Player var5) {
      this.c(var1, var2, var3, var4, var5);
   }

   private void c(World var1, int var2, int var3, int var4, Player var5) {
      if(var5.a(false)) {
         var5.aF().a(2, 0.1F);
         int var6 = var1.e(var2, var3, var4) + 1;
         if(var6 >= 6) {
            var1.g(var2, var3, var4, 0);
         } else {
            var1.f(var2, var3, var4, var6);
            var1.l(var2, var3, var4);
         }
      }

   }

   public boolean e(World var1, int var2, int var3, int var4) {
      return !super.e(var1, var2, var3, var4)?false:this.g(var1, var2, var3, var4);
   }

   public void a(World var1, int var2, int var3, int var4, int var5) {
      if(!this.g(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public boolean g(World var1, int var2, int var3, int var4) {
      return var1.f(var2, var3 - 1, var4).a();
   }

   public int a(Random var1) {
      return 0;
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }
}
