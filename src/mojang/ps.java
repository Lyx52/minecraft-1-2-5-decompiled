package mojang;

class ps extends Thread {

   // $FF: synthetic field
   final vc a;


   ps(vc var1) {
      this.a = var1;
   }

   public void run() {
      try {
         if(vc.a(this.a) != null) {
            vc.a(this.a, vc.a(this.a), vc.b(this.a), vc.c(this.a), vc.d(this.a));
         } else if(vc.b(this.a).exists()) {
            vc.a(this.a, vc.a(this.a, vc.b(this.a), vc.c(this.a), vc.d(this.a)));
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         vc.a(this.a, false);
      }

   }
}
