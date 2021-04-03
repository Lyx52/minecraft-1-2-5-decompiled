
public class mq extends jt {

   private static final String[] A = new String[]{"all", "fire", "fall", "explosion", "projectile"};
   private static final int[] B = new int[]{1, 10, 5, 5, 3};
   private static final int[] C = new int[]{16, 8, 6, 8, 6};
   private static final int[] D = new int[]{20, 12, 10, 12, 15};
   public final int z;


   public mq(int var1, int var2, int var3) {
      super(var1, var2, mb.b);
      this.z = var3;
      if(var3 == 2) {
         this.x = mb.c;
      }

   }

   public int a(int var1) {
      return B[this.z] + (var1 - 1) * C[this.z];
   }

   public int b(int var1) {
      return this.a(var1) + D[this.z];
   }

   public int a() {
      return 4;
   }

   public int a(int var1, md var2) {
      if(var2.g()) {
         return 0;
      } else {
         int var3 = (6 + var1 * var1) / 2;
         return this.z == 0?var3:(this.z == 1 && var2.k()?var3:(this.z == 2 && var2 == md.i?var3 * 2:(this.z == 3 && var2 == md.l?var3:(this.z == 4 && var2.c()?var3:0))));
      }
   }

   public String d() {
      return "enchantment.protect." + A[this.z];
   }

   public boolean a(jt var1) {
      if(var1 instanceof mq) {
         mq var2 = (mq)var1;
         return var2.z == this.z?false:this.z == 2 || var2.z == 2;
      } else {
         return super.a(var1);
      }
   }

}
