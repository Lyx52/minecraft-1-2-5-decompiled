
public class jg extends yy {

   private static boolean[] b = new boolean[256];
   public boolean a = false;
   private int d = 0;
   private int e = 0;


   public jg(xd var1) {
      super(var1);
      this.bm = "/mob/enderman.png";
      this.cj = 0.2F;
      this.c = 7;
      this.a(0.6F, 2.9F);
      this.R = 1.0F;
   }

   public int d() {
      return 40;
   }

   protected void b() {
      super.b();
      this.ac.a(16, new Byte((byte)0));
      this.ac.a(17, new Byte((byte)0));
   }

   public void b(ady var1) {
      super.b(var1);
      var1.a("carried", (short)this.z_());
      var1.a("carriedData", (short)this.x());
   }

   public void a(ady var1) {
      super.a(var1);
      this.g_(var1.e("carried"));
      this.h_(var1.e("carriedData"));
   }

   protected nn h() {
      yw var1 = this.k.b(this, 64.0D);
      if(var1 != null) {
         if(this.d(var1)) {
            if(this.e++ == 5) {
               this.e = 0;
               return var1;
            }
         } else {
            this.e = 0;
         }
      }

      return null;
   }

   public int b(float var1) {
      return super.b(var1);
   }

   public float a(float var1) {
      return super.a(var1);
   }

   private boolean d(yw var1) {
      aan var2 = var1.ap.b[3];
      if(var2 != null && var2.c == pb.ba.bO) {
         return false;
      } else {
         bo var3 = var1.k(1.0F).c();
         bo var4 = bo.b(this.o - var1.o, this.y.b + (double)(this.J / 2.0F) - (var1.p + (double)var1.I()), this.q - var1.q);
         double var5 = var4.d();
         var4 = var4.c();
         double var7 = var3.b(var4);
         return var7 > 1.0D - 0.025D / var5?var1.m(this):false;
      }
   }

   public void e() {
      if(this.G()) {
         this.a(md.f, 1);
      }

      this.a = this.ao != null;
      this.cj = this.ao != null?6.5F:0.3F;
      int var1;
      if(!this.k.F) {
         int var2;
         int var3;
         int var4;
         if(this.z_() == 0) {
            if(this.U.nextInt(20) == 0) {
               var1 = gk.c(this.o - 2.0D + this.U.nextDouble() * 4.0D);
               var2 = gk.c(this.p + this.U.nextDouble() * 3.0D);
               var3 = gk.c(this.q - 2.0D + this.U.nextDouble() * 4.0D);
               var4 = this.k.a(var1, var2, var3);
               if(b[var4]) {
                  this.g_(this.k.a(var1, var2, var3));
                  this.h_(this.k.e(var1, var2, var3));
                  this.k.g(var1, var2, var3, 0);
               }
            }
         } else if(this.U.nextInt(2000) == 0) {
            var1 = gk.c(this.o - 1.0D + this.U.nextDouble() * 2.0D);
            var2 = gk.c(this.p + this.U.nextDouble() * 2.0D);
            var3 = gk.c(this.q - 1.0D + this.U.nextDouble() * 2.0D);
            var4 = this.k.a(var1, var2, var3);
            int var5 = this.k.a(var1, var2 - 1, var3);
            if(var4 == 0 && var5 > 0 && pb.m[var5].b()) {
               this.k.d(var1, var2, var3, this.z_(), this.x());
               this.g_(0);
            }
         }
      }

      for(var1 = 0; var1 < 2; ++var1) {
         this.k.a("portal", this.o + (this.U.nextDouble() - 0.5D) * (double)this.I, this.p + this.U.nextDouble() * (double)this.J - 0.25D, this.q + (this.U.nextDouble() - 0.5D) * (double)this.I, (this.U.nextDouble() - 0.5D) * 2.0D, -this.U.nextDouble(), (this.U.nextDouble() - 0.5D) * 2.0D);
      }

      if(this.k.m() && !this.k.F) {
         float var6 = this.a(1.0F);
         if(var6 > 0.5F && this.k.m(gk.c(this.o), gk.c(this.p), gk.c(this.q)) && this.U.nextFloat() * 30.0F < (var6 - 0.4F) * 2.0F) {
            this.ao = null;
            this.u();
         }
      }

      if(this.G()) {
         this.ao = null;
         this.u();
      }

      this.ch = false;
      if(this.ao != null) {
         this.a(this.ao, 100.0F, 100.0F);
      }

      if(!this.k.F && this.M()) {
         if(this.ao != null) {
            if(this.ao instanceof yw && this.d((yw)this.ao)) {
               this.ce = this.cf = 0.0F;
               this.cj = 0.0F;
               if(this.ao.f(this) < 16.0D) {
                  this.u();
               }

               this.d = 0;
            } else if(this.ao.f(this) > 256.0D && this.d++ >= 30 && this.d(this.ao)) {
               this.d = 0;
            }
         } else {
            this.d = 0;
         }
      }

      super.e();
   }

   protected boolean u() {
      double var1 = this.o + (this.U.nextDouble() - 0.5D) * 64.0D;
      double var3 = this.p + (double)(this.U.nextInt(64) - 32);
      double var5 = this.q + (this.U.nextDouble() - 0.5D) * 64.0D;
      return this.a_(var1, var3, var5);
   }

   protected boolean d(nn var1) {
      bo var2 = bo.b(this.o - var1.o, this.y.b + (double)(this.J / 2.0F) - var1.p + (double)var1.I(), this.q - var1.q);
      var2 = var2.c();
      double var3 = 16.0D;
      double var5 = this.o + (this.U.nextDouble() - 0.5D) * 8.0D - var2.a * var3;
      double var7 = this.p + (double)(this.U.nextInt(16) - 8) - var2.b * var3;
      double var9 = this.q + (this.U.nextDouble() - 0.5D) * 8.0D - var2.c * var3;
      return this.a_(var5, var7, var9);
   }

   protected boolean a_(double var1, double var3, double var5) {
      double var7 = this.o;
      double var9 = this.p;
      double var11 = this.q;
      this.o = var1;
      this.p = var3;
      this.q = var5;
      boolean var13 = false;
      int var14 = gk.c(this.o);
      int var15 = gk.c(this.p);
      int var16 = gk.c(this.q);
      int var18;
      if(this.k.j(var14, var15, var16)) {
         boolean var17 = false;

         while(!var17 && var15 > 0) {
            var18 = this.k.a(var14, var15 - 1, var16);
            if(var18 != 0 && pb.m[var18].cd.c()) {
               var17 = true;
            } else {
               --this.p;
               --var15;
            }
         }

         if(var17) {
            this.d(this.o, this.p, this.q);
            if(this.k.a((nn)this, this.y).size() == 0 && !this.k.b(this.y)) {
               var13 = true;
            }
         }
      }

      if(!var13) {
         this.d(var7, var9, var11);
         return false;
      } else {
         short var30 = 128;

         for(var18 = 0; var18 < var30; ++var18) {
            double var19 = (double)var18 / ((double)var30 - 1.0D);
            float var21 = (this.U.nextFloat() - 0.5F) * 0.2F;
            float var22 = (this.U.nextFloat() - 0.5F) * 0.2F;
            float var23 = (this.U.nextFloat() - 0.5F) * 0.2F;
            double var24 = var7 + (this.o - var7) * var19 + (this.U.nextDouble() - 0.5D) * (double)this.I * 2.0D;
            double var26 = var9 + (this.p - var9) * var19 + this.U.nextDouble() * (double)this.J;
            double var28 = var11 + (this.q - var11) * var19 + (this.U.nextDouble() - 0.5D) * (double)this.I * 2.0D;
            this.k.a("portal", var24, var26, var28, (double)var21, (double)var22, (double)var23);
         }

         this.k.a(var7, var9, var11, "mob.endermen.portal", 1.0F, 1.0F);
         this.k.a(this, "mob.endermen.portal", 1.0F, 1.0F);
         return true;
      }
   }

   protected String m() {
      return "mob.endermen.idle";
   }

   protected String n() {
      return "mob.endermen.hit";
   }

   protected String o() {
      return "mob.endermen.death";
   }

   protected int f() {
      return yr.bn.bQ;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.f();
      if(var3 > 0) {
         int var4 = this.U.nextInt(2 + var2);

         for(int var5 = 0; var5 < var4; ++var5) {
            this.b(var3, 1);
         }
      }

   }

   public void g_(int var1) {
      this.ac.b(16, Byte.valueOf((byte)(var1 & 255)));
   }

   public int z_() {
      return this.ac.a(16);
   }

   public void h_(int var1) {
      this.ac.b(17, Byte.valueOf((byte)(var1 & 255)));
   }

   public int x() {
      return this.ac.a(17);
   }

   public boolean a(md var1, int var2) {
      if(var1 instanceof ft) {
         for(int var3 = 0; var3 < 64; ++var3) {
            if(this.u()) {
               return true;
            }
         }

         return false;
      } else {
         return super.a(var1, var2);
      }
   }

   static {
      b[pb.u.bO] = true;
      b[pb.v.bO] = true;
      b[pb.E.bO] = true;
      b[pb.F.bO] = true;
      b[pb.ad.bO] = true;
      b[pb.ae.bO] = true;
      b[pb.af.bO] = true;
      b[pb.ag.bO] = true;
      b[pb.am.bO] = true;
      b[pb.aV.bO] = true;
      b[pb.aW.bO] = true;
      b[pb.ba.bO] = true;
      b[pb.br.bO] = true;
      b[pb.by.bO] = true;
   }
}
