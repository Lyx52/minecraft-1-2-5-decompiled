package mojang;

public class ajn extends Mob {

   protected int aA = 100;


   public ajn(World var1) {
      super(var1);
   }

   public int d() {
      return this.aA;
   }

   public boolean a(dg var1, md var2, int var3) {
      return this.a(var2, var3);
   }

   public boolean a(md var1, int var2) {
      return false;
   }

   protected boolean e(md var1, int var2) {
      return super.a(var1, var2);
   }
}
