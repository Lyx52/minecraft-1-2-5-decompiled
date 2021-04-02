package mojang;

public abstract class aaa extends Mob {

   private vu a;
   protected BaseEntity ao;
   protected boolean ap = false;
   protected int aq = 0;


   public aaa(World var1) {
      super(var1);
   }

   protected boolean an() {
      return false;
   }

   protected void y_() {
      lv.a("ai");
      if(this.aq > 0) {
         --this.aq;
      }

      this.ap = this.an();
      float var1 = 16.0F;
      if(this.ao == null) {
         this.ao = this.h();
         if(this.ao != null) {
            this.a = this.k.a(this, this.ao, var1, true, false, false, true);
         }
      } else if(!this.ao.M()) {
         this.ao = null;
      } else {
         float var2 = this.ao.e((BaseEntity)this);
         if(this.m(this.ao)) {
            this.a(this.ao, var2);
         } else {
            this.b(this.ao, var2);
         }
      }

      lv.b();
      if(!this.ap && this.ao != null && (this.a == null || this.U.nextInt(20) == 0)) {
         this.a = this.k.a(this, this.ao, var1, true, false, false, true);
      } else if(!this.ap && (this.a == null && this.U.nextInt(180) == 0 || this.U.nextInt(120) == 0 || this.aq > 0) && this.cd < 100) {
         this.ap();
      }

      int var21 = Utils.c(this.y.b + 0.5D);
      boolean var3 = this.H();
      boolean var4 = this.J();
      this.v = 0.0F;
      if(this.a != null && this.U.nextInt(100) != 0) {
         lv.a("followpath");
         bo var5 = this.a.a((BaseEntity)this);
         double var6 = (double)(this.I * 2.0F);

         while(var5 != null && var5.d(this.o, var5.b, this.q) < var6 * var6) {
            this.a.a();
            if(this.a.b()) {
               var5 = null;
               this.a = null;
            } else {
               var5 = this.a.a((BaseEntity)this);
            }
         }

         this.ch = false;
         if(var5 != null) {
            double var8 = var5.a - this.o;
            double var10 = var5.c - this.q;
            double var12 = var5.b - (double)var21;
            float var14 = (float)(Math.atan2(var10, var8) * 180.0D / 3.1415927410125732D) - 90.0F;
            float var15 = var14 - this.u;

            for(this.cf = this.cj; var15 < -180.0F; var15 += 360.0F) {
               ;
            }

            while(var15 >= 180.0F) {
               var15 -= 360.0F;
            }

            if(var15 > 30.0F) {
               var15 = 30.0F;
            }

            if(var15 < -30.0F) {
               var15 = -30.0F;
            }

            this.u += var15;
            if(this.ap && this.ao != null) {
               double var16 = this.ao.o - this.o;
               double var18 = this.ao.q - this.q;
               float var20 = this.u;
               this.u = (float)(Math.atan2(var18, var16) * 180.0D / 3.1415927410125732D) - 90.0F;
               var15 = (var20 - this.u + 90.0F) * 3.1415927F / 180.0F;
               this.ce = -Utils.sin(var15) * this.cf * 1.0F;
               this.cf = Utils.cos(var15) * this.cf * 1.0F;
            }

            if(var12 > 0.0D) {
               this.ch = true;
            }
         }

         if(this.ao != null) {
            this.a(this.ao, 30.0F, 30.0F);
         }

         if(this.A && !this.ar()) {
            this.ch = true;
         }

         if(this.U.nextFloat() < 0.8F && (var3 || var4)) {
            this.ch = true;
         }

         lv.b();
      } else {
         super.y_();
         this.a = null;
      }
   }

   protected void ap() {
      lv.a("stroll");
      boolean var1 = false;
      int var2 = -1;
      int var3 = -1;
      int var4 = -1;
      float var5 = -99999.0F;

      for(int var6 = 0; var6 < 10; ++var6) {
         int var7 = Utils.c(this.o + (double)this.U.nextInt(13) - 6.0D);
         int var8 = Utils.c(this.p + (double)this.U.nextInt(7) - 3.0D);
         int var9 = Utils.c(this.q + (double)this.U.nextInt(13) - 6.0D);
         float var10 = this.a(var7, var8, var9);
         if(var10 > var5) {
            var5 = var10;
            var2 = var7;
            var3 = var8;
            var4 = var9;
            var1 = true;
         }
      }

      if(var1) {
         this.a = this.k.a(this, var2, var3, var4, 10.0F, true, false, false, true);
      }

      lv.b();
   }

   protected void a(BaseEntity var1, float var2) {}

   protected void b(BaseEntity var1, float var2) {}

   public float a(int var1, int var2, int var3) {
      return 0.0F;
   }

   protected BaseEntity h() {
      return null;
   }

   public boolean i() {
      int var1 = Utils.c(this.o);
      int var2 = Utils.c(this.y.b);
      int var3 = Utils.c(this.q);
      return super.i() && this.a(var1, var2, var3) >= 0.0F;
   }

   public boolean ar() {
      return this.a != null;
   }

   public void a(vu var1) {
      this.a = var1;
   }

   public BaseEntity as() {
      return this.ao;
   }

   public void i(BaseEntity var1) {
      this.ao = var1;
   }

   protected float at() {
      if(this.b_()) {
         return 1.0F;
      } else {
         float var1 = super.at();
         if(this.aq > 0) {
            var1 *= 2.0F;
         }

         return var1;
      }
   }
}
