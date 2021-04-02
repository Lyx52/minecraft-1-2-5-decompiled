package mojang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class xq extends agt {

   private abn[] a;
   private boolean f;
   private sj[] g;


   public xq() {
      this.a = new abn[]{abn.d, abn.f, abn.e, abn.h, abn.g, abn.n, abn.o, abn.s, abn.t, abn.v, abn.w, abn.x};
      this.g = new sj[3];
   }

   protected boolean a(int var1, int var2) {
      if(!this.f) {
         Random var3 = new Random();
         var3.setSeed(this.d.v());
         double var4 = var3.nextDouble() * 3.141592653589793D * 2.0D;

         for(int var6 = 0; var6 < this.g.length; ++var6) {
            double var7 = (1.25D + var3.nextDouble()) * 32.0D;
            int var9 = (int)Math.round(Math.cos(var4) * var7);
            int var10 = (int)Math.round(Math.sin(var4) * var7);
            ArrayList var11 = new ArrayList();
            abn[] var12 = this.a;
            int var13 = var12.length;

            for(int var14 = 0; var14 < var13; ++var14) {
               abn var15 = var12[var14];
               var11.add(var15);
            }

            qo var19 = this.d.i().a((var9 << 4) + 8, (var10 << 4) + 8, 112, var11, var3);
            if(var19 != null) {
               var9 = var19.a >> 4;
               var10 = var19.c >> 4;
            } else {
               System.out.println("Placed stronghold in INVALID biome at (" + var9 + ", " + var10 + ")");
            }

            this.g[var6] = new sj(var9, var10);
            var4 += 6.283185307179586D / (double)this.g.length;
         }

         this.f = true;
      }

      sj[] var16 = this.g;
      int var17 = var16.length;

      for(int var5 = 0; var5 < var17; ++var5) {
         sj var18 = var16[var5];
         if(var1 == var18.a && var2 == var18.b) {
            System.out.println(var1 + ", " + var2);
            return true;
         }
      }

      return false;
   }

   protected List a() {
      ArrayList var1 = new ArrayList();
      sj[] var2 = this.g;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         sj var5 = var2[var4];
         if(var5 != null) {
            var1.add(var5.a(64));
         }
      }

      return var1;
   }

   protected pg b(int var1, int var2) {
      ajo var3;
      for(var3 = new ajo(this.d, this.c, var1, var2); var3.b().isEmpty() || ((s)var3.b().get(0)).b == null; var3 = new ajo(this.d, this.c, var1, var2)) {
         ;
      }

      return var3;
   }
}
