import java.util.Random;

public class pa extends agy {

   public pa(int var1) {
      super(var1, acn.E);
      this.c(-1.0F);
   }

   public kw u_() {
      return null;
   }

   public void a(xd var1, int var2, int var3, int var4) {}

   public void b_(xd var1, int var2, int var3, int var4) {
      kw var5 = var1.b(var2, var3, var4);
      if(var5 != null && var5 instanceof ou) {
         ((ou)var5).g();
      } else {
         super.b_(var1, var2, var3, var4);
      }

   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean d(xd var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public int d() {
      return -1;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      if(!var1.F && var1.b(var2, var3, var4) == null) {
         var1.g(var2, var3, var4, 0);
         return true;
      } else {
         return false;
      }
   }

   public int a(int var1, Random var2, int var3) {
      return 0;
   }

   public void a(xd var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.F) {
         ou var8 = this.g(var1, var2, var3, var4);
         if(var8 != null) {
            pb.m[var8.a()].a(var1, var2, var3, var4, var8.i(), 0);
         }
      }
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      if(!var1.F && var1.b(var2, var3, var4) == null) {
         ;
      }

   }

   public static kw a(int var0, int var1, int var2, boolean var3, boolean var4) {
      return new ou(var0, var1, var2, var3, var4);
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      ou var5 = this.g(var1, var2, var3, var4);
      if(var5 == null) {
         return null;
      } else {
         float var6 = var5.a(0.0F);
         if(var5.d()) {
            var6 = 1.0F - var6;
         }

         return this.b(var1, var2, var3, var4, var5.a(), var6, var5.e());
      }
   }

   public void a(ali var1, int var2, int var3, int var4) {
      ou var5 = this.g(var1, var2, var3, var4);
      if(var5 != null) {
         pb var6 = pb.m[var5.a()];
         if(var6 == null || var6 == this) {
            return;
         }

         var6.a(var1, var2, var3, var4);
         float var7 = var5.a(0.0F);
         if(var5.d()) {
            var7 = 1.0F - var7;
         }

         int var8 = var5.e();
         this.bV = var6.bV - (double)((float)qs.b[var8] * var7);
         this.bW = var6.bW - (double)((float)qs.c[var8] * var7);
         this.bX = var6.bX - (double)((float)qs.d[var8] * var7);
         this.bY = var6.bY - (double)((float)qs.b[var8] * var7);
         this.bZ = var6.bZ - (double)((float)qs.c[var8] * var7);
         this.ca = var6.ca - (double)((float)qs.d[var8] * var7);
      }

   }

   public wu b(xd var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(var5 != 0 && var5 != this.bO) {
         wu var8 = pb.m[var5].c(var1, var2, var3, var4);
         if(var8 == null) {
            return null;
         } else {
            if(qs.b[var7] < 0) {
               var8.a -= (double)((float)qs.b[var7] * var6);
            } else {
               var8.d -= (double)((float)qs.b[var7] * var6);
            }

            if(qs.c[var7] < 0) {
               var8.b -= (double)((float)qs.c[var7] * var6);
            } else {
               var8.e -= (double)((float)qs.c[var7] * var6);
            }

            if(qs.d[var7] < 0) {
               var8.c -= (double)((float)qs.d[var7] * var6);
            } else {
               var8.f -= (double)((float)qs.d[var7] * var6);
            }

            return var8;
         }
      } else {
         return null;
      }
   }

   private ou g(ali var1, int var2, int var3, int var4) {
      kw var5 = var1.b(var2, var3, var4);
      return var5 != null && var5 instanceof ou?(ou)var5:null;
   }
}
