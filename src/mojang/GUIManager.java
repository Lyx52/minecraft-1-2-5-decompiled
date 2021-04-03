package mojang;

import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class GUIManager extends InterfaceRendererUtils {

   protected Minecraft minecraft;
   public int q;
   public int r;
   protected List buttonList = new ArrayList();
   public boolean t = false;
   protected nl u;
   public wg v;
   private Button a = null;


   public void a(int var1, int var2, float var3) {
      for(int var4 = 0; var4 < this.buttonList.size(); ++var4) {
         Button var5 = (Button)this.buttonList.get(var4);
         var5.a(this.minecraft, var1, var2);
      }

   }

   protected void a(char var1, int var2) {
      if(var2 == 1) {
         this.minecraft.addMenu((GUIManager)null);
         this.minecraft.g();
      }

   }

   public static String h() {
      try {
         Transferable var0 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object)null);
         if(var0 != null && var0.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return (String)var0.getTransferData(DataFlavor.stringFlavor);
         }
      } catch (Exception var1) {
         ;
      }

      return "";
   }

   public static void a(String var0) {
      try {
         StringSelection var1 = new StringSelection(var0);
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(var1, (ClipboardOwner)null);
      } catch (Exception var2) {
         ;
      }

   }

   protected void a(int var1, int var2, int var3) {
      if(var3 == 0) {
         for(int var4 = 0; var4 < this.buttonList.size(); ++var4) {
            Button var5 = (Button)this.buttonList.get(var4);
            if(var5.c(this.minecraft, var1, var2)) {
               this.a = var5;
               this.minecraft.soundManager.a("random.click", 1.0F, 1.0F);
               this.clickButton(var5);
            }
         }
      }

   }

   protected void b(int var1, int var2, int var3) {
      if(this.a != null && var3 == 0) {
         this.a.a(var1, var2);
         this.a = null;
      }

   }

   protected void clickButton(Button var1) {}

   public void a(Minecraft var1, int var2, int var3) {
      this.v = new wg(var1);
      this.minecraft = var1;
      this.u = var1.q;
      this.q = var2;
      this.r = var3;
      this.buttonList.clear();
      this.c();
   }

   public void c() {}

   public void i() {
      while(Mouse.next()) {
         this.f();
      }

      while(Keyboard.next()) {
         this.j();
      }

   }

   public void f() {
      int var1;
      int var2;
      if(Mouse.getEventButtonState()) {
         var1 = Mouse.getEventX() * this.q / this.minecraft.width;
         var2 = this.r - Mouse.getEventY() * this.r / this.minecraft.height - 1;
         this.a(var1, var2, Mouse.getEventButton());
      } else {
         var1 = Mouse.getEventX() * this.q / this.minecraft.width;
         var2 = this.r - Mouse.getEventY() * this.r / this.minecraft.height - 1;
         this.b(var1, var2, Mouse.getEventButton());
      }

   }

   public void j() {
      if(Keyboard.getEventKeyState()) {
         if(Keyboard.getEventKey() == 87) {
            this.minecraft.toggleFullscreen();
            return;
         }

         this.a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
      }

   }

   public void a() {}

   public void e() {}

   public void k() {
      this.d(0);
   }

   public void d(int var1) {
      if(this.minecraft.f != null) {
         this.a(0, 0, this.q, this.r, -1072689136, -804253680);
      } else {
         this.e(var1);
      }

   }

   public void e(int var1) {
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      Tessalator var2 = Tessalator.tessalatorInstance;
      GL11.glBindTexture(3553, this.minecraft.textureManager.readImageFromLocation("/mojang/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var3 = 32.0F;
      var2.b();
      var2.c(4210752);
      var2.a(0.0D, (double)this.r, 0.0D, 0.0D, (double)((float)this.r / var3 + (float)var1));
      var2.a((double)this.q, (double)this.r, 0.0D, (double)((float)this.q / var3), (double)((float)this.r / var3 + (float)var1));
      var2.a((double)this.q, 0.0D, 0.0D, (double)((float)this.q / var3), (double)var1);
      var2.a(0.0D, 0.0D, 0.0D, 0.0D, (double)var1);
      var2.a();
   }

   public boolean b() {
      return true;
   }

   public void a(boolean var1, int var2) {}

   public static boolean l() {
      return Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157);
   }

   public static boolean m() {
      return Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54);
   }
}
