import org.lwjgl.opengl.GL11;

public class im extends rt {

   private int a = 0;
   private int au = 0;
   private aaw av;
   private float aw;


   public im(aaw var1, xd var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      super(var2, var3, var5, var7, 0.0D, 0.0D, 0.0D);
      this.av = var1;
      this.au = 6 + this.U.nextInt(4);
      this.ao = this.ap = this.aq = this.U.nextFloat() * 0.6F + 0.4F;
      this.aw = 1.0F - (float)var9 * 0.5F;
   }

   public void a(adz var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var8 = (int)(((float)this.a + var2) * 15.0F / (float)this.au);
      if(var8 <= 15) {
         this.av.b(this.av.b("/misc/explosion.png"));
         float var9 = (float)(var8 % 4) / 4.0F;
         float var10 = var9 + 0.24975F;
         float var11 = (float)(var8 / 4) / 4.0F;
         float var12 = var11 + 0.24975F;
         float var13 = 2.0F * this.aw;
         float var14 = (float)(this.l + (this.o - this.l) * (double)var2 - ar);
         float var15 = (float)(this.m + (this.p - this.m) * (double)var2 - as);
         float var16 = (float)(this.n + (this.q - this.n) * (double)var2 - at);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(2896);
         tf.a();
         var1.b();
         var1.a(this.ao, this.ap, this.aq, 1.0F);
         var1.b(0.0F, 1.0F, 0.0F);
         var1.b(240);
         var1.a((double)(var14 - var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 - var5 * var13 - var7 * var13), (double)var10, (double)var12);
         var1.a((double)(var14 - var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 - var5 * var13 + var7 * var13), (double)var10, (double)var11);
         var1.a((double)(var14 + var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 + var5 * var13 + var7 * var13), (double)var9, (double)var11);
         var1.a((double)(var14 + var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 + var5 * var13 - var7 * var13), (double)var9, (double)var12);
         var1.a();
         GL11.glPolygonOffset(0.0F, 0.0F);
         GL11.glEnable(2896);
      }
   }

   public int b(float var1) {
      return '\uf0f0';
   }

   public void J_() {
      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      ++this.a;
      if(this.a == this.au) {
         this.A();
      }

   }

   public int n() {
      return 3;
   }
}
