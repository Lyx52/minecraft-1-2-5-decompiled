package mojang;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class je extends World {

   private LinkedList G = new LinkedList();
   private adl H;
   private pc I;
   private abh J = new abh();
   private Set K = new HashSet();
   private Set L = new HashSet();


   public je(adl var1, WorldStub var2, int var3, int var4) {
      super(new akx(), "MpServer", alb.a(var3), var2);
      this.H = var1;
      this.q = var4;
      this.a(new uh(8, 64, 8));
      this.z = var1.b;
   }

   public void c() {
      this.a(this.w() + 1L);

      int var1;
      for(var1 = 0; var1 < 10 && !this.L.isEmpty(); ++var1) {
         BaseEntity var2 = (BaseEntity)this.L.iterator().next();
         this.L.remove(var2);
         if(!this.b.contains(var2)) {
            this.a(var2);
         }
      }

      this.H.b();

      for(var1 = 0; var1 < this.G.size(); ++var1) {
         og var3 = (og)this.G.get(var1);
         if(--var3.d == 0) {
            super.b(var3.a, var3.b, var3.c, var3.e, var3.f);
            super.k(var3.a, var3.b, var3.c);
            this.G.remove(var1--);
         }
      }

      this.I.a();
      this.f();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.G.size(); ++var7) {
         og var8 = (og)this.G.get(var7);
         if(var8.a >= var1 && var8.b >= var2 && var8.c >= var3 && var8.a <= var4 && var8.b <= var5 && var8.c <= var6) {
            this.G.remove(var7--);
         }
      }

   }

   protected ca d() {
      this.I = new pc(this);
      return this.I;
   }

   public void e() {
      this.a(new uh(8, 64, 8));
   }

   protected void f() {
      this.r();
      Iterator var1 = this.D.iterator();

      while(var1.hasNext()) {
         sj var2 = (sj)var1.next();
         int var3 = var2.a * 16;
         int var4 = var2.b * 16;
         lv.a("getChunk");
         ack var5 = this.d(var2.a, var2.b);
         this.a(var3, var4, var5);
         lv.b();
      }

   }

   public void a(int var1, int var2, int var3, int var4, int var5) {}

   public boolean a(boolean var1) {
      return false;
   }

   public void a(int var1, int var2, boolean var3) {
      if(var3) {
         this.I.c(var1, var2);
      } else {
         this.I.d(var1, var2);
      }

      if(!var3) {
         this.c(var1 * 16, 0, var2 * 16, var1 * 16 + 15, 256, var2 * 16 + 15);
      }

   }

   public boolean a(BaseEntity var1) {
      boolean var2 = super.a(var1);
      this.K.add(var1);
      if(!var2) {
         this.L.add(var1);
      }

      return var2;
   }

   public void b(BaseEntity var1) {
      super.b(var1);
      this.K.remove(var1);
   }

   protected void c(BaseEntity var1) {
      super.c(var1);
      if(this.L.contains(var1)) {
         this.L.remove(var1);
      }

   }

   protected void d(BaseEntity var1) {
      super.d(var1);
      if(this.K.contains(var1)) {
         if(var1.M()) {
            this.L.add(var1);
         } else {
            this.K.remove(var1);
         }
      }

   }

   public void a(int var1, BaseEntity var2) {
      BaseEntity var3 = this.a(var1);
      if(var3 != null) {
         this.b(var3);
      }

      this.K.add(var2);
      var2.f = var1;
      if(!this.a(var2)) {
         this.L.add(var2);
      }

      this.J.a(var1, var2);
   }

   public BaseEntity a(int var1) {
      return (BaseEntity)this.J.a(var1);
   }

   public BaseEntity b(int var1) {
      BaseEntity var2 = (BaseEntity)this.J.d(var1);
      if(var2 != null) {
         this.K.remove(var2);
         this.b(var2);
      }

      return var2;
   }

   public boolean c(int var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var1, var2, var3);
      return super.d(var1, var2, var3, var4, var5);
   }

   public void g() {
      this.H.b(new amg("Quitting"));
   }

   protected void h() {
      if(!this.t.e) {
         if(this.m > 0) {
            --this.m;
         }

         this.i = this.j;
         if(this.x.isRaining()) {
            this.j = (float)((double)this.j + 0.01D);
         } else {
            this.j = (float)((double)this.j - 0.01D);
         }

         if(this.j < 0.0F) {
            this.j = 0.0F;
         }

         if(this.j > 1.0F) {
            this.j = 1.0F;
         }

         this.k = this.l;
         if(this.x.isThundering()) {
            this.l = (float)((double)this.l + 0.01D);
         } else {
            this.l = (float)((double)this.l - 0.01D);
         }

         if(this.l < 0.0F) {
            this.l = 0.0F;
         }

         if(this.l > 1.0F) {
            this.l = 1.0F;
         }

      }
   }
}
