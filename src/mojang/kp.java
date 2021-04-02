package mojang;

import java.util.List;
import java.util.Random;

public class kp extends fh {

   private final mg a;
   private final boolean b;
   private final boolean c;


   public kp(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.a = this.a(var2);
      this.g = var3;
      this.b = var2.nextInt(2) == 0;
      this.c = var2.nextInt(2) == 0;
   }

   public void a(he var1, List var2, Random var3) {
      this.a((s)var1, var2, var3, 1, 1);
      if(this.b) {
         this.b((s)var1, var2, var3, 1, 2);
      }

      if(this.c) {
         this.c((s)var1, var2, var3, 1, 2);
      }

   }

   public static kp a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return a(var7) && a(var0, var7) == null?new kp(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, abb.b());
         this.a(var1, var2, var3, this.a, 1, 1, 0);
         this.a(var1, var2, var3, mg.a, 1, 1, 6);
         this.a(var1, var3, var2, 0.1F, 1, 2, 1, pb.aq.bO, 0);
         this.a(var1, var3, var2, 0.1F, 3, 2, 1, pb.aq.bO, 0);
         this.a(var1, var3, var2, 0.1F, 1, 2, 5, pb.aq.bO, 0);
         this.a(var1, var3, var2, 0.1F, 3, 2, 5, pb.aq.bO, 0);
         if(this.b) {
            this.a(var1, var3, 0, 1, 2, 0, 3, 4, 0, 0, false);
         }

         if(this.c) {
            this.a(var1, var3, 4, 1, 2, 4, 3, 4, 0, 0, false);
         }

         return true;
      }
   }
}
