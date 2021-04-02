package mojang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class agh {

   public boolean a = false;
   private Random h = new Random();
   private World i;
   public double b;
   public double c;
   public double d;
   public BaseEntity e;
   public float f;
   public Set g = new HashSet();


   public agh(World var1, BaseEntity var2, double var3, double var5, double var7, float var9) {
      this.i = var1;
      this.e = var2;
      this.f = var9;
      this.b = var3;
      this.c = var5;
      this.d = var7;
   }

   public void a() {
      float var1 = this.f;
      byte var2 = 16;

      int var3;
      int var4;
      int var5;
      double var15;
      double var17;
      double var19;
      for(var3 = 0; var3 < var2; ++var3) {
         for(var4 = 0; var4 < var2; ++var4) {
            for(var5 = 0; var5 < var2; ++var5) {
               if(var3 == 0 || var3 == var2 - 1 || var4 == 0 || var4 == var2 - 1 || var5 == 0 || var5 == var2 - 1) {
                  double var6 = (double)((float)var3 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                  double var8 = (double)((float)var4 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                  double var10 = (double)((float)var5 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                  double var12 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10);
                  var6 /= var12;
                  var8 /= var12;
                  var10 /= var12;
                  float var14 = this.f * (0.7F + this.i.r.nextFloat() * 0.6F);
                  var15 = this.b;
                  var17 = this.c;
                  var19 = this.d;

                  for(float var21 = 0.3F; var14 > 0.0F; var14 -= var21 * 0.75F) {
                     int var22 = Utils.c(var15);
                     int var23 = Utils.c(var17);
                     int var24 = Utils.c(var19);
                     int var25 = this.i.a(var22, var23, var24);
                     if(var25 > 0) {
                        var14 -= (pb.m[var25].a(this.e) + 0.3F) * var21;
                     }

                     if(var14 > 0.0F) {
                        this.g.add(new qo(var22, var23, var24));
                     }

                     var15 += var6 * (double)var21;
                     var17 += var8 * (double)var21;
                     var19 += var10 * (double)var21;
                  }
               }
            }
         }
      }

      this.f *= 2.0F;
      var3 = Utils.c(this.b - (double)this.f - 1.0D);
      var4 = Utils.c(this.b + (double)this.f + 1.0D);
      var5 = Utils.c(this.c - (double)this.f - 1.0D);
      int var29 = Utils.c(this.c + (double)this.f + 1.0D);
      int var7 = Utils.c(this.d - (double)this.f - 1.0D);
      int var30 = Utils.c(this.d + (double)this.f + 1.0D);
      List var9 = this.i.b(this.e, wu.b((double)var3, (double)var5, (double)var7, (double)var4, (double)var29, (double)var30));
      bo var31 = bo.b(this.b, this.c, this.d);

      for(int var11 = 0; var11 < var9.size(); ++var11) {
         BaseEntity var33 = (BaseEntity)var9.get(var11);
         double var13 = var33.g(this.b, this.c, this.d) / (double)this.f;
         if(var13 <= 1.0D) {
            var15 = var33.o - this.b;
            var17 = var33.p - this.c;
            var19 = var33.q - this.d;
            double var34 = (double) Utils.sqrt(var15 * var15 + var17 * var17 + var19 * var19);
            var15 /= var34;
            var17 /= var34;
            var19 /= var34;
            double var35 = (double)this.i.a(var31, var33.y);
            double var36 = (1.0D - var13) * var35;
            var33.a(md.l, (int)((var36 * var36 + var36) / 2.0D * 8.0D * (double)this.f + 1.0D));
            var33.r += var15 * var36;
            var33.s += var17 * var36;
            var33.t += var19 * var36;
         }
      }

      this.f = var1;
      ArrayList var32 = new ArrayList();
      var32.addAll(this.g);
   }

   public void a(boolean var1) {
      this.i.a(this.b, this.c, this.d, "random.explode", 4.0F, (1.0F + (this.i.r.nextFloat() - this.i.r.nextFloat()) * 0.2F) * 0.7F);
      this.i.a("hugeexplosion", this.b, this.c, this.d, 0.0D, 0.0D, 0.0D);
      ArrayList var2 = new ArrayList();
      var2.addAll(this.g);

      int var3;
      qo var4;
      int var5;
      int var6;
      int var7;
      int var8;
      for(var3 = var2.size() - 1; var3 >= 0; --var3) {
         var4 = (qo)var2.get(var3);
         var5 = var4.a;
         var6 = var4.b;
         var7 = var4.c;
         var8 = this.i.a(var5, var6, var7);
         if(var1) {
            double var9 = (double)((float)var5 + this.i.r.nextFloat());
            double var11 = (double)((float)var6 + this.i.r.nextFloat());
            double var13 = (double)((float)var7 + this.i.r.nextFloat());
            double var15 = var9 - this.b;
            double var17 = var11 - this.c;
            double var19 = var13 - this.d;
            double var21 = (double) Utils.sqrt(var15 * var15 + var17 * var17 + var19 * var19);
            var15 /= var21;
            var17 /= var21;
            var19 /= var21;
            double var23 = 0.5D / (var21 / (double)this.f + 0.1D);
            var23 *= (double)(this.i.r.nextFloat() * this.i.r.nextFloat() + 0.3F);
            var15 *= var23;
            var17 *= var23;
            var19 *= var23;
            this.i.a("explode", (var9 + this.b * 1.0D) / 2.0D, (var11 + this.c * 1.0D) / 2.0D, (var13 + this.d * 1.0D) / 2.0D, var15, var17, var19);
            this.i.a("smoke", var9, var11, var13, var15, var17, var19);
         }

         if(var8 > 0) {
            pb.m[var8].a(this.i, var5, var6, var7, this.i.e(var5, var6, var7), 0.3F, 0);
            this.i.g(var5, var6, var7, 0);
            pb.m[var8].b(this.i, var5, var6, var7);
         }
      }

      if(this.a) {
         for(var3 = var2.size() - 1; var3 >= 0; --var3) {
            var4 = (qo)var2.get(var3);
            var5 = var4.a;
            var6 = var4.b;
            var7 = var4.c;
            var8 = this.i.a(var5, var6, var7);
            int var25 = this.i.a(var5, var6 - 1, var7);
            if(var8 == 0 && pb.n[var25] && this.h.nextInt(3) == 0) {
               this.i.g(var5, var6, var7, pb.ar.bO);
            }
         }
      }

   }
}
