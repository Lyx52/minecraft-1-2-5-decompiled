package mojang;

public class nw extends rg {

   public nw(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.an = 0.04F;
      this.c(this.s() + 1);
      if(var10 == 0.0D && (var8 != 0.0D || var12 != 0.0D)) {
         this.r = var8;
         this.s = var10 + 0.1D;
         this.t = var12;
      }

   }
}
