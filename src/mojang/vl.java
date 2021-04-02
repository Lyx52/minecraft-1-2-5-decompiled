package mojang;

import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class vl {

   public WorldInterface a;
   private int d = -1;
   private boolean e = false;
   private boolean f = false;
   public static boolean b = true;
   public boolean c = true;
   private int g = 0;
   private int h = 0;
   private int i = 0;
   private int j = 0;
   private int k = 0;
   private int l = 0;
   private boolean m;
   private float n;
   private float o;
   private float p;
   private float q;
   private float r;
   private float s;
   private float t;
   private float u;
   private float v;
   private float w;
   private float x;
   private float y;
   private float z;
   private float A;
   private float B;
   private float C;
   private float D;
   private float E;
   private float F;
   private float G;
   private float H;
   private float I;
   private float J;
   private float K;
   private float L;
   private float M;
   private float N;
   private int O;
   private int P;
   private int Q;
   private int R;
   private int S;
   private int T;
   private int U;
   private int V;
   private int W;
   private int X;
   private int Y;
   private int Z;
   private int aa;
   private int ab;
   private int ac;
   private int ad;
   private int ae;
   private int af;
   private int ag;
   private int ah;
   private int ai = 1;
   private int aj;
   private int ak;
   private int al;
   private int am;
   private float an;
   private float ao;
   private float ap;
   private float aq;
   private float ar;
   private float as;
   private float at;
   private float au;
   private float av;
   private float aw;
   private float ax;
   private float ay;
   private boolean az;
   private boolean aA;
   private boolean aB;
   private boolean aC;
   private boolean aD;
   private boolean aE;
   private boolean aF;
   private boolean aG;
   private boolean aH;
   private boolean aI;
   private boolean aJ;
   private boolean aK;


   public vl(WorldInterface var1) {
      this.a = var1;
   }

   public vl() {}

   public void a() {
      this.d = -1;
   }

   public void a(pb var1, int var2, int var3, int var4, int var5) {
      this.d = var5;
      this.b(var1, var2, var3, var4);
      this.d = -1;
   }

   public void a(pb var1, int var2, int var3, int var4) {
      this.f = true;
      this.b(var1, var2, var3, var4);
      this.f = false;
   }

   public boolean b(pb var1, int var2, int var3, int var4) {
      int var5 = var1.d();
      var1.a(this.a, var2, var3, var4);
      return var5 == 0?this.o(var1, var2, var3, var4):(var5 == 4?this.n(var1, var2, var3, var4):(var5 == 13?this.p(var1, var2, var3, var4):(var5 == 1?this.j(var1, var2, var3, var4):(var5 == 19?this.k(var1, var2, var3, var4):(var5 == 23?this.m(var1, var2, var3, var4):(var5 == 6?this.l(var1, var2, var3, var4):(var5 == 2?this.c(var1, var2, var3, var4):(var5 == 3?this.f(var1, var2, var3, var4):(var5 == 5?this.g(var1, var2, var3, var4):(var5 == 8?this.h(var1, var2, var3, var4):(var5 == 7?this.r(var1, var2, var3, var4):(var5 == 9?this.a((aez)var1, var2, var3, var4):(var5 == 10?this.q(var1, var2, var3, var4):(var5 == 27?this.a((de)var1, var2, var3, var4):(var5 == 11?this.a((abg)var1, var2, var3, var4):(var5 == 12?this.e(var1, var2, var3, var4):(var5 == 14?this.t(var1, var2, var3, var4):(var5 == 15?this.u(var1, var2, var3, var4):(var5 == 16?this.b(var1, var2, var3, var4, false):(var5 == 17?this.c(var1, var2, var3, var4, true):(var5 == 18?this.a((akq)var1, var2, var3, var4):(var5 == 20?this.i(var1, var2, var3, var4):(var5 == 21?this.a((ajf)var1, var2, var3, var4):(var5 == 24?this.a((xm)var1, var2, var3, var4):(var5 == 25?this.a((xc)var1, var2, var3, var4):(var5 == 26?this.s(var1, var2, var3, var4):false))))))))))))))))))))))))));
   }

   private boolean s(pb var1, int var2, int var3, int var4) {
      int var5 = this.a.e(var2, var3, var4);
      int var6 = var5 & 3;
      if(var6 == 0) {
         this.k = 3;
      } else if(var6 == 3) {
         this.k = 1;
      } else if(var6 == 1) {
         this.k = 2;
      }

      if(!amj.e(var5)) {
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.h();
         this.k = 0;
         return true;
      } else {
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
         this.o(var1, var2, var3, var4);
         this.d = 174;
         var1.a(0.25F, 0.8125F, 0.25F, 0.75F, 1.0F, 0.75F);
         this.o(var1, var2, var3, var4);
         this.a();
         var1.h();
         this.k = 0;
         return true;
      }
   }

   private boolean t(pb var1, int var2, int var3, int var4) {
      Tessalator var5 = Tessalator.a;
      int var6 = this.a.e(var2, var3, var4);
      int var7 = pm.a(var6);
      boolean var8 = pm.e(var6);
      float var9 = 0.5F;
      float var10 = 1.0F;
      float var11 = 0.8F;
      float var12 = 0.6F;
      int var25 = var1.d(this.a, var2, var3, var4);
      var5.b(var25);
      var5.a(var9, var9, var9);
      int var27 = var1.d(this.a, var2, var3, var4, 0);
      int var28 = (var27 & 15) << 4;
      int var29 = var27 & 240;
      double var30 = (double)((float)var28 / 256.0F);
      double var32 = ((double)(var28 + 16) - 0.01D) / 256.0D;
      double var34 = (double)((float)var29 / 256.0F);
      double var36 = ((double)(var29 + 16) - 0.01D) / 256.0D;
      double var38 = (double)var2 + var1.bV;
      double var40 = (double)var2 + var1.bY;
      double var42 = (double)var3 + var1.bW + 0.1875D;
      double var44 = (double)var4 + var1.bX;
      double var46 = (double)var4 + var1.ca;
      var5.a(var38, var42, var46, var30, var36);
      var5.a(var38, var42, var44, var30, var34);
      var5.a(var40, var42, var44, var32, var34);
      var5.a(var40, var42, var46, var32, var36);
      var5.b(var1.d(this.a, var2, var3 + 1, var4));
      var5.a(var10, var10, var10);
      var27 = var1.d(this.a, var2, var3, var4, 1);
      var28 = (var27 & 15) << 4;
      var29 = var27 & 240;
      var30 = (double)((float)var28 / 256.0F);
      var32 = ((double)(var28 + 16) - 0.01D) / 256.0D;
      var34 = (double)((float)var29 / 256.0F);
      var36 = ((double)(var29 + 16) - 0.01D) / 256.0D;
      var38 = var30;
      var40 = var32;
      var42 = var34;
      var44 = var34;
      var46 = var30;
      double var48 = var32;
      double var50 = var36;
      double var52 = var36;
      if(var7 == 0) {
         var40 = var30;
         var42 = var36;
         var46 = var32;
         var52 = var34;
      } else if(var7 == 2) {
         var38 = var32;
         var44 = var36;
         var48 = var30;
         var50 = var34;
      } else if(var7 == 3) {
         var38 = var32;
         var44 = var36;
         var48 = var30;
         var50 = var34;
         var40 = var30;
         var42 = var36;
         var46 = var32;
         var52 = var34;
      }

      double var54 = (double)var2 + var1.bV;
      double var56 = (double)var2 + var1.bY;
      double var58 = (double)var3 + var1.bZ;
      double var60 = (double)var4 + var1.bX;
      double var62 = (double)var4 + var1.ca;
      var5.a(var56, var58, var62, var46, var50);
      var5.a(var56, var58, var60, var38, var42);
      var5.a(var54, var58, var60, var40, var44);
      var5.a(var54, var58, var62, var48, var52);
      var27 = aav.c[var7];
      if(var8) {
         var27 = aav.c[aav.e[var7]];
      }

      byte var64 = 4;
      switch(var7) {
      case 0:
         var64 = 5;
         break;
      case 1:
         var64 = 3;
      case 2:
      default:
         break;
      case 3:
         var64 = 2;
      }

      if(var27 != 2 && (this.f || var1.a(this.a, var2, var3, var4 - 1, 2))) {
         var5.b(var1.bX > 0.0D?var25:var1.d(this.a, var2, var3, var4 - 1));
         var5.a(var11, var11, var11);
         this.e = var64 == 2;
         this.c(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 2));
      }

      if(var27 != 3 && (this.f || var1.a(this.a, var2, var3, var4 + 1, 3))) {
         var5.b(var1.ca < 1.0D?var25:var1.d(this.a, var2, var3, var4 + 1));
         var5.a(var11, var11, var11);
         this.e = var64 == 3;
         this.d(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 3));
      }

      if(var27 != 4 && (this.f || var1.a(this.a, var2 - 1, var3, var4, 4))) {
         var5.b(var1.bX > 0.0D?var25:var1.d(this.a, var2 - 1, var3, var4));
         var5.a(var12, var12, var12);
         this.e = var64 == 4;
         this.e(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 4));
      }

      if(var27 != 5 && (this.f || var1.a(this.a, var2 + 1, var3, var4, 5))) {
         var5.b(var1.ca < 1.0D?var25:var1.d(this.a, var2 + 1, var3, var4));
         var5.a(var12, var12, var12);
         this.e = var64 == 5;
         this.f(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 5));
      }

      this.e = false;
      return true;
   }

   private boolean a(xc var1, int var2, int var3, int var4) {
      var1.a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
      this.o(var1, var2, var3, var4);
      this.d = 156;
      var1.a(0.5625F, 0.0F, 0.3125F, 0.9375F, 0.125F, 0.6875F);
      this.o(var1, var2, var3, var4);
      var1.a(0.125F, 0.0F, 0.0625F, 0.5F, 0.125F, 0.4375F);
      this.o(var1, var2, var3, var4);
      var1.a(0.125F, 0.0F, 0.5625F, 0.5F, 0.125F, 0.9375F);
      this.o(var1, var2, var3, var4);
      this.a();
      Tessalator var5 = Tessalator.a;
      var5.b(var1.d(this.a, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.c(this.a, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if(lr.a) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.a(var6 * var8, var6 * var9, var6 * var10);
      int var34 = var1.a(0, 0);
      if(this.d >= 0) {
         var34 = this.d;
      }

      int var35 = (var34 & 15) << 4;
      int var36 = var34 & 240;
      double var14 = (double)((float)var36 / 256.0F);
      double var16 = (double)(((float)var36 + 15.99F) / 256.0F);
      int var18 = this.a.e(var2, var3, var4);

      for(int var19 = 0; var19 < 3; ++var19) {
         double var20 = (double)var19 * 3.141592653589793D * 2.0D / 3.0D + 1.5707963267948966D;
         double var22 = (double)(((float)var35 + 8.0F) / 256.0F);
         double var24 = (double)(((float)var35 + 15.99F) / 256.0F);
         if((var18 & 1 << var19) != 0) {
            var22 = (double)(((float)var35 + 7.99F) / 256.0F);
            var24 = (double)(((float)var35 + 0.0F) / 256.0F);
         }

         double var26 = (double)var2 + 0.5D;
         double var28 = (double)var2 + 0.5D + Math.sin(var20) * 8.0D / 16.0D;
         double var30 = (double)var4 + 0.5D;
         double var32 = (double)var4 + 0.5D + Math.cos(var20) * 8.0D / 16.0D;
         var5.a(var26, (double)(var3 + 1), var30, var22, var14);
         var5.a(var26, (double)(var3 + 0), var30, var22, var16);
         var5.a(var28, (double)(var3 + 0), var32, var24, var16);
         var5.a(var28, (double)(var3 + 1), var32, var24, var14);
         var5.a(var28, (double)(var3 + 1), var32, var24, var14);
         var5.a(var28, (double)(var3 + 0), var32, var24, var16);
         var5.a(var26, (double)(var3 + 0), var30, var22, var16);
         var5.a(var26, (double)(var3 + 1), var30, var22, var14);
      }

      var1.h();
      return true;
   }

   private boolean a(xm var1, int var2, int var3, int var4) {
      this.o(var1, var2, var3, var4);
      Tessalator var5 = Tessalator.a;
      var5.b(var1.d(this.a, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.c(this.a, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      float var12;
      if(lr.a) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.a(var6 * var8, var6 * var9, var6 * var10);
      short var16 = 154;
      var12 = 0.125F;
      this.f(var1, (double)((float)var2 - 1.0F + var12), (double)var3, (double)var4, var16);
      this.e(var1, (double)((float)var2 + 1.0F - var12), (double)var3, (double)var4, var16);
      this.d(var1, (double)var2, (double)var3, (double)((float)var4 - 1.0F + var12), var16);
      this.c(var1, (double)var2, (double)var3, (double)((float)var4 + 1.0F - var12), var16);
      short var17 = 139;
      this.b(var1, (double)var2, (double)((float)var3 - 1.0F + 0.25F), (double)var4, var17);
      this.a(var1, (double)var2, (double)((float)var3 + 1.0F - 0.75F), (double)var4, var17);
      int var14 = this.a.e(var2, var3, var4);
      if(var14 > 0) {
         short var15 = 205;
         if(var14 > 3) {
            var14 = 3;
         }

         this.b(var1, (double)var2, (double)((float)var3 - 1.0F + (6.0F + (float)var14 * 3.0F) / 16.0F), (double)var4, var15);
      }

      return true;
   }

   public boolean c(pb var1, int var2, int var3, int var4) {
      int var5 = this.a.e(var2, var3, var4);
      Tessalator var6 = Tessalator.a;
      var6.b(var1.d(this.a, var2, var3, var4));
      var6.a(1.0F, 1.0F, 1.0F);
      double var7 = 0.4000000059604645D;
      double var9 = 0.5D - var7;
      double var11 = 0.20000000298023224D;
      if(var5 == 1) {
         this.a(var1, (double)var2 - var9, (double)var3 + var11, (double)var4, -var7, 0.0D);
      } else if(var5 == 2) {
         this.a(var1, (double)var2 + var9, (double)var3 + var11, (double)var4, var7, 0.0D);
      } else if(var5 == 3) {
         this.a(var1, (double)var2, (double)var3 + var11, (double)var4 - var9, 0.0D, -var7);
      } else if(var5 == 4) {
         this.a(var1, (double)var2, (double)var3 + var11, (double)var4 + var9, 0.0D, var7);
      } else {
         this.a(var1, (double)var2, (double)var3, (double)var4, 0.0D, 0.0D);
      }

      return true;
   }

   private boolean u(pb var1, int var2, int var3, int var4) {
      int var5 = this.a.e(var2, var3, var4);
      int var6 = var5 & 3;
      int var7 = (var5 & 12) >> 2;
      this.o(var1, var2, var3, var4);
      Tessalator var8 = Tessalator.a;
      var8.b(var1.d(this.a, var2, var3, var4));
      var8.a(1.0F, 1.0F, 1.0F);
      double var9 = -0.1875D;
      double var11 = 0.0D;
      double var13 = 0.0D;
      double var15 = 0.0D;
      double var17 = 0.0D;
      switch(var6) {
      case 0:
         var17 = -0.3125D;
         var13 = qx.a[var7];
         break;
      case 1:
         var15 = 0.3125D;
         var11 = -qx.a[var7];
         break;
      case 2:
         var17 = 0.3125D;
         var13 = -qx.a[var7];
         break;
      case 3:
         var15 = -0.3125D;
         var11 = qx.a[var7];
      }

      this.a(var1, (double)var2 + var11, (double)var3 + var9, (double)var4 + var13, 0.0D, 0.0D);
      this.a(var1, (double)var2 + var15, (double)var3 + var9, (double)var4 + var17, 0.0D, 0.0D);
      int var19 = var1.a_(1);
      int var20 = (var19 & 15) << 4;
      int var21 = var19 & 240;
      double var22 = (double)((float)var20 / 256.0F);
      double var24 = (double)(((float)var20 + 15.99F) / 256.0F);
      double var26 = (double)((float)var21 / 256.0F);
      double var28 = (double)(((float)var21 + 15.99F) / 256.0F);
      double var30 = 0.125D;
      double var32 = (double)(var2 + 1);
      double var34 = (double)(var2 + 1);
      double var36 = (double)(var2 + 0);
      double var38 = (double)(var2 + 0);
      double var40 = (double)(var4 + 0);
      double var42 = (double)(var4 + 1);
      double var44 = (double)(var4 + 1);
      double var46 = (double)(var4 + 0);
      double var48 = (double)var3 + var30;
      if(var6 == 2) {
         var32 = var34 = (double)(var2 + 0);
         var36 = var38 = (double)(var2 + 1);
         var40 = var46 = (double)(var4 + 1);
         var42 = var44 = (double)(var4 + 0);
      } else if(var6 == 3) {
         var32 = var38 = (double)(var2 + 0);
         var34 = var36 = (double)(var2 + 1);
         var40 = var42 = (double)(var4 + 0);
         var44 = var46 = (double)(var4 + 1);
      } else if(var6 == 1) {
         var32 = var38 = (double)(var2 + 1);
         var34 = var36 = (double)(var2 + 0);
         var40 = var42 = (double)(var4 + 1);
         var44 = var46 = (double)(var4 + 0);
      }

      var8.a(var38, var48, var46, var22, var26);
      var8.a(var36, var48, var44, var22, var28);
      var8.a(var34, var48, var42, var24, var28);
      var8.a(var32, var48, var40, var24, var26);
      return true;
   }

   public void d(pb var1, int var2, int var3, int var4) {
      this.f = true;
      this.b(var1, var2, var3, var4, true);
      this.f = false;
   }

   private boolean b(pb var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.a.e(var2, var3, var4);
      boolean var7 = var5 || (var6 & 8) != 0;
      int var8 = abc.e(var6);
      if(var7) {
         switch(var8) {
         case 0:
            this.g = 3;
            this.h = 3;
            this.i = 3;
            this.j = 3;
            var1.a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 1:
            var1.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
            break;
         case 2:
            this.i = 1;
            this.j = 2;
            var1.a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
            break;
         case 3:
            this.i = 2;
            this.j = 1;
            this.k = 3;
            this.l = 3;
            var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
            break;
         case 4:
            this.g = 1;
            this.h = 2;
            this.k = 2;
            this.l = 1;
            var1.a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 5:
            this.g = 2;
            this.h = 1;
            this.k = 1;
            this.l = 2;
            var1.a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
         }

         this.o(var1, var2, var3, var4);
         this.g = 0;
         this.h = 0;
         this.i = 0;
         this.j = 0;
         this.k = 0;
         this.l = 0;
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         switch(var8) {
         case 0:
            this.g = 3;
            this.h = 3;
            this.i = 3;
            this.j = 3;
         case 1:
         default:
            break;
         case 2:
            this.i = 1;
            this.j = 2;
            break;
         case 3:
            this.i = 2;
            this.j = 1;
            this.k = 3;
            this.l = 3;
            break;
         case 4:
            this.g = 1;
            this.h = 2;
            this.k = 2;
            this.l = 1;
            break;
         case 5:
            this.g = 2;
            this.h = 1;
            this.k = 1;
            this.l = 2;
         }

         this.o(var1, var2, var3, var4);
         this.g = 0;
         this.h = 0;
         this.i = 0;
         this.j = 0;
         this.k = 0;
         this.l = 0;
      }

      return true;
   }

   private void a(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      int var16 = 108;
      if(this.d >= 0) {
         var16 = this.d;
      }

      int var17 = (var16 & 15) << 4;
      int var18 = var16 & 240;
      Tessalator var19 = Tessalator.a;
      double var20 = (double)((float)(var17 + 0) / 256.0F);
      double var22 = (double)((float)(var18 + 0) / 256.0F);
      double var24 = ((double)var17 + var14 - 0.01D) / 256.0D;
      double var26 = ((double)((float)var18 + 4.0F) - 0.01D) / 256.0D;
      var19.a(var13, var13, var13);
      var19.a(var1, var7, var9, var24, var22);
      var19.a(var1, var5, var9, var20, var22);
      var19.a(var3, var5, var11, var20, var26);
      var19.a(var3, var7, var11, var24, var26);
   }

   private void b(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      int var16 = 108;
      if(this.d >= 0) {
         var16 = this.d;
      }

      int var17 = (var16 & 15) << 4;
      int var18 = var16 & 240;
      Tessalator var19 = Tessalator.a;
      double var20 = (double)((float)(var17 + 0) / 256.0F);
      double var22 = (double)((float)(var18 + 0) / 256.0F);
      double var24 = ((double)var17 + var14 - 0.01D) / 256.0D;
      double var26 = ((double)((float)var18 + 4.0F) - 0.01D) / 256.0D;
      var19.a(var13, var13, var13);
      var19.a(var1, var5, var11, var24, var22);
      var19.a(var1, var5, var9, var20, var22);
      var19.a(var3, var7, var9, var20, var26);
      var19.a(var3, var7, var11, var24, var26);
   }

   private void c(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      int var16 = 108;
      if(this.d >= 0) {
         var16 = this.d;
      }

      int var17 = (var16 & 15) << 4;
      int var18 = var16 & 240;
      Tessalator var19 = Tessalator.a;
      double var20 = (double)((float)(var17 + 0) / 256.0F);
      double var22 = (double)((float)(var18 + 0) / 256.0F);
      double var24 = ((double)var17 + var14 - 0.01D) / 256.0D;
      double var26 = ((double)((float)var18 + 4.0F) - 0.01D) / 256.0D;
      var19.a(var13, var13, var13);
      var19.a(var3, var5, var9, var24, var22);
      var19.a(var1, var5, var9, var20, var22);
      var19.a(var1, var7, var11, var20, var26);
      var19.a(var3, var7, var11, var24, var26);
   }

   public void a(pb var1, int var2, int var3, int var4, boolean var5) {
      this.f = true;
      this.c(var1, var2, var3, var4, var5);
      this.f = false;
   }

   private boolean c(pb var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.a.e(var2, var3, var4);
      int var7 = sq.h(var6);
      float var11 = var1.e(this.a, var2, var3, var4);
      float var12 = var5?1.0F:0.5F;
      double var13 = var5?16.0D:8.0D;
      switch(var7) {
      case 0:
         this.g = 3;
         this.h = 3;
         this.i = 3;
         this.j = 3;
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
         this.o(var1, var2, var3, var4);
         this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.8F, var13);
         this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.8F, var13);
         this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
         this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
         break;
      case 1:
         var1.a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
         this.o(var1, var2, var3, var4);
         this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.8F, var13);
         this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.8F, var13);
         this.a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
         this.a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
         break;
      case 2:
         this.i = 1;
         this.j = 2;
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
         this.o(var1, var2, var3, var4);
         this.b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11 * 0.6F, var13);
         this.b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11 * 0.6F, var13);
         this.b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11 * 0.5F, var13);
         this.b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11, var13);
         break;
      case 3:
         this.i = 2;
         this.j = 1;
         this.k = 3;
         this.l = 3;
         var1.a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
         this.o(var1, var2, var3, var4);
         this.b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11 * 0.6F, var13);
         this.b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11 * 0.6F, var13);
         this.b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11 * 0.5F, var13);
         this.b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11, var13);
         break;
      case 4:
         this.g = 1;
         this.h = 2;
         this.k = 2;
         this.l = 1;
         var1.a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
         this.o(var1, var2, var3, var4);
         this.c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.5F, var13);
         this.c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11, var13);
         this.c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
         this.c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
         break;
      case 5:
         this.g = 2;
         this.h = 1;
         this.k = 1;
         this.l = 2;
         var1.a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         this.o(var1, var2, var3, var4);
         this.c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.5F, var13);
         this.c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11, var13);
         this.c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
         this.c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
      }

      this.g = 0;
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.k = 0;
      this.l = 0;
      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return true;
   }

   public boolean e(pb var1, int var2, int var3, int var4) {
      int var5 = this.a.e(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) > 0;
      Tessalator var8 = Tessalator.a;
      boolean var9 = this.d >= 0;
      if(!var9) {
         this.d = pb.w.bN;
      }

      float var10 = 0.25F;
      float var11 = 0.1875F;
      float var12 = 0.1875F;
      if(var6 == 5) {
         var1.a(0.5F - var11, 0.0F, 0.5F - var10, 0.5F + var11, var12, 0.5F + var10);
      } else if(var6 == 6) {
         var1.a(0.5F - var10, 0.0F, 0.5F - var11, 0.5F + var10, var12, 0.5F + var11);
      } else if(var6 == 4) {
         var1.a(0.5F - var11, 0.5F - var10, 1.0F - var12, 0.5F + var11, 0.5F + var10, 1.0F);
      } else if(var6 == 3) {
         var1.a(0.5F - var11, 0.5F - var10, 0.0F, 0.5F + var11, 0.5F + var10, var12);
      } else if(var6 == 2) {
         var1.a(1.0F - var12, 0.5F - var10, 0.5F - var11, 1.0F, 0.5F + var10, 0.5F + var11);
      } else if(var6 == 1) {
         var1.a(0.0F, 0.5F - var10, 0.5F - var11, var12, 0.5F + var10, 0.5F + var11);
      }

      this.o(var1, var2, var3, var4);
      if(!var9) {
         this.d = -1;
      }

      var8.b(var1.d(this.a, var2, var3, var4));
      float var13 = 1.0F;
      if(pb.q[var1.bO] > 0) {
         var13 = 1.0F;
      }

      var8.a(var13, var13, var13);
      int var14 = var1.a_(0);
      if(this.d >= 0) {
         var14 = this.d;
      }

      int var15 = (var14 & 15) << 4;
      int var16 = var14 & 240;
      float var17 = (float)var15 / 256.0F;
      float var18 = ((float)var15 + 15.99F) / 256.0F;
      float var19 = (float)var16 / 256.0F;
      float var20 = ((float)var16 + 15.99F) / 256.0F;
      bo[] var21 = new bo[8];
      float var22 = 0.0625F;
      float var23 = 0.0625F;
      float var24 = 0.625F;
      var21[0] = bo.b((double)(-var22), 0.0D, (double)(-var23));
      var21[1] = bo.b((double)var22, 0.0D, (double)(-var23));
      var21[2] = bo.b((double)var22, 0.0D, (double)var23);
      var21[3] = bo.b((double)(-var22), 0.0D, (double)var23);
      var21[4] = bo.b((double)(-var22), (double)var24, (double)(-var23));
      var21[5] = bo.b((double)var22, (double)var24, (double)(-var23));
      var21[6] = bo.b((double)var22, (double)var24, (double)var23);
      var21[7] = bo.b((double)(-var22), (double)var24, (double)var23);

      for(int var25 = 0; var25 < 8; ++var25) {
         if(var7) {
            var21[var25].c -= 0.0625D;
            var21[var25].a(0.69813174F);
         } else {
            var21[var25].c += 0.0625D;
            var21[var25].a(-0.69813174F);
         }

         if(var6 == 6) {
            var21[var25].b(1.5707964F);
         }

         if(var6 < 5) {
            var21[var25].b -= 0.375D;
            var21[var25].a(1.5707964F);
            if(var6 == 4) {
               var21[var25].b(0.0F);
            }

            if(var6 == 3) {
               var21[var25].b(3.1415927F);
            }

            if(var6 == 2) {
               var21[var25].b(1.5707964F);
            }

            if(var6 == 1) {
               var21[var25].b(-1.5707964F);
            }

            var21[var25].a += (double)var2 + 0.5D;
            var21[var25].b += (double)((float)var3 + 0.5F);
            var21[var25].c += (double)var4 + 0.5D;
         } else {
            var21[var25].a += (double)var2 + 0.5D;
            var21[var25].b += (double)((float)var3 + 0.125F);
            var21[var25].c += (double)var4 + 0.5D;
         }
      }

      bo var30 = null;
      bo var26 = null;
      bo var27 = null;
      bo var28 = null;

      for(int var29 = 0; var29 < 6; ++var29) {
         if(var29 == 0) {
            var17 = (float)(var15 + 7) / 256.0F;
            var18 = ((float)(var15 + 9) - 0.01F) / 256.0F;
            var19 = (float)(var16 + 6) / 256.0F;
            var20 = ((float)(var16 + 8) - 0.01F) / 256.0F;
         } else if(var29 == 2) {
            var17 = (float)(var15 + 7) / 256.0F;
            var18 = ((float)(var15 + 9) - 0.01F) / 256.0F;
            var19 = (float)(var16 + 6) / 256.0F;
            var20 = ((float)(var16 + 16) - 0.01F) / 256.0F;
         }

         if(var29 == 0) {
            var30 = var21[0];
            var26 = var21[1];
            var27 = var21[2];
            var28 = var21[3];
         } else if(var29 == 1) {
            var30 = var21[7];
            var26 = var21[6];
            var27 = var21[5];
            var28 = var21[4];
         } else if(var29 == 2) {
            var30 = var21[1];
            var26 = var21[0];
            var27 = var21[4];
            var28 = var21[5];
         } else if(var29 == 3) {
            var30 = var21[2];
            var26 = var21[1];
            var27 = var21[5];
            var28 = var21[6];
         } else if(var29 == 4) {
            var30 = var21[3];
            var26 = var21[2];
            var27 = var21[6];
            var28 = var21[7];
         } else if(var29 == 5) {
            var30 = var21[0];
            var26 = var21[3];
            var27 = var21[7];
            var28 = var21[4];
         }

         var8.a(var30.a, var30.b, var30.c, (double)var17, (double)var20);
         var8.a(var26.a, var26.b, var26.c, (double)var18, (double)var20);
         var8.a(var27.a, var27.b, var27.c, (double)var18, (double)var19);
         var8.a(var28.a, var28.b, var28.c, (double)var17, (double)var19);
      }

      return true;
   }

   public boolean f(pb var1, int var2, int var3, int var4) {
      Tessalator var5 = Tessalator.a;
      int var6 = var1.a_(0);
      if(this.d >= 0) {
         var6 = this.d;
      }

      var5.a(1.0F, 1.0F, 1.0F);
      var5.b(var1.d(this.a, var2, var3, var4));
      int var7 = (var6 & 15) << 4;
      int var8 = var6 & 240;
      double var9 = (double)((float)var7 / 256.0F);
      double var11 = (double)(((float)var7 + 15.99F) / 256.0F);
      double var13 = (double)((float)var8 / 256.0F);
      double var15 = (double)(((float)var8 + 15.99F) / 256.0F);
      float var17 = 1.4F;
      double var20;
      double var22;
      double var24;
      double var26;
      double var28;
      double var30;
      double var32;
      if(!this.a.h(var2, var3 - 1, var4) && !pb.ar.g(this.a, var2, var3 - 1, var4)) {
         float var36 = 0.2F;
         float var19 = 0.0625F;
         if((var2 + var3 + var4 & 1) == 1) {
            var9 = (double)((float)var7 / 256.0F);
            var11 = (double)(((float)var7 + 15.99F) / 256.0F);
            var13 = (double)((float)(var8 + 16) / 256.0F);
            var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
         }

         if((var2 / 2 + var3 / 2 + var4 / 2 & 1) == 1) {
            var20 = var11;
            var11 = var9;
            var9 = var20;
         }

         if(pb.ar.g(this.a, var2 - 1, var3, var4)) {
            var5.a((double)((float)var2 + var36), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)((float)var2 + var36), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
            var5.a((double)((float)var2 + var36), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.a((double)((float)var2 + var36), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
         }

         if(pb.ar.g(this.a, var2 + 1, var3, var4)) {
            var5.a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
            var5.a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
         }

         if(pb.ar.g(this.a, var2, var3, var4 - 1)) {
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)var4 + var36), var11, var13);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var11, var15);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)var4 + var36), var9, var13);
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)var4 + var36), var9, var13);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var11, var15);
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)var4 + var36), var11, var13);
         }

         if(pb.ar.g(this.a, var2, var3, var4 + 1)) {
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var36), var9, var13);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var9, var15);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var11, var15);
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var36), var11, var13);
            var5.a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var36), var11, var13);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var11, var15);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var9, var15);
            var5.a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var36), var9, var13);
         }

         if(pb.ar.g(this.a, var2, var3 + 1, var4)) {
            var20 = (double)var2 + 0.5D + 0.5D;
            var22 = (double)var2 + 0.5D - 0.5D;
            var24 = (double)var4 + 0.5D + 0.5D;
            var26 = (double)var4 + 0.5D - 0.5D;
            var28 = (double)var2 + 0.5D - 0.5D;
            var30 = (double)var2 + 0.5D + 0.5D;
            var32 = (double)var4 + 0.5D - 0.5D;
            double var34 = (double)var4 + 0.5D + 0.5D;
            var9 = (double)((float)var7 / 256.0F);
            var11 = (double)(((float)var7 + 15.99F) / 256.0F);
            var13 = (double)((float)var8 / 256.0F);
            var15 = (double)(((float)var8 + 15.99F) / 256.0F);
            ++var3;
            var17 = -0.2F;
            if((var2 + var3 + var4 & 1) == 0) {
               var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 0), var11, var13);
               var5.a(var20, (double)(var3 + 0), (double)(var4 + 0), var11, var15);
               var5.a(var20, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
               var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 1), var9, var13);
               var9 = (double)((float)var7 / 256.0F);
               var11 = (double)(((float)var7 + 15.99F) / 256.0F);
               var13 = (double)((float)(var8 + 16) / 256.0F);
               var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
               var5.a(var30, (double)((float)var3 + var17), (double)(var4 + 1), var11, var13);
               var5.a(var22, (double)(var3 + 0), (double)(var4 + 1), var11, var15);
               var5.a(var22, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
               var5.a(var30, (double)((float)var3 + var17), (double)(var4 + 0), var9, var13);
            } else {
               var5.a((double)(var2 + 0), (double)((float)var3 + var17), var34, var11, var13);
               var5.a((double)(var2 + 0), (double)(var3 + 0), var26, var11, var15);
               var5.a((double)(var2 + 1), (double)(var3 + 0), var26, var9, var15);
               var5.a((double)(var2 + 1), (double)((float)var3 + var17), var34, var9, var13);
               var9 = (double)((float)var7 / 256.0F);
               var11 = (double)(((float)var7 + 15.99F) / 256.0F);
               var13 = (double)((float)(var8 + 16) / 256.0F);
               var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
               var5.a((double)(var2 + 1), (double)((float)var3 + var17), var32, var11, var13);
               var5.a((double)(var2 + 1), (double)(var3 + 0), var24, var11, var15);
               var5.a((double)(var2 + 0), (double)(var3 + 0), var24, var9, var15);
               var5.a((double)(var2 + 0), (double)((float)var3 + var17), var32, var9, var13);
            }
         }
      } else {
         double var18 = (double)var2 + 0.5D + 0.2D;
         var20 = (double)var2 + 0.5D - 0.2D;
         var22 = (double)var4 + 0.5D + 0.2D;
         var24 = (double)var4 + 0.5D - 0.2D;
         var26 = (double)var2 + 0.5D - 0.3D;
         var28 = (double)var2 + 0.5D + 0.3D;
         var30 = (double)var4 + 0.5D - 0.3D;
         var32 = (double)var4 + 0.5D + 0.3D;
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 1), var11, var13);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 1), var11, var15);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 0), var9, var13);
         var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 0), var11, var13);
         var5.a(var20, (double)(var3 + 0), (double)(var4 + 0), var11, var15);
         var5.a(var20, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
         var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 1), var9, var13);
         var9 = (double)((float)var7 / 256.0F);
         var11 = (double)(((float)var7 + 15.99F) / 256.0F);
         var13 = (double)((float)(var8 + 16) / 256.0F);
         var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var32, var11, var13);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var24, var11, var15);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var24, var9, var15);
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var32, var9, var13);
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var30, var11, var13);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var22, var11, var15);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var22, var9, var15);
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var30, var9, var13);
         var18 = (double)var2 + 0.5D - 0.5D;
         var20 = (double)var2 + 0.5D + 0.5D;
         var22 = (double)var4 + 0.5D - 0.5D;
         var24 = (double)var4 + 0.5D + 0.5D;
         var26 = (double)var2 + 0.5D - 0.4D;
         var28 = (double)var2 + 0.5D + 0.4D;
         var30 = (double)var4 + 0.5D - 0.4D;
         var32 = (double)var4 + 0.5D + 0.4D;
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 0), var9, var13);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
         var5.a(var18, (double)(var3 + 0), (double)(var4 + 1), var11, var15);
         var5.a(var26, (double)((float)var3 + var17), (double)(var4 + 1), var11, var13);
         var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 1), var9, var13);
         var5.a(var20, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
         var5.a(var20, (double)(var3 + 0), (double)(var4 + 0), var11, var15);
         var5.a(var28, (double)((float)var3 + var17), (double)(var4 + 0), var11, var13);
         var9 = (double)((float)var7 / 256.0F);
         var11 = (double)(((float)var7 + 15.99F) / 256.0F);
         var13 = (double)((float)var8 / 256.0F);
         var15 = (double)(((float)var8 + 15.99F) / 256.0F);
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var32, var9, var13);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var24, var9, var15);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var24, var11, var15);
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var32, var11, var13);
         var5.a((double)(var2 + 1), (double)((float)var3 + var17), var30, var9, var13);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var22, var9, var15);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var22, var11, var15);
         var5.a((double)(var2 + 0), (double)((float)var3 + var17), var30, var11, var13);
      }

      return true;
   }

   public boolean g(pb var1, int var2, int var3, int var4) {
      Tessalator var5 = Tessalator.a;
      int var6 = this.a.e(var2, var3, var4);
      int var7 = var1.a(1, var6);
      if(this.d >= 0) {
         var7 = this.d;
      }

      var5.b(var1.d(this.a, var2, var3, var4));
      float var8 = 1.0F;
      float var9 = (float)var6 / 15.0F;
      float var10 = var9 * 0.6F + 0.4F;
      if(var6 == 0) {
         var10 = 0.3F;
      }

      float var11 = var9 * var9 * 0.7F - 0.5F;
      float var12 = var9 * var9 * 0.6F - 0.7F;
      if(var11 < 0.0F) {
         var11 = 0.0F;
      }

      if(var12 < 0.0F) {
         var12 = 0.0F;
      }

      var5.a(var10, var11, var12);
      int var13 = (var7 & 15) << 4;
      int var14 = var7 & 240;
      double var15 = (double)((float)var13 / 256.0F);
      double var17 = (double)(((float)var13 + 15.99F) / 256.0F);
      double var19 = (double)((float)var14 / 256.0F);
      double var21 = (double)(((float)var14 + 15.99F) / 256.0F);
      boolean var29 = ahi.e(this.a, var2 - 1, var3, var4, 1) || !this.a.h(var2 - 1, var3, var4) && ahi.e(this.a, var2 - 1, var3 - 1, var4, -1);
      boolean var30 = ahi.e(this.a, var2 + 1, var3, var4, 3) || !this.a.h(var2 + 1, var3, var4) && ahi.e(this.a, var2 + 1, var3 - 1, var4, -1);
      boolean var31 = ahi.e(this.a, var2, var3, var4 - 1, 2) || !this.a.h(var2, var3, var4 - 1) && ahi.e(this.a, var2, var3 - 1, var4 - 1, -1);
      boolean var32 = ahi.e(this.a, var2, var3, var4 + 1, 0) || !this.a.h(var2, var3, var4 + 1) && ahi.e(this.a, var2, var3 - 1, var4 + 1, -1);
      if(!this.a.h(var2, var3 + 1, var4)) {
         if(this.a.h(var2 - 1, var3, var4) && ahi.e(this.a, var2 - 1, var3 + 1, var4, -1)) {
            var29 = true;
         }

         if(this.a.h(var2 + 1, var3, var4) && ahi.e(this.a, var2 + 1, var3 + 1, var4, -1)) {
            var30 = true;
         }

         if(this.a.h(var2, var3, var4 - 1) && ahi.e(this.a, var2, var3 + 1, var4 - 1, -1)) {
            var31 = true;
         }

         if(this.a.h(var2, var3, var4 + 1) && ahi.e(this.a, var2, var3 + 1, var4 + 1, -1)) {
            var32 = true;
         }
      }

      float var34 = (float)(var2 + 0);
      float var35 = (float)(var2 + 1);
      float var36 = (float)(var4 + 0);
      float var37 = (float)(var4 + 1);
      byte var38 = 0;
      if((var29 || var30) && !var31 && !var32) {
         var38 = 1;
      }

      if((var31 || var32) && !var30 && !var29) {
         var38 = 2;
      }

      if(var38 != 0) {
         var15 = (double)((float)(var13 + 16) / 256.0F);
         var17 = (double)(((float)(var13 + 16) + 15.99F) / 256.0F);
         var19 = (double)((float)var14 / 256.0F);
         var21 = (double)(((float)var14 + 15.99F) / 256.0F);
      }

      if(var38 == 0) {
         if(!var29) {
            var34 += 0.3125F;
         }

         if(!var29) {
            var15 += 0.01953125D;
         }

         if(!var30) {
            var35 -= 0.3125F;
         }

         if(!var30) {
            var17 -= 0.01953125D;
         }

         if(!var31) {
            var36 += 0.3125F;
         }

         if(!var31) {
            var19 += 0.01953125D;
         }

         if(!var32) {
            var37 -= 0.3125F;
         }

         if(!var32) {
            var21 -= 0.01953125D;
         }

         var5.a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21);
         var5.a((double)var35, (double)var3 + 0.015625D, (double)var36, var17, var19);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var37, var15, var21);
         var5.a(var8, var8, var8);
         var5.a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21 + 0.0625D);
         var5.a((double)var35, (double)var3 + 0.015625D, (double)var36, var17, var19 + 0.0625D);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19 + 0.0625D);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var37, var15, var21 + 0.0625D);
      } else if(var38 == 1) {
         var5.a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21);
         var5.a((double)var35, (double)var3 + 0.015625D, (double)var36, var17, var19);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var37, var15, var21);
         var5.a(var8, var8, var8);
         var5.a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21 + 0.0625D);
         var5.a((double)var35, (double)var3 + 0.015625D, (double)var36, var17, var19 + 0.0625D);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19 + 0.0625D);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var37, var15, var21 + 0.0625D);
      } else if(var38 == 2) {
         var5.a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21);
         var5.a((double)var35, (double)var3 + 0.015625D, (double)var36, var15, var21);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var37, var17, var19);
         var5.a(var8, var8, var8);
         var5.a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21 + 0.0625D);
         var5.a((double)var35, (double)var3 + 0.015625D, (double)var36, var15, var21 + 0.0625D);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19 + 0.0625D);
         var5.a((double)var34, (double)var3 + 0.015625D, (double)var37, var17, var19 + 0.0625D);
      }

      if(!this.a.h(var2, var3 + 1, var4)) {
         var15 = (double)((float)(var13 + 16) / 256.0F);
         var17 = (double)(((float)(var13 + 16) + 15.99F) / 256.0F);
         var19 = (double)((float)var14 / 256.0F);
         var21 = (double)(((float)var14 + 15.99F) / 256.0F);
         if(this.a.h(var2 - 1, var3, var4) && this.a.a(var2 - 1, var3 + 1, var4) == pb.av.bO) {
            var5.a(var8 * var10, var8 * var11, var8 * var12);
            var5.a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var19);
            var5.a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 1), var15, var19);
            var5.a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 0), var15, var21);
            var5.a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var21);
            var5.a(var8, var8, var8);
            var5.a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var19 + 0.0625D);
            var5.a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 1), var15, var19 + 0.0625D);
            var5.a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 0), var15, var21 + 0.0625D);
            var5.a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var21 + 0.0625D);
         }

         if(this.a.h(var2 + 1, var3, var4) && this.a.a(var2 + 1, var3 + 1, var4) == pb.av.bO) {
            var5.a(var8 * var10, var8 * var11, var8 * var12);
            var5.a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 1), var15, var21);
            var5.a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var21);
            var5.a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var19);
            var5.a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 0), var15, var19);
            var5.a(var8, var8, var8);
            var5.a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 1), var15, var21 + 0.0625D);
            var5.a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var21 + 0.0625D);
            var5.a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var19 + 0.0625D);
            var5.a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 0), var15, var19 + 0.0625D);
         }

         if(this.a.h(var2, var3, var4 - 1) && this.a.a(var2, var3 + 1, var4 - 1) == pb.av.bO) {
            var5.a(var8 * var10, var8 * var11, var8 * var12);
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + 0.015625D, var15, var21);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, var17, var21);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, var17, var19);
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + 0.015625D, var15, var19);
            var5.a(var8, var8, var8);
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + 0.015625D, var15, var21 + 0.0625D);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, var17, var21 + 0.0625D);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, var17, var19 + 0.0625D);
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + 0.015625D, var15, var19 + 0.0625D);
         }

         if(this.a.h(var2, var3, var4 + 1) && this.a.a(var2, var3 + 1, var4 + 1) == pb.av.bO) {
            var5.a(var8 * var10, var8 * var11, var8 * var12);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, var17, var19);
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, var15, var19);
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, var15, var21);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, var17, var21);
            var5.a(var8, var8, var8);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, var17, var19 + 0.0625D);
            var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, var15, var19 + 0.0625D);
            var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, var15, var21 + 0.0625D);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, var17, var21 + 0.0625D);
         }
      }

      return true;
   }

   public boolean a(aez var1, int var2, int var3, int var4) {
      Tessalator var5 = Tessalator.a;
      int var6 = this.a.e(var2, var3, var4);
      int var7 = var1.a(0, var6);
      if(this.d >= 0) {
         var7 = this.d;
      }

      if(var1.v()) {
         var6 &= 7;
      }

      var5.b(var1.d(this.a, var2, var3, var4));
      var5.a(1.0F, 1.0F, 1.0F);
      int var8 = (var7 & 15) << 4;
      int var9 = var7 & 240;
      double var10 = (double)((float)var8 / 256.0F);
      double var12 = (double)(((float)var8 + 15.99F) / 256.0F);
      double var14 = (double)((float)var9 / 256.0F);
      double var16 = (double)(((float)var9 + 15.99F) / 256.0F);
      double var18 = 0.0625D;
      double var20 = (double)(var2 + 1);
      double var22 = (double)(var2 + 1);
      double var24 = (double)(var2 + 0);
      double var26 = (double)(var2 + 0);
      double var28 = (double)(var4 + 0);
      double var30 = (double)(var4 + 1);
      double var32 = (double)(var4 + 1);
      double var34 = (double)(var4 + 0);
      double var36 = (double)var3 + var18;
      double var38 = (double)var3 + var18;
      double var40 = (double)var3 + var18;
      double var42 = (double)var3 + var18;
      if(var6 != 1 && var6 != 2 && var6 != 3 && var6 != 7) {
         if(var6 == 8) {
            var20 = var22 = (double)(var2 + 0);
            var24 = var26 = (double)(var2 + 1);
            var28 = var34 = (double)(var4 + 1);
            var30 = var32 = (double)(var4 + 0);
         } else if(var6 == 9) {
            var20 = var26 = (double)(var2 + 0);
            var22 = var24 = (double)(var2 + 1);
            var28 = var30 = (double)(var4 + 0);
            var32 = var34 = (double)(var4 + 1);
         }
      } else {
         var20 = var26 = (double)(var2 + 1);
         var22 = var24 = (double)(var2 + 0);
         var28 = var30 = (double)(var4 + 1);
         var32 = var34 = (double)(var4 + 0);
      }

      if(var6 != 2 && var6 != 4) {
         if(var6 == 3 || var6 == 5) {
            ++var38;
            ++var40;
         }
      } else {
         ++var36;
         ++var42;
      }

      var5.a(var20, var36, var28, var12, var14);
      var5.a(var22, var38, var30, var12, var16);
      var5.a(var24, var40, var32, var10, var16);
      var5.a(var26, var42, var34, var10, var14);
      var5.a(var26, var42, var34, var10, var14);
      var5.a(var24, var40, var32, var10, var16);
      var5.a(var22, var38, var30, var12, var16);
      var5.a(var20, var36, var28, var12, var14);
      return true;
   }

   public boolean h(pb var1, int var2, int var3, int var4) {
      Tessalator var5 = Tessalator.a;
      int var6 = var1.a_(0);
      if(this.d >= 0) {
         var6 = this.d;
      }

      var5.b(var1.d(this.a, var2, var3, var4));
      float var7 = 1.0F;
      var5.a(var7, var7, var7);
      int var22 = (var6 & 15) << 4;
      int var8 = var6 & 240;
      double var9 = (double)((float)var22 / 256.0F);
      double var11 = (double)(((float)var22 + 15.99F) / 256.0F);
      double var13 = (double)((float)var8 / 256.0F);
      double var15 = (double)(((float)var8 + 15.99F) / 256.0F);
      int var17 = this.a.e(var2, var3, var4);
      double var18 = 0.0D;
      double var20 = 0.05000000074505806D;
      if(var17 == 5) {
         var5.a((double)var2 + var20, (double)(var3 + 1) + var18, (double)(var4 + 1) + var18, var9, var13);
         var5.a((double)var2 + var20, (double)(var3 + 0) - var18, (double)(var4 + 1) + var18, var9, var15);
         var5.a((double)var2 + var20, (double)(var3 + 0) - var18, (double)(var4 + 0) - var18, var11, var15);
         var5.a((double)var2 + var20, (double)(var3 + 1) + var18, (double)(var4 + 0) - var18, var11, var13);
      }

      if(var17 == 4) {
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 0) - var18, (double)(var4 + 1) + var18, var11, var15);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 1) + var18, (double)(var4 + 1) + var18, var11, var13);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 1) + var18, (double)(var4 + 0) - var18, var9, var13);
         var5.a((double)(var2 + 1) - var20, (double)(var3 + 0) - var18, (double)(var4 + 0) - var18, var9, var15);
      }

      if(var17 == 3) {
         var5.a((double)(var2 + 1) + var18, (double)(var3 + 0) - var18, (double)var4 + var20, var11, var15);
         var5.a((double)(var2 + 1) + var18, (double)(var3 + 1) + var18, (double)var4 + var20, var11, var13);
         var5.a((double)(var2 + 0) - var18, (double)(var3 + 1) + var18, (double)var4 + var20, var9, var13);
         var5.a((double)(var2 + 0) - var18, (double)(var3 + 0) - var18, (double)var4 + var20, var9, var15);
      }

      if(var17 == 2) {
         var5.a((double)(var2 + 1) + var18, (double)(var3 + 1) + var18, (double)(var4 + 1) - var20, var9, var13);
         var5.a((double)(var2 + 1) + var18, (double)(var3 + 0) - var18, (double)(var4 + 1) - var20, var9, var15);
         var5.a((double)(var2 + 0) - var18, (double)(var3 + 0) - var18, (double)(var4 + 1) - var20, var11, var15);
         var5.a((double)(var2 + 0) - var18, (double)(var3 + 1) + var18, (double)(var4 + 1) - var20, var11, var13);
      }

      return true;
   }

   public boolean i(pb var1, int var2, int var3, int var4) {
      Tessalator var5 = Tessalator.a;
      int var6 = var1.a_(0);
      if(this.d >= 0) {
         var6 = this.d;
      }

      float var7 = 1.0F;
      var5.b(var1.d(this.a, var2, var3, var4));
      int var8 = var1.c(this.a, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      var5.a(var7 * var9, var7 * var10, var7 * var11);
      var8 = (var6 & 15) << 4;
      int var21 = var6 & 240;
      double var22 = (double)((float)var8 / 256.0F);
      double var12 = (double)(((float)var8 + 15.99F) / 256.0F);
      double var14 = (double)((float)var21 / 256.0F);
      double var16 = (double)(((float)var21 + 15.99F) / 256.0F);
      double var18 = 0.05000000074505806D;
      int var20 = this.a.e(var2, var3, var4);
      if((var20 & 2) != 0) {
         var5.a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 1), var22, var14);
         var5.a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 1), var22, var16);
         var5.a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 0), var12, var16);
         var5.a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 0), var12, var14);
         var5.a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 0), var12, var14);
         var5.a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 0), var12, var16);
         var5.a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 1), var22, var16);
         var5.a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 1), var22, var14);
      }

      if((var20 & 8) != 0) {
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 1), var12, var16);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 1), var12, var14);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 0), var22, var14);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 0), var22, var16);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 0), var22, var16);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 0), var22, var14);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 1), var12, var14);
         var5.a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 1), var12, var16);
      }

      if((var20 & 4) != 0) {
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + var18, var12, var16);
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)var4 + var18, var12, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)var4 + var18, var22, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + var18, var22, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + var18, var22, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)var4 + var18, var22, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)var4 + var18, var12, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + var18, var12, var16);
      }

      if((var20 & 1) != 0) {
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1) - var18, var22, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - var18, var22, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - var18, var12, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)(var4 + 1) - var18, var12, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 1), (double)(var4 + 1) - var18, var12, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - var18, var12, var16);
         var5.a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - var18, var22, var16);
         var5.a((double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1) - var18, var22, var14);
      }

      if(this.a.h(var2, var3 + 1, var4)) {
         var5.a((double)(var2 + 1), (double)(var3 + 1) - var18, (double)(var4 + 0), var22, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 1) - var18, (double)(var4 + 1), var22, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 1) - var18, (double)(var4 + 1), var12, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 1) - var18, (double)(var4 + 0), var12, var14);
      }

      return true;
   }

   public boolean a(akq var1, int var2, int var3, int var4) {
      int var5 = this.a.b();
      Tessalator var6 = Tessalator.a;
      var6.b(var1.d(this.a, var2, var3, var4));
      float var7 = 1.0F;
      int var8 = var1.c(this.a, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      if(lr.a) {
         float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = var13;
         var11 = var14;
      }

      var6.a(var7 * var9, var7 * var10, var7 * var11);
      boolean var64 = false;
      boolean var66 = false;
      int var65;
      int var67;
      int var68;
      if(this.d >= 0) {
         var65 = this.d;
         var67 = this.d;
      } else {
         var68 = this.a.e(var2, var3, var4);
         var65 = var1.a(0, var68);
         var67 = var1.v();
      }

      var68 = (var65 & 15) << 4;
      int var15 = var65 & 240;
      double var16 = (double)((float)var68 / 256.0F);
      double var18 = (double)(((float)var68 + 7.99F) / 256.0F);
      double var20 = (double)(((float)var68 + 15.99F) / 256.0F);
      double var22 = (double)((float)var15 / 256.0F);
      double var24 = (double)(((float)var15 + 15.99F) / 256.0F);
      int var26 = (var67 & 15) << 4;
      int var27 = var67 & 240;
      double var28 = (double)((float)(var26 + 7) / 256.0F);
      double var30 = (double)(((float)var26 + 8.99F) / 256.0F);
      double var32 = (double)((float)var27 / 256.0F);
      double var34 = (double)((float)(var27 + 8) / 256.0F);
      double var36 = (double)(((float)var27 + 15.99F) / 256.0F);
      double var38 = (double)var2;
      double var40 = (double)var2 + 0.5D;
      double var42 = (double)(var2 + 1);
      double var44 = (double)var4;
      double var46 = (double)var4 + 0.5D;
      double var48 = (double)(var4 + 1);
      double var50 = (double)var2 + 0.5D - 0.0625D;
      double var52 = (double)var2 + 0.5D + 0.0625D;
      double var54 = (double)var4 + 0.5D - 0.0625D;
      double var56 = (double)var4 + 0.5D + 0.0625D;
      boolean var58 = var1.e(this.a.a(var2, var3, var4 - 1));
      boolean var59 = var1.e(this.a.a(var2, var3, var4 + 1));
      boolean var60 = var1.e(this.a.a(var2 - 1, var3, var4));
      boolean var61 = var1.e(this.a.a(var2 + 1, var3, var4));
      boolean var62 = var1.a(this.a, var2, var3 + 1, var4, 1);
      boolean var63 = var1.a(this.a, var2, var3 - 1, var4, 0);
      if((!var60 || !var61) && (var60 || var61 || var58 || var59)) {
         if(var60 && !var61) {
            var6.a(var38, (double)(var3 + 1), var46, var16, var22);
            var6.a(var38, (double)(var3 + 0), var46, var16, var24);
            var6.a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.a(var40, (double)(var3 + 1), var46, var16, var22);
            var6.a(var40, (double)(var3 + 0), var46, var16, var24);
            var6.a(var38, (double)(var3 + 0), var46, var18, var24);
            var6.a(var38, (double)(var3 + 1), var46, var18, var22);
            if(!var59 && !var58) {
               var6.a(var40, (double)(var3 + 1), var56, var28, var32);
               var6.a(var40, (double)(var3 + 0), var56, var28, var36);
               var6.a(var40, (double)(var3 + 0), var54, var30, var36);
               var6.a(var40, (double)(var3 + 1), var54, var30, var32);
               var6.a(var40, (double)(var3 + 1), var54, var28, var32);
               var6.a(var40, (double)(var3 + 0), var54, var28, var36);
               var6.a(var40, (double)(var3 + 0), var56, var30, var36);
               var6.a(var40, (double)(var3 + 1), var56, var30, var32);
            }

            if(var62 || var3 < var5 - 1 && this.a.i(var2 - 1, var3 + 1, var4)) {
               var6.a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var36);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var36);
               var6.a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var36);
               var6.a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var36);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var34);
            }

            if(var63 || var3 > 1 && this.a.i(var2 - 1, var3 - 1, var4)) {
               var6.a(var38, (double)var3 - 0.01D, var56, var30, var34);
               var6.a(var40, (double)var3 - 0.01D, var56, var30, var36);
               var6.a(var40, (double)var3 - 0.01D, var54, var28, var36);
               var6.a(var38, (double)var3 - 0.01D, var54, var28, var34);
               var6.a(var40, (double)var3 - 0.01D, var56, var30, var34);
               var6.a(var38, (double)var3 - 0.01D, var56, var30, var36);
               var6.a(var38, (double)var3 - 0.01D, var54, var28, var36);
               var6.a(var40, (double)var3 - 0.01D, var54, var28, var34);
            }
         } else if(!var60 && var61) {
            var6.a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.a(var42, (double)(var3 + 0), var46, var20, var24);
            var6.a(var42, (double)(var3 + 1), var46, var20, var22);
            var6.a(var42, (double)(var3 + 1), var46, var18, var22);
            var6.a(var42, (double)(var3 + 0), var46, var18, var24);
            var6.a(var40, (double)(var3 + 0), var46, var20, var24);
            var6.a(var40, (double)(var3 + 1), var46, var20, var22);
            if(!var59 && !var58) {
               var6.a(var40, (double)(var3 + 1), var54, var28, var32);
               var6.a(var40, (double)(var3 + 0), var54, var28, var36);
               var6.a(var40, (double)(var3 + 0), var56, var30, var36);
               var6.a(var40, (double)(var3 + 1), var56, var30, var32);
               var6.a(var40, (double)(var3 + 1), var56, var28, var32);
               var6.a(var40, (double)(var3 + 0), var56, var28, var36);
               var6.a(var40, (double)(var3 + 0), var54, var30, var36);
               var6.a(var40, (double)(var3 + 1), var54, var30, var32);
            }

            if(var62 || var3 < var5 - 1 && this.a.i(var2 + 1, var3 + 1, var4)) {
               var6.a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var32);
               var6.a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var32);
               var6.a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var32);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var32);
            }

            if(var63 || var3 > 1 && this.a.i(var2 + 1, var3 - 1, var4)) {
               var6.a(var40, (double)var3 - 0.01D, var56, var30, var32);
               var6.a(var42, (double)var3 - 0.01D, var56, var30, var34);
               var6.a(var42, (double)var3 - 0.01D, var54, var28, var34);
               var6.a(var40, (double)var3 - 0.01D, var54, var28, var32);
               var6.a(var42, (double)var3 - 0.01D, var56, var30, var32);
               var6.a(var40, (double)var3 - 0.01D, var56, var30, var34);
               var6.a(var40, (double)var3 - 0.01D, var54, var28, var34);
               var6.a(var42, (double)var3 - 0.01D, var54, var28, var32);
            }
         }
      } else {
         var6.a(var38, (double)(var3 + 1), var46, var16, var22);
         var6.a(var38, (double)(var3 + 0), var46, var16, var24);
         var6.a(var42, (double)(var3 + 0), var46, var20, var24);
         var6.a(var42, (double)(var3 + 1), var46, var20, var22);
         var6.a(var42, (double)(var3 + 1), var46, var16, var22);
         var6.a(var42, (double)(var3 + 0), var46, var16, var24);
         var6.a(var38, (double)(var3 + 0), var46, var20, var24);
         var6.a(var38, (double)(var3 + 1), var46, var20, var22);
         if(var62) {
            var6.a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var36);
            var6.a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var32);
            var6.a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var32);
            var6.a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var36);
            var6.a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var36);
            var6.a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var32);
            var6.a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var32);
            var6.a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var36);
         } else {
            if(var3 < var5 - 1 && this.a.i(var2 - 1, var3 + 1, var4)) {
               var6.a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var36);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var36);
               var6.a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var36);
               var6.a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var36);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var34);
            }

            if(var3 < var5 - 1 && this.a.i(var2 + 1, var3 + 1, var4)) {
               var6.a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var32);
               var6.a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var32);
               var6.a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var32);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var32);
            }
         }

         if(var63) {
            var6.a(var38, (double)var3 - 0.01D, var56, var30, var36);
            var6.a(var42, (double)var3 - 0.01D, var56, var30, var32);
            var6.a(var42, (double)var3 - 0.01D, var54, var28, var32);
            var6.a(var38, (double)var3 - 0.01D, var54, var28, var36);
            var6.a(var42, (double)var3 - 0.01D, var56, var30, var36);
            var6.a(var38, (double)var3 - 0.01D, var56, var30, var32);
            var6.a(var38, (double)var3 - 0.01D, var54, var28, var32);
            var6.a(var42, (double)var3 - 0.01D, var54, var28, var36);
         } else {
            if(var3 > 1 && this.a.i(var2 - 1, var3 - 1, var4)) {
               var6.a(var38, (double)var3 - 0.01D, var56, var30, var34);
               var6.a(var40, (double)var3 - 0.01D, var56, var30, var36);
               var6.a(var40, (double)var3 - 0.01D, var54, var28, var36);
               var6.a(var38, (double)var3 - 0.01D, var54, var28, var34);
               var6.a(var40, (double)var3 - 0.01D, var56, var30, var34);
               var6.a(var38, (double)var3 - 0.01D, var56, var30, var36);
               var6.a(var38, (double)var3 - 0.01D, var54, var28, var36);
               var6.a(var40, (double)var3 - 0.01D, var54, var28, var34);
            }

            if(var3 > 1 && this.a.i(var2 + 1, var3 - 1, var4)) {
               var6.a(var40, (double)var3 - 0.01D, var56, var30, var32);
               var6.a(var42, (double)var3 - 0.01D, var56, var30, var34);
               var6.a(var42, (double)var3 - 0.01D, var54, var28, var34);
               var6.a(var40, (double)var3 - 0.01D, var54, var28, var32);
               var6.a(var42, (double)var3 - 0.01D, var56, var30, var32);
               var6.a(var40, (double)var3 - 0.01D, var56, var30, var34);
               var6.a(var40, (double)var3 - 0.01D, var54, var28, var34);
               var6.a(var42, (double)var3 - 0.01D, var54, var28, var32);
            }
         }
      }

      if((!var58 || !var59) && (var60 || var61 || var58 || var59)) {
         if(var58 && !var59) {
            var6.a(var40, (double)(var3 + 1), var44, var16, var22);
            var6.a(var40, (double)(var3 + 0), var44, var16, var24);
            var6.a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.a(var40, (double)(var3 + 1), var46, var16, var22);
            var6.a(var40, (double)(var3 + 0), var46, var16, var24);
            var6.a(var40, (double)(var3 + 0), var44, var18, var24);
            var6.a(var40, (double)(var3 + 1), var44, var18, var22);
            if(!var61 && !var60) {
               var6.a(var50, (double)(var3 + 1), var46, var28, var32);
               var6.a(var50, (double)(var3 + 0), var46, var28, var36);
               var6.a(var52, (double)(var3 + 0), var46, var30, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var32);
               var6.a(var52, (double)(var3 + 1), var46, var28, var32);
               var6.a(var52, (double)(var3 + 0), var46, var28, var36);
               var6.a(var50, (double)(var3 + 0), var46, var30, var36);
               var6.a(var50, (double)(var3 + 1), var46, var30, var32);
            }

            if(var62 || var3 < var5 - 1 && this.a.i(var2, var3 + 1, var4 - 1)) {
               var6.a(var50, (double)(var3 + 1), var44, var30, var32);
               var6.a(var50, (double)(var3 + 1), var46, var30, var34);
               var6.a(var52, (double)(var3 + 1), var46, var28, var34);
               var6.a(var52, (double)(var3 + 1), var44, var28, var32);
               var6.a(var50, (double)(var3 + 1), var46, var30, var32);
               var6.a(var50, (double)(var3 + 1), var44, var30, var34);
               var6.a(var52, (double)(var3 + 1), var44, var28, var34);
               var6.a(var52, (double)(var3 + 1), var46, var28, var32);
            }

            if(var63 || var3 > 1 && this.a.i(var2, var3 - 1, var4 - 1)) {
               var6.a(var50, (double)var3, var44, var30, var32);
               var6.a(var50, (double)var3, var46, var30, var34);
               var6.a(var52, (double)var3, var46, var28, var34);
               var6.a(var52, (double)var3, var44, var28, var32);
               var6.a(var50, (double)var3, var46, var30, var32);
               var6.a(var50, (double)var3, var44, var30, var34);
               var6.a(var52, (double)var3, var44, var28, var34);
               var6.a(var52, (double)var3, var46, var28, var32);
            }
         } else if(!var58 && var59) {
            var6.a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.a(var40, (double)(var3 + 0), var48, var20, var24);
            var6.a(var40, (double)(var3 + 1), var48, var20, var22);
            var6.a(var40, (double)(var3 + 1), var48, var18, var22);
            var6.a(var40, (double)(var3 + 0), var48, var18, var24);
            var6.a(var40, (double)(var3 + 0), var46, var20, var24);
            var6.a(var40, (double)(var3 + 1), var46, var20, var22);
            if(!var61 && !var60) {
               var6.a(var52, (double)(var3 + 1), var46, var28, var32);
               var6.a(var52, (double)(var3 + 0), var46, var28, var36);
               var6.a(var50, (double)(var3 + 0), var46, var30, var36);
               var6.a(var50, (double)(var3 + 1), var46, var30, var32);
               var6.a(var50, (double)(var3 + 1), var46, var28, var32);
               var6.a(var50, (double)(var3 + 0), var46, var28, var36);
               var6.a(var52, (double)(var3 + 0), var46, var30, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var32);
            }

            if(var62 || var3 < var5 - 1 && this.a.i(var2, var3 + 1, var4 + 1)) {
               var6.a(var50, (double)(var3 + 1), var46, var28, var34);
               var6.a(var50, (double)(var3 + 1), var48, var28, var36);
               var6.a(var52, (double)(var3 + 1), var48, var30, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var34);
               var6.a(var50, (double)(var3 + 1), var48, var28, var34);
               var6.a(var50, (double)(var3 + 1), var46, var28, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var36);
               var6.a(var52, (double)(var3 + 1), var48, var30, var34);
            }

            if(var63 || var3 > 1 && this.a.i(var2, var3 - 1, var4 + 1)) {
               var6.a(var50, (double)var3, var46, var28, var34);
               var6.a(var50, (double)var3, var48, var28, var36);
               var6.a(var52, (double)var3, var48, var30, var36);
               var6.a(var52, (double)var3, var46, var30, var34);
               var6.a(var50, (double)var3, var48, var28, var34);
               var6.a(var50, (double)var3, var46, var28, var36);
               var6.a(var52, (double)var3, var46, var30, var36);
               var6.a(var52, (double)var3, var48, var30, var34);
            }
         }
      } else {
         var6.a(var40, (double)(var3 + 1), var48, var16, var22);
         var6.a(var40, (double)(var3 + 0), var48, var16, var24);
         var6.a(var40, (double)(var3 + 0), var44, var20, var24);
         var6.a(var40, (double)(var3 + 1), var44, var20, var22);
         var6.a(var40, (double)(var3 + 1), var44, var16, var22);
         var6.a(var40, (double)(var3 + 0), var44, var16, var24);
         var6.a(var40, (double)(var3 + 0), var48, var20, var24);
         var6.a(var40, (double)(var3 + 1), var48, var20, var22);
         if(var62) {
            var6.a(var52, (double)(var3 + 1), var48, var30, var36);
            var6.a(var52, (double)(var3 + 1), var44, var30, var32);
            var6.a(var50, (double)(var3 + 1), var44, var28, var32);
            var6.a(var50, (double)(var3 + 1), var48, var28, var36);
            var6.a(var52, (double)(var3 + 1), var44, var30, var36);
            var6.a(var52, (double)(var3 + 1), var48, var30, var32);
            var6.a(var50, (double)(var3 + 1), var48, var28, var32);
            var6.a(var50, (double)(var3 + 1), var44, var28, var36);
         } else {
            if(var3 < var5 - 1 && this.a.i(var2, var3 + 1, var4 - 1)) {
               var6.a(var50, (double)(var3 + 1), var44, var30, var32);
               var6.a(var50, (double)(var3 + 1), var46, var30, var34);
               var6.a(var52, (double)(var3 + 1), var46, var28, var34);
               var6.a(var52, (double)(var3 + 1), var44, var28, var32);
               var6.a(var50, (double)(var3 + 1), var46, var30, var32);
               var6.a(var50, (double)(var3 + 1), var44, var30, var34);
               var6.a(var52, (double)(var3 + 1), var44, var28, var34);
               var6.a(var52, (double)(var3 + 1), var46, var28, var32);
            }

            if(var3 < var5 - 1 && this.a.i(var2, var3 + 1, var4 + 1)) {
               var6.a(var50, (double)(var3 + 1), var46, var28, var34);
               var6.a(var50, (double)(var3 + 1), var48, var28, var36);
               var6.a(var52, (double)(var3 + 1), var48, var30, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var34);
               var6.a(var50, (double)(var3 + 1), var48, var28, var34);
               var6.a(var50, (double)(var3 + 1), var46, var28, var36);
               var6.a(var52, (double)(var3 + 1), var46, var30, var36);
               var6.a(var52, (double)(var3 + 1), var48, var30, var34);
            }
         }

         if(var63) {
            var6.a(var52, (double)var3, var48, var30, var36);
            var6.a(var52, (double)var3, var44, var30, var32);
            var6.a(var50, (double)var3, var44, var28, var32);
            var6.a(var50, (double)var3, var48, var28, var36);
            var6.a(var52, (double)var3, var44, var30, var36);
            var6.a(var52, (double)var3, var48, var30, var32);
            var6.a(var50, (double)var3, var48, var28, var32);
            var6.a(var50, (double)var3, var44, var28, var36);
         } else {
            if(var3 > 1 && this.a.i(var2, var3 - 1, var4 - 1)) {
               var6.a(var50, (double)var3, var44, var30, var32);
               var6.a(var50, (double)var3, var46, var30, var34);
               var6.a(var52, (double)var3, var46, var28, var34);
               var6.a(var52, (double)var3, var44, var28, var32);
               var6.a(var50, (double)var3, var46, var30, var32);
               var6.a(var50, (double)var3, var44, var30, var34);
               var6.a(var52, (double)var3, var44, var28, var34);
               var6.a(var52, (double)var3, var46, var28, var32);
            }

            if(var3 > 1 && this.a.i(var2, var3 - 1, var4 + 1)) {
               var6.a(var50, (double)var3, var46, var28, var34);
               var6.a(var50, (double)var3, var48, var28, var36);
               var6.a(var52, (double)var3, var48, var30, var36);
               var6.a(var52, (double)var3, var46, var30, var34);
               var6.a(var50, (double)var3, var48, var28, var34);
               var6.a(var50, (double)var3, var46, var28, var36);
               var6.a(var52, (double)var3, var46, var30, var36);
               var6.a(var52, (double)var3, var48, var30, var34);
            }
         }
      }

      return true;
   }

   public boolean j(pb var1, int var2, int var3, int var4) {
      Tessalator var5 = Tessalator.a;
      var5.b(var1.d(this.a, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.c(this.a, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if(lr.a) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.a(var6 * var8, var6 * var9, var6 * var10);
      double var19 = (double)var2;
      double var20 = (double)var3;
      double var15 = (double)var4;
      if(var1 == pb.X) {
         long var17 = (long)(var2 * 3129871) ^ (long)var4 * 116129781L ^ (long)var3;
         var17 = var17 * var17 * 42317861L + var17 * 11L;
         var19 += ((double)((float)(var17 >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D;
         var20 += ((double)((float)(var17 >> 20 & 15L) / 15.0F) - 1.0D) * 0.2D;
         var15 += ((double)((float)(var17 >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D;
      }

      this.a(var1, this.a.e(var2, var3, var4), var19, var20, var15);
      return true;
   }

   public boolean k(pb var1, int var2, int var3, int var4) {
      aei var5 = (aei)var1;
      Tessalator var6 = Tessalator.a;
      var6.b(var5.d(this.a, var2, var3, var4));
      float var7 = 1.0F;
      int var8 = var5.c(this.a, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      if(lr.a) {
         float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = var13;
         var11 = var14;
      }

      var6.a(var7 * var9, var7 * var10, var7 * var11);
      var5.a(this.a, var2, var3, var4);
      int var15 = var5.g(this.a, var2, var3, var4);
      if(var15 < 0) {
         this.a(var5, this.a.e(var2, var3, var4), var5.bZ, (double)var2, (double)var3, (double)var4);
      } else {
         this.a(var5, this.a.e(var2, var3, var4), 0.5D, (double)var2, (double)var3, (double)var4);
         this.a(var5, this.a.e(var2, var3, var4), var15, var5.bZ, (double)var2, (double)var3, (double)var4);
      }

      return true;
   }

   public boolean l(pb var1, int var2, int var3, int var4) {
      Tessalator var5 = Tessalator.a;
      var5.b(var1.d(this.a, var2, var3, var4));
      var5.a(1.0F, 1.0F, 1.0F);
      this.b(var1, this.a.e(var2, var3, var4), (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      return true;
   }

   public void a(pb var1, double var2, double var4, double var6, double var8, double var10) {
      Tessalator var12 = Tessalator.a;
      int var13 = var1.a_(0);
      if(this.d >= 0) {
         var13 = this.d;
      }

      int var14 = (var13 & 15) << 4;
      int var15 = var13 & 240;
      float var16 = (float)var14 / 256.0F;
      float var17 = ((float)var14 + 15.99F) / 256.0F;
      float var18 = (float)var15 / 256.0F;
      float var19 = ((float)var15 + 15.99F) / 256.0F;
      double var20 = (double)var16 + 0.02734375D;
      double var22 = (double)var18 + 0.0234375D;
      double var24 = (double)var16 + 0.03515625D;
      double var26 = (double)var18 + 0.03125D;
      var2 += 0.5D;
      var6 += 0.5D;
      double var28 = var2 - 0.5D;
      double var30 = var2 + 0.5D;
      double var32 = var6 - 0.5D;
      double var34 = var6 + 0.5D;
      double var36 = 0.0625D;
      double var38 = 0.625D;
      var12.a(var2 + var8 * (1.0D - var38) - var36, var4 + var38, var6 + var10 * (1.0D - var38) - var36, var20, var22);
      var12.a(var2 + var8 * (1.0D - var38) - var36, var4 + var38, var6 + var10 * (1.0D - var38) + var36, var20, var26);
      var12.a(var2 + var8 * (1.0D - var38) + var36, var4 + var38, var6 + var10 * (1.0D - var38) + var36, var24, var26);
      var12.a(var2 + var8 * (1.0D - var38) + var36, var4 + var38, var6 + var10 * (1.0D - var38) - var36, var24, var22);
      var12.a(var2 - var36, var4 + 1.0D, var32, (double)var16, (double)var18);
      var12.a(var2 - var36 + var8, var4 + 0.0D, var32 + var10, (double)var16, (double)var19);
      var12.a(var2 - var36 + var8, var4 + 0.0D, var34 + var10, (double)var17, (double)var19);
      var12.a(var2 - var36, var4 + 1.0D, var34, (double)var17, (double)var18);
      var12.a(var2 + var36, var4 + 1.0D, var34, (double)var16, (double)var18);
      var12.a(var2 + var8 + var36, var4 + 0.0D, var34 + var10, (double)var16, (double)var19);
      var12.a(var2 + var8 + var36, var4 + 0.0D, var32 + var10, (double)var17, (double)var19);
      var12.a(var2 + var36, var4 + 1.0D, var32, (double)var17, (double)var18);
      var12.a(var28, var4 + 1.0D, var6 + var36, (double)var16, (double)var18);
      var12.a(var28 + var8, var4 + 0.0D, var6 + var36 + var10, (double)var16, (double)var19);
      var12.a(var30 + var8, var4 + 0.0D, var6 + var36 + var10, (double)var17, (double)var19);
      var12.a(var30, var4 + 1.0D, var6 + var36, (double)var17, (double)var18);
      var12.a(var30, var4 + 1.0D, var6 - var36, (double)var16, (double)var18);
      var12.a(var30 + var8, var4 + 0.0D, var6 - var36 + var10, (double)var16, (double)var19);
      var12.a(var28 + var8, var4 + 0.0D, var6 - var36 + var10, (double)var17, (double)var19);
      var12.a(var28, var4 + 1.0D, var6 - var36, (double)var17, (double)var18);
   }

   public void a(pb var1, int var2, double var3, double var5, double var7) {
      Tessalator var9 = Tessalator.a;
      int var10 = var1.a(0, var2);
      if(this.d >= 0) {
         var10 = this.d;
      }

      int var11 = (var10 & 15) << 4;
      int var12 = var10 & 240;
      double var13 = (double)((float)var11 / 256.0F);
      double var15 = (double)(((float)var11 + 15.99F) / 256.0F);
      double var17 = (double)((float)var12 / 256.0F);
      double var19 = (double)(((float)var12 + 15.99F) / 256.0F);
      double var21 = var3 + 0.5D - 0.45D;
      double var23 = var3 + 0.5D + 0.45D;
      double var25 = var7 + 0.5D - 0.45D;
      double var27 = var7 + 0.5D + 0.45D;
      var9.a(var21, var5 + 1.0D, var25, var13, var17);
      var9.a(var21, var5 + 0.0D, var25, var13, var19);
      var9.a(var23, var5 + 0.0D, var27, var15, var19);
      var9.a(var23, var5 + 1.0D, var27, var15, var17);
      var9.a(var23, var5 + 1.0D, var27, var13, var17);
      var9.a(var23, var5 + 0.0D, var27, var13, var19);
      var9.a(var21, var5 + 0.0D, var25, var15, var19);
      var9.a(var21, var5 + 1.0D, var25, var15, var17);
      var9.a(var21, var5 + 1.0D, var27, var13, var17);
      var9.a(var21, var5 + 0.0D, var27, var13, var19);
      var9.a(var23, var5 + 0.0D, var25, var15, var19);
      var9.a(var23, var5 + 1.0D, var25, var15, var17);
      var9.a(var23, var5 + 1.0D, var25, var13, var17);
      var9.a(var23, var5 + 0.0D, var25, var13, var19);
      var9.a(var21, var5 + 0.0D, var27, var15, var19);
      var9.a(var21, var5 + 1.0D, var27, var15, var17);
   }

   public void a(pb var1, int var2, double var3, double var5, double var7, double var9) {
      Tessalator var11 = Tessalator.a;
      int var12 = var1.a(0, var2);
      if(this.d >= 0) {
         var12 = this.d;
      }

      int var13 = (var12 & 15) << 4;
      int var14 = var12 & 240;
      double var15 = (double)((float)var13 / 256.0F);
      double var17 = (double)(((float)var13 + 15.99F) / 256.0F);
      double var19 = (double)((float)var14 / 256.0F);
      double var21 = ((double)var14 + 15.989999771118164D * var3) / 256.0D;
      double var23 = var5 + 0.5D - 0.44999998807907104D;
      double var25 = var5 + 0.5D + 0.44999998807907104D;
      double var27 = var9 + 0.5D - 0.44999998807907104D;
      double var29 = var9 + 0.5D + 0.44999998807907104D;
      var11.a(var23, var7 + var3, var27, var15, var19);
      var11.a(var23, var7 + 0.0D, var27, var15, var21);
      var11.a(var25, var7 + 0.0D, var29, var17, var21);
      var11.a(var25, var7 + var3, var29, var17, var19);
      var11.a(var25, var7 + var3, var29, var15, var19);
      var11.a(var25, var7 + 0.0D, var29, var15, var21);
      var11.a(var23, var7 + 0.0D, var27, var17, var21);
      var11.a(var23, var7 + var3, var27, var17, var19);
      var11.a(var23, var7 + var3, var29, var15, var19);
      var11.a(var23, var7 + 0.0D, var29, var15, var21);
      var11.a(var25, var7 + 0.0D, var27, var17, var21);
      var11.a(var25, var7 + var3, var27, var17, var19);
      var11.a(var25, var7 + var3, var27, var15, var19);
      var11.a(var25, var7 + 0.0D, var27, var15, var21);
      var11.a(var23, var7 + 0.0D, var29, var17, var21);
      var11.a(var23, var7 + var3, var29, var17, var19);
   }

   public boolean m(pb var1, int var2, int var3, int var4) {
      Tessalator var5 = Tessalator.a;
      int var6 = var1.bN;
      if(this.d >= 0) {
         var6 = this.d;
      }

      int var7 = (var6 & 15) << 4;
      int var8 = var6 & 240;
      float var9 = 0.015625F;
      double var10 = (double)((float)var7 / 256.0F);
      double var12 = (double)(((float)var7 + 15.99F) / 256.0F);
      double var14 = (double)((float)var8 / 256.0F);
      double var16 = (double)(((float)var8 + 15.99F) / 256.0F);
      long var18 = (long)(var2 * 3129871) ^ (long)var4 * 116129781L ^ (long)var3;
      var18 = var18 * var18 * 42317861L + var18 * 11L;
      int var20 = (int)(var18 >> 16 & 3L);
      var5.b(var1.d(this.a, var2, var3, var4));
      float var21 = (float)var2 + 0.5F;
      float var22 = (float)var4 + 0.5F;
      float var23 = (float)(var20 & 1) * 0.5F * (float)(1 - var20 / 2 % 2 * 2);
      float var24 = (float)(var20 + 1 & 1) * 0.5F * (float)(1 - (var20 + 1) / 2 % 2 * 2);
      var5.c(var1.i());
      var5.a((double)(var21 + var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 + var24), var10, var14);
      var5.a((double)(var21 + var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 + var24), var12, var14);
      var5.a((double)(var21 - var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 - var24), var12, var16);
      var5.a((double)(var21 - var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 - var24), var10, var16);
      var5.c((var1.i() & 16711422) >> 1);
      var5.a((double)(var21 - var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 - var24), var10, var16);
      var5.a((double)(var21 - var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 - var24), var12, var16);
      var5.a((double)(var21 + var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 + var24), var12, var14);
      var5.a((double)(var21 + var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 + var24), var10, var14);
      return true;
   }

   public void a(pb var1, int var2, int var3, double var4, double var6, double var8, double var10) {
      Tessalator var12 = Tessalator.a;
      int var13 = var1.a(0, var2) + 16;
      if(this.d >= 0) {
         var13 = this.d;
      }

      int var14 = (var13 & 15) << 4;
      int var15 = var13 & 240;
      double var16 = (double)((float)var14 / 256.0F);
      double var18 = (double)(((float)var14 + 15.99F) / 256.0F);
      double var20 = (double)((float)var15 / 256.0F);
      double var22 = ((double)var15 + 15.989999771118164D * var4) / 256.0D;
      double var24 = var6 + 0.5D - 0.5D;
      double var26 = var6 + 0.5D + 0.5D;
      double var28 = var10 + 0.5D - 0.5D;
      double var30 = var10 + 0.5D + 0.5D;
      double var32 = var6 + 0.5D;
      double var34 = var10 + 0.5D;
      if((var3 + 1) / 2 % 2 == 1) {
         double var36 = var18;
         var18 = var16;
         var16 = var36;
      }

      if(var3 < 2) {
         var12.a(var24, var8 + var4, var34, var16, var20);
         var12.a(var24, var8 + 0.0D, var34, var16, var22);
         var12.a(var26, var8 + 0.0D, var34, var18, var22);
         var12.a(var26, var8 + var4, var34, var18, var20);
         var12.a(var26, var8 + var4, var34, var18, var20);
         var12.a(var26, var8 + 0.0D, var34, var18, var22);
         var12.a(var24, var8 + 0.0D, var34, var16, var22);
         var12.a(var24, var8 + var4, var34, var16, var20);
      } else {
         var12.a(var32, var8 + var4, var30, var16, var20);
         var12.a(var32, var8 + 0.0D, var30, var16, var22);
         var12.a(var32, var8 + 0.0D, var28, var18, var22);
         var12.a(var32, var8 + var4, var28, var18, var20);
         var12.a(var32, var8 + var4, var28, var18, var20);
         var12.a(var32, var8 + 0.0D, var28, var18, var22);
         var12.a(var32, var8 + 0.0D, var30, var16, var22);
         var12.a(var32, var8 + var4, var30, var16, var20);
      }

   }

   public void b(pb var1, int var2, double var3, double var5, double var7) {
      Tessalator var9 = Tessalator.a;
      int var10 = var1.a(0, var2);
      if(this.d >= 0) {
         var10 = this.d;
      }

      int var11 = (var10 & 15) << 4;
      int var12 = var10 & 240;
      double var13 = (double)((float)var11 / 256.0F);
      double var15 = (double)(((float)var11 + 15.99F) / 256.0F);
      double var17 = (double)((float)var12 / 256.0F);
      double var19 = (double)(((float)var12 + 15.99F) / 256.0F);
      double var21 = var3 + 0.5D - 0.25D;
      double var23 = var3 + 0.5D + 0.25D;
      double var25 = var7 + 0.5D - 0.5D;
      double var27 = var7 + 0.5D + 0.5D;
      var9.a(var21, var5 + 1.0D, var25, var13, var17);
      var9.a(var21, var5 + 0.0D, var25, var13, var19);
      var9.a(var21, var5 + 0.0D, var27, var15, var19);
      var9.a(var21, var5 + 1.0D, var27, var15, var17);
      var9.a(var21, var5 + 1.0D, var27, var13, var17);
      var9.a(var21, var5 + 0.0D, var27, var13, var19);
      var9.a(var21, var5 + 0.0D, var25, var15, var19);
      var9.a(var21, var5 + 1.0D, var25, var15, var17);
      var9.a(var23, var5 + 1.0D, var27, var13, var17);
      var9.a(var23, var5 + 0.0D, var27, var13, var19);
      var9.a(var23, var5 + 0.0D, var25, var15, var19);
      var9.a(var23, var5 + 1.0D, var25, var15, var17);
      var9.a(var23, var5 + 1.0D, var25, var13, var17);
      var9.a(var23, var5 + 0.0D, var25, var13, var19);
      var9.a(var23, var5 + 0.0D, var27, var15, var19);
      var9.a(var23, var5 + 1.0D, var27, var15, var17);
      var21 = var3 + 0.5D - 0.5D;
      var23 = var3 + 0.5D + 0.5D;
      var25 = var7 + 0.5D - 0.25D;
      var27 = var7 + 0.5D + 0.25D;
      var9.a(var21, var5 + 1.0D, var25, var13, var17);
      var9.a(var21, var5 + 0.0D, var25, var13, var19);
      var9.a(var23, var5 + 0.0D, var25, var15, var19);
      var9.a(var23, var5 + 1.0D, var25, var15, var17);
      var9.a(var23, var5 + 1.0D, var25, var13, var17);
      var9.a(var23, var5 + 0.0D, var25, var13, var19);
      var9.a(var21, var5 + 0.0D, var25, var15, var19);
      var9.a(var21, var5 + 1.0D, var25, var15, var17);
      var9.a(var23, var5 + 1.0D, var27, var13, var17);
      var9.a(var23, var5 + 0.0D, var27, var13, var19);
      var9.a(var21, var5 + 0.0D, var27, var15, var19);
      var9.a(var21, var5 + 1.0D, var27, var15, var17);
      var9.a(var21, var5 + 1.0D, var27, var13, var17);
      var9.a(var21, var5 + 0.0D, var27, var13, var19);
      var9.a(var23, var5 + 0.0D, var27, var15, var19);
      var9.a(var23, var5 + 1.0D, var27, var15, var17);
   }

   public boolean n(pb var1, int var2, int var3, int var4) {
      Tessalator var5 = Tessalator.a;
      int var6 = var1.c(this.a, var2, var3, var4);
      float var7 = (float)(var6 >> 16 & 255) / 255.0F;
      float var8 = (float)(var6 >> 8 & 255) / 255.0F;
      float var9 = (float)(var6 & 255) / 255.0F;
      boolean var10 = var1.a(this.a, var2, var3 + 1, var4, 1);
      boolean var11 = var1.a(this.a, var2, var3 - 1, var4, 0);
      boolean[] var12 = new boolean[]{var1.a(this.a, var2, var3, var4 - 1, 2), var1.a(this.a, var2, var3, var4 + 1, 3), var1.a(this.a, var2 - 1, var3, var4, 4), var1.a(this.a, var2 + 1, var3, var4, 5)};
      if(!var10 && !var11 && !var12[0] && !var12[1] && !var12[2] && !var12[3]) {
         return false;
      } else {
         boolean var13 = false;
         float var14 = 0.5F;
         float var15 = 1.0F;
         float var16 = 0.8F;
         float var17 = 0.6F;
         double var18 = 0.0D;
         double var20 = 1.0D;
         acn var22 = var1.cd;
         int var23 = this.a.e(var2, var3, var4);
         double var24 = (double)this.a(var2, var3, var4, var22);
         double var26 = (double)this.a(var2, var3, var4 + 1, var22);
         double var28 = (double)this.a(var2 + 1, var3, var4 + 1, var22);
         double var30 = (double)this.a(var2 + 1, var3, var4, var22);
         double var32 = 0.0010000000474974513D;
         int var34;
         int var37;
         if(this.f || var10) {
            var13 = true;
            var34 = var1.a(1, var23);
            float var35 = (float)agv.a(this.a, var2, var3, var4, var22);
            if(var35 > -999.0F) {
               var34 = var1.a(2, var23);
            }

            var24 -= var32;
            var26 -= var32;
            var28 -= var32;
            var30 -= var32;
            int var36 = (var34 & 15) << 4;
            var37 = var34 & 240;
            double var38 = ((double)var36 + 8.0D) / 256.0D;
            double var40 = ((double)var37 + 8.0D) / 256.0D;
            if(var35 < -999.0F) {
               var35 = 0.0F;
            } else {
               var38 = (double)((float)(var36 + 16) / 256.0F);
               var40 = (double)((float)(var37 + 16) / 256.0F);
            }

            double var42 = (double)(Utils.sin(var35) * 8.0F) / 256.0D;
            double var44 = (double)(Utils.cos(var35) * 8.0F) / 256.0D;
            var5.b(var1.d(this.a, var2, var3, var4));
            float var46 = 1.0F;
            var5.a(var15 * var46 * var7, var15 * var46 * var8, var15 * var46 * var9);
            var5.a((double)(var2 + 0), (double)var3 + var24, (double)(var4 + 0), var38 - var44 - var42, var40 - var44 + var42);
            var5.a((double)(var2 + 0), (double)var3 + var26, (double)(var4 + 1), var38 - var44 + var42, var40 + var44 + var42);
            var5.a((double)(var2 + 1), (double)var3 + var28, (double)(var4 + 1), var38 + var44 + var42, var40 + var44 - var42);
            var5.a((double)(var2 + 1), (double)var3 + var30, (double)(var4 + 0), var38 + var44 - var42, var40 - var44 - var42);
         }

         if(this.f || var11) {
            var5.b(var1.d(this.a, var2, var3 - 1, var4));
            float var64 = 1.0F;
            var5.a(var14 * var64, var14 * var64, var14 * var64);
            this.a(var1, (double)var2, (double)var3 + var32, (double)var4, var1.a_(0));
            var13 = true;
         }

         for(var34 = 0; var34 < 4; ++var34) {
            int var65 = var2;
            var37 = var4;
            if(var34 == 0) {
               var37 = var4 - 1;
            }

            if(var34 == 1) {
               ++var37;
            }

            if(var34 == 2) {
               var65 = var2 - 1;
            }

            if(var34 == 3) {
               ++var65;
            }

            int var66 = var1.a(var34 + 2, var23);
            int var39 = (var66 & 15) << 4;
            int var67 = var66 & 240;
            if(this.f || var12[var34]) {
               double var41;
               double var43;
               double var45;
               double var47;
               double var49;
               double var51;
               if(var34 == 0) {
                  var41 = var24;
                  var43 = var30;
                  var45 = (double)var2;
                  var49 = (double)(var2 + 1);
                  var47 = (double)var4 + var32;
                  var51 = (double)var4 + var32;
               } else if(var34 == 1) {
                  var41 = var28;
                  var43 = var26;
                  var45 = (double)(var2 + 1);
                  var49 = (double)var2;
                  var47 = (double)(var4 + 1) - var32;
                  var51 = (double)(var4 + 1) - var32;
               } else if(var34 == 2) {
                  var41 = var26;
                  var43 = var24;
                  var45 = (double)var2 + var32;
                  var49 = (double)var2 + var32;
                  var47 = (double)(var4 + 1);
                  var51 = (double)var4;
               } else {
                  var41 = var30;
                  var43 = var28;
                  var45 = (double)(var2 + 1) - var32;
                  var49 = (double)(var2 + 1) - var32;
                  var47 = (double)var4;
                  var51 = (double)(var4 + 1);
               }

               var13 = true;
               double var53 = (double)((float)(var39 + 0) / 256.0F);
               double var55 = ((double)(var39 + 16) - 0.01D) / 256.0D;
               double var57 = ((double)var67 + (1.0D - var41) * 16.0D) / 256.0D;
               double var59 = ((double)var67 + (1.0D - var43) * 16.0D) / 256.0D;
               double var61 = ((double)(var67 + 16) - 0.01D) / 256.0D;
               var5.b(var1.d(this.a, var65, var3, var37));
               float var63 = 1.0F;
               if(var34 < 2) {
                  var63 *= var16;
               } else {
                  var63 *= var17;
               }

               var5.a(var15 * var63 * var7, var15 * var63 * var8, var15 * var63 * var9);
               var5.a(var45, (double)var3 + var41, var47, var53, var57);
               var5.a(var49, (double)var3 + var43, var51, var55, var59);
               var5.a(var49, (double)(var3 + 0), var51, var55, var61);
               var5.a(var45, (double)(var3 + 0), var47, var53, var61);
            }
         }

         var1.bW = var18;
         var1.bZ = var20;
         return var13;
      }
   }

   private float a(int var1, int var2, int var3, acn var4) {
      int var5 = 0;
      float var6 = 0.0F;

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var1 - (var7 & 1);
         int var10 = var3 - (var7 >> 1 & 1);
         if(this.a.f(var8, var2 + 1, var10) == var4) {
            return 1.0F;
         }

         acn var11 = this.a.f(var8, var2, var10);
         if(var11 == var4) {
            int var12 = this.a.e(var8, var2, var10);
            if(var12 >= 8 || var12 == 0) {
               var6 += agv.e(var12) * 10.0F;
               var5 += 10;
            }

            var6 += agv.e(var12);
            ++var5;
         } else if(!var11.a()) {
            ++var6;
            ++var5;
         }
      }

      return 1.0F - var6 / (float)var5;
   }

   public void a(pb var1, World var2, int var3, int var4, int var5) {
      float var6 = 0.5F;
      float var7 = 1.0F;
      float var8 = 0.8F;
      float var9 = 0.6F;
      Tessalator var10 = Tessalator.a;
      var10.b();
      var10.b(var1.d((WorldInterface)var2, var3, var4, var5));
      float var11 = 1.0F;
      float var12 = 1.0F;
      if(var12 < var11) {
         var12 = var11;
      }

      var10.a(var6 * var12, var6 * var12, var6 * var12);
      this.a(var1, -0.5D, -0.5D, -0.5D, var1.a_(0));
      var12 = 1.0F;
      if(var12 < var11) {
         var12 = var11;
      }

      var10.a(var7 * var12, var7 * var12, var7 * var12);
      this.b(var1, -0.5D, -0.5D, -0.5D, var1.a_(1));
      var12 = 1.0F;
      if(var12 < var11) {
         var12 = var11;
      }

      var10.a(var8 * var12, var8 * var12, var8 * var12);
      this.c(var1, -0.5D, -0.5D, -0.5D, var1.a_(2));
      var12 = 1.0F;
      if(var12 < var11) {
         var12 = var11;
      }

      var10.a(var8 * var12, var8 * var12, var8 * var12);
      this.d(var1, -0.5D, -0.5D, -0.5D, var1.a_(3));
      var12 = 1.0F;
      if(var12 < var11) {
         var12 = var11;
      }

      var10.a(var9 * var12, var9 * var12, var9 * var12);
      this.e(var1, -0.5D, -0.5D, -0.5D, var1.a_(4));
      var12 = 1.0F;
      if(var12 < var11) {
         var12 = var11;
      }

      var10.a(var9 * var12, var9 * var12, var9 * var12);
      this.f(var1, -0.5D, -0.5D, -0.5D, var1.a_(5));
      var10.a();
   }

   public boolean o(pb var1, int var2, int var3, int var4) {
      int var5 = var1.c(this.a, var2, var3, var4);
      float var6 = (float)(var5 >> 16 & 255) / 255.0F;
      float var7 = (float)(var5 >> 8 & 255) / 255.0F;
      float var8 = (float)(var5 & 255) / 255.0F;
      if(lr.a) {
         float var9 = (var6 * 30.0F + var7 * 59.0F + var8 * 11.0F) / 100.0F;
         float var10 = (var6 * 30.0F + var7 * 70.0F) / 100.0F;
         float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
         var6 = var9;
         var7 = var10;
         var8 = var11;
      }

      return Minecraft.t() && pb.q[var1.bO] == 0?this.a(var1, var2, var3, var4, var6, var7, var8):this.b(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean a(pb var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      this.m = true;
      boolean var8 = false;
      float var9 = this.n;
      float var10 = this.n;
      float var11 = this.n;
      float var12 = this.n;
      boolean var13 = true;
      boolean var14 = true;
      boolean var15 = true;
      boolean var16 = true;
      boolean var17 = true;
      boolean var18 = true;
      this.n = var1.f(this.a, var2, var3, var4);
      this.o = var1.f(this.a, var2 - 1, var3, var4);
      this.p = var1.f(this.a, var2, var3 - 1, var4);
      this.q = var1.f(this.a, var2, var3, var4 - 1);
      this.r = var1.f(this.a, var2 + 1, var3, var4);
      this.s = var1.f(this.a, var2, var3 + 1, var4);
      this.t = var1.f(this.a, var2, var3, var4 + 1);
      int var19 = var1.d(this.a, var2, var3, var4);
      int var20 = var19;
      int var21 = var19;
      int var22 = var19;
      int var23 = var19;
      int var24 = var19;
      int var25 = var19;
      if(var1.bW <= 0.0D) {
         var21 = var1.d(this.a, var2, var3 - 1, var4);
      }

      if(var1.bZ >= 1.0D) {
         var24 = var1.d(this.a, var2, var3 + 1, var4);
      }

      if(var1.bV <= 0.0D) {
         var20 = var1.d(this.a, var2 - 1, var3, var4);
      }

      if(var1.bY >= 1.0D) {
         var23 = var1.d(this.a, var2 + 1, var3, var4);
      }

      if(var1.bX <= 0.0D) {
         var22 = var1.d(this.a, var2, var3, var4 - 1);
      }

      if(var1.ca >= 1.0D) {
         var25 = var1.d(this.a, var2, var3, var4 + 1);
      }

      Tessalator var26 = Tessalator.a;
      var26.b(983055);
      this.aA = pb.p[this.a.a(var2 + 1, var3 + 1, var4)];
      this.aI = pb.p[this.a.a(var2 + 1, var3 - 1, var4)];
      this.aE = pb.p[this.a.a(var2 + 1, var3, var4 + 1)];
      this.aG = pb.p[this.a.a(var2 + 1, var3, var4 - 1)];
      this.aB = pb.p[this.a.a(var2 - 1, var3 + 1, var4)];
      this.aJ = pb.p[this.a.a(var2 - 1, var3 - 1, var4)];
      this.aD = pb.p[this.a.a(var2 - 1, var3, var4 - 1)];
      this.aF = pb.p[this.a.a(var2 - 1, var3, var4 + 1)];
      this.aC = pb.p[this.a.a(var2, var3 + 1, var4 + 1)];
      this.az = pb.p[this.a.a(var2, var3 + 1, var4 - 1)];
      this.aK = pb.p[this.a.a(var2, var3 - 1, var4 + 1)];
      this.aH = pb.p[this.a.a(var2, var3 - 1, var4 - 1)];
      if(var1.bN == 3) {
         var18 = false;
         var17 = false;
         var16 = false;
         var15 = false;
         var13 = false;
      }

      if(this.d >= 0) {
         var18 = false;
         var17 = false;
         var16 = false;
         var15 = false;
         var13 = false;
      }

      if(this.f || var1.a(this.a, var2, var3 - 1, var4, 0)) {
         if(this.ai > 0) {
            if(var1.bW <= 0.0D) {
               --var3;
            }

            this.P = var1.d(this.a, var2 - 1, var3, var4);
            this.R = var1.d(this.a, var2, var3, var4 - 1);
            this.S = var1.d(this.a, var2, var3, var4 + 1);
            this.U = var1.d(this.a, var2 + 1, var3, var4);
            this.v = var1.f(this.a, var2 - 1, var3, var4);
            this.x = var1.f(this.a, var2, var3, var4 - 1);
            this.y = var1.f(this.a, var2, var3, var4 + 1);
            this.A = var1.f(this.a, var2 + 1, var3, var4);
            if(!this.aH && !this.aJ) {
               this.u = this.v;
               this.O = this.P;
            } else {
               this.u = var1.f(this.a, var2 - 1, var3, var4 - 1);
               this.O = var1.d(this.a, var2 - 1, var3, var4 - 1);
            }

            if(!this.aK && !this.aJ) {
               this.w = this.v;
               this.Q = this.P;
            } else {
               this.w = var1.f(this.a, var2 - 1, var3, var4 + 1);
               this.Q = var1.d(this.a, var2 - 1, var3, var4 + 1);
            }

            if(!this.aH && !this.aI) {
               this.z = this.A;
               this.T = this.U;
            } else {
               this.z = var1.f(this.a, var2 + 1, var3, var4 - 1);
               this.T = var1.d(this.a, var2 + 1, var3, var4 - 1);
            }

            if(!this.aK && !this.aI) {
               this.B = this.A;
               this.V = this.U;
            } else {
               this.B = var1.f(this.a, var2 + 1, var3, var4 + 1);
               this.V = var1.d(this.a, var2 + 1, var3, var4 + 1);
            }

            if(var1.bW <= 0.0D) {
               ++var3;
            }

            var9 = (this.w + this.v + this.y + this.p) / 4.0F;
            var12 = (this.y + this.p + this.B + this.A) / 4.0F;
            var11 = (this.p + this.x + this.A + this.z) / 4.0F;
            var10 = (this.v + this.u + this.p + this.x) / 4.0F;
            this.aj = this.a(this.Q, this.P, this.S, var21);
            this.am = this.a(this.S, this.V, this.U, var21);
            this.al = this.a(this.R, this.U, this.T, var21);
            this.ak = this.a(this.P, this.O, this.R, var21);
         } else {
            var12 = this.p;
            var11 = this.p;
            var10 = this.p;
            var9 = this.p;
            this.aj = this.ak = this.al = this.am = this.P;
         }

         this.an = this.ao = this.ap = this.aq = (var13?var5:1.0F) * 0.5F;
         this.ar = this.as = this.at = this.au = (var13?var6:1.0F) * 0.5F;
         this.av = this.aw = this.ax = this.ay = (var13?var7:1.0F) * 0.5F;
         this.an *= var9;
         this.ar *= var9;
         this.av *= var9;
         this.ao *= var10;
         this.as *= var10;
         this.aw *= var10;
         this.ap *= var11;
         this.at *= var11;
         this.ax *= var11;
         this.aq *= var12;
         this.au *= var12;
         this.ay *= var12;
         this.a(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 0));
         var8 = true;
      }

      if(this.f || var1.a(this.a, var2, var3 + 1, var4, 1)) {
         if(this.ai > 0) {
            if(var1.bZ >= 1.0D) {
               ++var3;
            }

            this.X = var1.d(this.a, var2 - 1, var3, var4);
            this.ab = var1.d(this.a, var2 + 1, var3, var4);
            this.Z = var1.d(this.a, var2, var3, var4 - 1);
            this.ac = var1.d(this.a, var2, var3, var4 + 1);
            this.D = var1.f(this.a, var2 - 1, var3, var4);
            this.H = var1.f(this.a, var2 + 1, var3, var4);
            this.F = var1.f(this.a, var2, var3, var4 - 1);
            this.I = var1.f(this.a, var2, var3, var4 + 1);
            if(!this.az && !this.aB) {
               this.C = this.D;
               this.W = this.X;
            } else {
               this.C = var1.f(this.a, var2 - 1, var3, var4 - 1);
               this.W = var1.d(this.a, var2 - 1, var3, var4 - 1);
            }

            if(!this.az && !this.aA) {
               this.G = this.H;
               this.aa = this.ab;
            } else {
               this.G = var1.f(this.a, var2 + 1, var3, var4 - 1);
               this.aa = var1.d(this.a, var2 + 1, var3, var4 - 1);
            }

            if(!this.aC && !this.aB) {
               this.E = this.D;
               this.Y = this.X;
            } else {
               this.E = var1.f(this.a, var2 - 1, var3, var4 + 1);
               this.Y = var1.d(this.a, var2 - 1, var3, var4 + 1);
            }

            if(!this.aC && !this.aA) {
               this.J = this.H;
               this.ad = this.ab;
            } else {
               this.J = var1.f(this.a, var2 + 1, var3, var4 + 1);
               this.ad = var1.d(this.a, var2 + 1, var3, var4 + 1);
            }

            if(var1.bZ >= 1.0D) {
               --var3;
            }

            var12 = (this.E + this.D + this.I + this.s) / 4.0F;
            var9 = (this.I + this.s + this.J + this.H) / 4.0F;
            var10 = (this.s + this.F + this.H + this.G) / 4.0F;
            var11 = (this.D + this.C + this.s + this.F) / 4.0F;
            this.am = this.a(this.Y, this.X, this.ac, var24);
            this.aj = this.a(this.ac, this.ad, this.ab, var24);
            this.ak = this.a(this.Z, this.ab, this.aa, var24);
            this.al = this.a(this.X, this.W, this.Z, var24);
         } else {
            var12 = this.s;
            var11 = this.s;
            var10 = this.s;
            var9 = this.s;
            this.aj = this.ak = this.al = this.am = var24;
         }

         this.an = this.ao = this.ap = this.aq = var14?var5:1.0F;
         this.ar = this.as = this.at = this.au = var14?var6:1.0F;
         this.av = this.aw = this.ax = this.ay = var14?var7:1.0F;
         this.an *= var9;
         this.ar *= var9;
         this.av *= var9;
         this.ao *= var10;
         this.as *= var10;
         this.aw *= var10;
         this.ap *= var11;
         this.at *= var11;
         this.ax *= var11;
         this.aq *= var12;
         this.au *= var12;
         this.ay *= var12;
         this.b(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 1));
         var8 = true;
      }

      int var27;
      if(this.f || var1.a(this.a, var2, var3, var4 - 1, 2)) {
         if(this.ai > 0) {
            if(var1.bX <= 0.0D) {
               --var4;
            }

            this.K = var1.f(this.a, var2 - 1, var3, var4);
            this.x = var1.f(this.a, var2, var3 - 1, var4);
            this.F = var1.f(this.a, var2, var3 + 1, var4);
            this.L = var1.f(this.a, var2 + 1, var3, var4);
            this.ae = var1.d(this.a, var2 - 1, var3, var4);
            this.R = var1.d(this.a, var2, var3 - 1, var4);
            this.Z = var1.d(this.a, var2, var3 + 1, var4);
            this.af = var1.d(this.a, var2 + 1, var3, var4);
            if(!this.aD && !this.aH) {
               this.u = this.K;
               this.O = this.ae;
            } else {
               this.u = var1.f(this.a, var2 - 1, var3 - 1, var4);
               this.O = var1.d(this.a, var2 - 1, var3 - 1, var4);
            }

            if(!this.aD && !this.az) {
               this.C = this.K;
               this.W = this.ae;
            } else {
               this.C = var1.f(this.a, var2 - 1, var3 + 1, var4);
               this.W = var1.d(this.a, var2 - 1, var3 + 1, var4);
            }

            if(!this.aG && !this.aH) {
               this.z = this.L;
               this.T = this.af;
            } else {
               this.z = var1.f(this.a, var2 + 1, var3 - 1, var4);
               this.T = var1.d(this.a, var2 + 1, var3 - 1, var4);
            }

            if(!this.aG && !this.az) {
               this.G = this.L;
               this.aa = this.af;
            } else {
               this.G = var1.f(this.a, var2 + 1, var3 + 1, var4);
               this.aa = var1.d(this.a, var2 + 1, var3 + 1, var4);
            }

            if(var1.bX <= 0.0D) {
               ++var4;
            }

            var9 = (this.K + this.C + this.q + this.F) / 4.0F;
            var10 = (this.q + this.F + this.L + this.G) / 4.0F;
            var11 = (this.x + this.q + this.z + this.L) / 4.0F;
            var12 = (this.u + this.K + this.x + this.q) / 4.0F;
            this.aj = this.a(this.ae, this.W, this.Z, var22);
            this.ak = this.a(this.Z, this.af, this.aa, var22);
            this.al = this.a(this.R, this.T, this.af, var22);
            this.am = this.a(this.O, this.ae, this.R, var22);
         } else {
            var12 = this.q;
            var11 = this.q;
            var10 = this.q;
            var9 = this.q;
            this.aj = this.ak = this.al = this.am = var22;
         }

         this.an = this.ao = this.ap = this.aq = (var15?var5:1.0F) * 0.8F;
         this.ar = this.as = this.at = this.au = (var15?var6:1.0F) * 0.8F;
         this.av = this.aw = this.ax = this.ay = (var15?var7:1.0F) * 0.8F;
         this.an *= var9;
         this.ar *= var9;
         this.av *= var9;
         this.ao *= var10;
         this.as *= var10;
         this.aw *= var10;
         this.ap *= var11;
         this.at *= var11;
         this.ax *= var11;
         this.aq *= var12;
         this.au *= var12;
         this.ay *= var12;
         var27 = var1.d(this.a, var2, var3, var4, 2);
         this.c(var1, (double)var2, (double)var3, (double)var4, var27);
         if(b && var27 == 3 && this.d < 0) {
            this.an *= var5;
            this.ao *= var5;
            this.ap *= var5;
            this.aq *= var5;
            this.ar *= var6;
            this.as *= var6;
            this.at *= var6;
            this.au *= var6;
            this.av *= var7;
            this.aw *= var7;
            this.ax *= var7;
            this.ay *= var7;
            this.c(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      if(this.f || var1.a(this.a, var2, var3, var4 + 1, 3)) {
         if(this.ai > 0) {
            if(var1.ca >= 1.0D) {
               ++var4;
            }

            this.M = var1.f(this.a, var2 - 1, var3, var4);
            this.N = var1.f(this.a, var2 + 1, var3, var4);
            this.y = var1.f(this.a, var2, var3 - 1, var4);
            this.I = var1.f(this.a, var2, var3 + 1, var4);
            this.ag = var1.d(this.a, var2 - 1, var3, var4);
            this.ah = var1.d(this.a, var2 + 1, var3, var4);
            this.S = var1.d(this.a, var2, var3 - 1, var4);
            this.ac = var1.d(this.a, var2, var3 + 1, var4);
            if(!this.aF && !this.aK) {
               this.w = this.M;
               this.Q = this.ag;
            } else {
               this.w = var1.f(this.a, var2 - 1, var3 - 1, var4);
               this.Q = var1.d(this.a, var2 - 1, var3 - 1, var4);
            }

            if(!this.aF && !this.aC) {
               this.E = this.M;
               this.Y = this.ag;
            } else {
               this.E = var1.f(this.a, var2 - 1, var3 + 1, var4);
               this.Y = var1.d(this.a, var2 - 1, var3 + 1, var4);
            }

            if(!this.aE && !this.aK) {
               this.B = this.N;
               this.V = this.ah;
            } else {
               this.B = var1.f(this.a, var2 + 1, var3 - 1, var4);
               this.V = var1.d(this.a, var2 + 1, var3 - 1, var4);
            }

            if(!this.aE && !this.aC) {
               this.J = this.N;
               this.ad = this.ah;
            } else {
               this.J = var1.f(this.a, var2 + 1, var3 + 1, var4);
               this.ad = var1.d(this.a, var2 + 1, var3 + 1, var4);
            }

            if(var1.ca >= 1.0D) {
               --var4;
            }

            var9 = (this.M + this.E + this.t + this.I) / 4.0F;
            var12 = (this.t + this.I + this.N + this.J) / 4.0F;
            var11 = (this.y + this.t + this.B + this.N) / 4.0F;
            var10 = (this.w + this.M + this.y + this.t) / 4.0F;
            this.aj = this.a(this.ag, this.Y, this.ac, var25);
            this.am = this.a(this.ac, this.ah, this.ad, var25);
            this.al = this.a(this.S, this.V, this.ah, var25);
            this.ak = this.a(this.Q, this.ag, this.S, var25);
         } else {
            var12 = this.t;
            var11 = this.t;
            var10 = this.t;
            var9 = this.t;
            this.aj = this.ak = this.al = this.am = var25;
         }

         this.an = this.ao = this.ap = this.aq = (var16?var5:1.0F) * 0.8F;
         this.ar = this.as = this.at = this.au = (var16?var6:1.0F) * 0.8F;
         this.av = this.aw = this.ax = this.ay = (var16?var7:1.0F) * 0.8F;
         this.an *= var9;
         this.ar *= var9;
         this.av *= var9;
         this.ao *= var10;
         this.as *= var10;
         this.aw *= var10;
         this.ap *= var11;
         this.at *= var11;
         this.ax *= var11;
         this.aq *= var12;
         this.au *= var12;
         this.ay *= var12;
         var27 = var1.d(this.a, var2, var3, var4, 3);
         this.d(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 3));
         if(b && var27 == 3 && this.d < 0) {
            this.an *= var5;
            this.ao *= var5;
            this.ap *= var5;
            this.aq *= var5;
            this.ar *= var6;
            this.as *= var6;
            this.at *= var6;
            this.au *= var6;
            this.av *= var7;
            this.aw *= var7;
            this.ax *= var7;
            this.ay *= var7;
            this.d(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      if(this.f || var1.a(this.a, var2 - 1, var3, var4, 4)) {
         if(this.ai > 0) {
            if(var1.bV <= 0.0D) {
               --var2;
            }

            this.v = var1.f(this.a, var2, var3 - 1, var4);
            this.K = var1.f(this.a, var2, var3, var4 - 1);
            this.M = var1.f(this.a, var2, var3, var4 + 1);
            this.D = var1.f(this.a, var2, var3 + 1, var4);
            this.P = var1.d(this.a, var2, var3 - 1, var4);
            this.ae = var1.d(this.a, var2, var3, var4 - 1);
            this.ag = var1.d(this.a, var2, var3, var4 + 1);
            this.X = var1.d(this.a, var2, var3 + 1, var4);
            if(!this.aD && !this.aJ) {
               this.u = this.K;
               this.O = this.ae;
            } else {
               this.u = var1.f(this.a, var2, var3 - 1, var4 - 1);
               this.O = var1.d(this.a, var2, var3 - 1, var4 - 1);
            }

            if(!this.aF && !this.aJ) {
               this.w = this.M;
               this.Q = this.ag;
            } else {
               this.w = var1.f(this.a, var2, var3 - 1, var4 + 1);
               this.Q = var1.d(this.a, var2, var3 - 1, var4 + 1);
            }

            if(!this.aD && !this.aB) {
               this.C = this.K;
               this.W = this.ae;
            } else {
               this.C = var1.f(this.a, var2, var3 + 1, var4 - 1);
               this.W = var1.d(this.a, var2, var3 + 1, var4 - 1);
            }

            if(!this.aF && !this.aB) {
               this.E = this.M;
               this.Y = this.ag;
            } else {
               this.E = var1.f(this.a, var2, var3 + 1, var4 + 1);
               this.Y = var1.d(this.a, var2, var3 + 1, var4 + 1);
            }

            if(var1.bV <= 0.0D) {
               ++var2;
            }

            var12 = (this.v + this.w + this.o + this.M) / 4.0F;
            var9 = (this.o + this.M + this.D + this.E) / 4.0F;
            var10 = (this.K + this.o + this.C + this.D) / 4.0F;
            var11 = (this.u + this.v + this.K + this.o) / 4.0F;
            this.am = this.a(this.P, this.Q, this.ag, var20);
            this.aj = this.a(this.ag, this.X, this.Y, var20);
            this.ak = this.a(this.ae, this.W, this.X, var20);
            this.al = this.a(this.O, this.P, this.ae, var20);
         } else {
            var12 = this.o;
            var11 = this.o;
            var10 = this.o;
            var9 = this.o;
            this.aj = this.ak = this.al = this.am = var20;
         }

         this.an = this.ao = this.ap = this.aq = (var17?var5:1.0F) * 0.6F;
         this.ar = this.as = this.at = this.au = (var17?var6:1.0F) * 0.6F;
         this.av = this.aw = this.ax = this.ay = (var17?var7:1.0F) * 0.6F;
         this.an *= var9;
         this.ar *= var9;
         this.av *= var9;
         this.ao *= var10;
         this.as *= var10;
         this.aw *= var10;
         this.ap *= var11;
         this.at *= var11;
         this.ax *= var11;
         this.aq *= var12;
         this.au *= var12;
         this.ay *= var12;
         var27 = var1.d(this.a, var2, var3, var4, 4);
         this.e(var1, (double)var2, (double)var3, (double)var4, var27);
         if(b && var27 == 3 && this.d < 0) {
            this.an *= var5;
            this.ao *= var5;
            this.ap *= var5;
            this.aq *= var5;
            this.ar *= var6;
            this.as *= var6;
            this.at *= var6;
            this.au *= var6;
            this.av *= var7;
            this.aw *= var7;
            this.ax *= var7;
            this.ay *= var7;
            this.e(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      if(this.f || var1.a(this.a, var2 + 1, var3, var4, 5)) {
         if(this.ai > 0) {
            if(var1.bY >= 1.0D) {
               ++var2;
            }

            this.A = var1.f(this.a, var2, var3 - 1, var4);
            this.L = var1.f(this.a, var2, var3, var4 - 1);
            this.N = var1.f(this.a, var2, var3, var4 + 1);
            this.H = var1.f(this.a, var2, var3 + 1, var4);
            this.U = var1.d(this.a, var2, var3 - 1, var4);
            this.af = var1.d(this.a, var2, var3, var4 - 1);
            this.ah = var1.d(this.a, var2, var3, var4 + 1);
            this.ab = var1.d(this.a, var2, var3 + 1, var4);
            if(!this.aI && !this.aG) {
               this.z = this.L;
               this.T = this.af;
            } else {
               this.z = var1.f(this.a, var2, var3 - 1, var4 - 1);
               this.T = var1.d(this.a, var2, var3 - 1, var4 - 1);
            }

            if(!this.aI && !this.aE) {
               this.B = this.N;
               this.V = this.ah;
            } else {
               this.B = var1.f(this.a, var2, var3 - 1, var4 + 1);
               this.V = var1.d(this.a, var2, var3 - 1, var4 + 1);
            }

            if(!this.aA && !this.aG) {
               this.G = this.L;
               this.aa = this.af;
            } else {
               this.G = var1.f(this.a, var2, var3 + 1, var4 - 1);
               this.aa = var1.d(this.a, var2, var3 + 1, var4 - 1);
            }

            if(!this.aA && !this.aE) {
               this.J = this.N;
               this.ad = this.ah;
            } else {
               this.J = var1.f(this.a, var2, var3 + 1, var4 + 1);
               this.ad = var1.d(this.a, var2, var3 + 1, var4 + 1);
            }

            if(var1.bY >= 1.0D) {
               --var2;
            }

            var9 = (this.A + this.B + this.r + this.N) / 4.0F;
            var12 = (this.r + this.N + this.H + this.J) / 4.0F;
            var11 = (this.L + this.r + this.G + this.H) / 4.0F;
            var10 = (this.z + this.A + this.L + this.r) / 4.0F;
            this.aj = this.a(this.U, this.V, this.ah, var23);
            this.am = this.a(this.ah, this.ab, this.ad, var23);
            this.al = this.a(this.af, this.aa, this.ab, var23);
            this.ak = this.a(this.T, this.U, this.af, var23);
         } else {
            var12 = this.r;
            var11 = this.r;
            var10 = this.r;
            var9 = this.r;
            this.aj = this.ak = this.al = this.am = var23;
         }

         this.an = this.ao = this.ap = this.aq = (var18?var5:1.0F) * 0.6F;
         this.ar = this.as = this.at = this.au = (var18?var6:1.0F) * 0.6F;
         this.av = this.aw = this.ax = this.ay = (var18?var7:1.0F) * 0.6F;
         this.an *= var9;
         this.ar *= var9;
         this.av *= var9;
         this.ao *= var10;
         this.as *= var10;
         this.aw *= var10;
         this.ap *= var11;
         this.at *= var11;
         this.ax *= var11;
         this.aq *= var12;
         this.au *= var12;
         this.ay *= var12;
         var27 = var1.d(this.a, var2, var3, var4, 5);
         this.f(var1, (double)var2, (double)var3, (double)var4, var27);
         if(b && var27 == 3 && this.d < 0) {
            this.an *= var5;
            this.ao *= var5;
            this.ap *= var5;
            this.aq *= var5;
            this.ar *= var6;
            this.as *= var6;
            this.at *= var6;
            this.au *= var6;
            this.av *= var7;
            this.aw *= var7;
            this.ax *= var7;
            this.ay *= var7;
            this.f(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      this.m = false;
      return var8;
   }

   private int a(int var1, int var2, int var3, int var4) {
      if(var1 == 0) {
         var1 = var4;
      }

      if(var2 == 0) {
         var2 = var4;
      }

      if(var3 == 0) {
         var3 = var4;
      }

      return var1 + var2 + var3 + var4 >> 2 & 16711935;
   }

   public boolean b(pb var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      this.m = false;
      Tessalator var8 = Tessalator.a;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var11 * var5;
      float var15 = var11 * var6;
      float var16 = var11 * var7;
      float var17 = var10;
      float var18 = var12;
      float var19 = var13;
      float var20 = var10;
      float var21 = var12;
      float var22 = var13;
      float var23 = var10;
      float var24 = var12;
      float var25 = var13;
      if(var1 != pb.u) {
         var17 = var10 * var5;
         var18 = var12 * var5;
         var19 = var13 * var5;
         var20 = var10 * var6;
         var21 = var12 * var6;
         var22 = var13 * var6;
         var23 = var10 * var7;
         var24 = var12 * var7;
         var25 = var13 * var7;
      }

      int var26 = var1.d(this.a, var2, var3, var4);
      if(this.f || var1.a(this.a, var2, var3 - 1, var4, 0)) {
         var8.b(var1.bW > 0.0D?var26:var1.d(this.a, var2, var3 - 1, var4));
         var8.a(var17, var20, var23);
         this.a(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 0));
         var9 = true;
      }

      if(this.f || var1.a(this.a, var2, var3 + 1, var4, 1)) {
         var8.b(var1.bZ < 1.0D?var26:var1.d(this.a, var2, var3 + 1, var4));
         var8.a(var14, var15, var16);
         this.b(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 1));
         var9 = true;
      }

      int var28;
      if(this.f || var1.a(this.a, var2, var3, var4 - 1, 2)) {
         var8.b(var1.bX > 0.0D?var26:var1.d(this.a, var2, var3, var4 - 1));
         var8.a(var18, var21, var24);
         var28 = var1.d(this.a, var2, var3, var4, 2);
         this.c(var1, (double)var2, (double)var3, (double)var4, var28);
         if(b && var28 == 3 && this.d < 0) {
            var8.a(var18 * var5, var21 * var6, var24 * var7);
            this.c(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      if(this.f || var1.a(this.a, var2, var3, var4 + 1, 3)) {
         var8.b(var1.ca < 1.0D?var26:var1.d(this.a, var2, var3, var4 + 1));
         var8.a(var18, var21, var24);
         var28 = var1.d(this.a, var2, var3, var4, 3);
         this.d(var1, (double)var2, (double)var3, (double)var4, var28);
         if(b && var28 == 3 && this.d < 0) {
            var8.a(var18 * var5, var21 * var6, var24 * var7);
            this.d(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      if(this.f || var1.a(this.a, var2 - 1, var3, var4, 4)) {
         var8.b(var1.bV > 0.0D?var26:var1.d(this.a, var2 - 1, var3, var4));
         var8.a(var19, var22, var25);
         var28 = var1.d(this.a, var2, var3, var4, 4);
         this.e(var1, (double)var2, (double)var3, (double)var4, var28);
         if(b && var28 == 3 && this.d < 0) {
            var8.a(var19 * var5, var22 * var6, var25 * var7);
            this.e(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      if(this.f || var1.a(this.a, var2 + 1, var3, var4, 5)) {
         var8.b(var1.bY < 1.0D?var26:var1.d(this.a, var2 + 1, var3, var4));
         var8.a(var19, var22, var25);
         var28 = var1.d(this.a, var2, var3, var4, 5);
         this.f(var1, (double)var2, (double)var3, (double)var4, var28);
         if(b && var28 == 3 && this.d < 0) {
            var8.a(var19 * var5, var22 * var6, var25 * var7);
            this.f(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      return var9;
   }

   public boolean p(pb var1, int var2, int var3, int var4) {
      int var5 = var1.c(this.a, var2, var3, var4);
      float var6 = (float)(var5 >> 16 & 255) / 255.0F;
      float var7 = (float)(var5 >> 8 & 255) / 255.0F;
      float var8 = (float)(var5 & 255) / 255.0F;
      if(lr.a) {
         float var9 = (var6 * 30.0F + var7 * 59.0F + var8 * 11.0F) / 100.0F;
         float var10 = (var6 * 30.0F + var7 * 70.0F) / 100.0F;
         float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
         var6 = var9;
         var7 = var10;
         var8 = var11;
      }

      return this.c(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean c(pb var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      Tessalator var8 = Tessalator.a;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var10 * var5;
      float var15 = var11 * var5;
      float var16 = var12 * var5;
      float var17 = var13 * var5;
      float var18 = var10 * var6;
      float var19 = var11 * var6;
      float var20 = var12 * var6;
      float var21 = var13 * var6;
      float var22 = var10 * var7;
      float var23 = var11 * var7;
      float var24 = var12 * var7;
      float var25 = var13 * var7;
      float var26 = 0.0625F;
      int var28 = var1.d(this.a, var2, var3, var4);
      if(this.f || var1.a(this.a, var2, var3 - 1, var4, 0)) {
         var8.b(var1.bW > 0.0D?var28:var1.d(this.a, var2, var3 - 1, var4));
         var8.a(var14, var18, var22);
         this.a(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 0));
         var9 = true;
      }

      if(this.f || var1.a(this.a, var2, var3 + 1, var4, 1)) {
         var8.b(var1.bZ < 1.0D?var28:var1.d(this.a, var2, var3 + 1, var4));
         var8.a(var15, var19, var23);
         this.b(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 1));
         var9 = true;
      }

      if(this.f || var1.a(this.a, var2, var3, var4 - 1, 2)) {
         var8.b(var1.bX > 0.0D?var28:var1.d(this.a, var2, var3, var4 - 1));
         var8.a(var16, var20, var24);
         var8.c(0.0F, 0.0F, var26);
         this.c(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 2));
         var8.c(0.0F, 0.0F, -var26);
         var9 = true;
      }

      if(this.f || var1.a(this.a, var2, var3, var4 + 1, 3)) {
         var8.b(var1.ca < 1.0D?var28:var1.d(this.a, var2, var3, var4 + 1));
         var8.a(var16, var20, var24);
         var8.c(0.0F, 0.0F, -var26);
         this.d(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 3));
         var8.c(0.0F, 0.0F, var26);
         var9 = true;
      }

      if(this.f || var1.a(this.a, var2 - 1, var3, var4, 4)) {
         var8.b(var1.bV > 0.0D?var28:var1.d(this.a, var2 - 1, var3, var4));
         var8.a(var17, var21, var25);
         var8.c(var26, 0.0F, 0.0F);
         this.e(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 4));
         var8.c(-var26, 0.0F, 0.0F);
         var9 = true;
      }

      if(this.f || var1.a(this.a, var2 + 1, var3, var4, 5)) {
         var8.b(var1.bY < 1.0D?var28:var1.d(this.a, var2 + 1, var3, var4));
         var8.a(var17, var21, var25);
         var8.c(-var26, 0.0F, 0.0F);
         this.f(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 5));
         var8.c(var26, 0.0F, 0.0F);
         var9 = true;
      }

      return var9;
   }

   public boolean a(abg var1, int var2, int var3, int var4) {
      boolean var5 = false;
      float var6 = 0.375F;
      float var7 = 0.625F;
      var1.a(var6, 0.0F, var6, var7, 1.0F, var7);
      this.o(var1, var2, var3, var4);
      var5 = true;
      boolean var8 = false;
      boolean var9 = false;
      if(var1.g(this.a, var2 - 1, var3, var4) || var1.g(this.a, var2 + 1, var3, var4)) {
         var8 = true;
      }

      if(var1.g(this.a, var2, var3, var4 - 1) || var1.g(this.a, var2, var3, var4 + 1)) {
         var9 = true;
      }

      boolean var10 = var1.g(this.a, var2 - 1, var3, var4);
      boolean var11 = var1.g(this.a, var2 + 1, var3, var4);
      boolean var12 = var1.g(this.a, var2, var3, var4 - 1);
      boolean var13 = var1.g(this.a, var2, var3, var4 + 1);
      if(!var8 && !var9) {
         var8 = true;
      }

      var6 = 0.4375F;
      var7 = 0.5625F;
      float var14 = 0.75F;
      float var15 = 0.9375F;
      float var16 = var10?0.0F:var6;
      float var17 = var11?1.0F:var7;
      float var18 = var12?0.0F:var6;
      float var19 = var13?1.0F:var7;
      if(var8) {
         var1.a(var16, var14, var6, var17, var15, var7);
         this.o(var1, var2, var3, var4);
         var5 = true;
      }

      if(var9) {
         var1.a(var6, var14, var18, var7, var15, var19);
         this.o(var1, var2, var3, var4);
         var5 = true;
      }

      var14 = 0.375F;
      var15 = 0.5625F;
      if(var8) {
         var1.a(var16, var14, var6, var17, var15, var7);
         this.o(var1, var2, var3, var4);
         var5 = true;
      }

      if(var9) {
         var1.a(var6, var14, var18, var7, var15, var19);
         this.o(var1, var2, var3, var4);
         var5 = true;
      }

      var1.a(this.a, var2, var3, var4);
      return var5;
   }

   public boolean a(de var1, int var2, int var3, int var4) {
      boolean var5 = false;
      int var6 = 0;

      for(int var7 = 0; var7 < 8; ++var7) {
         byte var8 = 0;
         byte var9 = 1;
         if(var7 == 0) {
            var8 = 2;
         }

         if(var7 == 1) {
            var8 = 3;
         }

         if(var7 == 2) {
            var8 = 4;
         }

         if(var7 == 3) {
            var8 = 5;
            var9 = 2;
         }

         if(var7 == 4) {
            var8 = 6;
            var9 = 3;
         }

         if(var7 == 5) {
            var8 = 7;
            var9 = 5;
         }

         if(var7 == 6) {
            var8 = 6;
            var9 = 2;
         }

         if(var7 == 7) {
            var8 = 3;
         }

         float var10 = (float)var8 / 16.0F;
         float var11 = 1.0F - (float)var6 / 16.0F;
         float var12 = 1.0F - (float)(var6 + var9) / 16.0F;
         var6 += var9;
         var1.a(0.5F - var10, var12, 0.5F - var10, 0.5F + var10, var11, 0.5F + var10);
         this.o(var1, var2, var3, var4);
      }

      var5 = true;
      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return var5;
   }

   public boolean a(ajf var1, int var2, int var3, int var4) {
      boolean var5 = true;
      int var6 = this.a.e(var2, var3, var4);
      boolean var7 = ajf.e(var6);
      int var8 = mojang.w.a(var6);
      float var15;
      float var16;
      float var17;
      float var18;
      if(var8 != 3 && var8 != 1) {
         var15 = 0.0F;
         var16 = 0.125F;
         var17 = 0.4375F;
         var18 = 0.5625F;
         var1.a(var15, 0.3125F, var17, var16, 1.0F, var18);
         this.o(var1, var2, var3, var4);
         var15 = 0.875F;
         var16 = 1.0F;
         var1.a(var15, 0.3125F, var17, var16, 1.0F, var18);
         this.o(var1, var2, var3, var4);
      } else {
         var15 = 0.4375F;
         var16 = 0.5625F;
         var17 = 0.0F;
         var18 = 0.125F;
         var1.a(var15, 0.3125F, var17, var16, 1.0F, var18);
         this.o(var1, var2, var3, var4);
         var17 = 0.875F;
         var18 = 1.0F;
         var1.a(var15, 0.3125F, var17, var16, 1.0F, var18);
         this.o(var1, var2, var3, var4);
      }

      if(!var7) {
         if(var8 != 3 && var8 != 1) {
            var15 = 0.375F;
            var16 = 0.5F;
            var17 = 0.4375F;
            var18 = 0.5625F;
            var1.a(var15, 0.375F, var17, var16, 0.9375F, var18);
            this.o(var1, var2, var3, var4);
            var15 = 0.5F;
            var16 = 0.625F;
            var1.a(var15, 0.375F, var17, var16, 0.9375F, var18);
            this.o(var1, var2, var3, var4);
            var15 = 0.625F;
            var16 = 0.875F;
            var1.a(var15, 0.375F, var17, var16, 0.5625F, var18);
            this.o(var1, var2, var3, var4);
            var1.a(var15, 0.75F, var17, var16, 0.9375F, var18);
            this.o(var1, var2, var3, var4);
            var15 = 0.125F;
            var16 = 0.375F;
            var1.a(var15, 0.375F, var17, var16, 0.5625F, var18);
            this.o(var1, var2, var3, var4);
            var1.a(var15, 0.75F, var17, var16, 0.9375F, var18);
            this.o(var1, var2, var3, var4);
         } else {
            var15 = 0.4375F;
            var16 = 0.5625F;
            var17 = 0.375F;
            var18 = 0.5F;
            var1.a(var15, 0.375F, var17, var16, 0.9375F, var18);
            this.o(var1, var2, var3, var4);
            var17 = 0.5F;
            var18 = 0.625F;
            var1.a(var15, 0.375F, var17, var16, 0.9375F, var18);
            this.o(var1, var2, var3, var4);
            var17 = 0.625F;
            var18 = 0.875F;
            var1.a(var15, 0.375F, var17, var16, 0.5625F, var18);
            this.o(var1, var2, var3, var4);
            var1.a(var15, 0.75F, var17, var16, 0.9375F, var18);
            this.o(var1, var2, var3, var4);
            var17 = 0.125F;
            var18 = 0.375F;
            var1.a(var15, 0.375F, var17, var16, 0.5625F, var18);
            this.o(var1, var2, var3, var4);
            var1.a(var15, 0.75F, var17, var16, 0.9375F, var18);
            this.o(var1, var2, var3, var4);
         }
      } else if(var8 == 3) {
         var1.a(0.8125F, 0.375F, 0.0F, 0.9375F, 0.9375F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.8125F, 0.375F, 0.875F, 0.9375F, 0.9375F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.a(0.5625F, 0.375F, 0.0F, 0.8125F, 0.5625F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.5625F, 0.375F, 0.875F, 0.8125F, 0.5625F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.a(0.5625F, 0.75F, 0.0F, 0.8125F, 0.9375F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.5625F, 0.75F, 0.875F, 0.8125F, 0.9375F, 1.0F);
         this.o(var1, var2, var3, var4);
      } else if(var8 == 1) {
         var1.a(0.0625F, 0.375F, 0.0F, 0.1875F, 0.9375F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0625F, 0.375F, 0.875F, 0.1875F, 0.9375F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.a(0.1875F, 0.375F, 0.0F, 0.4375F, 0.5625F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.1875F, 0.375F, 0.875F, 0.4375F, 0.5625F, 1.0F);
         this.o(var1, var2, var3, var4);
         var1.a(0.1875F, 0.75F, 0.0F, 0.4375F, 0.9375F, 0.125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.1875F, 0.75F, 0.875F, 0.4375F, 0.9375F, 1.0F);
         this.o(var1, var2, var3, var4);
      } else if(var8 == 0) {
         var1.a(0.0F, 0.375F, 0.8125F, 0.125F, 0.9375F, 0.9375F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.375F, 0.8125F, 1.0F, 0.9375F, 0.9375F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0F, 0.375F, 0.5625F, 0.125F, 0.5625F, 0.8125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.375F, 0.5625F, 1.0F, 0.5625F, 0.8125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0F, 0.75F, 0.5625F, 0.125F, 0.9375F, 0.8125F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.75F, 0.5625F, 1.0F, 0.9375F, 0.8125F);
         this.o(var1, var2, var3, var4);
      } else if(var8 == 2) {
         var1.a(0.0F, 0.375F, 0.0625F, 0.125F, 0.9375F, 0.1875F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.375F, 0.0625F, 1.0F, 0.9375F, 0.1875F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0F, 0.375F, 0.1875F, 0.125F, 0.5625F, 0.4375F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.375F, 0.1875F, 1.0F, 0.5625F, 0.4375F);
         this.o(var1, var2, var3, var4);
         var1.a(0.0F, 0.75F, 0.1875F, 0.125F, 0.9375F, 0.4375F);
         this.o(var1, var2, var3, var4);
         var1.a(0.875F, 0.75F, 0.1875F, 1.0F, 0.9375F, 0.4375F);
         this.o(var1, var2, var3, var4);
      }

      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return var5;
   }

   public boolean q(pb var1, int var2, int var3, int var4) {
      int var5 = this.a.e(var2, var3, var4);
      int var6 = var5 & 3;
      float var7 = 0.0F;
      float var8 = 0.5F;
      float var9 = 0.5F;
      float var10 = 1.0F;
      if((var5 & 4) != 0) {
         var7 = 0.5F;
         var8 = 1.0F;
         var9 = 0.0F;
         var10 = 0.5F;
      }

      var1.a(0.0F, var7, 0.0F, 1.0F, var8, 1.0F);
      this.o(var1, var2, var3, var4);
      if(var6 == 0) {
         var1.a(0.5F, var9, 0.0F, 1.0F, var10, 1.0F);
         this.o(var1, var2, var3, var4);
      } else if(var6 == 1) {
         var1.a(0.0F, var9, 0.0F, 0.5F, var10, 1.0F);
         this.o(var1, var2, var3, var4);
      } else if(var6 == 2) {
         var1.a(0.0F, var9, 0.5F, 1.0F, var10, 1.0F);
         this.o(var1, var2, var3, var4);
      } else if(var6 == 3) {
         var1.a(0.0F, var9, 0.0F, 1.0F, var10, 0.5F);
         this.o(var1, var2, var3, var4);
      }

      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return true;
   }

   public boolean r(pb var1, int var2, int var3, int var4) {
      Tessalator var5 = Tessalator.a;
      acb var6 = (acb)var1;
      boolean var7 = false;
      float var8 = 0.5F;
      float var9 = 1.0F;
      float var10 = 0.8F;
      float var11 = 0.6F;
      int var12 = var1.d(this.a, var2, var3, var4);
      var5.b(var1.bW > 0.0D?var12:var1.d(this.a, var2, var3 - 1, var4));
      var5.a(var8, var8, var8);
      this.a(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 0));
      var7 = true;
      var5.b(var1.bZ < 1.0D?var12:var1.d(this.a, var2, var3 + 1, var4));
      var5.a(var9, var9, var9);
      this.b(var1, (double)var2, (double)var3, (double)var4, var1.d(this.a, var2, var3, var4, 1));
      var7 = true;
      var5.b(var1.bX > 0.0D?var12:var1.d(this.a, var2, var3, var4 - 1));
      var5.a(var10, var10, var10);
      int var14 = var1.d(this.a, var2, var3, var4, 2);
      if(var14 < 0) {
         this.e = true;
         var14 = -var14;
      }

      this.c(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.e = false;
      var5.b(var1.ca < 1.0D?var12:var1.d(this.a, var2, var3, var4 + 1));
      var5.a(var10, var10, var10);
      var14 = var1.d(this.a, var2, var3, var4, 3);
      if(var14 < 0) {
         this.e = true;
         var14 = -var14;
      }

      this.d(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.e = false;
      var5.b(var1.bV > 0.0D?var12:var1.d(this.a, var2 - 1, var3, var4));
      var5.a(var11, var11, var11);
      var14 = var1.d(this.a, var2, var3, var4, 4);
      if(var14 < 0) {
         this.e = true;
         var14 = -var14;
      }

      this.e(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.e = false;
      var5.b(var1.bY < 1.0D?var12:var1.d(this.a, var2 + 1, var3, var4));
      var5.a(var11, var11, var11);
      var14 = var1.d(this.a, var2, var3, var4, 5);
      if(var14 < 0) {
         this.e = true;
         var14 = -var14;
      }

      this.f(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.e = false;
      return var7;
   }

   public void a(pb var1, double var2, double var4, double var6, int var8) {
      Tessalator var9 = Tessalator.a;
      if(this.d >= 0) {
         var8 = this.d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bV * 16.0D) / 256.0D;
      double var14 = ((double)var10 + var1.bY * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)var11 + var1.bX * 16.0D) / 256.0D;
      double var18 = ((double)var11 + var1.ca * 16.0D - 0.01D) / 256.0D;
      if(var1.bV < 0.0D || var1.bY > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(var1.bX < 0.0D || var1.ca > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.l == 2) {
         var12 = ((double)var10 + var1.bX * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - var1.bY * 16.0D) / 256.0D;
         var14 = ((double)var10 + var1.ca * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - var1.bV * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.l == 1) {
         var12 = ((double)(var10 + 16) - var1.ca * 16.0D) / 256.0D;
         var16 = ((double)var11 + var1.bV * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.bX * 16.0D) / 256.0D;
         var18 = ((double)var11 + var1.bY * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.l == 3) {
         var12 = ((double)(var10 + 16) - var1.bV * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.bY * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)(var11 + 16) - var1.bX * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - var1.ca * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bV;
      double var30 = var2 + var1.bY;
      double var32 = var4 + var1.bW;
      double var34 = var6 + var1.bX;
      double var36 = var6 + var1.ca;
      if(this.m) {
         var9.a(this.an, this.ar, this.av);
         var9.b(this.aj);
         var9.a(var28, var32, var36, var22, var26);
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var30, var32, var34, var20, var24);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var30, var32, var36, var14, var18);
      } else {
         var9.a(var28, var32, var36, var22, var26);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(var30, var32, var34, var20, var24);
         var9.a(var30, var32, var36, var14, var18);
      }

   }

   public void b(pb var1, double var2, double var4, double var6, int var8) {
      Tessalator var9 = Tessalator.a;
      if(this.d >= 0) {
         var8 = this.d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bV * 16.0D) / 256.0D;
      double var14 = ((double)var10 + var1.bY * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)var11 + var1.bX * 16.0D) / 256.0D;
      double var18 = ((double)var11 + var1.ca * 16.0D - 0.01D) / 256.0D;
      if(var1.bV < 0.0D || var1.bY > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(var1.bX < 0.0D || var1.ca > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.k == 1) {
         var12 = ((double)var10 + var1.bX * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - var1.bY * 16.0D) / 256.0D;
         var14 = ((double)var10 + var1.ca * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - var1.bV * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.k == 2) {
         var12 = ((double)(var10 + 16) - var1.ca * 16.0D) / 256.0D;
         var16 = ((double)var11 + var1.bV * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.bX * 16.0D) / 256.0D;
         var18 = ((double)var11 + var1.bY * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.k == 3) {
         var12 = ((double)(var10 + 16) - var1.bV * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.bY * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)(var11 + 16) - var1.bX * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - var1.ca * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bV;
      double var30 = var2 + var1.bY;
      double var32 = var4 + var1.bZ;
      double var34 = var6 + var1.bX;
      double var36 = var6 + var1.ca;
      if(this.m) {
         var9.a(this.an, this.ar, this.av);
         var9.b(this.aj);
         var9.a(var30, var32, var36, var14, var18);
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var30, var32, var34, var20, var24);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var28, var32, var36, var22, var26);
      } else {
         var9.a(var30, var32, var36, var14, var18);
         var9.a(var30, var32, var34, var20, var24);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(var28, var32, var36, var22, var26);
      }

   }

   public void c(pb var1, double var2, double var4, double var6, int var8) {
      Tessalator var9 = Tessalator.a;
      if(this.d >= 0) {
         var8 = this.d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bV * 16.0D) / 256.0D;
      double var14 = ((double)var10 + var1.bY * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)(var11 + 16) - var1.bZ * 16.0D) / 256.0D;
      double var18 = ((double)(var11 + 16) - var1.bW * 16.0D - 0.01D) / 256.0D;
      double var20;
      if(this.e) {
         var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if(var1.bV < 0.0D || var1.bY > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(var1.bW < 0.0D || var1.bZ > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.g == 2) {
         var12 = ((double)var10 + var1.bW * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - var1.bV * 16.0D) / 256.0D;
         var14 = ((double)var10 + var1.bZ * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - var1.bY * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.g == 1) {
         var12 = ((double)(var10 + 16) - var1.bZ * 16.0D) / 256.0D;
         var16 = ((double)var11 + var1.bY * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.bW * 16.0D) / 256.0D;
         var18 = ((double)var11 + var1.bV * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.g == 3) {
         var12 = ((double)(var10 + 16) - var1.bV * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.bY * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)var11 + var1.bZ * 16.0D) / 256.0D;
         var18 = ((double)var11 + var1.bW * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bV;
      double var30 = var2 + var1.bY;
      double var32 = var4 + var1.bW;
      double var34 = var4 + var1.bZ;
      double var36 = var6 + var1.bX;
      if(this.m) {
         var9.a(this.an, this.ar, this.av);
         var9.b(this.aj);
         var9.a(var28, var34, var36, var20, var24);
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var30, var34, var36, var12, var16);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var30, var32, var36, var22, var26);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var28, var32, var36, var14, var18);
      } else {
         var9.a(var28, var34, var36, var20, var24);
         var9.a(var30, var34, var36, var12, var16);
         var9.a(var30, var32, var36, var22, var26);
         var9.a(var28, var32, var36, var14, var18);
      }

   }

   public void d(pb var1, double var2, double var4, double var6, int var8) {
      Tessalator var9 = Tessalator.a;
      if(this.d >= 0) {
         var8 = this.d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bV * 16.0D) / 256.0D;
      double var14 = ((double)var10 + var1.bY * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)(var11 + 16) - var1.bZ * 16.0D) / 256.0D;
      double var18 = ((double)(var11 + 16) - var1.bW * 16.0D - 0.01D) / 256.0D;
      double var20;
      if(this.e) {
         var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if(var1.bV < 0.0D || var1.bY > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(var1.bW < 0.0D || var1.bZ > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.h == 1) {
         var12 = ((double)var10 + var1.bW * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - var1.bV * 16.0D) / 256.0D;
         var14 = ((double)var10 + var1.bZ * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - var1.bY * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.h == 2) {
         var12 = ((double)(var10 + 16) - var1.bZ * 16.0D) / 256.0D;
         var16 = ((double)var11 + var1.bV * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.bW * 16.0D) / 256.0D;
         var18 = ((double)var11 + var1.bY * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.h == 3) {
         var12 = ((double)(var10 + 16) - var1.bV * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.bY * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)var11 + var1.bZ * 16.0D) / 256.0D;
         var18 = ((double)var11 + var1.bW * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bV;
      double var30 = var2 + var1.bY;
      double var32 = var4 + var1.bW;
      double var34 = var4 + var1.bZ;
      double var36 = var6 + var1.ca;
      if(this.m) {
         var9.a(this.an, this.ar, this.av);
         var9.b(this.aj);
         var9.a(var28, var34, var36, var12, var16);
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var28, var32, var36, var22, var26);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var30, var32, var36, var14, var18);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var30, var34, var36, var20, var24);
      } else {
         var9.a(var28, var34, var36, var12, var16);
         var9.a(var28, var32, var36, var22, var26);
         var9.a(var30, var32, var36, var14, var18);
         var9.a(var30, var34, var36, var20, var24);
      }

   }

   public void e(pb var1, double var2, double var4, double var6, int var8) {
      Tessalator var9 = Tessalator.a;
      if(this.d >= 0) {
         var8 = this.d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bX * 16.0D) / 256.0D;
      double var14 = ((double)var10 + var1.ca * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)(var11 + 16) - var1.bZ * 16.0D) / 256.0D;
      double var18 = ((double)(var11 + 16) - var1.bW * 16.0D - 0.01D) / 256.0D;
      double var20;
      if(this.e) {
         var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if(var1.bX < 0.0D || var1.ca > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(var1.bW < 0.0D || var1.bZ > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.j == 1) {
         var12 = ((double)var10 + var1.bW * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - var1.ca * 16.0D) / 256.0D;
         var14 = ((double)var10 + var1.bZ * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - var1.bX * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.j == 2) {
         var12 = ((double)(var10 + 16) - var1.bZ * 16.0D) / 256.0D;
         var16 = ((double)var11 + var1.bX * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.bW * 16.0D) / 256.0D;
         var18 = ((double)var11 + var1.ca * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.j == 3) {
         var12 = ((double)(var10 + 16) - var1.bX * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.ca * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)var11 + var1.bZ * 16.0D) / 256.0D;
         var18 = ((double)var11 + var1.bW * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bV;
      double var30 = var4 + var1.bW;
      double var32 = var4 + var1.bZ;
      double var34 = var6 + var1.bX;
      double var36 = var6 + var1.ca;
      if(this.m) {
         var9.a(this.an, this.ar, this.av);
         var9.b(this.aj);
         var9.a(var28, var32, var36, var20, var24);
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var28, var30, var34, var22, var26);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var28, var30, var36, var14, var18);
      } else {
         var9.a(var28, var32, var36, var20, var24);
         var9.a(var28, var32, var34, var12, var16);
         var9.a(var28, var30, var34, var22, var26);
         var9.a(var28, var30, var36, var14, var18);
      }

   }

   public void f(pb var1, double var2, double var4, double var6, int var8) {
      Tessalator var9 = Tessalator.a;
      if(this.d >= 0) {
         var8 = this.d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bX * 16.0D) / 256.0D;
      double var14 = ((double)var10 + var1.ca * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)(var11 + 16) - var1.bZ * 16.0D) / 256.0D;
      double var18 = ((double)(var11 + 16) - var1.bW * 16.0D - 0.01D) / 256.0D;
      double var20;
      if(this.e) {
         var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if(var1.bX < 0.0D || var1.ca > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(var1.bW < 0.0D || var1.bZ > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.i == 2) {
         var12 = ((double)var10 + var1.bW * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - var1.bX * 16.0D) / 256.0D;
         var14 = ((double)var10 + var1.bZ * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - var1.ca * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.i == 1) {
         var12 = ((double)(var10 + 16) - var1.bZ * 16.0D) / 256.0D;
         var16 = ((double)var11 + var1.ca * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.bW * 16.0D) / 256.0D;
         var18 = ((double)var11 + var1.bX * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.i == 3) {
         var12 = ((double)(var10 + 16) - var1.bX * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - var1.ca * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)var11 + var1.bZ * 16.0D) / 256.0D;
         var18 = ((double)var11 + var1.bW * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + var1.bY;
      double var30 = var4 + var1.bW;
      double var32 = var4 + var1.bZ;
      double var34 = var6 + var1.bX;
      double var36 = var6 + var1.ca;
      if(this.m) {
         var9.a(this.an, this.ar, this.av);
         var9.b(this.aj);
         var9.a(var28, var30, var36, var22, var26);
         var9.a(this.ao, this.as, this.aw);
         var9.b(this.ak);
         var9.a(var28, var30, var34, var14, var18);
         var9.a(this.ap, this.at, this.ax);
         var9.b(this.al);
         var9.a(var28, var32, var34, var20, var24);
         var9.a(this.aq, this.au, this.ay);
         var9.b(this.am);
         var9.a(var28, var32, var36, var12, var16);
      } else {
         var9.a(var28, var30, var36, var22, var26);
         var9.a(var28, var30, var34, var14, var18);
         var9.a(var28, var32, var34, var20, var24);
         var9.a(var28, var32, var36, var12, var16);
      }

   }

   public void a(pb var1, int var2, float var3) {
      Tessalator var4 = Tessalator.a;
      boolean var5 = var1.bO == pb.u.bO;
      int var6;
      float var7;
      float var8;
      float var9;
      if(this.c) {
         var6 = var1.d(var2);
         if(var5) {
            var6 = 16777215;
         }

         var7 = (float)(var6 >> 16 & 255) / 255.0F;
         var8 = (float)(var6 >> 8 & 255) / 255.0F;
         var9 = (float)(var6 & 255) / 255.0F;
         GL11.glColor4f(var7 * var3, var8 * var3, var9 * var3, 1.0F);
      }

      var6 = var1.d();
      int var14;
      if(var6 != 0 && var6 != 16) {
         if(var6 == 1) {
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            this.a(var1, var2, -0.5D, -0.5D, -0.5D);
            var4.a();
         } else if(var6 == 19) {
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            var1.h();
            this.a(var1, var2, var1.bZ, -0.5D, -0.5D, -0.5D);
            var4.a();
         } else if(var6 == 23) {
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            var1.h();
            var4.a();
         } else if(var6 == 13) {
            var1.h();
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var7 = 0.0625F;
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            this.a(var1, 0.0D, 0.0D, 0.0D, var1.a_(0));
            var4.a();
            var4.b();
            var4.b(0.0F, 1.0F, 0.0F);
            this.b(var1, 0.0D, 0.0D, 0.0D, var1.a_(1));
            var4.a();
            var4.b();
            var4.b(0.0F, 0.0F, -1.0F);
            var4.c(0.0F, 0.0F, var7);
            this.c(var1, 0.0D, 0.0D, 0.0D, var1.a_(2));
            var4.c(0.0F, 0.0F, -var7);
            var4.a();
            var4.b();
            var4.b(0.0F, 0.0F, 1.0F);
            var4.c(0.0F, 0.0F, -var7);
            this.d(var1, 0.0D, 0.0D, 0.0D, var1.a_(3));
            var4.c(0.0F, 0.0F, var7);
            var4.a();
            var4.b();
            var4.b(-1.0F, 0.0F, 0.0F);
            var4.c(var7, 0.0F, 0.0F);
            this.e(var1, 0.0D, 0.0D, 0.0D, var1.a_(4));
            var4.c(-var7, 0.0F, 0.0F);
            var4.a();
            var4.b();
            var4.b(1.0F, 0.0F, 0.0F);
            var4.c(-var7, 0.0F, 0.0F);
            this.f(var1, 0.0D, 0.0D, 0.0D, var1.a_(5));
            var4.c(var7, 0.0F, 0.0F);
            var4.a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         } else if(var6 == 22) {
            df.a.a(var1, var2, var3);
            GL11.glEnable('\u803a');
         } else if(var6 == 6) {
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            this.b(var1, var2, -0.5D, -0.5D, -0.5D);
            var4.a();
         } else if(var6 == 2) {
            var4.b();
            var4.b(0.0F, -1.0F, 0.0F);
            this.a(var1, -0.5D, -0.5D, -0.5D, 0.0D, 0.0D);
            var4.a();
         } else if(var6 == 10) {
            for(var14 = 0; var14 < 2; ++var14) {
               if(var14 == 0) {
                  var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
               }

               if(var14 == 1) {
                  var1.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.b();
               var4.b(0.0F, -1.0F, 0.0F);
               this.a(var1, 0.0D, 0.0D, 0.0D, var1.a_(0));
               var4.a();
               var4.b();
               var4.b(0.0F, 1.0F, 0.0F);
               this.b(var1, 0.0D, 0.0D, 0.0D, var1.a_(1));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, -1.0F);
               this.c(var1, 0.0D, 0.0D, 0.0D, var1.a_(2));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, 1.0F);
               this.d(var1, 0.0D, 0.0D, 0.0D, var1.a_(3));
               var4.a();
               var4.b();
               var4.b(-1.0F, 0.0F, 0.0F);
               this.e(var1, 0.0D, 0.0D, 0.0D, var1.a_(4));
               var4.a();
               var4.b();
               var4.b(1.0F, 0.0F, 0.0F);
               this.f(var1, 0.0D, 0.0D, 0.0D, var1.a_(5));
               var4.a();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }
         } else if(var6 == 27) {
            var14 = 0;
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var4.b();

            for(int var15 = 0; var15 < 8; ++var15) {
               byte var16 = 0;
               byte var17 = 1;
               if(var15 == 0) {
                  var16 = 2;
               }

               if(var15 == 1) {
                  var16 = 3;
               }

               if(var15 == 2) {
                  var16 = 4;
               }

               if(var15 == 3) {
                  var16 = 5;
                  var17 = 2;
               }

               if(var15 == 4) {
                  var16 = 6;
                  var17 = 3;
               }

               if(var15 == 5) {
                  var16 = 7;
                  var17 = 5;
               }

               if(var15 == 6) {
                  var16 = 6;
                  var17 = 2;
               }

               if(var15 == 7) {
                  var16 = 3;
               }

               float var11 = (float)var16 / 16.0F;
               float var12 = 1.0F - (float)var14 / 16.0F;
               float var13 = 1.0F - (float)(var14 + var17) / 16.0F;
               var14 += var17;
               var1.a(0.5F - var11, var13, 0.5F - var11, 0.5F + var11, var12, 0.5F + var11);
               var4.b(0.0F, -1.0F, 0.0F);
               this.a(var1, 0.0D, 0.0D, 0.0D, var1.a_(0));
               var4.b(0.0F, 1.0F, 0.0F);
               this.b(var1, 0.0D, 0.0D, 0.0D, var1.a_(1));
               var4.b(0.0F, 0.0F, -1.0F);
               this.c(var1, 0.0D, 0.0D, 0.0D, var1.a_(2));
               var4.b(0.0F, 0.0F, 1.0F);
               this.d(var1, 0.0D, 0.0D, 0.0D, var1.a_(3));
               var4.b(-1.0F, 0.0F, 0.0F);
               this.e(var1, 0.0D, 0.0D, 0.0D, var1.a_(4));
               var4.b(1.0F, 0.0F, 0.0F);
               this.f(var1, 0.0D, 0.0D, 0.0D, var1.a_(5));
            }

            var4.a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         } else if(var6 == 11) {
            for(var14 = 0; var14 < 4; ++var14) {
               var8 = 0.125F;
               if(var14 == 0) {
                  var1.a(0.5F - var8, 0.0F, 0.0F, 0.5F + var8, 1.0F, var8 * 2.0F);
               }

               if(var14 == 1) {
                  var1.a(0.5F - var8, 0.0F, 1.0F - var8 * 2.0F, 0.5F + var8, 1.0F, 1.0F);
               }

               var8 = 0.0625F;
               if(var14 == 2) {
                  var1.a(0.5F - var8, 1.0F - var8 * 3.0F, -var8 * 2.0F, 0.5F + var8, 1.0F - var8, 1.0F + var8 * 2.0F);
               }

               if(var14 == 3) {
                  var1.a(0.5F - var8, 0.5F - var8 * 3.0F, -var8 * 2.0F, 0.5F + var8, 0.5F - var8, 1.0F + var8 * 2.0F);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.b();
               var4.b(0.0F, -1.0F, 0.0F);
               this.a(var1, 0.0D, 0.0D, 0.0D, var1.a_(0));
               var4.a();
               var4.b();
               var4.b(0.0F, 1.0F, 0.0F);
               this.b(var1, 0.0D, 0.0D, 0.0D, var1.a_(1));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, -1.0F);
               this.c(var1, 0.0D, 0.0D, 0.0D, var1.a_(2));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, 1.0F);
               this.d(var1, 0.0D, 0.0D, 0.0D, var1.a_(3));
               var4.a();
               var4.b();
               var4.b(-1.0F, 0.0F, 0.0F);
               this.e(var1, 0.0D, 0.0D, 0.0D, var1.a_(4));
               var4.a();
               var4.b();
               var4.b(1.0F, 0.0F, 0.0F);
               this.f(var1, 0.0D, 0.0D, 0.0D, var1.a_(5));
               var4.a();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         } else if(var6 == 21) {
            for(var14 = 0; var14 < 3; ++var14) {
               var8 = 0.0625F;
               if(var14 == 0) {
                  var1.a(0.5F - var8, 0.3F, 0.0F, 0.5F + var8, 1.0F, var8 * 2.0F);
               }

               if(var14 == 1) {
                  var1.a(0.5F - var8, 0.3F, 1.0F - var8 * 2.0F, 0.5F + var8, 1.0F, 1.0F);
               }

               var8 = 0.0625F;
               if(var14 == 2) {
                  var1.a(0.5F - var8, 0.5F, 0.0F, 0.5F + var8, 1.0F - var8, 1.0F);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.b();
               var4.b(0.0F, -1.0F, 0.0F);
               this.a(var1, 0.0D, 0.0D, 0.0D, var1.a_(0));
               var4.a();
               var4.b();
               var4.b(0.0F, 1.0F, 0.0F);
               this.b(var1, 0.0D, 0.0D, 0.0D, var1.a_(1));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, -1.0F);
               this.c(var1, 0.0D, 0.0D, 0.0D, var1.a_(2));
               var4.a();
               var4.b();
               var4.b(0.0F, 0.0F, 1.0F);
               this.d(var1, 0.0D, 0.0D, 0.0D, var1.a_(3));
               var4.a();
               var4.b();
               var4.b(-1.0F, 0.0F, 0.0F);
               this.e(var1, 0.0D, 0.0D, 0.0D, var1.a_(4));
               var4.a();
               var4.b();
               var4.b(1.0F, 0.0F, 0.0F);
               this.f(var1, 0.0D, 0.0D, 0.0D, var1.a_(5));
               var4.a();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         }
      } else {
         if(var6 == 16) {
            var2 = 1;
         }

         var1.h();
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         var4.b();
         var4.b(0.0F, -1.0F, 0.0F);
         this.a(var1, 0.0D, 0.0D, 0.0D, var1.a(0, var2));
         var4.a();
         if(var5 && this.c) {
            var14 = var1.d(var2);
            var8 = (float)(var14 >> 16 & 255) / 255.0F;
            var9 = (float)(var14 >> 8 & 255) / 255.0F;
            float var10 = (float)(var14 & 255) / 255.0F;
            GL11.glColor4f(var8 * var3, var9 * var3, var10 * var3, 1.0F);
         }

         var4.b();
         var4.b(0.0F, 1.0F, 0.0F);
         this.b(var1, 0.0D, 0.0D, 0.0D, var1.a(1, var2));
         var4.a();
         if(var5 && this.c) {
            GL11.glColor4f(var3, var3, var3, 1.0F);
         }

         var4.b();
         var4.b(0.0F, 0.0F, -1.0F);
         this.c(var1, 0.0D, 0.0D, 0.0D, var1.a(2, var2));
         var4.a();
         var4.b();
         var4.b(0.0F, 0.0F, 1.0F);
         this.d(var1, 0.0D, 0.0D, 0.0D, var1.a(3, var2));
         var4.a();
         var4.b();
         var4.b(-1.0F, 0.0F, 0.0F);
         this.e(var1, 0.0D, 0.0D, 0.0D, var1.a(4, var2));
         var4.a();
         var4.b();
         var4.b(1.0F, 0.0F, 0.0F);
         this.f(var1, 0.0D, 0.0D, 0.0D, var1.a(5, var2));
         var4.a();
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      }

   }

   public static boolean a(int var0) {
      return var0 == 0?true:(var0 == 13?true:(var0 == 10?true:(var0 == 11?true:(var0 == 27?true:(var0 == 22?true:(var0 == 21?true:var0 == 16))))));
   }

}
