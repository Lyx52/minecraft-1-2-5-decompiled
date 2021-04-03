
public abstract class agk extends mi {

   private String a;
   private String b;


   public agk(vp var1, String var2, int var3) {
      super(var1, adn.a().b("chat.link.confirm"), var2, var3);
      adn var4 = adn.a();
      this.c = var4.b("gui.yes");
      this.d = var4.b("gui.no");
      this.b = var4.b("chat.copy");
      this.a = var4.b("chat.link.warning");
   }

   public void c() {
      this.s.add(new abp(0, this.q / 3 - 83 + 0, this.r / 6 + 96, 100, 20, this.c));
      this.s.add(new abp(2, this.q / 3 - 83 + 105, this.r / 6 + 96, 100, 20, this.b));
      this.s.add(new abp(1, this.q / 3 - 83 + 210, this.r / 6 + 96, 100, 20, this.d));
   }

   protected void a(abp var1) {
      if(var1.f == 2) {
         this.d();
         super.a((abp)this.s.get(1));
      } else {
         super.a(var1);
      }

   }

   public abstract void d();

   public void a(int var1, int var2, float var3) {
      super.a(var1, var2, var3);
      this.a(this.u, this.a, this.q / 2, 110, 16764108);
   }
}
