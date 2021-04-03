import java.util.Random;

public class lw extends li {

   private int a;


   public lw(int var1) {
      this.a = var1;
   }

   public boolean a(xd var1, Random var2, int var3, int var4, int var5) {
      if(var1.a(var3, var4 + 1, var5) != pb.bb.bO) {
         return false;
      } else if(var1.a(var3, var4, var5) != 0 && var1.a(var3, var4, var5) != pb.bb.bO) {
         return false;
      } else {
         int var6 = 0;
         if(var1.a(var3 - 1, var4, var5) == pb.bb.bO) {
            ++var6;
         }

         if(var1.a(var3 + 1, var4, var5) == pb.bb.bO) {
            ++var6;
         }

         if(var1.a(var3, var4, var5 - 1) == pb.bb.bO) {
            ++var6;
         }

         if(var1.a(var3, var4, var5 + 1) == pb.bb.bO) {
            ++var6;
         }

         if(var1.a(var3, var4 - 1, var5) == pb.bb.bO) {
            ++var6;
         }

         int var7 = 0;
         if(var1.i(var3 - 1, var4, var5)) {
            ++var7;
         }

         if(var1.i(var3 + 1, var4, var5)) {
            ++var7;
         }

         if(var1.i(var3, var4, var5 - 1)) {
            ++var7;
         }

         if(var1.i(var3, var4, var5 + 1)) {
            ++var7;
         }

         if(var1.i(var3, var4 - 1, var5)) {
            ++var7;
         }

         if(var6 == 4 && var7 == 1) {
            var1.g(var3, var4, var5, this.a);
            var1.a = true;
            pb.m[this.a].a(var1, var3, var4, var5, var2);
            var1.a = false;
         }

         return true;
      }
   }
}
