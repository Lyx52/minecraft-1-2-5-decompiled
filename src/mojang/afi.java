package mojang;

import java.util.List;
import java.util.Random;

public class afi extends aih {

   private final boolean a = true;
   private int b = -1;


   public afi(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.h = var2.nextInt(4);
      switch(this.h) {
      case 0:
      case 2:
         this.g = new qg(var3, 64, var4, var3 + 6 - 1, 78, var4 + 6 - 1);
         break;
      default:
         this.g = new qg(var3, 64, var4, var3 + 6 - 1, 78, var4 + 6 - 1);
      }

   }

   public void a(he var1, List var2, Random var3) {
      rz.b((g)var1, var2, var3, this.g.a - 1, this.g.e - 4, this.g.c + 1, 1, this.c());
      rz.b((g)var1, var2, var3, this.g.d + 1, this.g.e - 4, this.g.c + 1, 3, this.c());
      rz.b((g)var1, var2, var3, this.g.a + 1, this.g.e - 4, this.g.c - 1, 2, this.c());
      rz.b((g)var1, var2, var3, this.g.a + 1, this.g.e - 4, this.g.f + 1, 0, this.c());
   }

   public boolean a(World var1, Random var2, qg var3) {
      if(this.b < 0) {
         this.b = this.b(var1, var3);
         if(this.b < 0) {
            return true;
         }

         this.g.a(0, this.b - this.g.e + 3, 0);
      }

      if(this.a) {
         ;
      }

      this.a(var1, var3, 1, 0, 1, 4, 12, 4, pb.w.bO, pb.A.bO, false);
      this.a(var1, 0, 0, 2, 12, 2, var3);
      this.a(var1, 0, 0, 3, 12, 2, var3);
      this.a(var1, 0, 0, 2, 12, 3, var3);
      this.a(var1, 0, 0, 3, 12, 3, var3);
      this.a(var1, pb.aZ.bO, 0, 1, 13, 1, var3);
      this.a(var1, pb.aZ.bO, 0, 1, 14, 1, var3);
      this.a(var1, pb.aZ.bO, 0, 4, 13, 1, var3);
      this.a(var1, pb.aZ.bO, 0, 4, 14, 1, var3);
      this.a(var1, pb.aZ.bO, 0, 1, 13, 4, var3);
      this.a(var1, pb.aZ.bO, 0, 1, 14, 4, var3);
      this.a(var1, pb.aZ.bO, 0, 4, 13, 4, var3);
      this.a(var1, pb.aZ.bO, 0, 4, 14, 4, var3);
      this.a(var1, var3, 1, 15, 1, 4, 15, 4, pb.w.bO, pb.w.bO, false);

      for(int var4 = 0; var4 <= 5; ++var4) {
         for(int var5 = 0; var5 <= 5; ++var5) {
            if(var5 == 0 || var5 == 5 || var4 == 0 || var4 == 5) {
               this.a(var1, pb.F.bO, 0, var5, 11, var4, var3);
               this.b(var1, var5, 12, var4, var3);
            }
         }
      }

      return true;
   }
}
