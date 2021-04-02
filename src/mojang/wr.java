package mojang;

public class wr extends xg {

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      float var7 = gk.a(this.h * 3.1415927F);
      float var8 = gk.a((1.0F - (1.0F - this.h) * (1.0F - this.h)) * 3.1415927F);
      this.f.h = 0.0F;
      this.g.h = 0.0F;
      this.f.g = -(0.1F - var7 * 0.6F);
      this.g.g = 0.1F - var7 * 0.6F;
      this.f.f = -1.5707964F;
      this.g.f = -1.5707964F;
      this.f.f -= var7 * 1.2F - var8 * 0.4F;
      this.g.f -= var7 * 1.2F - var8 * 0.4F;
      this.f.h += gk.b(var3 * 0.09F) * 0.05F + 0.05F;
      this.g.h -= gk.b(var3 * 0.09F) * 0.05F + 0.05F;
      this.f.f += gk.a(var3 * 0.067F) * 0.05F;
      this.g.f -= gk.a(var3 * 0.067F) * 0.05F;
   }
}
