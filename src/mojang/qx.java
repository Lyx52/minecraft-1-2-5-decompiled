package mojang;

import java.util.Random;

public class qx extends w {

   public static final double[] a = new double[]{-0.0625D, 0.0625D, 0.1875D, 0.3125D};
   private static final int[] b = new int[]{1, 2, 3, 4};
   private final boolean c;


   protected qx(int var1, boolean var2) {
      super(var1, 6, acn.p);
      this.c = var2;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public boolean b() {
      return false;
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return !var1.h(var2, var3 - 1, var4)?false:super.e(var1, var2, var3, var4);
   }

   public boolean g(xd var1, int var2, int var3, int var4) {
      return !var1.h(var2, var3 - 1, var4)?false:super.g(var1, var2, var3, var4);
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      boolean var7 = this.f(var1, var2, var3, var4, var6);
      if(this.c && !var7) {
         var1.d(var2, var3, var4, bh.bO, var6);
      } else if(!this.c) {
         var1.d(var2, var3, var4, bi.bO, var6);
         if(!var7) {
            int var8 = (var6 & 12) >> 2;
            var1.a(var2, var3, var4, bi.bO, b[var8] * 2);
         }
      }

   }

   public int a(int var1, int var2) {
      return var1 == 0?(this.c?99:115):(var1 == 1?(this.c?147:131):5);
   }

   public boolean a(ali var1, int var2, int var3, int var4, int var5) {
      return var5 != 0 && var5 != 1;
   }

   public int d() {
      return 15;
   }

   public int a_(int var1) {
      return this.a(var1, 0);
   }

   public boolean e(xd var1, int var2, int var3, int var4, int var5) {
      return this.b((ali)var1, var2, var3, var4, var5);
   }

   public boolean b(ali var1, int var2, int var3, int var4, int var5) {
      if(!this.c) {
         return false;
      } else {
         int var6 = a(var1.e(var2, var3, var4));
         return var6 == 0 && var5 == 3?true:(var6 == 1 && var5 == 4?true:(var6 == 2 && var5 == 2?true:var6 == 3 && var5 == 5));
      }
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      if(!this.g(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
         var1.j(var2 + 1, var3, var4, this.bO);
         var1.j(var2 - 1, var3, var4, this.bO);
         var1.j(var2, var3, var4 + 1, this.bO);
         var1.j(var2, var3, var4 - 1, this.bO);
         var1.j(var2, var3 - 1, var4, this.bO);
         var1.j(var2, var3 + 1, var4, this.bO);
      } else {
         int var6 = var1.e(var2, var3, var4);
         boolean var7 = this.f(var1, var2, var3, var4, var6);
         int var8 = (var6 & 12) >> 2;
         if(this.c && !var7) {
            var1.a(var2, var3, var4, this.bO, b[var8] * 2);
         } else if(!this.c && var7) {
            var1.a(var2, var3, var4, this.bO, b[var8] * 2);
         }

      }
   }

   private boolean f(xd var1, int var2, int var3, int var4, int var5) {
      int var6 = a(var5);
      switch(var6) {
      case 0:
         return var1.l(var2, var3, var4 + 1, 3) || var1.a(var2, var3, var4 + 1) == av.bO && var1.e(var2, var3, var4 + 1) > 0;
      case 1:
         return var1.l(var2 - 1, var3, var4, 4) || var1.a(var2 - 1, var3, var4) == av.bO && var1.e(var2 - 1, var3, var4) > 0;
      case 2:
         return var1.l(var2, var3, var4 - 1, 2) || var1.a(var2, var3, var4 - 1) == av.bO && var1.e(var2, var3, var4 - 1) > 0;
      case 3:
         return var1.l(var2 + 1, var3, var4, 5) || var1.a(var2 + 1, var3, var4) == av.bO && var1.e(var2 + 1, var3, var4) > 0;
      default:
         return false;
      }
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      int var6 = var1.e(var2, var3, var4);
      int var7 = (var6 & 12) >> 2;
      var7 = var7 + 1 << 2 & 12;
      var1.f(var2, var3, var4, var7 | var6 & 3);
      return true;
   }

   public boolean g() {
      return true;
   }

   public void a(xd var1, int var2, int var3, int var4, acq var5) {
      int var6 = ((gk.c((double)(var5.u * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.f(var2, var3, var4, var6);
      boolean var7 = this.f(var1, var2, var3, var4, var6);
      if(var7) {
         var1.a(var2, var3, var4, this.bO, 1);
      }

   }

   public void a(xd var1, int var2, int var3, int var4) {
      var1.j(var2 + 1, var3, var4, this.bO);
      var1.j(var2 - 1, var3, var4, this.bO);
      var1.j(var2, var3, var4 + 1, this.bO);
      var1.j(var2, var3, var4 - 1, this.bO);
      var1.j(var2, var3 - 1, var4, this.bO);
      var1.j(var2, var3 + 1, var4, this.bO);
   }

   public void b(xd var1, int var2, int var3, int var4, int var5) {
      if(this.c) {
         var1.j(var2 + 1, var3, var4, this.bO);
         var1.j(var2 - 1, var3, var4, this.bO);
         var1.j(var2, var3, var4 + 1, this.bO);
         var1.j(var2, var3, var4 - 1, this.bO);
         var1.j(var2, var3 - 1, var4, this.bO);
         var1.j(var2, var3 + 1, var4, this.bO);
      }

      super.b(var1, var2, var3, var4, var5);
   }

   public boolean a() {
      return false;
   }

   public int a(int var1, Random var2, int var3) {
      return yr.bb.bQ;
   }

   public void b(xd var1, int var2, int var3, int var4, Random var5) {
      if(this.c) {
         int var6 = var1.e(var2, var3, var4);
         int var7 = a(var6);
         double var8 = (double)((float)var2 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var10 = (double)((float)var3 + 0.4F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var12 = (double)((float)var4 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var14 = 0.0D;
         double var16 = 0.0D;
         if(var5.nextInt(2) == 0) {
            switch(var7) {
            case 0:
               var16 = -0.3125D;
               break;
            case 1:
               var14 = 0.3125D;
               break;
            case 2:
               var16 = 0.3125D;
               break;
            case 3:
               var14 = -0.3125D;
            }
         } else {
            int var18 = (var6 & 12) >> 2;
            switch(var7) {
            case 0:
               var16 = a[var18];
               break;
            case 1:
               var14 = -a[var18];
               break;
            case 2:
               var16 = -a[var18];
               break;
            case 3:
               var14 = a[var18];
            }
         }

         var1.a("reddust", var8 + var14, var10, var12 + var16, 0.0D, 0.0D, 0.0D);
      }
   }

}
