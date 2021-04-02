package mojang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class kd {

   private final xd a;
   private final List b = new ArrayList();
   private final uh c = new uh(0, 0, 0);
   private final uh d = new uh(0, 0, 0);
   private int e = 0;
   private int f = 0;
   private int g = 0;
   private int h = 0;
   private List i = new ArrayList();
   private int j = 0;


   public kd(xd var1) {
      this.a = var1;
   }

   public void a(int var1) {
      this.g = var1;
      this.k();
      this.j();
      if(var1 % 20 == 0) {
         this.i();
      }

      if(var1 % 30 == 0) {
         this.h();
      }

      int var2 = this.h / 16;
      if(this.j < var2 && this.b.size() > 20 && this.a.r.nextInt(7000) == 0) {
         bo var3 = this.a(gk.d((float)this.d.a), gk.d((float)this.d.b), gk.d((float)this.d.c), 2, 4, 2);
         if(var3 != null) {
            tl var4 = new tl(this.a);
            var4.d(var3.a, var3.b, var3.c);
            this.a.a((nn)var4);
            ++this.j;
         }
      }

   }

   private bo a(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < 10; ++var7) {
         int var8 = var1 + this.a.r.nextInt(16) - 8;
         int var9 = var2 + this.a.r.nextInt(6) - 3;
         int var10 = var3 + this.a.r.nextInt(16) - 8;
         if(this.a(var8, var9, var10) && this.b(var8, var9, var10, var4, var5, var6)) {
            return bo.b((double)var8, (double)var9, (double)var10);
         }
      }

      return null;
   }

   private boolean b(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(!this.a.h(var1, var2 - 1, var3)) {
         return false;
      } else {
         int var7 = var1 - var4 / 2;
         int var8 = var3 - var6 / 2;

         for(int var9 = var7; var9 < var7 + var4; ++var9) {
            for(int var10 = var2; var10 < var2 + var5; ++var10) {
               for(int var11 = var8; var11 < var8 + var6; ++var11) {
                  if(this.a.h(var9, var10, var11)) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   private void h() {
      List var1 = this.a.a(tl.class, wu.b((double)(this.d.a - this.e), (double)(this.d.b - 4), (double)(this.d.c - this.e), (double)(this.d.a + this.e), (double)(this.d.b + 4), (double)(this.d.c + this.e)));
      this.j = var1.size();
   }

   private void i() {
      List var1 = this.a.a(ed.class, wu.b((double)(this.d.a - this.e), (double)(this.d.b - 4), (double)(this.d.c - this.e), (double)(this.d.a + this.e), (double)(this.d.b + 4), (double)(this.d.c + this.e)));
      this.h = var1.size();
   }

   public uh a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.b.size();
   }

   public int d() {
      return this.g - this.f;
   }

   public int e() {
      return this.h;
   }

   public boolean a(int var1, int var2, int var3) {
      return this.d.c(var1, var2, var3) < (float)(this.e * this.e);
   }

   public List f() {
      return this.b;
   }

   public adm b(int var1, int var2, int var3) {
      adm var4 = null;
      int var5 = Integer.MAX_VALUE;
      Iterator var6 = this.b.iterator();

      while(var6.hasNext()) {
         adm var7 = (adm)var6.next();
         int var8 = var7.a(var1, var2, var3);
         if(var8 < var5) {
            var4 = var7;
            var5 = var8;
         }
      }

      return var4;
   }

   public adm c(int var1, int var2, int var3) {
      adm var4 = null;
      int var5 = Integer.MAX_VALUE;
      Iterator var6 = this.b.iterator();

      while(var6.hasNext()) {
         adm var7 = (adm)var6.next();
         int var8 = var7.a(var1, var2, var3);
         if(var8 > 256) {
            var8 *= 1000;
         } else {
            var8 = var7.f();
         }

         if(var8 < var5) {
            var4 = var7;
            var5 = var8;
         }
      }

      return var4;
   }

   public adm d(int var1, int var2, int var3) {
      if(this.d.c(var1, var2, var3) > (float)(this.e * this.e)) {
         return null;
      } else {
         Iterator var4 = this.b.iterator();

         adm var5;
         do {
            if(!var4.hasNext()) {
               return null;
            }

            var5 = (adm)var4.next();
         } while(var5.a != var1 || var5.c != var3 || Math.abs(var5.b - var2) > 1);

         return var5;
      }
   }

   public void a(adm var1) {
      this.b.add(var1);
      this.c.a += var1.a;
      this.c.b += var1.b;
      this.c.c += var1.c;
      this.l();
      this.f = var1.f;
   }

   public boolean g() {
      return this.b.isEmpty();
   }

   public void a(acq var1) {
      Iterator var2 = this.i.iterator();

      afr var3;
      do {
         if(!var2.hasNext()) {
            this.i.add(new afr(this, var1, this.g));
            return;
         }

         var3 = (afr)var2.next();
      } while(var3.a != var1);

      var3.b = this.g;
   }

   public acq b(acq var1) {
      double var2 = Double.MAX_VALUE;
      afr var4 = null;

      for(int var5 = 0; var5 < this.i.size(); ++var5) {
         afr var6 = (afr)this.i.get(var5);
         double var7 = var6.a.f(var1);
         if(var7 <= var2) {
            var4 = var6;
            var2 = var7;
         }
      }

      return var4 != null?var4.a:null;
   }

   private void j() {
      Iterator var1 = this.i.iterator();

      while(var1.hasNext()) {
         afr var2 = (afr)var1.next();
         if(!var2.a.M() || Math.abs(this.g - var2.b) > 300) {
            var1.remove();
         }
      }

   }

   private void k() {
      boolean var1 = false;
      boolean var2 = this.a.r.nextInt(50) == 0;
      Iterator var3 = this.b.iterator();

      while(var3.hasNext()) {
         adm var4 = (adm)var3.next();
         if(var2) {
            var4.d();
         }

         if(!this.e(var4.a, var4.b, var4.c) || Math.abs(this.g - var4.f) > 1200) {
            this.c.a -= var4.a;
            this.c.b -= var4.b;
            this.c.c -= var4.c;
            var1 = true;
            var4.g = true;
            var3.remove();
         }
      }

      if(var1) {
         this.l();
      }

   }

   private boolean e(int var1, int var2, int var3) {
      int var4 = this.a.a(var1, var2, var3);
      return var4 <= 0?false:var4 == pb.aE.bO;
   }

   private void l() {
      int var1 = this.b.size();
      if(var1 == 0) {
         this.d.a(0, 0, 0);
         this.e = 0;
      } else {
         this.d.a(this.c.a / var1, this.c.b / var1, this.c.c / var1);
         int var2 = 0;

         adm var4;
         for(Iterator var3 = this.b.iterator(); var3.hasNext(); var2 = Math.max(var4.a(this.d.a, this.d.b, this.d.c), var2)) {
            var4 = (adm)var3.next();
         }

         this.e = Math.max(32, (int)Math.sqrt((double)var2) + 1);
      }
   }
}
