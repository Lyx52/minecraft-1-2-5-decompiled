package mojang;

import java.util.Random;

public class eb extends pb {

   protected eb(int var1) {
      super(var1, acn.z);
      this.bN = 136;
   }

   public int a(int var1, int var2) {
      return var1 != 1 && var1 != 0?136:137;
   }

   public int a_(int var1) {
      return var1 != 1 && var1 != 0?136:137;
   }

   public int a(int var1, Random var2, int var3) {
      return yr.bf.bQ;
   }

   public int a(Random var1) {
      return 3 + var1.nextInt(5);
   }

   public int a(int var1, Random var2) {
      int var3 = this.a(var2) + var2.nextInt(1 + var1);
      if(var3 > 9) {
         var3 = 9;
      }

      return var3;
   }
}
