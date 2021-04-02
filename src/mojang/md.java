package mojang;

public class md {

   public static md b = (new md("inFire")).j();
   public static md c = (new md("onFire")).h().j();
   public static md d = (new md("lava")).j();
   public static md e = (new md("inWall")).h();
   public static md f = (new md("drown")).h();
   public static md g = (new md("starve")).h();
   public static md h = new md("cactus");
   public static md i = (new md("fall")).h();
   public static md j = (new md("outOfWorld")).h().i();
   public static md k = (new md("generic")).h();
   public static md l = new md("explosion");
   public static md m = (new md("magic")).h();
   private boolean a = false;
   private boolean o = false;
   private float p = 0.3F;
   private boolean q;
   private boolean r;
   public String n;


   public static md a(acq var0) {
      return new fl("mojang/mob", var0);
   }

   public static md a(yw var0) {
      return new fl("player", var0);
   }

   public static md a(nm var0, nn var1) {
      return (new ft("arrow", var0, var1)).d();
   }

   public static md a(bt var0, nn var1) {
      return (new ft("fireball", var0, var1)).j().d();
   }

   public static md a(nn var0, nn var1) {
      return (new ft("thrown", var0, var1)).d();
   }

   public static md b(nn var0, nn var1) {
      return (new ft("indirectMagic", var0, var1)).h();
   }

   public boolean c() {
      return this.r;
   }

   public md d() {
      this.r = true;
      return this;
   }

   public boolean e() {
      return this.a;
   }

   public float f() {
      return this.p;
   }

   public boolean g() {
      return this.o;
   }

   protected md(String var1) {
      this.n = var1;
   }

   public nn b() {
      return this.a();
   }

   public nn a() {
      return null;
   }

   protected md h() {
      this.a = true;
      this.p = 0.0F;
      return this;
   }

   protected md i() {
      this.o = true;
      return this;
   }

   protected md j() {
      this.q = true;
      return this;
   }

   public boolean k() {
      return this.q;
   }

   public String l() {
      return this.n;
   }

}
