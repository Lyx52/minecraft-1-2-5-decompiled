package mojang;

public class ajb extends rt {

   float a;


   public ajb(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      float var14 = 2.5F;
      this.r *= 0.10000000149011612D;
      this.s *= 0.10000000149011612D;
      this.t *= 0.10000000149011612D;
      this.r += var8;
      this.s += var10;
      this.t += var12;
      this.ao = this.ap = this.aq = 1.0F - (float)(Math.random() * 0.30000001192092896D);
      this.am *= 0.75F;
      this.am *= var14;
      this.a = this.am;
      this.e = (int)(8.0D / (Math.random() * 0.8D + 0.3D));
      this.e = (int)((float)this.e * var14);
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

      this.am = this.a * var8;
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void J_() {
      this.sandX = this.o;
      this.sandY = this.p;
      this.sandZ = this.q;
      if(this.d++ >= this.e) {
         this.A();
      }

      this.c(7 - this.d * 8 / this.e);
      this.b(this.r, this.s, this.t);
      this.r *= 0.9599999785423279D;
      this.s *= 0.9599999785423279D;
      this.t *= 0.9599999785423279D;
      Player var1 = this.k.a(this, 2.0D);
      if(var1 != null && this.p > var1.y.b) {
         this.p += (var1.y.b - this.p) * 0.2D;
         this.s += (var1.s - this.s) * 0.2D;
         this.d(this.o, this.p, this.q);
      }

      if(this.z) {
         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
      }

   }
}
