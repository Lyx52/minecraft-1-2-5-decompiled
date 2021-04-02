package mojang;

import mojang.net.minecraft.client.Minecraft;

public class TimerHackThread extends Thread {

   final Minecraft minecraft;


   public TimerHackThread(Minecraft minecraftApplication, String threadName) {
      super(threadName);
      this.minecraft = minecraftApplication;
      this.setDaemon(true);
      this.start();
   }

   public void run() {
      while(this.minecraft.running) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }

   }
}
