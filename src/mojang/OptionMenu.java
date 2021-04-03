package mojang;

public class OptionMenu extends GUIManager {

   private GUIManager b;
   protected String a = "Options";
   private OptionParser c;
   private static DefaultOptions[] d = new DefaultOptions[]{DefaultOptions.MUSIC, DefaultOptions.SOUND, DefaultOptions.INVERT_MOUSE, DefaultOptions.SENSITIVITY, DefaultOptions.FOV, DefaultOptions.DIFFICULTY};


   public OptionMenu(GUIManager var1, OptionParser var2) {
      this.b = var1;
      this.c = var2;
   }

   public void c() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      this.a = var1.getLocaleStringByName("options.title");
      int var2 = 0;
      DefaultOptions[] var3 = d;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         DefaultOptions var6 = var3[var5];
         if(!var6.a()) {
            TexturePackButton var7 = new TexturePackButton(var6.getIDS(), this.q / 2 - 155 + var2 % 2 * 160, this.r / 6 + 24 * (var2 >> 1), var6, this.c.c(var6));
            if(var6 == DefaultOptions.DIFFICULTY && this.minecraft.f != null && this.minecraft.f.B().isHardcore()) {
               var7.visible = false;
               var7.title = LocalizationManagerWrapper.getLocaleString("options.difficulty") + ": " + LocalizationManagerWrapper.getLocaleString("options.difficulty.hardcore");
            }

            this.buttonList.add(var7);
         } else {
            this.buttonList.add(new ajz(var6.getIDS(), this.q / 2 - 155 + var2 % 2 * 160, this.r / 6 + 24 * (var2 >> 1), var6, this.c.c(var6), this.c.a(var6)));
         }

         ++var2;
      }

      this.buttonList.add(new Button(101, this.q / 2 - 100, this.r / 6 + 96 - 6, var1.getLocaleStringByName("options.video")));
      this.buttonList.add(new Button(100, this.q / 2 - 100, this.r / 6 + 120 - 6, var1.getLocaleStringByName("options.controls")));
      this.buttonList.add(new Button(102, this.q / 2 - 100, this.r / 6 + 144 - 6, var1.getLocaleStringByName("options.language")));
      this.buttonList.add(new Button(200, this.q / 2 - 100, this.r / 6 + 168, var1.getLocaleStringByName("mojang.gui.done")));
   }

   protected void clickButton(Button var1) {
      if(var1.visible) {
         if(var1.buttonID < 100 && var1 instanceof TexturePackButton) {
            this.c.a(((TexturePackButton)var1).getOptions(), 1);
            var1.title = this.c.c(DefaultOptions.a(var1.buttonID));
         }

         if(var1.buttonID == 101) {
            this.minecraft.options.b();
            this.minecraft.addMenu((GUIManager)(new jy(this, this.c)));
         }

         if(var1.buttonID == 100) {
            this.minecraft.options.b();
            this.minecraft.addMenu((GUIManager)(new oz(this, this.c)));
         }

         if(var1.buttonID == 102) {
            this.minecraft.options.b();
            this.minecraft.addMenu((GUIManager)(new LanguageOptionMenu(this, this.c)));
         }

         if(var1.buttonID == 200) {
            this.minecraft.options.b();
            this.minecraft.addMenu(this.b);
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, this.a, this.q / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }

}
