package mojang;

public class cd extends GUIManager {

   private GUIManager b;
   protected String a = "Options";
   private OptionParser c;
   private static DefaultOptions[] d = new DefaultOptions[]{DefaultOptions.MUSIC, DefaultOptions.SOUND, DefaultOptions.INVERT_MOUSE, DefaultOptions.SENSITIVITY, DefaultOptions.FOV, DefaultOptions.DIFFICULTY};


   public cd(GUIManager var1, OptionParser var2) {
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
            z var7 = new z(var6.getIDS(), this.q / 2 - 155 + var2 % 2 * 160, this.r / 6 + 24 * (var2 >> 1), var6, this.c.c(var6));
            if(var6 == DefaultOptions.DIFFICULTY && this.minecraft.f != null && this.minecraft.f.B().isHardcore()) {
               var7.h = false;
               var7.title = cy.a("options.difficulty") + ": " + cy.a("options.difficulty.hardcore");
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

   protected void a(Button var1) {
      if(var1.h) {
         if(var1.f < 100 && var1 instanceof z) {
            this.c.a(((z)var1).a(), 1);
            var1.title = this.c.c(DefaultOptions.a(var1.f));
         }

         if(var1.f == 101) {
            this.minecraft.options.b();
            this.minecraft.a((GUIManager)(new jy(this, this.c)));
         }

         if(var1.f == 100) {
            this.minecraft.options.b();
            this.minecraft.a((GUIManager)(new oz(this, this.c)));
         }

         if(var1.f == 102) {
            this.minecraft.options.b();
            this.minecraft.a((GUIManager)(new afv(this, this.c)));
         }

         if(var1.f == 200) {
            this.minecraft.options.b();
            this.minecraft.a(this.b);
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, this.a, this.q / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }

}
