package mojang;

import java.util.List;

public class wq {

   private long a;
   private vx b;
   private int c;
   private int d;
   private int e;
   private long f;
   private long g;
   private long h;
   private ady i;
   private int j;
   private String k;
   private int l;
   private boolean m;
   private int n;
   private boolean o;
   private int p;
   private int q;
   private boolean r;
   private boolean s;


   public wq(ady var1) {
      this.b = vx.b;
      this.s = false;
      this.a = var1.g("RandomSeed");
      if(var1.c("generatorName")) {
         String var2 = var1.j("generatorName");
         this.b = vx.a(var2);
         if(this.b == null) {
            this.b = vx.b;
         } else if(this.b.e()) {
            int var3 = 0;
            if(var1.c("generatorVersion")) {
               var3 = var1.f("generatorVersion");
            }

            this.b = this.b.a(var3);
         }
      }

      this.q = var1.f("GameType");
      if(var1.c("MapFeatures")) {
         this.r = var1.o("MapFeatures");
      } else {
         this.r = true;
      }

      this.c = var1.f("SpawnX");
      this.d = var1.f("SpawnY");
      this.e = var1.f("SpawnZ");
      this.f = var1.g("Time");
      this.g = var1.g("LastPlayed");
      this.h = var1.g("SizeOnDisk");
      this.k = var1.j("LevelName");
      this.l = var1.f("version");
      this.n = var1.f("rainTime");
      this.m = var1.o("raining");
      this.p = var1.f("thunderTime");
      this.o = var1.o("thundering");
      this.s = var1.o("hardcore");
      if(var1.c("Player")) {
         this.i = var1.m("Player");
         this.j = this.i.f("Dimension");
      }

   }

   public wq(fj var1, String var2) {
      this.b = vx.b;
      this.s = false;
      this.a = var1.a();
      this.q = var1.b();
      this.r = var1.d();
      this.k = var2;
      this.s = var1.c();
      this.b = var1.e();
   }

   public wq(wq var1) {
      this.b = vx.b;
      this.s = false;
      this.a = var1.a;
      this.b = var1.b;
      this.q = var1.q;
      this.r = var1.r;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.j = var1.j;
      this.k = var1.k;
      this.l = var1.l;
      this.n = var1.n;
      this.m = var1.m;
      this.p = var1.p;
      this.o = var1.o;
      this.s = var1.s;
   }

   public ady a() {
      ady var1 = new ady();
      this.a(var1, this.i);
      return var1;
   }

   public ady a(List var1) {
      ady var2 = new ady();
      yw var3 = null;
      ady var4 = null;
      if(var1.size() > 0) {
         var3 = (yw)var1.get(0);
      }

      if(var3 != null) {
         var4 = new ady();
         var3.d(var4);
      }

      this.a(var2, var4);
      return var2;
   }

   private void a(ady var1, ady var2) {
      var1.a("RandomSeed", this.a);
      var1.a("generatorName", this.b.a());
      var1.a("generatorVersion", this.b.c());
      var1.a("GameType", this.q);
      var1.a("MapFeatures", this.r);
      var1.a("SpawnX", this.c);
      var1.a("SpawnY", this.d);
      var1.a("SpawnZ", this.e);
      var1.a("Time", this.f);
      var1.a("SizeOnDisk", this.h);
      var1.a("LastPlayed", System.currentTimeMillis());
      var1.a("LevelName", this.k);
      var1.a("version", this.l);
      var1.a("rainTime", this.n);
      var1.a("raining", this.m);
      var1.a("thunderTime", this.p);
      var1.a("thundering", this.o);
      var1.a("hardcore", this.s);
      if(var2 != null) {
         var1.a("Player", var2);
      }

   }

   public long b() {
      return this.a;
   }

   public int c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   public long f() {
      return this.f;
   }

   public long g() {
      return this.h;
   }

   public ady h() {
      return this.i;
   }

   public int i() {
      return this.j;
   }

   public void a(int var1) {
      this.c = var1;
   }

   public void b(int var1) {
      this.d = var1;
   }

   public void c(int var1) {
      this.e = var1;
   }

   public void a(long var1) {
      this.f = var1;
   }

   public void a(ady var1) {
      this.i = var1;
   }

   public void a(int var1, int var2, int var3) {
      this.c = var1;
      this.d = var2;
      this.e = var3;
   }

   public String j() {
      return this.k;
   }

   public void a(String var1) {
      this.k = var1;
   }

   public int k() {
      return this.l;
   }

   public void d(int var1) {
      this.l = var1;
   }

   public long l() {
      return this.g;
   }

   public boolean m() {
      return this.o;
   }

   public void a(boolean var1) {
      this.o = var1;
   }

   public int n() {
      return this.p;
   }

   public void e(int var1) {
      this.p = var1;
   }

   public boolean o() {
      return this.m;
   }

   public void b(boolean var1) {
      this.m = var1;
   }

   public int p() {
      return this.n;
   }

   public void f(int var1) {
      this.n = var1;
   }

   public int q() {
      return this.q;
   }

   public boolean r() {
      return this.r;
   }

   public boolean s() {
      return this.s;
   }

   public vx t() {
      return this.b;
   }

   public void a(vx var1) {
      this.b = var1;
   }
}
