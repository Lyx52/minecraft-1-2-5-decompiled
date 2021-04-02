package mojang;

import java.util.List;
import java.util.Random;

public class ul extends pb {

   private agw a;


   protected ul(int var1, int var2, agw var3, acn var4) {
      super(var1, var2, var4);
      this.a = var3;
      this.a(true);
      float var5 = 0.0625F;
      this.a(var5, 0.0F, var5, 1.0F - var5, 0.03125F, 1.0F - var5);
   }

   public int e() {
      return 20;
   }

   public wu c(World var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean b(WorldInterface var1, int var2, int var3, int var4) {
      return true;
   }

   public boolean e(World var1, int var2, int var3, int var4) {
      return var1.h(var2, var3 - 1, var4) || var1.a(var2, var3 - 1, var4) == aZ.bO;
   }

   public void a(World var1, int var2, int var3, int var4) {}

   public void a(World var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if(!var1.h(var2, var3 - 1, var4) && var1.a(var2, var3 - 1, var4) != aZ.bO) {
         var6 = true;
      }

      if(var6) {
         this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public void a(World var1, int var2, int var3, int var4, Random var5) {
      if(!var1.F) {
         if(var1.e(var2, var3, var4) != 0) {
            this.h(var1, var2, var3, var4);
         }
      }
   }

   public void a(World var1, int var2, int var3, int var4, BaseEntity var5) {
      if(!var1.F) {
         if(var1.e(var2, var3, var4) != 1) {
            this.h(var1, var2, var3, var4);
         }
      }
   }

   private void h(World var1, int var2, int var3, int var4) {
      boolean var5 = var1.e(var2, var3, var4) == 1;
      boolean var6 = false;
      float var7 = 0.125F;
      List var8 = null;
      if(this.a == agw.a) {
         var8 = var1.b((BaseEntity)null, wu.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + 0.25D, (double)((float)(var4 + 1) - var7)));
      }

      if(this.a == agw.b) {
         var8 = var1.a(Mob.class, wu.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + 0.25D, (double)((float)(var4 + 1) - var7)));
      }

      if(this.a == agw.c) {
         var8 = var1.a(Player.class, wu.b((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)var3 + 0.25D, (double)((float)(var4 + 1) - var7)));
      }

      if(var8.size() > 0) {
         var6 = true;
      }

      if(var6 && !var5) {
         var1.f(var2, var3, var4, 1);
         var1.j(var2, var3, var4, this.bO);
         var1.j(var2, var3 - 1, var4, this.bO);
         var1.c(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
      }

      if(!var6 && var5) {
         var1.f(var2, var3, var4, 0);
         var1.j(var2, var3, var4, this.bO);
         var1.j(var2, var3 - 1, var4, this.bO);
         var1.c(var2, var3, var4, var2, var3, var4);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
      }

      if(var6) {
         var1.a(var2, var3, var4, this.bO, this.e());
      }

   }

   public void b_(World var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      if(var5 > 0) {
         var1.j(var2, var3, var4, this.bO);
         var1.j(var2, var3 - 1, var4, this.bO);
      }

      super.b_(var1, var2, var3, var4);
   }

   public void a(WorldInterface var1, int var2, int var3, int var4) {
      boolean var5 = var1.e(var2, var3, var4) == 1;
      float var6 = 0.0625F;
      if(var5) {
         this.a(var6, 0.0F, var6, 1.0F - var6, 0.03125F, 1.0F - var6);
      } else {
         this.a(var6, 0.0F, var6, 1.0F - var6, 0.0625F, 1.0F - var6);
      }

   }

   public boolean b(WorldInterface var1, int var2, int var3, int var4, int var5) {
      return var1.e(var2, var3, var4) > 0;
   }

   public boolean e(World var1, int var2, int var3, int var4, int var5) {
      return var1.e(var2, var3, var4) == 0?false:var5 == 1;
   }

   public boolean g() {
      return true;
   }

   public void h() {
      float var1 = 0.5F;
      float var2 = 0.125F;
      float var3 = 0.5F;
      this.a(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }

   public int f() {
      return 1;
   }
}
