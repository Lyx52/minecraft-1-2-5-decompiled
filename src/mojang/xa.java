package mojang;

public class xa extends w {

   private boolean a;


   protected xa(int var1, int var2, boolean var3) {
      super(var1, acn.z);
      this.bN = var2;
      this.a(true);
      this.a = var3;
   }

   public int a(int var1, int var2) {
      if(var1 == 1) {
         return this.bN;
      } else if(var1 == 0) {
         return this.bN;
      } else {
         int var3 = this.bN + 1 + 16;
         if(this.a) {
            ++var3;
         }

         return var2 == 2 && var1 == 2?var3:(var2 == 3 && var1 == 5?var3:(var2 == 0 && var1 == 3?var3:(var2 == 1 && var1 == 4?var3:this.bN + 16)));
      }
   }

   public int a_(int var1) {
      return var1 == 1?this.bN:(var1 == 0?this.bN:(var1 == 3?this.bN + 1 + 16:this.bN + 16));
   }

   public void a(xd var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if(var1.a(var2, var3 - 1, var4) == aU.bO && var1.a(var2, var3 - 2, var4) == aU.bO) {
         if(!var1.F) {
            var1.d(var2, var3, var4, 0);
            var1.d(var2, var3 - 1, var4, 0);
            var1.d(var2, var3 - 2, var4, 0);
            q var9 = new q(var1);
            var9.c((double)var2 + 0.5D, (double)var3 - 1.95D, (double)var4 + 0.5D, 0.0F, 0.0F);
            var1.a((nn)var9);
            var1.h(var2, var3, var4, 0);
            var1.h(var2, var3 - 1, var4, 0);
            var1.h(var2, var3 - 2, var4, 0);
         }

         for(int var10 = 0; var10 < 120; ++var10) {
            var1.a("snowshovel", (double)var2 + var1.r.nextDouble(), (double)(var3 - 2) + var1.r.nextDouble() * 2.5D, (double)var4 + var1.r.nextDouble(), 0.0D, 0.0D, 0.0D);
         }
      } else if(var1.a(var2, var3 - 1, var4) == ai.bO && var1.a(var2, var3 - 2, var4) == ai.bO) {
         boolean var5 = var1.a(var2 - 1, var3 - 1, var4) == ai.bO && var1.a(var2 + 1, var3 - 1, var4) == ai.bO;
         boolean var6 = var1.a(var2, var3 - 1, var4 - 1) == ai.bO && var1.a(var2, var3 - 1, var4 + 1) == ai.bO;
         if(var5 || var6) {
            var1.d(var2, var3, var4, 0);
            var1.d(var2, var3 - 1, var4, 0);
            var1.d(var2, var3 - 2, var4, 0);
            if(var5) {
               var1.d(var2 - 1, var3 - 1, var4, 0);
               var1.d(var2 + 1, var3 - 1, var4, 0);
            } else {
               var1.d(var2, var3 - 1, var4 - 1, 0);
               var1.d(var2, var3 - 1, var4 + 1, 0);
            }

            tl var7 = new tl(var1);
            var7.b(true);
            var7.c((double)var2 + 0.5D, (double)var3 - 1.95D, (double)var4 + 0.5D, 0.0F, 0.0F);
            var1.a((nn)var7);

            for(int var8 = 0; var8 < 120; ++var8) {
               var1.a("snowballpoof", (double)var2 + var1.r.nextDouble(), (double)(var3 - 2) + var1.r.nextDouble() * 3.9D, (double)var4 + var1.r.nextDouble(), 0.0D, 0.0D, 0.0D);
            }

            var1.h(var2, var3, var4, 0);
            var1.h(var2, var3 - 1, var4, 0);
            var1.h(var2, var3 - 2, var4, 0);
            if(var5) {
               var1.h(var2 - 1, var3 - 1, var4, 0);
               var1.h(var2 + 1, var3 - 1, var4, 0);
            } else {
               var1.h(var2, var3 - 1, var4 - 1, 0);
               var1.h(var2, var3 - 1, var4 + 1, 0);
            }
         }
      }

   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return (var5 == 0 || m[var5].cd.i()) && var1.h(var2, var3 - 1, var4);
   }

   public void a(xd var1, int var2, int var3, int var4, acq var5) {
      int var6 = gk.c((double)(var5.u * 4.0F / 360.0F) + 2.5D) & 3;
      var1.f(var2, var3, var4, var6);
   }
}
