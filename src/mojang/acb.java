package mojang;

import java.util.Random;

public class acb extends pb {

   protected acb(int var1, acn var2) {
      super(var1, var2);
      this.bN = 97;
      if(var2 == acn.f) {
         ++this.bN;
      }

      float var3 = 0.5F;
      float var4 = 1.0F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   public int d(ali var1, int var2, int var3, int var4, int var5) {
      if(var5 != 0 && var5 != 1) {
         int var6 = this.i(var1, var2, var3, var4);
         int var7 = this.bN;
         if((var6 & 8) != 0) {
            var7 -= 16;
         }

         int var8 = var6 & 3;
         boolean var9 = (var6 & 4) != 0;
         if(!var9) {
            if(var8 == 0 && var5 == 5) {
               var7 = -var7;
            } else if(var8 == 1 && var5 == 3) {
               var7 = -var7;
            } else if(var8 == 2 && var5 == 4) {
               var7 = -var7;
            } else if(var8 == 3 && var5 == 2) {
               var7 = -var7;
            }

            if((var6 & 16) != 0) {
               var7 = -var7;
            }
         } else if(var8 == 0 && var5 == 2) {
            var7 = -var7;
         } else if(var8 == 1 && var5 == 5) {
            var7 = -var7;
         } else if(var8 == 2 && var5 == 3) {
            var7 = -var7;
         } else if(var8 == 3 && var5 == 4) {
            var7 = -var7;
         }

         return var7;
      } else {
         return this.bN;
      }
   }

   public boolean a() {
      return false;
   }

   public boolean b(ali var1, int var2, int var3, int var4) {
      int var5 = this.i(var1, var2, var3, var4);
      return (var5 & 4) != 0;
   }

   public boolean b() {
      return false;
   }

   public int d() {
      return 7;
   }

   public wu d(xd var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
      return super.d(var1, var2, var3, var4);
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
      return super.c(var1, var2, var3, var4);
   }

   public void a(ali var1, int var2, int var3, int var4) {
      this.e(this.i(var1, var2, var3, var4));
   }

   public int gint(ali var1, int var2, int var3, int var4) {
      return this.i(var1, var2, var3, var4) & 3;
   }

   public boolean h(ali var1, int var2, int var3, int var4) {
      return (this.i(var1, var2, var3, var4) & 4) != 0;
   }

   private void e(int var1) {
      float var2 = 0.1875F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      int var3 = var1 & 3;
      boolean var4 = (var1 & 4) != 0;
      boolean var5 = (var1 & 16) != 0;
      if(var3 == 0) {
         if(!var4) {
            this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
         } else if(!var5) {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
         } else {
            this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
         }
      } else if(var3 == 1) {
         if(!var4) {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
         } else if(!var5) {
            this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         } else {
            this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
         }
      } else if(var3 == 2) {
         if(!var4) {
            this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         } else if(!var5) {
            this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
         } else {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
         }
      } else if(var3 == 3) {
         if(!var4) {
            this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
         } else if(!var5) {
            this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
         } else {
            this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }
      }

   }

   public void a(xd var1, int var2, int var3, int var4, yw var5) {
      this.b(var1, var2, var3, var4, var5);
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      if(this.cd == acn.f) {
         return true;
      } else {
         int var6 = this.i(var1, var2, var3, var4);
         int var7 = var6 & 7;
         var7 ^= 4;
         if((var6 & 8) != 0) {
            var1.f(var2, var3 - 1, var4, var7);
            var1.c(var2, var3 - 1, var4, var2, var3, var4);
         } else {
            var1.f(var2, var3, var4, var7);
            var1.c(var2, var3, var4, var2, var3, var4);
         }

         var1.a(var5, 1003, var2, var3, var4, 0);
         return true;
      }
   }

   public void a(xd var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.i(var1, var2, var3, var4);
      boolean var7 = (var6 & 4) != 0;
      if(var7 != var5) {
         int var8 = var6 & 7;
         var8 ^= 4;
         if((var6 & 8) != 0) {
            var1.f(var2, var3 - 1, var4, var8);
            var1.c(var2, var3 - 1, var4, var2, var3, var4);
         } else {
            var1.f(var2, var3, var4, var8);
            var1.c(var2, var3, var4, var2, var3, var4);
         }

         var1.a((yw)null, 1003, var2, var3, var4, 0);
      }
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      if((var6 & 8) != 0) {
         if(var1.a(var2, var3 - 1, var4) != this.bO) {
            var1.g(var2, var3, var4, 0);
         }

         if(var5 > 0 && var5 != this.bO) {
            this.a(var1, var2, var3 - 1, var4, var5);
         }
      } else {
         boolean var7 = false;
         if(var1.a(var2, var3 + 1, var4) != this.bO) {
            var1.g(var2, var3, var4, 0);
            var7 = true;
         }

         if(!var1.h(var2, var3 - 1, var4)) {
            var1.g(var2, var3, var4, 0);
            var7 = true;
            if(var1.a(var2, var3 + 1, var4) == this.bO) {
               var1.g(var2, var3 + 1, var4, 0);
            }
         }

         if(var7) {
            if(!var1.F) {
               this.a(var1, var2, var3, var4, var6, 0);
            }
         } else {
            boolean var8 = var1.x(var2, var3, var4) || var1.x(var2, var3 + 1, var4);
            if((var8 || var5 > 0 && m[var5].g() || var5 == 0) && var5 != this.bO) {
               this.a(var1, var2, var3, var4, var8);
            }
         }
      }

   }

   public int a(int var1, Random var2, int var3) {
      return (var1 & 8) != 0?0:(this.cd == acn.f?yr.aB.bQ:yr.av.bQ);
   }

   public pl a(xd var1, int var2, int var3, int var4, bo var5, bo var6) {
      this.a(var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return var3 >= 255?false:var1.h(var2, var3 - 1, var4) && super.e(var1, var2, var3, var4) && super.e(var1, var2, var3 + 1, var4);
   }

   public int f() {
      return 1;
   }

   public int i(ali var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      boolean var6 = (var5 & 8) != 0;
      int var7;
      int var8;
      if(var6) {
         var7 = var1.e(var2, var3 - 1, var4);
         var8 = var5;
      } else {
         var7 = var5;
         var8 = var1.e(var2, var3 + 1, var4);
      }

      boolean var9 = (var8 & 1) != 0;
      int var10 = var7 & 7 | (var6?8:0) | (var9?16:0);
      return var10;
   }
}
