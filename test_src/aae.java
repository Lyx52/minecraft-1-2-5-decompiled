
public class aae extends wp {

   public aae(long var1, wp var3) {
      super(var1);
      this.a = var3;
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.a.a(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var6 = ad.a(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.a((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + 1 + (var7 + 1) * (var3 + 2)];
            int var10;
            int var11;
            int var12;
            int var13;
            if(var9 == abn.p.M) {
               var10 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
               var11 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
               var12 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
               var13 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
               if(var10 != abn.b.M && var11 != abn.b.M && var12 != abn.b.M && var13 != abn.b.M) {
                  var6[var8 + var7 * var3] = var9;
               } else {
                  var6[var8 + var7 * var3] = abn.q.M;
               }
            } else if(var9 != abn.b.M && var9 != abn.i.M && var9 != abn.h.M && var9 != abn.e.M) {
               var10 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
               var11 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
               var12 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
               var13 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
               if(var10 != abn.b.M && var11 != abn.b.M && var12 != abn.b.M && var13 != abn.b.M) {
                  var6[var8 + var7 * var3] = var9;
               } else {
                  var6[var8 + var7 * var3] = abn.r.M;
               }
            } else if(var9 == abn.e.M) {
               var10 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
               var11 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
               var12 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
               var13 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
               if(var10 == abn.e.M && var11 == abn.e.M && var12 == abn.e.M && var13 == abn.e.M) {
                  var6[var8 + var7 * var3] = var9;
               } else {
                  var6[var8 + var7 * var3] = abn.v.M;
               }
            } else {
               var6[var8 + var7 * var3] = var9;
            }
         }
      }

      return var6;
   }
}
