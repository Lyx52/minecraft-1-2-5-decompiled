package mojang;

import java.util.Random;

public abstract class li {

   private final boolean a;


   public li() {
      this.a = false;
   }

   public li(boolean var1) {
      this.a = var1;
   }

   public abstract boolean a(World var1, Random var2, int var3, int var4, int var5);

   public void a(double var1, double var3, double var5) {}

   protected void a(World var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, 0);
   }

   protected void a(World var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.a) {
         var1.d(var2, var3, var4, var5, var6);
      } else if(var1.j(var2, var3, var4) && var1.c(var2, var4).o) {
         if(var1.b(var2, var3, var4, var5, var6)) {
            var1.k(var2, var3, var4);
         }
      } else {
         var1.b(var2, var3, var4, var5, var6);
      }

   }
}
