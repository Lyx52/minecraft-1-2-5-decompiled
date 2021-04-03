package mojang;

public abstract class aar {

   protected ach b;


   public abstract void a(kw var1, double var2, double var4, double var6, float var8);

   protected void a(String var1) {
      TextureManager var2 = this.b.e;
      if(var2 != null) {
         var2.b(var2.readImageFromLocation(var1));
      }

   }

   public void a(ach var1) {
      this.b = var1;
   }

   public void a(World var1) {}

   public nl a() {
      return this.b.b();
   }
}
