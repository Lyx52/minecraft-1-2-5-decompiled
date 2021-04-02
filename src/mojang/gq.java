package mojang;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.input.Mouse;

abstract class gq extends iff {

   protected int b;
   protected List c;
   protected Comparator d;
   protected int e;
   protected int f;
   // $FF: synthetic field
   final dc g;


   protected gq(dc var1) {
      super(dc.f(var1), var1.q, var1.r, 32, var1.r - 64, 20);
      this.g = var1;
      this.b = -1;
      this.e = -1;
      this.f = 0;
      this.a(false);
      this.a(true, 20);
   }

   protected void a(int var1, boolean var2) {}

   protected boolean b_(int var1) {
      return false;
   }

   protected void c() {
      this.g.k();
   }

   protected void a(int var1, int var2, Tessalator var3) {
      if(!Mouse.isButtonDown(0)) {
         this.b = -1;
      }

      if(this.b == 0) {
         dc.a(this.g, var1 + 115 - 18, var2 + 1, 0, 0);
      } else {
         dc.a(this.g, var1 + 115 - 18, var2 + 1, 0, 18);
      }

      if(this.b == 1) {
         dc.a(this.g, var1 + 165 - 18, var2 + 1, 0, 0);
      } else {
         dc.a(this.g, var1 + 165 - 18, var2 + 1, 0, 18);
      }

      if(this.b == 2) {
         dc.a(this.g, var1 + 215 - 18, var2 + 1, 0, 0);
      } else {
         dc.a(this.g, var1 + 215 - 18, var2 + 1, 0, 18);
      }

      if(this.e != -1) {
         short var4 = 79;
         byte var5 = 18;
         if(this.e == 1) {
            var4 = 129;
         } else if(this.e == 2) {
            var4 = 179;
         }

         if(this.f == 1) {
            var5 = 36;
         }

         dc.a(this.g, var1 + var4, var2 + 1, var5, 0);
      }

   }

   protected void a(int var1, int var2) {
      this.b = -1;
      if(var1 >= 79 && var1 < 115) {
         this.b = 0;
      } else if(var1 >= 129 && var1 < 165) {
         this.b = 1;
      } else if(var1 >= 179 && var1 < 215) {
         this.b = 2;
      }

      if(this.b >= 0) {
         this.c(this.b);
         dc.g(this.g).soundManager.a("random.click", 1.0F, 1.0F);
      }

   }

   protected final int a() {
      return this.c.size();
   }

   protected final aii b(int var1) {
      return (aii)this.c.get(var1);
   }

   protected abstract String a(int var1);

   protected void a(aii var1, int var2, int var3, boolean var4) {
      String var5;
      if(var1 != null) {
         var5 = var1.a(dc.c(this.g).a((ajw)var1));
         this.g.b(dc.h(this.g), var5, var2 - dc.i(this.g).a(var5), var3 + 5, var4?16777215:9474192);
      } else {
         var5 = "-";
         this.g.b(dc.j(this.g), var5, var2 - dc.k(this.g).a(var5), var3 + 5, var4?16777215:9474192);
      }

   }

   protected void b(int var1, int var2) {
      if(var2 >= this.h && var2 <= this.i) {
         int var3 = this.c(var1, var2);
         int var4 = this.g.q / 2 - 92 - 16;
         if(var3 >= 0) {
            if(var1 < var4 + 40 || var1 > var4 + 40 + 20) {
               return;
            }

            aii var5 = this.b(var3);
            this.a(var5, var1, var2);
         } else {
            String var9 = "";
            if(var1 >= var4 + 115 - 18 && var1 <= var4 + 115) {
               var9 = this.a(0);
            } else if(var1 >= var4 + 165 - 18 && var1 <= var4 + 165) {
               var9 = this.a(1);
            } else {
               if(var1 < var4 + 215 - 18 || var1 > var4 + 215) {
                  return;
               }

               var9 = this.a(2);
            }

            var9 = ("" + LocalizationManager.getInstance().getLocaleStringByName(var9)).trim();
            if(var9.length() > 0) {
               int var6 = var1 + 12;
               int var7 = var2 - 12;
               int var8 = dc.l(this.g).a(var9);
               dc.a(this.g, var6 - 3, var7 - 3, var6 + var8 + 3, var7 + 8 + 3, -1073741824, -1073741824);
               dc.m(this.g).a(var9, var6, var7, -1);
            }
         }

      }
   }

   protected void a(aii var1, int var2, int var3) {
      if(var1 != null) {
         yr var4 = yr.e[var1.b()];
         String var5 = ("" + LocalizationManager.getInstance().c(var4.e())).trim();
         if(var5.length() > 0) {
            int var6 = var2 + 12;
            int var7 = var3 - 12;
            int var8 = dc.n(this.g).a(var5);
            dc.b(this.g, var6 - 3, var7 - 3, var6 + var8 + 3, var7 + 8 + 3, -1073741824, -1073741824);
            dc.o(this.g).a(var5, var6, var7, -1);
         }

      }
   }

   protected void c(int var1) {
      if(var1 != this.e) {
         this.e = var1;
         this.f = -1;
      } else if(this.f == -1) {
         this.f = 1;
      } else {
         this.e = -1;
         this.f = 0;
      }

      Collections.sort(this.c, this.d);
   }
}
