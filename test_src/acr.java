import java.util.Stack;

final class acr implements akj {

   private final Stack a = new Stack();
   private aca b;


   ly a() {
      return (ly)this.b.b();
   }

   public void b() {}

   public void c() {}

   public void d() {
      wn var1 = ahr.e();
      this.a((aca)var1);
      this.a.push(new adi(this, var1));
   }

   public void e() {
      this.a.pop();
   }

   public void f() {
      nv var1 = ahr.d();
      this.a((aca)var1);
      this.a.push(new adh(this, var1));
   }

   public void g() {
      this.a.pop();
   }

   public void a(String var1) {
      afl var2 = afl.a().a(ahr.b(var1));
      ((afs)this.a.peek()).a(var2);
      this.a.push(new adk(this, var2));
   }

   public void h() {
      this.a.pop();
   }

   public void b(String var1) {
      this.b(ahr.a(var1));
   }

   public void i() {
      this.b(ahr.b());
   }

   public void c(String var1) {
      this.b((aca)ahr.b(var1));
   }

   public void j() {
      this.b(ahr.c());
   }

   public void k() {
      this.b(ahr.a());
   }

   private void a(aca var1) {
      if(this.b == null) {
         this.b = var1;
      } else {
         this.b(var1);
      }

   }

   private void b(aca var1) {
      ((afs)this.a.peek()).a(var1);
   }
}
