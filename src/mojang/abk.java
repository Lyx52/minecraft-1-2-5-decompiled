package mojang;

import java.util.ArrayList;

public class abk {

   Mob a;
   ArrayList b = new ArrayList();
   ArrayList c = new ArrayList();


   public abk(Mob var1) {
      this.a = var1;
   }

   public void a() {
      this.b.clear();
      this.c.clear();
   }

   public boolean a(BaseEntity var1) {
      if(this.b.contains(var1)) {
         return true;
      } else if(this.c.contains(var1)) {
         return false;
      } else {
         lv.a("canSee");
         boolean var2 = this.a.m(var1);
         lv.b();
         if(var2) {
            this.b.add(var1);
         } else {
            this.c.add(var1);
         }

         return var2;
      }
   }
}
