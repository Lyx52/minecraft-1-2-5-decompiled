package mojang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class cw {

   protected xd a;
   private List[] b = new List[4];
   private aaw c;
   private Random d = new Random();


   public cw(xd var1, aaw var2) {
      if(var1 != null) {
         this.a = var1;
      }

      this.c = var2;

      for(int var3 = 0; var3 < 4; ++var3) {
         this.b[var3] = new ArrayList();
      }

   }

   public void a(rt var1) {
      int var2 = var1.n();
      if(this.b[var2].size() >= 4000) {
         this.b[var2].remove(0);
      }

      this.b[var2].add(var1);
   }

   public void a() {
      for(int var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < this.b[var1].size(); ++var2) {
            rt var3 = (rt)this.b[var1].get(var2);
            var3.J_();
            if(var3.G) {
               this.b[var1].remove(var2--);
            }
         }
      }

   }

   public void a(nn var1, float var2) {
      float var3 = aau.d;
      float var4 = aau.f;
      float var5 = aau.g;
      float var6 = aau.h;
      float var7 = aau.e;
      rt.ar = var1.N + (var1.o - var1.N) * (double)var2;
      rt.as = var1.O + (var1.p - var1.O) * (double)var2;
      rt.at = var1.P + (var1.q - var1.P) * (double)var2;

      for(int var8 = 0; var8 < 3; ++var8) {
         if(this.b[var8].size() != 0) {
            int var9 = 0;
            if(var8 == 0) {
               var9 = this.c.b("/mojang/particles.png");
            }

            if(var8 == 1) {
               var9 = this.c.b("/mojang/terrain.png");
            }

            if(var8 == 2) {
               var9 = this.c.b("/mojang/gui/items.png");
            }

            GL11.glBindTexture(3553, var9);
            adz var10 = adz.a;
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            var10.b();

            for(int var11 = 0; var11 < this.b[var8].size(); ++var11) {
               rt var12 = (rt)this.b[var8].get(var11);
               var10.b(var12.b(var2));
               var12.a(var10, var2, var3, var7, var4, var5, var6);
            }

            var10.a();
         }
      }

   }

   public void b(nn var1, float var2) {
      float var4 = gk.b(var1.u * 0.017453292F);
      float var5 = gk.a(var1.u * 0.017453292F);
      float var6 = -var5 * gk.a(var1.v * 0.017453292F);
      float var7 = var4 * gk.a(var1.v * 0.017453292F);
      float var8 = gk.b(var1.v * 0.017453292F);
      byte var9 = 3;
      if(this.b[var9].size() != 0) {
         adz var10 = adz.a;

         for(int var11 = 0; var11 < this.b[var9].size(); ++var11) {
            rt var12 = (rt)this.b[var9].get(var11);
            var10.b(var12.b(var2));
            var12.a(var10, var2, var4, var8, var5, var6, var7);
         }

      }
   }

   public void a(xd var1) {
      this.a = var1;

      for(int var2 = 0; var2 < 4; ++var2) {
         this.b[var2].clear();
      }

   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      if(var4 != 0) {
         pb var6 = pb.m[var4];
         byte var7 = 4;

         for(int var8 = 0; var8 < var7; ++var8) {
            for(int var9 = 0; var9 < var7; ++var9) {
               for(int var10 = 0; var10 < var7; ++var10) {
                  double var11 = (double)var1 + ((double)var8 + 0.5D) / (double)var7;
                  double var13 = (double)var2 + ((double)var9 + 0.5D) / (double)var7;
                  double var15 = (double)var3 + ((double)var10 + 0.5D) / (double)var7;
                  int var17 = this.d.nextInt(6);
                  this.a((rt)(new mc(this.a, var11, var13, var15, var11 - (double)var1 - 0.5D, var13 - (double)var2 - 0.5D, var15 - (double)var3 - 0.5D, var6, var17, var5)).a(var1, var2, var3));
               }
            }
         }

      }
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = this.a.a(var1, var2, var3);
      if(var5 != 0) {
         pb var6 = pb.m[var5];
         float var7 = 0.1F;
         double var8 = (double)var1 + this.d.nextDouble() * (var6.bY - var6.bV - (double)(var7 * 2.0F)) + (double)var7 + var6.bV;
         double var10 = (double)var2 + this.d.nextDouble() * (var6.bZ - var6.bW - (double)(var7 * 2.0F)) + (double)var7 + var6.bW;
         double var12 = (double)var3 + this.d.nextDouble() * (var6.ca - var6.bX - (double)(var7 * 2.0F)) + (double)var7 + var6.bX;
         if(var4 == 0) {
            var10 = (double)var2 + var6.bW - (double)var7;
         }

         if(var4 == 1) {
            var10 = (double)var2 + var6.bZ + (double)var7;
         }

         if(var4 == 2) {
            var12 = (double)var3 + var6.bX - (double)var7;
         }

         if(var4 == 3) {
            var12 = (double)var3 + var6.ca + (double)var7;
         }

         if(var4 == 4) {
            var8 = (double)var1 + var6.bV - (double)var7;
         }

         if(var4 == 5) {
            var8 = (double)var1 + var6.bY + (double)var7;
         }

         this.a((new mc(this.a, var8, var10, var12, 0.0D, 0.0D, 0.0D, var6, var4, this.a.e(var1, var2, var3))).a(var1, var2, var3).c(0.2F).d(0.6F));
      }
   }

   public String b() {
      return "" + (this.b[0].size() + this.b[1].size() + this.b[2].size());
   }
}
