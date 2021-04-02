package mojang;

import java.util.ArrayList;

public class abc extends pb {

   private boolean a;
   private static boolean b;


   public abc(int var1, int var2, boolean var3) {
      super(var1, var2, acn.E);
      this.a = var3;
      this.a(h);
      this.c(0.5F);
   }

   public int v() {
      return this.a?106:107;
   }

   public int a(int var1, int var2) {
      int var3 = e(var2);
      return var3 > 5?this.bN:(var1 == var3?(!h(var2) && this.bV <= 0.0D && this.bW <= 0.0D && this.bX <= 0.0D && this.bY >= 1.0D && this.bZ >= 1.0D && this.ca >= 1.0D?this.bN:110):(var1 == qs.a[var3]?109:108));
   }

   public int d() {
      return 16;
   }

   public boolean a() {
      return false;
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      return false;
   }

   public void a(xd var1, int var2, int var3, int var4, acq var5) {
      int var6 = c(var1, var2, var3, var4, (yw)var5);
      var1.f(var2, var3, var4, var6);
      if(!var1.F && !b) {
         this.h(var1, var2, var3, var4);
      }

   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      if(!var1.F && !b) {
         this.h(var1, var2, var3, var4);
      }

   }

   public void a(xd var1, int var2, int var3, int var4) {
      if(!var1.F && var1.b(var2, var3, var4) == null && !b) {
         this.h(var1, var2, var3, var4);
      }

   }

   private void h(xd var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      int var6 = e(var5);
      boolean var7 = this.f(var1, var2, var3, var4, var6);
      if(var5 != 7) {
         if(var7 && !h(var5)) {
            if(g(var1, var2, var3, var4, var6)) {
               var1.c(var2, var3, var4, var6 | 8);
               var1.f(var2, var3, var4, 0, var6);
            }
         } else if(!var7 && h(var5)) {
            var1.c(var2, var3, var4, var6);
            var1.f(var2, var3, var4, 1, var6);
         }

      }
   }

   private boolean f(xd var1, int var2, int var3, int var4, int var5) {
      return var5 != 0 && var1.l(var2, var3 - 1, var4, 0)?true:(var5 != 1 && var1.l(var2, var3 + 1, var4, 1)?true:(var5 != 2 && var1.l(var2, var3, var4 - 1, 2)?true:(var5 != 3 && var1.l(var2, var3, var4 + 1, 3)?true:(var5 != 5 && var1.l(var2 + 1, var3, var4, 5)?true:(var5 != 4 && var1.l(var2 - 1, var3, var4, 4)?true:(var1.l(var2, var3, var4, 0)?true:(var1.l(var2, var3 + 2, var4, 1)?true:(var1.l(var2, var3 + 1, var4 - 1, 2)?true:(var1.l(var2, var3 + 1, var4 + 1, 3)?true:(var1.l(var2 - 1, var3 + 1, var4, 4)?true:var1.l(var2 + 1, var3 + 1, var4, 5)))))))))));
   }

   public void b(xd var1, int var2, int var3, int var4, int var5, int var6) {
      b = true;
      if(var5 == 0) {
         if(this.h(var1, var2, var3, var4, var6)) {
            var1.f(var2, var3, var4, var6 | 8);
            var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "tile.piston.out", 0.5F, var1.r.nextFloat() * 0.25F + 0.6F);
         } else {
            var1.c(var2, var3, var4, var6);
         }
      } else if(var5 == 1) {
         kw var8 = var1.b(var2 + qs.b[var6], var3 + qs.c[var6], var4 + qs.d[var6]);
         if(var8 != null && var8 instanceof ou) {
            ((ou)var8).g();
         }

         var1.b(var2, var3, var4, ac.bO, var6);
         var1.a(var2, var3, var4, pa.a(this.bO, var6, var6, false, true));
         if(this.a) {
            int var9 = var2 + qs.b[var6] * 2;
            int var10 = var3 + qs.c[var6] * 2;
            int var11 = var4 + qs.d[var6] * 2;
            int var12 = var1.a(var9, var10, var11);
            int var13 = var1.e(var9, var10, var11);
            boolean var14 = false;
            if(var12 == ac.bO) {
               kw var15 = var1.b(var9, var10, var11);
               if(var15 != null && var15 instanceof ou) {
                  ou var16 = (ou)var15;
                  if(var16.e() == var6 && var16.d()) {
                     var16.g();
                     var12 = var16.a();
                     var13 = var16.i();
                     var14 = true;
                  }
               }
            }

            if(!var14 && var12 > 0 && a(var12, var1, var9, var10, var11, false) && (m[var12].f() == 0 || var12 == Z.bO || var12 == V.bO)) {
               var2 += qs.b[var6];
               var3 += qs.c[var6];
               var4 += qs.d[var6];
               var1.b(var2, var3, var4, ac.bO, var13);
               var1.a(var2, var3, var4, pa.a(var12, var13, var6, false, false));
               b = false;
               var1.g(var9, var10, var11, 0);
               b = true;
            } else if(!var14) {
               b = false;
               var1.g(var2 + qs.b[var6], var3 + qs.c[var6], var4 + qs.d[var6], 0);
               b = true;
            }
         } else {
            b = false;
            var1.g(var2 + qs.b[var6], var3 + qs.c[var6], var4 + qs.d[var6], 0);
            b = true;
         }

         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "tile.piston.in", 0.5F, var1.r.nextFloat() * 0.15F + 0.6F);
      }

      b = false;
   }

   public void a(ali var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      if(h(var5)) {
         switch(e(var5)) {
         case 0:
            this.a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 1:
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
            break;
         case 2:
            this.a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
            break;
         case 3:
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
            break;
         case 4:
            this.a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 5:
            this.a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
         }
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void h() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(xd var1, int var2, int var3, int var4, wu var5, ArrayList var6) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      this.a((ali)var1, var2, var3, var4);
      return super.c(var1, var2, var3, var4);
   }

   public boolean b() {
      return false;
   }

   public static int e(int var0) {
      return var0 & 7;
   }

   public static boolean h(int var0) {
      return (var0 & 8) != 0;
   }

   private static int c(xd var0, int var1, int var2, int var3, yw var4) {
      if(gk.e((float)var4.o - (float)var1) < 2.0F && gk.e((float)var4.q - (float)var3) < 2.0F) {
         double var5 = var4.p + 1.82D - (double)var4.H;
         if(var5 - (double)var2 > 2.0D) {
            return 1;
         }

         if((double)var2 - var5 > 0.0D) {
            return 0;
         }
      }

      int var7 = gk.c((double)(var4.u * 4.0F / 360.0F) + 0.5D) & 3;
      return var7 == 0?2:(var7 == 1?5:(var7 == 2?3:(var7 == 3?4:0)));
   }

   private static boolean a(int var0, xd var1, int var2, int var3, int var4, boolean var5) {
      if(var0 == ap.bO) {
         return false;
      } else {
         if(var0 != Z.bO && var0 != V.bO) {
            if(m[var0].n() == -1.0F) {
               return false;
            }

            if(m[var0].f() == 2) {
               return false;
            }

            if(!var5 && m[var0].f() == 1) {
               return false;
            }
         } else if(h(var1.e(var2, var3, var4))) {
            return false;
         }

         return !(m[var0] instanceof agy);
      }
   }

   private static boolean g(xd var0, int var1, int var2, int var3, int var4) {
      int var5 = var1 + qs.b[var4];
      int var6 = var2 + qs.c[var4];
      int var7 = var3 + qs.d[var4];
      int var8 = 0;

      while(true) {
         if(var8 < 13) {
            if(var6 <= 0 || var6 >= 255) {
               return false;
            }

            int var9 = var0.a(var5, var6, var7);
            if(var9 != 0) {
               if(!a(var9, var0, var5, var6, var7, true)) {
                  return false;
               }

               if(m[var9].f() != 1) {
                  if(var8 == 12) {
                     return false;
                  }

                  var5 += qs.b[var4];
                  var6 += qs.c[var4];
                  var7 += qs.d[var4];
                  ++var8;
                  continue;
               }
            }
         }

         return true;
      }
   }

   private boolean h(xd var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 + qs.b[var5];
      int var7 = var3 + qs.c[var5];
      int var8 = var4 + qs.d[var5];
      int var9 = 0;

      while(true) {
         int var10;
         if(var9 < 13) {
            if(var7 <= 0 || var7 >= 255) {
               return false;
            }

            var10 = var1.a(var6, var7, var8);
            if(var10 != 0) {
               if(!a(var10, var1, var6, var7, var8, true)) {
                  return false;
               }

               if(m[var10].f() != 1) {
                  if(var9 == 12) {
                     return false;
                  }

                  var6 += qs.b[var5];
                  var7 += qs.c[var5];
                  var8 += qs.d[var5];
                  ++var9;
                  continue;
               }

               m[var10].a(var1, var6, var7, var8, var1.e(var6, var7, var8), 0);
               var1.g(var6, var7, var8, 0);
            }
         }

         while(var6 != var2 || var7 != var3 || var8 != var4) {
            var9 = var6 - qs.b[var5];
            var10 = var7 - qs.c[var5];
            int var11 = var8 - qs.d[var5];
            int var12 = var1.a(var9, var10, var11);
            int var13 = var1.e(var9, var10, var11);
            if(var12 == this.bO && var9 == var2 && var10 == var3 && var11 == var4) {
               var1.b(var6, var7, var8, ac.bO, var5 | (this.a?8:0));
               var1.a(var6, var7, var8, pa.a(aa.bO, var5 | (this.a?8:0), var5, true, false));
            } else {
               var1.b(var6, var7, var8, ac.bO, var13);
               var1.a(var6, var7, var8, pa.a(var12, var13, var5, true, false));
            }

            var6 = var9;
            var7 = var10;
            var8 = var11;
         }

         return true;
      }
   }
}
