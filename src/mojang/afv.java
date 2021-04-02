package mojang;

public class afv extends vp {

   protected vp a;
   private int b = -1;
   private yk c;
   private final hu d;
   private z e;


   public afv(vp var1, hu var2) {
      this.a = var1;
      this.d = var2;
   }

   public void c() {
      adn var1 = adn.a();
      this.s.add(this.e = new z(6, this.q / 2 - 75, this.r - 38, var1.b("mojang.gui.done")));
      this.c = new yk(this);
      this.c.alist(this.s, 7, 8);
   }

   protected void a(abp var1) {
      if(var1.h) {
         switch(var1.f) {
         case 5:
            break;
         case 6:
            this.d.b();
            this.p.a(this.a);
            break;
         default:
            this.c.a(var1);
         }

      }
   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   protected void b(int var1, int var2, int var3) {
      super.b(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      this.c.a(var1, var2, var3);
      if(this.b <= 0) {
         this.p.E.a();
         this.b += 20;
      }

      adn var4 = adn.a();
      this.a(this.u, var4.b("options.language"), this.q / 2, 16, 16777215);
      this.a(this.u, "(" + var4.b("options.languageWarning") + ")", this.q / 2, this.r - 56, 8421504);
      super.a(var1, var2, var3);
   }

   public void a() {
      super.a();
      --this.b;
   }

   // $FF: synthetic method
   static hu a(afv var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static z b(afv var0) {
      return var0.e;
   }
}
