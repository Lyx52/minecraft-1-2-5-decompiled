package mojang;

import java.util.Random;

public class aer extends pb {

   protected aer(int var1, int var2) {
      super(var1, var2, acn.x);
      this.a(true);
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(var1.i(var2, var3 + 1, var4)) {
         int var6;
         for(var6 = 1; var1.a(var2, var3 - var6, var4) == this.bO; ++var6) {
            ;
         }

         if(var6 < 3) {
            int var7 = var1.e(var2, var3, var4);
            if(var7 == 15) {
               var1.g(var2, var3 + 1, var4, this.bO);
               var1.f(var2, var3, var4, 0);
            } else {
               var1.f(var2, var3, var4, var7 + 1);
            }
         }
      }

   }

   public wu c(xd var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return wu.b((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)((float)(var3 + 1) - var5), (double)((float)(var4 + 1) - var5));
   }

   public wu d(xd var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return wu.b((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)(var3 + 1), (double)((float)(var4 + 1) - var5));
   }

   public int a_(int var1) {
      return var1 == 1?this.bN - 1:(var1 == 0?this.bN + 1:this.bN);
   }

   public boolean b() {
      return false;
   }

   public boolean a() {
      return false;
   }

   public int d() {
      return 13;
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return !super.e(var1, var2, var3, var4)?false:this.g(var1, var2, var3, var4);
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      if(!this.g(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public boolean g(xd var1, int var2, int var3, int var4) {
      if(var1.f(var2 - 1, var3, var4).a()) {
         return false;
      } else if(var1.f(var2 + 1, var3, var4).a()) {
         return false;
      } else if(var1.f(var2, var3, var4 - 1).a()) {
         return false;
      } else if(var1.f(var2, var3, var4 + 1).a()) {
         return false;
      } else {
         int var5 = var1.a(var2, var3 - 1, var4);
         return var5 == aV.bO || var5 == E.bO;
      }
   }

   public void a(xd var1, int var2, int var3, int var4, nn var5) {
      var5.a(md.h, 1);
   }
}
