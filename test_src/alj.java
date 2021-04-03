import java.util.Random;

public class alj extends agy {

   private Random a = new Random();


   protected alj(int var1) {
      super(var1, acn.e);
      this.bN = 45;
   }

   public int e() {
      return 4;
   }

   public int a(int var1, Random var2, int var3) {
      return pb.P.bO;
   }

   public void a(xd var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      this.h(var1, var2, var3, var4);
   }

   private void h(xd var1, int var2, int var3, int var4) {
      if(!var1.F) {
         int var5 = var1.a(var2, var3, var4 - 1);
         int var6 = var1.a(var2, var3, var4 + 1);
         int var7 = var1.a(var2 - 1, var3, var4);
         int var8 = var1.a(var2 + 1, var3, var4);
         byte var9 = 3;
         if(pb.n[var5] && !pb.n[var6]) {
            var9 = 3;
         }

         if(pb.n[var6] && !pb.n[var5]) {
            var9 = 2;
         }

         if(pb.n[var7] && !pb.n[var8]) {
            var9 = 5;
         }

         if(pb.n[var8] && !pb.n[var7]) {
            var9 = 4;
         }

         var1.f(var2, var3, var4, var9);
      }
   }

   public int d(ali var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return this.bN + 17;
      } else if(var5 == 0) {
         return this.bN + 17;
      } else {
         int var6 = var1.e(var2, var3, var4);
         return var5 != var6?this.bN:this.bN + 1;
      }
   }

   public int a_(int var1) {
      return var1 == 1?this.bN + 17:(var1 == 0?this.bN + 17:(var1 == 3?this.bN + 1:this.bN));
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      if(var1.F) {
         return true;
      } else {
         az var6 = (az)var1.b(var2, var3, var4);
         if(var6 != null) {
            var5.a(var6);
         }

         return true;
      }
   }

   private void c(xd var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.e(var2, var3, var4);
      byte var9 = 0;
      byte var10 = 0;
      if(var6 == 3) {
         var10 = 1;
      } else if(var6 == 2) {
         var10 = -1;
      } else if(var6 == 5) {
         var9 = 1;
      } else {
         var9 = -1;
      }

      az var11 = (az)var1.b(var2, var3, var4);
      if(var11 != null) {
         aan var12 = var11.m_();
         double var13 = (double)var2 + (double)var9 * 0.6D + 0.5D;
         double var15 = (double)var3 + 0.5D;
         double var17 = (double)var4 + (double)var10 * 0.6D + 0.5D;
         if(var12 == null) {
            var1.g(1001, var2, var3, var4, 0);
         } else {
            if(var12.c == yr.l.bQ) {
               nm var19 = new nm(var1, var13, var15, var17);
               var19.a((double)var9, 0.10000000149011612D, (double)var10, 1.1F, 6.0F);
               var19.a = true;
               var1.a((nn)var19);
               var1.g(1002, var2, var3, var4, 0);
            } else if(var12.c == yr.aP.bQ) {
               qe var22 = new qe(var1, var13, var15, var17);
               var22.a((double)var9, 0.10000000149011612D, (double)var10, 1.1F, 6.0F);
               var1.a((nn)var22);
               var1.g(1002, var2, var3, var4, 0);
            } else if(var12.c == yr.aD.bQ) {
               uq var23 = new uq(var1, var13, var15, var17);
               var23.a((double)var9, 0.10000000149011612D, (double)var10, 1.1F, 6.0F);
               var1.a((nn)var23);
               var1.g(1002, var2, var3, var4, 0);
            } else if(var12.c == yr.bs.bQ && ei.c(var12.i())) {
               bj var27 = new bj(var1, var13, var15, var17, var12.i());
               var27.a((double)var9, 0.10000000149011612D, (double)var10, 1.375F, 3.0F);
               var1.a((nn)var27);
               var1.g(1002, var2, var3, var4, 0);
            } else if(var12.c == yr.bD.bQ) {
               hf var24 = new hf(var1, var13, var15, var17);
               var24.a((double)var9, 0.10000000149011612D, (double)var10, 1.375F, 3.0F);
               var1.a((nn)var24);
               var1.g(1002, var2, var3, var4, 0);
            } else if(var12.c == yr.bC.bQ) {
               acv.a(var1, var12.i(), var13 + (double)var9 * 0.3D, var15 - 0.3D, var17 + (double)var10 * 0.3D);
               var1.g(1002, var2, var3, var4, 0);
            } else if(var12.c == yr.bE.bQ) {
               qb var25 = new qb(var1, var13 + (double)var9 * 0.3D, var15, var17 + (double)var10 * 0.3D, (double)var9 + var5.nextGaussian() * 0.05D, var5.nextGaussian() * 0.05D, (double)var10 + var5.nextGaussian() * 0.05D);
               var1.a((nn)var25);
               var1.g(1009, var2, var3, var4, 0);
            } else {
               fq var26 = new fq(var1, var13, var15 - 0.3D, var17, var12);
               double var20 = var5.nextDouble() * 0.1D + 0.2D;
               var26.r = (double)var9 * var20;
               var26.s = 0.20000000298023224D;
               var26.t = (double)var10 * var20;
               var26.r += var5.nextGaussian() * 0.007499999832361937D * 6.0D;
               var26.s += var5.nextGaussian() * 0.007499999832361937D * 6.0D;
               var26.t += var5.nextGaussian() * 0.007499999832361937D * 6.0D;
               var1.a((nn)var26);
               var1.g(1000, var2, var3, var4, 0);
            }

            var1.g(2000, var2, var3, var4, var9 + 1 + (var10 + 1) * 3);
         }
      }

   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      if(var5 > 0 && pb.m[var5].g()) {
         boolean var6 = var1.x(var2, var3, var4) || var1.x(var2, var3 + 1, var4);
         if(var6) {
            var1.a(var2, var3, var4, this.bO, this.e());
         }
      }

   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(!var1.F && (var1.x(var2, var3, var4) || var1.x(var2, var3 + 1, var4))) {
         this.c(var1, var2, var3, var4, var5);
      }

   }

   public kw u_() {
      return new az();
   }

   public void a(xd var1, int var2, int var3, int var4, acq var5) {
      int var6 = gk.c((double)(var5.u * 4.0F / 360.0F) + 0.5D) & 3;
      if(var6 == 0) {
         var1.f(var2, var3, var4, 2);
      }

      if(var6 == 1) {
         var1.f(var2, var3, var4, 5);
      }

      if(var6 == 2) {
         var1.f(var2, var3, var4, 3);
      }

      if(var6 == 3) {
         var1.f(var2, var3, var4, 4);
      }

   }

   public void b_(xd var1, int var2, int var3, int var4) {
      az var5 = (az)var1.b(var2, var3, var4);
      if(var5 != null) {
         for(int var6 = 0; var6 < var5.a(); ++var6) {
            aan var7 = var5.k_(var6);
            if(var7 != null) {
               float var8 = this.a.nextFloat() * 0.8F + 0.1F;
               float var9 = this.a.nextFloat() * 0.8F + 0.1F;
               float var10 = this.a.nextFloat() * 0.8F + 0.1F;

               while(var7.a > 0) {
                  int var11 = this.a.nextInt(21) + 10;
                  if(var11 > var7.a) {
                     var11 = var7.a;
                  }

                  var7.a -= var11;
                  fq var12 = new fq(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new aan(var7.c, var11, var7.i()));
                  if(var7.n()) {
                     var12.a.d((ady)var7.o().b());
                  }

                  float var13 = 0.05F;
                  var12.r = (double)((float)this.a.nextGaussian() * var13);
                  var12.s = (double)((float)this.a.nextGaussian() * var13 + 0.2F);
                  var12.t = (double)((float)this.a.nextGaussian() * var13);
                  var1.a((nn)var12);
               }
            }
         }
      }

      super.b_(var1, var2, var3, var4);
   }
}
