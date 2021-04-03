import java.util.Map;

class pr extends Thread {

   // $FF: synthetic field
   final Map a;
   // $FF: synthetic field
   final vc b;


   pr(vc var1, Map var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         vc.a(this.b, this.a, vc.e(this.b), vc.f(this.b), vc.g(this.b));
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         vc.a(this.b, false);
      }

   }
}
