
public class wo extends pb {

   public wo() {
      super(35, 64, acn.m);
   }

   public int a(int var1, int var2) {
      if(var2 == 0) {
         return this.bN;
      } else {
         var2 = ~(var2 & 15);
         return 113 + ((var2 & 8) >> 3) + (var2 & 7) * 16;
      }
   }

   protected int c(int var1) {
      return var1;
   }

   public static int e(int var0) {
      return ~var0 & 15;
   }

   public static int h(int var0) {
      return ~var0 & 15;
   }
}
