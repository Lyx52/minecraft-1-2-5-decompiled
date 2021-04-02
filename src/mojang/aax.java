package mojang;

import org.lwjgl.input.Keyboard;

public class aax extends GUIManager {

   private GUIManager a;
   private agu b;
   private final String c;


   public aax(GUIManager var1, String var2) {
      this.a = var1;
      this.c = var2;
   }

   public void a() {
      this.b.a();
   }

   public void c() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      this.buttonList.add(new Button(0, this.q / 2 - 100, this.r / 4 + 96 + 12, var1.getLocaleStringByName("selectWorld.renameButton")));
      this.buttonList.add(new Button(1, this.q / 2 - 100, this.r / 4 + 120 + 12, var1.getLocaleStringByName("mojang.gui.cancel")));
      SaveFileInterface var2 = this.minecraft.getSaveFileManager();
      WorldParser var3 = var2.parseSaveFile(this.c);
      String var4 = var3.getLevelName();
      this.b = new agu(this.u, this.q / 2 - 100, 60, 200, 20);
      this.b.b(true);
      this.b.a(var4);
   }

   public void e() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(Button var1) {
      if(var1.h) {
         if(var1.f == 1) {
            this.minecraft.a(this.a);
         } else if(var1.f == 0) {
            SaveFileInterface var2 = this.minecraft.getSaveFileManager();
            var2.a(this.c, this.b.b().trim());
            this.minecraft.a(this.a);
         }

      }
   }

   protected void a(char var1, int var2) {
      this.b.a(var1, var2);
      ((Button)this.buttonList.get(0)).h = this.b.b().trim().length() > 0;
      if(var1 == 13) {
         this.a((Button)this.buttonList.get(0));
      }

   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.b.a(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      LocalizationManager var4 = LocalizationManager.getInstance();
      this.k();
      this.a(this.u, var4.getLocaleStringByName("selectWorld.renameTitle"), this.q / 2, this.r / 4 - 60 + 20, 16777215);
      this.b(this.u, var4.getLocaleStringByName("selectWorld.enterName"), this.q / 2 - 100, 47, 10526880);
      this.b.f();
      super.a(var1, var2, var3);
   }
}
