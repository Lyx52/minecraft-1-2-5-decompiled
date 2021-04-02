package mojang;

import java.util.Random;

public class de extends pb {

   public de(int var1, int var2) {
      super(var1, var2, acn.A);
   }

   public void a(xd var1, int var2, int var3, int var4) {
      var1.a(var2, var3, var4, this.bO, this.e());
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      var1.a(var2, var3, var4, this.bO, this.e());
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      this.h(var1, var2, var3, var4);
   }

   private void h(xd var1, int var2, int var3, int var4) {
      if(yp.h(var1, var2, var3 - 1, var4) && var3 >= 0) {
         byte var8 = 32;
         if(!yp.a && var1.b(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
            abf var9 = new abf(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this.bO);
            var1.a((nn)var9);
         } else {
            var1.g(var2, var3, var4, 0);

            while(yp.h(var1, var2, var3 - 1, var4) && var3 > 0) {
               --var3;
            }

            if(var3 > 0) {
               var1.g(var2, var3, var4, this.bO);
            }
         }
      }

   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      this.i(var1, var2, var3, var4);
      return true;
   }

   public void a(xd var1, int var2, int var3, int var4, yw var5) {
      this.i(var1, var2, var3, var4);
   }

   private void i(xd var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this.bO) {
         if(!var1.F) {
            for(int var5 = 0; var5 < 1000; ++var5) {
               int var6 = var2 + var1.r.nextInt(16) - var1.r.nextInt(16);
               int var7 = var3 + var1.r.nextInt(8) - var1.r.nextInt(8);
               int var8 = var4 + var1.r.nextInt(16) - var1.r.nextInt(16);
               if(var1.a(var6, var7, var8) == 0) {
                  var1.d(var6, var7, var8, this.bO, var1.e(var2, var3, var4));
                  var1.g(var2, var3, var4, 0);
                  short var9 = 128;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     double var11 = var1.r.nextDouble();
                     float var13 = (var1.r.nextFloat() - 0.5F) * 0.2F;
                     float var14 = (var1.r.nextFloat() - 0.5F) * 0.2F;
                     float var15 = (var1.r.nextFloat() - 0.5F) * 0.2F;
                     double var16 = (double)var6 + (double)(var2 - var6) * var11 + (var1.r.nextDouble() - 0.5D) * 1.0D + 0.5D;
                     double var18 = (double)var7 + (double)(var3 - var7) * var11 + var1.r.nextDouble() * 1.0D - 0.5D;
                     double var20 = (double)var8 + (double)(var4 - var8) * var11 + (var1.r.nextDouble() - 0.5D) * 1.0D + 0.5D;
                     var1.a("portal", var16, var18, var20, (double)var13, (double)var14, (double)var15);
                  }

                  return;
               }
            }

         }
      }
   }

   public int e() {
      return 3;
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return super.e(var1, var2, var3, var4);
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int d() {
      return 27;
   }
}
