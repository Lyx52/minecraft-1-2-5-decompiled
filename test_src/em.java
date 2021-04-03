import java.io.File;
import java.net.URI;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class em extends vp {

   protected vp a;
   private int b = -1;
   private String c = "";
   private cn d;


   public em(vp var1) {
      this.a = var1;
   }

   public void c() {
      adn var1 = adn.a();
      this.s.add(new z(5, this.q / 2 - 154, this.r - 48, var1.b("texturePack.openFolder")));
      this.s.add(new z(6, this.q / 2 + 4, this.r - 48, var1.b("gui.done")));
      this.p.E.a();
      this.c = (new File(Minecraft.b(), "texturepacks")).getAbsolutePath();
      this.d = new cn(this);
      this.d.a(this.s, 7, 8);
   }

   protected void a(abp var1) {
      if(var1.h) {
         if(var1.f == 5) {
            boolean var2 = false;

            try {
               Class var3 = Class.forName("java.awt.Desktop");
               Object var4 = var3.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
               var3.getMethod("browse", new Class[]{URI.class}).invoke(var4, new Object[]{(new File(Minecraft.b(), "texturepacks")).toURI()});
            } catch (Throwable var5) {
               var5.printStackTrace();
               var2 = true;
            }

            if(var2) {
               System.out.println("Opening via Sys class!");
               Sys.openURL("file://" + this.c);
            }
         } else if(var1.f == 6) {
            this.p.p.b();
            this.p.a(this.a);
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
         this.p.E.a();
         this.b += 20;
      }

      adn var4 = adn.a();
      this.a(this.u, var4.b("texturePack.title"), this.q / 2, 16, 16777215);
      this.a(this.u, var4.b("texturePack.folderInfo"), this.q / 2 - 77, this.r - 26, 8421504);
      super.a(var1, var2, var3);
   }

   public void a() {
      super.a();
      --this.b;
   }

   // $FF: synthetic method
   static Minecraft a(em var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static Minecraft b(em var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static Minecraft c(em var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static Minecraft d(em var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static Minecraft e(em var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static Minecraft f(em var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static Minecraft g(em var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static Minecraft h(em var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static Minecraft i(em var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static Minecraft j(em var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static Minecraft k(em var0) {
      return var0.p;
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
