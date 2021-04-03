
public class cd extends vp {

   private vp b;
   protected String a = "Options";
   private hu c;
   private static zq[] d = new zq[]{zq.a, zq.b, zq.c, zq.d, zq.e, zq.l};


   public cd(vp var1, hu var2) {
      this.b = var1;
      this.c = var2;
   }

   public void c() {
      adn var1 = adn.a();
      this.a = var1.b("options.title");
      int var2 = 0;
      zq[] var3 = d;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         zq var6 = var3[var5];
         if(!var6.a()) {
            z var7 = new z(var6.c(), this.q / 2 - 155 + var2 % 2 * 160, this.r / 6 + 24 * (var2 >> 1), var6, this.c.c(var6));
            if(var6 == zq.l && this.p.f != null && this.p.f.B().s()) {
               var7.h = false;
               var7.e = cy.a("options.difficulty") + ": " + cy.a("options.difficulty.hardcore");
            }

            this.s.add(var7);
         } else {
            this.s.add(new ajz(var6.c(), this.q / 2 - 155 + var2 % 2 * 160, this.r / 6 + 24 * (var2 >> 1), var6, this.c.c(var6), this.c.a(var6)));
         }

         ++var2;
      }

      this.s.add(new abp(101, this.q / 2 - 100, this.r / 6 + 96 - 6, var1.b("options.video")));
      this.s.add(new abp(100, this.q / 2 - 100, this.r / 6 + 120 - 6, var1.b("options.controls")));
      this.s.add(new abp(102, this.q / 2 - 100, this.r / 6 + 144 - 6, var1.b("options.language")));
      this.s.add(new abp(200, this.q / 2 - 100, this.r / 6 + 168, var1.b("gui.done")));
   }

   protected void a(abp var1) {
      if(var1.h) {
         if(var1.f < 100 && var1 instanceof z) {
            this.c.a(((z)var1).a(), 1);
            var1.e = this.c.c(zq.a(var1.f));
         }

         if(var1.f == 101) {
            this.p.A.b();
            this.p.a((vp)(new jy(this, this.c)));
         }

         if(var1.f == 100) {
            this.p.A.b();
            this.p.a((vp)(new oz(this, this.c)));
         }

         if(var1.f == 102) {
            this.p.A.b();
            this.p.a((vp)(new afv(this, this.c)));
         }

         if(var1.f == 200) {
            this.p.A.b();
            this.p.a(this.b);
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, this.a, this.q / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }

}
