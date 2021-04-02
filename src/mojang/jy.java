package mojang;

public class jy extends vp {

   private vp b;
   protected String a = "Video Settings";
   private hu c;
   private boolean d = false;
   private static zq[] e = new zq[]{zq.m, zq.g, zq.n, zq.k, zq.i, zq.h, zq.o, zq.j, zq.f, zq.p, zq.q};


   public jy(vp var1, hu var2) {
      this.b = var1;
      this.c = var2;
   }

   public void c() {
      adn var1 = adn.a();
      this.a = var1.b("options.videoTitle");
      int var2 = 0;
      zq[] var3 = e;
      int var4 = var3.length;

      int var5;
      for(var5 = 0; var5 < var4; ++var5) {
         zq var6 = var3[var5];
         if(!var6.a()) {
            this.s.add(new z(var6.c(), this.q / 2 - 155 + var2 % 2 * 160, this.r / 6 + 24 * (var2 >> 1), var6, this.c.c(var6)));
         } else {
            this.s.add(new ajz(var6.c(), this.q / 2 - 155 + var2 % 2 * 160, this.r / 6 + 24 * (var2 >> 1), var6, this.c.c(var6), this.c.a(var6)));
         }

         ++var2;
      }

      this.s.add(new abp(200, this.q / 2 - 100, this.r / 6 + 168, var1.b("mojang.gui.done")));
      this.d = false;
      String[] var9 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
      String[] var10 = var9;
      var5 = var9.length;

      for(int var11 = 0; var11 < var5; ++var11) {
         String var7 = var10[var11];
         String var8 = System.getProperty(var7);
         if(var8 != null && var8.indexOf("64") >= 0) {
            this.d = true;
            break;
         }
      }

   }

   protected void a(abp var1) {
      if(var1.h) {
         int var2 = this.c.P;
         if(var1.f < 100 && var1 instanceof z) {
            this.c.a(((z)var1).a(), 1);
            var1.e = this.c.c(zq.a(var1.f));
         }

         if(var1.f == 200) {
            this.p.A.b();
            this.p.a(this.b);
         }

         if(this.c.P != var2) {
            agd var3 = new agd(this.p.A, this.p.d, this.p.e);
            int var4 = var3.a();
            int var5 = var3.b();
            this.a(this.p, var4, var5);
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, this.a, this.q / 2, 20, 16777215);
      if(!this.d && this.c.e == 0) {
         this.a(this.u, cy.a("options.farWarning1"), this.q / 2, this.r / 6 + 144, 11468800);
         this.a(this.u, cy.a("options.farWarning2"), this.q / 2, this.r / 6 + 144 + 12, 11468800);
      }

      super.a(var1, var2, var3);
   }

}
