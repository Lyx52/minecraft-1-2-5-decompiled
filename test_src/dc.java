import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class dc extends vp {

   private static tw c = new tw();
   protected vp a;
   protected String b = "Select world";
   private ns d;
   private bx e;
   private er f;
   private alf h;
   private if i = null;


   public dc(vp var1, alf var2) {
      this.a = var1;
      this.h = var2;
   }

   public void c() {
      this.b = cy.a("gui.stats");
      this.d = new ns(this);
      this.d.a(this.s, 1, 1);
      this.e = new bx(this);
      this.e.a(this.s, 1, 1);
      this.f = new er(this);
      this.f.a(this.s, 1, 1);
      this.i = this.d;
      this.d();
   }

   public void d() {
      adn var1 = adn.a();
      this.s.add(new abp(0, this.q / 2 + 4, this.r - 28, 150, 20, var1.b("gui.done")));
      this.s.add(new abp(1, this.q / 2 - 154, this.r - 52, 100, 20, var1.b("stat.generalButton")));
      abp var2;
      this.s.add(var2 = new abp(2, this.q / 2 - 46, this.r - 52, 100, 20, var1.b("stat.blocksButton")));
      abp var3;
      this.s.add(var3 = new abp(3, this.q / 2 + 62, this.r - 52, 100, 20, var1.b("stat.itemsButton")));
      if(this.f.a() == 0) {
         var2.h = false;
      }

      if(this.e.a() == 0) {
         var3.h = false;
      }

   }

   protected void a(abp var1) {
      if(var1.h) {
         if(var1.f == 0) {
            this.p.a(this.a);
         } else if(var1.f == 1) {
            this.i = this.d;
         } else if(var1.f == 3) {
            this.i = this.e;
         } else if(var1.f == 2) {
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
      c.a(this.u, this.p.p, var3, 0, yr.e[var3].b(0), var1 + 2, var2 + 2);
      tf.a();
      GL11.glDisable('\u803a');
   }

   private void a(int var1, int var2) {
      this.c(var1, var2, 0, 0);
   }

   private void c(int var1, int var2, int var3, int var4) {
      int var5 = this.p.p.b("/gui/slot.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.p.p.b(var5);
      adz var10 = adz.a;
      var10.b();
      var10.a((double)(var1 + 0), (double)(var2 + 18), (double)this.g, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.a((double)(var1 + 18), (double)(var2 + 18), (double)this.g, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.a((double)(var1 + 18), (double)(var2 + 0), (double)this.g, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.a((double)(var1 + 0), (double)(var2 + 0), (double)this.g, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.a();
   }

   // $FF: synthetic method
   static Minecraft a(dc var0) {
      return var0.p;
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
      return var0.p;
   }

   // $FF: synthetic method
   static void a(dc var0, int var1, int var2, int var3, int var4) {
      var0.c(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   static Minecraft g(dc var0) {
      return var0.p;
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
