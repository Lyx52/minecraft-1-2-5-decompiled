import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class pg {

   protected LinkedList a = new LinkedList();
   protected qg b;


   public qg a() {
      return this.b;
   }

   public LinkedList b() {
      return this.a;
   }

   public void a(xd var1, Random var2, qg var3) {
      Iterator var4 = this.a.iterator();

      while(var4.hasNext()) {
         he var5 = (he)var4.next();
         if(var5.b().a(var3) && !var5.a(var1, var2, var3)) {
            var4.remove();
         }
      }

   }

   protected void c() {
      this.b = qg.a();
      Iterator var1 = this.a.iterator();

      while(var1.hasNext()) {
         he var2 = (he)var1.next();
         this.b.b(var2.b());
      }

   }

   protected void a(xd var1, Random var2, int var3) {
      int var4 = 63 - var3;
      int var5 = this.b.c() + 1;
      if(var5 < var4) {
         var5 += var2.nextInt(var4 - var5);
      }

      int var6 = var5 - this.b.e;
      this.b.a(0, var6, 0);
      Iterator var7 = this.a.iterator();

      while(var7.hasNext()) {
         he var8 = (he)var7.next();
         var8.b().a(0, var6, 0);
      }

   }

   protected void a(xd var1, Random var2, int var3, int var4) {
      int var5 = var4 - var3 + 1 - this.b.c();
      boolean var6 = true;
      int var10;
      if(var5 > 1) {
         var10 = var3 + var2.nextInt(var5);
      } else {
         var10 = var3;
      }

      int var7 = var10 - this.b.b;
      this.b.a(0, var7, 0);
      Iterator var8 = this.a.iterator();

      while(var8.hasNext()) {
         he var9 = (he)var8.next();
         var9.b().a(0, var7, 0);
      }

   }

   public boolean d() {
      return true;
   }
}
