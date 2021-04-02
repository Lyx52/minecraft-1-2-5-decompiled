package mojang;

import java.util.ArrayList;
import java.util.Random;

public class tc extends agy {

   public static boolean a = false;


   protected tc(int var1, acn var2) {
      super(var1, 0, var2);
      this.a(1.0F);
   }

   public kw u_() {
      return new bw();
   }

   public void a(WorldInterface var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, var5, 1.0F);
   }

   public boolean a(WorldInterface var1, int var2, int var3, int var4, int var5) {
      return var5 != 0?false:super.a(var1, var2, var3, var4, var5);
   }

   public void a(World var1, int var2, int var3, int var4, wu var5, ArrayList var6) {}

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(World var1, int var2, int var3, int var4, BaseEntity var5) {
      if(var5.j == null && var5.i == null && var5 instanceof Player && !var1.F) {
         ((Player)var5).c(1);
      }

   }

   public void b(World var1, int var2, int var3, int var4, Random var5) {
      double var6 = (double)((float)var2 + var5.nextFloat());
      double var8 = (double)((float)var3 + 0.8F);
      double var10 = (double)((float)var4 + var5.nextFloat());
      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = 0.0D;
      var1.a("smoke", var6, var8, var10, var12, var14, var16);
   }

   public int d() {
      return -1;
   }

   public void a(World var1, int var2, int var3, int var4) {
      if(!a) {
         if(var1.t.g != 0) {
            var1.g(var2, var3, var4, 0);
         }
      }
   }

}
