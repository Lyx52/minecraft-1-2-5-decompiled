package mojang;

import java.util.Random;

public class aem extends pb {

   public aem(int var1) {
      super(var1, 143, acn.k);
      this.a(true);
   }

   public void h() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public int d() {
      return 20;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public void a(WorldInterface var1, int var2, int var3, int var4) {
      int var6 = var1.e(var2, var3, var4);
      float var7 = 1.0F;
      float var8 = 1.0F;
      float var9 = 1.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      boolean var13 = var6 > 0;
      if((var6 & 2) != 0) {
         var10 = Math.max(var10, 0.0625F);
         var7 = 0.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
         var13 = true;
      }

      if((var6 & 8) != 0) {
         var7 = Math.min(var7, 0.9375F);
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
         var13 = true;
      }

      if((var6 & 4) != 0) {
         var12 = Math.max(var12, 0.0625F);
         var9 = 0.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var13 = true;
      }

      if((var6 & 1) != 0) {
         var9 = Math.min(var9, 0.9375F);
         var12 = 1.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var13 = true;
      }

      if(!var13 && this.e(var1.a(var2, var3 + 1, var4))) {
         var8 = Math.min(var8, 0.9375F);
         var11 = 1.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
      }

      this.a(var7, var8, var9, var10, var11, var12);
   }

   public wu c(World var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean d(World var1, int var2, int var3, int var4, int var5) {
      switch(var5) {
      case 1:
         return this.e(var1.a(var2, var3 + 1, var4));
      case 2:
         return this.e(var1.a(var2, var3, var4 + 1));
      case 3:
         return this.e(var1.a(var2, var3, var4 - 1));
      case 4:
         return this.e(var1.a(var2 + 1, var3, var4));
      case 5:
         return this.e(var1.a(var2 - 1, var3, var4));
      default:
         return false;
      }
   }

   private boolean e(int var1) {
      if(var1 == 0) {
         return false;
      } else {
         pb var2 = m[var1];
         return var2.b() && var2.cd.c();
      }
   }

   private boolean h(World var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      int var6 = var5;
      if(var5 > 0) {
         for(int var7 = 0; var7 <= 3; ++var7) {
            int var8 = 1 << var7;
            if((var5 & var8) != 0 && !this.e(var1.a(var2 + aav.a[var7], var3, var4 + aav.b[var7])) && (var1.a(var2, var3 + 1, var4) != this.bO || (var1.e(var2, var3 + 1, var4) & var8) == 0)) {
               var6 &= ~var8;
            }
         }
      }

      if(var6 == 0 && !this.e(var1.a(var2, var3 + 1, var4))) {
         return false;
      } else {
         if(var6 != var5) {
            var1.f(var2, var3, var4, var6);
         }

         return true;
      }
   }

   public int i() {
      return gu.c();
   }

   public int d(int var1) {
      return gu.c();
   }

   public int c(WorldInterface var1, int var2, int var3, int var4) {
      return var1.a(var2, var4).l();
   }

   public void a(World var1, int var2, int var3, int var4, int var5) {
      if(!var1.F && !this.h(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public void a(World var1, int var2, int var3, int var4, Random var5) {
      if(!var1.F && var1.r.nextInt(4) == 0) {
         byte var6 = 4;
         int var7 = 5;
         boolean var8 = false;

         int var9;
         int var10;
         int var11;
         label138:
         for(var9 = var2 - var6; var9 <= var2 + var6; ++var9) {
            for(var10 = var4 - var6; var10 <= var4 + var6; ++var10) {
               for(var11 = var3 - 1; var11 <= var3 + 1; ++var11) {
                  if(var1.a(var9, var11, var10) == this.bO) {
                     --var7;
                     if(var7 <= 0) {
                        var8 = true;
                        break label138;
                     }
                  }
               }
            }
         }

         var9 = var1.e(var2, var3, var4);
         var10 = var1.r.nextInt(6);
         var11 = aav.d[var10];
         int var12;
         int var13;
         if(var10 == 1 && var3 < 255 && var1.i(var2, var3 + 1, var4)) {
            if(var8) {
               return;
            }

            var12 = var1.r.nextInt(16) & var9;
            if(var12 > 0) {
               for(var13 = 0; var13 <= 3; ++var13) {
                  if(!this.e(var1.a(var2 + aav.a[var13], var3 + 1, var4 + aav.b[var13]))) {
                     var12 &= ~(1 << var13);
                  }
               }

               if(var12 > 0) {
                  var1.d(var2, var3 + 1, var4, this.bO, var12);
               }
            }
         } else {
            int var14;
            if(var10 >= 2 && var10 <= 5 && (var9 & 1 << var11) == 0) {
               if(var8) {
                  return;
               }

               var12 = var1.a(var2 + aav.a[var11], var3, var4 + aav.b[var11]);
               if(var12 != 0 && m[var12] != null) {
                  if(m[var12].cd.j() && m[var12].b()) {
                     var1.f(var2, var3, var4, var9 | 1 << var11);
                  }
               } else {
                  var13 = var11 + 1 & 3;
                  var14 = var11 + 3 & 3;
                  if((var9 & 1 << var13) != 0 && this.e(var1.a(var2 + aav.a[var11] + aav.a[var13], var3, var4 + aav.b[var11] + aav.b[var13]))) {
                     var1.d(var2 + aav.a[var11], var3, var4 + aav.b[var11], this.bO, 1 << var13);
                  } else if((var9 & 1 << var14) != 0 && this.e(var1.a(var2 + aav.a[var11] + aav.a[var14], var3, var4 + aav.b[var11] + aav.b[var14]))) {
                     var1.d(var2 + aav.a[var11], var3, var4 + aav.b[var11], this.bO, 1 << var14);
                  } else if((var9 & 1 << var13) != 0 && var1.i(var2 + aav.a[var11] + aav.a[var13], var3, var4 + aav.b[var11] + aav.b[var13]) && this.e(var1.a(var2 + aav.a[var13], var3, var4 + aav.b[var13]))) {
                     var1.d(var2 + aav.a[var11] + aav.a[var13], var3, var4 + aav.b[var11] + aav.b[var13], this.bO, 1 << (var11 + 2 & 3));
                  } else if((var9 & 1 << var14) != 0 && var1.i(var2 + aav.a[var11] + aav.a[var14], var3, var4 + aav.b[var11] + aav.b[var14]) && this.e(var1.a(var2 + aav.a[var14], var3, var4 + aav.b[var14]))) {
                     var1.d(var2 + aav.a[var11] + aav.a[var14], var3, var4 + aav.b[var11] + aav.b[var14], this.bO, 1 << (var11 + 2 & 3));
                  } else if(this.e(var1.a(var2 + aav.a[var11], var3 + 1, var4 + aav.b[var11]))) {
                     var1.d(var2 + aav.a[var11], var3, var4 + aav.b[var11], this.bO, 0);
                  }
               }
            } else if(var3 > 1) {
               var12 = var1.a(var2, var3 - 1, var4);
               if(var12 == 0) {
                  var13 = var1.r.nextInt(16) & var9;
                  if(var13 > 0) {
                     var1.d(var2, var3 - 1, var4, this.bO, var13);
                  }
               } else if(var12 == this.bO) {
                  var13 = var1.r.nextInt(16) & var9;
                  var14 = var1.e(var2, var3 - 1, var4);
                  if(var14 != (var14 | var13)) {
                     var1.f(var2, var3 - 1, var4, var14 | var13);
                  }
               }
            }
         }
      }

   }

   public void c(World var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      switch(var5) {
      case 2:
         var6 = 1;
         break;
      case 3:
         var6 = 4;
         break;
      case 4:
         var6 = 8;
         break;
      case 5:
         var6 = 2;
      }

      if(var6 != 0) {
         var1.f(var2, var3, var4, var6);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(World var1, Player var2, int var3, int var4, int var5, int var6) {
      if(!var1.F && var2.av() != null && var2.av().c == yr.be.bQ) {
         var2.a(gv.C[this.bO], 1);
         this.a(var1, var3, var4, var5, new aan(bu, 1, 0));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }
}
