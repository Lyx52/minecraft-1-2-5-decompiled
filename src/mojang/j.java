package mojang;

public class j {

   private Mob a;
   private double b;
   private double c;
   private double d;
   private float e;
   private boolean f = false;


   public j(Mob var1) {
      this.a = var1;
      this.b = var1.o;
      this.c = var1.p;
      this.d = var1.q;
   }

   public boolean a() {
      return this.f;
   }

   public float b() {
      return this.e;
   }

   public void a(double var1, double var3, double var5, float var7) {
      this.b = var1;
      this.c = var3;
      this.d = var5;
      this.e = var7;
      this.f = true;
   }

   public void c() {
      this.a.h(0.0F);
      if(this.f) {
         this.f = false;
         int var1 = Utils.c(this.a.y.b + 0.5D);
         double var2 = this.b - this.a.o;
         double var4 = this.d - this.a.q;
         double var6 = this.c - (double)var1;
         double var8 = var2 * var2 + var6 * var6 + var4 * var4;
         if(var8 >= 2.500000277905201E-7D) {
            float var10 = (float)(Math.atan2(var4, var2) * 180.0D / 3.1415927410125732D) - 90.0F;
            this.a.u = this.a(this.a.u, var10, 30.0F);
            this.a.g(this.e);
            if(var6 > 0.0D && var2 * var2 + var4 * var4 < 1.0D) {
               this.a.aL().a();
            }

         }
      }
   }

   private float a(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
         ;
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }
}
