package mojang;

public class aky extends vd {

   private final pb a;
   private String[] b;


   public aky(int var1, boolean var2) {
      super(var1);
      this.a = pb.m[this.d()];
      if(var2) {
         this.g(0);
         this.a(true);
      }

   }

   public int b(int var1, int var2) {
      return this.a.d(var1);
   }

   public int b(int var1) {
      return this.a.a(0, var1);
   }

   public int a(int var1) {
      return var1;
   }

   public aky a(String[] var1) {
      this.b = var1;
      return this;
   }

   public String a(aan var1) {
      if(this.b == null) {
         return super.a(var1);
      } else {
         int var2 = var1.i();
         return var2 >= 0 && var2 < this.b.length?super.a(var1) + "." + this.b[var2]:super.a(var1);
      }
   }
}
