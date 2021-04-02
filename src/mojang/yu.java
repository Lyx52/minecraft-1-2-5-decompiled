package mojang;

public class yu {

   private final int a;
   public final io b;
   public int c;
   public int d;
   public int e;


   public yu(io var1, int var2, int var3, int var4) {
      this.b = var1;
      this.a = var2;
      this.d = var3;
      this.e = var4;
   }

   public void a(aan var1, aan var2) {
      if(var1 != null && var2 != null) {
         if(var1.c == var2.c) {
            int var3 = var2.a - var1.a;
            if(var3 > 0) {
               this.a(var1, var3);
            }

         }
      }
   }

   protected void a(aan var1, int var2) {}

   protected void c(aan var1) {}

   public void b(aan var1) {
      this.d();
   }

   public boolean a(aan var1) {
      return true;
   }

   public aan b() {
      return this.b.k_(this.a);
   }

   public boolean c() {
      return this.b() != null;
   }

   public void d(aan var1) {
      this.b.a(this.a, var1);
      this.d();
   }

   public void d() {
      this.b.j();
   }

   public int a() {
      return this.b.d();
   }

   public int e() {
      return -1;
   }

   public aan a(int var1) {
      return this.b.a(this.a, var1);
   }
}
