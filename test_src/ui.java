
public class ui extends akn implements xf {

   public int a = 0;
   public double b;
   public double c;
   public double d;
   private nn an = null;
   private int ao = 0;
   public int e = 0;
   public int am = 0;


   public ui(xd var1) {
      super(var1);
      this.bm = "/mob/ghast.png";
      this.a(4.0F, 4.0F);
      this.ab = true;
      this.bI = 5;
   }

   public boolean a(md var1, int var2) {
      if("fireball".equals(var1.l()) && var1.a() instanceof yw) {
         super.a(var1, 1000);
         ((yw)var1.a()).a((ajw)dp.y);
         return true;
      } else {
         return super.a(var1, var2);
      }
   }

   protected void b() {
      super.b();
      this.ac.a(16, Byte.valueOf((byte)0));
   }

   public int d() {
      return 10;
   }

   public void J_() {
      super.J_();
      byte var1 = this.ac.a(16);
      this.bm = var1 == 1?"/mob/ghast_fire.png":"/mob/ghast.png";
   }

   protected void y_() {
      if(!this.k.F && this.k.q == 0) {
         this.A();
      }

      this.w();
      this.e = this.am;
      double var1 = this.b - this.o;
      double var3 = this.c - this.p;
      double var5 = this.d - this.q;
      double var7 = (double)gk.a(var1 * var1 + var3 * var3 + var5 * var5);
      if(var7 < 1.0D || var7 > 60.0D) {
         this.b = this.o + (double)((this.U.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.c = this.p + (double)((this.U.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.d = this.q + (double)((this.U.nextFloat() * 2.0F - 1.0F) * 16.0F);
      }

      if(this.a-- <= 0) {
         this.a += this.U.nextInt(5) + 2;
         if(this.a(this.b, this.c, this.d, var7)) {
            this.r += var1 / var7 * 0.1D;
            this.s += var3 / var7 * 0.1D;
            this.t += var5 / var7 * 0.1D;
         } else {
            this.b = this.o;
            this.c = this.p;
            this.d = this.q;
         }
      }

      if(this.an != null && this.an.G) {
         this.an = null;
      }

      if(this.an == null || this.ao-- <= 0) {
         this.an = this.k.b(this, 100.0D);
         if(this.an != null) {
            this.ao = 20;
         }
      }

      double var9 = 64.0D;
      if(this.an != null && this.an.f(this) < var9 * var9) {
         double var11 = this.an.o - this.o;
         double var13 = this.an.y.b + (double)(this.an.J / 2.0F) - (this.p + (double)(this.J / 2.0F));
         double var15 = this.an.q - this.q;
         this.bd = this.u = -((float)Math.atan2(var11, var15)) * 180.0F / 3.1415927F;
         if(this.m(this.an)) {
            if(this.am == 10) {
               this.k.a((yw)null, 1007, (int)this.o, (int)this.p, (int)this.q, 0);
            }

            ++this.am;
            if(this.am == 20) {
               this.k.a((yw)null, 1008, (int)this.o, (int)this.p, (int)this.q, 0);
               bt var17 = new bt(this.k, this, var11, var13, var15);
               double var18 = 4.0D;
               bo var20 = this.k(1.0F);
               var17.o = this.o + var20.a * var18;
               var17.p = this.p + (double)(this.J / 2.0F) + 0.5D;
               var17.q = this.q + var20.c * var18;
               this.k.a((nn)var17);
               this.am = -40;
            }
         } else if(this.am > 0) {
            --this.am;
         }
      } else {
         this.bd = this.u = -((float)Math.atan2(this.r, this.t)) * 180.0F / 3.1415927F;
         if(this.am > 0) {
            --this.am;
         }
      }

      if(!this.k.F) {
         byte var21 = this.ac.a(16);
         byte var12 = (byte)(this.am > 10?1:0);
         if(var21 != var12) {
            this.ac.b(16, Byte.valueOf(var12));
         }
      }

   }

   private boolean a(double var1, double var3, double var5, double var7) {
      double var9 = (this.b - this.o) / var7;
      double var11 = (this.c - this.p) / var7;
      double var13 = (this.d - this.q) / var7;
      wu var15 = this.y.d();

      for(int var16 = 1; (double)var16 < var7; ++var16) {
         var15.d(var9, var11, var13);
         if(this.k.a((nn)this, var15).size() > 0) {
            return false;
         }
      }

      return true;
   }

   protected String m() {
      return "mob.ghast.moan";
   }

   protected String n() {
      return "mob.ghast.scream";
   }

   protected String o() {
      return "mob.ghast.death";
   }

   protected int f() {
      return yr.M.bQ;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.U.nextInt(2) + this.U.nextInt(1 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.b(yr.bp.bQ, 1);
      }

      var3 = this.U.nextInt(3) + this.U.nextInt(1 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.b(yr.M.bQ, 1);
      }

   }

   protected float C_() {
      return 10.0F;
   }

   public boolean i() {
      return this.U.nextInt(20) == 0 && super.i() && this.k.q > 0;
   }

   public int ac() {
      return 1;
   }
}
