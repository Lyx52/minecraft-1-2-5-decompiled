package mojang;

public class jy extends GUIManager {

   private GUIManager b;
   protected String a = "Video Settings";
   private OptionParser c;
   private boolean d = false;
   private static DefaultOptions[] e = new DefaultOptions[]{DefaultOptions.GRAPHICS, DefaultOptions.RENDER_DISTANCE, DefaultOptions.ABIENT_OCCLUSION, DefaultOptions.FRAMERATE_LIMIT, DefaultOptions.ANAGLYPH, DefaultOptions.VIEW_BOBBING, DefaultOptions.GUI_SCALE, DefaultOptions.ADVANCED_OPENGL, DefaultOptions.GAMMA, DefaultOptions.RENDER_CLOUDS, DefaultOptions.PARTICLES};


   public jy(GUIManager var1, OptionParser var2) {
      this.b = var1;
      this.c = var2;
   }

   public void c() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      this.a = var1.getLocaleStringByName("options.videoTitle");
      int var2 = 0;
      DefaultOptions[] var3 = e;
      int var4 = var3.length;

      int var5;
      for(var5 = 0; var5 < var4; ++var5) {
         DefaultOptions var6 = var3[var5];
         if(!var6.a()) {
            this.buttonList.add(new z(var6.getIDS(), this.q / 2 - 155 + var2 % 2 * 160, this.r / 6 + 24 * (var2 >> 1), var6, this.c.c(var6)));
         } else {
            this.buttonList.add(new ajz(var6.getIDS(), this.q / 2 - 155 + var2 % 2 * 160, this.r / 6 + 24 * (var2 >> 1), var6, this.c.c(var6), this.c.a(var6)));
         }

         ++var2;
      }

      this.buttonList.add(new Button(200, this.q / 2 - 100, this.r / 6 + 168, var1.getLocaleStringByName("mojang.gui.done")));
      this.d = false;
      String[] var9 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
      String[] var10 = var9;
      var5 = var9.length;

      for(int var11 = 0; var11 < var5; ++var11) {
         String var7 = var10[var11];
         String var8 = System.getProperty(var7);
         if(var8 != null && var8.indexOf("64") >= 0) {
            this.d = true;
            break;
         }
      }

   }

   protected void a(Button var1) {
      if(var1.h) {
         int var2 = this.c.guiScale;
         if(var1.f < 100 && var1 instanceof z) {
            this.c.a(((z)var1).a(), 1);
            var1.title = this.c.c(DefaultOptions.a(var1.f));
         }

         if(var1.f == 200) {
            this.minecraft.options.b();
            this.minecraft.a(this.b);
         }

         if(this.c.guiScale != var2) {
            WindowScaler var3 = new WindowScaler(this.minecraft.options, this.minecraft.width, this.minecraft.height);
            int var4 = var3.getWidth();
            int var5 = var3.getHeight();
            this.a(this.minecraft, var4, var5);
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, this.a, this.q / 2, 20, 16777215);
      if(!this.d && this.c.viewDistance == 0) {
         this.a(this.u, cy.a("options.farWarning1"), this.q / 2, this.r / 6 + 144, 11468800);
         this.a(this.u, cy.a("options.farWarning2"), this.q / 2, this.r / 6 + 144 + 12, 11468800);
      }

      super.a(var1, var2, var3);
   }

}
