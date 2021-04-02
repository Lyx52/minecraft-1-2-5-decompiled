package mojang;

import org.lwjgl.opengl.GL11;

public class yq extends rt {

   private int a = 0;
   private int au = 0;
   private Texture av;


   public yq(Texture var1, World var2, double var3, double var5, double var7) {
      super(var2, var3, var5, var7, 0.0D, 0.0D, 0.0D);
      this.av = var1;
      this.r = this.s = this.t = 0.0D;
      this.au = 200;
   }

   public void a(Tessalator var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.a + var2) / (float)this.au;
      var8 *= var8;
      float var9 = 2.0F - var8 * 2.0F;
      if(var9 > 1.0F) {
         var9 = 1.0F;
      }

      var9 *= 0.2F;
      GL11.glDisable(2896);
      float var10 = 0.125F;
      float var11 = (float)(this.o - ar);
      float var12 = (float)(this.p - as);
      float var13 = (float)(this.q - at);
      float var14 = this.k.c(Utils.c(this.o), Utils.c(this.p), Utils.c(this.q));
      this.av.b(this.av.b("/mojang/misc/footprint.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      var1.b();
      var1.a(var14, var14, var14, var9);
      var1.a((double)(var11 - var10), (double)var12, (double)(var13 + var10), 0.0D, 1.0D);
      var1.a((double)(var11 + var10), (double)var12, (double)(var13 + var10), 1.0D, 1.0D);
      var1.a((double)(var11 + var10), (double)var12, (double)(var13 - var10), 1.0D, 0.0D);
      var1.a((double)(var11 - var10), (double)var12, (double)(var13 - var10), 0.0D, 0.0D);
      var1.a();
      GL11.glDisable(3042);
      GL11.glEnable(2896);
   }

   public void J_() {
      ++this.a;
      if(this.a == this.au) {
         this.A();
      }

   }

   public int n() {
      return 3;
   }
}
