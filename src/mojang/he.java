package mojang;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class he {

   protected qg g;
   protected int h;
   protected int i;


   protected he(int var1) {
      this.i = var1;
      this.h = -1;
   }

   public void a(he var1, List var2, Random var3) {}

   public abstract boolean a(World var1, Random var2, qg var3);

   public qg b() {
      return this.g;
   }

   public int c() {
      return this.i;
   }

   public static he a(List var0, qg var1) {
      Iterator var2 = var0.iterator();

      he var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (he)var2.next();
      } while(var3.b() == null || !var3.b().a(var1));

      return var3;
   }

   public qo a_() {
      return new qo(this.g.e(), this.g.f(), this.g.g());
   }

   protected boolean a(World var1, qg var2) {
      int var3 = Math.max(this.g.a - 1, var2.a);
      int var4 = Math.max(this.g.b - 1, var2.b);
      int var5 = Math.max(this.g.c - 1, var2.c);
      int var6 = Math.min(this.g.d + 1, var2.d);
      int var7 = Math.min(this.g.e + 1, var2.e);
      int var8 = Math.min(this.g.f + 1, var2.f);

      int var9;
      int var10;
      int var11;
      for(var9 = var3; var9 <= var6; ++var9) {
         for(var10 = var5; var10 <= var8; ++var10) {
            var11 = var1.a(var9, var4, var10);
            if(var11 > 0 && pb.m[var11].cd.d()) {
               return true;
            }

            var11 = var1.a(var9, var7, var10);
            if(var11 > 0 && pb.m[var11].cd.d()) {
               return true;
            }
         }
      }

      for(var9 = var3; var9 <= var6; ++var9) {
         for(var10 = var4; var10 <= var7; ++var10) {
            var11 = var1.a(var9, var10, var5);
            if(var11 > 0 && pb.m[var11].cd.d()) {
               return true;
            }

            var11 = var1.a(var9, var10, var8);
            if(var11 > 0 && pb.m[var11].cd.d()) {
               return true;
            }
         }
      }

      for(var9 = var5; var9 <= var8; ++var9) {
         for(var10 = var4; var10 <= var7; ++var10) {
            var11 = var1.a(var3, var10, var9);
            if(var11 > 0 && pb.m[var11].cd.d()) {
               return true;
            }

            var11 = var1.a(var6, var10, var9);
            if(var11 > 0 && pb.m[var11].cd.d()) {
               return true;
            }
         }
      }

      return false;
   }

   protected int a(int var1, int var2) {
      switch(this.h) {
      case 0:
      case 2:
         return this.g.a + var1;
      case 1:
         return this.g.d - var2;
      case 3:
         return this.g.a + var2;
      default:
         return var1;
      }
   }

   protected int b(int var1) {
      return this.h == -1?var1:var1 + this.g.b;
   }

   protected int b(int var1, int var2) {
      switch(this.h) {
      case 0:
         return this.g.c + var2;
      case 1:
      case 3:
         return this.g.c + var1;
      case 2:
         return this.g.f - var2;
      default:
         return var2;
      }
   }

   protected int c(int var1, int var2) {
      if(var1 == pb.aG.bO) {
         if(this.h == 1 || this.h == 3) {
            if(var2 == 1) {
               return 0;
            }

            return 1;
         }
      } else if(var1 != pb.aE.bO && var1 != pb.aL.bO) {
         if(var1 != pb.aH.bO && var1 != pb.at.bO && var1 != pb.bC.bO && var1 != pb.bx.bO) {
            if(var1 == pb.aF.bO) {
               if(this.h == 0) {
                  if(var2 == 2) {
                     return 3;
                  }

                  if(var2 == 3) {
                     return 2;
                  }
               } else if(this.h == 1) {
                  if(var2 == 2) {
                     return 4;
                  }

                  if(var2 == 3) {
                     return 5;
                  }

                  if(var2 == 4) {
                     return 2;
                  }

                  if(var2 == 5) {
                     return 3;
                  }
               } else if(this.h == 3) {
                  if(var2 == 2) {
                     return 5;
                  }

                  if(var2 == 3) {
                     return 4;
                  }

                  if(var2 == 4) {
                     return 2;
                  }

                  if(var2 == 5) {
                     return 3;
                  }
               }
            } else if(var1 == pb.aR.bO) {
               if(this.h == 0) {
                  if(var2 == 3) {
                     return 4;
                  }

                  if(var2 == 4) {
                     return 3;
                  }
               } else if(this.h == 1) {
                  if(var2 == 3) {
                     return 1;
                  }

                  if(var2 == 4) {
                     return 2;
                  }

                  if(var2 == 2) {
                     return 3;
                  }

                  if(var2 == 1) {
                     return 4;
                  }
               } else if(this.h == 3) {
                  if(var2 == 3) {
                     return 2;
                  }

                  if(var2 == 4) {
                     return 1;
                  }

                  if(var2 == 2) {
                     return 3;
                  }

                  if(var2 == 1) {
                     return 4;
                  }
               }
            }
         } else if(this.h == 0) {
            if(var2 == 2) {
               return 3;
            }

            if(var2 == 3) {
               return 2;
            }
         } else if(this.h == 1) {
            if(var2 == 0) {
               return 2;
            }

            if(var2 == 1) {
               return 3;
            }

            if(var2 == 2) {
               return 0;
            }

            if(var2 == 3) {
               return 1;
            }
         } else if(this.h == 3) {
            if(var2 == 0) {
               return 2;
            }

            if(var2 == 1) {
               return 3;
            }

            if(var2 == 2) {
               return 1;
            }

            if(var2 == 3) {
               return 0;
            }
         }
      } else if(this.h == 0) {
         if(var2 == 0) {
            return 2;
         }

         if(var2 == 2) {
            return 0;
         }
      } else {
         if(this.h == 1) {
            return var2 + 1 & 3;
         }

         if(this.h == 3) {
            return var2 + 3 & 3;
         }
      }

      return var2;
   }

   protected void a(World var1, int var2, int var3, int var4, int var5, int var6, qg var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.b(var5);
      int var10 = this.b(var4, var6);
      if(var7.b(var8, var9, var10)) {
         var1.b(var8, var9, var10, var2, var3);
      }
   }

   protected int a(World var1, int var2, int var3, int var4, qg var5) {
      int var6 = this.a(var2, var4);
      int var7 = this.b(var3);
      int var8 = this.b(var2, var4);
      return !var5.b(var6, var7, var8)?0:var1.a(var6, var7, var8);
   }

   protected void a(World var1, qg var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if(!var11 || this.a(var1, var13, var12, var14, var2) != 0) {
                  if(var12 != var4 && var12 != var7 && var13 != var3 && var13 != var6 && var14 != var5 && var14 != var8) {
                     this.a(var1, var10, 0, var13, var12, var14, var2);
                  } else {
                     this.a(var1, var9, 0, var13, var12, var14, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(World var1, qg var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, up var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if(!var9 || this.a(var1, var13, var12, var14, var2) != 0) {
                  var11.a(var10, var13, var12, var14, var12 == var4 || var12 == var7 || var13 == var3 || var13 == var6 || var14 == var5 || var14 == var8);
                  this.a(var1, var11.a(), var11.b(), var13, var12, var14, var2);
               }
            }
         }
      }

   }

   protected void a(World var1, qg var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      for(int var14 = var6; var14 <= var9; ++var14) {
         for(int var15 = var5; var15 <= var8; ++var15) {
            for(int var16 = var7; var16 <= var10; ++var16) {
               if(var3.nextFloat() <= var4 && (!var13 || this.a(var1, var15, var14, var16, var2) != 0)) {
                  if(var14 != var6 && var14 != var9 && var15 != var5 && var15 != var8 && var16 != var7 && var16 != var10) {
                     this.a(var1, var12, 0, var15, var14, var16, var2);
                  } else {
                     this.a(var1, var11, 0, var15, var14, var16, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(World var1, qg var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9) {
      if(var3.nextFloat() < var4) {
         this.a(var1, var8, var9, var5, var6, var7, var2);
      }

   }

   protected void a(World var1, qg var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      float var11 = (float)(var6 - var3 + 1);
      float var12 = (float)(var7 - var4 + 1);
      float var13 = (float)(var8 - var5 + 1);
      float var14 = (float)var3 + var11 / 2.0F;
      float var15 = (float)var5 + var13 / 2.0F;

      for(int var16 = var4; var16 <= var7; ++var16) {
         float var17 = (float)(var16 - var4) / var12;

         for(int var18 = var3; var18 <= var6; ++var18) {
            float var19 = ((float)var18 - var14) / (var11 * 0.5F);

            for(int var20 = var5; var20 <= var8; ++var20) {
               float var21 = ((float)var20 - var15) / (var13 * 0.5F);
               if(!var10 || this.a(var1, var18, var16, var20, var2) != 0) {
                  float var22 = var19 * var19 + var17 * var17 + var21 * var21;
                  if(var22 <= 1.05F) {
                     this.a(var1, var9, 0, var18, var16, var20, var2);
                  }
               }
            }
         }
      }

   }

   protected void b(World var1, int var2, int var3, int var4, qg var5) {
      int var6 = this.a(var2, var4);
      int var7 = this.b(var3);
      int var8 = this.b(var2, var4);
      if(var5.b(var6, var7, var8)) {
         while(!var1.i(var6, var7, var8) && var7 < 255) {
            var1.b(var6, var7, var8, 0, 0);
            ++var7;
         }

      }
   }

   protected void b(World var1, int var2, int var3, int var4, int var5, int var6, qg var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.b(var5);
      int var10 = this.b(var4, var6);
      if(var7.b(var8, var9, var10)) {
         while((var1.i(var8, var9, var10) || var1.f(var8, var9, var10).d()) && var9 > 1) {
            var1.b(var8, var9, var10, var2, var3);
            --var9;
         }

      }
   }

   protected void a(World var1, qg var2, Random var3, int var4, int var5, int var6, fx[] var7, int var8) {
      int var9 = this.a(var4, var6);
      int var10 = this.b(var5);
      int var11 = this.b(var4, var6);
      if(var2.b(var9, var10, var11) && var1.a(var9, var10, var11) != pb.au.bO) {
         var1.g(var9, var10, var11, pb.au.bO);
         hb var12 = (hb)var1.b(var9, var10, var11);
         if(var12 != null) {
            a(var3, var7, var12, var8);
         }
      }

   }

   private static void a(Random var0, fx[] var1, hb var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         fx var5 = (fx)pk.a(var0, (cc[])var1);
         int var6 = var5.c + var0.nextInt(var5.e - var5.c + 1);
         if(yr.e[var5.a].f() >= var6) {
            var2.a(var0.nextInt(var2.a()), new aan(var5.a, var6, var5.b));
         } else {
            for(int var7 = 0; var7 < var6; ++var7) {
               var2.a(var0.nextInt(var2.a()), new aan(var5.a, 1, var5.b));
            }
         }
      }

   }

   protected void a(World var1, qg var2, Random var3, int var4, int var5, int var6, int var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.b(var5);
      int var10 = this.b(var4, var6);
      if(var2.b(var8, var9, var10)) {
         zs.a(var1, var8, var9, var10, var7, pb.aE);
      }

   }
}
