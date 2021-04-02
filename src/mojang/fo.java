package mojang;

public enum fo {

   a("common", 0, 15, "Common"),
   b("uncommon", 1, 14, "Uncommon"),
   c("rare", 2, 11, "Rare"),
   d("epic", 3, 13, "Epic");
   public final int e;
   public final String f;
   // $FF: synthetic field
   private static final fo[] g = new fo[]{a, b, c, d};


   private fo(String var1, int var2, int var3, String var4) {
      this.e = var3;
      this.f = var4;
   }

}
