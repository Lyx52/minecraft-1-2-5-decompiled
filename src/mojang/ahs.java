package mojang;

import java.util.Random;

public class ahs extends abn {

   protected ahs(int var1) {
      super(var1);
      this.I.z = 2;
      this.I.A = -999;
      this.I.C = 1;
      this.I.D = 8;
      this.I.E = 10;
      this.I.I = 1;
      this.I.y = 4;
      this.H = 14745518;
   }

   public li a(Random var1) {
      return this.Q;
   }

   public int k() {
      double var1 = (double)this.j();
      double var3 = (double)this.i();
      return ((zv.a(var1, var3) & 16711422) + 5115470) / 2;
   }

   public int l() {
      double var1 = (double)this.j();
      double var3 = (double)this.i();
      return ((gu.a(var1, var3) & 16711422) + 5115470) / 2;
   }
}
