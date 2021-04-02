package mojang;

public class zg {

   private int a;
   private int b;
   private int c;
   private byte[] d;
   private qq e;
   private qq f;
   private qq g;
   private qq h;


   public zg(int var1) {
      this.a = var1;
      this.d = new byte[4096];
      this.f = new qq(this.d.length, 4);
      this.h = new qq(this.d.length, 4);
      this.g = new qq(this.d.length, 4);
   }

   public int a(int var1, int var2, int var3) {
      int var4 = this.d[var2 << 8 | var3 << 4 | var1] & 255;
      return this.e != null?this.e.a(var1, var2, var3) << 8 | var4:var4;
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = this.d[var2 << 8 | var3 << 4 | var1] & 255;
      if(this.e != null) {
         var5 |= this.e.a(var1, var2, var3) << 8;
      }

      if(var5 == 0 && var4 != 0) {
         ++this.b;
         if(pb.m[var4] != null && pb.m[var4].o()) {
            ++this.c;
         }
      } else if(var5 != 0 && var4 == 0) {
         --this.b;
         if(pb.m[var5] != null && pb.m[var5].o()) {
            --this.c;
         }
      } else if(pb.m[var5] != null && pb.m[var5].o() && (pb.m[var4] == null || !pb.m[var4].o())) {
         --this.c;
      } else if((pb.m[var5] == null || !pb.m[var5].o()) && pb.m[var4] != null && pb.m[var4].o()) {
         ++this.c;
      }

      this.d[var2 << 8 | var3 << 4 | var1] = (byte)(var4 & 255);
      if(var4 > 255) {
         if(this.e == null) {
            this.e = new qq(this.d.length, 4);
         }

         this.e.a(var1, var2, var3, (var4 & 3840) >> 8);
      } else if(this.e != null) {
         this.e.a(var1, var2, var3, 0);
      }

   }

   public int b(int var1, int var2, int var3) {
      return this.f.a(var1, var2, var3);
   }

   public void b(int var1, int var2, int var3, int var4) {
      this.f.a(var1, var2, var3, var4);
   }

   public boolean a() {
      return this.b == 0;
   }

   public boolean b() {
      return this.c > 0;
   }

   public int c() {
      return this.a;
   }

   public void c(int var1, int var2, int var3, int var4) {
      this.h.a(var1, var2, var3, var4);
   }

   public int c(int var1, int var2, int var3) {
      return this.h.a(var1, var2, var3);
   }

   public void d(int var1, int var2, int var3, int var4) {
      this.g.a(var1, var2, var3, var4);
   }

   public int d(int var1, int var2, int var3) {
      return this.g.a(var1, var2, var3);
   }

   public void d() {
      this.b = 0;
      this.c = 0;

      for(int var1 = 0; var1 < 16; ++var1) {
         for(int var2 = 0; var2 < 16; ++var2) {
            for(int var3 = 0; var3 < 16; ++var3) {
               int var4 = this.a(var1, var2, var3);
               if(var4 > 0) {
                  if(pb.m[var4] == null) {
                     this.d[var2 << 8 | var3 << 4 | var1] = 0;
                     if(this.e != null) {
                        this.e.a(var1, var2, var3, 0);
                     }
                  } else {
                     ++this.b;
                     if(pb.m[var4].o()) {
                        ++this.c;
                     }
                  }
               }
            }
         }
      }

   }

   public void e() {}

   public int f() {
      return this.b;
   }

   public byte[] g() {
      return this.d;
   }

   public void h() {
      this.e = null;
   }

   public qq i() {
      return this.e;
   }

   public qq j() {
      return this.f;
   }

   public qq k() {
      return this.g;
   }

   public qq l() {
      return this.h;
   }

   public void a(byte[] var1) {
      this.d = var1;
   }

   public void a(qq var1) {
      this.e = var1;
   }

   public void b(qq var1) {
      this.f = var1;
   }

   public void c(qq var1) {
      this.g = var1;
   }

   public void d(qq var1) {
      this.h = var1;
   }

   public qq m() {
      this.e = new qq(this.d.length, 4);
      return this.e;
   }
}
