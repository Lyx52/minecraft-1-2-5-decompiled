import java.util.Random;

public class aez extends pb {

   private final boolean a;


   public static final boolean h(xd var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      return var4 == pb.aG.bO || var4 == pb.T.bO || var4 == pb.U.bO;
   }

   public static final boolean e(int var0) {
      return var0 == pb.aG.bO || var0 == pb.T.bO || var0 == pb.U.bO;
   }

   protected aez(int var1, int var2, boolean var3) {
      super(var1, var2, acn.p);
      this.a = var3;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public boolean v() {
      return this.a;
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public pl a(xd var1, int var2, int var3, int var4, bo var5, bo var6) {
      this.a((ali)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void a(ali var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      if(var5 >= 2 && var5 <= 5) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }

   }

   public int a(int var1, int var2) {
      if(this.a) {
         if(this.bO == pb.T.bO && (var2 & 8) == 0) {
            return this.bN - 16;
         }
      } else if(var2 >= 6) {
         return this.bN - 16;
      }

      return this.bN;
   }

   public boolean b() {
      return false;
   }

   public int d() {
      return 9;
   }

   public int a(Random var1) {
      return 1;
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return var1.h(var2, var3 - 1, var4);
   }

   public void a(xd var1, int var2, int var3, int var4) {
      if(!var1.F) {
         this.a(var1, var2, var3, var4, true);
         if(this.bO == pb.T.bO) {
            this.a(var1, var2, var3, var4, this.bO);
         }
      }

   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      if(!var1.F) {
         int var6 = var1.e(var2, var3, var4);
         int var7 = var6;
         if(this.a) {
            var7 = var6 & 7;
         }

         boolean var8 = false;
         if(!var1.h(var2, var3 - 1, var4)) {
            var8 = true;
         }

         if(var7 == 2 && !var1.h(var2 + 1, var3, var4)) {
            var8 = true;
         }

         if(var7 == 3 && !var1.h(var2 - 1, var3, var4)) {
            var8 = true;
         }

         if(var7 == 4 && !var1.h(var2, var3, var4 - 1)) {
            var8 = true;
         }

         if(var7 == 5 && !var1.h(var2, var3, var4 + 1)) {
            var8 = true;
         }

         if(var8) {
            this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
            var1.g(var2, var3, var4, 0);
         } else if(this.bO == pb.T.bO) {
            boolean var9 = var1.x(var2, var3, var4);
            var9 = var9 || this.a(var1, var2, var3, var4, var6, true, 0) || this.a(var1, var2, var3, var4, var6, false, 0);
            boolean var10 = false;
            if(var9 && (var6 & 8) == 0) {
               var1.f(var2, var3, var4, var7 | 8);
               var10 = true;
            } else if(!var9 && (var6 & 8) != 0) {
               var1.f(var2, var3, var4, var7);
               var10 = true;
            }

            if(var10) {
               var1.j(var2, var3 - 1, var4, this.bO);
               if(var7 == 2 || var7 == 3 || var7 == 4 || var7 == 5) {
                  var1.j(var2, var3 + 1, var4, this.bO);
               }
            }
         } else if(var5 > 0 && pb.m[var5].g() && !this.a && pv.a(new pv(this, var1, var2, var3, var4)) == 3) {
            this.a(var1, var2, var3, var4, false);
         }

      }
   }

   private void a(xd var1, int var2, int var3, int var4, boolean var5) {
      if(!var1.F) {
         (new pv(this, var1, var2, var3, var4)).a(var1.x(var2, var3, var4), var5);
      }
   }

   private boolean a(xd var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      if(var7 >= 8) {
         return false;
      } else {
         int var8 = var5 & 7;
         boolean var9 = true;
         switch(var8) {
         case 0:
            if(var6) {
               ++var4;
            } else {
               --var4;
            }
            break;
         case 1:
            if(var6) {
               --var2;
            } else {
               ++var2;
            }
            break;
         case 2:
            if(var6) {
               --var2;
            } else {
               ++var2;
               ++var3;
               var9 = false;
            }

            var8 = 1;
            break;
         case 3:
            if(var6) {
               --var2;
               ++var3;
               var9 = false;
            } else {
               ++var2;
            }

            var8 = 1;
            break;
         case 4:
            if(var6) {
               ++var4;
            } else {
               --var4;
               ++var3;
               var9 = false;
            }

            var8 = 0;
            break;
         case 5:
            if(var6) {
               ++var4;
               ++var3;
               var9 = false;
            } else {
               --var4;
            }

            var8 = 0;
         }

         return this.a(var1, var2, var3, var4, var6, var7, var8)?true:var9 && this.a(var1, var2, var3 - 1, var4, var6, var7, var8);
      }
   }

   private boolean a(xd var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      int var8 = var1.a(var2, var3, var4);
      if(var8 == pb.T.bO) {
         int var9 = var1.e(var2, var3, var4);
         int var10 = var9 & 7;
         if(var7 == 1 && (var10 == 0 || var10 == 4 || var10 == 5)) {
            return false;
         }

         if(var7 == 0 && (var10 == 1 || var10 == 2 || var10 == 3)) {
            return false;
         }

         if((var9 & 8) != 0) {
            if(var1.x(var2, var3, var4)) {
               return true;
            }

            return this.a(var1, var2, var3, var4, var9, var5, var6 + 1);
         }
      }

      return false;
   }

   public int f() {
      return 0;
   }

   // $FF: synthetic method
   static boolean a(aez var0) {
      return var0.a;
   }
}
