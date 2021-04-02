package mojang;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class aek extends ly {

   private final List a;


   aek(Iterable var1) {
      this.a = a(var1);
   }

   public ts a() {
      return ts.b;
   }

   public List d() {
      return new ArrayList(this.a);
   }

   public String b() {
      throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
   }

   public Map c() {
      throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         aek var2 = (aek)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public String toString() {
      return "JsonArray elements:[" + this.a + "]";
   }

   private static List a(Iterable var0) {
      return new v(var0);
   }
}
