package mojang;

import java.util.ArrayList;
import java.util.List;

public class bo {

   private static List d = new ArrayList();
   private static int e = 0;
   public double a;
   public double b;
   public double c;


   public static bo a(double var0, double var2, double var4) {
      return new bo(var0, var2, var4);
   }

   public static void a() {
      d.clear();
      e = 0;
   }

   public static void b() {
      e = 0;
   }

   public static bo b(double var0, double var2, double var4) {
      if(e >= d.size()) {
         d.add(a(0.0D, 0.0D, 0.0D));
      }

      return ((bo)d.get(e++)).e(var0, var2, var4);
   }

   private bo(double var1, double var3, double var5) {
      if(var1 == -0.0D) {
         var1 = 0.0D;
      }

      if(var3 == -0.0D) {
         var3 = 0.0D;
      }

      if(var5 == -0.0D) {
         var5 = 0.0D;
      }

      this.a = var1;
      this.b = var3;
      this.c = var5;
   }

   private bo e(double var1, double var3, double var5) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      return this;
   }

   public bo a(bo var1) {
      return b(var1.a - this.a, var1.b - this.b, var1.c - this.c);
   }

   public bo c() {
      double var1 = (double) Utils.sqrt(this.a * this.a + this.b * this.b + this.c * this.c);
      return var1 < 1.0E-4D? b(0.0D, 0.0D, 0.0D): b(this.a / var1, this.b / var1, this.c / var1);
   }

   public double b(bo var1) {
      return this.a * var1.a + this.b * var1.b + this.c * var1.c;
   }

   public bo c(bo var1) {
      return b(this.b * var1.c - this.c * var1.b, this.c * var1.a - this.a * var1.c, this.a * var1.b - this.b * var1.a);
   }

   public bo c(double var1, double var3, double var5) {
      return b(this.a + var1, this.b + var3, this.c + var5);
   }

   public double d(bo var1) {
      double var2 = var1.a - this.a;
      double var4 = var1.b - this.b;
      double var6 = var1.c - this.c;
      return (double) Utils.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double e(bo var1) {
      double var2 = var1.a - this.a;
      double var4 = var1.b - this.b;
      double var6 = var1.c - this.c;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double d(double var1, double var3, double var5) {
      double var7 = var1 - this.a;
      double var9 = var3 - this.b;
      double var11 = var5 - this.c;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double d() {
      return (double) Utils.sqrt(this.a * this.a + this.b * this.b + this.c * this.c);
   }

   public bo a(bo var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if(var4 * var4 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.a) / var4;
         return var10 >= 0.0D && var10 <= 1.0D? b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10):null;
      }
   }

   public bo b(bo var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if(var6 * var6 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.b) / var6;
         return var10 >= 0.0D && var10 <= 1.0D? b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10):null;
      }
   }

   public bo c(bo var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if(var8 * var8 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.c) / var8;
         return var10 >= 0.0D && var10 <= 1.0D? b(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10):null;
      }
   }

   public String toString() {
      return "(" + this.a + ", " + this.b + ", " + this.c + ")";
   }

   public void a(float var1) {
      float var2 = Utils.cos(var1);
      float var3 = Utils.sin(var1);
      double var4 = this.a;
      double var6 = this.b * (double)var2 + this.c * (double)var3;
      double var8 = this.c * (double)var2 - this.b * (double)var3;
      this.a = var4;
      this.b = var6;
      this.c = var8;
   }

   public void b(float var1) {
      float var2 = Utils.cos(var1);
      float var3 = Utils.sin(var1);
      double var4 = this.a * (double)var2 + this.c * (double)var3;
      double var6 = this.b;
      double var8 = this.c * (double)var2 - this.a * (double)var3;
      this.a = var4;
      this.b = var6;
      this.c = var8;
   }

}
