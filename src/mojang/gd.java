package mojang;

import java.util.List;
import java.util.Random;

public class gd extends fh {

   private final boolean a;
   private final mg b;


   public gd(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.a = true;
      this.h = var2.nextInt(4);
      this.b = mg.a;
      switch(this.h) {
      case 0:
      case 2:
         this.g = new qg(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
         break;
      default:
         this.g = new qg(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
      }

   }

   public gd(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.a = false;
      this.h = var4;
      this.b = this.a(var2);
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {
      if(this.a) {
         abb.a(ajs.class);
      }

      this.a((s)var1, var2, var3, 1, 1);
   }

   public static gd a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      return a(var7) && a(var0, var7) == null?new gd(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         if(this.a) {
            ;
         }

         this.a(var1, var3, 0, 0, 0, 4, 10, 4, true, var2, abb.b());
         this.a(var1, var2, var3, this.b, 1, 7, 0);
         this.a(var1, var2, var3, mg.a, 1, 1, 4);
         this.a(var1, pb.bm.bO, 0, 2, 6, 1, var3);
         this.a(var1, pb.bm.bO, 0, 1, 5, 1, var3);
         this.a(var1, pb.ak.bO, 0, 1, 6, 1, var3);
         this.a(var1, pb.bm.bO, 0, 1, 5, 2, var3);
         this.a(var1, pb.bm.bO, 0, 1, 4, 3, var3);
         this.a(var1, pb.ak.bO, 0, 1, 5, 3, var3);
         this.a(var1, pb.bm.bO, 0, 2, 4, 3, var3);
         this.a(var1, pb.bm.bO, 0, 3, 3, 3, var3);
         this.a(var1, pb.ak.bO, 0, 3, 4, 3, var3);
         this.a(var1, pb.bm.bO, 0, 3, 3, 2, var3);
         this.a(var1, pb.bm.bO, 0, 3, 2, 1, var3);
         this.a(var1, pb.ak.bO, 0, 3, 3, 1, var3);
         this.a(var1, pb.bm.bO, 0, 2, 2, 1, var3);
         this.a(var1, pb.bm.bO, 0, 1, 1, 1, var3);
         this.a(var1, pb.ak.bO, 0, 1, 2, 1, var3);
         this.a(var1, pb.bm.bO, 0, 1, 1, 2, var3);
         this.a(var1, pb.ak.bO, 0, 1, 1, 3, var3);
         return true;
      }
   }
}
