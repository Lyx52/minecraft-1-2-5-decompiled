import java.io.IOException;
import java.util.List;

public class hy implements ca {

   private ack c;
   private ca d;
   private ua e;
   private ack[] f;
   private xd g;
   int a;
   int b;
   private ack h;
   private int i;
   private int j;


   public void d(int var1, int var2) {
      this.i = var1;
      this.j = var2;
   }

   public boolean e(int var1, int var2) {
      byte var3 = 15;
      return var1 >= this.i - var3 && var2 >= this.j - var3 && var1 <= this.i + var3 && var2 <= this.j + var3;
   }

   public boolean a(int var1, int var2) {
      if(!this.e(var1, var2)) {
         return false;
      } else if(var1 == this.a && var2 == this.b && this.h != null) {
         return true;
      } else {
         int var3 = var1 & 31;
         int var4 = var2 & 31;
         int var5 = var3 + var4 * 32;
         return this.f[var5] != null && (this.f[var5] == this.c || this.f[var5].a(var1, var2));
      }
   }

   public ack c(int var1, int var2) {
      return this.b(var1, var2);
   }

   public ack b(int var1, int var2) {
      if(var1 == this.a && var2 == this.b && this.h != null) {
         return this.h;
      } else if(!this.g.y && !this.e(var1, var2)) {
         return this.c;
      } else {
         int var3 = var1 & 31;
         int var4 = var2 & 31;
         int var5 = var3 + var4 * 32;
         if(!this.a(var1, var2)) {
            if(this.f[var5] != null) {
               this.f[var5].e();
               this.b(this.f[var5]);
               this.a(this.f[var5]);
            }

            ack var6 = this.f(var1, var2);
            if(var6 == null) {
               if(this.d == null) {
                  var6 = this.c;
               } else {
                  var6 = this.d.b(var1, var2);
                  var6.j();
               }
            }

            this.f[var5] = var6;
            var6.c();
            if(this.f[var5] != null) {
               this.f[var5].d();
            }

            this.f[var5].a(this, this, var1, var2);
         }

         this.a = var1;
         this.b = var2;
         this.h = this.f[var5];
         return this.f[var5];
      }
   }

   private ack f(int var1, int var2) {
      if(this.e == null) {
         return this.c;
      } else {
         try {
            ack var3 = this.e.a(this.g, var1, var2);
            if(var3 != null) {
               var3.n = this.g.w();
            }

            return var3;
         } catch (Exception var4) {
            var4.printStackTrace();
            return this.c;
         }
      }
   }

   private void a(ack var1) {
      if(this.e != null) {
         try {
            this.e.b(this.g, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }

      }
   }

   private void b(ack var1) {
      if(this.e != null) {
         try {
            var1.n = this.g.w();
            this.e.a(this.g, var1);
         } catch (IOException var3) {
            var3.printStackTrace();
         }

      }
   }

   public void a(ca var1, int var2, int var3) {
      ack var4 = this.b(var2, var3);
      if(!var4.k) {
         var4.k = true;
         if(this.d != null) {
            this.d.a(var1, var2, var3);
            var4.f();
         }
      }

   }

   public boolean a(boolean var1, rw var2) {
      int var3 = 0;
      int var4 = 0;
      int var5;
      if(var2 != null) {
         for(var5 = 0; var5 < this.f.length; ++var5) {
            if(this.f[var5] != null && this.f[var5].a(var1)) {
               ++var4;
            }
         }
      }

      var5 = 0;

      for(int var6 = 0; var6 < this.f.length; ++var6) {
         if(this.f[var6] != null) {
            if(var1) {
               this.a(this.f[var6]);
            }

            if(this.f[var6].a(var1)) {
               this.b(this.f[var6]);
               this.f[var6].l = false;
               ++var3;
               if(var3 == 2 && !var1) {
                  return false;
               }

               if(var2 != null) {
                  ++var5;
                  if(var5 % 10 == 0) {
                     var2.a(var5 * 100 / var4);
                  }
               }
            }
         }
      }

      if(var1) {
         if(this.e == null) {
            return true;
         }

         this.e.c();
      }

      return true;
   }

   public boolean a() {
      if(this.e != null) {
         this.e.b();
      }

      return this.d.a();
   }

   public boolean b() {
      return true;
   }

   public String c() {
      return "ChunkCache: " + this.f.length;
   }

   public List a(acf var1, int var2, int var3, int var4) {
      return this.d.a(var1, var2, var3, var4);
   }

   public qo a(xd var1, String var2, int var3, int var4, int var5) {
      return this.d.a(var1, var2, var3, var4, var5);
   }
}
