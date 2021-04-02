package mojang;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ajw {

   public final int e;
   private final String a;
   public boolean f;
   public String g;
   private final qt b;
   private static NumberFormat c = NumberFormat.getIntegerInstance(Locale.US);
   public static qt h = new bm();
   private static DecimalFormat d = new DecimalFormat("########0.00");
   public static qt i = new bl();
   public static qt j = new bi();


   public ajw(int var1, String var2, qt var3) {
      this.f = false;
      this.e = var1;
      this.a = var2;
      this.b = var3;
   }

   public ajw(int var1, String var2) {
      this(var1, var2, h);
   }

   public ajw h() {
      this.f = true;
      return this;
   }

   public ajw a() {
      if(gv.a.containsKey(Integer.valueOf(this.e))) {
         throw new RuntimeException("Duplicate stat id: \"" + ((ajw)gv.a.get(Integer.valueOf(this.e))).a + "\" and \"" + this.a + "\" at id " + this.e);
      } else {
         gv.b.add(this);
         gv.a.put(Integer.valueOf(this.e), this);
         this.g = b.a(this.e);
         return this;
      }
   }

   public boolean e() {
      return false;
   }

   public String a(int var1) {
      return this.b.a(var1);
   }

   public String i() {
      return this.a;
   }

   public String toString() {
      return cy.a(this.a);
   }

   // $FF: synthetic method
   static NumberFormat j() {
      return c;
   }

   // $FF: synthetic method
   static DecimalFormat k() {
      return d;
   }

}
