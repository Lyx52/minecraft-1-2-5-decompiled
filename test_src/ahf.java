
public class ahf extends dd {

   private az a;


   public ahf(io var1, az var2) {
      this.a = var2;

      int var3;
      int var4;
      for(var3 = 0; var3 < 3; ++var3) {
         for(var4 = 0; var4 < 3; ++var4) {
            this.a(new yu(var2, var4 + var3 * 3, 62 + var4 * 18, 17 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 3; ++var3) {
         for(var4 = 0; var4 < 9; ++var4) {
            this.a(new yu(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 9; ++var3) {
         this.a(new yu(var1, var3, 8 + var3 * 18, 142));
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
         if(var1 < 9) {
            if(!this.a(var4, 9, 45, true)) {
               return null;
            }
         } else if(!this.a(var4, 0, 9, false)) {
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
