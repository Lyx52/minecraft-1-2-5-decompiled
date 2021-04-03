
class alw extends Thread {

   // $FF: synthetic field
   final vt a;


   alw(vt var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      ks.a(vt.a(this.a), vt.b(this.a), true);
   }
}
