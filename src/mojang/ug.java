package mojang;

public class ug extends dd {

   private ahg a;
   private int b = 0;
   private int c = 0;
   private int h = 0;


   public ug(aak var1, ahg var2) {
      this.a = var2;
      this.a(new yu(var2, 0, 56, 17));
      this.a(new yu(var2, 1, 56, 53));
      this.a(new ajv(var1.d, var2, 2, 116, 35));

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
         if(this.b != this.a.c) {
            var2.a(this, 0, this.a.c);
         }

         if(this.c != this.a.a) {
            var2.a(this, 1, this.a.a);
         }

         if(this.h != this.a.b) {
            var2.a(this, 2, this.a.b);
         }
      }

      this.b = this.a.c;
      this.c = this.a.a;
      this.h = this.a.b;
   }

   public void a(int var1, int var2) {
      if(var1 == 0) {
         this.a.c = var2;
      }

      if(var1 == 1) {
         this.a.a = var2;
      }

      if(var1 == 2) {
         this.a.b = var2;
      }

   }

   public boolean b(yw var1) {
      return this.a.a_(var1);
   }

   public aan a(int var1) {
      aan var2 = null;
      yu var3 = (yu)this.e.get(var1);
      if(var3 != null && var3.c()) {
         aan var4 = var3.b();
         var2 = var4.k();
         if(var1 == 2) {
            if(!this.a(var4, 3, 39, true)) {
               return null;
            }

            var3.a(var4, var2);
         } else if(var1 != 1 && var1 != 0) {
            if(dy.a().a(var4.a().bQ) != null) {
               if(!this.a(var4, 0, 1, false)) {
                  return null;
               }
            } else if(ahg.b(var4)) {
               if(!this.a(var4, 1, 2, false)) {
                  return null;
               }
            } else if(var1 >= 3 && var1 < 30) {
               if(!this.a(var4, 30, 39, false)) {
                  return null;
               }
            } else if(var1 >= 30 && var1 < 39 && !this.a(var4, 3, 30, false)) {
               return null;
            }
         } else if(!this.a(var4, 3, 39, false)) {
            return null;
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
