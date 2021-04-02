package mojang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aif implements wf {

   private final aan a;
   private final List b;


   public aif(aan var1, List var2) {
      this.a = var1;
      this.b = var2;
   }

   public aan b() {
      return this.a;
   }

   public boolean a(ade var1) {
      ArrayList var2 = new ArrayList(this.b);

      for(int var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 3; ++var4) {
            aan var5 = var1.b(var4, var3);
            if(var5 != null) {
               boolean var6 = false;
               Iterator var7 = var2.iterator();

               while(var7.hasNext()) {
                  aan var8 = (aan)var7.next();
                  if(var5.c == var8.c && (var8.i() == -1 || var5.i() == var8.i())) {
                     var6 = true;
                     var2.remove(var8);
                     break;
                  }
               }

               if(!var6) {
                  return false;
               }
            }
         }
      }

      return var2.isEmpty();
   }

   public aan b(ade var1) {
      return this.a.k();
   }

   public int a() {
      return this.b.size();
   }
}
