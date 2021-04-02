package mojang;

public abstract class jt {

   public static final jt[] a = new jt[256];
   public static final jt b = new mq(0, 10, 0);
   public static final jt c = new mq(1, 5, 1);
   public static final jt d = new mq(2, 5, 2);
   public static final jt e = new mq(3, 2, 3);
   public static final jt f = new mq(4, 5, 4);
   public static final jt g = new py(5, 2);
   public static final jt h = new alp(6, 2);
   public static final jt i = new abz(16, 10, 0);
   public static final jt j = new abz(17, 5, 1);
   public static final jt k = new abz(18, 5, 2);
   public static final jt l = new ls(19, 5);
   public static final jt m = new acg(20, 2);
   public static final jt n = new le(21, 2, mb.g);
   public static final jt o = new vy(32, 10);
   public static final jt p = new aci(33, 1);
   public static final jt q = new di(34, 5);
   public static final jt r = new le(35, 2, mb.h);
   public static final jt s = new aha(48, 10);
   public static final jt t = new qj(49, 2);
   public static final jt u = new fa(50, 2);
   public static final jt v = new u(51, 1);
   public final int w;
   private final int z;
   public mb x;
   protected String y;


   protected jt(int var1, int var2, mb var3) {
      this.w = var1;
      this.z = var2;
      this.x = var3;
      if(a[var1] != null) {
         throw new IllegalArgumentException("Duplicate enchantment id!");
      } else {
         a[var1] = this;
      }
   }

   public int b() {
      return this.z;
   }

   public int c() {
      return 1;
   }

   public int a() {
      return 1;
   }

   public int a(int var1) {
      return 1 + var1 * 10;
   }

   public int b(int var1) {
      return this.a(var1) + 5;
   }

   public int a(int var1, md var2) {
      return 0;
   }

   public int a(int var1, Mob var2) {
      return 0;
   }

   public boolean a(jt var1) {
      return this != var1;
   }

   public jt a(String var1) {
      this.y = var1;
      return this;
   }

   public String d() {
      return "enchantment." + this.y;
   }

   public String c(int var1) {
      String var2 = cy.a(this.d());
      return var2 + " " + cy.a("enchantment.level." + var1);
   }

}
