package mojang;

public class ajv extends yu {

   private yw a;
   private int f;


   public ajv(yw var1, io var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.a = var1;
   }

   public boolean a(aan var1) {
      return false;
   }

   public aan a(int var1) {
      if(this.c()) {
         this.f += Math.min(var1, this.b().a);
      }

      return super.a(var1);
   }

   public void b(aan var1) {
      this.c(var1);
      super.b(var1);
   }

   protected void a(aan var1, int var2) {
      this.f += var2;
      this.c(var1);
   }

   protected void c(aan var1) {
      var1.a(this.a.k, this.a, this.f);
      this.f = 0;
      if(var1.c == yr.o.bQ) {
         this.a.a((ajw)dp.k, 1);
      }

      if(var1.c == yr.aV.bQ) {
         this.a.a((ajw)dp.p, 1);
      }

   }
}
