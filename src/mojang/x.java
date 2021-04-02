package mojang;

public class x extends rc {

   private final Ozelot a;
   private final float b;
   private int c = 0;
   private int h = 0;
   private int d = 0;
   private int e = 0;
   private int f = 0;
   private int g = 0;


   public x(Ozelot var1, float var2) {
      this.a = var1;
      this.b = var2;
      this.a(5);
   }

   public boolean a() {
      return this.a.G_() && !this.a.af() && this.a.aO().nextDouble() <= 0.006500000134110451D && this.h();
   }

   public boolean b() {
      return this.c <= this.d && this.h <= 60 && this.a(this.a.k, this.e, this.f, this.g);
   }

   public void c() {
      this.a.aM().a((double)((float)this.e) + 0.5D, (double)(this.f + 1), (double)((float)this.g) + 0.5D, this.b);
      this.c = 0;
      this.h = 0;
      this.d = this.a.aO().nextInt(this.a.aO().nextInt(1200) + 1200) + 1200;
      this.a.ai().a(false);
   }

   public void d() {
      this.a.f(false);
   }

   public void e() {
      ++this.c;
      this.a.ai().a(false);
      if(this.a.f((double)this.e, (double)(this.f + 1), (double)this.g) > 1.0D) {
         this.a.f(false);
         this.a.aM().a((double)((float)this.e) + 0.5D, (double)(this.f + 1), (double)((float)this.g) + 0.5D, this.b);
         ++this.h;
      } else if(!this.a.af()) {
         this.a.f(true);
      } else {
         --this.h;
      }

   }

   private boolean h() {
      int var1 = (int)this.a.p;
      double var2 = 2.147483647E9D;

      for(int var4 = (int)this.a.o - 8; (double)var4 < this.a.o + 8.0D; ++var4) {
         for(int var5 = (int)this.a.q - 8; (double)var5 < this.a.q + 8.0D; ++var5) {
            if(this.a(this.a.k, var4, var1, var5) && this.a.k.i(var4, var1 + 1, var5)) {
               double var6 = this.a.f((double)var4, (double)var1, (double)var5);
               if(var6 < var2) {
                  this.e = var4;
                  this.f = var1;
                  this.g = var5;
                  var2 = var6;
               }
            }
         }
      }

      return var2 < 2.147483647E9D;
   }

   private boolean a(World var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      int var6 = var1.e(var2, var3, var4);
      if(var5 == pb.au.bO) {
         hb var7 = (hb)var1.b(var2, var3, var4);
         if(var7.h < 1) {
            return true;
         }
      } else {
         if(var5 == pb.aC.bO) {
            return true;
         }

         if(var5 == pb.S.bO && !pm.e(var6)) {
            return true;
         }
      }

      return false;
   }
}
