package mojang;

public class aic extends aja {

   public aic(xd var1) {
      super(var1);
      this.bm = "/mojang/mob/lava.png";
      this.ab = true;
      this.bt = 0.2F;
   }

   public boolean i() {
      return this.k.q > 0 && this.k.a(this.y) && this.k.a((nn)this, this.y).size() == 0 && !this.k.b(this.y);
   }

   public int au() {
      return this.ap() * 3;
   }

   public int b(float var1) {
      return 15728880;
   }

   public float a(float var1) {
      return 1.0F;
   }

   protected String af() {
      return "flame";
   }

   protected aja ag() {
      return new aic(this.k);
   }

   protected int f() {
      return yr.bx.bQ;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.f();
      if(var3 > 0 && this.ap() > 1) {
         int var4 = this.U.nextInt(4) - 2;
         if(var2 > 0) {
            var4 += this.U.nextInt(var2 + 1);
         }

         for(int var5 = 0; var5 < var4; ++var5) {
            this.b(var3, 1);
         }
      }

   }

   public boolean T() {
      return false;
   }

   protected int ah() {
      return super.ah() * 4;
   }

   protected void ai() {
      this.a *= 0.9F;
   }

   protected void aD() {
      this.s = (double)(0.42F + (float)this.ap() * 0.1F);
      this.al = true;
   }

   protected void e(float var1) {}

   protected boolean aj() {
      return true;
   }

   protected int al() {
      return super.al() + 2;
   }

   protected String n() {
      return "mojang.mob.slime";
   }

   protected String o() {
      return "mojang.mob.slime";
   }

   protected String am() {
      return this.ap() > 1?"mojang.mob.magmacube.big":"mojang.mob.magmacube.small";
   }

   public boolean J() {
      return false;
   }

   protected boolean an() {
      return true;
   }
}
