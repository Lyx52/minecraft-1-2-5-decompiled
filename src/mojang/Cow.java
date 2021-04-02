package mojang;

public class Cow extends bc {

   public Cow(World var1) {
      super(var1);
      this.bm = "/mojang/mob/cow.png";
      this.a(0.9F, 1.3F);
      this.aM().a(true);
      this.bT.a(0, new aje(this));
      this.bT.a(1, new ke(this, 0.38F));
      this.bT.a(2, new als(this, 0.2F));
      this.bT.a(3, new akz(this, 0.25F, yr.T.bQ, false));
      this.bT.a(4, new ek(this, 0.25F));
      this.bT.a(5, new acu(this, 0.2F));
      this.bT.a(6, new ob(this, Player.class, 6.0F));
      this.bT.a(7, new bd(this));
   }

   public boolean b_() {
      return true;
   }

   public int d() {
      return 10;
   }

   public void b(CompundTag var1) {
      super.b(var1);
   }

   public void a(CompundTag var1) {
      super.a(var1);
   }

   protected String m() {
      return "mojang.mob.cow";
   }

   protected String n() {
      return "mojang.mob.cowhurt";
   }

   protected String o() {
      return "mojang.mob.cowhurt";
   }

   protected float C_() {
      return 0.4F;
   }

   protected int f() {
      return yr.aF.bQ;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.U.nextInt(3) + this.U.nextInt(1 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.b(yr.aF.bQ, 1);
      }

      var3 = this.U.nextInt(3) + 1 + this.U.nextInt(1 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         if(this.T()) {
            this.b(yr.bj.bQ, 1);
         } else {
            this.b(yr.bi.bQ, 1);
         }
      }

   }

   public boolean c(Player var1) {
      aan var2 = var1.ap.b();
      if(var2 != null && var2.c == yr.aw.bQ) {
         var1.ap.a(var1.ap.c, new aan(yr.aG));
         return true;
      } else {
         return super.c(var1);
      }
   }

   public bc a(bc var1) {
      return new Cow(this.k);
   }
}
