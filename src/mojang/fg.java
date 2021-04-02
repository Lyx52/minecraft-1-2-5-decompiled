package mojang;

import java.util.List;

public class fg extends rc {

   private aaa a;
   private float b;
   private float c;
   private BaseEntity d;
   private float e;
   private vu f;
   private rh g;
   private Class h;


   public fg(aaa var1, Class var2, float var3, float var4, float var5) {
      this.a = var1;
      this.h = var2;
      this.e = var3;
      this.b = var4;
      this.c = var5;
      this.g = var1.aM();
      this.a(1);
   }

   public boolean a() {
      if(this.h == Player.class) {
         if(this.a instanceof wd && ((wd)this.a).G_()) {
            return false;
         }

         this.d = this.a.k.a(this.a, (double)this.e);
         if(this.d == null) {
            return false;
         }
      } else {
         List var1 = this.a.k.a(this.h, this.a.y.b((double)this.e, 3.0D, (double)this.e));
         if(var1.size() == 0) {
            return false;
         }

         this.d = (BaseEntity)var1.get(0);
      }

      if(!this.a.aN().a(this.d)) {
         return false;
      } else {
         bo var2 = wv.b(this.a, 16, 7, bo.b(this.d.o, this.d.p, this.d.q));
         if(var2 == null) {
            return false;
         } else if(this.d.f(var2.a, var2.b, var2.c) < this.d.f(this.a)) {
            return false;
         } else {
            this.f = this.g.a(var2.a, var2.b, var2.c);
            return this.f == null?false:this.f.a(var2);
         }
      }
   }

   public boolean b() {
      return !this.g.e();
   }

   public void c() {
      this.g.a(this.f, this.b);
   }

   public void d() {
      this.d = null;
   }

   public void e() {
      if(this.a.f(this.d) < 49.0D) {
         this.a.aM().a(this.c);
      } else {
         this.a.aM().a(this.b);
      }

   }
}
