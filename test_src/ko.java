import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ko implements ca {

   private Set a = new HashSet();
   private ack b;
   private ca c;
   private ua d;
   private en e = new en();
   private List f = new ArrayList();
   private xd g;
   private int h;


   public ko(xd var1, ua var2, ca var3) {
      this.b = new ace(var1, 0, 0);
      this.g = var1;
      this.d = var2;
      this.c = var3;
   }

   public boolean a(int var1, int var2) {
      return this.e.b(sj.a(var1, var2));
   }

   public void d(int var1, int var2) {
      uh var3 = this.g.x();
      int var4 = var1 * 16 + 8 - var3.a;
      int var5 = var2 * 16 + 8 - var3.c;
      short var6 = 128;
      if(var4 < -var6 || var4 > var6 || var5 < -var6 || var5 > var6) {
         this.a.add(Long.valueOf(sj.a(var1, var2)));
      }

   }

   public ack c(int var1, int var2) {
      long var3 = sj.a(var1, var2);
      this.a.remove(Long.valueOf(var3));
      ack var5 = (ack)this.e.a(var3);
      if(var5 == null) {
         int var6 = 1875004;
         if(var1 < -var6 || var2 < -var6 || var1 >= var6 || var2 >= var6) {
            return this.b;
         }

         var5 = this.e(var1, var2);
         if(var5 == null) {
            if(this.c == null) {
               var5 = this.b;
            } else {
               var5 = this.c.b(var1, var2);
            }
         }

         this.e.a(var3, var5);
         this.f.add(var5);
         if(var5 != null) {
            var5.c();
            var5.d();
         }

         var5.a(this, this, var1, var2);
      }

      return var5;
   }

   public ack b(int var1, int var2) {
      ack var3 = (ack)this.e.a(sj.a(var1, var2));
      return var3 == null?this.c(var1, var2):var3;
   }

   private ack e(int var1, int var2) {
      if(this.d == null) {
         return null;
      } else {
         try {
            ack var3 = this.d.a(this.g, var1, var2);
            if(var3 != null) {
               var3.n = this.g.w();
            }

            return var3;
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }

   private void a(ack var1) {
      if(this.d != null) {
         try {
            this.d.b(this.g, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }

      }
   }

   private void b(ack var1) {
      if(this.d != null) {
         try {
            var1.n = this.g.w();
            this.d.a(this.g, var1);
         } catch (IOException var3) {
            var3.printStackTrace();
         }

      }
   }

   public void a(ca var1, int var2, int var3) {
      ack var4 = this.b(var2, var3);
      if(!var4.k) {
         var4.k = true;
         if(this.c != null) {
            this.c.a(var1, var2, var3);
            var4.f();
         }
      }

   }

   public boolean a(boolean var1, rw var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < this.f.size(); ++var4) {
         ack var5 = (ack)this.f.get(var4);
         if(var1) {
            this.a(var5);
         }

         if(var5.a(var1)) {
            this.b(var5);
            var5.l = false;
            ++var3;
            if(var3 == 24 && !var1) {
               return false;
            }
         }
      }

      if(var1) {
         if(this.d == null) {
            return true;
         }

         this.d.c();
      }

      return true;
   }

   public boolean a() {
      int var1;
      for(var1 = 0; var1 < 100; ++var1) {
         if(!this.a.isEmpty()) {
            Long var2 = (Long)this.a.iterator().next();
            ack var3 = (ack)this.e.a(var2.longValue());
            var3.e();
            this.b(var3);
            this.a(var3);
            this.a.remove(var2);
            this.e.d(var2.longValue());
            this.f.remove(var3);
         }
      }

      for(var1 = 0; var1 < 10; ++var1) {
         if(this.h >= this.f.size()) {
            this.h = 0;
            break;
         }

         ack var4 = (ack)this.f.get(this.h++);
         yw var5 = this.g.a((double)(var4.g << 4) + 8.0D, (double)(var4.h << 4) + 8.0D, 288.0D);
         if(var5 == null) {
            this.d(var4.g, var4.h);
         }
      }

      if(this.d != null) {
         this.d.b();
      }

      return this.c.a();
   }

   public boolean b() {
      return true;
   }

   public String c() {
      return "ServerChunkCache: " + this.e.a() + " Drop: " + this.a.size();
   }

   public List a(acf var1, int var2, int var3, int var4) {
      return this.c.a(var1, var2, var3, var4);
   }

   public qo a(xd var1, String var2, int var3, int var4, int var5) {
      return this.c.a(var1, var2, var3, var4, var5);
   }
}
