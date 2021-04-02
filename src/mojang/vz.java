package mojang;

public class vz {

   private Mob a;
   private float b;
   private float c;
   private boolean d = false;
   private double e;
   private double f;
   private double g;


   public vz(Mob var1) {
      this.a = var1;
   }

   public void a(BaseEntity var1, float var2, float var3) {
      this.e = var1.o;
      if(var1 instanceof Mob) {
         this.f = var1.p + (double)((Mob)var1).I();
      } else {
         this.f = (var1.y.b + var1.y.e) / 2.0D;
      }

      this.g = var1.q;
      this.b = var2;
      this.c = var3;
      this.d = true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      this.e = var1;
      this.f = var3;
      this.g = var5;
      this.b = var7;
      this.c = var8;
      this.d = true;
   }

   public void a() {
      this.a.v = 0.0F;
      if(this.d) {
         this.d = false;
         double var1 = this.e - this.a.o;
         double var3 = this.f - (this.a.p + (double)this.a.I());
         double var5 = this.g - this.a.q;
         double var7 = (double) Utils.sqrt(var1 * var1 + var5 * var5);
         float var9 = (float)(Math.atan2(var5, var1) * 180.0D / 3.1415927410125732D) - 90.0F;
         float var10 = (float)(-(Math.atan2(var3, var7) * 180.0D / 3.1415927410125732D));
         this.a.v = this.a(this.a.v, var10, this.c);
         this.a.bf = this.a(this.a.bf, var9, this.b);
      } else {
         this.a.bf = this.a(this.a.bf, this.a.bd, 10.0F);
      }

      float var11;
      for(var11 = this.a.bf - this.a.bd; var11 < -180.0F; var11 += 360.0F) {
         ;
      }

      while(var11 >= 180.0F) {
         var11 -= 360.0F;
      }

      if(!this.a.aM().e()) {
         if(var11 < -75.0F) {
            this.a.bf = this.a.bd - 75.0F;
         }

         if(var11 > 75.0F) {
            this.a.bf = this.a.bd + 75.0F;
         }
      }

   }

   private float a(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
         ;
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }
}
