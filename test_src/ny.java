import java.util.List;
import java.util.Random;

public class ny extends he {

   private final boolean a;
   private final boolean b;
   private boolean c;
   private int d;


   public ny(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
      this.a = var2.nextInt(3) == 0;
      this.b = !this.a && var2.nextInt(23) == 0;
      if(this.h != 2 && this.h != 0) {
         this.d = var3.b() / 5;
      } else {
         this.d = var3.d() / 5;
      }

   }

   public static qg a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      qg var6 = new qg(var2, var3, var4, var2, var3 + 2, var4);

      int var7;
      for(var7 = var1.nextInt(3) + 2; var7 > 0; --var7) {
         int var8 = var7 * 5;
         switch(var5) {
         case 0:
            var6.d = var2 + 2;
            var6.f = var4 + (var8 - 1);
            break;
         case 1:
            var6.a = var2 - (var8 - 1);
            var6.f = var4 + 2;
            break;
         case 2:
            var6.d = var2 + 2;
            var6.c = var4 - (var8 - 1);
            break;
         case 3:
            var6.d = var2 + (var8 - 1);
            var6.f = var4 + 2;
         }

         if(he.a(var0, var6) == null) {
            break;
         }
      }

      return var7 > 0?var6:null;
   }

   public void a(he var1, List var2, Random var3) {
      int var4 = this.c();
      int var5 = var3.nextInt(4);
      switch(this.h) {
      case 0:
         if(var5 <= 1) {
            gp.a(var1, var2, var3, this.g.a, this.g.b - 1 + var3.nextInt(3), this.g.f + 1, this.h, var4);
         } else if(var5 == 2) {
            gp.a(var1, var2, var3, this.g.a - 1, this.g.b - 1 + var3.nextInt(3), this.g.f - 3, 1, var4);
         } else {
            gp.a(var1, var2, var3, this.g.d + 1, this.g.b - 1 + var3.nextInt(3), this.g.f - 3, 3, var4);
         }
         break;
      case 1:
         if(var5 <= 1) {
            gp.a(var1, var2, var3, this.g.a - 1, this.g.b - 1 + var3.nextInt(3), this.g.c, this.h, var4);
         } else if(var5 == 2) {
            gp.a(var1, var2, var3, this.g.a, this.g.b - 1 + var3.nextInt(3), this.g.c - 1, 2, var4);
         } else {
            gp.a(var1, var2, var3, this.g.a, this.g.b - 1 + var3.nextInt(3), this.g.f + 1, 0, var4);
         }
         break;
      case 2:
         if(var5 <= 1) {
            gp.a(var1, var2, var3, this.g.a, this.g.b - 1 + var3.nextInt(3), this.g.c - 1, this.h, var4);
         } else if(var5 == 2) {
            gp.a(var1, var2, var3, this.g.a - 1, this.g.b - 1 + var3.nextInt(3), this.g.c, 1, var4);
         } else {
            gp.a(var1, var2, var3, this.g.d + 1, this.g.b - 1 + var3.nextInt(3), this.g.c, 3, var4);
         }
         break;
      case 3:
         if(var5 <= 1) {
            gp.a(var1, var2, var3, this.g.d + 1, this.g.b - 1 + var3.nextInt(3), this.g.c, this.h, var4);
         } else if(var5 == 2) {
            gp.a(var1, var2, var3, this.g.d - 3, this.g.b - 1 + var3.nextInt(3), this.g.c - 1, 2, var4);
         } else {
            gp.a(var1, var2, var3, this.g.d - 3, this.g.b - 1 + var3.nextInt(3), this.g.f + 1, 0, var4);
         }
      }

      if(var4 < 8) {
         int var6;
         int var7;
         if(this.h != 2 && this.h != 0) {
            for(var6 = this.g.a + 3; var6 + 3 <= this.g.d; var6 += 5) {
               var7 = var3.nextInt(5);
               if(var7 == 0) {
                  gp.a(var1, var2, var3, var6, this.g.b, this.g.c - 1, 2, var4 + 1);
               } else if(var7 == 1) {
                  gp.a(var1, var2, var3, var6, this.g.b, this.g.f + 1, 0, var4 + 1);
               }
            }
         } else {
            for(var6 = this.g.c + 3; var6 + 3 <= this.g.f; var6 += 5) {
               var7 = var3.nextInt(5);
               if(var7 == 0) {
                  gp.a(var1, var2, var3, this.g.a - 1, this.g.b, var6, 1, var4 + 1);
               } else if(var7 == 1) {
                  gp.a(var1, var2, var3, this.g.d + 1, this.g.b, var6, 3, var4 + 1);
               }
            }
         }
      }

   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         int var8 = this.d * 5 - 1;
         this.a(var1, var3, 0, 0, 0, 2, 1, var8, 0, 0, false);
         this.a(var1, var3, var2, 0.8F, 0, 2, 0, 2, 2, var8, 0, 0, false);
         if(this.b) {
            this.a(var1, var3, var2, 0.6F, 0, 0, 0, 2, 1, var8, pb.W.bO, 0, false);
         }

         int var9;
         int var10;
         int var11;
         for(var9 = 0; var9 < this.d; ++var9) {
            var10 = 2 + var9 * 5;
            this.a(var1, var3, 0, 0, var10, 0, 1, var10, pb.aZ.bO, 0, false);
            this.a(var1, var3, 2, 0, var10, 2, 1, var10, pb.aZ.bO, 0, false);
            if(var2.nextInt(4) != 0) {
               this.a(var1, var3, 0, 2, var10, 2, 2, var10, pb.x.bO, 0, false);
            } else {
               this.a(var1, var3, 0, 2, var10, 0, 2, var10, pb.x.bO, 0, false);
               this.a(var1, var3, 2, 2, var10, 2, 2, var10, pb.x.bO, 0, false);
            }

            this.a(var1, var3, var2, 0.1F, 0, 2, var10 - 1, pb.W.bO, 0);
            this.a(var1, var3, var2, 0.1F, 2, 2, var10 - 1, pb.W.bO, 0);
            this.a(var1, var3, var2, 0.1F, 0, 2, var10 + 1, pb.W.bO, 0);
            this.a(var1, var3, var2, 0.1F, 2, 2, var10 + 1, pb.W.bO, 0);
            this.a(var1, var3, var2, 0.05F, 0, 2, var10 - 2, pb.W.bO, 0);
            this.a(var1, var3, var2, 0.05F, 2, 2, var10 - 2, pb.W.bO, 0);
            this.a(var1, var3, var2, 0.05F, 0, 2, var10 + 2, pb.W.bO, 0);
            this.a(var1, var3, var2, 0.05F, 2, 2, var10 + 2, pb.W.bO, 0);
            this.a(var1, var3, var2, 0.05F, 1, 2, var10 - 1, pb.aq.bO, 0);
            this.a(var1, var3, var2, 0.05F, 1, 2, var10 + 1, pb.aq.bO, 0);
            if(var2.nextInt(100) == 0) {
               this.a(var1, var3, var2, 2, 0, var10 - 1, gp.a(), 3 + var2.nextInt(4));
            }

            if(var2.nextInt(100) == 0) {
               this.a(var1, var3, var2, 0, 0, var10 + 1, gp.a(), 3 + var2.nextInt(4));
            }

            if(this.b && !this.c) {
               var11 = this.b(0);
               int var12 = var10 - 1 + var2.nextInt(3);
               int var13 = this.a(1, var12);
               var12 = this.b(1, var12);
               if(var3.b(var13, var11, var12)) {
                  this.c = true;
                  var1.g(var13, var11, var12, pb.as.bO);
                  cj var14 = (cj)var1.b(var13, var11, var12);
                  if(var14 != null) {
                     var14.a("CaveSpider");
                  }
               }
            }
         }

         for(var9 = 0; var9 <= 2; ++var9) {
            for(var10 = 0; var10 <= var8; ++var10) {
               var11 = this.a(var1, var9, -1, var10, var3);
               if(var11 == 0) {
                  this.a(var1, pb.x.bO, 0, var9, -1, var10, var3);
               }
            }
         }

         if(this.a) {
            for(var9 = 0; var9 <= var8; ++var9) {
               var10 = this.a(var1, 1, -1, var9, var3);
               if(var10 > 0 && pb.n[var10]) {
                  this.a(var1, var3, var2, 0.7F, 1, 0, var9, pb.aG.bO, this.c(pb.aG.bO, 0));
               }
            }
         }

         return true;
      }
   }
}
