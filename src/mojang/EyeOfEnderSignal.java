package mojang;

public class EyeOfEnderSignal extends BaseEntity {

   public int a = 0;
   private double b;
   private double c;
   private double d;
   private int e;
   private boolean am;


   public EyeOfEnderSignal(World var1) {
      super(var1);
      this.a(0.25F, 0.25F);
   }

   protected void b() {}

   public boolean a(double var1) {
      double var3 = this.y.c() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public EyeOfEnderSignal(World var1, double var2, double var4, double var6) {
      super(var1);
      this.e = 0;
      this.a(0.25F, 0.25F);
      this.d(var2, var4, var6);
      this.H = 0.0F;
   }

   public void a(double var1, int var3, double var4) {
      double var6 = var1 - this.o;
      double var8 = var4 - this.q;
      float var10 = Utils.sqrt(var6 * var6 + var8 * var8);
      if(var10 > 12.0F) {
         this.b = this.o + var6 / (double)var10 * 12.0D;
         this.d = this.q + var8 / (double)var10 * 12.0D;
         this.c = this.p + 8.0D;
      } else {
         this.b = var1;
         this.c = (double)var3;
         this.d = var4;
      }

      this.e = 0;
      this.am = this.U.nextInt(5) > 0;
   }

   public void a(double var1, double var3, double var5) {
      this.r = var1;
      this.s = var3;
      this.t = var5;
      if(this.x == 0.0F && this.w == 0.0F) {
         float var7 = Utils.sqrt(var1 * var1 + var5 * var5);
         this.w = this.u = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
         this.x = this.v = (float)(Math.atan2(var3, (double)var7) * 180.0D / 3.1415927410125732D);
      }

   }

   public void J_() {
      this.N = this.o;
      this.O = this.p;
      this.P = this.q;
      super.J_();
      this.o += this.r;
      this.p += this.s;
      this.q += this.t;
      float var1 = Utils.sqrt(this.r * this.r + this.t * this.t);
      this.u = (float)(Math.atan2(this.r, this.t) * 180.0D / 3.1415927410125732D);

      for(this.v = (float)(Math.atan2(this.s, (double)var1) * 180.0D / 3.1415927410125732D); this.v - this.x < -180.0F; this.x -= 360.0F) {
         ;
      }

      while(this.v - this.x >= 180.0F) {
         this.x += 360.0F;
      }

      while(this.u - this.w < -180.0F) {
         this.w -= 360.0F;
      }

      while(this.u - this.w >= 180.0F) {
         this.w += 360.0F;
      }

      this.v = this.x + (this.v - this.x) * 0.2F;
      this.u = this.w + (this.u - this.w) * 0.2F;
      if(!this.k.F) {
         double var2 = this.b - this.o;
         double var4 = this.d - this.q;
         float var6 = (float)Math.sqrt(var2 * var2 + var4 * var4);
         float var7 = (float)Math.atan2(var4, var2);
         double var8 = (double)var1 + (double)(var6 - var1) * 0.0025D;
         if(var6 < 1.0F) {
            var8 *= 0.8D;
            this.s *= 0.8D;
         }

         this.r = Math.cos((double)var7) * var8;
         this.t = Math.sin((double)var7) * var8;
         if(this.p < this.c) {
            this.s += (1.0D - this.s) * 0.014999999664723873D;
         } else {
            this.s += (-1.0D - this.s) * 0.014999999664723873D;
         }
      }

      float var10 = 0.25F;
      if(this.H()) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.k.a("bubble", this.o - this.r * (double)var10, this.p - this.s * (double)var10, this.q - this.t * (double)var10, this.r, this.s, this.t);
         }
      } else {
         this.k.a("portal", this.o - this.r * (double)var10 + this.U.nextDouble() * 0.6D - 0.3D, this.p - this.s * (double)var10 - 0.5D, this.q - this.t * (double)var10 + this.U.nextDouble() * 0.6D - 0.3D, this.r, this.s, this.t);
      }

      if(!this.k.F) {
         this.d(this.o, this.p, this.q);
         ++this.e;
         if(this.e > 80 && !this.k.F) {
            this.A();
            if(this.am) {
               this.k.a((BaseEntity)(new Item(this.k, this.o, this.p, this.q, new aan(yr.bA))));
            } else {
               this.k.g(2003, (int)Math.round(this.o), (int)Math.round(this.p), (int)Math.round(this.q), 0);
            }
         }
      }

   }

   public void b(CompundTag var1) {}

   public void a(CompundTag var1) {}

   public void a(Player var1) {}

   public float h_() {
      return 0.0F;
   }

   public float a(float var1) {
      return 1.0F;
   }

   public int b(float var1) {
      return 15728880;
   }

   public boolean k_() {
      return false;
   }
}
