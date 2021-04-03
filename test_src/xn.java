import java.io.BufferedReader;
import java.io.InputStreamReader;

public class xn {

   public static final String a = a();
   public static final char[] b = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};


   private static String a() {
      String var0 = "";

      try {
         BufferedReader var1 = new BufferedReader(new InputStreamReader(xn.class.getResourceAsStream("/font.txt"), "UTF-8"));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            if(!var2.startsWith("#")) {
               var0 = var0 + var2;
            }
         }

         var1.close();
      } catch (Exception var3) {
         ;
      }

      return var0;
   }

   public static final boolean a(char var0) {
      return var0 != 167 && (a.indexOf(var0) >= 0 || var0 > 32);
   }

   public static String a(String var0) {
      StringBuilder var1 = new StringBuilder();
      char[] var2 = var0.toCharArray();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         char var5 = var2[var4];
         if(a(var5)) {
            var1.append(var5);
         }
      }

      return var1.toString();
   }

}
