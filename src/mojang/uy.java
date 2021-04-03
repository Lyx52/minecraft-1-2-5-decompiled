package mojang;

import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class uy extends GUIManager {

   private int a;


   public void c() {
      this.buttonList.clear();
      if(this.minecraft.f.B().isHardcore()) {
         this.buttonList.add(new Button(1, this.q / 2 - 100, this.r / 4 + 96, LocalizationManagerWrapper.getLocaleString("deathScreen.deleteWorld")));
      } else {
         this.buttonList.add(new Button(1, this.q / 2 - 100, this.r / 4 + 72, LocalizationManagerWrapper.getLocaleString("deathScreen.respawn")));
         this.buttonList.add(new Button(2, this.q / 2 - 100, this.r / 4 + 96, LocalizationManagerWrapper.getLocaleString("deathScreen.titleScreen")));
         if(this.minecraft.credentials == null) {
            ((Button)this.buttonList.get(1)).visible = false;
         }
      }

      Button var2;
      for(Iterator var1 = this.buttonList.iterator(); var1.hasNext(); var2.visible = false) {
         var2 = (Button)var1.next();
      }

   }

   protected void a(char var1, int var2) {}

   protected void clickButton(Button var1) {
      switch(var1.buttonID) {
      case 1:
         if(this.minecraft.f.B().isHardcore()) {
            String var2 = this.minecraft.f.A().getWorldName();
            this.minecraft.b("Deleting world");
            SaveFileInterface var3 = this.minecraft.getSaveFileManager();
            var3.d();
            var3.deleteSave(var2);
            this.minecraft.addMenu((GUIManager)(new xt()));
         } else {
            this.minecraft.h.ag();
            this.minecraft.addMenu((GUIManager)null);
         }
         break;
      case 2:
         if(this.minecraft.l()) {
            this.minecraft.f.g();
         }

         this.minecraft.a((World)null);
         this.minecraft.addMenu((GUIManager)(new xt()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.a(0, 0, this.q, this.r, 1615855616, -1602211792);
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      boolean var4 = this.minecraft.f.B().isHardcore();
      String var5 = var4? LocalizationManagerWrapper.getLocaleString("deathScreen.title.hardcore"): LocalizationManagerWrapper.getLocaleString("deathScreen.title");
      this.a(this.u, var5, this.q / 2 / 2, 30, 16777215);
      GL11.glPopMatrix();
      if(var4) {
         this.a(this.u, LocalizationManagerWrapper.getLocaleString("deathScreen.hardcoreInfo"), this.q / 2, 144, 16777215);
      }

      this.a(this.u, LocalizationManagerWrapper.getLocaleString("deathScreen.score") + ": §e" + this.minecraft.h.ar(), this.q / 2, 100, 16777215);
      super.a(var1, var2, var3);
   }

   public boolean b() {
      return false;
   }

   public void a() {
      super.a();
      ++this.a;
      Button var2;
      if(this.a == 20) {
         for(Iterator var1 = this.buttonList.iterator(); var1.hasNext(); var2.visible = true) {
            var2 = (Button)var1.next();
         }
      }

   }
}
