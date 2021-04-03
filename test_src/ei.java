import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ei extends yr {

   private HashMap a = new HashMap();


   public ei(int var1) {
      super(var1);
      this.f(1);
      this.a(true);
      this.g(0);
   }

   public List a_(aan var1) {
      return this.e_(var1.i());
   }

   public List e_(int var1) {
      List var2 = (List)this.a.get(Integer.valueOf(var1));
      if(var2 == null) {
         var2 = hx.b(var1, false);
         this.a.put(Integer.valueOf(var1), var2);
      }

      return var2;
   }

   public aan b(aan var1, xd var2, yw var3) {
      --var1.a;
      if(!var2.F) {
         List var4 = this.a_(var1);
         if(var4 != null) {
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               alg var6 = (alg)var5.next();
               var3.b(new alg(var6));
            }
         }
      }

      if(var1.a <= 0) {
         return new aan(yr.bt);
      } else {
         var3.ap.a(new aan(yr.bt));
         return var1;
      }
   }

   public int b(aan var1) {
      return 32;
   }

   public aaq c(aan var1) {
      return aaq.c;
   }

   public aan a(aan var1, xd var2, yw var3) {
      if(c(var1.i())) {
         --var1.a;
         var2.a(var3, "random.bow", 0.5F, 0.4F / (d.nextFloat() * 0.4F + 0.8F));
         if(!var2.F) {
            var2.a((nn)(new bj(var2, var3, var1.i())));
         }

         return var1;
      } else {
         var3.c(var1, this.b(var1));
         return var1;
      }
   }

   public boolean a(aan var1, yw var2, xd var3, int var4, int var5, int var6, int var7) {
      return false;
   }

   public int b(int var1) {
      return c(var1)?154:140;
   }

   public int a(int var1, int var2) {
      return var2 == 0?141:super.a(var1, var2);
   }

   public static boolean c(int var0) {
      return (var0 & 16384) != 0;
   }

   public int b(int var1, int var2) {
      return var2 > 0?16777215:hx.a(var1, false);
   }

   public boolean c() {
      return true;
   }

   public boolean d(int var1) {
      List var2 = this.e_(var1);
      if(var2 != null && !var2.isEmpty()) {
         Iterator var3 = var2.iterator();

         alg var4;
         do {
            if(!var3.hasNext()) {
               return false;
            }

            var4 = (alg)var3.next();
         } while(!aad.a[var4.a()].b());

         return true;
      } else {
         return false;
      }
   }

   public String d(aan var1) {
      if(var1.i() == 0) {
         return cy.a("item.emptyPotion.name").trim();
      } else {
         String var2 = "";
         if(c(var1.i())) {
            var2 = cy.a("potion.prefix.grenade").trim() + " ";
         }

         List var3 = yr.bs.a_(var1);
         String var4;
         if(var3 != null && !var3.isEmpty()) {
            var4 = ((alg)var3.get(0)).d();
            var4 = var4 + ".postfix";
            return var2 + cy.a(var4).trim();
         } else {
            var4 = hx.b(var1.i());
            return cy.a(var4).trim() + " " + super.d(var1);
         }
      }
   }

   public void a(aan var1, List var2) {
      if(var1.i() != 0) {
         List var3 = yr.bs.a_(var1);
         if(var3 != null && !var3.isEmpty()) {
            Iterator var7 = var3.iterator();

            while(var7.hasNext()) {
               alg var5 = (alg)var7.next();
               String var6 = cy.a(var5.d()).trim();
               if(var5.c() > 0) {
                  var6 = var6 + " " + cy.a("potion.potency." + var5.c()).trim();
               }

               if(var5.b() > 20) {
                  var6 = var6 + " (" + aad.a(var5) + ")";
               }

               if(aad.a[var5.a()].f()) {
                  var2.add("§c" + var6);
               } else {
                  var2.add("§7" + var6);
               }
            }
         } else {
            String var4 = cy.a("potion.empty").trim();
            var2.add("§7" + var4);
         }

      }
   }

   public boolean e(aan var1) {
      List var2 = this.a_(var1);
      return var2 != null && !var2.isEmpty();
   }
}
