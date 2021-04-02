package mojang;

public class z extends Button {

   private final DefaultOptions j;


   public z(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, (DefaultOptions)null, var4);
   }

   public z(int var1, int var2, int var3, int var4, int var5, String var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.j = null;
   }

   public z(int var1, int var2, int var3, DefaultOptions var4, String var5) {
      super(var1, var2, var3, 150, 20, var5);
      this.j = var4;
   }

   public DefaultOptions a() {
      return this.j;
   }
}
