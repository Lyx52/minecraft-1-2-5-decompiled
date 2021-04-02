package mojang;

import java.util.Random;

public class ir extends pb {

   private final boolean a;


   public ir(int var1, boolean var2) {
      super(var1, 211, acn.r);
      this.a = var2;
      if(var2) {
         this.a(1.0F);
         ++this.bN;
      }

   }

   public void a(xd var1, int var2, int var3, int var4) {
      if(!var1.F) {
         if(this.a && !var1.x(var2, var3, var4)) {
            var1.a(var2, var3, var4, this.bO, 4);
         } else if(!this.a && var1.x(var2, var3, var4)) {
            var1.g(var2, var3, var4, bM.bO);
         }
      }

   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      if(!var1.F) {
         if(this.a && !var1.x(var2, var3, var4)) {
            var1.a(var2, var3, var4, this.bO, 4);
         } else if(!this.a && var1.x(var2, var3, var4)) {
            var1.g(var2, var3, var4, bM.bO);
         }
      }

   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      if(!var1.F && this.a && !var1.x(var2, var3, var4)) {
         var1.g(var2, var3, var4, bL.bO);
      }

   }

   public int a(int var1, Random var2, int var3) {
      return bL.bO;
   }
}
