import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

final class aam extends fd {

   private static final Pattern a = Pattern.compile("(-?)(0|([1-9]([0-9]*)))(\\.[0-9]+)?((e|E)(\\+|-)?[0-9]+)?");
   private final String b;


   aam(String var1) {
      if(var1 == null) {
         throw new NullPointerException("Attempt to construct a JsonNumber with a null value.");
      } else if(!a.matcher(var1).matches()) {
         throw new IllegalArgumentException("Attempt to construct a JsonNumber with a String [" + var1 + "] that does not match the JSON number specification.");
      } else {
         this.b = var1;
      }
   }

   public ts a() {
      return ts.d;
   }

   public String b() {
      return this.b;
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
         aam var2 = (aam)var1;
         return this.b.equals(var2.b);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.b.hashCode();
   }

   public String toString() {
      return "JsonNumberNode value:[" + this.b + "]";
   }

}
