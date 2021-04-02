package mojang;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class fw {

   public static ly a(Reader var1) throws IOException, ale {
      acr var2 = new acr();
      ap testap = new ap();
      testap.a(var1, var2);
      return var2.a();
   }

   public static ly a(String var1) {
      try {
         return mojang.fw.a(new StringReader(var1));
      } catch (Exception var4) {
         throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", var4);
      }
   }
}
