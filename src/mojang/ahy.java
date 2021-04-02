package mojang;

public class ahy extends wp {

   private abn[] b;


   public ahy(long var1, wp var3, WorldGeneratorTypes var4) {
      super(var1);
      this.b = new abn[]{abn.d, abn.f, abn.e, abn.h, abn.c, abn.g, abn.w};
      this.a = var3;
      if(var4 == WorldGeneratorTypes.default_1_1) {
         this.b = new abn[]{abn.d, abn.f, abn.e, abn.h, abn.c, abn.g};
      }

   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.a.a(var1, var2, var3, var4);
      int[] var6 = ad.a(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.a((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + var7 * var3];
            if(var9 == 0) {
               var6[var8 + var7 * var3] = 0;
            } else if(var9 == abn.p.M) {
               var6[var8 + var7 * var3] = var9;
            } else if(var9 == 1) {
               var6[var8 + var7 * var3] = this.b[this.a(this.b.length)].M;
            } else {
               var6[var8 + var7 * var3] = abn.n.M;
            }
         }
      }

      return var6;
   }
}
