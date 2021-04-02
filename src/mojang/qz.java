package mojang;

public class qz extends fe {

   private int c;


   public qz() {
      super(new ake(), 0.5F);
      this.c = ((ake)this.a).a();
   }

   public void a(Blaze var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = ((ake)this.a).a();
      if(var10 != this.c) {
         this.c = var10;
         this.a = new ake();
      }

      super.a((Mob)var1, var2, var4, var6, var8, var9);
   }
}
