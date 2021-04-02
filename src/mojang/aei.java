package mojang;

import java.util.Random;

public class aei extends qk {

   private pb a;


   protected aei(int var1, pb var2) {
      super(var1, 111);
      this.a = var2;
      this.a(true);
      float var3 = 0.125F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
   }

   protected boolean f_(int var1) {
      return var1 == aA.bO;
   }

   public void a(World var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.o(var2, var3 + 1, var4) >= 9) {
         float var6 = this.j(var1, var2, var3, var4);
         if(var5.nextInt((int)(25.0F / var6) + 1) == 0) {
            int var7 = var1.e(var2, var3, var4);
            if(var7 < 7) {
               ++var7;
               var1.f(var2, var3, var4, var7);
            } else {
               if(var1.a(var2 - 1, var3, var4) == this.a.bO) {
                  return;
               }

               if(var1.a(var2 + 1, var3, var4) == this.a.bO) {
                  return;
               }

               if(var1.a(var2, var3, var4 - 1) == this.a.bO) {
                  return;
               }

               if(var1.a(var2, var3, var4 + 1) == this.a.bO) {
                  return;
               }

               int var8 = var5.nextInt(4);
               int var9 = var2;
               int var10 = var4;
               if(var8 == 0) {
                  var9 = var2 - 1;
               }

               if(var8 == 1) {
                  ++var9;
               }

               if(var8 == 2) {
                  var10 = var4 - 1;
               }

               if(var8 == 3) {
                  ++var10;
               }

               int var11 = var1.a(var9, var3 - 1, var10);
               if(var1.a(var9, var3, var10) == 0 && (var11 == aA.bO || var11 == v.bO || var11 == u.bO)) {
                  var1.g(var9, var3, var10, this.a.bO);
               }
            }
         }
      }

   }

   public void i(World var1, int var2, int var3, int var4) {
      var1.f(var2, var3, var4, 7);
   }

   private float j(World var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      int var6 = var1.a(var2, var3, var4 - 1);
      int var7 = var1.a(var2, var3, var4 + 1);
      int var8 = var1.a(var2 - 1, var3, var4);
      int var9 = var1.a(var2 + 1, var3, var4);
      int var10 = var1.a(var2 - 1, var3, var4 - 1);
      int var11 = var1.a(var2 + 1, var3, var4 - 1);
      int var12 = var1.a(var2 + 1, var3, var4 + 1);
      int var13 = var1.a(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this.bO || var9 == this.bO;
      boolean var15 = var6 == this.bO || var7 == this.bO;
      boolean var16 = var10 == this.bO || var11 == this.bO || var12 == this.bO || var13 == this.bO;

      for(int var17 = var2 - 1; var17 <= var2 + 1; ++var17) {
         for(int var18 = var4 - 1; var18 <= var4 + 1; ++var18) {
            int var19 = var1.a(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if(var19 == aA.bO) {
               var20 = 1.0F;
               if(var1.e(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if(var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if(var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public int d(int var1) {
      int var2 = var1 * 32;
      int var3 = 255 - var1 * 8;
      int var4 = var1 * 4;
      return var2 << 16 | var3 << 8 | var4;
   }

   public int c(WorldInterface var1, int var2, int var3, int var4) {
      return this.d(var1.e(var2, var3, var4));
   }

   public int a(int var1, int var2) {
      return this.bN;
   }

   public void h() {
      float var1 = 0.125F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
   }

   public void a(WorldInterface var1, int var2, int var3, int var4) {
      this.bZ = (double)((float)(var1.e(var2, var3, var4) * 2 + 2) / 16.0F);
      float var5 = 0.125F;
      this.a(0.5F - var5, 0.0F, 0.5F - var5, 0.5F + var5, (float)this.bZ, 0.5F + var5);
   }

   public int d() {
      return 19;
   }

   public int g(WorldInterface var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      return var5 < 7?-1:(var1.a(var2 - 1, var3, var4) == this.a.bO?0:(var1.a(var2 + 1, var3, var4) == this.a.bO?1:(var1.a(var2, var3, var4 - 1) == this.a.bO?2:(var1.a(var2, var3, var4 + 1) == this.a.bO?3:-1))));
   }

   public void a(World var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if(!var1.F) {
         yr var8 = null;
         if(this.a == ba) {
            var8 = yr.bg;
         }

         if(this.a == br) {
            var8 = yr.bh;
         }

         for(int var9 = 0; var9 < 3; ++var9) {
            if(var1.r.nextInt(15) <= var5) {
               float var10 = 0.7F;
               float var11 = var1.r.nextFloat() * var10 + (1.0F - var10) * 0.5F;
               float var12 = var1.r.nextFloat() * var10 + (1.0F - var10) * 0.5F;
               float var13 = var1.r.nextFloat() * var10 + (1.0F - var10) * 0.5F;
               Item var14 = new Item(var1, (double)((float)var2 + var11), (double)((float)var3 + var12), (double)((float)var4 + var13), new aan(var8));
               var14.c = 10;
               var1.a((BaseEntity)var14);
            }
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      if(var1 == 7) {
         ;
      }

      return -1;
   }

   public int a(Random var1) {
      return 1;
   }
}
