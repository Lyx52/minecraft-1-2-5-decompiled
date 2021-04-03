import java.util.List;
import java.util.Random;

public class ey extends aih {

   private int a = -1;
   private final boolean b;


   public ey(int var1, Random var2, qg var3, int var4) {
      super(var1);
      this.h = var4;
      this.g = var3;
      this.b = var2.nextBoolean();
   }

   public void a(he var1, List var2, Random var3) {}

   public static ey a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      qg var7 = qg.a(var2, var3, var4, 0, 0, 0, 5, 6, 5, var5);
      return he.a(var0, var7) != null?null:new ey(var6, var1, var7, var5);
   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a < 0) {
         this.a = this.b(var1, var3);
         if(this.a < 0) {
            return true;
         }

         this.g.a(0, this.a - this.g.e + 6 - 1, 0);
      }

      this.a(var1, var3, 0, 0, 0, 4, 0, 4, pb.w.bO, pb.w.bO, false);
      this.a(var1, var3, 0, 4, 0, 4, 4, 4, pb.J.bO, pb.J.bO, false);
      this.a(var1, var3, 1, 4, 1, 3, 4, 3, pb.x.bO, pb.x.bO, false);
      this.a(var1, pb.w.bO, 0, 0, 1, 0, var3);
      this.a(var1, pb.w.bO, 0, 0, 2, 0, var3);
      this.a(var1, pb.w.bO, 0, 0, 3, 0, var3);
      this.a(var1, pb.w.bO, 0, 4, 1, 0, var3);
      this.a(var1, pb.w.bO, 0, 4, 2, 0, var3);
      this.a(var1, pb.w.bO, 0, 4, 3, 0, var3);
      this.a(var1, pb.w.bO, 0, 0, 1, 4, var3);
      this.a(var1, pb.w.bO, 0, 0, 2, 4, var3);
      this.a(var1, pb.w.bO, 0, 0, 3, 4, var3);
      this.a(var1, pb.w.bO, 0, 4, 1, 4, var3);
      this.a(var1, pb.w.bO, 0, 4, 2, 4, var3);
      this.a(var1, pb.w.bO, 0, 4, 3, 4, var3);
      this.a(var1, var3, 0, 1, 1, 0, 3, 3, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 4, 1, 1, 4, 3, 3, pb.x.bO, pb.x.bO, false);
      this.a(var1, var3, 1, 1, 4, 3, 3, 4, pb.x.bO, pb.x.bO, false);
      this.a(var1, pb.bq.bO, 0, 0, 2, 2, var3);
      this.a(var1, pb.bq.bO, 0, 2, 2, 4, var3);
      this.a(var1, pb.bq.bO, 0, 4, 2, 2, var3);
      this.a(var1, pb.x.bO, 0, 1, 1, 0, var3);
      this.a(var1, pb.x.bO, 0, 1, 2, 0, var3);
      this.a(var1, pb.x.bO, 0, 1, 3, 0, var3);
      this.a(var1, pb.x.bO, 0, 2, 3, 0, var3);
      this.a(var1, pb.x.bO, 0, 3, 3, 0, var3);
      this.a(var1, pb.x.bO, 0, 3, 2, 0, var3);
      this.a(var1, pb.x.bO, 0, 3, 1, 0, var3);
      if(this.a(var1, 2, 0, -1, var3) == 0 && this.a(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, pb.aH.bO, this.c(pb.aH.bO, 3), 2, 0, -1, var3);
      }

      this.a(var1, var3, 1, 1, 1, 3, 3, 3, 0, 0, false);
      if(this.b) {
         this.a(var1, pb.aZ.bO, 0, 0, 5, 0, var3);
         this.a(var1, pb.aZ.bO, 0, 1, 5, 0, var3);
         this.a(var1, pb.aZ.bO, 0, 2, 5, 0, var3);
         this.a(var1, pb.aZ.bO, 0, 3, 5, 0, var3);
         this.a(var1, pb.aZ.bO, 0, 4, 5, 0, var3);
         this.a(var1, pb.aZ.bO, 0, 0, 5, 4, var3);
         this.a(var1, pb.aZ.bO, 0, 1, 5, 4, var3);
         this.a(var1, pb.aZ.bO, 0, 2, 5, 4, var3);
         this.a(var1, pb.aZ.bO, 0, 3, 5, 4, var3);
         this.a(var1, pb.aZ.bO, 0, 4, 5, 4, var3);
         this.a(var1, pb.aZ.bO, 0, 4, 5, 1, var3);
         this.a(var1, pb.aZ.bO, 0, 4, 5, 2, var3);
         this.a(var1, pb.aZ.bO, 0, 4, 5, 3, var3);
         this.a(var1, pb.aZ.bO, 0, 0, 5, 1, var3);
         this.a(var1, pb.aZ.bO, 0, 0, 5, 2, var3);
         this.a(var1, pb.aZ.bO, 0, 0, 5, 3, var3);
      }

      int var4;
      if(this.b) {
         var4 = this.c(pb.aF.bO, 3);
         this.a(var1, pb.aF.bO, var4, 3, 1, 3, var3);
         this.a(var1, pb.aF.bO, var4, 3, 2, 3, var3);
         this.a(var1, pb.aF.bO, var4, 3, 3, 3, var3);
         this.a(var1, pb.aF.bO, var4, 3, 4, 3, var3);
      }

      this.a(var1, pb.aq.bO, 0, 2, 3, 1, var3);

      for(var4 = 0; var4 < 5; ++var4) {
         for(int var5 = 0; var5 < 5; ++var5) {
            this.b(var1, var5, 6, var4, var3);
            this.b(var1, pb.w.bO, 0, var5, -1, var4, var3);
         }
      }

      this.a(var1, var3, 1, 1, 2, 1);
      return true;
   }
}
