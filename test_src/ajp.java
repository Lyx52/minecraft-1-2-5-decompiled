import java.util.Random;

public class ajp extends pb {

   protected ajp(int var1) {
      super(var1, acn.c);
      this.bN = 87;
      this.a(true);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.f(255);
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      return wu.b((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 0), (double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1));
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int a(int var1, int var2) {
      return var1 == 1 && var2 > 0?this.bN - 1:(var1 == 1?this.bN:2);
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(!this.i(var1, var2, var3, var4) && !var1.y(var2, var3 + 1, var4)) {
         int var6 = var1.e(var2, var3, var4);
         if(var6 > 0) {
            var1.f(var2, var3, var4, var6 - 1);
         } else if(!this.h(var1, var2, var3, var4)) {
            var1.g(var2, var3, var4, pb.v.bO);
         }
      } else {
         var1.f(var2, var3, var4, 7);
      }

   }

   public void a(xd var1, int var2, int var3, int var4, nn var5, float var6) {
      if(var1.r.nextFloat() < var6 - 0.5F) {
         var1.g(var2, var3, var4, pb.v.bO);
      }

   }

   private boolean h(xd var1, int var2, int var3, int var4) {
      byte var5 = 0;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var4 - var5; var7 <= var4 + var5; ++var7) {
            int var8 = var1.a(var6, var3 + 1, var7);
            if(var8 == pb.az.bO || var8 == pb.bt.bO || var8 == pb.bs.bO) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean i(xd var1, int var2, int var3, int var4) {
      for(int var5 = var2 - 4; var5 <= var2 + 4; ++var5) {
         for(int var6 = var3; var6 <= var3 + 1; ++var6) {
            for(int var7 = var4 - 4; var7 <= var4 + 4; ++var7) {
               if(var1.f(var5, var6, var7) == acn.g) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      acn var6 = var1.f(var2, var3 + 1, var4);
      if(var6.a()) {
         var1.g(var2, var3, var4, pb.v.bO);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return pb.v.a(0, var2, var3);
   }
}
