package mojang;

public class FallingSand extends BaseEntity {

   public int a;
   public int b = 0;


   public FallingSand(World world) {
      super(world);
   }

   public FallingSand(World world, double x, double y, double z, int var8) {
      super(world);
      this.a = var8;
      this.h = true;
      this.a(0.98F, 0.98F);
      this.H = this.J / 2.0F;
      this.d(x, y, z);
      this.r = 0.0D;
      this.s = 0.0D;
      this.t = 0.0D;
      this.sandX = x;
      this.sandY = y;
      this.sandZ = z;
   }

   protected boolean e_() {
      return false;
   }

   protected void b() {}

   public boolean l_() {
      return !this.G;
   }

   public void J_() {
      if(this.a == 0) {
         this.A();
      } else {
         this.sandX = this.o;
         this.sandY = this.p;
         this.sandZ = this.q;
         ++this.b;
         this.s -= 0.03999999910593033D;
         this.b(this.r, this.s, this.t);
         this.r *= 0.9800000190734863D;
         this.s *= 0.9800000190734863D;
         this.t *= 0.9800000190734863D;
         int var1 = Utils.c(this.o);
         int var2 = Utils.c(this.p);
         int var3 = Utils.c(this.q);
         if(this.b == 1 && this.k.a(var1, var2, var3) == this.a) {
            this.k.g(var1, var2, var3, 0);
         } else if(!this.k.F && this.b == 1) {
            this.A();
         }

         if(this.z) {
            this.r *= 0.699999988079071D;
            this.t *= 0.699999988079071D;
            this.s *= -0.5D;
            if(this.k.a(var1, var2, var3) != pb.ac.bO) {
               this.A();
               if((!this.k.a(this.a, var1, var2, var3, true, 1) || yp.h(this.k, var1, var2 - 1, var3) || !this.k.g(var1, var2, var3, this.a)) && !this.k.F) {
                  this.b(this.a, 1);
               }
            }
         } else if(this.b > 100 && !this.k.F && (var2 < 1 || var2 > 256) || this.b > 600) {
            this.b(this.a, 1);
            this.A();
         }

      }
   }

   protected void b(CompundTag var1) {
      var1.addByte("Tile", (byte)this.a);
   }

   protected void a(CompundTag var1) {
      this.a = var1.getByte("Tile") & 255;
   }

   public float h_() {
      return 0.0F;
   }

   public World n() {
      return this.k;
   }
}
