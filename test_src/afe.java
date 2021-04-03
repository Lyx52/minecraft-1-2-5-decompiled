import java.util.List;
import java.util.Random;

public class afe extends aez {

   public afe(int var1, int var2) {
      super(var1, var2, true);
      this.a(true);
   }

   public int e() {
      return 20;
   }

   public boolean g() {
      return true;
   }

   public void a(xd var1, int var2, int var3, int var4, nn var5) {
      if(!var1.F) {
         int var6 = var1.e(var2, var3, var4);
         if((var6 & 8) == 0) {
            this.f(var1, var2, var3, var4, var6);
         }
      }
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(!var1.F) {
         int var6 = var1.e(var2, var3, var4);
         if((var6 & 8) != 0) {
            this.f(var1, var2, var3, var4, var6);
         }
      }
   }

   public boolean b(ali var1, int var2, int var3, int var4, int var5) {
      return (var1.e(var2, var3, var4) & 8) != 0;
   }

   public boolean e(xd var1, int var2, int var3, int var4, int var5) {
      return (var1.e(var2, var3, var4) & 8) == 0?false:var5 == 1;
   }

   private void f(xd var1, int var2, int var3, int var4, int var5) {
      boolean var6 = (var5 & 8) != 0;
      boolean var7 = false;
      float var8 = 0.125F;
      List var9 = var1.a(ama.class, wu.b((double)((float)var2 + var8), (double)var3, (double)((float)var4 + var8), (double)((float)(var2 + 1) - var8), (double)((float)(var3 + 1) - var8), (double)((float)(var4 + 1) - var8)));
      if(var9.size() > 0) {
         var7 = true;
      }

      if(var7 && !var6) {
         var1.f(var2, var3, var4, var5 | 8);
         var1.j(var2, var3, var4, this.bO);
         var1.j(var2, var3 - 1, var4, this.bO);
         var1.c(var2, var3, var4, var2, var3, var4);
      }

      if(!var7 && var6) {
         var1.f(var2, var3, var4, var5 & 7);
         var1.j(var2, var3, var4, this.bO);
         var1.j(var2, var3 - 1, var4, this.bO);
         var1.c(var2, var3, var4, var2, var3, var4);
      }

      if(var7) {
         var1.a(var2, var3, var4, this.bO, this.e());
      }

   }
}
