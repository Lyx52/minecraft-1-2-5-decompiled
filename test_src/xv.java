
public class xv {

   private ali a;
   private acc b = new acc();
   private abh c = new abh();
   private e[] d = new e[32];
   private boolean e;
   private boolean f;
   private boolean g;
   private boolean h;


   public xv(ali var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.a = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
      this.h = var5;
   }

   public vu a(nn var1, nn var2, float var3) {
      return this.a(var1, var2.o, var2.y.b, var2.q, var3);
   }

   public vu a(nn var1, int var2, int var3, int var4, float var5) {
      return this.a(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var5);
   }

   private vu a(nn var1, double var2, double var4, double var6, float var8) {
      this.b.a();
      this.c.a();
      boolean var9 = this.g;
      int var10 = gk.c(var1.y.b + 0.5D);
      if(this.h && var1.H()) {
         var10 = (int)var1.y.b;

         for(int var11 = this.a.a(gk.c(var1.o), var10, gk.c(var1.q)); var11 == pb.A.bO || var11 == pb.B.bO; var11 = this.a.a(gk.c(var1.o), var10, gk.c(var1.q))) {
            ++var10;
         }

         var9 = this.g;
         this.g = false;
      } else {
         var10 = gk.c(var1.y.b + 0.5D);
      }

      e var15 = this.a(gk.c(var1.y.a), var10, gk.c(var1.y.c));
      e var12 = this.a(gk.c(var2 - (double)(var1.I / 2.0F)), gk.c(var4), gk.c(var6 - (double)(var1.I / 2.0F)));
      e var13 = new e(gk.d(var1.I + 1.0F), gk.d(var1.J + 1.0F), gk.d(var1.I + 1.0F));
      vu var14 = this.a(var1, var15, var12, var13, var8);
      this.g = var9;
      return var14;
   }

   private vu a(nn var1, e var2, e var3, e var4, float var5) {
      var2.e = 0.0F;
      var2.f = var2.a(var3);
      var2.g = var2.f;
      this.b.a();
      this.b.a(var2);
      e var6 = var2;

      while(!this.b.c()) {
         e var7 = this.b.b();
         if(var7.equals(var3)) {
            return this.a(var2, var3);
         }

         if(var7.a(var3) < var6.a(var3)) {
            var6 = var7;
         }

         var7.i = true;
         int var8 = this.b(var1, var7, var4, var3, var5);

         for(int var9 = 0; var9 < var8; ++var9) {
            e var10 = this.d[var9];
            float var11 = var7.e + var7.a(var10);
            if(!var10.a() || var11 < var10.e) {
               var10.h = var7;
               var10.e = var11;
               var10.f = var10.a(var3);
               if(var10.a()) {
                  this.b.a(var10, var10.e + var10.f);
               } else {
                  var10.g = var10.e + var10.f;
                  this.b.a(var10);
               }
            }
         }
      }

      if(var6 == var2) {
         return null;
      } else {
         return this.a(var2, var6);
      }
   }

   private int b(nn var1, e var2, e var3, e var4, float var5) {
      int var6 = 0;
      byte var7 = 0;
      if(this.a(var1, var2.a, var2.b + 1, var2.c, var3) == 1) {
         var7 = 1;
      }

      e var8 = this.a(var1, var2.a, var2.b, var2.c + 1, var3, var7);
      e var9 = this.a(var1, var2.a - 1, var2.b, var2.c, var3, var7);
      e var10 = this.a(var1, var2.a + 1, var2.b, var2.c, var3, var7);
      e var11 = this.a(var1, var2.a, var2.b, var2.c - 1, var3, var7);
      if(var8 != null && !var8.i && var8.a(var4) < var5) {
         this.d[var6++] = var8;
      }

      if(var9 != null && !var9.i && var9.a(var4) < var5) {
         this.d[var6++] = var9;
      }

      if(var10 != null && !var10.i && var10.a(var4) < var5) {
         this.d[var6++] = var10;
      }

      if(var11 != null && !var11.i && var11.a(var4) < var5) {
         this.d[var6++] = var11;
      }

      return var6;
   }

   private e a(nn var1, int var2, int var3, int var4, e var5, int var6) {
      e var7 = null;
      int var8 = this.a(var1, var2, var3, var4, var5);
      if(var8 == 2) {
         return this.a(var2, var3, var4);
      } else {
         if(var8 == 1) {
            var7 = this.a(var2, var3, var4);
         }

         if(var7 == null && var6 > 0 && var8 != -3 && var8 != -4 && this.a(var1, var2, var3 + var6, var4, var5) == 1) {
            var7 = this.a(var2, var3 + var6, var4);
            var3 += var6;
         }

         if(var7 != null) {
            int var9 = 0;
            int var10 = 0;

            while(var3 > 0) {
               var10 = this.a(var1, var2, var3 - 1, var4, var5);
               if(this.g && var10 == -1) {
                  return null;
               }

               if(var10 != 1) {
                  break;
               }

               ++var9;
               if(var9 >= 4) {
                  return null;
               }

               --var3;
               if(var3 > 0) {
                  var7 = this.a(var2, var3, var4);
               }
            }

            if(var10 == -2) {
               return null;
            }
         }

         return var7;
      }
   }

   private final e a(int var1, int var2, int var3) {
      int var4 = e.a(var1, var2, var3);
      e var5 = (e)this.c.a(var4);
      if(var5 == null) {
         var5 = new e(var1, var2, var3);
         this.c.a(var4, var5);
      }

      return var5;
   }

   private int a(nn var1, int var2, int var3, int var4, e var5) {
      boolean var6 = false;

      for(int var7 = var2; var7 < var2 + var5.a; ++var7) {
         for(int var8 = var3; var8 < var3 + var5.b; ++var8) {
            for(int var9 = var4; var9 < var4 + var5.c; ++var9) {
               int var10 = this.a.a(var7, var8, var9);
               if(var10 > 0) {
                  if(var10 == pb.bk.bO) {
                     var6 = true;
                  } else if(var10 != pb.A.bO && var10 != pb.B.bO) {
                     if(!this.e && var10 == pb.aE.bO) {
                        return 0;
                     }
                  } else {
                     if(this.g) {
                        return -1;
                     }

                     var6 = true;
                  }

                  pb var11 = pb.m[var10];
                  if(!var11.b(this.a, var7, var8, var9) && (!this.f || var10 != pb.aE.bO)) {
                     if(var10 == pb.aZ.bO || var10 == pb.bv.bO) {
                        return -3;
                     }

                     if(var10 == pb.bk.bO) {
                        return -4;
                     }

                     acn var12 = var11.cd;
                     if(var12 != acn.h) {
                        return 0;
                     }

                     if(!var1.J()) {
                        return -2;
                     }
                  }
               }
            }
         }
      }

      return var6?2:1;
   }

   private vu a(e var1, e var2) {
      int var3 = 1;

      e var4;
      for(var4 = var2; var4.h != null; var4 = var4.h) {
         ++var3;
      }

      e[] var5 = new e[var3];
      var4 = var2;
      --var3;

      for(var5[var3] = var2; var4.h != null; var5[var3] = var4) {
         var4 = var4.h;
         --var3;
      }

      return new vu(var5);
   }
}
