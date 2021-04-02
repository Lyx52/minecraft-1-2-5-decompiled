package mojang;

public class kt extends pb {

   protected kt(int var1, acn var2) {
      super(var1, var2);
      this.bN = 84;
      if(var2 == acn.f) {
         ++this.bN;
      }

      float var3 = 0.5F;
      float var4 = 1.0F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean b(ali var1, int var2, int var3, int var4) {
      return !e(var1.e(var2, var3, var4));
   }

   public int d() {
      return 0;
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
      this.i_(var1.e(var2, var3, var4));
   }

   public void h() {
      float var1 = 0.1875F;
      this.a(0.0F, 0.5F - var1 / 2.0F, 0.0F, 1.0F, 0.5F + var1 / 2.0F, 1.0F);
   }

   public void i_(int var1) {
      float var2 = 0.1875F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, var2, 1.0F);
      if(e(var1)) {
         if((var1 & 3) == 0) {
            this.a(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
         }

         if((var1 & 3) == 1) {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
         }

         if((var1 & 3) == 2) {
            this.a(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }

         if((var1 & 3) == 3) {
            this.a(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
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
         int var6 = var1.e(var2, var3, var4);
         var1.f(var2, var3, var4, var6 ^ 4);
         var1.a(var5, 1003, var2, var3, var4, 0);
         return true;
      }
   }

   public void a(xd var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.e(var2, var3, var4);
      boolean var7 = (var6 & 4) > 0;
      if(var7 != var5) {
         var1.f(var2, var3, var4, var6 ^ 4);
         var1.a((yw)null, 1003, var2, var3, var4, 0);
      }
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      if(!var1.F) {
         int var6 = var1.e(var2, var3, var4);
         int var7 = var2;
         int var8 = var4;
         if((var6 & 3) == 0) {
            var8 = var4 + 1;
         }

         if((var6 & 3) == 1) {
            --var8;
         }

         if((var6 & 3) == 2) {
            var7 = var2 + 1;
         }

         if((var6 & 3) == 3) {
            --var7;
         }

         if(!h(var1.a(var7, var3, var8))) {
            var1.g(var2, var3, var4, 0);
            this.a(var1, var2, var3, var4, var6, 0);
         }

         boolean var9 = var1.x(var2, var3, var4);
         if(var9 || var5 > 0 && m[var5].g() || var5 == 0) {
            this.a(var1, var2, var3, var4, var9);
         }

      }
   }

   public pl a(xd var1, int var2, int var3, int var4, bo var5, bo var6) {
      this.a(var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void c(xd var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      if(var5 == 2) {
         var6 = 0;
      }

      if(var5 == 3) {
         var6 = 1;
      }

      if(var5 == 4) {
         var6 = 2;
      }

      if(var5 == 5) {
         var6 = 3;
      }

      var1.f(var2, var3, var4, var6);
   }

   public boolean d(xd var1, int var2, int var3, int var4, int var5) {
      if(var5 == 0) {
         return false;
      } else if(var5 == 1) {
         return false;
      } else {
         if(var5 == 2) {
            ++var4;
         }

         if(var5 == 3) {
            --var4;
         }

         if(var5 == 4) {
            ++var2;
         }

         if(var5 == 5) {
            --var2;
         }

         return h(var1.a(var2, var3, var4));
      }
   }

   public static boolean e(int var0) {
      return (var0 & 4) != 0;
   }

   private static boolean h(int var0) {
      if(var0 <= 0) {
         return false;
      } else {
         pb var1 = m[var0];
         return var1 != null && var1.cd.j() && var1.b() || var1 == bd;
      }
   }
}
