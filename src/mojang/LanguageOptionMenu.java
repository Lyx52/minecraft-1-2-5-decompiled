package mojang;

public class LanguageOptionMenu extends GUIManager {

   protected GUIManager a;
   private int b = -1;
   private yk c;
   private final OptionParser d;
   private TexturePackButton e;


   public LanguageOptionMenu(GUIManager var1, OptionParser var2) {
      this.a = var1;
      this.d = var2;
   }

   public void c() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      this.buttonList.add(this.e = new TexturePackButton(6, this.q / 2 - 75, this.r - 38, var1.getLocaleStringByName("mojang.gui.done")));
      this.c = new yk(this);
      this.c.alist(this.buttonList, 7, 8);
   }

   protected void clickButton(Button var1) {
      if(var1.visible) {
         switch(var1.buttonID) {
         case 5:
            break;
         case 6:
            this.d.b();
            this.minecraft.addMenu(this.a);
            break;
         default:
            this.c.a(var1);
         }

      }
   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   protected void b(int var1, int var2, int var3) {
      super.b(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      this.c.a(var1, var2, var3);
      if(this.b <= 0) {
         this.minecraft.texturePackManager.readTexturePacks();
         this.b += 20;
      }

      LocalizationManager var4 = LocalizationManager.getInstance();
      this.a(this.u, var4.getLocaleStringByName("options.language"), this.q / 2, 16, 16777215);
      this.a(this.u, "(" + var4.getLocaleStringByName("options.languageWarning") + ")", this.q / 2, this.r - 56, 8421504);
      super.a(var1, var2, var3);
   }

   public void a() {
      super.a();
      --this.b;
   }

   // $FF: synthetic method
   static OptionParser a(LanguageOptionMenu var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static TexturePackButton b(LanguageOptionMenu var0) {
      return var0.e;
   }
}
