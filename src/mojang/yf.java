package mojang;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class yf extends GUIManager {

   private String b = "";
   private int c = -1;
   private boolean d = false;
   private String e = "";
   private String f = "";
   private int h = 0;
   private List i = new ArrayList();
   private URI j = null;
   protected agu a;
   private String k = "";


   public yf() {}

   public yf(String var1) {
      this.k = var1;
   }

   public void c() {
      Keyboard.enableRepeatEvents(true);
      this.c = this.minecraft.w.c().size();
      this.a = new agu(this.u, 4, this.r - 12, this.q - 4, 12);
      this.a.f(100);
      this.a.a(false);
      this.a.b(true);
      this.a.a(this.k);
      this.a.c(false);
   }

   public void e() {
      Keyboard.enableRepeatEvents(false);
      this.minecraft.w.d();
   }

   public void a() {
      this.a.a();
   }

   protected void a(char var1, int var2) {
      if(var2 == 15) {
         this.d();
      } else {
         this.d = false;
      }

      if(var2 == 1) {
         this.minecraft.addMenu((GUIManager)null);
      } else if(var2 == 28) {
         String var3 = this.a.b().trim();
         if(var3.length() > 0 && !this.minecraft.startsWithSlash(var3)) {
            this.minecraft.h.a(var3);
         }

         this.minecraft.addMenu((GUIManager)null);
      } else if(var2 == 200) {
         this.a(-1);
      } else if(var2 == 208) {
         this.a(1);
      } else if(var2 == 201) {
         this.minecraft.w.a(19);
      } else if(var2 == 209) {
         this.minecraft.w.a(-19);
      } else {
         this.a.a(var1, var2);
      }

   }

   public void f() {
      super.f();
      int var1 = Mouse.getEventDWheel();
      if(var1 != 0) {
         if(var1 > 1) {
            var1 = 1;
         }

         if(var1 < -1) {
            var1 = -1;
         }

         if(!m()) {
            var1 *= 7;
         }

         this.minecraft.w.a(var1);
      }

   }

   protected void a(int var1, int var2, int var3) {
      if(var3 == 0) {
         dx var4 = this.minecraft.w.a(Mouse.getX(), Mouse.getY());
         if(var4 != null) {
            URI var5 = var4.b();
            if(var5 != null) {
               this.j = var5;
               this.minecraft.addMenu((GUIManager)(new be(this, this, var4.a(), 0, var4)));
               return;
            }
         }
      }

      this.a.a(var1, var2, var3);
      super.a(var1, var2, var3);
   }

   public void a(boolean var1, int var2) {
      if(var2 == 0) {
         if(var1) {
            try {
               Class var3 = Class.forName("java.awt.Desktop");
               Object var4 = var3.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
               var3.getMethod("browse", new Class[]{URI.class}).invoke(var4, new Object[]{this.j});
            } catch (Throwable var5) {
               var5.printStackTrace();
            }
         }

         this.j = null;
         this.minecraft.addMenu((GUIManager)this);
      }

   }

   public void d() {
      Iterator var2;
      ah var3;
      if(this.d) {
         this.a.a(-1);
         if(this.h >= this.i.size()) {
            this.h = 0;
         }
      } else {
         int var1 = this.a.c(-1);
         if(this.a.h() - var1 < 1) {
            return;
         }

         this.i.clear();
         this.e = this.a.b().substring(var1);
         this.f = this.e.toLowerCase();
         var2 = ((ahv)this.minecraft.h).cl.c.iterator();

         while(var2.hasNext()) {
            var3 = (ah)var2.next();
            if(var3.a(this.f)) {
               this.i.add(var3);
            }
         }

         if(this.i.size() == 0) {
            return;
         }

         this.d = true;
         this.h = 0;
         this.a.b(var1 - this.a.h());
      }

      if(this.i.size() > 1) {
         StringBuilder var4 = new StringBuilder();

         for(var2 = this.i.iterator(); var2.hasNext(); var4.append(var3.a)) {
            var3 = (ah)var2.next();
            if(var4.length() > 0) {
               var4.append(", ");
            }
         }

         this.minecraft.w.a(var4.toString());
      }

      this.a.b(((ah)this.i.get(this.h++)).a);
   }

   public void a(int var1) {
      int var2 = this.c + var1;
      int var3 = this.minecraft.w.c().size();
      if(var2 < 0) {
         var2 = 0;
      }

      if(var2 > var3) {
         var2 = var3;
      }

      if(var2 != this.c) {
         if(var2 == var3) {
            this.c = var3;
            this.a.a(this.b);
         } else {
            if(this.c == var3) {
               this.b = this.a.b();
            }

            this.a.a((String)this.minecraft.w.c().get(var2));
            this.c = var2;
         }
      }
   }

   public void a(int var1, int var2, float var3) {
      a(2, this.r - 14, this.q - 2, this.r - 2, Integer.MIN_VALUE);
      this.a.f();
      super.a(var1, var2, var3);
   }
}
