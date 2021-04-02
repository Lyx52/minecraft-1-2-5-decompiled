package mojang;

public class lb extends vp {

   private int a = 0;
   private int b = 0;


   public void c() {
      this.a = 0;
      this.s.clear();
      byte var1 = -16;
      this.s.add(new abp(1, this.q / 2 - 100, this.r / 4 + 120 + var1, cy.a("menu.returnToMenu")));
      if(this.p.l()) {
         ((abp)this.s.get(0)).e = cy.a("menu.disconnect");
      }

      this.s.add(new abp(4, this.q / 2 - 100, this.r / 4 + 24 + var1, cy.a("menu.returnToGame")));
      this.s.add(new abp(0, this.q / 2 - 100, this.r / 4 + 96 + var1, cy.a("menu.options")));
      this.s.add(new abp(5, this.q / 2 - 100, this.r / 4 + 48 + var1, 98, 20, cy.a("mojang.gui.achievements")));
      this.s.add(new abp(6, this.q / 2 + 2, this.r / 4 + 48 + var1, 98, 20, cy.a("mojang.gui.stats")));
   }

   protected void a(abp var1) {
      switch(var1.f) {
      case 0:
         this.p.a((vp)(new cd(this, this.p.A)));
         break;
      case 1:
         this.p.K.a(gv.j, 1);
         if(this.p.l()) {
            this.p.f.g();
         }

         this.p.a((xd)null);
         this.p.a((vp)(new xt()));
      case 2:
      case 3:
      default:
         break;
      case 4:
         this.p.a((vp)null);
         this.p.g();
         break;
      case 5:
         this.p.a((vp)(new ro(this.p.K)));
         break;
      case 6:
         this.p.a((vp)(new dc(this, this.p.K)));
      }

   }

   public void a() {
      super.a();
      ++this.b;
   }

   public void a(int var1, int var2, float var3) {
      this.k();
      boolean var4 = !this.p.f.c(this.a++);
      if(var4 || this.b < 20) {
         float var5 = ((float)(this.b % 10) + var3) / 10.0F;
         var5 = gk.a(var5 * 3.1415927F * 2.0F) * 0.2F + 0.8F;
         int var6 = (int)(255.0F * var5);
         this.b(this.u, "Saving level..", 8, this.r - 16, var6 << 16 | var6 << 8 | var6);
      }

      this.a(this.u, "Game menu", this.q / 2, 40, 16777215);
      super.a(var1, var2, var3);
   }
}
