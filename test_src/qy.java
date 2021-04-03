import java.util.Random;

public class qy extends pb {

   protected qy(int var1) {
      super(var1, acn.b);
      this.bN = 3;
      this.a(true);
   }

   public int a(int var1, int var2) {
      return var1 == 1?0:(var1 == 0?2:3);
   }

   public int d(ali var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return 0;
      } else if(var5 == 0) {
         return 2;
      } else {
         acn var6 = var1.f(var2, var3 + 1, var4);
         return var6 != acn.v && var6 != acn.w?3:68;
      }
   }

   public int i() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return zv.a(var1, var3);
   }

   public int d(int var1) {
      return this.i();
   }

   public int c(ali var1, int var2, int var3, int var4) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(int var8 = -1; var8 <= 1; ++var8) {
         for(int var9 = -1; var9 <= 1; ++var9) {
            int var10 = var1.a(var2 + var9, var4 + var8).k();
            var5 += (var10 & 16711680) >> 16;
            var6 += (var10 & '\uff00') >> 8;
            var7 += var10 & 255;
         }
      }

      return (var5 / 9 & 255) << 16 | (var6 / 9 & 255) << 8 | var7 / 9 & 255;
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(!var1.F) {
         if(var1.o(var2, var3 + 1, var4) < 4 && pb.o[var1.a(var2, var3 + 1, var4)] > 2) {
            var1.g(var2, var3, var4, pb.v.bO);
         } else if(var1.o(var2, var3 + 1, var4) >= 9) {
            for(int var6 = 0; var6 < 4; ++var6) {
               int var7 = var2 + var5.nextInt(3) - 1;
               int var8 = var3 + var5.nextInt(5) - 3;
               int var9 = var4 + var5.nextInt(3) - 1;
               int var10 = var1.a(var7, var8 + 1, var9);
               if(var1.a(var7, var8, var9) == pb.v.bO && var1.o(var7, var8 + 1, var9) >= 4 && pb.o[var10] <= 2) {
                  var1.g(var7, var8, var9, pb.u.bO);
               }
            }
         }

      }
   }

   public int a(int var1, Random var2, int var3) {
      return pb.v.a(0, var2, var3);
   }
}
