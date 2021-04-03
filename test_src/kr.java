import java.util.Random;

public class kr extends agv {

   int a = 0;
   boolean[] b = new boolean[4];
   int[] c = new int[4];


   protected kr(int var1, acn var2) {
      super(var1, var2);
   }

   private void j(xd var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      var1.b(var2, var3, var4, this.bO + 1, var5);
      var1.c(var2, var3, var4, var2, var3, var4);
      var1.k(var2, var3, var4);
   }

   public boolean b(ali var1, int var2, int var3, int var4) {
      return this.cd != acn.h;
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      int var6 = this.h(var1, var2, var3, var4);
      byte var7 = 1;
      if(this.cd == acn.h && !var1.t.d) {
         var7 = 2;
      }

      boolean var8 = true;
      int var10;
      if(var6 > 0) {
         byte var9 = -100;
         this.a = 0;
         int var12 = this.f(var1, var2 - 1, var3, var4, var9);
         var12 = this.f(var1, var2 + 1, var3, var4, var12);
         var12 = this.f(var1, var2, var3, var4 - 1, var12);
         var12 = this.f(var1, var2, var3, var4 + 1, var12);
         var10 = var12 + var7;
         if(var10 >= 8 || var12 < 0) {
            var10 = -1;
         }

         if(this.h(var1, var2, var3 + 1, var4) >= 0) {
            int var11 = this.h(var1, var2, var3 + 1, var4);
            if(var11 >= 8) {
               var10 = var11;
            } else {
               var10 = var11 + 8;
            }
         }

         if(this.a >= 2 && this.cd == acn.g) {
            if(var1.f(var2, var3 - 1, var4).a()) {
               var10 = 0;
            } else if(var1.f(var2, var3 - 1, var4) == this.cd && var1.e(var2, var3, var4) == 0) {
               var10 = 0;
            }
         }

         if(this.cd == acn.h && var6 < 8 && var10 < 8 && var10 > var6 && var5.nextInt(4) != 0) {
            var10 = var6;
            var8 = false;
         }

         if(var10 != var6) {
            var6 = var10;
            if(var10 < 0) {
               var1.g(var2, var3, var4, 0);
            } else {
               var1.f(var2, var3, var4, var10);
               var1.a(var2, var3, var4, this.bO, this.e());
               var1.j(var2, var3, var4, this.bO);
            }
         } else if(var8) {
            this.j(var1, var2, var3, var4);
         }
      } else {
         this.j(var1, var2, var3, var4);
      }

      if(this.m(var1, var2, var3 - 1, var4)) {
         if(this.cd == acn.h && var1.f(var2, var3 - 1, var4) == acn.g) {
            var1.g(var2, var3 - 1, var4, pb.t.bO);
            this.i(var1, var2, var3 - 1, var4);
            return;
         }

         if(var6 >= 8) {
            var1.d(var2, var3 - 1, var4, this.bO, var6);
         } else {
            var1.d(var2, var3 - 1, var4, this.bO, var6 + 8);
         }
      } else if(var6 >= 0 && (var6 == 0 || this.l(var1, var2, var3 - 1, var4))) {
         boolean[] var13 = this.k(var1, var2, var3, var4);
         var10 = var6 + var7;
         if(var6 >= 8) {
            var10 = 1;
         }

         if(var10 >= 8) {
            return;
         }

         if(var13[0]) {
            this.g(var1, var2 - 1, var3, var4, var10);
         }

         if(var13[1]) {
            this.g(var1, var2 + 1, var3, var4, var10);
         }

         if(var13[2]) {
            this.g(var1, var2, var3, var4 - 1, var10);
         }

         if(var13[3]) {
            this.g(var1, var2, var3, var4 + 1, var10);
         }
      }

   }

   private void g(xd var1, int var2, int var3, int var4, int var5) {
      if(this.m(var1, var2, var3, var4)) {
         int var6 = var1.a(var2, var3, var4);
         if(var6 > 0) {
            if(this.cd == acn.h) {
               this.i(var1, var2, var3, var4);
            } else {
               pb.m[var6].a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
            }
         }

         var1.d(var2, var3, var4, this.bO, var5);
      }

   }

   private int c(xd var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 1000;

      for(int var8 = 0; var8 < 4; ++var8) {
         if((var8 != 0 || var6 != 1) && (var8 != 1 || var6 != 0) && (var8 != 2 || var6 != 3) && (var8 != 3 || var6 != 2)) {
            int var9 = var2;
            int var11 = var4;
            if(var8 == 0) {
               var9 = var2 - 1;
            }

            if(var8 == 1) {
               ++var9;
            }

            if(var8 == 2) {
               var11 = var4 - 1;
            }

            if(var8 == 3) {
               ++var11;
            }

            if(!this.l(var1, var9, var3, var11) && (var1.f(var9, var3, var11) != this.cd || var1.e(var9, var3, var11) != 0)) {
               if(!this.l(var1, var9, var3 - 1, var11)) {
                  return var5;
               }

               if(var5 < 4) {
                  int var12 = this.c(var1, var9, var3, var11, var5 + 1, var8);
                  if(var12 < var7) {
                     var7 = var12;
                  }
               }
            }
         }
      }

      return var7;
   }

   private boolean[] k(xd var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 4; ++var5) {
         this.c[var5] = 1000;
         var6 = var2;
         int var8 = var4;
         if(var5 == 0) {
            var6 = var2 - 1;
         }

         if(var5 == 1) {
            ++var6;
         }

         if(var5 == 2) {
            var8 = var4 - 1;
         }

         if(var5 == 3) {
            ++var8;
         }

         if(!this.l(var1, var6, var3, var8) && (var1.f(var6, var3, var8) != this.cd || var1.e(var6, var3, var8) != 0)) {
            if(!this.l(var1, var6, var3 - 1, var8)) {
               this.c[var5] = 0;
            } else {
               this.c[var5] = this.c(var1, var6, var3, var8, 1, var5);
            }
         }
      }

      var5 = this.c[0];

      for(var6 = 1; var6 < 4; ++var6) {
         if(this.c[var6] < var5) {
            var5 = this.c[var6];
         }
      }

      for(var6 = 0; var6 < 4; ++var6) {
         this.b[var6] = this.c[var6] == var5;
      }

      return this.b;
   }

   private boolean l(xd var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      if(var5 != pb.aE.bO && var5 != pb.aL.bO && var5 != pb.aD.bO && var5 != pb.aF.bO && var5 != pb.aX.bO) {
         if(var5 == 0) {
            return false;
         } else {
            acn var6 = pb.m[var5].cd;
            return var6 == acn.B?true:var6.c();
         }
      } else {
         return true;
      }
   }

   protected int f(xd var1, int var2, int var3, int var4, int var5) {
      int var6 = this.h(var1, var2, var3, var4);
      if(var6 < 0) {
         return var5;
      } else {
         if(var6 == 0) {
            ++this.a;
         }

         if(var6 >= 8) {
            var6 = 0;
         }

         return var5 >= 0 && var6 >= var5?var5:var6;
      }
   }

   private boolean m(xd var1, int var2, int var3, int var4) {
      acn var5 = var1.f(var2, var3, var4);
      return var5 == this.cd?false:(var5 == acn.h?false:!this.l(var1, var2, var3, var4));
   }

   public void a(xd var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if(var1.a(var2, var3, var4) == this.bO) {
         var1.a(var2, var3, var4, this.bO, this.e());
      }

   }
}
