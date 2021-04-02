package mojang;

import org.lwjgl.input.Keyboard;

public class xs extends vp {

   private vp a;
   private agu b;
   private agu c;
   private oa d;


   public xs(vp var1, oa var2) {
      this.a = var1;
      this.d = var2;
   }

   public void a() {
      this.c.a();
      this.b.a();
   }

   public void c() {
      adn var1 = adn.a();
      Keyboard.enableRepeatEvents(true);
      this.s.clear();
      this.s.add(new abp(0, this.q / 2 - 100, this.r / 4 + 96 + 12, var1.b("addServer.add")));
      this.s.add(new abp(1, this.q / 2 - 100, this.r / 4 + 120 + 12, var1.b("mojang.gui.cancel")));
      this.c = new agu(this.u, this.q / 2 - 100, 76, 200, 20);
      this.c.b(true);
      this.c.a(this.d.a);
      this.b = new agu(this.u, this.q / 2 - 100, 116, 200, 20);
      this.b.f(128);
      this.b.a(this.d.b);
      ((abp)this.s.get(0)).h = this.b.b().length() > 0 && this.b.b().split(":").length > 0 && this.c.b().length() > 0;
   }

   public void e() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(abp var1) {
      if(var1.h) {
         if(var1.f == 1) {
            this.a.a(false, 0);
         } else if(var1.f == 0) {
            this.d.a = this.c.b();
            this.d.b = this.b.b();
            this.a.a(true, 0);
         }

      }
   }

   protected void a(char var1, int var2) {
      this.c.a(var1, var2);
      this.b.a(var1, var2);
      if(var1 == 9) {
         if(this.c.j()) {
            this.c.b(false);
            this.b.b(true);
         } else {
            this.c.b(true);
            this.b.b(false);
         }
      }

      if(var1 == 13) {
         this.a((abp)this.s.get(0));
      }

      ((abp)this.s.get(0)).h = this.b.b().length() > 0 && this.b.b().split(":").length > 0 && this.c.b().length() > 0;
      if(((abp)this.s.get(0)).h) {
         String var3 = this.b.b().trim();
         String[] var4 = var3.split(":");
         if(var4.length > 2) {
            ((abp)this.s.get(0)).h = false;
         }
      }

   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.b.a(var1, var2, var3);
      this.c.a(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      adn var4 = adn.a();
      this.k();
      this.a(this.u, var4.b("addServer.title"), this.q / 2, this.r / 4 - 60 + 20, 16777215);
      this.b(this.u, var4.b("addServer.enterName"), this.q / 2 - 100, 63, 10526880);
      this.b(this.u, var4.b("addServer.enterIp"), this.q / 2 - 100, 104, 10526880);
      this.c.f();
      this.b.f();
      super.a(var1, var2, var3);
   }
}
