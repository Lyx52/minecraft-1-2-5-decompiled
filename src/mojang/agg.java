package mojang;

public class agg extends nn {

   public int a;


   public agg(xd var1) {
      super(var1);
      this.a = 0;
      this.h = true;
      this.a(0.98F, 0.98F);
      this.H = this.J / 2.0F;
   }

   public agg(xd var1, double var2, double var4, double var6) {
      this(var1);
      this.d(var2, var4, var6);
      float var8 = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.r = (double)(-((float)Math.sin((double)var8)) * 0.02F);
      this.s = 0.20000000298023224D;
      this.t = (double)(-((float)Math.cos((double)var8)) * 0.02F);
      this.a = 80;
      this.l = var2;
      this.m = var4;
      this.n = var6;
   }

   protected void b() {}

   protected boolean e_() {
      return false;
   }

   public boolean l_() {
      return !this.G;
   }

   public void J_() {
      this.l = this.o;
      this.m = this.p;
      this.n = this.q;
      this.s -= 0.03999999910593033D;
      this.b(this.r, this.s, this.t);
      this.r *= 0.9800000190734863D;
      this.s *= 0.9800000190734863D;
      this.t *= 0.9800000190734863D;
      if(this.z) {
         this.r *= 0.699999988079071D;
         this.t *= 0.699999988079071D;
         this.s *= -0.5D;
      }

      if(this.a-- <= 0) {
         if(!this.k.F) {
            this.A();
            this.n();
         } else {
            this.A();
         }
      } else {
         this.k.a("smoke", this.o, this.p + 0.5D, this.q, 0.0D, 0.0D, 0.0D);
      }

   }

   private void n() {
      float var1 = 4.0F;
      this.k.a((nn)null, this.o, this.p, this.q, var1);
   }

   protected void b(ady var1) {
      var1.a("Fuse", (byte)this.a);
   }

   protected void a(ady var1) {
      this.a = var1.d("Fuse");
   }

   public float h_() {
      return 0.0F;
   }
}
