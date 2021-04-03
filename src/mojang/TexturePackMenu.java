package mojang;

import java.io.File;
import java.net.URI;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class TexturePackMenu extends GUIManager {

   protected GUIManager a;
   private int b = -1;
   private String texturePacks = "";
   private cn d;


   public TexturePackMenu(GUIManager var1) {
      this.a = var1;
   }

   public void c() {
      LocalizationManager localeManager = LocalizationManager.getInstance();
      this.buttonList.add(new TexturePackButton(5, this.q / 2 - 154, this.r - 48, localeManager.getLocaleStringByName("texturePack.openFolder")));
      this.buttonList.add(new TexturePackButton(6, this.q / 2 + 4, this.r - 48, localeManager.getLocaleStringByName("mojang.gui.done")));
      this.minecraft.texturePackManager.readTexturePacks();
      this.texturePacks = (new File(Minecraft.getGameDirectory(), "texturepacks")).getAbsolutePath();
      this.d = new cn(this);
      this.d.alist(this.buttonList, 7, 8);
   }

   protected void clickButton(Button var1) {
      if(var1.visible) {
         if(var1.buttonID == 5) {
            boolean var2 = false;

            try {
               Class var3 = Class.forName("java.awt.Desktop");
               Object var4 = var3.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
               var3.getMethod("browse", new Class[]{URI.class}).invoke(var4, new Object[]{(new File(Minecraft.getGameDirectory(), "texturepacks")).toURI()});
            } catch (Throwable var5) {
               var5.printStackTrace();
               var2 = true;
            }

            if(var2) {
               System.out.println("Opening via Sys class!");
               Sys.openURL("file://" + this.texturePacks);
            }
         } else if(var1.buttonID == 6) {
            this.minecraft.textureManager.b();
            this.minecraft.addMenu(this.a);
         } else {
            this.d.a(var1);
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
      this.d.a(var1, var2, var3);
      if(this.b <= 0) {
         this.minecraft.texturePackManager.readTexturePacks();
         this.b += 20;
      }

      LocalizationManager var4 = LocalizationManager.getInstance();
      this.a(this.u, var4.getLocaleStringByName("texturePack.title"), this.q / 2, 16, 16777215);
      this.a(this.u, var4.getLocaleStringByName("texturePack.folderInfo"), this.q / 2 - 77, this.r - 26, 8421504);
      super.a(var1, var2, var3);
   }

   public void a() {
      super.a();
      --this.b;
   }

   // $FF: synthetic method
   static Minecraft a(TexturePackMenu var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft b(TexturePackMenu var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft c(TexturePackMenu var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft d(TexturePackMenu var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft e(TexturePackMenu var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft f(TexturePackMenu var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft g(TexturePackMenu var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft h(TexturePackMenu var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft i(TexturePackMenu var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft j(TexturePackMenu var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft k(TexturePackMenu var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static nl l(TexturePackMenu var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static nl m(TexturePackMenu var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static nl n(TexturePackMenu var0) {
      return var0.u;
   }
}
