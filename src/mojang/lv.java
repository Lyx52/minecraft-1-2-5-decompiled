package mojang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class lv {

   public static boolean a = false;
   private static List b = new ArrayList();
   private static List c = new ArrayList();
   private static String d = "";
   private static Map e = new HashMap();


   public static void a() {
      e.clear();
   }

   public static void a(String var0) {
      if(a) {
         if(d.length() > 0) {
            d = d + ".";
         }

         d = d + var0;
         b.add(d);
         c.add(Long.valueOf(System.nanoTime()));
      }
   }

   public static void b() {
      if(a) {
         long var0 = System.nanoTime();
         long var2 = ((Long)c.remove(c.size() - 1)).longValue();
         b.remove(b.size() - 1);
         long var4 = var0 - var2;
         if(e.containsKey(d)) {
            e.put(d, Long.valueOf(((Long)e.get(d)).longValue() + var4));
         } else {
            e.put(d, Long.valueOf(var4));
         }

         d = b.size() > 0?(String)b.get(b.size() - 1):"";
         if(var4 > 100000000L) {
            System.out.println(d + " " + var4);
         }

      }
   }

   public static List b(String var0) {
      if(!a) {
         return null;
      } else {
         long var2 = e.containsKey("root")?((Long)e.get("root")).longValue():0L;
         long var4 = e.containsKey(var0)?((Long)e.get(var0)).longValue():-1L;
         ArrayList var6 = new ArrayList();
         if(var0.length() > 0) {
            var0 = var0 + ".";
         }

         long var7 = 0L;
         Iterator var9 = e.keySet().iterator();

         while(var9.hasNext()) {
            String var10 = (String)var9.next();
            if(var10.length() > var0.length() && var10.startsWith(var0) && var10.indexOf(".", var0.length() + 1) < 0) {
               var7 += ((Long)e.get(var10)).longValue();
            }
         }

         float var19 = (float)var7;
         if(var7 < var4) {
            var7 = var4;
         }

         if(var2 < var7) {
            var2 = var7;
         }

         Iterator var20 = e.keySet().iterator();

         String var11;
         while(var20.hasNext()) {
            var11 = (String)var20.next();
            if(var11.length() > var0.length() && var11.startsWith(var0) && var11.indexOf(".", var0.length() + 1) < 0) {
               long var12 = ((Long)e.get(var11)).longValue();
               double var14 = (double)var12 * 100.0D / (double)var7;
               double var16 = (double)var12 * 100.0D / (double)var2;
               String var18 = var11.substring(var0.length());
               var6.add(new aaf(var18, var14, var16));
            }
         }

         var20 = e.keySet().iterator();

         while(var20.hasNext()) {
            var11 = (String)var20.next();
            e.put(var11, Long.valueOf(((Long)e.get(var11)).longValue() * 999L / 1000L));
         }

         if((float)var7 > var19) {
            var6.add(new aaf("unspecified", (double)((float)var7 - var19) * 100.0D / (double)var7, (double)((float)var7 - var19) * 100.0D / (double)var2));
         }

         Collections.sort(var6);
         var6.add(0, new aaf(var0, 100.0D, (double)var7 * 100.0D / (double)var2));
         return var6;
      }
   }

   public static void c(String var0) {
      b();
      a(var0);
   }

}
