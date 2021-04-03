import java.util.List;
import java.util.Map;

public final class lu extends fd implements Comparable {

   private final String a;


   lu(String var1) {
      if(var1 == null) {
         throw new NullPointerException("Attempt to construct a JsonString with a null value.");
      } else {
         this.a = var1;
      }
   }

   public ts a() {
      return ts.c;
   }

   public String b() {
      return this.a;
   }

   public Map c() {
      throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
   }

   public List d() {
      throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         lu var2 = (lu)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public String toString() {
      return "JsonStringNode value:[" + this.a + "]";
   }

   public int a(lu var1) {
      return this.a.compareTo(var1.a);
   }
}
