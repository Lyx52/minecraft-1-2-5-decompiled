
public class afx extends vp {

   private int a = 0;


   public void a() {
      ++this.a;
   }

   public void c() {
      this.s.clear();
      this.s.add(new abp(0, this.q / 2 - 100, this.r / 4 + 120 + 12, "Back to title screen"));
   }

   protected void a(abp var1) {
      if(var1.h) {
         if(var1.f == 0) {
            this.p.a((vp)(new xt()));
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, "Level save conflict", this.q / 2, this.r / 4 - 60 + 20, 16777215);
      this.b(this.u, "Minecraft detected a conflict in the level save data.", this.q / 2 - 140, this.r / 4 - 60 + 60 + 0, 10526880);
      this.b(this.u, "This could be caused by two copies of the game", this.q / 2 - 140, this.r / 4 - 60 + 60 + 18, 10526880);
      this.b(this.u, "accessing the same level.", this.q / 2 - 140, this.r / 4 - 60 + 60 + 27, 10526880);
      this.b(this.u, "To prevent level corruption, the current game has quit.", this.q / 2 - 140, this.r / 4 - 60 + 60 + 45, 10526880);
      super.a(var1, var2, var3);
   }
}
