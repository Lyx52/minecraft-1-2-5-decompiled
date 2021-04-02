package mojang;

// $FF: synthetic class
public class OSTypesID {

   // $FF: synthetic field
   public static final int[] OSIDS = new int[OSTypes.values().length];


   static {
      try {
         OSIDS[OSTypes.LINUX.ordinal()] = 1;
      } catch (NoSuchFieldError e) {
         e.printStackTrace();
      }

      try {
         OSIDS[OSTypes.SOLARIS.ordinal()] = 2;
      } catch (NoSuchFieldError e) {
         e.printStackTrace();
      }

      try {
         OSIDS[OSTypes.WINDOWS.ordinal()] = 3;
      } catch (NoSuchFieldError e) {
         e.printStackTrace();
      }

      try {
         OSIDS[OSTypes.MACOS.ordinal()] = 4;
      } catch (NoSuchFieldError e) {
         e.printStackTrace();
      }

   }
}
