package mojang;

import java.util.List;
import java.util.Random;

public class ka extends he {

   private final int a;
   private final boolean b;


   public ka(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.a = var4;
      this.g = var3;
      this.b = var3.c() > 3;
   }

   public static qg a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      qg var6 = new qg(var2, var3, var4, var2, var3 + 2, var4);
      if(var1.nextInt(4) == 0) {
         var6.e += 4;
      }

      switch(var5) {
      case 0:
         var6.a = var2 - 1;
         var6.d = var2 + 3;
         var6.f = var4 + 4;
         break;
      case 1:
         var6.a = var2 - 4;
         var6.c = var4 - 1;
         var6.f = var4 + 3;
         break;
      case 2:
         var6.a = var2 - 1;
         var6.d = var2 + 3;
         var6.c = var4 - 4;
         break;
      case 3:
         var6.d = var2 + 4;
         var6.c = var4 - 1;
         var6.f = var4 + 3;
      }

      return a(var0, var6) != null?null:var6;
   }

   public void a(he var1, List var2, Random var3) {
      int var4 = this.c();
      switch(this.a) {
      case 0:
         gp.a(var1, var2, var3, this.g.a + 1, this.g.b, this.g.f + 1, 0, var4);
         gp.a(var1, var2, var3, this.g.a - 1, this.g.b, this.g.c + 1, 1, var4);
         gp.a(var1, var2, var3, this.g.d + 1, this.g.b, this.g.c + 1, 3, var4);
         break;
      case 1:
         gp.a(var1, var2, var3, this.g.a + 1, this.g.b, this.g.c - 1, 2, var4);
         gp.a(var1, var2, var3, this.g.a + 1, this.g.b, this.g.f + 1, 0, var4);
         gp.a(var1, var2, var3, this.g.a - 1, this.g.b, this.g.c + 1, 1, var4);
         break;
      case 2:
         gp.a(var1, var2, var3, this.g.a + 1, this.g.b, this.g.c - 1, 2, var4);
         gp.a(var1, var2, var3, this.g.a - 1, this.g.b, this.g.c + 1, 1, var4);
         gp.a(var1, var2, var3, this.g.d + 1, this.g.b, this.g.c + 1, 3, var4);
         break;
      case 3:
         gp.a(var1, var2, var3, this.g.a + 1, this.g.b, this.g.c - 1, 2, var4);
         gp.a(var1, var2, var3, this.g.a + 1, this.g.b, this.g.f + 1, 0, var4);
         gp.a(var1, var2, var3, this.g.d + 1, this.g.b, this.g.c + 1, 3, var4);
      }

      if(this.b) {
         if(var3.nextBoolean()) {
            gp.a(var1, var2, var3, this.g.a + 1, this.g.b + 3 + 1, this.g.c - 1, 2, var4);
         }

         if(var3.nextBoolean()) {
            gp.a(var1, var2, var3, this.g.a - 1, this.g.b + 3 + 1, this.g.c + 1, 1, var4);
         }

         if(var3.nextBoolean()) {
            gp.a(var1, var2, var3, this.g.d + 1, this.g.b + 3 + 1, this.g.c + 1, 3, var4);
         }

         if(var3.nextBoolean()) {
            gp.a(var1, var2, var3, this.g.a + 1, this.g.b + 3 + 1, this.g.f + 1, 0, var4);
         }
      }

   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         if(this.b) {
            this.a(var1, var3, this.g.a + 1, this.g.b, this.g.c, this.g.d - 1, this.g.b + 3 - 1, this.g.f, 0, 0, false);
            this.a(var1, var3, this.g.a, this.g.b, this.g.c + 1, this.g.d, this.g.b + 3 - 1, this.g.f - 1, 0, 0, false);
            this.a(var1, var3, this.g.a + 1, this.g.e - 2, this.g.c, this.g.d - 1, this.g.e, this.g.f, 0, 0, false);
            this.a(var1, var3, this.g.a, this.g.e - 2, this.g.c + 1, this.g.d, this.g.e, this.g.f - 1, 0, 0, false);
            this.a(var1, var3, this.g.a + 1, this.g.b + 3, this.g.c + 1, this.g.d - 1, this.g.b + 3, this.g.f - 1, 0, 0, false);
         } else {
            this.a(var1, var3, this.g.a + 1, this.g.b, this.g.c, this.g.d - 1, this.g.e, this.g.f, 0, 0, false);
            this.a(var1, var3, this.g.a, this.g.b, this.g.c + 1, this.g.d, this.g.e, this.g.f - 1, 0, 0, false);
         }

         this.a(var1, var3, this.g.a + 1, this.g.b, this.g.c + 1, this.g.a + 1, this.g.e, this.g.c + 1, pb.x.bO, 0, false);
         this.a(var1, var3, this.g.a + 1, this.g.b, this.g.f - 1, this.g.a + 1, this.g.e, this.g.f - 1, pb.x.bO, 0, false);
         this.a(var1, var3, this.g.d - 1, this.g.b, this.g.c + 1, this.g.d - 1, this.g.e, this.g.c + 1, pb.x.bO, 0, false);
         this.a(var1, var3, this.g.d - 1, this.g.b, this.g.f - 1, this.g.d - 1, this.g.e, this.g.f - 1, pb.x.bO, 0, false);

         for(int var4 = this.g.a; var4 <= this.g.d; ++var4) {
            for(int var5 = this.g.c; var5 <= this.g.f; ++var5) {
               int var6 = this.a(var1, var4, this.g.b - 1, var5, var3);
               if(var6 == 0) {
                  this.a(var1, pb.x.bO, 0, var4, this.g.b - 1, var5, var3);
               }
            }
         }

         return true;
      }
   }
}
