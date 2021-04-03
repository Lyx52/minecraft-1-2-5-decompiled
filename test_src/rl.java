
class rl extends Thread {

   // $FF: synthetic field
   final lg a;


   rl(lg var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      Object var1 = lg.a;
      synchronized(lg.a) {
         ++lg.b;
      }

      while(true) {
         boolean var12 = false;

         try {
            var12 = true;
            if(!lg.a(this.a)) {
               var12 = false;
               break;
            }

            if(lg.b(this.a)) {
               var12 = false;
               break;
            }

            while(lg.c(this.a)) {
               ;
            }

            try {
               sleep(2L);
            } catch (InterruptedException var15) {
               ;
            }
         } finally {
            if(var12) {
               Object var5 = lg.a;
               synchronized(lg.a) {
                  --lg.b;
               }
            }
         }
      }

      var1 = lg.a;
      synchronized(lg.a) {
         --lg.b;
      }
   }
}
