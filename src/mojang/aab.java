package mojang;

public class aab extends rt {

   float a;


   public aab(xd var1, double var2, double var4, double var6, float var8, float var9, float var10) {
      this(var1, var2, var4, var6, 1.0F, var8, var9, var10);
   }

   public aab(xd var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.r *= 0.10000000149011612D;
      this.s *= 0.10000000149011612D;
      this.t *= 0.10000000149011612D;
      if(var9 == 0.0F) {
         var9 = 1.0F;
      }

      float var12 = (float)Math.random() * 0.4F + 0.6F;
      this.ao = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var9 * var12;
      this.ap = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var10 * var12;
      this.aq = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var11 * var12;
      this.am *= 0.75F;
      this.am *= var8;
      this.a = this.am;
      this.e = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
      this.e = (int)((float)this.e * var8);
      this.S = false;
   }

   public void a(adz var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.d + var2) / (float)this.e * 32.0F;
      if(var8 < 0.0F) {
         var8 = 0.0F;
      }

      if(var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.am = this.a * var8;
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void J_() {
      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      if(this.d++ >= this.e) {
         this.A();
      }

      this.c(7 - this.d * 8 / this.e);
      this.b(this.r, this.s, this.t);
      if(this.p == this.m) {
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
}
