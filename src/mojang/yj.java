package mojang;

public class yj extends yf {

   public void c() {
      super.c();
      adn var1 = adn.a();
      this.s.add(new abp(1, this.q / 2 - 100, this.r - 40, var1.b("multiplayer.stopSleeping")));
   }

   protected void a(char var1, int var2) {
      if(var2 == 1) {
         this.g();
      } else if(var2 == 28) {
         String var3 = this.a.b().trim();
         if(var3.length() > 0) {
            this.p.h.a(var3);
         }

         this.a.a("");
         this.p.w.d();
      } else {
         super.a(var1, var2);
      }

   }

   protected void a(abp var1) {
      if(var1.f == 1) {
         this.g();
      } else {
         super.a(var1);
      }

   }

   private void g() {
      if(this.p.h instanceof ahv) {
         adl var1 = ((ahv)this.p.h).cl;
         var1.c(new aig(this.p.h, 3));
      }

   }
}
