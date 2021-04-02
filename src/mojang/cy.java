package mojang;

public class cy {

   private static LocalizationManager a = LocalizationManager.getInstance();


   public static String a(String var0) {
      return a.getLocaleStringByName(var0);
   }

   public static String a(String var0, Object ... var1) {
      return a.a(var0, var1);
   }

}
