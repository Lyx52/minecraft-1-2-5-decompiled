package mojang;

public class ez extends GUIManager {

   private adl a;
   private int b = 0;


   public ez(adl var1) {
      this.a = var1;
   }

   protected void a(char var1, int var2) {}

   public void c() {
      this.buttonList.clear();
   }

   public void a() {
      ++this.b;
      if(this.b % 20 == 0) {
         this.a.c(new acw());
      }

      if(this.a != null) {
         this.a.b();
      }

   }

   protected void clickButton(Button var1) {}

   public void a(int var1, int var2, float var3) {
      this.e(0);
      LocalizationManager var4 = LocalizationManager.getInstance();
      this.a(this.u, var4.getLocaleStringByName("multiplayer.downloadingTerrain"), this.q / 2, this.r / 2 - 50, 16777215);
      super.a(var1, var2, var3);
   }
}
