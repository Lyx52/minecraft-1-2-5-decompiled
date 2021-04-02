package mojang;

class ns extends iff {

   // $FF: synthetic field
   final dc a;


   public ns(dc var1) {
      super(dc.a(var1), var1.q, var1.r, 32, var1.r - 64, 10);
      this.a = var1;
      this.a(false);
   }

   protected int a() {
      return gv.c.size();
   }

   protected void a(int var1, boolean var2) {}

   protected boolean b_(int var1) {
      return false;
   }

   protected int b() {
      return this.a() * 10;
   }

   protected void c() {
      this.a.k();
   }

   protected void a(int var1, int var2, int var3, int var4, adz var5) {
      ajw var6 = (ajw)gv.c.get(var1);
      this.a.b(dc.b(this.a), cy.a(var6.i()), var2 + 2, var3 + 1, var1 % 2 == 0?16777215:9474192);
      String var7 = var6.a(dc.c(this.a).a(var6));
      this.a.b(dc.d(this.a), var7, var2 + 2 + 213 - dc.e(this.a).a(var7), var3 + 1, var1 % 2 == 0?16777215:9474192);
   }
}
