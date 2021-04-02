package mojang;

public class akw extends rt {

   private int a = 0;
   private int au = 0;


   public akw(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.au = 8;
   }

   public void a(Tessalator var1, float var2, float var3, float var4, float var5, float var6, float var7) {}

   public void J_() {
      for(int var1 = 0; var1 < 6; ++var1) {
         double var2 = this.o + (this.U.nextDouble() - this.U.nextDouble()) * 4.0D;
         double var4 = this.p + (this.U.nextDouble() - this.U.nextDouble()) * 4.0D;
         double var6 = this.q + (this.U.nextDouble() - this.U.nextDouble()) * 4.0D;
         this.k.a("largeexplode", var2, var4, var6, (double)((float)this.a / (float)this.au), 0.0D, 0.0D);
      }

      ++this.a;
      if(this.a == this.au) {
         this.A();
      }

   }

   public int n() {
      return 1;
   }
}
