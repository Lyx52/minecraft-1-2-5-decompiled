package mojang;

class ri extends Thread {

   // $FF: synthetic field
   final lg a;


   ri(lg var1) {
      this.a = var1;
   }

   public void run() {
      try {
         Thread.sleep(5000L);
         if(lg.g(this.a).isAlive()) {
            try {
               lg.g(this.a).stop();
            } catch (Throwable var3) {
               ;
            }
         }

         if(lg.h(this.a).isAlive()) {
            try {
               lg.h(this.a).stop();
            } catch (Throwable var2) {
               ;
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }

   }
}
