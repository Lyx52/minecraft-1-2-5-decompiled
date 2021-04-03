
public class abz extends jt {

   private static final String[] A = new String[]{"all", "undead", "arthropods"};
   private static final int[] B = new int[]{1, 5, 5};
   private static final int[] C = new int[]{16, 8, 8};
   private static final int[] D = new int[]{20, 20, 20};
   public final int z;


   public abz(int var1, int var2, int var3) {
      super(var1, var2, mb.g);
      this.z = var3;
   }

   public int a(int var1) {
      return B[this.z] + (var1 - 1) * C[this.z];
   }

   public int b(int var1) {
      return this.a(var1) + D[this.z];
   }

   public int a() {
      return 5;
   }

   public int a(int var1, acq var2) {
      return this.z == 0?var1 * 3:(this.z == 1 && var2.s() == bk.b?var1 * 4:(this.z == 2 && var2.s() == bk.c?var1 * 4:0));
   }

   public String d() {
      return "enchantment.damage." + A[this.z];
   }

   public boolean a(jt var1) {
      return !(var1 instanceof abz);
   }

}
