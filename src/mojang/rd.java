package mojang;

public class rd extends bc {

   public boolean a = false;
   public float b = 0.0F;
   public float c = 0.0F;
   public float d;
   public float e;
   public float am = 1.0F;
   public int an;


   public rd(xd var1) {
      super(var1);
      this.bm = "/mojang/mob/chicken.png";
      this.a(0.3F, 0.7F);
      this.an = this.U.nextInt(6000) + 6000;
      float var2 = 0.25F;
      this.bT.a(0, new aje(this));
      this.bT.a(1, new ke(this, 0.38F));
      this.bT.a(2, new als(this, var2));
      this.bT.a(3, new akz(this, 0.25F, yr.T.bQ, false));
      this.bT.a(4, new ek(this, 0.28F));
      this.bT.a(5, new acu(this, var2));
      this.bT.a(6, new ob(this, yw.class, 6.0F));
      this.bT.a(7, new bd(this));
   }

   public boolean b_() {
      return true;
   }

   public int d() {
      return 4;
   }

   public void e() {
      super.e();
      this.e = this.b;
      this.d = this.c;
      this.c = (float)((double)this.c + (double)(this.z?-1:4) * 0.3D);
      if(this.c < 0.0F) {
         this.c = 0.0F;
      }

      if(this.c > 1.0F) {
         this.c = 1.0F;
      }

      if(!this.z && this.am < 1.0F) {
         this.am = 1.0F;
      }

      this.am = (float)((double)this.am * 0.9D);
      if(!this.z && this.s < 0.0D) {
         this.s *= 0.6D;
      }

      this.b += this.am * 2.0F;
      if(!this.bi() && !this.k.F && --this.an <= 0) {
         this.k.a(this, "mojang.mob.chickenplop", 1.0F, (this.U.nextFloat() - this.U.nextFloat()) * 0.2F + 1.0F);
         this.b(yr.aP.bQ, 1);
         this.an = this.U.nextInt(6000) + 6000;
      }

   }

   protected void e(float var1) {}

   public void b(ady var1) {
      super.b(var1);
   }

   public void a(ady var1) {
      super.a(var1);
   }

   protected String m() {
      return "mojang.mob.chicken";
   }

   protected String n() {
      return "mojang.mob.chickenhurt";
   }

   protected String o() {
      return "mojang.mob.chickenhurt";
   }

   protected int f() {
      return yr.L.bQ;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.U.nextInt(3) + this.U.nextInt(1 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.b(yr.L.bQ, 1);
      }

      if(this.T()) {
         this.b(yr.bl.bQ, 1);
      } else {
         this.b(yr.bk.bQ, 1);
      }

   }

   public bc a(bc var1) {
      return new rd(this.k);
   }
}
