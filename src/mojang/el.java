package mojang;

public class el extends nn {

   public int a;
   public int b;


   public el(xd var1) {
      super(var1);
      this.a = 0;
      this.h = true;
      this.a(2.0F, 2.0F);
      this.H = this.J / 2.0F;
      this.b = 5;
      this.a = this.U.nextInt(100000);
   }

   public el(xd var1, double var2, double var4, double var6) {
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
      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      ++this.a;
      this.ac.b(8, Integer.valueOf(this.b));
      int var1 = gk.c(this.o);
      int var2 = gk.c(this.p);
      int var3 = gk.c(this.q);
      if(this.k.a(var1, var2, var3) != pb.ar.bO) {
         this.k.g(var1, var2, var3, pb.ar.bO);
      }

   }

   protected void b(ady var1) {}

   protected void a(ady var1) {}

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
               this.k.a((nn)null, this.o, this.p, this.q, 6.0F);
            } else {
               this.A();
            }
         }
      }

      return true;
   }
}
