
public class acs extends yr {

   private int a;


   public acs(int var1, pb var2) {
      super(var1);
      this.a = var2.bO;
   }

   public boolean a(aan var1, yw var2, xd var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      if(var8 == pb.aS.bO) {
         var7 = 1;
      } else if(var8 != pb.bu.bO && var8 != pb.X.bO && var8 != pb.Y.bO) {
         if(var7 == 0) {
            --var5;
         }

         if(var7 == 1) {
            ++var5;
         }

         if(var7 == 2) {
            --var6;
         }

         if(var7 == 3) {
            ++var6;
         }

         if(var7 == 4) {
            --var4;
         }

         if(var7 == 5) {
            ++var4;
         }
      }

      if(!var2.e(var4, var5, var6)) {
         return false;
      } else if(var1.a == 0) {
         return false;
      } else {
         if(var3.a(this.a, var4, var5, var6, false, var7)) {
            pb var9 = pb.m[this.a];
            if(var3.g(var4, var5, var6, this.a)) {
               if(var3.a(var4, var5, var6) == this.a) {
                  pb.m[this.a].c(var3, var4, var5, var6, var7);
                  pb.m[this.a].a(var3, var4, var5, var6, (acq)var2);
               }

               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var9.cb.d(), (var9.cb.b() + 1.0F) / 2.0F, var9.cb.c() * 0.8F);
               --var1.a;
            }
         }

         return true;
      }
   }
}
