
public abstract class yy extends aaa implements xf {

   protected int c = 2;


   public yy(xd var1) {
      super(var1);
      this.bI = 5;
   }

   public void e() {
      float var1 = this.a(1.0F);
      if(var1 > 0.5F) {
         this.cd += 2;
      }

      super.e();
   }

   public void J_() {
      super.J_();
      if(!this.k.F && this.k.q == 0) {
         this.A();
      }

   }

   protected nn h() {
      yw var1 = this.k.b(this, 16.0D);
      return var1 != null && this.m(var1)?var1:null;
   }

   public boolean a(md var1, int var2) {
      if(super.a(var1, var2)) {
         nn var3 = var1.a();
         if(this.i != var3 && this.j != var3) {
            if(var3 != this) {
               this.ao = var3;
            }

            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean c(nn var1) {
      int var2 = this.c;
      if(this.a(aad.g)) {
         var2 += 3 << this.b(aad.g).c();
      }

      if(this.a(aad.t)) {
         var2 -= 2 << this.b(aad.t).c();
      }

      return var1.a(md.a((acq)this), var2);
   }

   protected void a(nn var1, float var2) {
      if(this.bE <= 0 && var2 < 2.0F && var1.y.e > this.y.b && var1.y.b < this.y.e) {
         this.bE = 20;
         this.c(var1);
      }

   }

   public float a(int var1, int var2, int var3) {
      return 0.5F - this.k.c(var1, var2, var3);
   }

   public void b(ady var1) {
      super.b(var1);
   }

   public void a(ady var1) {
      super.a(var1);
   }

   protected boolean aa() {
      int var1 = gk.c(this.o);
      int var2 = gk.c(this.y.b);
      int var3 = gk.c(this.q);
      if(this.k.b(wl.a, var1, var2, var3) > this.U.nextInt(32)) {
         return false;
      } else {
         int var4 = this.k.o(var1, var2, var3);
         if(this.k.F()) {
            int var5 = this.k.f;
            this.k.f = 10;
            var4 = this.k.o(var1, var2, var3);
            this.k.f = var5;
         }

         return var4 <= this.U.nextInt(8);
      }
   }

   public boolean i() {
      return this.aa() && super.i();
   }
}
