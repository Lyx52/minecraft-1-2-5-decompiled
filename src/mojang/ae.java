package mojang;

import java.util.Random;

public class ae extends pb {

   public ae(int var1, int var2) {
      super(var1, var2, acn.s);
   }

   public int a_(int var1) {
      return var1 == 0?this.bN + 2:(var1 == 1?this.bN + 1:this.bN);
   }

   public void a(xd var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if(var1.x(var2, var3, var4)) {
         this.b(var1, var2, var3, var4, 1);
         var1.g(var2, var3, var4, 0);
      }

   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      if(var5 > 0 && m[var5].g() && var1.x(var2, var3, var4)) {
         this.b(var1, var2, var3, var4, 1);
         var1.g(var2, var3, var4, 0);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void b(xd var1, int var2, int var3, int var4) {
      if(!var1.F) {
         agg var5 = new agg(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F));
         var5.a = var1.r.nextInt(var5.a / 4) + var5.a / 8;
         var1.a((nn)var5);
      }
   }

   public void b(xd var1, int var2, int var3, int var4, int var5) {
      if(!var1.F) {
         if((var5 & 1) == 0) {
            this.a(var1, var2, var3, var4, new aan(am.bO, 1, 0));
         } else {
            agg var6 = new agg(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F));
            var1.a((nn)var6);
            var1.a(var6, "random.fuse", 1.0F, 1.0F);
         }

      }
   }

   public void a(xd var1, int var2, int var3, int var4, yw var5) {
      super.a(var1, var2, var3, var4, var5);
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      if(var5.av() != null && var5.av().c == yr.i.bQ) {
         this.b(var1, var2, var3, var4, 1);
         var1.g(var2, var3, var4, 0);
         return true;
      } else {
         return super.b(var1, var2, var3, var4, var5);
      }
   }

   protected aan b(int var1) {
      return null;
   }
}
