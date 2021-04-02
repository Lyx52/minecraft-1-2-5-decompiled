package mojang;

public class Pig extends bc {

   public Pig(World var1) {
      super(var1);
      this.bm = "/mojang/mob/pig.png";
      this.a(0.9F, 0.9F);
      this.aM().a(true);
      float var2 = 0.25F;
      this.bT.a(0, new aje(this));
      this.bT.a(1, new ke(this, 0.38F));
      this.bT.a(2, new als(this, var2));
      this.bT.a(3, new akz(this, 0.25F, yr.T.bQ, false));
      this.bT.a(4, new ek(this, 0.28F));
      this.bT.a(5, new acu(this, var2));
      this.bT.a(6, new ob(this, Player.class, 6.0F));
      this.bT.a(7, new bd(this));
   }

   public boolean b_() {
      return true;
   }

   public int d() {
      return 10;
   }

   protected void b() {
      super.b();
      this.ac.a(16, Byte.valueOf((byte)0));
   }

   public void b(CompundTag var1) {
      super.b(var1);
      var1.addBoolean("Saddle", this.aa());
   }

   public void a(CompundTag var1) {
      super.a(var1);
      this.a(var1.getBoolean("Saddle"));
   }

   protected String m() {
      return "mojang.mob.pig";
   }

   protected String n() {
      return "mojang.mob.pig";
   }

   protected String o() {
      return "mojang.mob.pigdeath";
   }

   public boolean c(Player var1) {
      if(super.c(var1)) {
         return true;
      } else if(this.aa() && !this.k.F && (this.i == null || this.i == var1)) {
         var1.h(this);
         return true;
      } else {
         return false;
      }
   }

   protected int f() {
      return this.T()?yr.ar.bQ:yr.aq.bQ;
   }

   public boolean aa() {
      return (this.ac.a(16) & 1) != 0;
   }

   public void a(boolean var1) {
      if(var1) {
         this.ac.b(16, Byte.valueOf((byte)1));
      } else {
         this.ac.b(16, Byte.valueOf((byte)0));
      }

   }

   public void a(d var1) {
      if(!this.k.F) {
         PigZombie var2 = new PigZombie(this.k);
         var2.c(this.o, this.p, this.q, this.u, this.v);
         this.k.a((BaseEntity)var2);
         this.A();
      }
   }

   protected void e(float var1) {
      super.e(var1);
      if(var1 > 5.0F && this.i instanceof Player) {
         ((Player)this.i).a((ajw)dp.u);
      }

   }

   public bc a(bc var1) {
      return new Pig(this.k);
   }
}
