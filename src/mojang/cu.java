package mojang;

import java.util.Random;

public class cu extends bc {

   public static final float[][] a = new float[][]{{1.0F, 1.0F, 1.0F}, {0.95F, 0.7F, 0.2F}, {0.9F, 0.5F, 0.85F}, {0.6F, 0.7F, 0.95F}, {0.9F, 0.9F, 0.2F}, {0.5F, 0.8F, 0.1F}, {0.95F, 0.7F, 0.8F}, {0.3F, 0.3F, 0.3F}, {0.6F, 0.6F, 0.6F}, {0.3F, 0.6F, 0.7F}, {0.7F, 0.4F, 0.9F}, {0.2F, 0.4F, 0.8F}, {0.5F, 0.4F, 0.3F}, {0.4F, 0.5F, 0.2F}, {0.8F, 0.3F, 0.3F}, {0.1F, 0.1F, 0.1F}};
   private int b;
   private zi c = new zi(this);


   public cu(xd var1) {
      super(var1);
      this.bm = "/mojang/mob/sheep.png";
      this.a(0.9F, 1.3F);
      float var2 = 0.23F;
      this.aM().a(true);
      this.bT.a(0, new aje(this));
      this.bT.a(1, new ke(this, 0.38F));
      this.bT.a(2, new als(this, var2));
      this.bT.a(3, new akz(this, 0.25F, yr.T.bQ, false));
      this.bT.a(4, new ek(this, 0.25F));
      this.bT.a(5, this.c);
      this.bT.a(6, new acu(this, var2));
      this.bT.a(7, new ob(this, yw.class, 6.0F));
      this.bT.a(8, new bd(this));
   }

   protected boolean b_() {
      return true;
   }

   protected void s_() {
      this.b = this.c.h();
      super.s_();
   }

   public void e() {
      if(this.k.F) {
         this.b = Math.max(0, this.b - 1);
      }

      super.e();
   }

   public int d() {
      return 8;
   }

   protected void b() {
      super.b();
      this.ac.a(16, new Byte((byte)0));
   }

   protected void a(boolean var1, int var2) {
      if(!this.u()) {
         this.a(new aan(pb.ab.bO, 1, this.t()), 0.0F);
      }

   }

   protected int f() {
      return pb.ab.bO;
   }

   public void a(byte var1) {
      if(var1 == 10) {
         this.b = 40;
      } else {
         super.a(var1);
      }

   }

   public float c(float var1) {
      return this.b <= 0?0.0F:(this.b >= 4 && this.b <= 36?1.0F:(this.b < 4?((float)this.b - var1) / 4.0F:-((float)(this.b - 40) - var1) / 4.0F));
   }

   public float d(float var1) {
      if(this.b > 4 && this.b <= 36) {
         float var2 = ((float)(this.b - 4) - var1) / 32.0F;
         return 0.62831855F + 0.21991149F * gk.a(var2 * 28.7F);
      } else {
         return this.b > 0?0.62831855F:this.v / 57.295776F;
      }
   }

   public boolean c(yw var1) {
      aan var2 = var1.ap.b();
      if(var2 != null && var2.c == yr.be.bQ && !this.u() && !this.bi()) {
         if(!this.k.F) {
            this.a(true);
            int var3 = 1 + this.U.nextInt(3);

            for(int var4 = 0; var4 < var3; ++var4) {
               fq var5 = this.a(new aan(pb.ab.bO, 1, this.t()), 1.0F);
               var5.s += (double)(this.U.nextFloat() * 0.05F);
               var5.r += (double)((this.U.nextFloat() - this.U.nextFloat()) * 0.1F);
               var5.t += (double)((this.U.nextFloat() - this.U.nextFloat()) * 0.1F);
            }
         }

         var2.a(1, var1);
      }

      return super.c(var1);
   }

   public void b(ady var1) {
      super.b(var1);
      var1.a("Sheared", this.u());
      var1.a("Color", (byte)this.t());
   }

   public void a(ady var1) {
      super.a(var1);
      this.a(var1.o("Sheared"));
      this.c_(var1.d("Color"));
   }

   protected String m() {
      return "mojang.mob.sheep";
   }

   protected String n() {
      return "mojang.mob.sheep";
   }

   protected String o() {
      return "mojang.mob.sheep";
   }

   public int t() {
      return this.ac.a(16) & 15;
   }

   public void c_(int var1) {
      byte var2 = this.ac.a(16);
      this.ac.b(16, Byte.valueOf((byte)(var2 & 240 | var1 & 15)));
   }

   public boolean u() {
      return (this.ac.a(16) & 16) != 0;
   }

   public void a(boolean var1) {
      byte var2 = this.ac.a(16);
      if(var1) {
         this.ac.b(16, Byte.valueOf((byte)(var2 | 16)));
      } else {
         this.ac.b(16, Byte.valueOf((byte)(var2 & -17)));
      }

   }

   public static int a(Random var0) {
      int var1 = var0.nextInt(100);
      return var1 < 5?15:(var1 < 10?7:(var1 < 15?8:(var1 < 18?12:(var0.nextInt(500) == 0?6:0))));
   }

   public bc a(bc var1) {
      cu var2 = (cu)var1;
      cu var3 = new cu(this.k);
      if(this.U.nextBoolean()) {
         var3.c_(this.t());
      } else {
         var3.c_(var2.t());
      }

      return var3;
   }

   public void v() {
      this.a(false);
      if(this.bi()) {
         int var1 = this.av() + 1200;
         if(var1 > 0) {
            var1 = 0;
         }

         this.d(var1);
      }

   }

}
