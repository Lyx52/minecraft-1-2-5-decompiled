package mojang;

// $FF: synthetic class
class xp {

   // $FF: synthetic field
   static final int[] a = new int[DefaultOptions.values().length];


   static {
      try {
         a[DefaultOptions.INVERT_MOUSE.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
         ;
      }

      try {
         a[DefaultOptions.VIEW_BOBBING.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
         ;
      }

      try {
         a[DefaultOptions.ANAGLYPH.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
         ;
      }

      try {
         a[DefaultOptions.ADVANCED_OPENGL.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
         ;
      }

      try {
         a[DefaultOptions.ABIENT_OCCLUSION.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         a[DefaultOptions.RENDER_CLOUDS.ordinal()] = 6;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
