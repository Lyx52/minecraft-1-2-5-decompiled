
public class da extends yr {

   private pb[] c;
   protected float a = 4.0F;
   private int bV;
   protected uk b;


   protected da(int var1, int var2, uk var3, pb[] var4) {
      super(var1);
      this.b = var3;
      this.c = var4;
      this.bR = 1;
      this.g(var3.a());
      this.a = var3.b();
      this.bV = var2 + var3.c();
   }

   public float a(aan var1, pb var2) {
      for(int var3 = 0; var3 < this.c.length; ++var3) {
         if(this.c[var3] == var2) {
            return this.a;
         }
      }

      return 1.0F;
   }

   public boolean a(aan var1, acq var2, acq var3) {
      var1.a(2, var3);
      return true;
   }

   public boolean a(aan var1, int var2, int var3, int var4, int var5, acq var6) {
      var1.a(1, var6);
      return true;
   }

   public int a(nn var1) {
      return this.bV;
   }

   public boolean a() {
      return true;
   }

   public int b() {
      return this.b.e();
   }
}
