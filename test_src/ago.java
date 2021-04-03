import java.util.Random;

public class ago extends pb {

   protected ago(int var1, int var2) {
      super(var1, acn.j);
      this.bN = var2;
      float var3 = 0.375F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
      this.a(true);
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(var1.i(var2, var3 + 1, var4)) {
         int var6;
         for(var6 = 1; var1.a(var2, var3 - var6, var4) == this.bO; ++var6) {
            ;
         }

         if(var6 < 3) {
            int var7 = var1.e(var2, var3, var4);
            if(var7 == 15) {
               var1.g(var2, var3 + 1, var4, this.bO);
               var1.f(var2, var3, var4, 0);
            } else {
               var1.f(var2, var3, var4, var7 + 1);
            }
         }
      }

   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      return var5 == this.bO?true:(var5 != pb.u.bO && var5 != pb.v.bO && var5 != pb.E.bO?false:(var1.f(var2 - 1, var3 - 1, var4) == acn.g?true:(var1.f(var2 + 1, var3 - 1, var4) == acn.g?true:(var1.f(var2, var3 - 1, var4 - 1) == acn.g?true:var1.f(var2, var3 - 1, var4 + 1) == acn.g))));
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      this.h(var1, var2, var3, var4);
   }

   protected final void h(xd var1, int var2, int var3, int var4) {
      if(!this.g(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public boolean g(xd var1, int var2, int var3, int var4) {
      return this.e(var1, var2, var3, var4);
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      return null;
   }

   public int a(int var1, Random var2, int var3) {
      return yr.aJ.bQ;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int d() {
      return 1;
   }
}
