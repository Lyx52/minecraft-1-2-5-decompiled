import java.util.Random;

public class aea extends agv {

   protected aea(int var1, acn var2) {
      super(var1, var2);
      this.a(false);
      if(var2 == acn.h) {
         this.a(true);
      }

   }

   public boolean b(ali var1, int var2, int var3, int var4) {
      return this.cd != acn.h;
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.a(var2, var3, var4) == this.bO) {
         this.j(var1, var2, var3, var4);
      }

   }

   private void j(xd var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      var1.o = true;
      var1.b(var2, var3, var4, this.bO - 1, var5);
      var1.c(var2, var3, var4, var2, var3, var4);
      var1.a(var2, var3, var4, this.bO - 1, this.e());
      var1.o = false;
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(this.cd == acn.h) {
         int var6 = var5.nextInt(3);

         int var7;
         int var8;
         for(var7 = 0; var7 < var6; ++var7) {
            var2 += var5.nextInt(3) - 1;
            ++var3;
            var4 += var5.nextInt(3) - 1;
            var8 = var1.a(var2, var3, var4);
            if(var8 == 0) {
               if(this.k(var1, var2 - 1, var3, var4) || this.k(var1, var2 + 1, var3, var4) || this.k(var1, var2, var3, var4 - 1) || this.k(var1, var2, var3, var4 + 1) || this.k(var1, var2, var3 - 1, var4) || this.k(var1, var2, var3 + 1, var4)) {
                  var1.g(var2, var3, var4, pb.ar.bO);
                  return;
               }
            } else if(pb.m[var8].cd.c()) {
               return;
            }
         }

         if(var6 == 0) {
            var7 = var2;
            var8 = var4;

            for(int var9 = 0; var9 < 3; ++var9) {
               var2 = var7 + var5.nextInt(3) - 1;
               var4 = var8 + var5.nextInt(3) - 1;
               if(var1.i(var2, var3 + 1, var4) && this.k(var1, var2, var3, var4)) {
                  var1.g(var2, var3 + 1, var4, pb.ar.bO);
               }
            }
         }
      }

   }

   private boolean k(xd var1, int var2, int var3, int var4) {
      return var1.f(var2, var3, var4).g();
   }
}
