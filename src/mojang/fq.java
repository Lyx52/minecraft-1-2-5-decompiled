package mojang;

public class fq extends nn {

   public aan a;
   public int b = 0;
   public int c;
   private int e = 5;
   public float d = (float)(Math.random() * 3.141592653589793D * 2.0D);


   public fq(xd var1, double var2, double var4, double var6, aan var8) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.H = this.J / 2.0F;
      this.d(var2, var4, var6);
      this.a = var8;
      this.u = (float)(Math.random() * 360.0D);
      this.r = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.s = 0.20000000298023224D;
      this.t = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
   }

   protected boolean e_() {
      return false;
   }

   public fq(xd var1) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.H = this.J / 2.0F;
   }

   protected void b() {}

   public void J_() {
      super.J_();
      if(this.c > 0) {
         --this.c;
      }

      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      this.s -= 0.03999999910593033D;
      if(this.k.f(gk.c(this.o), gk.c(this.p), gk.c(this.q)) == acn.h) {
         this.s = 0.20000000298023224D;
         this.r = (double)((this.U.nextFloat() - this.U.nextFloat()) * 0.2F);
         this.t = (double)((this.U.nextFloat() - this.U.nextFloat()) * 0.2F);
         this.k.a(this, "random.fizz", 0.4F, 2.0F + this.U.nextFloat() * 0.4F);
      }

      this.h(this.o, (this.y.b + this.y.e) / 2.0D, this.q);
      this.b(this.r, this.s, this.t);
      float var1 = 0.98F;
      if(this.z) {
         var1 = 0.58800006F;
         int var2 = this.k.a(gk.c(this.o), gk.c(this.y.b) - 1, gk.c(this.q));
         if(var2 > 0) {
            var1 = pb.m[var2].ce * 0.98F;
         }
      }

      this.r *= (double)var1;
      this.s *= 0.9800000190734863D;
      this.t *= (double)var1;
      if(this.z) {
         this.s *= -0.5D;
      }

      ++this.b;
      if(this.b >= 6000) {
         this.A();
      }

   }

   public boolean g_() {
      return this.k.a(this.y, acn.g, this);
   }

   protected void a(int var1) {
      this.a(md.b, var1);
   }

   public boolean a(md var1, int var2) {
      this.K();
      this.e -= var2;
      if(this.e <= 0) {
         this.A();
      }

      return false;
   }

   public void b(ady var1) {
      var1.a("Health", (short)((byte)this.e));
      var1.a("Age", (short)this.b);
      var1.a("Item", this.a.b(new ady()));
   }

   public void a(ady var1) {
      this.e = var1.e("Health") & 255;
      this.b = var1.e("Age");
      ady var2 = var1.m("Item");
      this.a = aan.a(var2);
      if(this.a == null) {
         this.A();
      }

   }

   public void a(yw var1) {
      if(!this.k.F) {
         int var2 = this.a.a;
         if(this.c == 0 && var1.ap.a(this.a)) {
            if(this.a.c == pb.J.bO) {
               var1.a((ajw)dp.g);
            }

            if(this.a.c == yr.aF.bQ) {
               var1.a((ajw)dp.t);
            }

            if(this.a.c == yr.n.bQ) {
               var1.a((ajw)dp.w);
            }

            if(this.a.c == yr.bo.bQ) {
               var1.a((ajw)dp.z);
            }

            this.k.a(this, "random.pop", 0.2F, ((this.U.nextFloat() - this.U.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.b((nn)this, var2);
            if(this.a.a <= 0) {
               this.A();
            }
         }

      }
   }

   public boolean k_() {
      return false;
   }
}
