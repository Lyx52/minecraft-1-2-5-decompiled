package mojang;

import java.util.Comparator;

class afo implements Comparator {

   // $FF: synthetic field
   final dc a;
   // $FF: synthetic field
   final er b;


   afo(er var1, dc var2) {
      this.b = var1;
      this.a = var2;
   }

   public int compare(Object var1, Object var2) {
      int var3 = ((aii)var1).b();
      int var4 = ((aii)var1).b();
      ajw var5 = null;
      ajw var6 = null;
      if(this.b.e == 2) {
         var5 = gv.C[var3];
         var6 = gv.C[var4];
      } else if(this.b.e == 0) {
         var5 = gv.D[var3];
         var6 = gv.D[var4];
      } else if(this.b.e == 1) {
         var5 = gv.E[var3];
         var6 = gv.E[var4];
      }

      if(var5 != null || var6 != null) {
         if(var5 == null) {
            return 1;
         }

         if(var6 == null) {
            return -1;
         }

         int var7 = dc.c(this.b.a).a(var5);
         int var8 = dc.c(this.b.a).a(var6);
         if(var7 != var8) {
            return (var7 - var8) * this.b.f;
         }
      }

      return var3 - var4;
   }
}
