package mojang;

public abstract class akn extends Mob {

   public akn(World var1) {
      super(var1);
   }

   protected void e(float var1) {}

   public void a_(float var1, float var2) {
      if(this.H()) {
         this.a(var1, var2, 0.02F);
         this.b(this.r, this.s, this.t);
         this.r *= 0.800000011920929D;
         this.s *= 0.800000011920929D;
         this.t *= 0.800000011920929D;
      } else if(this.J()) {
         this.a(var1, var2, 0.02F);
         this.b(this.r, this.s, this.t);
         this.r *= 0.5D;
         this.s *= 0.5D;
         this.t *= 0.5D;
      } else {
         float var3 = 0.91F;
         if(this.z) {
            var3 = 0.54600006F;
            int var4 = this.k.a(Utils.c(this.o), Utils.c(this.y.b) - 1, Utils.c(this.q));
            if(var4 > 0) {
               var3 = pb.m[var4].ce * 0.91F;
            }
         }

         float var8 = 0.16277136F / (var3 * var3 * var3);
         this.a(var1, var2, this.z?0.1F * var8:0.02F);
         var3 = 0.91F;
         if(this.z) {
            var3 = 0.54600006F;
            int var5 = this.k.a(Utils.c(this.o), Utils.c(this.y.b) - 1, Utils.c(this.q));
            if(var5 > 0) {
               var3 = pb.m[var5].ce * 0.91F;
            }
         }

         this.b(this.r, this.s, this.t);
         this.r *= (double)var3;
         this.s *= (double)var3;
         this.t *= (double)var3;
      }

      this.bL = this.bM;
      double var10 = this.o - this.sandX;
      double var9 = this.q - this.sandZ;
      float var7 = Utils.sqrt(var10 * var10 + var9 * var9) * 4.0F;
      if(var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.bM += (var7 - this.bM) * 0.4F;
      this.bN += this.bM;
   }

   public boolean p() {
      return false;
   }
}
