import java.util.List;
import java.util.Map;

final class pu extends fd {

   static final pu a = new pu(ts.g);
   static final pu b = new pu(ts.e);
   static final pu c = new pu(ts.f);
   private final ts d;


   private pu(ts var1) {
      this.d = var1;
   }

   public ts a() {
      return this.d;
   }

   public String b() {
      throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
   }

   public Map c() {
      throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
   }

   public List d() {
      throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
   }

}
