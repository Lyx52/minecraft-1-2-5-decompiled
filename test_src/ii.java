
public class ii extends alb {

   public void a() {
      this.c = new fm(abn.k, 0.5F, 0.0F);
      this.g = 1;
      this.e = true;
   }

   public ca b() {
      return new xo(this.a, this.a.v());
   }

   public float a(long var1, float var3) {
      return 0.0F;
   }

   public float[] a(float var1, float var2) {
      return null;
   }

   public bo b(float var1, float var2) {
      int var3 = 8421536;
      float var4 = gk.b(var1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      if(var4 > 1.0F) {
         var4 = 1.0F;
      }

      float var5 = (float)(var3 >> 16 & 255) / 255.0F;
      float var6 = (float)(var3 >> 8 & 255) / 255.0F;
      float var7 = (float)(var3 & 255) / 255.0F;
      var5 *= var4 * 0.0F + 0.15F;
      var6 *= var4 * 0.0F + 0.15F;
      var7 *= var4 * 0.0F + 0.15F;
      return bo.b((double)var5, (double)var6, (double)var7);
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean e() {
      return false;
   }

   public float f() {
      return 8.0F;
   }

   public boolean a(int var1, int var2) {
      int var3 = this.a.b(var1, var2);
      return var3 == 0?false:pb.m[var3].cd.c();
   }

   public uh g() {
      return new uh(100, 50, 0);
   }

   public int h() {
      return 50;
   }

   public boolean b(int var1, int var2) {
      return true;
   }
}
