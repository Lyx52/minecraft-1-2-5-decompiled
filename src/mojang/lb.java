package mojang;

public class lb extends GUIManager {

   private int a = 0;
   private int b = 0;


   public void c() {
      this.a = 0;
      this.buttonList.clear();
      byte var1 = -16;
      this.buttonList.add(new Button(1, this.q / 2 - 100, this.r / 4 + 120 + var1, cy.a("menu.returnToMenu")));
      if(this.minecraft.l()) {
         ((Button)this.buttonList.get(0)).title = cy.a("menu.disconnect");
      }

      this.buttonList.add(new Button(4, this.q / 2 - 100, this.r / 4 + 24 + var1, cy.a("menu.returnToGame")));
      this.buttonList.add(new Button(0, this.q / 2 - 100, this.r / 4 + 96 + var1, cy.a("menu.options")));
      this.buttonList.add(new Button(5, this.q / 2 - 100, this.r / 4 + 48 + var1, 98, 20, cy.a("mojang.gui.achievements")));
      this.buttonList.add(new Button(6, this.q / 2 + 2, this.r / 4 + 48 + var1, 98, 20, cy.a("mojang.gui.stats")));
   }

   protected void a(Button var1) {
      switch(var1.f) {
      case 0:
         this.minecraft.a((GUIManager)(new cd(this, this.minecraft.options)));
         break;
      case 1:
         this.minecraft.K.a(gv.j, 1);
         if(this.minecraft.l()) {
            this.minecraft.f.g();
         }

         this.minecraft.a((World)null);
         this.minecraft.a((GUIManager)(new xt()));
      case 2:
      case 3:
      default:
         break;
      case 4:
         this.minecraft.a((GUIManager)null);
         this.minecraft.g();
         break;
      case 5:
         this.minecraft.a((GUIManager)(new ro(this.minecraft.K)));
         break;
      case 6:
         this.minecraft.a((GUIManager)(new dc(this, this.minecraft.K)));
      }

   }

   public void a() {
      super.a();
      ++this.b;
   }

   public void a(int var1, int var2, float var3) {
      this.k();
      boolean var4 = !this.minecraft.f.c(this.a++);
      if(var4 || this.b < 20) {
         float var5 = ((float)(this.b % 10) + var3) / 10.0F;
         var5 = Utils.sin(var5 * 3.1415927F * 2.0F) * 0.2F + 0.8F;
         int var6 = (int)(255.0F * var5);
         this.b(this.u, "Saving level..", 8, this.r - 16, var6 << 16 | var6 << 8 | var6);
      }

      this.a(this.u, "Game menu", this.q / 2, 40, 16777215);
      super.a(var1, var2, var3);
   }
}
