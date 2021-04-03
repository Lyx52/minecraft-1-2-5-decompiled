package mojang;

import org.lwjgl.input.Keyboard;

public class xs extends GUIManager {

   private GUIManager a;
   private agu b;
   private agu c;
   private oa d;


   public xs(GUIManager var1, oa var2) {
      this.a = var1;
      this.d = var2;
   }

   public void a() {
      this.c.a();
      this.b.a();
   }

   public void c() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      this.buttonList.add(new Button(0, this.q / 2 - 100, this.r / 4 + 96 + 12, var1.getLocaleStringByName("addServer.add")));
      this.buttonList.add(new Button(1, this.q / 2 - 100, this.r / 4 + 120 + 12, var1.getLocaleStringByName("mojang.gui.cancel")));
      this.c = new agu(this.u, this.q / 2 - 100, 76, 200, 20);
      this.c.b(true);
      this.c.a(this.d.a);
      this.b = new agu(this.u, this.q / 2 - 100, 116, 200, 20);
      this.b.f(128);
      this.b.a(this.d.b);
      ((Button)this.buttonList.get(0)).visible = this.b.b().length() > 0 && this.b.b().split(":").length > 0 && this.c.b().length() > 0;
   }

   public void e() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void clickButton(Button var1) {
      if(var1.visible) {
         if(var1.buttonID == 1) {
            this.a.a(false, 0);
         } else if(var1.buttonID == 0) {
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
         this.clickButton((Button)this.buttonList.get(0));
      }

      ((Button)this.buttonList.get(0)).visible = this.b.b().length() > 0 && this.b.b().split(":").length > 0 && this.c.b().length() > 0;
      if(((Button)this.buttonList.get(0)).visible) {
         String var3 = this.b.b().trim();
         String[] var4 = var3.split(":");
         if(var4.length > 2) {
            ((Button)this.buttonList.get(0)).visible = false;
         }
      }

   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.b.a(var1, var2, var3);
      this.c.a(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      LocalizationManager var4 = LocalizationManager.getInstance();
      this.k();
      this.a(this.u, var4.getLocaleStringByName("addServer.title"), this.q / 2, this.r / 4 - 60 + 20, 16777215);
      this.b(this.u, var4.getLocaleStringByName("addServer.enterName"), this.q / 2 - 100, 63, 10526880);
      this.b(this.u, var4.getLocaleStringByName("addServer.enterIp"), this.q / 2 - 100, 104, 10526880);
      this.c.f();
      this.b.f();
      super.a(var1, var2, var3);
   }
}
