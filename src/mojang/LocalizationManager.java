package mojang;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.TreeMap;

public class LocalizationManager {

   private static LocalizationManager localizationManagerInstance = new LocalizationManager();
   private Properties localeStringMap = new Properties();
   private TreeMap langCodeToName;
   private String currentLocaleCode;
   private boolean e;
   private String currentPath = System.getProperty("user.dir");

   private LocalizationManager() {
      this.init();
      this.changeLocale("en_US");
   }

   public static LocalizationManager getInstance() {
      return localizationManagerInstance;
   }

   private void init() {
      TreeMap langCodeToName = new TreeMap();

      try {
         BufferedReader reader = new BufferedReader(new InputStreamReader(LocalizationManager.class.getResourceAsStream("/mojang/lang/languages.txt"), "UTF-8"));

         for(String line = reader.readLine(); line != null; line = reader.readLine()) {
            String[] splitLine = line.split("=");
            if(splitLine != null && splitLine.length == 2) {
               langCodeToName.put(splitLine[0], splitLine[1]);
            }
         }
      } catch (IOException e) {
         e.printStackTrace();
         return;
      }

      this.langCodeToName = langCodeToName;
   }

   public TreeMap getLangCodeToName() {
      return this.langCodeToName;
   }

   private void readLocaleFile(Properties propertyFile, String localeCode) throws IOException {
      FileInputStream file = new FileInputStream(currentPath + "/src/" + "/mojang/lang/" + localeCode + ".lang");

      InputStreamReader inp = new InputStreamReader(file, "UTF-8");

      BufferedReader reader = new BufferedReader(inp);

      for(String line = reader.readLine(); line != null; line = reader.readLine()) {
         line = line.trim();
         if(!line.startsWith("#")) {
            String[] splitLine = line.split("=");
            if(splitLine != null && splitLine.length == 2) {
               propertyFile.setProperty(splitLine[0], splitLine[1]);
            }
         }
      }

   }

   public void changeLocale(String localeCode) {
      if(!localeCode.equals(this.currentLocaleCode)) {
         Properties langProperties = new Properties();

         try {
            this.readLocaleFile(langProperties, "en_US");
         } catch (IOException e) {
            e.printStackTrace();
         }

         this.e = false;
         if(!"en_US".equals(localeCode)) {
            try {
               this.readLocaleFile(langProperties, localeCode);
               Enumeration var3 = langProperties.propertyNames();

               while(var3.hasMoreElements() && !this.e) {
                  Object var4 = var3.nextElement();
                  Object var5 = langProperties.get(var4);
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

         this.currentLocaleCode = localeCode;
         this.localeStringMap = langProperties;
      }
   }

   public String getCurrentLocaleCode() {
      return this.currentLocaleCode;
   }

   public boolean d() {
      return this.e;
   }

   public String getLocaleStringByName(String name) {
      return this.localeStringMap.getProperty(name, name);
   }

   public String formatLocaleString(String key, Object ... format) {
      String name = this.localeStringMap.getProperty(key, key);
      return String.format(name, format);
   }

   public String getNameLocale(String name) {
      return this.localeStringMap.getProperty(name + ".name", "");
   }

   public static boolean isSaudiArabicOrHebrew(String localeName) {
      return "ar_SA".equals(localeName) || "he_IL".equals(localeName);
   }

}
