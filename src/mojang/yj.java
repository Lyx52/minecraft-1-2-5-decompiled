package mojang;

public class yj extends yf {

   public void c() {
      super.c();
      LocalizationManager var1 = LocalizationManager.getInstance();
      this.buttonList.add(new Button(1, this.q / 2 - 100, this.r - 40, var1.getLocaleStringByName("multiplayer.stopSleeping")));
   }

   protected void a(char var1, int var2) {
      if(var2 == 1) {
         this.g();
      } else if(var2 == 28) {
         String var3 = this.a.b().trim();
         if(var3.length() > 0) {
            this.minecraft.h.a(var3);
         }

         this.a.a("");
         this.minecraft.w.d();
      } else {
         super.a(var1, var2);
      }

   }

   protected void clickButton(Button var1) {
      if(var1.buttonID == 1) {
         this.g();
      } else {
         super.clickButton(var1);
      }

   }

   private void g() {
      if(this.minecraft.h instanceof ahv) {
         adl var1 = ((ahv)this.minecraft.h).cl;
         var1.c(new aig(this.minecraft.h, 3));
      }

   }
}
