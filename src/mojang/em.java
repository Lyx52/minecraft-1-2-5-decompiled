package mojang;

import java.io.File;
import java.net.URI;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class em extends GUIManager {

   protected GUIManager a;
   private int b = -1;
   private String c = "";
   private cn d;


   public em(GUIManager var1) {
      this.a = var1;
   }

   public void c() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      this.buttonList.add(new z(5, this.q / 2 - 154, this.r - 48, var1.getLocaleStringByName("texturePack.openFolder")));
      this.buttonList.add(new z(6, this.q / 2 + 4, this.r - 48, var1.getLocaleStringByName("mojang.gui.done")));
      this.minecraft.texturePackManager.readTexturePacks();
      this.c = (new File(Minecraft.getGameDirectory(), "texturepacks")).getAbsolutePath();
      this.d = new cn(this);
      this.d.alist(this.buttonList, 7, 8);
   }

   protected void a(Button var1) {
      if(var1.h) {
         if(var1.f == 5) {
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
               Sys.openURL("file://" + this.c);
            }
         } else if(var1.f == 6) {
            this.minecraft.p.b();
            this.minecraft.a(this.a);
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
   static Minecraft a(em var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft b(em var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft c(em var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft d(em var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft e(em var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft f(em var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft g(em var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft h(em var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft i(em var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft j(em var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static Minecraft k(em var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static nl l(em var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static nl m(em var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static nl n(em var0) {
      return var0.u;
   }
}
