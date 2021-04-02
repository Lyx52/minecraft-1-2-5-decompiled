package mojang;

public class EnderCrystal extends BaseEntity {

   public int a;
   public int b;


   public EnderCrystal(World var1) {
      super(var1);
      this.a = 0;
      this.h = true;
      this.a(2.0F, 2.0F);
      this.H = this.J / 2.0F;
      this.b = 5;
      this.a = this.U.nextInt(100000);
   }

   public EnderCrystal(World var1, double var2, double var4, double var6) {
      this(var1);
      this.d(var2, var4, var6);
   }

   protected boolean e_() {
      return false;
   }

   protected void b() {
      this.ac.a(8, Integer.valueOf(this.b));
   }

   public void J_() {
      this.sandX = this.o;
      this.sandY = this.p;
      this.sandZ = this.q;
      ++this.a;
      this.ac.b(8, Integer.valueOf(this.b));
      int var1 = Utils.c(this.o);
      int var2 = Utils.c(this.p);
      int var3 = Utils.c(this.q);
      if(this.k.a(var1, var2, var3) != pb.ar.bO) {
         this.k.g(var1, var2, var3, pb.ar.bO);
      }

   }

   protected void b(CompundTag var1) {}

   protected void a(CompundTag var1) {}

   public float h_() {
      return 0.0F;
   }

   public boolean l_() {
      return true;
   }

   public boolean a(md var1, int var2) {
      if(!this.G && !this.k.F) {
         this.b = 0;
         if(this.b <= 0) {
            if(!this.k.F) {
               this.A();
               this.k.a((BaseEntity)null, this.o, this.p, this.q, 6.0F);
            } else {
               this.A();
            }
         }
      }

      return true;
   }
}
