package mojang;

public class rt extends nn {

   private int a;
   protected float b;
   protected float c;
   protected int d = 0;
   protected int e = 0;
   protected float am;
   protected float an;
   protected float ao;
   protected float ap;
   protected float aq;
   public static double ar;
   public static double as;
   public static double at;


   public rt(xd var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.a(0.2F, 0.2F);
      this.H = this.J / 2.0F;
      this.d(var2, var4, var6);
      this.ao = this.ap = this.aq = 1.0F;
      this.r = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.s = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.t = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      float var14 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
      float var15 = gk.a(this.r * this.r + this.s * this.s + this.t * this.t);
      this.r = this.r / (double)var15 * (double)var14 * 0.4000000059604645D;
      this.s = this.s / (double)var15 * (double)var14 * 0.4000000059604645D + 0.10000000149011612D;
      this.t = this.t / (double)var15 * (double)var14 * 0.4000000059604645D;
      this.b = this.U.nextFloat() * 3.0F;
      this.c = this.U.nextFloat() * 3.0F;
      this.am = (this.U.nextFloat() * 0.5F + 0.5F) * 2.0F;
      this.e = (int)(4.0F / (this.U.nextFloat() * 0.9F + 0.1F));
      this.d = 0;
   }

   public rt c(float var1) {
      this.r *= (double)var1;
      this.s = (this.s - 0.10000000149011612D) * (double)var1 + 0.10000000149011612D;
      this.t *= (double)var1;
      return this;
   }

   public rt d(float var1) {
      this.a(0.2F * var1, 0.2F * var1);
      this.am *= var1;
      return this;
   }

   public void b(float var1, float var2, float var3) {
      this.ao = var1;
      this.ap = var2;
      this.aq = var3;
   }

   public float o() {
      return this.ao;
   }

   public float p() {
      return this.ap;
   }

   public float r() {
      return this.aq;
   }

   protected boolean e_() {
      return false;
   }

   protected void b() {}

   public void J_() {
      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      if(this.d++ >= this.e) {
         this.A();
      }

      this.s -= 0.04D * (double)this.an;
      this.b(this.r, this.s, this.t);
      this.r *= 0.9800000190734863D;
      this.s *= 0.9800000190734863D;
      this.t *= 0.9800000190734863D;
      if(this.z) {
         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
      }

   }

   public void a(adz var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (float)(this.a % 16) / 16.0F;
      float var9 = var8 + 0.0624375F;
      float var10 = (float)(this.a / 16) / 16.0F;
      float var11 = var10 + 0.0624375F;
      float var12 = 0.1F * this.am;
      float var13 = (float)(this.l + (this.o - this.l) * (double)var2 - ar);
      float var14 = (float)(this.m + (this.p - this.m) * (double)var2 - as);
      float var15 = (float)(this.n + (this.q - this.n) * (double)var2 - at);
      float var16 = 1.0F;
      var1.a(this.ao * var16, this.ap * var16, this.aq * var16);
      var1.a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var9, (double)var11);
      var1.a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var8, (double)var11);
   }

   public int n() {
      return 0;
   }

   public void b(ady var1) {}

   public void a(ady var1) {}

   public void c(int var1) {
      this.a = var1;
   }

   public int s() {
      return this.a;
   }

   public boolean k_() {
      return false;
   }
}
