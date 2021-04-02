package mojang;

public class aai implements wf {

   private int b;
   private int c;
   private aan[] d;
   private aan e;
   public final int a;


   public aai(int var1, int var2, aan[] var3, aan var4) {
      this.a = var4.c;
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public aan b() {
      return this.e;
   }

   public boolean a(ade var1) {
      for(int var2 = 0; var2 <= 3 - this.b; ++var2) {
         for(int var3 = 0; var3 <= 3 - this.c; ++var3) {
            if(this.a(var1, var2, var3, true)) {
               return true;
            }

            if(this.a(var1, var2, var3, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean a(ade var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < 3; ++var5) {
         for(int var6 = 0; var6 < 3; ++var6) {
            int var7 = var5 - var2;
            int var8 = var6 - var3;
            aan var9 = null;
            if(var7 >= 0 && var8 >= 0 && var7 < this.b && var8 < this.c) {
               if(var4) {
                  var9 = this.d[this.b - var7 - 1 + var8 * this.b];
               } else {
                  var9 = this.d[var7 + var8 * this.b];
               }
            }

            aan var10 = var1.b(var5, var6);
            if(var10 != null || var9 != null) {
               if(var10 == null && var9 != null || var10 != null && var9 == null) {
                  return false;
               }

               if(var9.c != var10.c) {
                  return false;
               }

               if(var9.i() != -1 && var9.i() != var10.i()) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   public aan b(ade var1) {
      return new aan(this.e.c, this.e.a, this.e.i());
   }

   public int a() {
      return this.b * this.c;
   }
}
