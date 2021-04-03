import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class agp {

   private static final Map a = new HashMap();


   public static synchronized lz a(File var0, int var1, int var2) {
      File var3 = new File(var0, "region");
      File var4 = new File(var3, "r." + (var1 >> 5) + "." + (var2 >> 5) + ".mca");
      Reference var5 = (Reference)a.get(var4);
      lz var6;
      if(var5 != null) {
         var6 = (lz)var5.get();
         if(var6 != null) {
            return var6;
         }
      }

      if(!var3.exists()) {
         var3.mkdirs();
      }

      if(a.size() >= 256) {
         a();
      }

      var6 = new lz(var4);
      a.put(var4, new SoftReference(var6));
      return var6;
   }

   public static synchronized void a() {
      Iterator var0 = a.values().iterator();

      while(var0.hasNext()) {
         Reference var1 = (Reference)var0.next();

         try {
            lz var2 = (lz)var1.get();
            if(var2 != null) {
               var2.a();
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      a.clear();
   }

   public static DataInputStream b(File var0, int var1, int var2) {
      lz var3 = a(var0, var1, var2);
      return var3.a(var1 & 31, var2 & 31);
   }

   public static DataOutputStream c(File var0, int var1, int var2) {
      lz var3 = a(var0, var1, var2);
      return var3.b(var1 & 31, var2 & 31);
   }

}
