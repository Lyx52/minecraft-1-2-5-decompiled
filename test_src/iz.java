import java.util.Date;

class iz extends if {

   // $FF: synthetic field
   final mw a;


   public iz(mw var1) {
      super(var1.p, var1.q, var1.r, 32, var1.r - 64, 36);
      this.a = var1;
   }

   protected int a() {
      return mw.a(this.a).size();
   }

   protected void a(int var1, boolean var2) {
      mw.a(this.a, var1);
      boolean var3 = mw.b(this.a) >= 0 && mw.b(this.a) < this.a();
      mw.c(this.a).h = var3;
      mw.d(this.a).h = var3;
      mw.e(this.a).h = var3;
      if(var2 && var3) {
         this.a.c(var1);
      }

   }

   protected boolean b_(int var1) {
      return var1 == mw.b(this.a);
   }

   protected int b() {
      return mw.a(this.a).size() * 36;
   }

   protected void c() {
      this.a.k();
   }

   protected void a(int var1, int var2, int var3, int var4, adz var5) {
      pj var6 = (pj)mw.a(this.a).get(var1);
      String var7 = var6.b();
      if(var7 == null || gk.a(var7)) {
         var7 = mw.f(this.a) + " " + (var1 + 1);
      }

      String var8 = var6.a();
      var8 = var8 + " (" + mw.g(this.a).format(new Date(var6.d()));
      var8 = var8 + ")";
      String var9 = "";
      if(var6.c()) {
         var9 = mw.h(this.a) + " " + var9;
      } else {
         var9 = mw.i(this.a)[var6.e()];
         if(var6.f()) {
            var9 = "§4" + cy.a("gameMode.hardcore") + "§8";
         }
      }

      this.a.b(this.a.u, var7, var2 + 2, var3 + 1, 16777215);
      this.a.b(this.a.u, var8, var2 + 2, var3 + 12, 8421504);
      this.a.b(this.a.u, var9, var2 + 2, var3 + 12 + 10, 8421504);
   }
}
