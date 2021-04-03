package mojang;

public class LocalizationManagerWrapper {

   private static LocalizationManager localizationManager = LocalizationManager.getInstance();


   public static String getLocaleString(String str) {
      return localizationManager.getLocaleStringByName(str);
   }

   public static String getFormatedLocaleString(String str, Object ... format) {
      return localizationManager.formatLocaleString(str, format);
   }

}
