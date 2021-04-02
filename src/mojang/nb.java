package mojang;

import java.util.ArrayList;
import java.util.Iterator;

public class nb {

   private ArrayList a = new ArrayList();
   private ArrayList b = new ArrayList();


   public void a(int var1, rc var2) {
      this.a.add(new pz(this, var1, var2));
   }

   public void a() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         pz var3 = (pz)var2.next();
         boolean var4 = this.b.contains(var3);
         if(var4) {
            if(this.a(var3) && var3.a.b()) {
               continue;
            }

            var3.a.d();
            this.b.remove(var3);
         }

         if(this.a(var3) && var3.a.a()) {
            var1.add(var3);
            this.b.add(var3);
         }
      }

      boolean var5 = false;
      if(var5 && var1.size() > 0) {
         System.out.println("Starting: ");
      }

      Iterator var6;
      pz var7;
      for(var6 = var1.iterator(); var6.hasNext(); var7.a.c()) {
         var7 = (pz)var6.next();
         if(var5) {
            System.out.println(var7.a.toString() + ", ");
         }
      }

      if(var5 && this.b.size() > 0) {
         System.out.println("Running: ");
      }

      for(var6 = this.b.iterator(); var6.hasNext(); var7.a.e()) {
         var7 = (pz)var6.next();
         if(var5) {
            System.out.println(var7.a.toString());
         }
      }

   }

   private boolean a(pz var1) {
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         pz var3 = (pz)var2.next();
         if(var3 != var1) {
            if(var1.b >= var3.b) {
               if(this.b.contains(var3) && !this.a(var1, var3)) {
                  return false;
               }
            } else if(this.b.contains(var3) && !var3.a.f()) {
               return false;
            }
         }
      }

      return true;
   }

   private boolean a(pz var1, pz var2) {
      return (var1.a.g() & var2.a.g()) == 0;
   }
}
