package mojang;

public class zv {

   private static int[] a = new int[65536];


   public static void a(int[] var0) {
      a = var0;
   }

   public static int a(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)((1.0D - var0) * 255.0D);
      int var5 = (int)((1.0D - var2) * 255.0D);
      return a[var5 << 8 | var4];
   }

}
