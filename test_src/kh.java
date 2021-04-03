
public class kh extends yy {

   public kh(xd var1) {
      super(var1);
      this.bm = "/mob/zombie.png";
      this.cj = 0.5F;
      this.c = 50;
      this.H *= 6.0F;
      this.a(this.I * 6.0F, this.J * 6.0F);
   }

   public int d() {
      return 100;
   }

   public float a(int var1, int var2, int var3) {
      return this.k.c(var1, var2, var3) - 0.5F;
   }
}
