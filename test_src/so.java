import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class so extends he {

   private LinkedList a = new LinkedList();


   public so(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.g = new qg(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
   }

   public void a(he var1, List var2, Random var3) {
      int var4 = this.c();
      int var6 = this.g.c() - 3 - 1;
      if(var6 <= 0) {
         var6 = 1;
      }

      int var5;
      he var7;
      qg var8;
      for(var5 = 0; var5 < this.g.b(); var5 += 4) {
         var5 += var3.nextInt(this.g.b());
         if(var5 + 3 > this.g.b()) {
            break;
         }

         var7 = gp.a(var1, var2, var3, this.g.a + var5, this.g.b + var3.nextInt(var6) + 1, this.g.c - 1, 2, var4);
         if(var7 != null) {
            var8 = var7.b();
            this.a.add(new qg(var8.a, var8.b, this.g.c, var8.d, var8.e, this.g.c + 1));
         }
      }

      for(var5 = 0; var5 < this.g.b(); var5 += 4) {
         var5 += var3.nextInt(this.g.b());
         if(var5 + 3 > this.g.b()) {
            break;
         }

         var7 = gp.a(var1, var2, var3, this.g.a + var5, this.g.b + var3.nextInt(var6) + 1, this.g.f + 1, 0, var4);
         if(var7 != null) {
            var8 = var7.b();
            this.a.add(new qg(var8.a, var8.b, this.g.f - 1, var8.d, var8.e, this.g.f));
         }
      }

      for(var5 = 0; var5 < this.g.d(); var5 += 4) {
         var5 += var3.nextInt(this.g.d());
         if(var5 + 3 > this.g.d()) {
            break;
         }

         var7 = gp.a(var1, var2, var3, this.g.a - 1, this.g.b + var3.nextInt(var6) + 1, this.g.c + var5, 1, var4);
         if(var7 != null) {
            var8 = var7.b();
            this.a.add(new qg(this.g.a, var8.b, var8.c, this.g.a + 1, var8.e, var8.f));
         }
      }

      for(var5 = 0; var5 < this.g.d(); var5 += 4) {
         var5 += var3.nextInt(this.g.d());
         if(var5 + 3 > this.g.d()) {
            break;
         }

         var7 = gp.a(var1, var2, var3, this.g.d + 1, this.g.b + var3.nextInt(var6) + 1, this.g.c + var5, 3, var4);
         if(var7 != null) {
            var8 = var7.b();
            this.a.add(new qg(this.g.d - 1, var8.b, var8.c, this.g.d, var8.e, var8.f));
         }
      }

   }

   public boolean a(xd var1, Random var2, qg var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, this.g.a, this.g.b, this.g.c, this.g.d, this.g.b, this.g.f, pb.v.bO, 0, true);
         this.a(var1, var3, this.g.a, this.g.b + 1, this.g.c, this.g.d, Math.min(this.g.b + 3, this.g.e), this.g.f, 0, 0, false);
         Iterator var4 = this.a.iterator();

         while(var4.hasNext()) {
            qg var5 = (qg)var4.next();
            this.a(var1, var3, var5.a, var5.e - 2, var5.c, var5.d, var5.e, var5.f, 0, 0, false);
         }

         this.a(var1, var3, this.g.a, this.g.b + 4, this.g.c, this.g.d, this.g.e, this.g.f, 0, false);
         return true;
      }
   }
}
