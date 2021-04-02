package mojang;

import java.util.Arrays;

public final class hh {

   public static abe a(Object ... var0) {
      return a(var0, new abe(new abt()));
   }

   public static abe b(Object ... var0) {
      return a(var0, new abe(new abq()));
   }

   public static abe c(Object ... var0) {
      return a(var0, new abe(new afw()));
   }

   public static abe a(String var0) {
      return a(kq.a(var0));
   }

   public static abe a(lu var0) {
      return new abe(new afz(var0));
   }

   public static abe b(String var0) {
      return c(new Object[0]).a(a(var0));
   }

   public static abe a(int var0) {
      return new abe(new afy(var0));
   }

   public static abe b(int var0) {
      return b(new Object[0]).a(a(var0));
   }

   private static abe a(Object[] var0, abe var1) {
      abe var2 = var1;

      for(int var3 = var0.length - 1; var3 >= 0; --var3) {
         if(var0[var3] instanceof Integer) {
            var2 = a(b(((Integer)var0[var3]).intValue()), var2);
         } else {
            if(!(var0[var3] instanceof String)) {
               throw new IllegalArgumentException("Element [" + var0[var3] + "] of path elements" + " [" + Arrays.toString(var0) + "] was of illegal type [" + var0[var3].getClass().getCanonicalName() + "]; only Integer and String are valid.");
            }

            var2 = a(b((String)var0[var3]), var2);
         }
      }

      return var2;
   }

   private static abe a(abe var0, abe var1) {
      return new abe(new ss(var0, var1));
   }
}
