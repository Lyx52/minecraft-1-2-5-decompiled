
public final class tp extends ab {

   private static final jb a = new dn();


   static tp a(adj var0, Object[] var1, ly var2) {
      return new tp(var0, var1, var2);
   }

   private tp(adj var1, Object[] var2, ly var3) {
      super(b(var1, var2, var3));
   }

   private static String b(adj var0, Object[] var1, ly var2) {
      return "Failed to find " + var0.a.toString() + " at [" + adj.a(var0.b) + "] while resolving [" + a(var1) + "] in " + a.a(var2) + ".";
   }

   private static String a(Object[] var0) {
      StringBuilder var1 = new StringBuilder();
      boolean var2 = true;
      Object[] var3 = var0;
      int var4 = var0.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Object var6 = var3[var5];
         if(!var2) {
            var1.append(".");
         }

         var2 = false;
         if(var6 instanceof String) {
            var1.append("\"").append(var6).append("\"");
         } else {
            var1.append(var6);
         }
      }

      return var1.toString();
   }

}
