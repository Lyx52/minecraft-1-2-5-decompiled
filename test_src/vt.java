import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class vt {

   private Map a = new HashMap();
   private final URL b;


   public vt(String var1) {
      try {
         this.b = new URL("http://snoop.minecraft.net/" + var1);
      } catch (MalformedURLException var3) {
         throw new IllegalArgumentException();
      }
   }

   public void a(String var1, Object var2) {
      this.a.put(var1, var2);
   }

   public void a() {
      alw var1 = new alw(this, "reporter");
      var1.setDaemon(true);
      var1.start();
   }

   // $FF: synthetic method
   static URL a(vt var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static Map b(vt var0) {
      return var0.a;
   }
}
