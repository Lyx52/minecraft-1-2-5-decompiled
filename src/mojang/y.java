package mojang;

public class y extends dd {

   public ade a;
   public io b;
   public boolean c;


   public y(aak var1) {
      this(var1, true);
   }

   public y(aak var1, boolean var2) {
      this.a = new ade(this, 2, 2);
      this.b = new akk();
      this.c = false;
      this.c = var2;
      this.a((yu)(new amn(var1.d, this.a, this.b, 0, 144, 36)));

      int var3;
      int var4;
      for(var3 = 0; var3 < 2; ++var3) {
         for(var4 = 0; var4 < 2; ++var4) {
            this.a(new yu(this.a, var4 + var3 * 2, 88 + var4 * 18, 26 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 4; ++var3) {
         this.a((yu)(new afq(this, var1, var1.a() - 1 - var3, 8, 8 + var3 * 18, var3)));
      }

      for(var3 = 0; var3 < 3; ++var3) {
         for(var4 = 0; var4 < 9; ++var4) {
            this.a(new yu(var1, var4 + (var3 + 1) * 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 9; ++var3) {
         this.a(new yu(var1, var3, 8 + var3 * 18, 142));
      }

      this.a((io)this.a);
   }

   public void a(io var1) {
      this.b.a(0, fr.a().a(this.a));
   }

   public void a(yw var1) {
      super.a(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         aan var3 = this.a.b(var2);
         if(var3 != null) {
            var1.a(var3);
         }
      }

      this.b.a(0, (aan)null);
   }

   public boolean b(yw var1) {
      return true;
   }

   public aan a(int var1) {
      aan var2 = null;
      yu var3 = (yu)this.e.get(var1);
      if(var3 != null && var3.c()) {
         aan var4 = var3.b();
         var2 = var4.k();
         if(var1 == 0) {
            if(!this.a(var4, 9, 45, true)) {
               return null;
            }

            var3.a(var4, var2);
         } else if(var1 >= 9 && var1 < 36) {
            if(!this.a(var4, 36, 45, false)) {
               return null;
            }
         } else if(var1 >= 36 && var1 < 45) {
            if(!this.a(var4, 9, 36, false)) {
               return null;
            }
         } else if(!this.a(var4, 9, 45, false)) {
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
