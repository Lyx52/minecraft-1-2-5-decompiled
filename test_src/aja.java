
public class aja extends acq implements xf {

   public float a;
   public float b;
   public float c;
   private int d = 0;


   public aja(xd var1) {
      super(var1);
      this.bm = "/mob/slime.png";
      int var2 = 1 << this.U.nextInt(3);
      this.H = 0.0F;
      this.d = this.U.nextInt(20) + 10;
      this.d(var2);
   }

   protected void b() {
      super.b();
      this.ac.a(16, new Byte((byte)1));
   }

   public void d(int var1) {
      this.ac.b(16, new Byte((byte)var1));
      this.a(0.6F * (float)var1, 0.6F * (float)var1);
      this.d(this.o, this.p, this.q);
      this.l(this.d());
      this.bI = var1;
   }

   public int d() {
      int var1 = this.ap();
      return var1 * var1;
   }

   public int ap() {
      return this.ac.a(16);
   }

   public void b(ady var1) {
      super.b(var1);
      var1.a("Size", this.ap() - 1);
   }

   public void a(ady var1) {
      super.a(var1);
      this.d(var1.f("Size") + 1);
   }

   protected String af() {
      return "slime";
   }

   protected String am() {
      return "mob.slime";
   }

   public void J_() {
      if(!this.k.F && this.k.q == 0 && this.ap() > 0) {
         this.G = true;
      }

      this.b += (this.a - this.b) * 0.5F;
      this.c = this.b;
      boolean var1 = this.z;
      super.J_();
      if(this.z && !var1) {
         int var2 = this.ap();

         for(int var3 = 0; var3 < var2 * 8; ++var3) {
            float var4 = this.U.nextFloat() * 3.1415927F * 2.0F;
            float var5 = this.U.nextFloat() * 0.5F + 0.5F;
            float var6 = gk.a(var4) * (float)var2 * 0.5F * var5;
            float var7 = gk.b(var4) * (float)var2 * 0.5F * var5;
            this.k.a(this.af(), this.o + (double)var6, this.y.b, this.q + (double)var7, 0.0D, 0.0D, 0.0D);
         }

         if(this.an()) {
            this.k.a(this, this.am(), this.C_(), ((this.U.nextFloat() - this.U.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.a = -0.5F;
      }

      this.ai();
   }

   protected void y_() {
      this.w();
      yw var1 = this.k.b(this, 16.0D);
      if(var1 != null) {
         this.a(var1, 10.0F, 20.0F);
      }

      if(this.z && this.d-- <= 0) {
         this.d = this.ah();
         if(var1 != null) {
            this.d /= 3;
         }

         this.ch = true;
         if(this.ar()) {
            this.k.a(this, this.am(), this.C_(), ((this.U.nextFloat() - this.U.nextFloat()) * 0.2F + 1.0F) * 0.8F);
         }

         this.a = 1.0F;
         this.ce = 1.0F - this.U.nextFloat() * 2.0F;
         this.cf = (float)(1 * this.ap());
      } else {
         this.ch = false;
         if(this.z) {
            this.ce = this.cf = 0.0F;
         }
      }

   }

   protected void ai() {
      this.a *= 0.6F;
   }

   protected int ah() {
      return this.U.nextInt(20) + 10;
   }

   protected aja ag() {
      return new aja(this.k);
   }

   public void A() {
      int var1 = this.ap();
      if(!this.k.F && var1 > 1 && this.bb() <= 0) {
         int var2 = 2 + this.U.nextInt(3);

         for(int var3 = 0; var3 < var2; ++var3) {
            float var4 = ((float)(var3 % 2) - 0.5F) * (float)var1 / 4.0F;
            float var5 = ((float)(var3 / 2) - 0.5F) * (float)var1 / 4.0F;
            aja var6 = this.ag();
            var6.d(var1 / 2);
            var6.c(this.o + (double)var4, this.p + 0.5D, this.q + (double)var5, this.U.nextFloat() * 360.0F, 0.0F);
            this.k.a((nn)var6);
         }
      }

      super.A();
   }

   public void a(yw var1) {
      if(this.aj()) {
         int var2 = this.ap();
         if(this.m(var1) && (double)this.e(var1) < 0.6D * (double)var2 && var1.a(md.a((acq)this), this.al())) {
            this.k.a(this, "mob.slimeattack", 1.0F, (this.U.nextFloat() - this.U.nextFloat()) * 0.2F + 1.0F);
         }
      }

   }

   protected boolean aj() {
      return this.ap() > 1;
   }

   protected int al() {
      return this.ap();
   }

   protected String n() {
      return "mob.slime";
   }

   protected String o() {
      return "mob.slime";
   }

   protected int f() {
      return this.ap() == 1?yr.aM.bQ:0;
   }

   public boolean i() {
      ack var1 = this.k.c(gk.c(this.o), gk.c(this.q));
      return (this.ap() == 1 || this.k.q > 0) && this.U.nextInt(10) == 0 && var1.a(987234911L).nextInt(10) == 0 && this.p < 40.0D?super.i():false;
   }

   protected float C_() {
      return 0.4F * (float)this.ap();
   }

   public int ak() {
      return 0;
   }

   protected boolean ar() {
      return this.ap() > 1;
   }

   protected boolean an() {
      return this.ap() > 2;
   }
}
