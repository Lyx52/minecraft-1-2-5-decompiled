package mojang;

public class dw extends GUIManager {

   private String a;
   private String b;


   public dw(String var1, String var2, Object ... var3) {
      LocalizationManager var4 = LocalizationManager.getInstance();
      this.a = var4.getLocaleStringByName(var1);
      if(var3 != null) {
         this.b = var4.formatLocaleString(var2, var3);
      } else {
         this.b = var4.getLocaleStringByName(var2);
      }

   }

   public void a() {}

   protected void a(char var1, int var2) {}

   public void c() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      this.buttonList.clear();
      this.buttonList.add(new Button(0, this.q / 2 - 100, this.r / 4 + 120 + 12, var1.getLocaleStringByName("mojang.gui.toMenu")));
   }

   protected void clickButton(Button var1) {
      if(var1.buttonID == 0) {
         this.minecraft.addMenu((GUIManager)(new xt()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, this.a, this.q / 2, this.r / 2 - 50, 16777215);
      this.a(this.u, this.b, this.q / 2, this.r / 2 - 10, 16777215);
      super.a(var1, var2, var3);
   }
}
