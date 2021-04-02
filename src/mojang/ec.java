package mojang;

public class ec extends rt {

   private float a;


   public ec(xd var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.r *= 0.800000011920929D;
      this.s *= 0.800000011920929D;
      this.t *= 0.800000011920929D;
      this.s = (double)(this.U.nextFloat() * 0.4F + 0.05F);
      this.ao = this.ap = this.aq = 1.0F;
      this.am *= this.U.nextFloat() * 2.0F + 0.2F;
      this.a = this.am;
      this.e = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
      this.S = false;
      this.c(49);
   }

   public int b(float var1) {
      float var2 = ((float)this.d + var1) / (float)this.e;
      if(var2 < 0.0F) {
         var2 = 0.0F;
      }

      if(var2 > 1.0F) {
         var2 = 1.0F;
      }

      int var3 = super.b(var1);
      short var4 = 240;
      int var5 = var3 >> 16 & 255;
      return var4 | var5 << 16;
   }

   public float a(float var1) {
      return 1.0F;
   }

   public void a(adz var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.d + var2) / (float)this.e;
      this.am = this.a * (1.0F - var8 * var8);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void J_() {
      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      if(this.d++ >= this.e) {
         this.A();
      }

      float var1 = (float)this.d / (float)this.e;
      if(this.U.nextFloat() > var1) {
         this.k.a("smoke", this.o, this.p, this.q, this.r, this.s, this.t);
      }

      this.s -= 0.03D;
      this.b(this.r, this.s, this.t);
      this.r *= 0.9990000128746033D;
      this.s *= 0.9990000128746033D;
      this.t *= 0.9990000128746033D;
      if(this.z) {
         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
      }

   }
}
