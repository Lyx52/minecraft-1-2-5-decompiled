
public class zw {

   public bo a;
   public float b;
   public float c;


   public zw(float var1, float var2, float var3, float var4, float var5) {
      this(bo.a((double)var1, (double)var2, (double)var3), var4, var5);
   }

   public zw a(float var1, float var2) {
      return new zw(this, var1, var2);
   }

   public zw(zw var1, float var2, float var3) {
      this.a = var1.a;
      this.b = var2;
      this.c = var3;
   }

   public zw(bo var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }
}
