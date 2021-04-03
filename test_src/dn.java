import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.TreeSet;

public final class dn implements jb {

   public String a(ly var1) {
      StringWriter var2 = new StringWriter();

      try {
         this.a(var1, var2);
      } catch (IOException var4) {
         throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", var4);
      }

      return var2.toString();
   }

   public void a(ly var1, Writer var2) {
      this.a((fd)var1, var2);
   }

   private void a(fd var1, Writer var2) {
      boolean var3 = true;
      Iterator var4;
      switch(ib.a[var1.a().ordinal()]) {
      case 1:
         var2.append('[');
         var4 = var1.d().iterator();

         while(var4.hasNext()) {
            fd var6 = (fd)var4.next();
            if(!var3) {
               var2.append(',');
            }

            var3 = false;
            this.a(var6, var2);
         }

         var2.append(']');
         break;
      case 2:
         var2.append('{');
         var4 = (new TreeSet(var1.c().keySet())).iterator();

         while(var4.hasNext()) {
            lu var5 = (lu)var4.next();
            if(!var3) {
               var2.append(',');
            }

            var3 = false;
            this.a((fd)var5, var2);
            var2.append(':');
            this.a((fd)var1.c().get(var5), var2);
         }

         var2.append('}');
         break;
      case 3:
         var2.append('\"').append((new ami(var1.b())).toString()).append('\"');
         break;
      case 4:
         var2.append(var1.b());
         break;
      case 5:
         var2.append("false");
         break;
      case 6:
         var2.append("true");
         break;
      case 7:
         var2.append("null");
         break;
      default:
         throw new RuntimeException("Coding failure in Argo:  Attempt to format a JsonNode of unknown type [" + var1.a() + "];");
      }

   }
}
