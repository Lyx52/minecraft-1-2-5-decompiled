package mojang;

import java.util.List;

public class Fireball extends BaseEntity {

   private int e = -1;
   private int am = -1;
   private int an = -1;
   private int ao = 0;
   private boolean ap = false;
   public Mob a;
   private int aq;
   private int ar = 0;
   public double b;
   public double c;
   public double d;


   public Fireball(World var1) {
      super(var1);
      this.a(1.0F, 1.0F);
   }

   protected void b() {}

   public boolean a(double var1) {
      double var3 = this.y.c() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public Fireball(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.a(1.0F, 1.0F);
      this.c(var2, var4, var6, this.u, this.v);
      this.d(var2, var4, var6);
      double var14 = (double) Utils.sqrt(var8 * var8 + var10 * var10 + var12 * var12);
      this.b = var8 / var14 * 0.1D;
      this.c = var10 / var14 * 0.1D;
      this.d = var12 / var14 * 0.1D;
   }

   public Fireball(World var1, Mob var2, double var3, double var5, double var7) {
      super(var1);
      this.a = var2;
      this.a(1.0F, 1.0F);
      this.c(var2.o, var2.p, var2.q, var2.u, var2.v);
      this.d(this.o, this.p, this.q);
      this.H = 0.0F;
      this.r = this.s = this.t = 0.0D;
      var3 += this.U.nextGaussian() * 0.4D;
      var5 += this.U.nextGaussian() * 0.4D;
      var7 += this.U.nextGaussian() * 0.4D;
      double var9 = (double) Utils.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
      this.b = var3 / var9 * 0.1D;
      this.c = var5 / var9 * 0.1D;
      this.d = var7 / var9 * 0.1D;
   }

   public void J_() {
      if(!this.k.F && (this.a != null && this.a.G || !this.k.j((int)this.o, (int)this.p, (int)this.q))) {
         this.A();
      } else {
         super.J_();
         this.e(1);
         if(this.ap) {
            int var1 = this.k.a(this.e, this.am, this.an);
            if(var1 == this.ao) {
               ++this.aq;
               if(this.aq == 600) {
                  this.A();
               }

               return;
            }

            this.ap = false;
            this.r *= (double)(this.U.nextFloat() * 0.2F);
            this.s *= (double)(this.U.nextFloat() * 0.2F);
            this.t *= (double)(this.U.nextFloat() * 0.2F);
            this.aq = 0;
            this.ar = 0;
         } else {
            ++this.ar;
         }

         bo var15 = bo.b(this.o, this.p, this.q);
         bo var2 = bo.b(this.o + this.r, this.p + this.s, this.q + this.t);
         pl var3 = this.k.a(var15, var2);
         var15 = bo.b(this.o, this.p, this.q);
         var2 = bo.b(this.o + this.r, this.p + this.s, this.q + this.t);
         if(var3 != null) {
            var2 = bo.b(var3.f.a, var3.f.b, var3.f.c);
         }

         BaseEntity var4 = null;
         List var5 = this.k.b((BaseEntity)this, this.y.a(this.r, this.s, this.t).b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         for(int var8 = 0; var8 < var5.size(); ++var8) {
            BaseEntity var9 = (BaseEntity)var5.get(var8);
            if(var9.l_() && (!var9.a((BaseEntity)this.a) || this.ar >= 25)) {
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
         float var17 = 0.95F;
         if(this.H()) {
            for(int var18 = 0; var18 < 4; ++var18) {
               float var19 = 0.25F;
               this.k.a("bubble", this.o - this.r * (double)var19, this.p - this.s * (double)var19, this.q - this.t * (double)var19, this.r, this.s, this.t);
            }

            var17 = 0.8F;
         }

         this.r += this.b;
         this.s += this.c;
         this.t += this.d;
         this.r *= (double)var17;
         this.s *= (double)var17;
         this.t *= (double)var17;
         this.k.a("smoke", this.o, this.p + 0.5D, this.q, 0.0D, 0.0D, 0.0D);
         this.d(this.o, this.p, this.q);
      }
   }

   protected void a(pl var1) {
      if(!this.k.F) {
         if(var1.g != null && var1.g.a(md.a(this, this.a), 4)) {
            ;
         }

         this.k.a((BaseEntity)null, this.o, this.p, this.q, 1.0F, true);
         this.A();
      }

   }

   public void b(CompundTag var1) {
      var1.addShort("xTile", (short)this.e);
      var1.addShort("yTile", (short)this.am);
      var1.addShort("zTile", (short)this.an);
      var1.addByte("inTile", (byte)this.ao);
      var1.addByte("inGround", (byte)(this.ap?1:0));
   }

   public void a(CompundTag var1) {
      this.e = var1.getShort("xTile");
      this.am = var1.getShort("yTile");
      this.an = var1.getShort("zTile");
      this.ao = var1.getByte("inTile") & 255;
      this.ap = var1.getByte("inGround") == 1;
   }

   public boolean l_() {
      return true;
   }

   public float j_() {
      return 1.0F;
   }

   public boolean a(md var1, int var2) {
      this.K();
      if(var1.a() != null) {
         bo var3 = var1.a().Q();
         if(var3 != null) {
            this.r = var3.a;
            this.s = var3.b;
            this.t = var3.c;
            this.b = this.r * 0.1D;
            this.c = this.s * 0.1D;
            this.d = this.t * 0.1D;
         }

         if(var1.a() instanceof Mob) {
            this.a = (Mob)var1.a();
         }

         return true;
      } else {
         return false;
      }
   }

   public float h_() {
      return 0.0F;
   }

   public float a(float var1) {
      return 1.0F;
   }

   public int b(float var1) {
      return 15728880;
   }
}
