package mojang;

import java.util.List;

public abstract class av extends BaseEntity {

   private int d = -1;
   private int e = -1;
   private int am = -1;
   private int an = 0;
   protected boolean a = false;
   public int b = 0;
   protected Mob c;
   private int ao;
   private int ap = 0;


   public av(World var1) {
      super(var1);
      this.a(0.25F, 0.25F);
   }

   protected void b() {}

   public boolean a(double var1) {
      double var3 = this.y.c() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public av(World var1, Mob var2) {
      super(var1);
      this.c = var2;
      this.a(0.25F, 0.25F);
      this.c(var2.o, var2.p + (double)var2.I(), var2.q, var2.u, var2.v);
      this.o -= (double)(Utils.cos(this.u / 180.0F * 3.1415927F) * 0.16F);
      this.p -= 0.10000000149011612D;
      this.q -= (double)(Utils.sin(this.u / 180.0F * 3.1415927F) * 0.16F);
      this.d(this.o, this.p, this.q);
      this.H = 0.0F;
      float var3 = 0.4F;
      this.r = (double)(-Utils.sin(this.u / 180.0F * 3.1415927F) * Utils.cos(this.v / 180.0F * 3.1415927F) * var3);
      this.t = (double)(Utils.cos(this.u / 180.0F * 3.1415927F) * Utils.cos(this.v / 180.0F * 3.1415927F) * var3);
      this.s = (double)(-Utils.sin((this.v + this.d()) / 180.0F * 3.1415927F) * var3);
      this.a(this.r, this.s, this.t, this.c(), 1.0F);
   }

   public av(World var1, double var2, double var4, double var6) {
      super(var1);
      this.ao = 0;
      this.a(0.25F, 0.25F);
      this.d(var2, var4, var6);
      this.H = 0.0F;
   }

   protected float c() {
      return 1.5F;
   }

   protected float d() {
      return 0.0F;
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      float var9 = Utils.sqrt(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.U.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.U.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.U.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.r = var1;
      this.s = var3;
      this.t = var5;
      float var10 = Utils.sqrt(var1 * var1 + var5 * var5);
      this.w = this.u = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.x = this.v = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.ao = 0;
   }

   public void a(double var1, double var3, double var5) {
      this.r = var1;
      this.s = var3;
      this.t = var5;
      if(this.x == 0.0F && this.w == 0.0F) {
         float var7 = Utils.sqrt(var1 * var1 + var5 * var5);
         this.w = this.u = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
         this.x = this.v = (float)(Math.atan2(var3, (double)var7) * 180.0D / 3.1415927410125732D);
      }

   }

   public void J_() {
      this.N = this.o;
      this.O = this.p;
      this.P = this.q;
      super.J_();
      if(this.b > 0) {
         --this.b;
      }

      if(this.a) {
         int var1 = this.k.a(this.d, this.e, this.am);
         if(var1 == this.an) {
            ++this.ao;
            if(this.ao == 1200) {
               this.A();
            }

            return;
         }

         this.a = false;
         this.r *= (double)(this.U.nextFloat() * 0.2F);
         this.s *= (double)(this.U.nextFloat() * 0.2F);
         this.t *= (double)(this.U.nextFloat() * 0.2F);
         this.ao = 0;
         this.ap = 0;
      } else {
         ++this.ap;
      }

      bo var15 = bo.b(this.o, this.p, this.q);
      bo var2 = bo.b(this.o + this.r, this.p + this.s, this.q + this.t);
      pl var3 = this.k.a(var15, var2);
      var15 = bo.b(this.o, this.p, this.q);
      var2 = bo.b(this.o + this.r, this.p + this.s, this.q + this.t);
      if(var3 != null) {
         var2 = bo.b(var3.f.a, var3.f.b, var3.f.c);
      }

      if(!this.k.F) {
         BaseEntity var4 = null;
         List var5 = this.k.b((BaseEntity)this, this.y.a(this.r, this.s, this.t).b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         for(int var8 = 0; var8 < var5.size(); ++var8) {
            BaseEntity var9 = (BaseEntity)var5.get(var8);
            if(var9.l_() && (var9 != this.c || this.ap >= 5)) {
               float var10 = 0.3F;
               wu var11 = var9.y.b((double)var10, (double)var10, (double)var10);
               pl var12 = var11.a(var15, var2);
               if(var12 != null) {
                  double var13 = var15.d(var12.f);
                  if(var13 < var6 || var6 == 0.0D) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if(var4 != null) {
            var3 = new pl(var4);
         }
      }

      if(var3 != null) {
         this.a(var3);
      }

      this.o += this.r;
      this.p += this.s;
      this.q += this.t;
      float var16 = Utils.sqrt(this.r * this.r + this.t * this.t);
      this.u = (float)(Math.atan2(this.r, this.t) * 180.0D / 3.1415927410125732D);

      for(this.v = (float)(Math.atan2(this.s, (double)var16) * 180.0D / 3.1415927410125732D); this.v - this.x < -180.0F; this.x -= 360.0F) {
         ;
      }

      while(this.v - this.x >= 180.0F) {
         this.x += 360.0F;
      }

      while(this.u - this.w < -180.0F) {
         this.w -= 360.0F;
      }

      while(this.u - this.w >= 180.0F) {
         this.w += 360.0F;
      }

      this.v = this.x + (this.v - this.x) * 0.2F;
      this.u = this.w + (this.u - this.w) * 0.2F;
      float var17 = 0.99F;
      float var18 = this.e();
      if(this.H()) {
         for(int var7 = 0; var7 < 4; ++var7) {
            float var19 = 0.25F;
            this.k.a("bubble", this.o - this.r * (double)var19, this.p - this.s * (double)var19, this.q - this.t * (double)var19, this.r, this.s, this.t);
         }

         var17 = 0.8F;
      }

      this.r *= (double)var17;
      this.s *= (double)var17;
      this.t *= (double)var17;
      this.s -= (double)var18;
      this.d(this.o, this.p, this.q);
   }

   protected float e() {
      return 0.03F;
   }

   protected abstract void a(pl var1);

   public void b(CompundTag var1) {
      var1.addShort("xTile", (short)this.d);
      var1.addShort("yTile", (short)this.e);
      var1.addShort("zTile", (short)this.am);
      var1.addByte("inTile", (byte)this.an);
      var1.addByte("shake", (byte)this.b);
      var1.addByte("inGround", (byte)(this.a?1:0));
   }

   public void a(CompundTag var1) {
      this.d = var1.getShort("xTile");
      this.e = var1.getShort("yTile");
      this.am = var1.getShort("zTile");
      this.an = var1.getByte("inTile") & 255;
      this.b = var1.getByte("shake") & 255;
      this.a = var1.getByte("inGround") == 1;
   }

   public void a(Player var1) {}

   public float h_() {
      return 0.0F;
   }
}
