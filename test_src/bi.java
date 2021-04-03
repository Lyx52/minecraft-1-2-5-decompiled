
final class bi implements qt {

   public String a(int var1) {
      double var3 = (double)var1 / 100.0D;
      double var5 = var3 / 1000.0D;
      return var5 > 0.5D?ajw.k().format(var5) + " km":(var3 > 0.5D?ajw.k().format(var3) + " m":var1 + " cm");
   }
}
