package mojang;

import java.util.Random;

public class ahn extends abn {

   public ahn(int var1) {
      super(var1);
      this.K.clear();
      this.A = (byte)pb.E.bO;
      this.B = (byte)pb.E.bO;
      this.I.z = -999;
      this.I.C = 2;
      this.I.E = 50;
      this.I.F = 10;
   }

   public void a(World var1, Random var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if(var2.nextInt(1000) == 0) {
         int var5 = var3 + var2.nextInt(16) + 8;
         int var6 = var4 + var2.nextInt(16) + 8;
         aln var7 = new aln();
         var7.a(var1, var2, var5, var1.e(var5, var6) + 1, var6);
      }

   }
}
