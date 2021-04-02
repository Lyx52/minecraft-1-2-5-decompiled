package mojang;

public class Zombie extends Monster {

   public Zombie(World var1) {
      super(var1);
      this.bm = "/mojang/mob/zombie.png";
      this.cj = 0.23F;
      this.c = 4;
      this.aM().b(true);
      this.bT.a(0, new aje(this));
      this.bT.a(1, new ue(this));
      this.bT.a(2, new ax(this, Player.class, this.cj, false));
      this.bT.a(3, new ax(this, Villager.class, this.cj, true));
      this.bT.a(4, new vw(this, this.cj));
      this.bT.a(5, new akr(this, this.cj, false));
      this.bT.a(6, new acu(this, this.cj));
      this.bT.a(7, new ob(this, Player.class, 8.0F));
      this.bT.a(7, new bd(this));
      this.bU.a(1, new zy(this, false));
      this.bU.a(2, new amf(this, Player.class, 16.0F, 0, true));
      this.bU.a(2, new amf(this, Villager.class, 16.0F, 0, false));
   }

   public int d() {
      return 20;
   }

   public int au() {
      return 2;
   }

   protected boolean b_() {
      return true;
   }

   public void e() {
      if(this.k.m() && !this.k.F) {
         float var1 = this.a(1.0F);
         if(var1 > 0.5F && this.k.m(Utils.c(this.o), Utils.c(this.p), Utils.c(this.q)) && this.U.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.e(8);
         }
      }

      super.e();
   }

   protected String m() {
      return "mojang.mob.zombie";
   }

   protected String n() {
      return "mojang.mob.zombiehurt";
   }

   protected String o() {
      return "mojang.mob.zombiedeath";
   }

   protected int f() {
      return yr.bm.bQ;
   }

   public bk s() {
      return mojang.bk.b;
   }

   protected void j_(int var1) {
      switch(this.U.nextInt(4)) {
      case 0:
         this.b(yr.q.bQ, 1);
         break;
      case 1:
         this.b(yr.ad.bQ, 1);
         break;
      case 2:
         this.b(yr.o.bQ, 1);
         break;
      case 3:
         this.b(yr.f.bQ, 1);
      }

   }
}
