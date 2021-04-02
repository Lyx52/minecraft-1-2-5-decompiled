package mojang;

public class aah extends dd {

   public ade a = new ade(this, 3, 3);
   public io b = new akk();
   private World c;
   private int h;
   private int i;
   private int j;


   public aah(aak var1, World var2, int var3, int var4, int var5) {
      this.c = var2;
      this.h = var3;
      this.i = var4;
      this.j = var5;
      this.a((yu)(new amn(var1.d, this.a, this.b, 0, 124, 35)));

      int var6;
      int var7;
      for(var6 = 0; var6 < 3; ++var6) {
         for(var7 = 0; var7 < 3; ++var7) {
            this.a(new yu(this.a, var7 + var6 * 3, 30 + var7 * 18, 17 + var6 * 18));
         }
      }

      for(var6 = 0; var6 < 3; ++var6) {
         for(var7 = 0; var7 < 9; ++var7) {
            this.a(new yu(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for(var6 = 0; var6 < 9; ++var6) {
         this.a(new yu(var1, var6, 8 + var6 * 18, 142));
      }

      this.a((io)this.a);
   }

   public void a(io var1) {
      this.b.a(0, fr.a().a(this.a));
   }

   public void a(Player var1) {
      super.a(var1);
      if(!this.c.F) {
         for(int var2 = 0; var2 < 9; ++var2) {
            aan var3 = this.a.b(var2);
            if(var3 != null) {
               var1.a(var3);
            }
         }

      }
   }

   public boolean b(Player var1) {
      return this.c.a(this.h, this.i, this.j) != pb.ay.bO?false:var1.f((double)this.h + 0.5D, (double)this.i + 0.5D, (double)this.j + 0.5D) <= 64.0D;
   }

   public aan a(int var1) {
      aan var2 = null;
      yu var3 = (yu)this.e.get(var1);
      if(var3 != null && var3.c()) {
         aan var4 = var3.b();
         var2 = var4.k();
         if(var1 == 0) {
            if(!this.a(var4, 10, 46, true)) {
               return null;
            }

            var3.a(var4, var2);
         } else if(var1 >= 10 && var1 < 37) {
            if(!this.a(var4, 37, 46, false)) {
               return null;
            }
         } else if(var1 >= 37 && var1 < 46) {
            if(!this.a(var4, 10, 37, false)) {
               return null;
            }
         } else if(!this.a(var4, 10, 46, false)) {
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
