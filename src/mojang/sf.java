package mojang;

public class sf extends rc {

   World a;
   Mob b;
   Mob c;
   int d = 0;
   float e;
   int f = 0;
   int g;
   int h;


   public sf(Mob var1, float var2, int var3, int var4) {
      this.b = var1;
      this.a = var1.k;
      this.e = var2;
      this.g = var3;
      this.h = var4;
      this.a(3);
   }

   public boolean a() {
      Mob var1 = this.b.aT();
      if(var1 == null) {
         return false;
      } else {
         this.c = var1;
         return true;
      }
   }

   public boolean b() {
      return this.a() || !this.b.aM().e();
   }

   public void d() {
      this.c = null;
   }

   public void e() {
      double var1 = 100.0D;
      double var3 = this.b.f(this.c.o, this.c.y.b, this.c.q);
      boolean var5 = this.b.aN().a(this.c);
      if(var5) {
         ++this.f;
      } else {
         this.f = 0;
      }

      if(var3 <= var1 && this.f >= 20) {
         this.b.aM().f();
      } else {
         this.b.aM().a(this.c, this.e);
      }

      this.b.aJ().a(this.c, 30.0F, 30.0F);
      this.d = Math.max(this.d - 1, 0);
      if(this.d <= 0) {
         if(var3 <= var1 && var5) {
            this.h();
            this.d = this.h;
         }
      }
   }

   private void h() {
      if(this.g == 1) {
         Arrow var1 = new Arrow(this.a, this.b, this.c, 1.6F, 12.0F);
         this.a.a(this.b, "random.bow", 1.0F, 1.0F / (this.b.aO().nextFloat() * 0.4F + 0.8F));
         this.a.a((BaseEntity)var1);
      } else if(this.g == 2) {
         Snowball var9 = new Snowball(this.a, this.b);
         double var2 = this.c.o - this.b.o;
         double var4 = this.c.p + (double)this.c.I() - 1.100000023841858D - var9.p;
         double var6 = this.c.q - this.b.q;
         float var8 = Utils.sqrt(var2 * var2 + var6 * var6) * 0.2F;
         var9.a(var2, var4 + (double)var8, var6, 1.6F, 12.0F);
         this.a.a(this.b, "random.bow", 1.0F, 1.0F / (this.b.aO().nextFloat() * 0.4F + 0.8F));
         this.a.a((BaseEntity)var9);
      }

   }
}
