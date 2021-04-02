package mojang;

import java.util.Random;

public class uf extends kg {

   private int c;
   int[] b;


   protected uf(int var1, int var2) {
      super(var1, var2, acn.i, false);
      this.c = var2;
      this.a(true);
   }

   public int i() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return gu.a(var1, var3);
   }

   public int d(int var1) {
      return (var1 & 3) == 1?gu.a():((var1 & 3) == 2?gu.b():gu.c());
   }

   public int c(ali var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      if((var5 & 3) == 1) {
         return gu.a();
      } else if((var5 & 3) == 2) {
         return gu.b();
      } else {
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;

         for(int var9 = -1; var9 <= 1; ++var9) {
            for(int var10 = -1; var10 <= 1; ++var10) {
               int var11 = var1.a(var2 + var10, var4 + var9).l();
               var6 += (var11 & 16711680) >> 16;
               var7 += (var11 & '\uff00') >> 8;
               var8 += var11 & 255;
            }
         }

         return (var6 / 9 & 255) << 16 | (var7 / 9 & 255) << 8 | var8 / 9 & 255;
      }
   }

   public void b_(xd var1, int var2, int var3, int var4) {
      byte var5 = 1;
      int var6 = var5 + 1;
      if(var1.b(var2 - var6, var3 - var6, var4 - var6, var2 + var6, var3 + var6, var4 + var6)) {
         for(int var7 = -var5; var7 <= var5; ++var7) {
            for(int var8 = -var5; var8 <= var5; ++var8) {
               for(int var9 = -var5; var9 <= var5; ++var9) {
                  int var10 = var1.a(var2 + var7, var3 + var8, var4 + var9);
                  if(var10 == K.bO) {
                     int var11 = var1.e(var2 + var7, var3 + var8, var4 + var9);
                     var1.c(var2 + var7, var3 + var8, var4 + var9, var11 | 8);
                  }
               }
            }
         }
      }

   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(!var1.F) {
         int var6 = var1.e(var2, var3, var4);
         if((var6 & 8) != 0 && (var6 & 4) == 0) {
            byte var7 = 4;
            int var8 = var7 + 1;
            byte var9 = 32;
            int var10 = var9 * var9;
            int var11 = var9 / 2;
            if(this.b == null) {
               this.b = new int[var9 * var9 * var9];
            }

            int var12;
            if(var1.b(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
               int var13;
               int var14;
               int var15;
               for(var12 = -var7; var12 <= var7; ++var12) {
                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        var15 = var1.a(var2 + var12, var3 + var13, var4 + var14);
                        if(var15 == J.bO) {
                           this.b[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = 0;
                        } else if(var15 == K.bO) {
                           this.b[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -2;
                        } else {
                           this.b[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -1;
                        }
                     }
                  }
               }

               for(var12 = 1; var12 <= 4; ++var12) {
                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        for(var15 = -var7; var15 <= var7; ++var15) {
                           if(this.b[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11] == var12 - 1) {
                              if(this.b[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2) {
                                 this.b[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
                              }

                              if(this.b[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2) {
                                 this.b[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
                              }

                              if(this.b[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] == -2) {
                                 this.b[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] = var12;
                              }

                              if(this.b[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] == -2) {
                                 this.b[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] = var12;
                              }

                              if(this.b[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] == -2) {
                                 this.b[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] = var12;
                              }

                              if(this.b[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] == -2) {
                                 this.b[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] = var12;
                              }
                           }
                        }
                     }
                  }
               }
            }

            var12 = this.b[var11 * var10 + var11 * var9 + var11];
            if(var12 >= 0) {
               var1.c(var2, var3, var4, var6 & -9);
            } else {
               this.h(var1, var2, var3, var4);
            }
         }

      }
   }

   private void h(xd var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
      var1.g(var2, var3, var4, 0);
   }

   public int a(Random var1) {
      return var1.nextInt(20) == 0?1:0;
   }

   public int a(int var1, Random var2, int var3) {
      return y.bO;
   }

   public void a(xd var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.F) {
         byte var8 = 20;
         if((var5 & 3) == 3) {
            var8 = 40;
         }

         if(var1.r.nextInt(var8) == 0) {
            int var9 = this.a(var5, var1.r, var7);
            this.a(var1, var2, var3, var4, new aan(var9, 1, this.c(var5)));
         }

         if((var5 & 3) == 0 && var1.r.nextInt(200) == 0) {
            this.a(var1, var2, var3, var4, new aan(yr.j, 1, 0));
         }
      }

   }

   public void a(xd var1, yw var2, int var3, int var4, int var5, int var6) {
      if(!var1.F && var2.av() != null && var2.av().c == yr.be.bQ) {
         var2.a(gv.C[this.bO], 1);
         this.a(var1, var3, var4, var5, new aan(K.bO, 1, var6 & 3));
      } else {
         super.a(var1, var2, var3, var4, var5, var6);
      }

   }

   protected int c(int var1) {
      return var1 & 3;
   }

   public boolean a() {
      return !this.a;
   }

   public int a(int var1, int var2) {
      return (var2 & 3) == 1?this.bN + 80:((var2 & 3) == 3?this.bN + 144:this.bN);
   }

   public void b(boolean var1) {
      this.a = var1;
      this.bN = this.c + (var1?0:1);
   }

   public void b(xd var1, int var2, int var3, int var4, nn var5) {
      super.b(var1, var2, var3, var4, var5);
   }
}
