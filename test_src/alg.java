
public class alg {

   private int a;
   private int b;
   private int c;


   public alg(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public alg(alg var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
   }

   public void a(alg var1) {
      if(this.a != var1.a) {
         System.err.println("This method should only be called for matching effects!");
      }

      if(var1.c > this.c) {
         this.c = var1.c;
         this.b = var1.b;
      } else if(var1.c == this.c && this.b < var1.b) {
         this.b = var1.b;
      }

   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public boolean a(acq var1) {
      if(this.b > 0) {
         if(aad.a[this.a].b(this.b, this.c)) {
            this.b(var1);
         }

         this.e();
      }

      return this.b > 0;
   }

   private int e() {
      return --this.b;
   }

   public void b(acq var1) {
      if(this.b > 0) {
         aad.a[this.a].a(var1, this.c);
      }

   }

   public String d() {
      return aad.a[this.a].c();
   }

   public int hashCode() {
      return this.a;
   }

   public String toString() {
      String var1 = "";
      if(this.c() > 0) {
         var1 = this.d() + " x " + (this.c() + 1) + ", Duration: " + this.b();
      } else {
         var1 = this.d() + ", Duration: " + this.b();
      }

      return aad.a[this.a].i()?"(" + var1 + ")":var1;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof alg)) {
         return false;
      } else {
         alg var2 = (alg)var1;
         return this.a == var2.a && this.c == var2.c && this.b == var2.b;
      }
   }
}
