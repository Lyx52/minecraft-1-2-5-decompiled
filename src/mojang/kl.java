package mojang;

public class kl implements io {

   private String a;
   private io b;
   private io c;


   public kl(String var1, io var2, io var3) {
      this.a = var1;
      if(var2 == null) {
         var2 = var3;
      }

      if(var3 == null) {
         var3 = var2;
      }

      this.b = var2;
      this.c = var3;
   }

   public int a() {
      return this.b.a() + this.c.a();
   }

   public String c() {
      return this.a;
   }

   public aan k_(int var1) {
      return var1 >= this.b.a()?this.c.k_(var1 - this.b.a()):this.b.k_(var1);
   }

   public aan a(int var1, int var2) {
      return var1 >= this.b.a()?this.c.a(var1 - this.b.a(), var2):this.b.a(var1, var2);
   }

   public aan b(int var1) {
      return var1 >= this.b.a()?this.c.b(var1 - this.b.a()):this.b.b(var1);
   }

   public void a(int var1, aan var2) {
      if(var1 >= this.b.a()) {
         this.c.a(var1 - this.b.a(), var2);
      } else {
         this.b.a(var1, var2);
      }

   }

   public int d() {
      return this.b.d();
   }

   public void j() {
      this.b.j();
      this.c.j();
   }

   public boolean a_(yw var1) {
      return this.b.a_(var1) && this.c.a_(var1);
   }

   public void e() {
      this.b.e();
      this.c.e();
   }

   public void f() {
      this.b.f();
      this.c.f();
   }
}
