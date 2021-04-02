package mojang;

import java.util.Random;

public class age extends pb {

   public age(int var1) {
      super(var1, 1, acn.y);
      this.c(0.0F);
   }

   public void a(xd var1, yw var2, int var3, int var4, int var5, int var6) {
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public int a(int var1, int var2) {
      return var2 == 1? w.bN:(var2 == 2? bm.bN: t.bN);
   }

   public void b(xd var1, int var2, int var3, int var4, int var5) {
      if(!var1.F) {
         qn var6 = new qn(var1);
         var6.c((double)var2 + 0.5D, (double)var3, (double)var4 + 0.5D, 0.0F, 0.0F);
         var1.a((nn)var6);
         var6.ba();
      }

      super.b(var1, var2, var3, var4, var5);
   }

   public int a(Random var1) {
      return 0;
   }

   public static boolean e(int var0) {
      return var0 == t.bO || var0 == w.bO || var0 == bm.bO;
   }

   public static int h(int var0) {
      return var0 == w.bO?1:(var0 == bm.bO?2:0);
   }

   protected aan b(int var1) {
      pb var2 = t;
      if(var1 == 1) {
         var2 = w;
      }

      if(var1 == 2) {
         var2 = bm;
      }

      return new aan(var2);
   }
}
