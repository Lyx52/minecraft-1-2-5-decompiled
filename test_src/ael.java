
public class ael extends tt {

   protected float[] a = new float[256];
   protected float[] b = new float[256];
   protected float[] c = new float[256];
   protected float[] d = new float[256];
   private int e = 0;


   public ael() {
      super(pb.A.bN + 1);
      this.j = 2;
   }

   public void a() {
      ++this.e;

      int var1;
      int var2;
      float var3;
      int var5;
      int var6;
      for(var1 = 0; var1 < 16; ++var1) {
         for(var2 = 0; var2 < 16; ++var2) {
            var3 = 0.0F;

            for(int var4 = var2 - 2; var4 <= var2; ++var4) {
               var5 = var1 & 15;
               var6 = var4 & 15;
               var3 += this.a[var5 + var6 * 16];
            }

            this.b[var1 + var2 * 16] = var3 / 3.2F + this.c[var1 + var2 * 16] * 0.8F;
         }
      }

      for(var1 = 0; var1 < 16; ++var1) {
         for(var2 = 0; var2 < 16; ++var2) {
            this.c[var1 + var2 * 16] += this.d[var1 + var2 * 16] * 0.05F;
            if(this.c[var1 + var2 * 16] < 0.0F) {
               this.c[var1 + var2 * 16] = 0.0F;
            }

            this.d[var1 + var2 * 16] -= 0.3F;
            if(Math.random() < 0.2D) {
               this.d[var1 + var2 * 16] = 0.5F;
            }
         }
      }

      float[] var12 = this.b;
      this.b = this.a;
      this.a = var12;

      for(var2 = 0; var2 < 256; ++var2) {
         var3 = this.a[var2 - this.e * 16 & 255];
         if(var3 > 1.0F) {
            var3 = 1.0F;
         }

         if(var3 < 0.0F) {
            var3 = 0.0F;
         }

         float var13 = var3 * var3;
         var5 = (int)(32.0F + var13 * 32.0F);
         var6 = (int)(50.0F + var13 * 64.0F);
         int var7 = 255;
         int var8 = (int)(146.0F + var13 * 50.0F);
         if(this.h) {
            int var9 = (var5 * 30 + var6 * 59 + var7 * 11) / 100;
            int var10 = (var5 * 30 + var6 * 70) / 100;
            int var11 = (var5 * 30 + var7 * 70) / 100;
            var5 = var9;
            var6 = var10;
            var7 = var11;
         }

         this.f[var2 * 4 + 0] = (byte)var5;
         this.f[var2 * 4 + 1] = (byte)var6;
         this.f[var2 * 4 + 2] = (byte)var7;
         this.f[var2 * 4 + 3] = (byte)var8;
      }

   }
}
