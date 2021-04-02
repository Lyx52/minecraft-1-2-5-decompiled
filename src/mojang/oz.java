package mojang;

public class oz extends vp {

   private vp b;
   protected String a = "Controls";
   private hu c;
   private int d = -1;


   public oz(vp var1, hu var2) {
      this.b = var1;
      this.c = var2;
   }

   private int d() {
      return this.q / 2 - 155;
   }

   public void c() {
      adn var1 = adn.a();
      int var2 = this.d();

      for(int var3 = 0; var3 < this.c.A.length; ++var3) {
         this.s.add(new z(var3, var2 + var3 % 2 * 160, this.r / 6 + 24 * (var3 >> 1), 70, 20, this.c.b(var3)));
      }

      this.s.add(new abp(200, this.q / 2 - 100, this.r / 6 + 168, var1.b("mojang.gui.done")));
      this.a = var1.b("controls.title");
   }

   protected void a(abp var1) {
      for(int var2 = 0; var2 < this.c.A.length; ++var2) {
         ((abp)this.s.get(var2)).e = this.c.b(var2);
      }

      if(var1.f == 200) {
         this.p.a(this.b);
      } else {
         this.d = var1.f;
         var1.e = "> " + this.c.b(var1.f) + " <";
      }

   }

   protected void a(int var1, int var2, int var3) {
      if(this.d >= 0) {
         this.c.a(this.d, -100 + var3);
         ((abp)this.s.get(this.d)).e = this.c.b(this.d);
         this.d = -1;
         afu.b();
      } else {
         super.a(var1, var2, var3);
      }

   }

   protected void a(char var1, int var2) {
      if(this.d >= 0) {
         this.c.a(this.d, var2);
         ((abp)this.s.get(this.d)).e = this.c.b(this.d);
         this.d = -1;
         afu.b();
      } else {
         super.a(var1, var2);
      }

   }

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, this.a, this.q / 2, 20, 16777215);
      int var4 = this.d();
      int var5 = 0;

      while(var5 < this.c.A.length) {
         boolean var6 = false;
         int var7 = 0;

         while(true) {
            if(var7 < this.c.A.length) {
               if(var7 == var5 || this.c.A[var5].d != this.c.A[var7].d) {
                  ++var7;
                  continue;
               }

               var6 = true;
            }

            if(this.d == var5) {
               ((abp)this.s.get(var5)).e = "§f> §e??? §f<";
            } else if(var6) {
               ((abp)this.s.get(var5)).e = "§c" + this.c.b(var5);
            } else {
               ((abp)this.s.get(var5)).e = this.c.b(var5);
            }

            this.b(this.u, this.c.a(var5), var4 + var5 % 2 * 160 + 70 + 6, this.r / 6 + 24 * (var5 >> 1) + 7, -1);
            ++var5;
            break;
         }
      }

      super.a(var1, var2, var3);
   }
}
