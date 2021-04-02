package mojang;

import org.lwjgl.input.Keyboard;

public class acz extends vp {

   private static String d = "";
   private final vp a;
   private final oa c;
   private agu b;


   public acz(vp var1, oa var2) {
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
      this.s.add(new abp(0, this.q / 2 - 100, this.r / 4 + 96 + 12, var1.b("selectServer.select")));
      this.s.add(new abp(1, this.q / 2 - 100, this.r / 4 + 120 + 12, var1.b("mojang.gui.cancel")));
      this.b = new agu(this.u, this.q / 2 - 100, 116, 200, 20);
      this.b.f(128);
      this.b.b(true);
      this.b.a(d);
      ((abp)this.s.get(0)).h = this.b.b().length() > 0 && this.b.b().split(":").length > 0;
   }

   public void e() {
      Keyboard.enableRepeatEvents(false);
      d = this.b.b();
   }

   protected void a(abp var1) {
      if(var1.h) {
         if(var1.f == 1) {
            this.a.a(false, 0);
         } else if(var1.f == 0) {
            this.c.b = this.b.b();
            this.a.a(true, 0);
         }

      }
   }

   protected void a(char var1, int var2) {
      this.b.a(var1, var2);
      if(var1 == 28) {
         this.a((abp)this.s.get(0));
      }

      ((abp)this.s.get(0)).h = this.b.b().length() > 0 && this.b.b().split(":").length > 0;
   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.b.a(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      adn var4 = adn.a();
      this.k();
      this.a(this.u, var4.b("selectServer.direct"), this.q / 2, this.r / 4 - 60 + 20, 16777215);
      this.b(this.u, var4.b("addServer.enterIp"), this.q / 2 - 100, 100, 10526880);
      this.b.f();
      super.a(var1, var2, var3);
   }

}
