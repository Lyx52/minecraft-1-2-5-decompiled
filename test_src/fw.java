import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class fw {

   public ly a(Reader var1) {
      acr var2 = new acr();
      (new ap()).a(var1, var2);
      return var2.a();
   }

   public ly a(String var1) {
      try {
         ly var2 = this.a((Reader)(new StringReader(var1)));
         return var2;
      } catch (IOException var4) {
         throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", var4);
      }
   }
}
