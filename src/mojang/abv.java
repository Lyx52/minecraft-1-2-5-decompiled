package mojang;

import java.util.ArrayList;
import java.util.List;

public class abv extends agt {

   private List a = new ArrayList();


   public abv() {
      this.a.add(new bg(Blaze.class, 10, 2, 3));
      this.a.add(new bg(PigZombie.class, 10, 4, 4));
      this.a.add(new bg(LavaSlime.class, 3, 4, 4));
   }

   public List b() {
      return this.a;
   }

   protected boolean a(int var1, int var2) {
      int var3 = var1 >> 4;
      int var4 = var2 >> 4;
      this.c.setSeed((long)(var3 ^ var4 << 4) ^ this.d.v());
      this.c.nextInt();
      return this.c.nextInt(3) != 0?false:(var1 != (var3 << 4) + 4 + this.c.nextInt(8)?false:var2 == (var4 << 4) + 4 + this.c.nextInt(8));
   }

   protected pg b(int var1, int var2) {
      return new ay(this.d, this.c, var1, var2);
   }
}
