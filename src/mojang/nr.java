package mojang;

import java.util.ArrayList;
import java.util.Random;

public class nr extends pb {

   private pb a;


   protected nr(int var1, pb var2) {
      super(var1, var2.bN, var2.cd);
      this.a = var2;
      this.c(var2.bP);
      this.b(var2.bQ / 3.0F);
      this.a(var2.cb);
      this.f(255);
   }

   public void a(WorldInterface var1, int var2, int var3, int var4) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public wu c(World var1, int var2, int var3, int var4) {
      return super.c(var1, var2, var3, var4);
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int d() {
      return 10;
   }

   public boolean a(WorldInterface var1, int var2, int var3, int var4, int var5) {
      return super.a(var1, var2, var3, var4, var5);
   }

   public void a(World var1, int var2, int var3, int var4, wu var5, ArrayList var6) {
      int var7 = var1.e(var2, var3, var4);
      int var8 = var7 & 3;
      float var9 = 0.0F;
      float var10 = 0.5F;
      float var11 = 0.5F;
      float var12 = 1.0F;
      if((var7 & 4) != 0) {
         var9 = 0.5F;
         var10 = 1.0F;
         var11 = 0.0F;
         var12 = 0.5F;
      }

      this.a(0.0F, var9, 0.0F, 1.0F, var10, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6);
      if(var8 == 0) {
         this.a(0.5F, var11, 0.0F, 1.0F, var12, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if(var8 == 1) {
         this.a(0.0F, var11, 0.0F, 0.5F, var12, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if(var8 == 2) {
         this.a(0.0F, var11, 0.5F, 1.0F, var12, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if(var8 == 3) {
         this.a(0.0F, var11, 0.0F, 1.0F, var12, 0.5F);
         super.a(var1, var2, var3, var4, var5, var6);
      }

      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void b(World var1, int var2, int var3, int var4, Random var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   public void a(World var1, int var2, int var3, int var4, Player var5) {
      this.a.a(var1, var2, var3, var4, var5);
   }

   public void b(World var1, int var2, int var3, int var4, int var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   public int d(WorldInterface var1, int var2, int var3, int var4) {
      return this.a.d(var1, var2, var3, var4);
   }

   public float e(WorldInterface var1, int var2, int var3, int var4) {
      return this.a.e(var1, var2, var3, var4);
   }

   public float a(BaseEntity var1) {
      return this.a.a(var1);
   }

   public int c() {
      return this.a.c();
   }

   public int a(int var1, int var2) {
      return this.a.a(var1, 0);
   }

   public int a_(int var1) {
      return this.a.a(var1, 0);
   }

   public int e() {
      return this.a.e();
   }

   public wu d(World var1, int var2, int var3, int var4) {
      return this.a.d(var1, var2, var3, var4);
   }

   public void a(World var1, int var2, int var3, int var4, BaseEntity var5, bo var6) {
      this.a.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean j() {
      return this.a.j();
   }

   public boolean a(int var1, boolean var2) {
      return this.a.a(var1, var2);
   }

   public boolean e(World var1, int var2, int var3, int var4) {
      return this.a.e(var1, var2, var3, var4);
   }

   public void a(World var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, 0);
      this.a.a(var1, var2, var3, var4);
   }

   public void b_(World var1, int var2, int var3, int var4) {
      this.a.b_(var1, var2, var3, var4);
   }

   public void b(World var1, int var2, int var3, int var4, BaseEntity var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   public void a(World var1, int var2, int var3, int var4, Random var5) {
      this.a.a(var1, var2, var3, var4, var5);
   }

   public boolean b(World var1, int var2, int var3, int var4, Player var5) {
      return this.a.b(var1, var2, var3, var4, var5);
   }

   public void b(World var1, int var2, int var3, int var4) {
      this.a.b(var1, var2, var3, var4);
   }

   public void a(World var1, int var2, int var3, int var4, Mob var5) {
      int var6 = Utils.c((double)(var5.u * 4.0F / 360.0F) + 0.5D) & 3;
      int var7 = var1.e(var2, var3, var4) & 4;
      if(var6 == 0) {
         var1.f(var2, var3, var4, 2 | var7);
      }

      if(var6 == 1) {
         var1.f(var2, var3, var4, 1 | var7);
      }

      if(var6 == 2) {
         var1.f(var2, var3, var4, 3 | var7);
      }

      if(var6 == 3) {
         var1.f(var2, var3, var4, 0 | var7);
      }

   }

   public void c(World var1, int var2, int var3, int var4, int var5) {
      if(var5 == 0) {
         int var6 = var1.e(var2, var3, var4);
         var1.f(var2, var3, var4, var6 | 4);
      }

   }
}
