package mojang;

public class amm extends yr {

   public final int a;
   private final int b;
   private final float c;
   private final boolean bV;
   private boolean bW;
   private int bX;
   private int bY;
   private int bZ;
   private float ca;


   public amm(int var1, int var2, float var3, boolean var4) {
      super(var1);
      this.a = 32;
      this.b = var2;
      this.bV = var4;
      this.c = var3;
   }

   public amm(int var1, int var2, boolean var3) {
      this(var1, var2, 0.6F, var3);
   }

   public aan b(aan var1, xd var2, yw var3) {
      --var1.a;
      var3.aF().a(this);
      var2.a(var3, "random.burp", 0.5F, var2.r.nextFloat() * 0.1F + 0.9F);
      if(!var2.F && this.bX > 0 && var2.r.nextFloat() < this.ca) {
         var3.b(new alg(this.bX, this.bY * 20, this.bZ));
      }

      return var1;
   }

   public int b(aan var1) {
      return 32;
   }

   public aaq c(aan var1) {
      return aaq.b;
   }

   public aan a(aan var1, xd var2, yw var3) {
      if(var3.a(this.bW)) {
         var3.c(var1, this.b(var1));
      }

      return var1;
   }

   public int q() {
      return this.b;
   }

   public float r() {
      return this.c;
   }

   public boolean s() {
      return this.bV;
   }

   public amm a(int var1, int var2, int var3, float var4) {
      this.bX = var1;
      this.bY = var2;
      this.bZ = var3;
      this.ca = var4;
      return this;
   }

   public amm t() {
      this.bW = true;
      return this;
   }

   public yr a(String var1) {
      return super.a(var1);
   }
}
