package mojang;

public class aap extends dd {

   private amc a;
   private int b = 0;


   public aap(aak var1, amc var2) {
      this.a = var2;
      this.a(new il(this, var1.d, var2, 0, 56, 46));
      this.a(new il(this, var1.d, var2, 1, 79, 53));
      this.a(new il(this, var1.d, var2, 2, 102, 46));
      this.a(new vn(this, var2, 3, 79, 17));

      int var3;
      for(var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 9; ++var4) {
            this.a(new yu(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 9; ++var3) {
         this.a(new yu(var1, var3, 8 + var3 * 18, 142));
      }

   }

   public void a() {
      super.a();

      for(int var1 = 0; var1 < this.g.size(); ++var1) {
         wm var2 = (wm)this.g.get(var1);
         if(this.b != this.a.g()) {
            var2.a(this, 0, this.a.g());
         }
      }

      this.b = this.a.g();
   }

   public void a(int var1, int var2) {
      if(var1 == 0) {
         this.a.c(var2);
      }

   }

   public boolean b(Player var1) {
      return this.a.a_(var1);
   }

   public aan a(int var1) {
      aan var2 = null;
      yu var3 = (yu)this.e.get(var1);
      if(var3 != null && var3.c()) {
         aan var4 = var3.b();
         var2 = var4.k();
         if((var1 < 0 || var1 > 2) && var1 != 3) {
            if(var1 >= 4 && var1 < 31) {
               if(!this.a(var4, 31, 40, false)) {
                  return null;
               }
            } else if(var1 >= 31 && var1 < 40) {
               if(!this.a(var4, 4, 31, false)) {
                  return null;
               }
            } else if(!this.a(var4, 4, 40, false)) {
               return null;
            }
         } else {
            if(!this.a(var4, 4, 40, true)) {
               return null;
            }

            var3.a(var4, var2);
         }

         if(var4.a == 0) {
            var3.d((aan)null);
         } else {
            var3.d();
         }

         if(var4.a == var2.a) {
            return null;
         }

         var3.b(var4);
      }

      return var2;
   }
}
