package mojang;

public class te extends ho {

   public qp a;
   public qp b;
   public qp c;
   public qp d;
   public qp e;
   public qp f;


   public te() {
      this(0.0F);
   }

   public te(float var1) {
      this(var1, -7.0F);
   }

   public te(float var1, float var2) {
      short var3 = 128;
      short var4 = 128;
      this.a = (new qp(this)).b(var3, var4);
      this.a.a(0.0F, 0.0F + var2, -2.0F);
      this.a.a(0, 0).a(-4.0F, -12.0F, -5.5F, 8, 10, 8, var1);
      this.a.a(24, 0).a(-1.0F, -5.0F, -7.5F, 2, 4, 2, var1);
      this.b = (new qp(this)).b(var3, var4);
      this.b.a(0.0F, 0.0F + var2, 0.0F);
      this.b.a(0, 40).a(-9.0F, -2.0F, -6.0F, 18, 12, 11, var1);
      this.b.a(0, 70).a(-4.5F, 10.0F, -3.0F, 9, 5, 6, var1 + 0.5F);
      this.c = (new qp(this)).b(var3, var4);
      this.c.a(0.0F, -7.0F, 0.0F);
      this.c.a(60, 21).a(-13.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.d = (new qp(this)).b(var3, var4);
      this.d.a(0.0F, -7.0F, 0.0F);
      this.d.a(60, 58).a(9.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.e = (new qp(this, 0, 22)).b(var3, var4);
      this.e.a(-4.0F, 18.0F + var2, 0.0F);
      this.e.a(37, 0).a(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
      this.f = (new qp(this, 0, 22)).b(var3, var4);
      this.f.i = true;
      this.f.a(60, 0).a(5.0F, 18.0F + var2, 0.0F);
      this.f.a(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
   }

   public void a(nn var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7);
      this.a.a(var7);
      this.b.a(var7);
      this.e.a(var7);
      this.f.a(var7);
      this.c.a(var7);
      this.d.a(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a.g = var4 / 57.295776F;
      this.a.f = var5 / 57.295776F;
      this.e.f = -1.5F * this.a(var1, 13.0F) * var2;
      this.f.f = 1.5F * this.a(var1, 13.0F) * var2;
      this.e.g = 0.0F;
      this.f.g = 0.0F;
   }

   public void a(acq var1, float var2, float var3, float var4) {
      tl var5 = (tl)var1;
      int var6 = var5.ab();
      if(var6 > 0) {
         this.c.f = -2.0F + 1.5F * this.a((float)var6 - var4, 10.0F);
         this.d.f = -2.0F + 1.5F * this.a((float)var6 - var4, 10.0F);
      } else {
         int var7 = var5.E_();
         if(var7 > 0) {
            this.c.f = -0.8F + 0.025F * this.a((float)var7, 70.0F);
            this.d.f = 0.0F;
         } else {
            this.c.f = (-0.2F + 1.5F * this.a(var2, 13.0F)) * var3;
            this.d.f = (-0.2F - 1.5F * this.a(var2, 13.0F)) * var3;
         }
      }

   }

   private float a(float var1, float var2) {
      return (Math.abs(var1 % var2 - var2 * 0.5F) - var2 * 0.25F) / (var2 * 0.25F);
   }
}
