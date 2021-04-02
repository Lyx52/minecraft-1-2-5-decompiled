package mojang;

public class ld extends rt {

   public ld(xd var1, double var2, double var4, double var6, yr var8) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.c(var8.b(0));
      this.ao = this.ap = this.aq = 1.0F;
      this.an = pb.aU.cc;
      this.am /= 2.0F;
   }

   public ld(xd var1, double var2, double var4, double var6, double var8, double var10, double var12, yr var14) {
      this(var1, var2, var4, var6, var14);
      this.r *= 0.10000000149011612D;
      this.s *= 0.10000000149011612D;
      this.t *= 0.10000000149011612D;
      this.r += var8;
      this.s += var10;
      this.t += var12;
   }

   public int n() {
      return 2;
   }

   public void a(adz var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)(this.s() % 16) + this.b / 4.0F) / 16.0F;
      float var9 = var8 + 0.015609375F;
      float var10 = ((float)(this.s() / 16) + this.c / 4.0F) / 16.0F;
      float var11 = var10 + 0.015609375F;
      float var12 = 0.1F * this.am;
      float var13 = (float)(this.l + (this.o - this.l) * (double)var2 - ar);
      float var14 = (float)(this.m + (this.p - this.m) * (double)var2 - as);
      float var15 = (float)(this.n + (this.q - this.n) * (double)var2 - at);
      float var16 = 1.0F;
      var1.a(var16 * this.ao, var16 * this.ap, var16 * this.aq);
      var1.a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var8, (double)var11);
      var1.a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var9, (double)var11);
   }
}
