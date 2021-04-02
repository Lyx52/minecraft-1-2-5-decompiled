package mojang;

import java.util.ArrayList;
import java.util.Random;

public class xc extends agy {

   private Random a = new Random();


   public xc(int var1) {
      super(var1, acn.f);
      this.bN = 157;
   }

   public boolean a() {
      return false;
   }

   public int d() {
      return 25;
   }

   public kw u_() {
      return new amc();
   }

   public boolean b() {
      return false;
   }

   public void a(World var1, int var2, int var3, int var4, wu var5, ArrayList var6) {
      this.a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
      super.a(var1, var2, var3, var4, var5, var6);
      this.h();
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public void h() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public boolean b(World var1, int var2, int var3, int var4, Player var5) {
      if(var1.F) {
         return true;
      } else {
         amc var6 = (amc)var1.b(var2, var3, var4);
         if(var6 != null) {
            var5.a(var6);
         }

         return true;
      }
   }

   public void b(World var1, int var2, int var3, int var4, Random var5) {
      double var6 = (double)((float)var2 + 0.4F + var5.nextFloat() * 0.2F);
      double var8 = (double)((float)var3 + 0.7F + var5.nextFloat() * 0.3F);
      double var10 = (double)((float)var4 + 0.4F + var5.nextFloat() * 0.2F);
      var1.a("smoke", var6, var8, var10, 0.0D, 0.0D, 0.0D);
   }

   public void b_(World var1, int var2, int var3, int var4) {
      kw var5 = var1.b(var2, var3, var4);
      if(var5 != null && var5 instanceof amc) {
         amc var6 = (amc)var5;

         for(int var7 = 0; var7 < var6.a(); ++var7) {
            aan var8 = var6.k_(var7);
            if(var8 != null) {
               float var9 = this.a.nextFloat() * 0.8F + 0.1F;
               float var10 = this.a.nextFloat() * 0.8F + 0.1F;
               float var11 = this.a.nextFloat() * 0.8F + 0.1F;

               while(var8.a > 0) {
                  int var12 = this.a.nextInt(21) + 10;
                  if(var12 > var8.a) {
                     var12 = var8.a;
                  }

                  var8.a -= var12;
                  Item var13 = new Item(var1, (double)((float)var2 + var9), (double)((float)var3 + var10), (double)((float)var4 + var11), new aan(var8.c, var12, var8.i()));
                  float var14 = 0.05F;
                  var13.r = (double)((float)this.a.nextGaussian() * var14);
                  var13.s = (double)((float)this.a.nextGaussian() * var14 + 0.2F);
                  var13.t = (double)((float)this.a.nextGaussian() * var14);
                  var1.a((BaseEntity)var13);
               }
            }
         }
      }

      super.b_(var1, var2, var3, var4);
   }

   public int a(int var1, Random var2, int var3) {
      return yr.by.bQ;
   }
}
