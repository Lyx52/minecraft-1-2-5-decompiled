package mojang;

public class Squid extends tq {

   public float a = 0.0F;
   public float b = 0.0F;
   public float c = 0.0F;
   public float d = 0.0F;
   public float e = 0.0F;
   public float am = 0.0F;
   public float an = 0.0F;
   public float ar = 0.0F;
   private float as = 0.0F;
   private float at = 0.0F;
   private float au = 0.0F;
   private float av = 0.0F;
   private float aw = 0.0F;
   private float ax = 0.0F;


   public Squid(World var1) {
      super(var1);
      this.bm = "/mojang/mob/squid.png";
      this.a(0.95F, 0.95F);
      this.at = 1.0F / (this.U.nextFloat() + 1.0F) * 0.2F;
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
      return null;
   }

   protected String n() {
      return null;
   }

   protected String o() {
      return null;
   }

   protected float C_() {
      return 0.4F;
   }

   protected int f() {
      return 0;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.U.nextInt(3 + var2) + 1;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.a(new aan(yr.aW, 1, 0), 0.0F);
      }

   }

   public boolean c(Player var1) {
      return super.c(var1);
   }

   public boolean H() {
      return this.k.a(this.y.b(0.0D, -0.6000000238418579D, 0.0D), acn.g, this);
   }

   public void e() {
      super.e();
      this.b = this.a;
      this.d = this.c;
      this.am = this.e;
      this.ar = this.an;
      this.e += this.at;
      if(this.e > 6.2831855F) {
         this.e -= 6.2831855F;
         if(this.U.nextInt(10) == 0) {
            this.at = 1.0F / (this.U.nextFloat() + 1.0F) * 0.2F;
         }
      }

      if(this.H()) {
         float var1;
         if(this.e < 3.1415927F) {
            var1 = this.e / 3.1415927F;
            this.an = Utils.sin(var1 * var1 * 3.1415927F) * 3.1415927F * 0.25F;
            if((double)var1 > 0.75D) {
               this.as = 1.0F;
               this.au = 1.0F;
            } else {
               this.au *= 0.8F;
            }
         } else {
            this.an = 0.0F;
            this.as *= 0.9F;
            this.au *= 0.99F;
         }

         if(!this.k.F) {
            this.r = (double)(this.av * this.as);
            this.s = (double)(this.aw * this.as);
            this.t = (double)(this.ax * this.as);
         }

         var1 = Utils.sqrt(this.r * this.r + this.t * this.t);
         this.bd += (-((float)Math.atan2(this.r, this.t)) * 180.0F / 3.1415927F - this.bd) * 0.1F;
         this.u = this.bd;
         this.c += 3.1415927F * this.au * 1.5F;
         this.a += (-((float)Math.atan2((double)var1, this.s)) * 180.0F / 3.1415927F - this.a) * 0.1F;
      } else {
         this.an = Utils.e(Utils.sin(this.e)) * 3.1415927F * 0.25F;
         if(!this.k.F) {
            this.r = 0.0D;
            this.s -= 0.08D;
            this.s *= 0.9800000190734863D;
            this.t = 0.0D;
         }

         this.a = (float)((double)this.a + (double)(-90.0F - this.a) * 0.02D);
      }

   }

   public void a_(float var1, float var2) {
      this.b(this.r, this.s, this.t);
   }

   protected void y_() {
      ++this.cd;
      if(this.cd > 100) {
         this.av = this.aw = this.ax = 0.0F;
      } else if(this.U.nextInt(50) == 0 || !this.X || this.av == 0.0F && this.aw == 0.0F && this.ax == 0.0F) {
         float var1 = this.U.nextFloat() * 3.1415927F * 2.0F;
         this.av = Utils.cos(var1) * 0.2F;
         this.aw = -0.1F + this.U.nextFloat() * 0.2F;
         this.ax = Utils.sin(var1) * 0.2F;
      }

      this.w();
   }

   public boolean i() {
      return this.p > 45.0D && this.p < 63.0D && super.i();
   }
}
