package mojang;

public class ef extends pb {

   protected ef(int var1) {
      super(var1, acn.d);
      this.bN = 59;
   }

   public int a_(int var1) {
      return var1 == 1?this.bN - 16:(var1 == 0? x.a_(0):(var1 != 2 && var1 != 4?this.bN:this.bN + 1));
   }

   public boolean b(World var1, int var2, int var3, int var4, Player var5) {
      if(var1.F) {
         return true;
      } else {
         var5.a(var2, var3, var4);
         return true;
      }
   }
}
