package mojang;

public class Spider extends Monster {

   public Spider(World var1) {
      super(var1);
      this.bm = "/mojang/mob/spider.png";
      this.a(1.4F, 0.9F);
      this.cj = 0.8F;
   }

   protected void b() {
      super.b();
      this.ac.a(16, new Byte((byte)0));
   }

   public void e() {
      super.e();
   }

   public void J_() {
      super.J_();
      if(!this.k.F) {
         this.a(this.A);
      }

   }

   public int d() {
      return 16;
   }

   public double l() {
      return (double)this.J * 0.75D - 0.5D;
   }

   protected boolean e_() {
      return false;
   }

   protected BaseEntity h() {
      float var1 = this.a(1.0F);
      if(var1 < 0.5F) {
         double var2 = 16.0D;
         return this.k.b(this, var2);
      } else {
         return null;
      }
   }

   protected String m() {
      return "mojang.mob.spider";
   }

   protected String n() {
      return "mojang.mob.spider";
   }

   protected String o() {
      return "mojang.mob.spiderdeath";
   }

   protected void a(BaseEntity var1, float var2) {
      float var3 = this.a(1.0F);
      if(var3 > 0.5F && this.U.nextInt(100) == 0) {
         this.ao = null;
      } else {
         if(var2 > 2.0F && var2 < 6.0F && this.U.nextInt(10) == 0) {
            if(this.z) {
               double var4 = var1.o - this.o;
               double var6 = var1.q - this.q;
               float var8 = Utils.sqrt(var4 * var4 + var6 * var6);
               this.r = var4 / (double)var8 * 0.5D * 0.800000011920929D + this.r * 0.20000000298023224D;
               this.t = var6 / (double)var8 * 0.5D * 0.800000011920929D + this.t * 0.20000000298023224D;
               this.s = 0.4000000059604645D;
            }
         } else {
            super.a(var1, var2);
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
      return yr.K.bQ;
   }

   protected void a(boolean var1, int var2) {
      super.a(var1, var2);
      if(var1 && (this.U.nextInt(3) == 0 || this.U.nextInt(1 + var2) > 0)) {
         this.b(yr.bu.bQ, 1);
      }

   }

   public boolean p() {
      return this.q_();
   }

   public void q() {}

   public float r() {
      return 1.0F;
   }

   public bk s() {
      return mojang.bk.c;
   }

   public boolean a(alg var1) {
      return var1.a() == aad.u.H?false:super.a(var1);
   }

   public boolean q_() {
      return (this.ac.a(16) & 1) != 0;
   }

   public void a(boolean var1) {
      byte var2 = this.ac.a(16);
      if(var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 &= -2;
      }

      this.ac.b(16, Byte.valueOf(var2));
   }
}
