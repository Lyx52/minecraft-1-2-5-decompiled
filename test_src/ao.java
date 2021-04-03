
public class ao extends wp {

   public ao(long var1, wp var3) {
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
            if(this.a(3) == 0) {
               int var10 = var9;
               if(var9 == abn.d.M) {
                  var10 = abn.s.M;
               } else if(var9 == abn.f.M) {
                  var10 = abn.t.M;
               } else if(var9 == abn.g.M) {
                  var10 = abn.u.M;
               } else if(var9 == abn.c.M) {
                  var10 = abn.f.M;
               } else if(var9 == abn.n.M) {
                  var10 = abn.o.M;
               } else if(var9 == abn.w.M) {
                  var10 = abn.x.M;
               }

               if(var10 != var9) {
                  int var11 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
                  int var12 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
                  int var13 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
                  int var14 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
                  if(var11 == var9 && var12 == var9 && var13 == var9 && var14 == var9) {
                     var6[var8 + var7 * var3] = var10;
                  } else {
                     var6[var8 + var7 * var3] = var9;
                  }
               } else {
                  var6[var8 + var7 * var3] = var9;
               }
            } else {
               var6[var8 + var7 * var3] = var9;
            }
         }
      }

      return var6;
   }
}
