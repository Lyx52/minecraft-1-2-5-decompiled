package mojang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aaj extends zk {

   public int b;
   public int c;
   public byte d;
   public byte e;
   public byte[] f = new byte[16384];
   public int g;
   public List h = new ArrayList();
   private Map j = new HashMap();
   public List i = new ArrayList();


   public aaj(String var1) {
      super(var1);
   }

   public void a(ady var1) {
      this.d = var1.d("dimension");
      this.b = var1.f("xCenter");
      this.c = var1.f("zCenter");
      this.e = var1.d("scale");
      if(this.e < 0) {
         this.e = 0;
      }

      if(this.e > 4) {
         this.e = 4;
      }

      short var2 = var1.e("width");
      short var3 = var1.e("height");
      if(var2 == 128 && var3 == 128) {
         this.f = var1.k("colors");
      } else {
         byte[] var4 = var1.k("colors");
         this.f = new byte[16384];
         int var5 = (128 - var2) / 2;
         int var6 = (128 - var3) / 2;

         for(int var7 = 0; var7 < var3; ++var7) {
            int var8 = var7 + var6;
            if(var8 >= 0 || var8 < 128) {
               for(int var9 = 0; var9 < var2; ++var9) {
                  int var10 = var9 + var5;
                  if(var10 >= 0 || var10 < 128) {
                     this.f[var10 + var8 * 128] = var4[var9 + var7 * var2];
                  }
               }
            }
         }
      }

   }

   public void b(ady var1) {
      var1.a("dimension", this.d);
      var1.a("xCenter", this.b);
      var1.a("zCenter", this.c);
      var1.a("scale", this.e);
      var1.a("width", (short)128);
      var1.a("height", (short)128);
      var1.a("colors", this.f);
   }

   public void a(yw var1, aan var2) {
      if(!this.j.containsKey(var1)) {
         nk var3 = new nk(this, var1);
         this.j.put(var1, var3);
         this.h.add(var3);
      }

      this.i.clear();

      for(int var14 = 0; var14 < this.h.size(); ++var14) {
         nk var4 = (nk)this.h.get(var14);
         if(!var4.a.G && var4.a.ap.c(var2)) {
            float var5 = (float)(var4.a.o - (double)this.b) / (float)(1 << this.e);
            float var6 = (float)(var4.a.q - (double)this.c) / (float)(1 << this.e);
            byte var7 = 64;
            byte var8 = 64;
            if(var5 >= (float)(-var7) && var6 >= (float)(-var8) && var5 <= (float)var7 && var6 <= (float)var8) {
               byte var9 = 0;
               byte var10 = (byte)((int)((double)(var5 * 2.0F) + 0.5D));
               byte var11 = (byte)((int)((double)(var6 * 2.0F) + 0.5D));
               byte var12 = (byte)((int)((double)(var1.u * 16.0F / 360.0F) + 0.5D));
               if(this.d < 0) {
                  int var13 = this.g / 10;
                  var12 = (byte)(var13 * var13 * 34187121 + var13 * 121 >> 15 & 15);
               }

               if(var4.a.aB == this.d) {
                  this.i.add(new tv(this, var9, var10, var11, var12));
               }
            }
         } else {
            this.j.remove(var4.a);
            this.h.remove(var4);
         }
      }

   }

   public void a(int var1, int var2, int var3) {
      super.a();

      for(int var4 = 0; var4 < this.h.size(); ++var4) {
         nk var5 = (nk)this.h.get(var4);
         if(var5.b[var1] < 0 || var5.b[var1] > var2) {
            var5.b[var1] = var2;
         }

         if(var5.c[var1] < 0 || var5.c[var1] < var3) {
            var5.c[var1] = var3;
         }
      }

   }

   public void a(byte[] var1) {
      int var2;
      if(var1[0] == 0) {
         var2 = var1[1] & 255;
         int var3 = var1[2] & 255;

         for(int var4 = 0; var4 < var1.length - 3; ++var4) {
            this.f[(var4 + var3) * 128 + var2] = var1[var4 + 3];
         }

         this.a();
      } else if(var1[0] == 1) {
         this.i.clear();

         for(var2 = 0; var2 < (var1.length - 1) / 3; ++var2) {
            byte var7 = (byte)(var1[var2 * 3 + 1] % 16);
            byte var8 = var1[var2 * 3 + 2];
            byte var5 = var1[var2 * 3 + 3];
            byte var6 = (byte)(var1[var2 * 3 + 1] / 16);
            this.i.add(new tv(this, var7, var8, var5, var6));
         }
      }

   }
}
