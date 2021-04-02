package mojang;

public class XPOrb extends BaseEntity {

   public int a;
   public int b = 0;
   public int c;
   private int d = 5;
   private int e;


   public XPOrb(World var1, double var2, double var4, double var6, int var8) {
      super(var1);
      this.a(0.5F, 0.5F);
      this.H = this.J / 2.0F;
      this.d(var2, var4, var6);
      this.u = (float)(Math.random() * 360.0D);
      this.r = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.s = (double)((float)(Math.random() * 0.2D) * 2.0F);
      this.t = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.e = var8;
   }

   protected boolean e_() {
      return false;
   }

   public XPOrb(World var1) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.H = this.J / 2.0F;
   }

   protected void b() {}

   public int b(float var1) {
      float var2 = 0.5F;
      if(var2 < 0.0F) {
         var2 = 0.0F;
      }

      if(var2 > 1.0F) {
         var2 = 1.0F;
      }

      int var3 = super.b(var1);
      int var4 = var3 & 255;
      int var5 = var3 >> 16 & 255;
      var4 += (int)(var2 * 15.0F * 16.0F);
      if(var4 > 240) {
         var4 = 240;
      }

      return var4 | var5 << 16;
   }

   public void J_() {
      super.J_();
      if(this.c > 0) {
         --this.c;
      }

      this.sandX = this.o;
      this.sandY = this.p;
      this.sandZ = this.q;
      this.s -= 0.029999999329447746D;
      if(this.k.f(Utils.c(this.o), Utils.c(this.p), Utils.c(this.q)) == acn.h) {
         this.s = 0.20000000298023224D;
         this.r = (double)((this.U.nextFloat() - this.U.nextFloat()) * 0.2F);
         this.t = (double)((this.U.nextFloat() - this.U.nextFloat()) * 0.2F);
         this.k.a(this, "random.fizz", 0.4F, 2.0F + this.U.nextFloat() * 0.4F);
      }

      this.h(this.o, (this.y.b + this.y.e) / 2.0D, this.q);
      double var1 = 8.0D;
      Player var3 = this.k.a(this, var1);
      if(var3 != null) {
         double var4 = (var3.o - this.o) / var1;
         double var6 = (var3.p + (double)var3.I() - this.p) / var1;
         double var8 = (var3.q - this.q) / var1;
         double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
         double var12 = 1.0D - var10;
         if(var12 > 0.0D) {
            var12 *= var12;
            this.r += var4 / var10 * var12 * 0.1D;
            this.s += var6 / var10 * var12 * 0.1D;
            this.t += var8 / var10 * var12 * 0.1D;
         }
      }

      this.b(this.r, this.s, this.t);
      float var14 = 0.98F;
      if(this.z) {
         var14 = 0.58800006F;
         int var5 = this.k.a(Utils.c(this.o), Utils.c(this.y.b) - 1, Utils.c(this.q));
         if(var5 > 0) {
            var14 = pb.m[var5].ce * 0.98F;
         }
      }

      this.r *= (double)var14;
      this.s *= 0.9800000190734863D;
      this.t *= (double)var14;
      if(this.z) {
         this.s *= -0.8999999761581421D;
      }

      ++this.a;
      ++this.b;
      if(this.b >= 6000) {
         this.A();
      }

   }

   public boolean g_() {
      return this.k.a(this.y, acn.g, this);
   }

   protected void a(int var1) {
      this.a(md.b, var1);
   }

   public boolean a(md var1, int var2) {
      this.K();
      this.d -= var2;
      if(this.d <= 0) {
         this.A();
      }

      return false;
   }

   public void b(CompundTag var1) {
      var1.addShort("Health", (short)((byte)this.d));
      var1.addShort("Age", (short)this.b);
      var1.addShort("Value", (short)this.e);
   }

   public void a(CompundTag var1) {
      this.d = var1.getShort("Health") & 255;
      this.b = var1.getShort("Age");
      this.e = var1.getShort("Value");
   }

   public void a(Player var1) {
      if(!this.k.F) {
         if(this.c == 0 && var1.aD == 0) {
            var1.aD = 2;
            this.k.a(this, "random.orb", 0.1F, 0.5F * ((this.U.nextFloat() - this.U.nextFloat()) * 0.7F + 1.8F));
            var1.b((BaseEntity)this, 1);
            var1.i(this.e);
            this.A();
         }

      }
   }

   public int h() {
      return this.e;
   }

   public int i() {
      return this.e >= 2477?10:(this.e >= 1237?9:(this.e >= 617?8:(this.e >= 307?7:(this.e >= 149?6:(this.e >= 73?5:(this.e >= 37?4:(this.e >= 17?3:(this.e >= 7?2:(this.e >= 3?1:0)))))))));
   }

   public static int b(int var0) {
      return var0 >= 2477?2477:(var0 >= 1237?1237:(var0 >= 617?617:(var0 >= 307?307:(var0 >= 149?149:(var0 >= 73?73:(var0 >= 37?37:(var0 >= 17?17:(var0 >= 7?7:(var0 >= 3?3:1)))))))));
   }

   public boolean k_() {
      return false;
   }
}
