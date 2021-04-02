package mojang;

public class cj extends kw {

   public int a = -1;
   private String d = "Pig";
   public double b;
   public double c = 0.0D;


   public cj() {
      this.a = 20;
   }

   public String a() {
      return this.d;
   }

   public void a(String var1) {
      this.d = var1;
   }

   public boolean t_() {
      return this.i.a((double)this.j + 0.5D, (double)this.k + 0.5D, (double)this.l + 0.5D, 16.0D) != null;
   }

   public void n_() {
      this.c = this.b;
      if(this.t_()) {
         double var1 = (double)((float)this.j + this.i.r.nextFloat());
         double var3 = (double)((float)this.k + this.i.r.nextFloat());
         double var5 = (double)((float)this.l + this.i.r.nextFloat());
         this.i.a("smoke", var1, var3, var5, 0.0D, 0.0D, 0.0D);
         this.i.a("flame", var1, var3, var5, 0.0D, 0.0D, 0.0D);

         for(this.b += (double)(1000.0F / ((float)this.a + 200.0F)); this.b > 360.0D; this.c -= 360.0D) {
            this.b -= 360.0D;
         }

         if(!this.i.F) {
            if(this.a == -1) {
               this.d();
            }

            if(this.a > 0) {
               --this.a;
               return;
            }

            byte var7 = 4;

            for(int var8 = 0; var8 < var7; ++var8) {
               acq var9 = (acq)((acq)aao.a(this.d, this.i));
               if(var9 == null) {
                  return;
               }

               int var10 = this.i.a(var9.getClass(), wu.b((double)this.j, (double)this.k, (double)this.l, (double)(this.j + 1), (double)(this.k + 1), (double)(this.l + 1)).b(8.0D, 4.0D, 8.0D)).size();
               if(var10 >= 6) {
                  this.d();
                  return;
               }

               if(var9 != null) {
                  double var11 = (double)this.j + (this.i.r.nextDouble() - this.i.r.nextDouble()) * 4.0D;
                  double var13 = (double)(this.k + this.i.r.nextInt(3) - 1);
                  double var15 = (double)this.l + (this.i.r.nextDouble() - this.i.r.nextDouble()) * 4.0D;
                  var9.c(var11, var13, var15, this.i.r.nextFloat() * 360.0F, 0.0F);
                  if(var9.i()) {
                     this.i.a((nn)var9);
                     this.i.g(2004, this.j, this.k, this.l, 0);
                     var9.ba();
                     this.d();
                  }
               }
            }
         }

         super.n_();
      }
   }

   private void d() {
      this.a = 200 + this.i.r.nextInt(600);
   }

   public void a(ady var1) {
      super.a(var1);
      this.d = var1.j("EntityId");
      this.a = var1.e("Delay");
   }

   public void b(ady var1) {
      super.b(var1);
      var1.a("EntityId", this.d);
      var1.a("Delay", (short)this.a);
   }
}
