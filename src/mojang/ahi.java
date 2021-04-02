package mojang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ahi extends pb {

   private boolean a = true;
   private Set b = new HashSet();


   public ahi(int var1, int var2) {
      super(var1, var2, acn.p);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   public int a(int var1, int var2) {
      return this.bN;
   }

   public wu c(World var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int d() {
      return 5;
   }

   public int c(WorldInterface var1, int var2, int var3, int var4) {
      return 8388608;
   }

   public boolean e(World var1, int var2, int var3, int var4) {
      return var1.h(var2, var3 - 1, var4) || var1.a(var2, var3 - 1, var4) == bd.bO;
   }

   private void h(World var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, var2, var3, var4);
      ArrayList var5 = new ArrayList(this.b);
      this.b.clear();

      for(int var6 = 0; var6 < var5.size(); ++var6) {
         qo var7 = (qo)var5.get(var6);
         var1.j(var7.a, var7.b, var7.c, this.bO);
      }

   }

   private void a(World var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.e(var2, var3, var4);
      int var9 = 0;
      this.a = false;
      boolean var10 = var1.x(var2, var3, var4);
      this.a = true;
      int var11;
      int var12;
      int var13;
      if(var10) {
         var9 = 15;
      } else {
         for(var11 = 0; var11 < 4; ++var11) {
            var12 = var2;
            var13 = var4;
            if(var11 == 0) {
               var12 = var2 - 1;
            }

            if(var11 == 1) {
               ++var12;
            }

            if(var11 == 2) {
               var13 = var4 - 1;
            }

            if(var11 == 3) {
               ++var13;
            }

            if(var12 != var5 || var3 != var6 || var13 != var7) {
               var9 = this.f(var1, var12, var3, var13, var9);
            }

            if(var1.h(var12, var3, var13) && !var1.h(var2, var3 + 1, var4)) {
               if(var12 != var5 || var3 + 1 != var6 || var13 != var7) {
                  var9 = this.f(var1, var12, var3 + 1, var13, var9);
               }
            } else if(!var1.h(var12, var3, var13) && (var12 != var5 || var3 - 1 != var6 || var13 != var7)) {
               var9 = this.f(var1, var12, var3 - 1, var13, var9);
            }
         }

         if(var9 > 0) {
            --var9;
         } else {
            var9 = 0;
         }
      }

      if(var8 != var9) {
         var1.o = true;
         var1.f(var2, var3, var4, var9);
         var1.c(var2, var3, var4, var2, var3, var4);
         var1.o = false;

         for(var11 = 0; var11 < 4; ++var11) {
            var12 = var2;
            var13 = var4;
            int var14 = var3 - 1;
            if(var11 == 0) {
               var12 = var2 - 1;
            }

            if(var11 == 1) {
               ++var12;
            }

            if(var11 == 2) {
               var13 = var4 - 1;
            }

            if(var11 == 3) {
               ++var13;
            }

            if(var1.h(var12, var3, var13)) {
               var14 += 2;
            }

            boolean var15 = false;
            int var16 = this.f(var1, var12, var3, var13, -1);
            var9 = var1.e(var2, var3, var4);
            if(var9 > 0) {
               --var9;
            }

            if(var16 >= 0 && var16 != var9) {
               this.a(var1, var12, var3, var13, var2, var3, var4);
            }

            var16 = this.f(var1, var12, var14, var13, -1);
            var9 = var1.e(var2, var3, var4);
            if(var9 > 0) {
               --var9;
            }

            if(var16 >= 0 && var16 != var9) {
               this.a(var1, var12, var14, var13, var2, var3, var4);
            }
         }

         if(var8 < var9 || var9 == 0) {
            this.b.add(new qo(var2, var3, var4));
            this.b.add(new qo(var2 - 1, var3, var4));
            this.b.add(new qo(var2 + 1, var3, var4));
            this.b.add(new qo(var2, var3 - 1, var4));
            this.b.add(new qo(var2, var3 + 1, var4));
            this.b.add(new qo(var2, var3, var4 - 1));
            this.b.add(new qo(var2, var3, var4 + 1));
         }
      }

   }

   private void i(World var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this.bO) {
         var1.j(var2, var3, var4, this.bO);
         var1.j(var2 - 1, var3, var4, this.bO);
         var1.j(var2 + 1, var3, var4, this.bO);
         var1.j(var2, var3, var4 - 1, this.bO);
         var1.j(var2, var3, var4 + 1, this.bO);
         var1.j(var2, var3 - 1, var4, this.bO);
         var1.j(var2, var3 + 1, var4, this.bO);
      }
   }

   public void a(World var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if(!var1.F) {
         this.h(var1, var2, var3, var4);
         var1.j(var2, var3 + 1, var4, this.bO);
         var1.j(var2, var3 - 1, var4, this.bO);
         this.i(var1, var2 - 1, var3, var4);
         this.i(var1, var2 + 1, var3, var4);
         this.i(var1, var2, var3, var4 - 1);
         this.i(var1, var2, var3, var4 + 1);
         if(var1.h(var2 - 1, var3, var4)) {
            this.i(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 - 1, var3 - 1, var4);
         }

         if(var1.h(var2 + 1, var3, var4)) {
            this.i(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 + 1, var3 - 1, var4);
         }

         if(var1.h(var2, var3, var4 - 1)) {
            this.i(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 - 1);
         }

         if(var1.h(var2, var3, var4 + 1)) {
            this.i(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   public void b_(World var1, int var2, int var3, int var4) {
      super.b_(var1, var2, var3, var4);
      if(!var1.F) {
         var1.j(var2, var3 + 1, var4, this.bO);
         var1.j(var2, var3 - 1, var4, this.bO);
         var1.j(var2 + 1, var3, var4, this.bO);
         var1.j(var2 - 1, var3, var4, this.bO);
         var1.j(var2, var3, var4 + 1, this.bO);
         var1.j(var2, var3, var4 - 1, this.bO);
         this.h(var1, var2, var3, var4);
         this.i(var1, var2 - 1, var3, var4);
         this.i(var1, var2 + 1, var3, var4);
         this.i(var1, var2, var3, var4 - 1);
         this.i(var1, var2, var3, var4 + 1);
         if(var1.h(var2 - 1, var3, var4)) {
            this.i(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 - 1, var3 - 1, var4);
         }

         if(var1.h(var2 + 1, var3, var4)) {
            this.i(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.i(var1, var2 + 1, var3 - 1, var4);
         }

         if(var1.h(var2, var3, var4 - 1)) {
            this.i(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 - 1);
         }

         if(var1.h(var2, var3, var4 + 1)) {
            this.i(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.i(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   private int f(World var1, int var2, int var3, int var4, int var5) {
      if(var1.a(var2, var3, var4) != this.bO) {
         return var5;
      } else {
         int var6 = var1.e(var2, var3, var4);
         return var6 > var5?var6:var5;
      }
   }

   public void a(World var1, int var2, int var3, int var4, int var5) {
      if(!var1.F) {
         int var6 = var1.e(var2, var3, var4);
         boolean var7 = this.e(var1, var2, var3, var4);
         if(!var7) {
            this.a(var1, var2, var3, var4, var6, 0);
            var1.g(var2, var3, var4, 0);
         } else {
            this.h(var1, var2, var3, var4);
         }

         super.a(var1, var2, var3, var4, var5);
      }
   }

   public int a(int var1, Random var2, int var3) {
      return yr.aC.bQ;
   }

   public boolean e(World var1, int var2, int var3, int var4, int var5) {
      return !this.a ? false : this.b((WorldInterface)var1, var2, var3, var4, var5);
   }

   public boolean b(WorldInterface var1, int var2, int var3, int var4, int var5) {
      if(!this.a) {
         return false;
      } else if(var1.e(var2, var3, var4) == 0) {
         return false;
      } else if(var5 == 1) {
         return true;
      } else {
         boolean var6 = f(var1, var2 - 1, var3, var4, 1) || !var1.h(var2 - 1, var3, var4) && f(var1, var2 - 1, var3 - 1, var4, -1);
         boolean var7 = f(var1, var2 + 1, var3, var4, 3) || !var1.h(var2 + 1, var3, var4) && f(var1, var2 + 1, var3 - 1, var4, -1);
         boolean var8 = f(var1, var2, var3, var4 - 1, 2) || !var1.h(var2, var3, var4 - 1) && f(var1, var2, var3 - 1, var4 - 1, -1);
         boolean var9 = f(var1, var2, var3, var4 + 1, 0) || !var1.h(var2, var3, var4 + 1) && f(var1, var2, var3 - 1, var4 + 1, -1);
         if(!var1.h(var2, var3 + 1, var4)) {
            if(var1.h(var2 - 1, var3, var4) && f(var1, var2 - 1, var3 + 1, var4, -1)) {
               var6 = true;
            }

            if(var1.h(var2 + 1, var3, var4) && f(var1, var2 + 1, var3 + 1, var4, -1)) {
               var7 = true;
            }

            if(var1.h(var2, var3, var4 - 1) && f(var1, var2, var3 + 1, var4 - 1, -1)) {
               var8 = true;
            }

            if(var1.h(var2, var3, var4 + 1) && f(var1, var2, var3 + 1, var4 + 1, -1)) {
               var9 = true;
            }
         }

         return !var8 && !var7 && !var6 && !var9 && var5 >= 2 && var5 <= 5?true:(var5 == 2 && var8 && !var6 && !var7?true:(var5 == 3 && var9 && !var6 && !var7?true:(var5 == 4 && var6 && !var8 && !var9?true:var5 == 5 && var7 && !var8 && !var9)));
      }
   }

   public boolean g() {
      return this.a;
   }

   public void b(World var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      if(var6 > 0) {
         double var7 = (double)var2 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
         double var9 = (double)((float)var3 + 0.0625F);
         double var11 = (double)var4 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
         float var13 = (float)var6 / 15.0F;
         float var14 = var13 * 0.6F + 0.4F;
         if(var6 == 0) {
            var14 = 0.0F;
         }

         float var15 = var13 * var13 * 0.7F - 0.5F;
         float var16 = var13 * var13 * 0.6F - 0.7F;
         if(var15 < 0.0F) {
            var15 = 0.0F;
         }

         if(var16 < 0.0F) {
            var16 = 0.0F;
         }

         var1.a("reddust", var7, var9, var11, (double)var14, (double)var15, (double)var16);
      }

   }

   public static boolean e(WorldInterface var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.a(var1, var2, var3);
      if(var5 == av.bO) {
         return true;
      } else if(var5 == 0) {
         return false;
      } else if(var5 != bh.bO && var5 != bi.bO) {
         return m[var5].g() && var4 != -1;
      } else {
         int var6 = var0.e(var1, var2, var3);
         return var4 == (var6 & 3) || var4 == aav.e[var6 & 3];
      }
   }

   public static boolean f(WorldInterface var0, int var1, int var2, int var3, int var4) {
      if(e(var0, var1, var2, var3, var4)) {
         return true;
      } else {
         int var5 = var0.a(var1, var2, var3);
         if(var5 == bi.bO) {
            int var6 = var0.e(var1, var2, var3);
            return var4 == (var6 & 3);
         } else {
            return false;
         }
      }
   }
}
