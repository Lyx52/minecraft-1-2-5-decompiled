package mojang;

public abstract class ajr extends aaa {

   public ajr(World var1) {
      super(var1);
   }

   protected void b() {
      super.b();
      this.ac.a(12, new Integer(0));
   }

   public int av() {
      return this.ac.c(12);
   }

   public void d(int var1) {
      this.ac.b(12, Integer.valueOf(var1));
   }

   public void b(CompundTag var1) {
      super.b(var1);
      var1.addInt("Age", this.av());
   }

   public void a(CompundTag var1) {
      super.a(var1);
      this.d(var1.getInt("Age"));
   }

   public void e() {
      super.e();
      int var1 = this.av();
      if(var1 < 0) {
         ++var1;
         this.d(var1);
      } else if(var1 > 0) {
         --var1;
         this.d(var1);
      }

   }

   public boolean bi() {
      return this.av() < 0;
   }
}
