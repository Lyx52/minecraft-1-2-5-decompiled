package mojang;

public class acy extends is {

   boolean i;
   int j;


   public acy(Mob var1, boolean var2) {
      super(var1);
      this.a = var1;
      this.i = var2;
   }

   public boolean b() {
      return this.i && this.j > 0 && super.b();
   }

   public void c() {
      this.j = 20;
      this.e.a(this.a.k, this.b, this.c, this.d, true);
   }

   public void d() {
      if(this.i) {
         this.e.a(this.a.k, this.b, this.c, this.d, false);
      }

   }

   public void e() {
      --this.j;
      super.e();
   }
}
