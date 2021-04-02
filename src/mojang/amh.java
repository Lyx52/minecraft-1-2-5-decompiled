package mojang;

import java.util.ArrayList;
import java.util.Random;

public class amh extends pb {

   public static final String[] a = new String[]{"stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick"};
   private boolean b;


   public amh(int var1, boolean var2) {
      super(var1, 6, acn.e);
      this.b = var2;
      if(!var2) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      } else {
         n[var1] = true;
      }

      this.f(255);
   }

   public void a(WorldInterface var1, int var2, int var3, int var4) {
      if(this.b) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         boolean var5 = (var1.e(var2, var3, var4) & 8) != 0;
         if(var5) {
            this.a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
         } else {
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         }
      }

   }

   public void h() {
      if(this.b) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

   }

   public void a(World var1, int var2, int var3, int var4, wu var5, ArrayList var6) {
      this.a(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5, var6);
   }

   public int a(int var1, int var2) {
      int var3 = var2 & 7;
      return var3 == 0?(var1 <= 1?6:5):(var3 == 1?(var1 == 0?208:(var1 == 1?176:192)):(var3 == 2?4:(var3 == 3?16:(var3 == 4? al.bN:(var3 == 5? bm.bN:6)))));
   }

   public int a_(int var1) {
      return this.a(var1, 0);
   }

   public boolean a() {
      return this.b;
   }

   public void c(World var1, int var2, int var3, int var4, int var5) {
      if(var5 == 0 && !this.b) {
         int var6 = var1.e(var2, var3, var4) & 7;
         var1.f(var2, var3, var4, var6 | 8);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return ak.bO;
   }

   public int a(Random var1) {
      return this.b?2:1;
   }

   protected int c(int var1) {
      return var1 & 7;
   }

   public boolean b() {
      return this.b;
   }

   public boolean a(WorldInterface var1, int var2, int var3, int var4, int var5) {
      if(this.b) {
         super.a(var1, var2, var3, var4, var5);
      }

      if(var5 != 1 && var5 != 0 && !super.a(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         int var6 = var2 + qs.b[qs.a[var5]];
         int var7 = var3 + qs.c[qs.a[var5]];
         int var8 = var4 + qs.d[qs.a[var5]];
         boolean var9 = (var1.e(var6, var7, var8) & 8) != 0;
         return !var9?(var5 == 1?true:(var5 == 0 && super.a(var1, var2, var3, var4, var5)?true:var1.a(var2, var3, var4) != this.bO || (var1.e(var2, var3, var4) & 8) != 0)):(var5 == 0?true:(var5 == 1 && super.a(var1, var2, var3, var4, var5)?true:var1.a(var2, var3, var4) != this.bO || (var1.e(var2, var3, var4) & 8) == 0));
      }
   }

   protected aan b(int var1) {
      return new aan(ak.bO, 1, var1 & 7);
   }

}
