package mojang;

import java.util.Random;

public class pp extends pb {

   protected pp(int var1) {
      super(var1, acn.d);
      this.bN = 20;
   }

   public int a(Random var1) {
      return 1;
   }

   public int a(int var1, Random var2, int var3) {
      return J.bO;
   }

   public void a(xd var1, yw var2, int var3, int var4, int var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public void b_(xd var1, int var2, int var3, int var4) {
      byte var5 = 4;
      int var6 = var5 + 1;
      if(var1.b(var2 - var6, var3 - var6, var4 - var6, var2 + var6, var3 + var6, var4 + var6)) {
         for(int var7 = -var5; var7 <= var5; ++var7) {
            for(int var8 = -var5; var8 <= var5; ++var8) {
               for(int var9 = -var5; var9 <= var5; ++var9) {
                  int var10 = var1.a(var2 + var7, var3 + var8, var4 + var9);
                  if(var10 == K.bO) {
                     int var11 = var1.e(var2 + var7, var3 + var8, var4 + var9);
                     if((var11 & 8) == 0) {
                        var1.c(var2 + var7, var3 + var8, var4 + var9, var11 | 8);
                     }
                  }
               }
            }
         }
      }

   }

   public int a(int var1, int var2) {
      return var1 == 1?21:(var1 == 0?21:(var2 == 1?116:(var2 == 2?117:(var2 == 3?153:20))));
   }

   protected int c(int var1) {
      return var1;
   }
}
