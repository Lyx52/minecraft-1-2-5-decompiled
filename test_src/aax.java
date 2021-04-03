import org.lwjgl.input.Keyboard;

public class aax extends vp {

   private vp a;
   private agu b;
   private final String c;


   public aax(vp var1, String var2) {
      this.a = var1;
      this.c = var2;
   }

   public void a() {
      this.b.a();
   }

   public void c() {
      adn var1 = adn.a();
      Keyboard.enableRepeatEvents(true);
      this.s.clear();
      this.s.add(new abp(0, this.q / 2 - 100, this.r / 4 + 96 + 12, var1.b("selectWorld.renameButton")));
      this.s.add(new abp(1, this.q / 2 - 100, this.r / 4 + 120 + 12, var1.b("gui.cancel")));
      kb var2 = this.p.c();
      wq var3 = var2.b(this.c);
      String var4 = var3.j();
      this.b = new agu(this.u, this.q / 2 - 100, 60, 200, 20);
      this.b.b(true);
      this.b.a(var4);
   }

   public void e() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(abp var1) {
      if(var1.h) {
         if(var1.f == 1) {
            this.p.a(this.a);
         } else if(var1.f == 0) {
            kb var2 = this.p.c();
            var2.a(this.c, this.b.b().trim());
            this.p.a(this.a);
         }

      }
   }

   protected void a(char var1, int var2) {
      this.b.a(var1, var2);
      ((abp)this.s.get(0)).h = this.b.b().trim().length() > 0;
      if(var1 == 13) {
         this.a((abp)this.s.get(0));
      }

   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.b.a(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      adn var4 = adn.a();
      this.k();
      this.a(this.u, var4.b("selectWorld.renameTitle"), this.q / 2, this.r / 4 - 60 + 20, 16777215);
      this.b(this.u, var4.b("selectWorld.enterName"), this.q / 2 - 100, 47, 10526880);
      this.b.f();
      super.a(var1, var2, var3);
   }
}
