package mojang;

import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class dc extends GUIManager {

   private static tw c = new tw();
   protected GUIManager a;
   protected String b = "Select world";
   private ns d;
   private bx e;
   private er f;
   private alf h;
   private iff i = null;


   public dc(GUIManager var1, alf var2) {
      this.a = var1;
      this.h = var2;
   }

   public void c() {
      this.b = LocalizationManagerWrapper.getLocaleString("mojang.gui.stats");
      this.d = new ns(this);
      this.d.alist(this.buttonList, 1, 1);
      this.e = new bx(this);
      this.e.alist(this.buttonList, 1, 1);
      this.f = new er(this);
      this.f.alist(this.buttonList, 1, 1);
      this.i = this.d;
      this.d();
   }

   public void d() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      this.buttonList.add(new Button(0, this.q / 2 + 4, this.r - 28, 150, 20, var1.getLocaleStringByName("mojang.gui.done")));
      this.buttonList.add(new Button(1, this.q / 2 - 154, this.r - 52, 100, 20, var1.getLocaleStringByName("stat.generalButton")));
      Button var2;
      this.buttonList.add(var2 = new Button(2, this.q / 2 - 46, this.r - 52, 100, 20, var1.getLocaleStringByName("stat.blocksButton")));
      Button var3;
      this.buttonList.add(var3 = new Button(3, this.q / 2 + 62, this.r - 52, 100, 20, var1.getLocaleStringByName("stat.itemsButton")));
      if(this.f.a() == 0) {
         var2.visible = false;
      }

      if(this.e.a() == 0) {
         var3.visible = false;
      }

   }

   protected void clickButton(Button var1) {
      if(var1.visible) {
         if(var1.buttonID == 0) {
            this.minecraft.addMenu(this.a);
         } else if(var1.buttonID == 1) {
            this.i = this.d;
         } else if(var1.buttonID == 3) {
            this.i = this.e;
         } else if(var1.buttonID == 2) {
            this.i = this.f;
         } else {
            this.i.a(var1);
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.i.a(var1, var2, var3);
      this.a(this.u, this.b, this.q / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }

   private void c(int var1, int var2, int var3) {
      this.a(var1 + 1, var2 + 1);
      GL11.glEnable('\u803a');
      tf.c();
      c.a(this.u, this.minecraft.textureManager, var3, 0, yr.e[var3].b(0), var1 + 2, var2 + 2);
      tf.a();
      GL11.glDisable('\u803a');
   }

   private void a(int var1, int var2) {
      this.c(var1, var2, 0, 0);
   }

   private void c(int var1, int var2, int var3, int var4) {
      int var5 = this.minecraft.textureManager.readImageFromLocation("/mojang/gui/slot.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.minecraft.textureManager.b(var5);
      Tessalator var10 = Tessalator.tessalatorInstance;
      var10.b();
      var10.a((double)(var1 + 0), (double)(var2 + 18), (double)this.g, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.a((double)(var1 + 18), (double)(var2 + 18), (double)this.g, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.a((double)(var1 + 18), (double)(var2 + 0), (double)this.g, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.a((double)(var1 + 0), (double)(var2 + 0), (double)this.g, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.a();
   }

   // $FF: synthetic method
   static Minecraft a(dc var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static nl b(dc var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static alf c(dc var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static nl d(dc var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static nl e(dc var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static Minecraft f(dc var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static void a(dc var0, int var1, int var2, int var3, int var4) {
      var0.c(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   static Minecraft g(dc var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static nl h(dc var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static nl i(dc var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static nl j(dc var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static nl k(dc var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static nl l(dc var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static void a(dc var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.a(var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   static nl m(dc var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static nl n(dc var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static void b(dc var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.a(var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   static nl o(dc var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static void a(dc var0, int var1, int var2, int var3) {
      var0.c(var1, var2, var3);
   }

}
