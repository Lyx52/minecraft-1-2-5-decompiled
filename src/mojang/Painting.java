package mojang;

import java.util.ArrayList;
import java.util.List;

public class Painting extends BaseEntity {

   private int am;
   public int a;
   public int b;
   public int c;
   public int d;
   public go e;


   public Painting(World var1) {
      super(var1);
      this.am = 0;
      this.a = 0;
      this.H = 0.0F;
      this.a(0.5F, 0.5F);
   }

   public Painting(World var1, int var2, int var3, int var4, int var5) {
      this(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;
      ArrayList var6 = new ArrayList();
      go[] var7 = go.values();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         go var10 = var7[var9];
         this.e = var10;
         this.b(var5);
         if(this.n()) {
            var6.add(var10);
         }
      }

      if(var6.size() > 0) {
         this.e = (go)var6.get(this.U.nextInt(var6.size()));
      }

      this.b(var5);
   }

   public Painting(World var1, int var2, int var3, int var4, int var5, String var6) {
      this(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;
      go[] var7 = go.values();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         go var10 = var7[var9];
         if(var10.A.equals(var6)) {
            this.e = var10;
            break;
         }
      }

      this.b(var5);
   }

   protected void b() {}

   public void b(int var1) {
      this.a = var1;
      this.w = this.u = (float)(var1 * 90);
      float var2 = (float)this.e.B;
      float var3 = (float)this.e.C;
      float var4 = (float)this.e.B;
      if(var1 != 0 && var1 != 2) {
         var2 = 0.5F;
      } else {
         var4 = 0.5F;
      }

      var2 /= 32.0F;
      var3 /= 32.0F;
      var4 /= 32.0F;
      float var5 = (float)this.b + 0.5F;
      float var6 = (float)this.c + 0.5F;
      float var7 = (float)this.d + 0.5F;
      float var8 = 0.5625F;
      if(var1 == 0) {
         var7 -= var8;
      }

      if(var1 == 1) {
         var5 -= var8;
      }

      if(var1 == 2) {
         var7 += var8;
      }

      if(var1 == 3) {
         var5 += var8;
      }

      if(var1 == 0) {
         var5 -= this.c(this.e.B);
      }

      if(var1 == 1) {
         var7 += this.c(this.e.B);
      }

      if(var1 == 2) {
         var5 += this.c(this.e.B);
      }

      if(var1 == 3) {
         var7 -= this.c(this.e.B);
      }

      var6 += this.c(this.e.C);
      this.d((double)var5, (double)var6, (double)var7);
      float var9 = -0.00625F;
      this.y.c((double)(var5 - var2 - var9), (double)(var6 - var3 - var9), (double)(var7 - var4 - var9), (double)(var5 + var2 + var9), (double)(var6 + var3 + var9), (double)(var7 + var4 + var9));
   }

   private float c(int var1) {
      return var1 == 32?0.5F:(var1 == 64?0.5F:0.0F);
   }

   public void J_() {
      if(this.am++ == 100 && !this.k.F) {
         this.am = 0;
         if(!this.G && !this.n()) {
            this.A();
            this.k.a((BaseEntity)(new Item(this.k, this.o, this.p, this.q, new aan(yr.as))));
         }
      }

   }

   public boolean n() {
      if(this.k.a((BaseEntity)this, this.y).size() > 0) {
         return false;
      } else {
         int var1 = this.e.B / 16;
         int var2 = this.e.C / 16;
         int var3 = this.b;
         int var4 = this.c;
         int var5 = this.d;
         if(this.a == 0) {
            var3 = Utils.c(this.o - (double)((float)this.e.B / 32.0F));
         }

         if(this.a == 1) {
            var5 = Utils.c(this.q - (double)((float)this.e.B / 32.0F));
         }

         if(this.a == 2) {
            var3 = Utils.c(this.o - (double)((float)this.e.B / 32.0F));
         }

         if(this.a == 3) {
            var5 = Utils.c(this.q - (double)((float)this.e.B / 32.0F));
         }

         var4 = Utils.c(this.p - (double)((float)this.e.C / 32.0F));

         int var7;
         for(int var6 = 0; var6 < var1; ++var6) {
            for(var7 = 0; var7 < var2; ++var7) {
               acn var8;
               if(this.a != 0 && this.a != 2) {
                  var8 = this.k.f(this.b, var4 + var7, var5 + var6);
               } else {
                  var8 = this.k.f(var3 + var6, var4 + var7, this.d);
               }

               if(!var8.a()) {
                  return false;
               }
            }
         }

         List var9 = this.k.b((BaseEntity)this, this.y);

         for(var7 = 0; var7 < var9.size(); ++var7) {
            if(var9.get(var7) instanceof Painting) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean l_() {
      return true;
   }

   public boolean a(md var1, int var2) {
      if(!this.G && !this.k.F) {
         this.A();
         this.K();
         this.k.a((BaseEntity)(new Item(this.k, this.o, this.p, this.q, new aan(yr.as))));
      }

      return true;
   }

   public void b(CompundTag var1) {
      var1.addByte("Dir", (byte)this.a);
      var1.addString("Motive", this.e.A);
      var1.addInt("TileX", this.b);
      var1.addInt("TileY", this.c);
      var1.addInt("TileZ", this.d);
   }

   public void a(CompundTag var1) {
      this.a = var1.getByte("Dir");
      this.b = var1.getInt("TileX");
      this.c = var1.getInt("TileY");
      this.d = var1.getInt("TileZ");
      String var2 = var1.getString("Motive");
      go[] var3 = go.values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         go var6 = var3[var5];
         if(var6.A.equals(var2)) {
            this.e = var6;
         }
      }

      if(this.e == null) {
         this.e = go.a;
      }

      this.b(this.a);
   }

   public void b(double var1, double var3, double var5) {
      if(!this.k.F && !this.G && var1 * var1 + var3 * var3 + var5 * var5 > 0.0D) {
         this.A();
         this.k.a((BaseEntity)(new Item(this.k, this.o, this.p, this.q, new aan(yr.as))));
      }

   }

   public void c(double var1, double var3, double var5) {
      if(!this.k.F && !this.G && var1 * var1 + var3 * var3 + var5 * var5 > 0.0D) {
         this.A();
         this.k.a((BaseEntity)(new Item(this.k, this.o, this.p, this.q, new aan(yr.as))));
      }

   }
}
