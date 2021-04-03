import java.io.IOException;

class rm extends Thread {

   // $FF: synthetic field
   final lg a;


   rm(lg var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      Object var1 = lg.a;
      synchronized(lg.a) {
         ++lg.c;
      }

      while(true) {
         boolean var13 = false;

         try {
            var13 = true;
            if(!lg.a(this.a)) {
               var13 = false;
               break;
            }

            while(lg.d(this.a)) {
               ;
            }

            try {
               if(lg.e(this.a) != null) {
                  lg.e(this.a).flush();
               }
            } catch (IOException var18) {
               if(!lg.f(this.a)) {
                  lg.a(this.a, (Exception)var18);
               }

               var18.printStackTrace();
            }

            try {
               sleep(2L);
            } catch (InterruptedException var16) {
               ;
            }
         } finally {
            if(var13) {
               Object var5 = lg.a;
               synchronized(lg.a) {
                  --lg.c;
               }
            }
         }
      }

      var1 = lg.a;
      synchronized(lg.a) {
         --lg.c;
      }
   }
}
