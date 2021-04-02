package mojang;

public class dk extends kw {

   public int a;


   public void a(CompundTag var1) {
      super.a(var1);
      this.a = var1.getInt("Record");
   }

   public void b(CompundTag var1) {
      super.b(var1);
      if(this.a > 0) {
         var1.addInt("Record", this.a);
      }

   }
}
