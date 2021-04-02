package mojang;

class om extends Thread {

   // $FF: synthetic field
   final IsomCanvas a;


   om(IsomCanvas var1) {
      this.a = var1;
   }

   public void run() {
      while(IsomCanvas.a(this.a)) {
         this.a.d();

         try {
            Thread.sleep(1L);
         } catch (Exception var2) {
            ;
         }
      }

   }
}
