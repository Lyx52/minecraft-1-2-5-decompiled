package mojang;

public class fn extends cb {

   public fn(xd var1) {
      super(var1);
      this.bm = "/mojang/mob/cavespider.png";
      this.a(0.7F, 0.5F);
   }

   public int d() {
      return 12;
   }

   public float r() {
      return 0.7F;
   }

   public boolean c(nn var1) {
      if(super.c(var1)) {
         if(var1 instanceof acq) {
            byte var2 = 0;
            if(this.k.q > 1) {
               if(this.k.q == 2) {
                  var2 = 7;
               } else if(this.k.q == 3) {
                  var2 = 15;
               }
            }

            if(var2 > 0) {
               ((acq)var1).b(new alg(aad.u.H, var2 * 20, 0));
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
