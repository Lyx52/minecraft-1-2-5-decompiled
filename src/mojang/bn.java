package mojang;

import java.util.Random;

public class bn extends abn {

   public bn(int var1) {
      super(var1);
      this.I.z = 50;
      this.I.B = 25;
      this.I.A = 4;
      this.J.add(new bg(Ozelot.class, 2, 1, 1));
      this.K.add(new bg(Chicken.class, 10, 4, 4));
   }

   public li a(Random var1) {
      return (li)(var1.nextInt(10) == 0?this.O:(var1.nextInt(2) == 0?new agm(3, 0):(var1.nextInt(3) == 0?new ajd(false, 10 + var1.nextInt(20), 3, 3):new sb(false, 4 + var1.nextInt(7), 3, 3, true))));
   }

   public li b(Random var1) {
      return var1.nextInt(4) == 0?new to(pb.X.bO, 2):new to(pb.X.bO, 1);
   }

   public void a(World var1, Random var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      od var5 = new od();

      for(int var6 = 0; var6 < 50; ++var6) {
         int var7 = var3 + var2.nextInt(16) + 8;
         byte var8 = 64;
         int var9 = var4 + var2.nextInt(16) + 8;
         var5.a(var1, var2, var7, var8, var9);
      }

   }
}
