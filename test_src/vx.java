
public class vx {

   public static final vx[] a = new vx[16];
   public static final vx b = (new vx(0, "default", 1)).f();
   public static final vx c = new vx(1, "flat");
   public static final vx d = (new vx(8, "default_1_1", 0)).a(false);
   private final String e;
   private final int f;
   private boolean g;
   private boolean h;


   private vx(int var1, String var2) {
      this(var1, var2, 0);
   }

   private vx(int var1, String var2, int var3) {
      this.e = var2;
      this.f = var3;
      this.g = true;
      a[var1] = this;
   }

   public String a() {
      return this.e;
   }

   public String b() {
      return "generator." + this.e;
   }

   public int c() {
      return this.f;
   }

   public vx a(int var1) {
      return this == b && var1 == 0?d:this;
   }

   private vx a(boolean var1) {
      this.g = var1;
      return this;
   }

   public boolean d() {
      return this.g;
   }

   private vx f() {
      this.h = true;
      return this;
   }

   public boolean e() {
      return this.h;
   }

   public static vx a(String var0) {
      for(int var1 = 0; var1 < a.length; ++var1) {
         if(a[var1] != null && a[var1].e.equalsIgnoreCase(var0)) {
            return a[var1];
         }
      }

      return null;
   }

}
