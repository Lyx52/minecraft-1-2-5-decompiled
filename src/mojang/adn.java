package mojang;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.TreeMap;

public class adn {

   private static adn a = new adn();
   private Properties b = new Properties();
   private TreeMap c;
   private String d;
   private boolean e;


   private adn() {
      this.e();
      this.a("en_US");
   }

   public static adn a() {
      System.out.println(a);
      return a;
   }

   private void e() {
      TreeMap var1 = new TreeMap();

      try {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(adn.class.getResourceAsStream("/mojang/lang/languages.txt"), "UTF-8"));

         for(String var3 = var2.readLine(); var3 != null; var3 = var2.readLine()) {
            String[] var4 = var3.split("=");
            if(var4 != null && var4.length == 2) {
               var1.put(var4[0], var4[1]);
            }
         }
      } catch (IOException var5) {
         var5.printStackTrace();
         return;
      }

      this.c = var1;
   }

   public TreeMap b() {
      return this.c;
   }

   private void a(Properties var1, String var2) throws IOException {
      FileInputStream file = new FileInputStream("/mojang/lang/" + var2 + ".mojang.lang");

      InputStreamReader inp = new InputStreamReader(file, "UTF-8");

      BufferedReader var3 = new BufferedReader(inp);

      for(String var4 = var3.readLine(); var4 != null; var4 = var3.readLine()) {
         var4 = var4.trim();
         if(!var4.startsWith("#")) {
            String[] var5 = var4.split("=");
            if(var5 != null && var5.length == 2) {
               var1.setProperty(var5[0], var5[1]);
            }
         }
      }

   }

   public void a(String var1) {
      if(!var1.equals(this.d)) {
         Properties var2 = new Properties();

         try {
            this.a(var2, "en_US");
         } catch (IOException var8) {
            ;
         }

         this.e = false;
         if(!"en_US".equals(var1)) {
            try {
               this.a(var2, var1);
               Enumeration var3 = var2.propertyNames();

               while(var3.hasMoreElements() && !this.e) {
                  Object var4 = var3.nextElement();
                  Object var5 = var2.get(var4);
                  if(var5 != null) {
                     String var6 = var5.toString();

                     for(int var7 = 0; var7 < var6.length(); ++var7) {
                        if(var6.charAt(var7) >= 256) {
                           this.e = true;
                           break;
                        }
                     }
                  }
               }
            } catch (IOException var9) {
               var9.printStackTrace();
               return;
            }
         }

         this.d = var1;
         this.b = var2;
      }
   }

   public String c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public String b(String var1) {
      return this.b.getProperty(var1, var1);
   }

   public String a(String var1, Object ... var2) {
      String var3 = this.b.getProperty(var1, var1);
      return String.format(var3, var2);
   }

   public String c(String var1) {
      return this.b.getProperty(var1 + ".name", "");
   }

   public static boolean d(String var0) {
      return "ar_SA".equals(var0) || "he_IL".equals(var0);
   }

}
