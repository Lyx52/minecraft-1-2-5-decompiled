package mojang;

public class qu {

   public boolean a = false;
   public boolean b = false;
   public boolean c = false;
   public boolean d = false;


   public void a(CompundTag var1) {
      CompundTag var2 = new CompundTag();
      var2.addBoolean("invulnerable", this.a);
      var2.addBoolean("flying", this.b);
      var2.addBoolean("mayfly", this.c);
      var2.addBoolean("instabuild", this.d);
      var1.addBaseTag("abilities", (BaseTag)var2);
   }

   public void b(CompundTag var1) {
      if(var1.containsKey("abilities")) {
         CompundTag var2 = var1.getCompundTag("abilities");
         this.a = var2.getBoolean("invulnerable");
         this.b = var2.getBoolean("flying");
         this.c = var2.getBoolean("mayfly");
         this.d = var2.getBoolean("instabuild");
      }

   }
}
