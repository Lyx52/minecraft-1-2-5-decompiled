package mojang;

public class akf extends alb {

   public void a() {
      this.c = new fm(abn.j, 1.0F, 0.0F);
      this.d = true;
      this.e = true;
      this.g = -1;
   }

   public bo b(float var1, float var2) {
      return bo.b(0.20000000298023224D, 0.029999999329447746D, 0.029999999329447746D);
   }

   protected void i() {
      float var1 = 0.1F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.f[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   public ca b() {
      return new agb(this.a, this.a.v());
   }

   public boolean e() {
      return false;
   }

   public boolean a(int var1, int var2) {
      return false;
   }

   public float a(long var1, float var3) {
      return 0.5F;
   }

   public boolean d() {
      return false;
   }

   public boolean b(int var1, int var2) {
      return true;
   }
}
