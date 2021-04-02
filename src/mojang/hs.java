package mojang;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class hs extends ly {

   private final Map a;


   hs(Map var1) {
      this.a = new HashMap(var1);
   }

   public Map c() {
      return new HashMap(this.a);
   }

   public ts a() {
      return ts.a;
   }

   public String b() {
      throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
   }

   public List d() {
      throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         hs var2 = (hs)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public String toString() {
      return "JsonObject fields:[" + this.a + "]";
   }
}
