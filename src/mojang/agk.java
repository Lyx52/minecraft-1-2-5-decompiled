package mojang;

public abstract class agk extends mi {

   private String a;
   private String b;


   public agk(GUIManager var1, String var2, int var3) {
      super(var1, LocalizationManager.getInstance().getLocaleStringByName("chat.link.confirm"), var2, var3);
      LocalizationManager var4 = LocalizationManager.getInstance();
      this.c = var4.getLocaleStringByName("mojang.gui.yes");
      this.d = var4.getLocaleStringByName("mojang.gui.no");
      this.b = var4.getLocaleStringByName("chat.copy");
      this.a = var4.getLocaleStringByName("chat.link.warning");
   }

   public void c() {
      this.buttonList.add(new Button(0, this.q / 3 - 83 + 0, this.r / 6 + 96, 100, 20, this.c));
      this.buttonList.add(new Button(2, this.q / 3 - 83 + 105, this.r / 6 + 96, 100, 20, this.b));
      this.buttonList.add(new Button(1, this.q / 3 - 83 + 210, this.r / 6 + 96, 100, 20, this.d));
   }

   protected void clickButton(Button var1) {
      if(var1.buttonID == 2) {
         this.d();
         super.clickButton((Button)this.buttonList.get(1));
      } else {
         super.clickButton(var1);
      }

   }

   public abstract void d();

   public void a(int var1, int var2, float var3) {
      super.a(var1, var2, var3);
      this.a(this.u, this.a, this.q / 2, 110, 16764108);
   }
}
