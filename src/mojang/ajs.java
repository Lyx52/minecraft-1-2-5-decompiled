package mojang;

import java.util.List;
import java.util.Random;

public class ajs extends fh {

   protected final mg a;
   private boolean b;
   private boolean c;
   private boolean d;
   private boolean e;


   public ajs(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.a = this.a(var2);
      this.g = var3;
      this.b = var2.nextBoolean();
      this.c = var2.nextBoolean();
      this.d = var2.nextBoolean();
      this.e = var2.nextInt(3) > 0;
   }

   public void a(he var1, List var2, Random var3) {
      int var4 = 3;
      int var5 = 5;
      if(this.h == 1 || this.h == 2) {
         var4 = 8 - var4;
         var5 = 8 - var5;
      }

      this.a((s)var1, var2, var3, 5, 1);
      if(this.b) {
         this.b((s)var1, var2, var3, var4, 1);
      }

      if(this.c) {
         this.b((s)var1, var2, var3, var5, 7);
      }

      if(this.d) {
         this.c((s)var1, var2, var3, var4, 1);
      }

      if(this.e) {
         this.c((s)var1, var2, var3, var5, 7);
      }

   }

   public static ajs a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -4, -3, 0, 10, 9, 11, var5);
      return a(var7) && a(var0, var7) == null?new ajs(var6, var1, var7, var5):null;
   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 9, 8, 10, true, var2, abb.b());
         this.a(var1, var2, var3, this.a, 4, 3, 0);
         if(this.b) {
            this.a(var1, var3, 0, 3, 1, 0, 5, 3, 0, 0, false);
         }

         if(this.d) {
            this.a(var1, var3, 9, 3, 1, 9, 5, 3, 0, 0, false);
         }

         if(this.c) {
            this.a(var1, var3, 0, 5, 7, 0, 7, 9, 0, 0, false);
         }

         if(this.e) {
            this.a(var1, var3, 9, 5, 7, 9, 7, 9, 0, 0, false);
         }

         this.a(var1, var3, 5, 1, 10, 7, 3, 10, 0, 0, false);
         this.a(var1, var3, 1, 2, 1, 8, 2, 6, false, var2, abb.b());
         this.a(var1, var3, 4, 1, 5, 4, 4, 9, false, var2, abb.b());
         this.a(var1, var3, 8, 1, 5, 8, 4, 9, false, var2, abb.b());
         this.a(var1, var3, 1, 4, 7, 3, 4, 9, false, var2, abb.b());
         this.a(var1, var3, 1, 3, 5, 3, 3, 6, false, var2, abb.b());
         this.a(var1, var3, 1, 3, 4, 3, 3, 4, pb.ak.bO, pb.ak.bO, false);
         this.a(var1, var3, 1, 4, 6, 3, 4, 6, pb.ak.bO, pb.ak.bO, false);
         this.a(var1, var3, 5, 1, 7, 7, 1, 8, false, var2, abb.b());
         this.a(var1, var3, 5, 1, 9, 7, 1, 9, pb.ak.bO, pb.ak.bO, false);
         this.a(var1, var3, 5, 2, 7, 7, 2, 7, pb.ak.bO, pb.ak.bO, false);
         this.a(var1, var3, 4, 5, 7, 4, 5, 9, pb.ak.bO, pb.ak.bO, false);
         this.a(var1, var3, 8, 5, 7, 8, 5, 9, pb.ak.bO, pb.ak.bO, false);
         this.a(var1, var3, 5, 5, 7, 7, 5, 9, pb.aj.bO, pb.aj.bO, false);
         this.a(var1, pb.aq.bO, 0, 6, 5, 6, var3);
         return true;
      }
   }
}
