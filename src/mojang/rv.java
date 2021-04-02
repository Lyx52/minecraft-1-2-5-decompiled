package mojang;

public class rv extends yw {

   private boolean b = false;
   private int c;
   private double d;
   private double e;
   private double am;
   private double an;
   private double ao;


   public rv(xd var1, String var2) {
      super(var1);
      this.aA = var2;
      this.H = 0.0F;
      this.R = 0.0F;
      if(var2 != null && var2.length() > 0) {
         this.Z = "https://s3.amazonaws.com/MinecraftSkins/" + var2 + ".png";
      }

      this.S = true;
      this.aN = 0.25F;
      this.g = 10.0D;
   }

   protected void aa() {
      this.H = 0.0F;
   }

   public boolean a(md var1, int var2) {
      return true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.d = var1;
      this.e = var3;
      this.am = var5;
      this.an = (double)var7;
      this.ao = (double)var8;
      this.c = var9;
   }

   public void J_() {
      this.aN = 0.0F;
      super.J_();
      this.bL = this.bM;
      double var1 = this.o - this.l;
      double var3 = this.q - this.n;
      float var5 = gk.a(var1 * var1 + var3 * var3) * 4.0F;
      if(var5 > 1.0F) {
         var5 = 1.0F;
      }

      this.bM += (var5 - this.bM) * 0.4F;
      this.bN += this.bM;
      if(!this.b && this.X() && this.ap.a[this.ap.c] != null) {
         aan var6 = this.ap.a[this.ap.c];
         this.c(this.ap.a[this.ap.c], yr.e[var6.c].b(var6));
         this.b = true;
      } else if(this.b && !this.X()) {
         this.an();
         this.b = false;
      }

   }

   public float h_() {
      return 0.0F;
   }

   public void e() {
      super.y_();
      if(this.c > 0) {
         double var1 = this.o + (this.d - this.o) / (double)this.c;
         double var3 = this.p + (this.e - this.p) / (double)this.c;
         double var5 = this.q + (this.am - this.q) / (double)this.c;

         double var7;
         for(var7 = this.an - (double)this.u; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.u = (float)((double)this.u + var7 / (double)this.c);
         this.v = (float)((double)this.v + (this.ao - (double)this.v) / (double)this.c);
         --this.c;
         this.d(var1, var3, var5);
         this.b(this.u, this.v);
      }

      this.aw = this.ax;
      float var9 = gk.a(this.r * this.r + this.t * this.t);
      float var2 = (float)Math.atan(-this.s * 0.20000000298023224D) * 15.0F;
      if(var9 > 0.1F) {
         var9 = 0.1F;
      }

      if(!this.z || this.bb() <= 0) {
         var9 = 0.0F;
      }

      if(this.z || this.bb() <= 0) {
         var2 = 0.0F;
      }

      this.ax += (var9 - this.ax) * 0.4F;
      this.bG += (var2 - this.bG) * 0.8F;
   }

   public void b(int var1, int var2, int var3) {
      aan var4 = null;
      if(var2 >= 0) {
         var4 = new aan(var2, 1, var3);
      }

      if(var1 == 0) {
         this.ap.a[this.ap.c] = var4;
      } else {
         this.ap.b[var1 - 1] = var4;
      }

   }

   public void ab() {}

   public float I() {
      return 1.82F;
   }
}
