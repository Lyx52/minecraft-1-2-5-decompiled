package mojang;

import java.util.ArrayList;
import java.util.Iterator;

class er extends gq {

   // $FF: synthetic field
   final dc a;


   public er(dc var1) {
      super(var1);
      this.a = var1;
      this.c = new ArrayList();
      Iterator var2 = gv.e.iterator();

      while(var2.hasNext()) {
         aii var3 = (aii)var2.next();
         boolean var4 = false;
         int var5 = var3.b();
         if(dc.c(var1).a((ajw)var3) > 0) {
            var4 = true;
         } else if(gv.E[var5] != null && dc.c(var1).a(gv.E[var5]) > 0) {
            var4 = true;
         } else if(gv.D[var5] != null && dc.c(var1).a(gv.D[var5]) > 0) {
            var4 = true;
         }

         if(var4) {
            this.c.add(var3);
         }
      }

      this.d = new afo(this, var1);
   }

   protected void a(int var1, int var2, Tessalator var3) {
      super.a(var1, var2, var3);
      if(this.b == 0) {
         dc.a(this.a, var1 + 115 - 18 + 1, var2 + 1 + 1, 18, 18);
      } else {
         dc.a(this.a, var1 + 115 - 18, var2 + 1, 18, 18);
      }

      if(this.b == 1) {
         dc.a(this.a, var1 + 165 - 18 + 1, var2 + 1 + 1, 36, 18);
      } else {
         dc.a(this.a, var1 + 165 - 18, var2 + 1, 36, 18);
      }

      if(this.b == 2) {
         dc.a(this.a, var1 + 215 - 18 + 1, var2 + 1 + 1, 54, 18);
      } else {
         dc.a(this.a, var1 + 215 - 18, var2 + 1, 54, 18);
      }

   }

   protected void a(int var1, int var2, int var3, int var4, Tessalator var5) {
      aii var6 = this.b(var1);
      int var7 = var6.b();
      dc.a(this.a, var2 + 40, var3, var7);
      this.a((aii)gv.D[var7], var2 + 115, var3, var1 % 2 == 0);
      this.a((aii)gv.E[var7], var2 + 165, var3, var1 % 2 == 0);
      this.a(var6, var2 + 215, var3, var1 % 2 == 0);
   }

   protected String a(int var1) {
      return var1 == 0?"stat.crafted":(var1 == 1?"stat.used":"stat.mined");
   }
}
