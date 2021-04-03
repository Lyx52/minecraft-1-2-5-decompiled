
public class fs extends rt {

   private nn a;
   private int au;
   private int av;
   private String aw;


   public fs(xd var1, nn var2) {
      this(var1, var2, "crit");
   }

   public fs(xd var1, nn var2, String var3) {
      super(var1, var2.o, var2.y.b + (double)(var2.J / 2.0F), var2.q, var2.r, var2.s, var2.t);
      this.au = 0;
      this.av = 0;
      this.a = var2;
      this.av = 3;
      this.aw = var3;
      this.J_();
   }

   public void a(adz var1, float var2, float var3, float var4, float var5, float var6, float var7) {}

   public void J_() {
      for(int var1 = 0; var1 < 16; ++var1) {
         double var2 = (double)(this.U.nextFloat() * 2.0F - 1.0F);
         double var4 = (double)(this.U.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(this.U.nextFloat() * 2.0F - 1.0F);
         if(var2 * var2 + var4 * var4 + var6 * var6 <= 1.0D) {
            double var8 = this.a.o + var2 * (double)this.a.I / 4.0D;
            double var10 = this.a.y.b + (double)(this.a.J / 2.0F) + var4 * (double)this.a.J / 4.0D;
            double var12 = this.a.q + var6 * (double)this.a.I / 4.0D;
            this.k.a(this.aw, var8, var10, var12, var2, var4 + 0.2D, var6);
         }
      }

      ++this.au;
      if(this.au >= this.av) {
         this.A();
      }

   }

   public int n() {
      return 3;
   }
}
