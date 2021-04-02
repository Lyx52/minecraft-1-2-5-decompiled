package mojang;

import java.util.Iterator;
import java.util.List;

public class ThrownPotion extends av {

   private int d;


   public ThrownPotion(World var1) {
      super(var1);
   }

   public ThrownPotion(World var1, Mob var2, int var3) {
      super(var1, var2);
      this.d = var3;
   }

   public ThrownPotion(World var1, double var2, double var4, double var6, int var8) {
      super(var1, var2, var4, var6);
      this.d = var8;
   }

   protected float e() {
      return 0.05F;
   }

   protected float c() {
      return 0.5F;
   }

   protected float d() {
      return -20.0F;
   }

   public int g() {
      return this.d;
   }

   protected void a(pl var1) {
      if(!this.k.F) {
         List var2 = yr.bs.e_(this.d);
         if(var2 != null && !var2.isEmpty()) {
            wu var3 = this.y.b(4.0D, 2.0D, 4.0D);
            List var4 = this.k.a(Mob.class, var3);
            if(var4 != null && !var4.isEmpty()) {
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  BaseEntity var6 = (BaseEntity)var5.next();
                  double var7 = this.f(var6);
                  if(var7 < 16.0D) {
                     double var9 = 1.0D - Math.sqrt(var7) / 4.0D;
                     if(var6 == var1.g) {
                        var9 = 1.0D;
                     }

                     Iterator var11 = var2.iterator();

                     while(var11.hasNext()) {
                        alg var12 = (alg)var11.next();
                        int var13 = var12.a();
                        if(aad.a[var13].b()) {
                           aad.a[var13].a(this.c, (Mob)var6, var12.c(), var9);
                        } else {
                           int var14 = (int)(var9 * (double)var12.b() + 0.5D);
                           if(var14 > 20) {
                              ((Mob)var6).b(new alg(var13, var14, var12.c()));
                           }
                        }
                     }
                  }
               }
            }
         }

         this.k.g(2002, (int)Math.round(this.o), (int)Math.round(this.p), (int)Math.round(this.q), this.d);
         this.A();
      }

   }
}
