import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class b {

   public static b a = new b();
   private Map b = new HashMap();


   private b() {
      try {
         BufferedReader var1 = new BufferedReader(new InputStreamReader(b.class.getResourceAsStream("/achievement/map.txt")));

         String var2;
         while((var2 = var1.readLine()) != null) {
            String[] var3 = var2.split(",");
            int var4 = Integer.parseInt(var3[0]);
            this.b.put(Integer.valueOf(var4), var3[1]);
         }

         var1.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public static String a(int var0) {
      return (String)a.b.get(Integer.valueOf(var0));
   }

}
