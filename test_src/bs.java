
public class bs extends dd {

   private io a;
   private int b;


   public bs(io var1, io var2) {
      this.a = var2;
      this.b = var2.a() / 9;
      var2.e();
      int var3 = (this.b - 4) * 18;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.b; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.a(new yu(var2, var5 + var4 * 9, 8 + var5 * 18, 18 + var4 * 18));
         }
      }

      for(var4 = 0; var4 < 3; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.a(new yu(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 103 + var4 * 18 + var3));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.a(new yu(var1, var4, 8 + var4 * 18, 161 + var3));
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
         if(var1 < this.b * 9) {
            if(!this.a(var4, this.b * 9, this.e.size(), true)) {
               return null;
            }
         } else if(!this.a(var4, 0, this.b * 9, false)) {
            return null;
         }

         if(var4.a == 0) {
            var3.d((aan)null);
         } else {
            var3.d();
         }
      }

      return var2;
   }

   public void a(yw var1) {
      super.a(var1);
      this.a.f();
   }
}
