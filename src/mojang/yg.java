package mojang;

import java.util.Random;

public class yg {

   protected World a;
   protected Random b;
   protected int c;
   protected int d;
   protected abn e;
   protected li f = new ji(4);
   protected li g;
   protected li h;
   protected li i;
   protected li j;
   protected li k;
   protected li l;
   protected li m;
   protected li n;
   protected li o;
   protected li p;
   protected li q;
   protected li r;
   protected li s;
   protected li t;
   protected li u;
   protected li v;
   protected li w;
   protected li x;
   protected int y;
   protected int z;
   protected int A;
   protected int B;
   protected int C;
   protected int D;
   protected int E;
   protected int F;
   protected int G;
   protected int H;
   protected int I;
   protected int J;
   public boolean K;


   public yg(abn var1) {
      this.g = new et(7, pb.E.bO);
      this.h = new et(6, pb.F.bO);
      this.i = new eh(pb.v.bO, 32);
      this.j = new eh(pb.F.bO, 32);
      this.k = new eh(pb.I.bO, 16);
      this.l = new eh(pb.H.bO, 8);
      this.m = new eh(pb.G.bO, 8);
      this.n = new eh(pb.aN.bO, 7);
      this.o = new eh(pb.aw.bO, 7);
      this.p = new eh(pb.N.bO, 6);
      this.q = new tz(pb.ad.bO);
      this.r = new tz(pb.ae.bO);
      this.s = new tz(pb.af.bO);
      this.t = new tz(pb.ag.bO);
      this.u = new qm();
      this.v = new aag();
      this.w = new xw();
      this.x = new jv();
      this.y = 0;
      this.z = 0;
      this.A = 2;
      this.B = 1;
      this.C = 0;
      this.D = 0;
      this.E = 0;
      this.F = 0;
      this.G = 1;
      this.H = 3;
      this.I = 1;
      this.J = 0;
      this.K = true;
      this.e = var1;
   }

   public void a(World var1, Random var2, int var3, int var4) {
      if(this.a != null) {
         throw new RuntimeException("Already decorating!!");
      } else {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.a();
         this.a = null;
         this.b = null;
      }
   }

   protected void a() {
      this.b();

      int var1;
      int var2;
      int var3;
      for(var1 = 0; var1 < this.H; ++var1) {
         var2 = this.c + this.b.nextInt(16) + 8;
         var3 = this.d + this.b.nextInt(16) + 8;
         this.g.a(this.a, this.b, var2, this.a.g(var2, var3), var3);
      }

      for(var1 = 0; var1 < this.I; ++var1) {
         var2 = this.c + this.b.nextInt(16) + 8;
         var3 = this.d + this.b.nextInt(16) + 8;
         this.f.a(this.a, this.b, var2, this.a.g(var2, var3), var3);
      }

      for(var1 = 0; var1 < this.G; ++var1) {
         var2 = this.c + this.b.nextInt(16) + 8;
         var3 = this.d + this.b.nextInt(16) + 8;
         this.g.a(this.a, this.b, var2, this.a.g(var2, var3), var3);
      }

      var1 = this.z;
      if(this.b.nextInt(10) == 0) {
         ++var1;
      }

      int var4;
      for(var2 = 0; var2 < var1; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.d + this.b.nextInt(16) + 8;
         li var5 = this.e.a(this.b);
         var5.a(1.0D, 1.0D, 1.0D);
         var5.a(this.a, this.b, var3, this.a.e(var3, var4), var4);
      }

      for(var2 = 0; var2 < this.J; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.d + this.b.nextInt(16) + 8;
         this.u.a(this.a, this.b, var3, this.a.e(var3, var4), var4);
      }

      int var7;
      for(var2 = 0; var2 < this.A; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.b.nextInt(128);
         var7 = this.d + this.b.nextInt(16) + 8;
         this.q.a(this.a, this.b, var3, var4, var7);
         if(this.b.nextInt(4) == 0) {
            var3 = this.c + this.b.nextInt(16) + 8;
            var4 = this.b.nextInt(128);
            var7 = this.d + this.b.nextInt(16) + 8;
            this.r.a(this.a, this.b, var3, var4, var7);
         }
      }

      for(var2 = 0; var2 < this.B; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.b.nextInt(128);
         var7 = this.d + this.b.nextInt(16) + 8;
         li var6 = this.e.b(this.b);
         var6.a(this.a, this.b, var3, var4, var7);
      }

      for(var2 = 0; var2 < this.C; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.b.nextInt(128);
         var7 = this.d + this.b.nextInt(16) + 8;
         (new abw(pb.Y.bO)).a(this.a, this.b, var3, var4, var7);
      }

      for(var2 = 0; var2 < this.y; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.d + this.b.nextInt(16) + 8;

         for(var7 = this.b.nextInt(128); var7 > 0 && this.a.a(var3, var7 - 1, var4) == 0; --var7) {
            ;
         }

         this.x.a(this.a, this.b, var3, var7, var4);
      }

      for(var2 = 0; var2 < this.D; ++var2) {
         if(this.b.nextInt(4) == 0) {
            var3 = this.c + this.b.nextInt(16) + 8;
            var4 = this.d + this.b.nextInt(16) + 8;
            var7 = this.a.e(var3, var4);
            this.s.a(this.a, this.b, var3, var7, var4);
         }

         if(this.b.nextInt(8) == 0) {
            var3 = this.c + this.b.nextInt(16) + 8;
            var4 = this.d + this.b.nextInt(16) + 8;
            var7 = this.b.nextInt(128);
            this.t.a(this.a, this.b, var3, var7, var4);
         }
      }

      if(this.b.nextInt(4) == 0) {
         var2 = this.c + this.b.nextInt(16) + 8;
         var3 = this.b.nextInt(128);
         var4 = this.d + this.b.nextInt(16) + 8;
         this.s.a(this.a, this.b, var2, var3, var4);
      }

      if(this.b.nextInt(8) == 0) {
         var2 = this.c + this.b.nextInt(16) + 8;
         var3 = this.b.nextInt(128);
         var4 = this.d + this.b.nextInt(16) + 8;
         this.t.a(this.a, this.b, var2, var3, var4);
      }

      for(var2 = 0; var2 < this.E; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.d + this.b.nextInt(16) + 8;
         var7 = this.b.nextInt(128);
         this.v.a(this.a, this.b, var3, var7, var4);
      }

      for(var2 = 0; var2 < 10; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.b.nextInt(128);
         var7 = this.d + this.b.nextInt(16) + 8;
         this.v.a(this.a, this.b, var3, var4, var7);
      }

      if(this.b.nextInt(32) == 0) {
         var2 = this.c + this.b.nextInt(16) + 8;
         var3 = this.b.nextInt(128);
         var4 = this.d + this.b.nextInt(16) + 8;
         (new akv()).a(this.a, this.b, var2, var3, var4);
      }

      for(var2 = 0; var2 < this.F; ++var2) {
         var3 = this.c + this.b.nextInt(16) + 8;
         var4 = this.b.nextInt(128);
         var7 = this.d + this.b.nextInt(16) + 8;
         this.w.a(this.a, this.b, var3, var4, var7);
      }

      if(this.K) {
         for(var2 = 0; var2 < 50; ++var2) {
            var3 = this.c + this.b.nextInt(16) + 8;
            var4 = this.b.nextInt(this.b.nextInt(120) + 8);
            var7 = this.d + this.b.nextInt(16) + 8;
            (new rp(pb.A.bO)).a(this.a, this.b, var3, var4, var7);
         }

         for(var2 = 0; var2 < 20; ++var2) {
            var3 = this.c + this.b.nextInt(16) + 8;
            var4 = this.b.nextInt(this.b.nextInt(this.b.nextInt(112) + 8) + 8);
            var7 = this.d + this.b.nextInt(16) + 8;
            (new rp(pb.C.bO)).a(this.a, this.b, var3, var4, var7);
         }
      }

   }

   protected void a(int var1, li var2, int var3, int var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = this.c + this.b.nextInt(16);
         int var7 = this.b.nextInt(var4 - var3) + var3;
         int var8 = this.d + this.b.nextInt(16);
         var2.a(this.a, this.b, var6, var7, var8);
      }

   }

   protected void b(int var1, li var2, int var3, int var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = this.c + this.b.nextInt(16);
         int var7 = this.b.nextInt(var4) + this.b.nextInt(var4) + (var3 - var4);
         int var8 = this.d + this.b.nextInt(16);
         var2.a(this.a, this.b, var6, var7, var8);
      }

   }

   protected void b() {
      this.a(20, this.i, 0, 128);
      this.a(10, this.j, 0, 128);
      this.a(20, this.k, 0, 128);
      this.a(20, this.l, 0, 64);
      this.a(2, this.m, 0, 32);
      this.a(8, this.n, 0, 16);
      this.a(1, this.o, 0, 16);
      this.b(1, this.p, 16, 16);
   }
}
