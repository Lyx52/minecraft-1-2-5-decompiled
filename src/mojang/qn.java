package mojang;

public class qn extends yy {

   private int a;


   public qn(xd var1) {
      super(var1);
      this.bm = "/mojang/mob/silverfish.png";
      this.a(0.3F, 0.7F);
      this.cj = 0.6F;
      this.c = 1;
   }

   public int d() {
      return 8;
   }

   protected boolean e_() {
      return false;
   }

   protected nn h() {
      double var1 = 8.0D;
      return this.k.b(this, var1);
   }

   protected String m() {
      return "mojang.mob.silverfish.say";
   }

   protected String n() {
      return "mojang.mob.silverfish.hit";
   }

   protected String o() {
      return "mojang.mob.silverfish.kill";
   }

   public boolean a(md var1, int var2) {
      if(this.a <= 0 && var1 instanceof fl) {
         this.a = 20;
      }

      return super.a(var1, var2);
   }

   protected void a(nn var1, float var2) {
      if(this.bE <= 0 && var2 < 1.2F && var1.y.e > this.y.b && var1.y.b < this.y.e) {
         this.bE = 20;
         var1.a(md.a((acq)this), this.c);
      }

   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.k.a(this, "mojang.mob.silverfish.step", 1.0F, 1.0F);
   }

   public void b(ady var1) {
      super.b(var1);
   }

   public void a(ady var1) {
      super.a(var1);
   }

   protected int f() {
      return 0;
   }

   public void J_() {
      this.bd = this.u;
      super.J_();
   }

   protected void y_() {
      super.y_();
      if(!this.k.F) {
         int var1;
         int var2;
         int var3;
         int var5;
         if(this.a > 0) {
            --this.a;
            if(this.a == 0) {
               var1 = gk.c(this.o);
               var2 = gk.c(this.p);
               var3 = gk.c(this.q);
               boolean var4 = false;

               for(var5 = 0; !var4 && var5 <= 5 && var5 >= -5; var5 = var5 <= 0?1 - var5:0 - var5) {
                  for(int var6 = 0; !var4 && var6 <= 10 && var6 >= -10; var6 = var6 <= 0?1 - var6:0 - var6) {
                     for(int var7 = 0; !var4 && var7 <= 10 && var7 >= -10; var7 = var7 <= 0?1 - var7:0 - var7) {
                        int var8 = this.k.a(var1 + var6, var2 + var5, var3 + var7);
                        if(var8 == pb.bl.bO) {
                           this.k.g(2001, var1 + var6, var2 + var5, var3 + var7, pb.bl.bO + (this.k.e(var1 + var6, var2 + var5, var3 + var7) << 12));
                           this.k.g(var1 + var6, var2 + var5, var3 + var7, 0);
                           pb.bl.b(this.k, var1 + var6, var2 + var5, var3 + var7, 0);
                           if(this.U.nextBoolean()) {
                              var4 = true;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         if(this.ao == null && !this.ar()) {
            var1 = gk.c(this.o);
            var2 = gk.c(this.p + 0.5D);
            var3 = gk.c(this.q);
            int var9 = this.U.nextInt(6);
            var5 = this.k.a(var1 + qs.b[var9], var2 + qs.c[var9], var3 + qs.d[var9]);
            if(age.e(var5)) {
               this.k.d(var1 + qs.b[var9], var2 + qs.c[var9], var3 + qs.d[var9], pb.bl.bO, age.h(var5));
               this.ba();
               this.A();
            } else {
               this.ap();
            }
         } else if(this.ao != null && !this.ar()) {
            this.ao = null;
         }

      }
   }

   public float a(int var1, int var2, int var3) {
      return this.k.a(var1, var2 - 1, var3) == pb.t.bO?10.0F:super.a(var1, var2, var3);
   }

   protected boolean aa() {
      return true;
   }

   public boolean i() {
      if(super.i()) {
         yw var1 = this.k.a(this, 5.0D);
         return var1 == null;
      } else {
         return false;
      }
   }

   public bk s() {
      return mojang.bk.c;
   }
}
