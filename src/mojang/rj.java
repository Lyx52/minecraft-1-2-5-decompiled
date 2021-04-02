package mojang;

class rj extends Thread {

   // $FF: synthetic field
   final lg a;


   rj(lg var1) {
      this.a = var1;
   }

   public void run() {
      try {
         Thread.sleep(2000L);
         if(lg.a(this.a)) {
            lg.h(this.a).interrupt();
            this.a.a("disconnect.closed", new Object[0]);
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}
