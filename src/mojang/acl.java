package mojang;

import java.util.List;
import java.util.Random;

public class acl extends fh {

   private boolean a;


   public acl(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
   }

   public void a(he var1, List var2, Random var3) {
      if(var1 != null) {
         ((s)var1).b = this;
      }

   }

   public static acl a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -4, -1, 0, 11, 8, 16, var5);
      return a(var7) && a(var0, var7) == null?new acl(var6, var1, var7, var5):null;
   }

   public boolean a(World var1, Random var2, qg var3) {
      this.a(var1, var3, 0, 0, 0, 10, 7, 15, false, var2, abb.b());
      this.a(var1, var2, var3, mg.c, 4, 1, 0);
      byte var4 = 6;
      this.a(var1, var3, 1, var4, 1, 1, var4, 14, false, var2, abb.b());
      this.a(var1, var3, 9, var4, 1, 9, var4, 14, false, var2, abb.b());
      this.a(var1, var3, 2, var4, 1, 8, var4, 2, false, var2, abb.b());
      this.a(var1, var3, 2, var4, 14, 8, var4, 14, false, var2, abb.b());
      this.a(var1, var3, 1, 1, 1, 2, 1, 4, false, var2, abb.b());
      this.a(var1, var3, 8, 1, 1, 9, 1, 4, false, var2, abb.b());
      this.a(var1, var3, 1, 1, 1, 1, 1, 3, pb.C.bO, pb.C.bO, false);
      this.a(var1, var3, 9, 1, 1, 9, 1, 3, pb.C.bO, pb.C.bO, false);
      this.a(var1, var3, 3, 1, 8, 7, 1, 12, false, var2, abb.b());
      this.a(var1, var3, 4, 1, 9, 6, 1, 11, pb.C.bO, pb.C.bO, false);

      int var5;
      for(var5 = 3; var5 < 14; var5 += 2) {
         this.a(var1, var3, 0, 3, var5, 0, 4, var5, pb.bp.bO, pb.bp.bO, false);
         this.a(var1, var3, 10, 3, var5, 10, 4, var5, pb.bp.bO, pb.bp.bO, false);
      }

      for(var5 = 2; var5 < 9; var5 += 2) {
         this.a(var1, var3, var5, 3, 15, var5, 4, 15, pb.bp.bO, pb.bp.bO, false);
      }

      var5 = this.c(pb.bx.bO, 3);
      this.a(var1, var3, 4, 1, 5, 6, 1, 7, false, var2, abb.b());
      this.a(var1, var3, 4, 2, 6, 6, 2, 7, false, var2, abb.b());
      this.a(var1, var3, 4, 3, 7, 6, 3, 7, false, var2, abb.b());

      for(int var6 = 4; var6 <= 6; ++var6) {
         this.a(var1, pb.bx.bO, var5, var6, 1, 4, var3);
         this.a(var1, pb.bx.bO, var5, var6, 2, 5, var3);
         this.a(var1, pb.bx.bO, var5, var6, 3, 6, var3);
      }

      byte var14 = 2;
      byte var7 = 0;
      byte var8 = 3;
      byte var9 = 1;
      switch(this.h) {
      case 0:
         var14 = 0;
         var7 = 2;
         break;
      case 1:
         var14 = 1;
         var7 = 3;
         var8 = 0;
         var9 = 2;
      case 2:
      default:
         break;
      case 3:
         var14 = 3;
         var7 = 1;
         var8 = 0;
         var9 = 2;
      }

      this.a(var1, pb.bI.bO, var14 + (var2.nextFloat() > 0.9F?4:0), 4, 3, 8, var3);
      this.a(var1, pb.bI.bO, var14 + (var2.nextFloat() > 0.9F?4:0), 5, 3, 8, var3);
      this.a(var1, pb.bI.bO, var14 + (var2.nextFloat() > 0.9F?4:0), 6, 3, 8, var3);
      this.a(var1, pb.bI.bO, var7 + (var2.nextFloat() > 0.9F?4:0), 4, 3, 12, var3);
      this.a(var1, pb.bI.bO, var7 + (var2.nextFloat() > 0.9F?4:0), 5, 3, 12, var3);
      this.a(var1, pb.bI.bO, var7 + (var2.nextFloat() > 0.9F?4:0), 6, 3, 12, var3);
      this.a(var1, pb.bI.bO, var8 + (var2.nextFloat() > 0.9F?4:0), 3, 3, 9, var3);
      this.a(var1, pb.bI.bO, var8 + (var2.nextFloat() > 0.9F?4:0), 3, 3, 10, var3);
      this.a(var1, pb.bI.bO, var8 + (var2.nextFloat() > 0.9F?4:0), 3, 3, 11, var3);
      this.a(var1, pb.bI.bO, var9 + (var2.nextFloat() > 0.9F?4:0), 7, 3, 9, var3);
      this.a(var1, pb.bI.bO, var9 + (var2.nextFloat() > 0.9F?4:0), 7, 3, 10, var3);
      this.a(var1, pb.bI.bO, var9 + (var2.nextFloat() > 0.9F?4:0), 7, 3, 11, var3);
      if(!this.a) {
         int var13 = this.b(3);
         int var10 = this.a(5, 6);
         int var11 = this.b(5, 6);
         if(var3.b(var10, var13, var11)) {
            this.a = true;
            var1.g(var10, var13, var11, pb.as.bO);
            cj var12 = (cj)var1.b(var10, var13, var11);
            if(var12 != null) {
               var12.a("Silverfish");
            }
         }
      }

      return true;
   }
}
