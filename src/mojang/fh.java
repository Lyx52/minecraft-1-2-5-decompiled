package mojang;

import java.util.List;
import java.util.Random;

abstract class fh extends he {

   protected fh(int var1) {
      super(var1);
   }

   protected void a(World var1, Random var2, qg var3, mg var4, int var5, int var6, int var7) {
      switch(aq.a[var4.ordinal()]) {
      case 1:
      default:
         this.a(var1, var3, var5, var6, var7, var5 + 3 - 1, var6 + 3 - 1, var7, 0, 0, false);
         break;
      case 2:
         this.a(var1, pb.bm.bO, 0, var5, var6, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5, var6 + 1, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5, var6 + 2, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5 + 1, var6 + 2, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5 + 2, var6 + 2, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5 + 2, var6 + 1, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5 + 2, var6, var7, var3);
         this.a(var1, pb.aE.bO, 0, var5 + 1, var6, var7, var3);
         this.a(var1, pb.aE.bO, 8, var5 + 1, var6 + 1, var7, var3);
         break;
      case 3:
         this.a(var1, 0, 0, var5 + 1, var6, var7, var3);
         this.a(var1, 0, 0, var5 + 1, var6 + 1, var7, var3);
         this.a(var1, pb.bp.bO, 0, var5, var6, var7, var3);
         this.a(var1, pb.bp.bO, 0, var5, var6 + 1, var7, var3);
         this.a(var1, pb.bp.bO, 0, var5, var6 + 2, var7, var3);
         this.a(var1, pb.bp.bO, 0, var5 + 1, var6 + 2, var7, var3);
         this.a(var1, pb.bp.bO, 0, var5 + 2, var6 + 2, var7, var3);
         this.a(var1, pb.bp.bO, 0, var5 + 2, var6 + 1, var7, var3);
         this.a(var1, pb.bp.bO, 0, var5 + 2, var6, var7, var3);
         break;
      case 4:
         this.a(var1, pb.bm.bO, 0, var5, var6, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5, var6 + 1, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5, var6 + 2, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5 + 1, var6 + 2, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5 + 2, var6 + 2, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5 + 2, var6 + 1, var7, var3);
         this.a(var1, pb.bm.bO, 0, var5 + 2, var6, var7, var3);
         this.a(var1, pb.aL.bO, 0, var5 + 1, var6, var7, var3);
         this.a(var1, pb.aL.bO, 8, var5 + 1, var6 + 1, var7, var3);
         this.a(var1, pb.aR.bO, this.c(pb.aR.bO, 4), var5 + 2, var6 + 1, var7 + 1, var3);
         this.a(var1, pb.aR.bO, this.c(pb.aR.bO, 3), var5 + 2, var6 + 1, var7 - 1, var3);
      }

   }

   protected mg a(Random var1) {
      int var2 = var1.nextInt(5);
      switch(var2) {
      case 0:
      case 1:
      default:
         return mg.a;
      case 2:
         return mg.b;
      case 3:
         return mg.c;
      case 4:
         return mg.d;
      }
   }

   protected he a(s var1, List var2, Random var3, int var4, int var5) {
      switch(this.h) {
      case 0:
         return abb.a(var1, var2, var3, this.g.a + var4, this.g.b + var5, this.g.f + 1, this.h, this.c());
      case 1:
         return abb.a(var1, var2, var3, this.g.a - 1, this.g.b + var5, this.g.c + var4, this.h, this.c());
      case 2:
         return abb.a(var1, var2, var3, this.g.a + var4, this.g.b + var5, this.g.c - 1, this.h, this.c());
      case 3:
         return abb.a(var1, var2, var3, this.g.d + 1, this.g.b + var5, this.g.c + var4, this.h, this.c());
      default:
         return null;
      }
   }

   protected he b(s var1, List var2, Random var3, int var4, int var5) {
      switch(this.h) {
      case 0:
         return abb.a(var1, var2, var3, this.g.a - 1, this.g.b + var4, this.g.c + var5, 1, this.c());
      case 1:
         return abb.a(var1, var2, var3, this.g.a + var5, this.g.b + var4, this.g.c - 1, 2, this.c());
      case 2:
         return abb.a(var1, var2, var3, this.g.a - 1, this.g.b + var4, this.g.c + var5, 1, this.c());
      case 3:
         return abb.a(var1, var2, var3, this.g.a + var5, this.g.b + var4, this.g.c - 1, 2, this.c());
      default:
         return null;
      }
   }

   protected he c(s var1, List var2, Random var3, int var4, int var5) {
      switch(this.h) {
      case 0:
         return abb.a(var1, var2, var3, this.g.d + 1, this.g.b + var4, this.g.c + var5, 3, this.c());
      case 1:
         return abb.a(var1, var2, var3, this.g.a + var5, this.g.b + var4, this.g.f + 1, 0, this.c());
      case 2:
         return abb.a(var1, var2, var3, this.g.d + 1, this.g.b + var4, this.g.c + var5, 3, this.c());
      case 3:
         return abb.a(var1, var2, var3, this.g.a + var5, this.g.b + var4, this.g.f + 1, 0, this.c());
      default:
         return null;
      }
   }

   protected static boolean a(qg var0) {
      return var0 != null && var0.b > 10;
   }
}
