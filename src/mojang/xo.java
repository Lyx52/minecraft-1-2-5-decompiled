package mojang;

import java.util.List;
import java.util.Random;

public class xo implements ca {

   private Random i;
   private op j;
   private op k;
   private op l;
   public op a;
   public op b;
   private xd m;
   private double[] n;
   private abn[] o;
   double[] c;
   double[] d;
   double[] e;
   double[] f;
   double[] g;
   int[][] h = new int[32][32];


   public xo(xd var1, long var2) {
      this.m = var1;
      this.i = new Random(var2);
      this.j = new op(this.i, 16);
      this.k = new op(this.i, 16);
      this.l = new op(this.i, 8);
      this.a = new op(this.i, 10);
      this.b = new op(this.i, 16);
   }

   public void a(int var1, int var2, byte[] var3, abn[] var4) {
      byte var5 = 2;
      int var6 = var5 + 1;
      byte var7 = 33;
      int var8 = var5 + 1;
      this.n = this.a(this.n, var1 * var5, 0, var2 * var5, var6, var7, var8);

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var5; ++var10) {
            for(int var11 = 0; var11 < 32; ++var11) {
               double var12 = 0.25D;
               double var14 = this.n[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.n[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.n[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.n[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.n[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.n[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.n[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.n[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 4; ++var30) {
                  double var31 = 0.125D;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 8; ++var41) {
                     int var42 = var41 + var9 * 8 << 11 | 0 + var10 * 8 << 7 | var11 * 4 + var30;
                     short var43 = 128;
                     double var44 = 0.125D;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for(int var50 = 0; var50 < 8; ++var50) {
                        int var51 = 0;
                        if(var46 > 0.0D) {
                           var51 = pb.bJ.bO;
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

   public void b(int var1, int var2, byte[] var3, abn[] var4) {
      for(int var5 = 0; var5 < 16; ++var5) {
         for(int var6 = 0; var6 < 16; ++var6) {
            byte var7 = 1;
            int var8 = -1;
            byte var9 = (byte)pb.bJ.bO;
            byte var10 = (byte)pb.bJ.bO;

            for(int var11 = 127; var11 >= 0; --var11) {
               int var12 = (var6 * 16 + var5) * 128 + var11;
               byte var13 = var3[var12];
               if(var13 == 0) {
                  var8 = -1;
               } else if(var13 == pb.t.bO) {
                  if(var8 == -1) {
                     if(var7 <= 0) {
                        var9 = 0;
                        var10 = (byte)pb.bJ.bO;
                     }

                     var8 = var7;
                     if(var11 >= 0) {
                        var3[var12] = var9;
                     } else {
                        var3[var12] = var10;
                     }
                  } else if(var8 > 0) {
                     --var8;
                     var3[var12] = var10;
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
      this.o = this.m.i().b(this.o, var1 * 16, var2 * 16, 16, 16);
      this.a(var1, var2, var3, this.o);
      this.b(var1, var2, var3, this.o);
      ack var4 = new ack(this.m, var3, var1, var2);
      byte[] var5 = var4.m();

      for(int var6 = 0; var6 < var5.length; ++var6) {
         var5[var6] = (byte)this.o[var6].M;
      }

      var4.b();
      return var4;
   }

   private double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412D;
      double var10 = 684.412D;
      this.f = this.a.a(this.f, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
      this.g = this.b.a(this.g, var2, var4, var5, var7, 200.0D, 200.0D, 0.5D);
      var8 *= 2.0D;
      this.c = this.l.a(this.c, var2, var3, var4, var5, var6, var7, var8 / 80.0D, var10 / 160.0D, var8 / 80.0D);
      this.d = this.j.a(this.d, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.e = this.k.a(this.e, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;

      for(int var14 = 0; var14 < var5; ++var14) {
         for(int var15 = 0; var15 < var7; ++var15) {
            double var16 = (this.f[var13] + 256.0D) / 512.0D;
            if(var16 > 1.0D) {
               var16 = 1.0D;
            }

            double var18 = this.g[var13] / 8000.0D;
            if(var18 < 0.0D) {
               var18 = -var18 * 0.3D;
            }

            var18 = var18 * 3.0D - 2.0D;
            float var20 = (float)(var14 + var2 - 0) / 1.0F;
            float var21 = (float)(var15 + var4 - 0) / 1.0F;
            float var22 = 100.0F - gk.c(var20 * var20 + var21 * var21) * 8.0F;
            if(var22 > 80.0F) {
               var22 = 80.0F;
            }

            if(var22 < -100.0F) {
               var22 = -100.0F;
            }

            if(var18 > 1.0D) {
               var18 = 1.0D;
            }

            var18 /= 8.0D;
            var18 = 0.0D;
            if(var16 < 0.0D) {
               var16 = 0.0D;
            }

            var16 += 0.5D;
            var18 = var18 * (double)var6 / 16.0D;
            ++var13;
            double var23 = (double)var6 / 2.0D;

            for(int var25 = 0; var25 < var6; ++var25) {
               double var26 = 0.0D;
               double var28 = ((double)var25 - var23) * 8.0D / var16;
               if(var28 < 0.0D) {
                  var28 *= -1.0D;
               }

               double var30 = this.d[var12] / 512.0D;
               double var32 = this.e[var12] / 512.0D;
               double var34 = (this.c[var12] / 10.0D + 1.0D) / 2.0D;
               if(var34 < 0.0D) {
                  var26 = var30;
               } else if(var34 > 1.0D) {
                  var26 = var32;
               } else {
                  var26 = var30 + (var32 - var30) * var34;
               }

               var26 -= 8.0D;
               var26 += (double)var22;
               byte var36 = 2;
               double var37;
               if(var25 > var6 / 2 - var36) {
                  var37 = (double)((float)(var25 - (var6 / 2 - var36)) / 64.0F);
                  if(var37 < 0.0D) {
                     var37 = 0.0D;
                  }

                  if(var37 > 1.0D) {
                     var37 = 1.0D;
                  }

                  var26 = var26 * (1.0D - var37) + -3000.0D * var37;
               }

               var36 = 8;
               if(var25 < var36) {
                  var37 = (double)((float)(var36 - var25) / ((float)var36 - 1.0F));
                  var26 = var26 * (1.0D - var37) + -30.0D * var37;
               }

               var1[var12] = var26;
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
      abn var6 = this.m.a(var4 + 16, var5 + 16);
      var6.a(this.m, this.m.r, var4, var5);
      yp.a = false;
   }

   public boolean a(boolean var1, rw var2) {
      return true;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return true;
   }

   public String c() {
      return "RandomLevelSource";
   }

   public List a(acf var1, int var2, int var3, int var4) {
      abn var5 = this.m.a(var2, var4);
      return var5 == null?null:var5.a(var1);
   }

   public qo a(xd var1, String var2, int var3, int var4, int var5) {
      return null;
   }
}
