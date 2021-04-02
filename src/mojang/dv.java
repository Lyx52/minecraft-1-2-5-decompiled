package mojang;

public class dv implements ali {

   private int a;
   private int b;
   private ack[][] c;
   private boolean d;
   private xd e;


   public dv(xd var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.e = var1;
      this.a = var2 >> 4;
      this.b = var4 >> 4;
      int var8 = var5 >> 4;
      int var9 = var7 >> 4;
      this.c = new ack[var8 - this.a + 1][var9 - this.b + 1];
      this.d = true;

      for(int var10 = this.a; var10 <= var8; ++var10) {
         for(int var11 = this.b; var11 <= var9; ++var11) {
            ack var12 = var1.d(var10, var11);
            if(var12 != null) {
               this.c[var10 - this.a][var11 - this.b] = var12;
               if(!var12.c(var3, var6)) {
                  this.d = false;
               }
            }
         }
      }

   }

   public boolean a() {
      return this.d;
   }

   public int a(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else if(var2 >= 256) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.a;
         int var5 = (var3 >> 4) - this.b;
         if(var4 >= 0 && var4 < this.c.length && var5 >= 0 && var5 < this.c[var4].length) {
            ack var6 = this.c[var4][var5];
            return var6 == null?0:var6.a(var1 & 15, var2, var3 & 15);
         } else {
            return 0;
         }
      }
   }

   public kw b(int var1, int var2, int var3) {
      int var4 = (var1 >> 4) - this.a;
      int var5 = (var3 >> 4) - this.b;
      return this.c[var4][var5].e(var1 & 15, var2, var3 & 15);
   }

   public float a(int var1, int var2, int var3, int var4) {
      int var5 = this.d(var1, var2, var3);
      if(var5 < var4) {
         var5 = var4;
      }

      return this.e.t.f[var5];
   }

   public int b(int var1, int var2, int var3, int var4) {
      int var5 = this.a(wl.a, var1, var2, var3);
      int var6 = this.a(wl.b, var1, var2, var3);
      if(var6 < var4) {
         var6 = var4;
      }

      return var5 << 20 | var6 << 4;
   }

   public float c(int var1, int var2, int var3) {
      return this.e.t.f[this.d(var1, var2, var3)];
   }

   public int d(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, true);
   }

   public int a(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 <= 30000000) {
         int var5;
         int var6;
         if(var4) {
            var5 = this.a(var1, var2, var3);
            if(var5 == pb.ak.bO || var5 == pb.aA.bO || var5 == pb.at.bO || var5 == pb.aH.bO) {
               var6 = this.a(var1, var2 + 1, var3, false);
               int var7 = this.a(var1 + 1, var2, var3, false);
               int var8 = this.a(var1 - 1, var2, var3, false);
               int var9 = this.a(var1, var2, var3 + 1, false);
               int var10 = this.a(var1, var2, var3 - 1, false);
               if(var7 > var6) {
                  var6 = var7;
               }

               if(var8 > var6) {
                  var6 = var8;
               }

               if(var9 > var6) {
                  var6 = var9;
               }

               if(var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if(var2 < 0) {
            return 0;
         } else if(var2 >= 256) {
            var5 = 15 - this.e.f;
            if(var5 < 0) {
               var5 = 0;
            }

            return var5;
         } else {
            var5 = (var1 >> 4) - this.a;
            var6 = (var3 >> 4) - this.b;
            return this.c[var5][var6].c(var1 & 15, var2, var3 & 15, this.e.f);
         }
      } else {
         return 15;
      }
   }

   public int e(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else if(var2 >= 256) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.a;
         int var5 = (var3 >> 4) - this.b;
         return this.c[var4][var5].c(var1 & 15, var2, var3 & 15);
      }
   }

   public acn f(int var1, int var2, int var3) {
      int var4 = this.a(var1, var2, var3);
      return var4 == 0?acn.a:pb.m[var4].cd;
   }

   public abn a(int var1, int var2) {
      return this.e.a(var1, var2);
   }

   public boolean g(int var1, int var2, int var3) {
      pb var4 = pb.m[this.a(var1, var2, var3)];
      return var4 == null?false:var4.a();
   }

   public boolean h(int var1, int var2, int var3) {
      pb var4 = pb.m[this.a(var1, var2, var3)];
      return var4 == null?false:var4.cd.c() && var4.b();
   }

   public boolean i(int var1, int var2, int var3) {
      pb var4 = pb.m[this.a(var1, var2, var3)];
      return var4 == null;
   }

   public int a(wl var1, int var2, int var3, int var4) {
      if(var3 < 0) {
         var3 = 0;
      }

      if(var3 >= 256) {
         var3 = 255;
      }

      if(var3 >= 0 && var3 < 256 && var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 <= 30000000) {
         int var5;
         int var6;
         if(pb.s[this.a(var2, var3, var4)]) {
            var5 = this.b(var1, var2, var3 + 1, var4);
            var6 = this.b(var1, var2 + 1, var3, var4);
            int var7 = this.b(var1, var2 - 1, var3, var4);
            int var8 = this.b(var1, var2, var3, var4 + 1);
            int var9 = this.b(var1, var2, var3, var4 - 1);
            if(var6 > var5) {
               var5 = var6;
            }

            if(var7 > var5) {
               var5 = var7;
            }

            if(var8 > var5) {
               var5 = var8;
            }

            if(var9 > var5) {
               var5 = var9;
            }

            return var5;
         } else {
            var5 = (var2 >> 4) - this.a;
            var6 = (var4 >> 4) - this.b;
            return this.c[var5][var6].a(var1, var2 & 15, var3, var4 & 15);
         }
      } else {
         return var1.c;
      }
   }

   public int b(wl var1, int var2, int var3, int var4) {
      if(var3 < 0) {
         var3 = 0;
      }

      if(var3 >= 256) {
         var3 = 255;
      }

      if(var3 >= 0 && var3 < 256 && var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 <= 30000000) {
         int var5 = (var2 >> 4) - this.a;
         int var6 = (var4 >> 4) - this.b;
         return this.c[var5][var6].a(var1, var2 & 15, var3, var4 & 15);
      } else {
         return var1.c;
      }
   }

   public int b() {
      return 256;
   }
}
