package mojang;

import mojang.net.minecraft.client.Minecraft;

public class ajy extends GUIManager {

   private adl a;
   private boolean b = false;


   public ajy(Minecraft var1, String var2, int var3) {
      System.out.println("Connecting to " + var2 + ", " + var3);
      var1.a((World)null);
      (new ala(this, var1, var2, var3)).start();
   }

   public void a() {
      if(this.a != null) {
         this.a.b();
      }

   }

   protected void a(char var1, int var2) {}

   public void c() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      this.buttonList.clear();
      this.buttonList.add(new Button(0, this.q / 2 - 100, this.r / 4 + 120 + 12, var1.getLocaleStringByName("mojang.gui.cancel")));
   }

   protected void a(Button var1) {
      if(var1.f == 0) {
         this.b = true;
         if(this.a != null) {
            this.a.c();
         }

         this.minecraft.a((GUIManager)(new xt()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.k();
      LocalizationManager var4 = LocalizationManager.getInstance();
      if(this.a == null) {
         this.a(this.u, var4.getLocaleStringByName("connect.connecting"), this.q / 2, this.r / 2 - 50, 16777215);
         this.a(this.u, "", this.q / 2, this.r / 2 - 10, 16777215);
      } else {
         this.a(this.u, var4.getLocaleStringByName("connect.authorizing"), this.q / 2, this.r / 2 - 50, 16777215);
         this.a(this.u, this.a.a, this.q / 2, this.r / 2 - 10, 16777215);
      }

      super.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static adl a(ajy var0, adl var1) {
      return var0.a = var1;
   }

   // $FF: synthetic method
   static boolean a(ajy var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static adl b(ajy var0) {
      return var0.a;
   }
}
