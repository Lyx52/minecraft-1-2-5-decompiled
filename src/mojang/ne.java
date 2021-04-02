package mojang;

public class ne {

   private int a = 20;
   private float b = 5.0F;
   private float c;
   private int d = 0;
   private int e = 20;


   public void a(int var1, float var2) {
      this.a = Math.min(var1 + this.a, 20);
      this.b = Math.min(this.b + (float)var1 * var2 * 2.0F, (float)this.a);
   }

   public void a(amm var1) {
      this.a(var1.q(), var1.r());
   }

   public void a(Player var1) {
      int var2 = var1.k.q;
      this.e = this.a;
      if(this.c > 4.0F) {
         this.c -= 4.0F;
         if(this.b > 0.0F) {
            this.b = Math.max(this.b - 1.0F, 0.0F);
         } else if(var2 > 0) {
            this.a = Math.max(this.a - 1, 0);
         }
      }

      if(this.a >= 18 && var1.aG()) {
         ++this.d;
         if(this.d >= 80) {
            var1.k(1);
            this.d = 0;
         }
      } else if(this.a <= 0) {
         ++this.d;
         if(this.d >= 80) {
            if(var1.bb() > 10 || var2 >= 3 || var1.bb() > 1 && var2 >= 2) {
               var1.a(md.g, 1);
            }

            this.d = 0;
         }
      } else {
         this.d = 0;
      }

   }

   public void a(CompundTag var1) {
      if(var1.containsKey("foodLevel")) {
         this.a = var1.getInt("foodLevel");
         this.d = var1.getInt("foodTickTimer");
         this.b = var1.getFloat("foodSaturationLevel");
         this.c = var1.getFloat("foodExhaustionLevel");
      }

   }

   public void b(CompundTag var1) {
      var1.addInt("foodLevel", this.a);
      var1.addInt("foodTickTimer", this.d);
      var1.addFloat("foodSaturationLevel", this.b);
      var1.addFloat("foodExhaustionLevel", this.c);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.e;
   }

   public boolean c() {
      return this.a < 20;
   }

   public void a(float var1) {
      this.c = Math.min(this.c + var1, 40.0F);
   }

   public float d() {
      return this.b;
   }

   public void a(int var1) {
      this.a = var1;
   }

   public void b(float var1) {
      this.b = var1;
   }
}
