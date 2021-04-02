package mojang;

public class ed extends ajr {

   private int b;
   private boolean c;
   private boolean d;
   kd a;


   public ed(xd var1) {
      this(var1, 0);
   }

   public ed(xd var1, int var2) {
      super(var1);
      this.b = 0;
      this.c = false;
      this.d = false;
      this.a = null;
      this.d_(var2);
      this.bm = "/mojang/mob/villager/villager.png";
      this.cj = 0.5F;
      this.aM().b(true);
      this.aM().a(true);
      this.bT.a(0, new aje(this));
      this.bT.a(1, new fg(this, ajg.class, 8.0F, 0.3F, 0.35F));
      this.bT.a(2, new bp(this));
      this.bT.a(3, new tx(this));
      this.bT.a(4, new acy(this, true));
      this.bT.a(5, new vw(this, 0.3F));
      this.bT.a(6, new xe(this));
      this.bT.a(7, new yi(this));
      this.bT.a(8, new ux(this, 0.32F));
      this.bT.a(9, new vi(this, yw.class, 3.0F, 1.0F));
      this.bT.a(9, new vi(this, ed.class, 5.0F, 0.02F));
      this.bT.a(9, new acu(this, 0.3F));
      this.bT.a(10, new ob(this, acq.class, 8.0F));
   }

   public boolean b_() {
      return true;
   }

   protected void g() {
      if(--this.b <= 0) {
         this.k.A.a(gk.c(this.o), gk.c(this.p), gk.c(this.q));
         this.b = 70 + this.U.nextInt(50);
         this.a = this.k.A.a(gk.c(this.o), gk.c(this.p), gk.c(this.q), 32);
         if(this.a == null) {
            this.aX();
         } else {
            uh var1 = this.a.a();
            this.b(var1.a, var1.b, var1.c, this.a.b());
         }
      }

      super.g();
   }

   protected void b() {
      super.b();
      this.ac.a(16, Integer.valueOf(0));
   }

   public int d() {
      return 20;
   }

   public void e() {
      super.e();
   }

   public void b(ady var1) {
      super.b(var1);
      var1.a("Profession", this.u());
   }

   public void a(ady var1) {
      super.a(var1);
      this.d_(var1.f("Profession"));
   }

   public String v_() {
      switch(this.u()) {
      case 0:
         return "/mojang/mob/villager/farmer.png";
      case 1:
         return "/mojang/mob/villager/librarian.png";
      case 2:
         return "/mojang/mob/villager/priest.png";
      case 3:
         return "/mojang/mob/villager/smith.png";
      case 4:
         return "/mojang/mob/villager/butcher.png";
      default:
         return super.v_();
      }
   }

   protected boolean c_() {
      return false;
   }

   protected String m() {
      return "mojang.mob.villager.default";
   }

   protected String n() {
      return "mojang.mob.villager.defaulthurt";
   }

   protected String o() {
      return "mojang.mob.villager.defaultdeath";
   }

   public void d_(int var1) {
      this.ac.b(16, Integer.valueOf(var1));
   }

   public int u() {
      return this.ac.c(16);
   }

   public boolean x_() {
      return this.c;
   }

   public void a(boolean var1) {
      this.c = var1;
   }

   public void b(boolean var1) {
      this.d = var1;
   }

   public boolean x() {
      return this.d;
   }

   public void a(acq var1) {
      super.a(var1);
      if(this.a != null && var1 != null) {
         this.a.a(var1);
      }

   }
}
