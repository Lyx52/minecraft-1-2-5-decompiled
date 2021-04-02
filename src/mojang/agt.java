package mojang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class agt extends xu {

   protected HashMap e = new HashMap();


   public void a(ca var1, World var2, int var3, int var4, byte[] var5) {
      super.a(var1, var2, var3, var4, var5);
   }

   protected void a(World var1, int var2, int var3, int var4, int var5, byte[] var6) {
      if(!this.e.containsKey(Long.valueOf(sj.a(var2, var3)))) {
         this.c.nextInt();
         if(this.a(var2, var3)) {
            pg var7 = this.b(var2, var3);
            this.e.put(Long.valueOf(sj.a(var2, var3)), var7);
         }

      }
   }

   public boolean a(World var1, Random var2, int var3, int var4) {
      int var5 = (var3 << 4) + 8;
      int var6 = (var4 << 4) + 8;
      boolean var7 = false;
      Iterator var8 = this.e.values().iterator();

      while(var8.hasNext()) {
         pg var9 = (pg)var8.next();
         if(var9.d() && var9.a().a(var5, var6, var5 + 15, var6 + 15)) {
            var9.a(var1, var2, new qg(var5, var6, var5 + 15, var6 + 15));
            var7 = true;
         }
      }

      return var7;
   }

   public boolean a(int var1, int var2, int var3) {
      Iterator var4 = this.e.values().iterator();

      while(var4.hasNext()) {
         pg var5 = (pg)var4.next();
         if(var5.d() && var5.a().a(var1, var3, var1, var3)) {
            Iterator var6 = var5.b().iterator();

            while(var6.hasNext()) {
               he var7 = (he)var6.next();
               if(var7.b().b(var1, var2, var3)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public qo a(World var1, int var2, int var3, int var4) {
      this.d = var1;
      this.c.setSeed(var1.v());
      long var5 = this.c.nextLong();
      long var7 = this.c.nextLong();
      long var9 = (long)(var2 >> 4) * var5;
      long var11 = (long)(var4 >> 4) * var7;
      this.c.setSeed(var9 ^ var11 ^ var1.v());
      this.a(var1, var2 >> 4, var4 >> 4, 0, 0, (byte[])null);
      double var13 = Double.MAX_VALUE;
      qo var15 = null;
      Iterator var16 = this.e.values().iterator();

      qo var19;
      int var20;
      int var21;
      int var22;
      double var23;
      while(var16.hasNext()) {
         pg var17 = (pg)var16.next();
         if(var17.d()) {
            he var18 = (he)var17.b().get(0);
            var19 = var18.a_();
            var20 = var19.a - var2;
            var21 = var19.b - var3;
            var22 = var19.c - var4;
            var23 = (double)(var20 + var20 * var21 * var21 + var22 * var22);
            if(var23 < var13) {
               var13 = var23;
               var15 = var19;
            }
         }
      }

      if(var15 != null) {
         return var15;
      } else {
         List var25 = this.a();
         if(var25 != null) {
            qo var26 = null;
            Iterator var27 = var25.iterator();

            while(var27.hasNext()) {
               var19 = (qo)var27.next();
               var20 = var19.a - var2;
               var21 = var19.b - var3;
               var22 = var19.c - var4;
               var23 = (double)(var20 + var20 * var21 * var21 + var22 * var22);
               if(var23 < var13) {
                  var13 = var23;
                  var26 = var19;
               }
            }

            return var26;
         } else {
            return null;
         }
      }
   }

   protected List a() {
      return null;
   }

   protected abstract boolean a(int var1, int var2);

   protected abstract pg b(int var1, int var2);
}
