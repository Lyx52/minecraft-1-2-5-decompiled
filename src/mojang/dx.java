package mojang;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dx {

   public static final Pattern a = Pattern.compile("^(?:(https?)://)?([-\\w_\\.]{2,}\\.[a-z]{2,3})(/\\S*)?$");
   private final nl b;
   private final nt c;
   private final int d;
   private final int e;
   private final String f;
   private final String g;


   public dx(nl var1, nt var2, int var3, int var4) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var1.a(var2.a, var3);
      this.g = this.c();
   }

   public String a() {
      return this.g;
   }

   public URI b() {
      String var1 = this.a();
      if(var1 == null) {
         return null;
      } else {
         Matcher var2 = a.matcher(var1);
         if(var2.matches()) {
            try {
               String var3 = var2.group(0);
               if(var2.group(1) == null) {
                  var3 = "https://" + var3;
               }

               return new URI(var3);
            } catch (URISyntaxException var4) {
               Logger.getLogger("Minecraft").log(Level.SEVERE, "Couldn\'t create URI from chat", var4);
            }
         }

         return null;
      }
   }

   private String c() {
      int var1 = this.f.lastIndexOf(" ", this.f.length()) + 1;
      if(var1 < 0) {
         var1 = 0;
      }

      int var2 = this.c.a.indexOf(" ", var1);
      if(var2 < 0) {
         var2 = this.c.a.length();
      }

      nl var10000 = this.b;
      return nl.d(this.c.a.substring(var1, var2));
   }

}
