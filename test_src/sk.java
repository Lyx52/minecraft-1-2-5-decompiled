
public class sk extends rt {

   float a;


   public sk(xd var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   public sk(xd var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.r *= 0.10000000149011612D;
      this.s *= 0.10000000149011612D;
      this.t *= 0.10000000149011612D;
      this.r += var8 * 0.4D;
      this.s += var10 * 0.4D;
      this.t += var12 * 0.4D;
      this.ao = this.ap = this.aq = (float)(Math.random() * 0.30000001192092896D + 0.6000000238418579D);
      this.am *= 0.75F;
      this.am *= var14;
      this.a = this.am;
      this.e = (int)(6.0D / (Math.random() * 0.8D + 0.6D));
      this.e = (int)((float)this.e * var14);
      this.S = false;
      this.c(65);
      this.J_();
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

      this.b(this.r, this.s, this.t);
      this.ap = (float)((double)this.ap * 0.96D);
      this.aq = (float)((double)this.aq * 0.9D);
      this.r *= 0.699999988079071D;
      this.s *= 0.699999988079071D;
      this.t *= 0.699999988079071D;
      this.s -= 0.019999999552965164D;
      if(this.z) {
         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
      }

   }
}
