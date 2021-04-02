package mojang;

public class bd extends rc {

   private acq a;
   private double b;
   private double c;
   private int d = 0;


   public bd(acq var1) {
      this.a = var1;
      this.a(3);
   }

   public boolean a() {
      return this.a.aO().nextFloat() < 0.02F;
   }

   public boolean b() {
      return this.d >= 0;
   }

   public void c() {
      double var1 = 6.283185307179586D * this.a.aO().nextDouble();
      this.b = Math.cos(var1);
      this.c = Math.sin(var1);
      this.d = 20 + this.a.aO().nextInt(20);
   }

   public void e() {
      --this.d;
      this.a.aJ().a(this.a.o + this.b, this.a.p + (double)this.a.I(), this.a.q + this.c, 10.0F, (float)this.a.ak());
   }
}
