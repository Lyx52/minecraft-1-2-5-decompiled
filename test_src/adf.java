import java.util.List;
import java.util.Random;

public class adf extends fh {

   private static final fx[] b = new fx[]{new fx(yr.aL.bQ, 0, 1, 3, 20), new fx(yr.aK.bQ, 0, 2, 7, 20), new fx(yr.bd.bQ, 0, 1, 1, 1), new fx(yr.aQ.bQ, 0, 1, 1, 1)};
   protected final mg a;
   private final boolean c;


   public adf(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.a = this.a(var2);
      this.g = var3;
      this.c = var3.c() > 6;
   }

   public void a(he var1, List var2, Random var3) {}

   public static adf a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
      if(!a(var7) || he.a(var0, var7) != null) {
         var7 = qg.a(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
         if(!a(var7) || he.a(var0, var7) != null) {
            return null;
         }
      }

      return new adf(var6, var1, var7, var5);
   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         byte var4 = 11;
         if(!this.c) {
            var4 = 6;
         }

         this.a(var1, var3, 0, 0, 0, 13, var4 - 1, 14, true, var2, abb.b());
         this.a(var1, var2, var3, this.a, 4, 1, 0);
         this.a(var1, var3, var2, 0.07F, 2, 1, 1, 11, 4, 13, pb.W.bO, pb.W.bO, false);

         int var7;
         for(var7 = 1; var7 <= 13; ++var7) {
            if((var7 - 1) % 4 == 0) {
               this.a(var1, var3, 1, 1, var7, 1, 4, var7, pb.x.bO, pb.x.bO, false);
               this.a(var1, var3, 12, 1, var7, 12, 4, var7, pb.x.bO, pb.x.bO, false);
               this.a(var1, pb.aq.bO, 0, 2, 3, var7, var3);
               this.a(var1, pb.aq.bO, 0, 11, 3, var7, var3);
               if(this.c) {
                  this.a(var1, var3, 1, 6, var7, 1, 9, var7, pb.x.bO, pb.x.bO, false);
                  this.a(var1, var3, 12, 6, var7, 12, 9, var7, pb.x.bO, pb.x.bO, false);
               }
            } else {
               this.a(var1, var3, 1, 1, var7, 1, 4, var7, pb.an.bO, pb.an.bO, false);
               this.a(var1, var3, 12, 1, var7, 12, 4, var7, pb.an.bO, pb.an.bO, false);
               if(this.c) {
                  this.a(var1, var3, 1, 6, var7, 1, 9, var7, pb.an.bO, pb.an.bO, false);
                  this.a(var1, var3, 12, 6, var7, 12, 9, var7, pb.an.bO, pb.an.bO, false);
               }
            }
         }

         for(var7 = 3; var7 < 12; var7 += 2) {
            this.a(var1, var3, 3, 1, var7, 4, 3, var7, pb.an.bO, pb.an.bO, false);
            this.a(var1, var3, 6, 1, var7, 7, 3, var7, pb.an.bO, pb.an.bO, false);
            this.a(var1, var3, 9, 1, var7, 10, 3, var7, pb.an.bO, pb.an.bO, false);
         }

         if(this.c) {
            this.a(var1, var3, 1, 5, 1, 3, 5, 13, pb.x.bO, pb.x.bO, false);
            this.a(var1, var3, 10, 5, 1, 12, 5, 13, pb.x.bO, pb.x.bO, false);
            this.a(var1, var3, 4, 5, 1, 9, 5, 2, pb.x.bO, pb.x.bO, false);
            this.a(var1, var3, 4, 5, 12, 9, 5, 13, pb.x.bO, pb.x.bO, false);
            this.a(var1, pb.x.bO, 0, 9, 5, 11, var3);
            this.a(var1, pb.x.bO, 0, 8, 5, 11, var3);
            this.a(var1, pb.x.bO, 0, 9, 5, 10, var3);
            this.a(var1, var3, 3, 6, 2, 3, 6, 12, pb.aZ.bO, pb.aZ.bO, false);
            this.a(var1, var3, 10, 6, 2, 10, 6, 10, pb.aZ.bO, pb.aZ.bO, false);
            this.a(var1, var3, 4, 6, 2, 9, 6, 2, pb.aZ.bO, pb.aZ.bO, false);
            this.a(var1, var3, 4, 6, 12, 8, 6, 12, pb.aZ.bO, pb.aZ.bO, false);
            this.a(var1, pb.aZ.bO, 0, 9, 6, 11, var3);
            this.a(var1, pb.aZ.bO, 0, 8, 6, 11, var3);
            this.a(var1, pb.aZ.bO, 0, 9, 6, 10, var3);
            var7 = this.c(pb.aF.bO, 3);
            this.a(var1, pb.aF.bO, var7, 10, 1, 13, var3);
            this.a(var1, pb.aF.bO, var7, 10, 2, 13, var3);
            this.a(var1, pb.aF.bO, var7, 10, 3, 13, var3);
            this.a(var1, pb.aF.bO, var7, 10, 4, 13, var3);
            this.a(var1, pb.aF.bO, var7, 10, 5, 13, var3);
            this.a(var1, pb.aF.bO, var7, 10, 6, 13, var3);
            this.a(var1, pb.aF.bO, var7, 10, 7, 13, var3);
            byte var8 = 7;
            byte var9 = 7;
            this.a(var1, pb.aZ.bO, 0, var8 - 1, 9, var9, var3);
            this.a(var1, pb.aZ.bO, 0, var8, 9, var9, var3);
            this.a(var1, pb.aZ.bO, 0, var8 - 1, 8, var9, var3);
            this.a(var1, pb.aZ.bO, 0, var8, 8, var9, var3);
            this.a(var1, pb.aZ.bO, 0, var8 - 1, 7, var9, var3);
            this.a(var1, pb.aZ.bO, 0, var8, 7, var9, var3);
            this.a(var1, pb.aZ.bO, 0, var8 - 2, 7, var9, var3);
            this.a(var1, pb.aZ.bO, 0, var8 + 1, 7, var9, var3);
            this.a(var1, pb.aZ.bO, 0, var8 - 1, 7, var9 - 1, var3);
            this.a(var1, pb.aZ.bO, 0, var8 - 1, 7, var9 + 1, var3);
            this.a(var1, pb.aZ.bO, 0, var8, 7, var9 - 1, var3);
            this.a(var1, pb.aZ.bO, 0, var8, 7, var9 + 1, var3);
            this.a(var1, pb.aq.bO, 0, var8 - 2, 8, var9, var3);
            this.a(var1, pb.aq.bO, 0, var8 + 1, 8, var9, var3);
            this.a(var1, pb.aq.bO, 0, var8 - 1, 8, var9 - 1, var3);
            this.a(var1, pb.aq.bO, 0, var8 - 1, 8, var9 + 1, var3);
            this.a(var1, pb.aq.bO, 0, var8, 8, var9 - 1, var3);
            this.a(var1, pb.aq.bO, 0, var8, 8, var9 + 1, var3);
         }

         this.a(var1, var3, var2, 3, 3, 5, b, 1 + var2.nextInt(4));
         if(this.c) {
            this.a(var1, 0, 0, 12, 9, 1, var3);
            this.a(var1, var3, var2, 12, 8, 1, b, 1 + var2.nextInt(4));
         }

         return true;
      }
   }

}
