
class om extends Thread {

   // $FF: synthetic field
   final ty a;


   om(ty var1) {
      this.a = var1;
   }

   public void run() {
      while(ty.a(this.a)) {
         this.a.d();

         try {
            Thread.sleep(1L);
         } catch (Exception var2) {
            ;
         }
      }

   }
}
