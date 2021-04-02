package mojang;

import java.util.Random;

public class sp extends abn {

   public sp(int var1) {
      super(var1);
      this.K.add(new bg(Wolf.class, 8, 4, 4));
      this.I.z = 10;
      this.I.B = 1;
   }

   public li a(Random var1) {
      return (li)(var1.nextInt(3) == 0?new lo():new rb(false));
   }
}
