package mojang;

import java.util.Iterator;
import java.util.List;

public class adq {

   private World a;
   private boolean b = false;
   private int c = -1;
   private int d;
   private int e;
   private kd f;
   private int g;
   private int h;
   private int i;


   public adq(World var1) {
      this.a = var1;
   }

   public void a() {
      boolean var1 = false;
      if(var1) {
         if(this.c == 2) {
            this.d = 100;
            return;
         }
      } else {
         if(this.a.m()) {
            this.c = 0;
            return;
         }

         if(this.c == 2) {
            return;
         }

         if(this.c == 0) {
            float var2 = this.a.c(0.0F);
            if((double)var2 < 0.5D || (double)var2 > 0.501D) {
               return;
            }

            this.c = this.a.r.nextInt(10) == 0?1:2;
            this.b = false;
            if(this.c == 2) {
               return;
            }
         }
      }

      if(!this.b) {
         if(!this.b()) {
            return;
         }

         this.b = true;
      }

      if(this.e > 0) {
         --this.e;
      } else {
         this.e = 2;
         if(this.d > 0) {
            this.c();
            --this.d;
         } else {
            this.c = 2;
         }

      }
   }

   private boolean b() {
      List var1 = this.a.d;
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Player var3 = (Player)var2.next();
         this.f = this.a.A.a((int)var3.o, (int)var3.p, (int)var3.q, 1);
         if(this.f != null && this.f.c() >= 10 && this.f.d() >= 20 && this.f.e() >= 20) {
            uh var4 = this.f.a();
            float var5 = (float)this.f.b();
            boolean var6 = false;
            int var7 = 0;

            while(true) {
               if(var7 < 10) {
                  this.g = var4.a + (int)((double)(Utils.cos(this.a.r.nextFloat() * 3.1415927F * 2.0F) * var5) * 0.9D);
                  this.h = var4.b;
                  this.i = var4.c + (int)((double)(Utils.sin(this.a.r.nextFloat() * 3.1415927F * 2.0F) * var5) * 0.9D);
                  var6 = false;
                  Iterator var8 = this.a.A.b().iterator();

                  while(var8.hasNext()) {
                     kd var9 = (kd)var8.next();
                     if(var9 != this.f && var9.a(this.g, this.h, this.i)) {
                        var6 = true;
                        break;
                     }
                  }

                  if(var6) {
                     ++var7;
                     continue;
                  }
               }

               if(var6) {
                  return false;
               }

               bo var10 = this.a(this.g, this.h, this.i);
               if(var10 != null) {
                  this.e = 0;
                  this.d = 20;
                  return true;
               }
               break;
            }
         }
      }

      return false;
   }

   private boolean c() {
      bo var1 = this.a(this.g, this.h, this.i);
      if(var1 == null) {
         return false;
      } else {
         Zombie var2;
         try {
            var2 = new Zombie(this.a);
         } catch (Exception var4) {
            var4.printStackTrace();
            return false;
         }

         var2.c(var1.a, var1.b, var1.c, this.a.r.nextFloat() * 360.0F, 0.0F);
         this.a.a((BaseEntity)var2);
         uh var3 = this.f.a();
         var2.b(var3.a, var3.b, var3.c, this.f.b());
         return true;
      }
   }

   private bo a(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < 10; ++var4) {
         int var5 = var1 + this.a.r.nextInt(16) - 8;
         int var6 = var2 + this.a.r.nextInt(6) - 3;
         int var7 = var3 + this.a.r.nextInt(16) - 8;
         if(this.f.a(var5, var6, var7) && vf.a(acf.a, this.a, var5, var6, var7)) {
            return bo.b((double)var5, (double)var6, (double)var7);
         }
      }

      return null;
   }
}
