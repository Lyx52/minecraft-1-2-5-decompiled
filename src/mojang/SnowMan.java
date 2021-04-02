package mojang;

public class SnowMan extends akm {

   public SnowMan(World var1) {
      super(var1);
      this.bm = "/mojang/mob/snowman.png";
      this.a(0.4F, 1.8F);
      this.aM().a(true);
      this.bT.a(1, new sf(this, 0.25F, 2, 20));
      this.bT.a(2, new acu(this, 0.2F));
      this.bT.a(3, new ob(this, Player.class, 6.0F));
      this.bT.a(4, new bd(this));
      this.bU.a(1, new amf(this, Monster.class, 16.0F, 0, true));
   }

   public boolean b_() {
      return true;
   }

   public int d() {
      return 4;
   }

   public void e() {
      super.e();
      if(this.G()) {
         this.a(md.f, 1);
      }

      int var1 = Utils.c(this.o);
      int var2 = Utils.c(this.q);
      if(this.k.a(var1, var2).j() > 1.0F) {
         this.a(md.c, 1);
      }

      for(var1 = 0; var1 < 4; ++var1) {
         var2 = Utils.c(this.o + (double)((float)(var1 % 2 * 2 - 1) * 0.25F));
         int var3 = Utils.c(this.p);
         int var4 = Utils.c(this.q + (double)((float)(var1 / 2 % 2 * 2 - 1) * 0.25F));
         if(this.k.a(var2, var3, var4) == 0 && this.k.a(var2, var4).j() < 0.8F && pb.aS.e(this.k, var2, var3, var4)) {
            this.k.g(var2, var3, var4, pb.aS.bO);
         }
      }

   }

   public void b(CompundTag var1) {
      super.b(var1);
   }

   public void a(CompundTag var1) {
      super.a(var1);
   }

   protected int f() {
      return yr.aD.bQ;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.U.nextInt(16);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.b(yr.aD.bQ, 1);
      }

   }
}
