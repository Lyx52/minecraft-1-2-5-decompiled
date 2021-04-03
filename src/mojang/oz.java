package mojang;

public class oz extends GUIManager {

   private GUIManager b;
   protected String a = "Controls";
   private OptionParser c;
   private int d = -1;


   public oz(GUIManager var1, OptionParser var2) {
      this.b = var1;
      this.c = var2;
   }

   private int d() {
      return this.q / 2 - 155;
   }

   public void c() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      int var2 = this.d();

      for(int var3 = 0; var3 < this.c.inputKeys.length; ++var3) {
         this.buttonList.add(new TexturePackButton(var3, var2 + var3 % 2 * 160, this.r / 6 + 24 * (var3 >> 1), 70, 20, this.c.b(var3)));
      }

      this.buttonList.add(new Button(200, this.q / 2 - 100, this.r / 6 + 168, var1.getLocaleStringByName("mojang.gui.done")));
      this.a = var1.getLocaleStringByName("controls.title");
   }

   protected void clickButton(Button var1) {
      for(int var2 = 0; var2 < this.c.inputKeys.length; ++var2) {
         ((Button)this.buttonList.get(var2)).title = this.c.b(var2);
      }

      if(var1.buttonID == 200) {
         this.minecraft.addMenu(this.b);
      } else {
         this.d = var1.buttonID;
         var1.title = "> " + this.c.b(var1.buttonID) + " <";
      }

   }

   protected void a(int var1, int var2, int var3) {
      if(this.d >= 0) {
         this.c.a(this.d, -100 + var3);
         ((Button)this.buttonList.get(this.d)).title = this.c.b(this.d);
         this.d = -1;
         InputKey.b();
      } else {
         super.a(var1, var2, var3);
      }

   }

   protected void a(char var1, int var2) {
      if(this.d >= 0) {
         this.c.a(this.d, var2);
         ((Button)this.buttonList.get(this.d)).title = this.c.b(this.d);
         this.d = -1;
         InputKey.b();
      } else {
         super.a(var1, var2);
      }

   }

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, this.a, this.q / 2, 20, 16777215);
      int var4 = this.d();
      int var5 = 0;

      while(var5 < this.c.inputKeys.length) {
         boolean var6 = false;
         int var7 = 0;

         while(true) {
            if(var7 < this.c.inputKeys.length) {
               if(var7 == var5 || this.c.inputKeys[var5].keyCode != this.c.inputKeys[var7].keyCode) {
                  ++var7;
                  continue;
               }

               var6 = true;
            }

            if(this.d == var5) {
               ((Button)this.buttonList.get(var5)).title = "§f> §e??? §f<";
            } else if(var6) {
               ((Button)this.buttonList.get(var5)).title = "§c" + this.c.b(var5);
            } else {
               ((Button)this.buttonList.get(var5)).title = this.c.b(var5);
            }

            this.b(this.u, this.c.a(var5), var4 + var5 % 2 * 160 + 70 + 6, this.r / 6 + 24 * (var5 >> 1) + 7, -1);
            ++var5;
            break;
         }
      }

      super.a(var1, var2, var3);
   }
}
