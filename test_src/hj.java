import net.minecraft.client.Minecraft;

public class hj extends Thread {

   // $FF: synthetic field
   final Minecraft a;


   public hj(Minecraft var1, String var2) {
      super(var2);
      this.a = var1;
      this.setDaemon(true);
      this.start();
   }

   public void run() {
      while(this.a.L) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var2) {
            ;
         }
      }

   }
}
