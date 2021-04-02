package mojang;

import java.util.Iterator;
import java.util.List;

public class zy extends rn {

   boolean a;


   public zy(Mob var1, boolean var2) {
      super(var1, 16.0F, false);
      this.a = var2;
      this.a(1);
   }

   public boolean a() {
      return this.a(this.c.aP(), true);
   }

   public void c() {
      this.c.c(this.c.aP());
      if(this.a) {
         List var1 = this.c.k.a(this.c.getClass(), wu.b(this.c.o, this.c.p, this.c.q, this.c.o + 1.0D, this.c.p + 1.0D, this.c.q + 1.0D).b((double)this.d, 4.0D, (double)this.d));
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            BaseEntity var3 = (BaseEntity)var2.next();
            Mob var4 = (Mob)var3;
            if(this.c != var4 && var4.aT() == null) {
               var4.c(this.c.aP());
            }
         }
      }

      super.c();
   }
}
