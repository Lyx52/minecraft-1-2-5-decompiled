package mojang;

public class ti extends vp {

   public void a() {}

   public void c() {
      adn var1 = adn.a();
      this.s.clear();
      this.s.add(new z(0, this.q / 2 - 155, this.r / 4 + 120 + 12, var1.b("mojang.gui.toMenu")));
      this.s.add(new z(1, this.q / 2 - 155 + 160, this.r / 4 + 120 + 12, var1.b("menu.quit")));
   }

   protected void a(abp var1) {
      if(var1.f == 0) {
         this.p.a((vp)(new xt()));
      } else if(var1.f == 1) {
         this.p.f();
      }

   }

   protected void a(char var1, int var2) {}

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, "Out of memory!", this.q / 2, this.r / 4 - 60 + 20, 16777215);
      this.b(this.u, "Minecraft has run out of memory.", this.q / 2 - 140, this.r / 4 - 60 + 60 + 0, 10526880);
      this.b(this.u, "This could be caused by a bug in the game or by the", this.q / 2 - 140, this.r / 4 - 60 + 60 + 18, 10526880);
      this.b(this.u, "Java Virtual Machine not being allocated enough", this.q / 2 - 140, this.r / 4 - 60 + 60 + 27, 10526880);
      this.b(this.u, "memory. If you are playing in a web browser, try", this.q / 2 - 140, this.r / 4 - 60 + 60 + 36, 10526880);
      this.b(this.u, "downloading the game and playing it offline.", this.q / 2 - 140, this.r / 4 - 60 + 60 + 45, 10526880);
      this.b(this.u, "To prevent level corruption, the current game has quit.", this.q / 2 - 140, this.r / 4 - 60 + 60 + 63, 10526880);
      this.b(this.u, "We\'ve tried to free up enough memory to let you go back to", this.q / 2 - 140, this.r / 4 - 60 + 60 + 81, 10526880);
      this.b(this.u, "the main menu and back to playing, but this may not have worked.", this.q / 2 - 140, this.r / 4 - 60 + 60 + 90, 10526880);
      this.b(this.u, "Please restart the game if you see this message again.", this.q / 2 - 140, this.r / 4 - 60 + 60 + 99, 10526880);
      super.a(var1, var2, var3);
   }
}
