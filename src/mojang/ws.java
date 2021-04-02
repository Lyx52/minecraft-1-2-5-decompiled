package mojang;

import org.lwjgl.opengl.GL11;

public class ws extends rt {

   private nn a;
   private nn au;
   private int av = 0;
   private int aw = 0;
   private float ax;


   public ws(xd var1, nn var2, nn var3, float var4) {
      super(var1, var2.o, var2.p, var2.q, var2.r, var2.s, var2.t);
      this.a = var2;
      this.au = var3;
      this.aw = 3;
      this.ax = var4;
   }

   public void a(adz var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.av + var2) / (float)this.aw;
      var8 *= var8;
      double var9 = this.a.o;
      double var11 = this.a.p;
      double var13 = this.a.q;
      double var15 = this.au.N + (this.au.o - this.au.N) * (double)var2;
      double var17 = this.au.O + (this.au.p - this.au.O) * (double)var2 + (double)this.ax;
      double var19 = this.au.P + (this.au.q - this.au.P) * (double)var2;
      double var21 = var9 + (var15 - var9) * (double)var8;
      double var23 = var11 + (var17 - var11) * (double)var8;
      double var25 = var13 + (var19 - var13) * (double)var8;
      int var27 = gk.c(var21);
      int var28 = gk.c(var23 + (double)(this.H / 2.0F));
      int var29 = gk.c(var25);
      int var30 = this.b(var2);
      int var31 = var30 % 65536;
      int var32 = var30 / 65536;
      es.a(es.b, (float)var31 / 1.0F, (float)var32 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var21 -= ar;
      var23 -= as;
      var25 -= at;
      ahu.a.a(this.a, (double)((float)var21), (double)((float)var23), (double)((float)var25), this.a.u, var2);
   }

   public void J_() {
      ++this.av;
      if(this.av == this.aw) {
         this.A();
      }

   }

   public int n() {
      return 3;
   }
}
