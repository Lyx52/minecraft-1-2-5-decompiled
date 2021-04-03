package mojang;

import java.util.List;
import java.util.Random;

public class agb implements ca {

   private Random i;
   private op j;
   private op k;
   private op l;
   private op m;
   private op n;
   public op a;
   public op b;
   private World o;
   private double[] p;
   public abv c = new abv();
   private double[] q = new double[256];
   private double[] r = new double[256];
   private double[] s = new double[256];
   private xu t = new afh();
   double[] d;
   double[] e;
   double[] f;
   double[] g;
   double[] h;


   public agb(World var1, long var2) {
      this.o = var1;
      this.i = new Random(var2);
      this.j = new op(this.i, 16);
      this.k = new op(this.i, 16);
      this.l = new op(this.i, 8);
      this.m = new op(this.i, 4);
      this.n = new op(this.i, 4);
      this.a = new op(this.i, 10);
      this.b = new op(this.i, 16);
   }

   public void a(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 32;
      int var6 = var4 + 1;
      byte var7 = 17;
      int var8 = var4 + 1;
      this.p = this.a(this.p, var1 * var4, 0, var2 * var4, var6, var7, var8);

      for(int var9 = 0; var9 < var4; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            for(int var11 = 0; var11 < 16; ++var11) {
               double var12 = 0.125D;
               double var14 = this.p[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.p[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.p[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.p[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.p[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.p[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.p[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.p[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 8; ++var30) {
                  double var31 = 0.25D;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 4; ++var41) {
                     int var42 = var41 + var9 * 4 << 11 | 0 + var10 * 4 << 7 | var11 * 8 + var30;
                     short var43 = 128;
                     double var44 = 0.25D;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for(int var50 = 0; var50 < 4; ++var50) {
                        int var51 = 0;
                        if(var11 * 8 + var30 < var5) {
                           var51 = pb.D.bO;
                        }

                        if(var46 > 0.0D) {
                           var51 = pb.bb.bO;
                        }

                        var3[var42] = (byte)var51;
                        var42 += var43;
                        var46 += var48;
                     }

                     var33 += var37;
                     var35 += var39;
                  }

                  var14 += var22;
                  var16 += var24;
                  var18 += var26;
                  var20 += var28;
               }
            }
         }
      }

   }

   public void b(int var1, int var2, byte[] var3) {
      byte var4 = 64;
      double var5 = 0.03125D;
      this.q = this.m.a(this.q, var1 * 16, var2 * 16, 0, 16, 16, 1, var5, var5, 1.0D);
      this.r = this.m.a(this.r, var1 * 16, 109, var2 * 16, 16, 1, 16, var5, 1.0D, var5);
      this.s = this.n.a(this.s, var1 * 16, var2 * 16, 0, 16, 16, 1, var5 * 2.0D, var5 * 2.0D, var5 * 2.0D);

      for(int var7 = 0; var7 < 16; ++var7) {
         for(int var8 = 0; var8 < 16; ++var8) {
            boolean var9 = this.q[var7 + var8 * 16] + this.i.nextDouble() * 0.2D > 0.0D;
            boolean var10 = this.r[var7 + var8 * 16] + this.i.nextDouble() * 0.2D > 0.0D;
            int var11 = (int)(this.s[var7 + var8 * 16] / 3.0D + 3.0D + this.i.nextDouble() * 0.25D);
            int var12 = -1;
            byte var13 = (byte)pb.bb.bO;
            byte var14 = (byte)pb.bb.bO;

            for(int var15 = 127; var15 >= 0; --var15) {
               int var16 = (var8 * 16 + var7) * 128 + var15;
               if(var15 >= 127 - this.i.nextInt(5)) {
                  var3[var16] = (byte)pb.z.bO;
               } else if(var15 <= 0 + this.i.nextInt(5)) {
                  var3[var16] = (byte)pb.z.bO;
               } else {
                  byte var17 = var3[var16];
                  if(var17 == 0) {
                     var12 = -1;
                  } else if(var17 == pb.bb.bO) {
                     if(var12 == -1) {
                        if(var11 <= 0) {
                           var13 = 0;
                           var14 = (byte)pb.bb.bO;
                        } else if(var15 >= var4 - 4 && var15 <= var4 + 1) {
                           var13 = (byte)pb.bb.bO;
                           var14 = (byte)pb.bb.bO;
                           if(var10) {
                              var13 = (byte)pb.F.bO;
                           }

                           if(var10) {
                              var14 = (byte)pb.bb.bO;
                           }

                           if(var9) {
                              var13 = (byte)pb.bc.bO;
                           }

                           if(var9) {
                              var14 = (byte)pb.bc.bO;
                           }
                        }

                        if(var15 < var4 && var13 == 0) {
                           var13 = (byte)pb.D.bO;
                        }

                        var12 = var11;
                        if(var15 >= var4 - 1) {
                           var3[var16] = var13;
                        } else {
                           var3[var16] = var14;
                        }
                     } else if(var12 > 0) {
                        --var12;
                        var3[var16] = var14;
                     }
                  }
               }
            }
         }
      }

   }

   public ack c(int var1, int var2) {
      return this.b(var1, var2);
   }

   public ack b(int var1, int var2) {
      this.i.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte['\u8000'];
      this.a(var1, var2, var3);
      this.b(var1, var2, var3);
      this.t.a(this, this.o, var1, var2, var3);
      this.c.a(this, this.o, var1, var2, var3);
      ack var4 = new ack(this.o, var3, var1, var2);
      abn[] var5 = this.o.i().b((abn[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var6 = var4.m();

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = (byte)var5[var7].M;
      }

      var4.n();
      return var4;
   }

   private double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412D;
      double var10 = 2053.236D;
      this.g = this.a.a(this.g, var2, var3, var4, var5, 1, var7, 1.0D, 0.0D, 1.0D);
      this.h = this.b.a(this.h, var2, var3, var4, var5, 1, var7, 100.0D, 0.0D, 100.0D);
      this.d = this.l.a(this.d, var2, var3, var4, var5, var6, var7, var8 / 80.0D, var10 / 60.0D, var8 / 80.0D);
      this.e = this.j.a(this.e, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.f = this.k.a(this.f, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;
      double[] var14 = new double[var6];

      int var15;
      for(var15 = 0; var15 < var6; ++var15) {
         var14[var15] = Math.cos((double)var15 * 3.141592653589793D * 6.0D / (double)var6) * 2.0D;
         double var16 = (double)var15;
         if(var15 > var6 / 2) {
            var16 = (double)(var6 - 1 - var15);
         }

         if(var16 < 4.0D) {
            var16 = 4.0D - var16;
            var14[var15] -= var16 * var16 * var16 * 10.0D;
         }
      }

      for(var15 = 0; var15 < var5; ++var15) {
         for(int var36 = 0; var36 < var7; ++var36) {
            double var17 = (this.g[var13] + 256.0D) / 512.0D;
            if(var17 > 1.0D) {
               var17 = 1.0D;
            }

            double var19 = 0.0D;
            double var21 = this.h[var13] / 8000.0D;
            if(var21 < 0.0D) {
               var21 = -var21;
            }

            var21 = var21 * 3.0D - 3.0D;
            if(var21 < 0.0D) {
               var21 /= 2.0D;
               if(var21 < -1.0D) {
                  var21 = -1.0D;
               }

               var21 /= 1.4D;
               var21 /= 2.0D;
               var17 = 0.0D;
            } else {
               if(var21 > 1.0D) {
                  var21 = 1.0D;
               }

               var21 /= 6.0D;
            }

            var17 += 0.5D;
            var21 = var21 * (double)var6 / 16.0D;
            ++var13;

            for(int var23 = 0; var23 < var6; ++var23) {
               double var24 = 0.0D;
               double var26 = var14[var23];
               double var28 = this.e[var12] / 512.0D;
               double var30 = this.f[var12] / 512.0D;
               double var32 = (this.d[var12] / 10.0D + 1.0D) / 2.0D;
               if(var32 < 0.0D) {
                  var24 = var28;
               } else if(var32 > 1.0D) {
                  var24 = var30;
               } else {
                  var24 = var28 + (var30 - var28) * var32;
               }

               var24 -= var26;
               double var34;
               if(var23 > var6 - 4) {
                  var34 = (double)((float)(var23 - (var6 - 4)) / 3.0F);
                  var24 = var24 * (1.0D - var34) + -10.0D * var34;
               }

               if((double)var23 < var19) {
                  var34 = (var19 - (double)var23) / 4.0D;
                  if(var34 < 0.0D) {
                     var34 = 0.0D;
                  }

                  if(var34 > 1.0D) {
                     var34 = 1.0D;
                  }

                  var24 = var24 * (1.0D - var34) + -10.0D * var34;
               }

               var1[var12] = var24;
               ++var12;
            }
         }
      }

      return var1;
   }

   public boolean a(int var1, int var2) {
      return true;
   }

   public void a(ca var1, int var2, int var3) {
      yp.a = true;
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      this.c.a(this.o, this.i, var2, var3);

      int var6;
      int var7;
      int var8;
      int var9;
      for(var6 = 0; var6 < 8; ++var6) {
         var7 = var4 + this.i.nextInt(16) + 8;
         var8 = this.i.nextInt(120) + 4;
         var9 = var5 + this.i.nextInt(16) + 8;
         (new lw(pb.C.bO)).a(this.o, this.i, var7, var8, var9);
      }

      var6 = this.i.nextInt(this.i.nextInt(10) + 1) + 1;

      int var10;
      for(var7 = 0; var7 < var6; ++var7) {
         var8 = var4 + this.i.nextInt(16) + 8;
         var9 = this.i.nextInt(120) + 4;
         var10 = var5 + this.i.nextInt(16) + 8;
         (new rq()).a(this.o, this.i, var8, var9, var10);
      }

      var6 = this.i.nextInt(this.i.nextInt(10) + 1);

      for(var7 = 0; var7 < var6; ++var7) {
         var8 = var4 + this.i.nextInt(16) + 8;
         var9 = this.i.nextInt(120) + 4;
         var10 = var5 + this.i.nextInt(16) + 8;
         (new ev()).a(this.o, this.i, var8, var9, var10);
      }

      for(var7 = 0; var7 < 10; ++var7) {
         var8 = var4 + this.i.nextInt(16) + 8;
         var9 = this.i.nextInt(128);
         var10 = var5 + this.i.nextInt(16) + 8;
         (new nj()).a(this.o, this.i, var8, var9, var10);
      }

      if(this.i.nextInt(1) == 0) {
         var7 = var4 + this.i.nextInt(16) + 8;
         var8 = this.i.nextInt(128);
         var9 = var5 + this.i.nextInt(16) + 8;
         (new tz(pb.af.bO)).a(this.o, this.i, var7, var8, var9);
      }

      if(this.i.nextInt(1) == 0) {
         var7 = var4 + this.i.nextInt(16) + 8;
         var8 = this.i.nextInt(128);
         var9 = var5 + this.i.nextInt(16) + 8;
         (new tz(pb.ag.bO)).a(this.o, this.i, var7, var8, var9);
      }

      yp.a = false;
   }

   public boolean a(boolean var1, GUIBackgroundInterface var2) {
      return true;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return true;
   }

   public String c() {
      return "HellRandomLevelSource";
   }

   public List a(acf var1, int var2, int var3, int var4) {
      if(var1 == acf.a && this.c.a(var2, var3, var4)) {
         return this.c.b();
      } else {
         abn var5 = this.o.a(var2, var4);
         return var5 == null?null:var5.a(var1);
      }
   }

   public qo a(World var1, String var2, int var3, int var4, int var5) {
      return null;
   }
}
