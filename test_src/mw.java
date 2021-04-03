import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

public class mw extends vp {

   private final DateFormat c = new SimpleDateFormat();
   protected vp a;
   protected String b = "Select world";
   private boolean d = false;
   private int e;
   private List f;
   private iz h;
   private String i;
   private String j;
   private String[] k = new String[2];
   private boolean l;
   private abp m;
   private abp n;
   private abp o;


   public mw(vp var1) {
      this.a = var1;
   }

   public void c() {
      adn var1 = adn.a();
      this.b = var1.b("selectWorld.title");
      this.i = var1.b("selectWorld.world");
      this.j = var1.b("selectWorld.conversion");
      this.k[0] = var1.b("gameMode.survival");
      this.k[1] = var1.b("gameMode.creative");
      this.g();
      this.h = new iz(this);
      this.h.a(this.s, 4, 5);
      this.d();
   }

   private void g() {
      kb var1 = this.p.c();
      this.f = var1.b();
      Collections.sort(this.f);
      this.e = -1;
   }

   protected String a(int var1) {
      return ((pj)this.f.get(var1)).a();
   }

   protected String b(int var1) {
      String var2 = ((pj)this.f.get(var1)).b();
      if(var2 == null || gk.a(var2)) {
         adn var3 = adn.a();
         var2 = var3.b("selectWorld.world") + " " + (var1 + 1);
      }

      return var2;
   }

   public void d() {
      adn var1 = adn.a();
      this.s.add(this.n = new abp(1, this.q / 2 - 154, this.r - 52, 150, 20, var1.b("selectWorld.select")));
      this.s.add(this.o = new abp(6, this.q / 2 - 154, this.r - 28, 70, 20, var1.b("selectWorld.rename")));
      this.s.add(this.m = new abp(2, this.q / 2 - 74, this.r - 28, 70, 20, var1.b("selectWorld.delete")));
      this.s.add(new abp(3, this.q / 2 + 4, this.r - 52, 150, 20, var1.b("selectWorld.create")));
      this.s.add(new abp(0, this.q / 2 + 4, this.r - 28, 150, 20, var1.b("gui.cancel")));
      this.n.h = false;
      this.m.h = false;
      this.o.h = false;
   }

   protected void a(abp var1) {
      if(var1.h) {
         if(var1.f == 2) {
            String var2 = this.b(this.e);
            if(var2 != null) {
               this.l = true;
               adn var3 = adn.a();
               String var4 = var3.b("selectWorld.deleteQuestion");
               String var5 = "\'" + var2 + "\' " + var3.b("selectWorld.deleteWarning");
               String var6 = var3.b("selectWorld.deleteButton");
               String var7 = var3.b("gui.cancel");
               mi var8 = new mi(this, var4, var5, var6, var7, this.e);
               this.p.a((vp)var8);
            }
         } else if(var1.f == 1) {
            this.c(this.e);
         } else if(var1.f == 3) {
            this.p.a((vp)(new xh(this)));
         } else if(var1.f == 6) {
            this.p.a((vp)(new aax(this, this.a(this.e))));
         } else if(var1.f == 0) {
            this.p.a(this.a);
         } else {
            this.h.a(var1);
         }

      }
   }

   public void c(int var1) {
      this.p.a((vp)null);
      if(!this.d) {
         this.d = true;
         int var2 = ((pj)this.f.get(var1)).e();
         if(var2 == 0) {
            this.p.c = new aes(this.p);
         } else {
            this.p.c = new aff(this.p);
         }

         String var3 = this.a(var1);
         if(var3 == null) {
            var3 = "World" + var1;
         }

         this.p.a(var3, this.b(var1), (fj)null);
         this.p.a((vp)null);
      }
   }

   public void a(boolean var1, int var2) {
      if(this.l) {
         this.l = false;
         if(var1) {
            kb var3 = this.p.c();
            var3.d();
            var3.c(this.a(var2));
            this.g();
         }

         this.p.a((vp)this);
      }

   }

   public void a(int var1, int var2, float var3) {
      this.h.a(var1, var2, var3);
      this.a(this.u, this.b, this.q / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static List a(mw var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static int a(mw var0, int var1) {
      return var0.e = var1;
   }

   // $FF: synthetic method
   static int b(mw var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static abp c(mw var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static abp d(mw var0) {
      return var0.m;
   }

   // $FF: synthetic method
   static abp e(mw var0) {
      return var0.o;
   }

   // $FF: synthetic method
   static String f(mw var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static DateFormat g(mw var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static String h(mw var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static String[] i(mw var0) {
      return var0.k;
   }
}
