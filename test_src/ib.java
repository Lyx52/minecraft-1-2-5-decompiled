
// $FF: synthetic class
class ib {

   // $FF: synthetic field
   static final int[] a = new int[ts.values().length];


   static {
      try {
         a[ts.b.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
         ;
      }

      try {
         a[ts.a.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
         ;
      }

      try {
         a[ts.c.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
         ;
      }

      try {
         a[ts.d.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
         ;
      }

      try {
         a[ts.f.ordinal()] = 5;
      } catch (NoSuchFieldError var3) {
         ;
      }

      try {
         a[ts.e.ordinal()] = 6;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         a[ts.g.ordinal()] = 7;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
