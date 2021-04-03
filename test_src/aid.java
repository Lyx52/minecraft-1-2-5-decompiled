import java.util.List;

public class aid extends yr {

   public final String a;


   protected aid(int var1, String var2) {
      super(var1);
      this.a = var2;
      this.bR = 1;
   }

   public boolean a(aan var1, yw var2, xd var3, int var4, int var5, int var6, int var7) {
      if(var3.a(var4, var5, var6) == pb.aY.bO && var3.e(var4, var5, var6) == 0) {
         if(var3.F) {
            return true;
         } else {
            ((xl)pb.aY).f(var3, var4, var5, var6, this.bQ);
            var3.a((yw)null, 1005, var4, var5, var6, this.bQ);
            --var1.a;
            return true;
         }
      } else {
         return false;
      }
   }

   public void a(aan var1, List var2) {
      var2.add("C418 - " + this.a);
   }

   public fo f(aan var1) {
      return fo.c;
   }
}
