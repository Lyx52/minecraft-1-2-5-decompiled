package mojang;

public class px extends rt {

   private int a = 128;


   public px(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.s *= 0.20000000298023224D;
      if(var8 == 0.0D && var12 == 0.0D) {
         this.r *= 0.10000000149011612D;
         this.t *= 0.10000000149011612D;
      }

      this.am *= 0.75F;
      this.e = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
      this.S = false;
   }

   public void a(Tessalator var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.d + var2) / (float)this.e * 32.0F;
      if(var8 < 0.0F) {
         var8 = 0.0F;
      }

      if(var8 > 1.0F) {
         var8 = 1.0F;
      }

      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void J_() {
      this.sandX = this.o;
      this.sandY = this.p;
      this.sandZ = this.q;
      if(this.d++ >= this.e) {
         this.A();
      }

      this.c(this.a + (7 - this.d * 8 / this.e));
      this.s += 0.004D;
      this.b(this.r, this.s, this.t);
      if(this.p == this.sandY) {
         this.r *= 1.1D;
         this.t *= 1.1D;
      }

      this.r *= 0.9599999785423279D;
      this.s *= 0.9599999785423279D;
      this.t *= 0.9599999785423279D;
      if(this.z) {
         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
      }

   }

   public void b(int var1) {
      this.a = var1;
   }
}
