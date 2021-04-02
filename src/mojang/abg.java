package mojang;

public class abg extends pb {

   public abg(int var1, int var2) {
      super(var1, var2, acn.d);
   }

   public abg(int var1, int var2, acn var3) {
      super(var1, var2, var3);
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return super.e(var1, var2, var3, var4);
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      boolean var5 = this.g(var1, var2, var3, var4 - 1);
      boolean var6 = this.g(var1, var2, var3, var4 + 1);
      boolean var7 = this.g(var1, var2 - 1, var3, var4);
      boolean var8 = this.g(var1, var2 + 1, var3, var4);
      float var9 = 0.375F;
      float var10 = 0.625F;
      float var11 = 0.375F;
      float var12 = 0.625F;
      if(var5) {
         var11 = 0.0F;
      }

      if(var6) {
         var12 = 1.0F;
      }

      if(var7) {
         var9 = 0.0F;
      }

      if(var8) {
         var10 = 1.0F;
      }

      return wu.b((double)((float)var2 + var9), (double)var3, (double)((float)var4 + var11), (double)((float)var2 + var10), (double)((float)var3 + 1.5F), (double)((float)var4 + var12));
   }

   public void a(ali var1, int var2, int var3, int var4) {
      boolean var5 = this.g(var1, var2, var3, var4 - 1);
      boolean var6 = this.g(var1, var2, var3, var4 + 1);
      boolean var7 = this.g(var1, var2 - 1, var3, var4);
      boolean var8 = this.g(var1, var2 + 1, var3, var4);
      float var9 = 0.375F;
      float var10 = 0.625F;
      float var11 = 0.375F;
      float var12 = 0.625F;
      if(var5) {
         var11 = 0.0F;
      }

      if(var6) {
         var12 = 1.0F;
      }

      if(var7) {
         var9 = 0.0F;
      }

      if(var8) {
         var10 = 1.0F;
      }

      this.a(var9, 0.0F, var11, var10, 1.0F, var12);
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean b(ali var1, int var2, int var3, int var4) {
      return false;
   }

   public int d() {
      return 11;
   }

   public boolean g(ali var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      if(var5 != this.bO && var5 != bv.bO) {
         pb var6 = m[var5];
         return var6 != null && var6.cd.j() && var6.b()?var6.cd != acn.z:false;
      } else {
         return true;
      }
   }
}
