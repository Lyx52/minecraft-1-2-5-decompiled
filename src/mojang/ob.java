package mojang;

public class ob extends rc {

   private Mob a;
   private BaseEntity b;
   private float c;
   private int d;
   private float e;
   private Class f;


   public ob(Mob var1, Class var2, float var3) {
      this.a = var1;
      this.f = var2;
      this.c = var3;
      this.e = 0.02F;
      this.a(2);
   }

   public ob(Mob var1, Class var2, float var3, float var4) {
      this.a = var1;
      this.f = var2;
      this.c = var3;
      this.e = var4;
      this.a(2);
   }

   public boolean a() {
      if(this.a.aO().nextFloat() >= this.e) {
         return false;
      } else {
         if(this.f == Player.class) {
            this.b = this.a.k.a(this.a, (double)this.c);
         } else {
            this.b = this.a.k.a(this.f, this.a.y.b((double)this.c, 3.0D, (double)this.c), this.a);
         }

         return this.b != null;
      }
   }

   public boolean b() {
      return !this.b.M()?false:(this.a.f(this.b) > (double)(this.c * this.c)?false:this.d > 0);
   }

   public void c() {
      this.d = 40 + this.a.aO().nextInt(40);
   }

   public void d() {
      this.b = null;
   }

   public void e() {
      this.a.aJ().a(this.b.o, this.b.p + (double)this.b.I(), this.b.q, 10.0F, (float)this.a.ak());
      --this.d;
   }
}
