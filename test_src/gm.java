import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class gm extends dd {

   public io a = new tj(this, "Enchant", 1);
   private xd h;
   private int i;
   private int j;
   private int k;
   private Random l = new Random();
   public long b;
   public int[] c = new int[3];


   public gm(aak var1, xd var2, int var3, int var4, int var5) {
      this.h = var2;
      this.i = var3;
      this.j = var4;
      this.k = var5;
      this.a((yu)(new sl(this, this.a, 0, 25, 47)));

      int var6;
      for(var6 = 0; var6 < 3; ++var6) {
         for(int var7 = 0; var7 < 9; ++var7) {
            this.a(new yu(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for(var6 = 0; var6 < 9; ++var6) {
         this.a(new yu(var1, var6, 8 + var6 * 18, 142));
      }

   }

   public void a() {
      super.a();

      for(int var1 = 0; var1 < this.g.size(); ++var1) {
         wm var2 = (wm)this.g.get(var1);
         var2.a(this, 0, this.c[0]);
         var2.a(this, 1, this.c[1]);
         var2.a(this, 2, this.c[2]);
      }

   }

   public void a(int var1, int var2) {
      if(var1 >= 0 && var1 <= 2) {
         this.c[var1] = var2;
      } else {
         super.a(var1, var2);
      }

   }

   public void a(io var1) {
      if(var1 == this.a) {
         aan var2 = var1.k_(0);
         int var3;
         if(var2 != null && var2.t()) {
            this.b = this.l.nextLong();
            if(!this.h.F) {
               var3 = 0;

               int var4;
               for(var4 = -1; var4 <= 1; ++var4) {
                  for(int var5 = -1; var5 <= 1; ++var5) {
                     if((var4 != 0 || var5 != 0) && this.h.i(this.i + var5, this.j, this.k + var4) && this.h.i(this.i + var5, this.j + 1, this.k + var4)) {
                        if(this.h.a(this.i + var5 * 2, this.j, this.k + var4 * 2) == pb.an.bO) {
                           ++var3;
                        }

                        if(this.h.a(this.i + var5 * 2, this.j + 1, this.k + var4 * 2) == pb.an.bO) {
                           ++var3;
                        }

                        if(var5 != 0 && var4 != 0) {
                           if(this.h.a(this.i + var5 * 2, this.j, this.k + var4) == pb.an.bO) {
                              ++var3;
                           }

                           if(this.h.a(this.i + var5 * 2, this.j + 1, this.k + var4) == pb.an.bO) {
                              ++var3;
                           }

                           if(this.h.a(this.i + var5, this.j, this.k + var4 * 2) == pb.an.bO) {
                              ++var3;
                           }

                           if(this.h.a(this.i + var5, this.j + 1, this.k + var4 * 2) == pb.an.bO) {
                              ++var3;
                           }
                        }
                     }
                  }
               }

               for(var4 = 0; var4 < 3; ++var4) {
                  this.c[var4] = ais.a(this.l, var4, var3, var2);
               }

               this.a();
            }
         } else {
            for(var3 = 0; var3 < 3; ++var3) {
               this.c[var3] = 0;
            }
         }
      }

   }

   public boolean a(yw var1, int var2) {
      aan var3 = this.a.k_(0);
      if(this.c[var2] > 0 && var3 != null && (var1.aU >= this.c[var2] || var1.aT.d)) {
         if(!this.h.F) {
            List var4 = ais.b(this.l, var3, this.c[var2]);
            if(var4 != null) {
               var1.j(this.c[var2]);
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  lf var6 = (lf)var5.next();
                  var3.a(var6.a, var6.b);
               }

               this.a(this.a);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(yw var1) {
      super.a(var1);
      if(!this.h.F) {
         aan var2 = this.a.b(0);
         if(var2 != null) {
            var1.a(var2);
         }

      }
   }

   public boolean b(yw var1) {
      return this.h.a(this.i, this.j, this.k) != pb.bE.bO?false:var1.f((double)this.i + 0.5D, (double)this.j + 0.5D, (double)this.k + 0.5D) <= 64.0D;
   }

   public aan a(int var1) {
      aan var2 = null;
      yu var3 = (yu)this.e.get(var1);
      if(var3 != null && var3.c()) {
         aan var4 = var3.b();
         var2 = var4.k();
         if(var1 != 0) {
            return null;
         }

         if(!this.a(var4, 1, 37, true)) {
            return null;
         }

         if(var4.a == 0) {
            var3.d((aan)null);
         } else {
            var3.d();
         }

         if(var4.a == var2.a) {
            return null;
         }

         var3.b(var4);
      }

      return var2;
   }
}
