package mojang;

import java.net.HttpURLConnection;
import java.net.URL;
import mojang.net.minecraft.client.Minecraft;

public class hp extends Thread {

   // $FF: synthetic field
   final Minecraft a;


   public hp(Minecraft var1) {
      this.a = var1;
   }

   public void run() {
      try {
         HttpURLConnection var1 = (HttpURLConnection)(new URL("https://login.minecraft.net/session?name=" + this.a.k.b + "&session=" + this.a.k.c)).openConnection();
         var1.connect();
         if(var1.getResponseCode() == 400 && this == null) {
            Minecraft.J = System.currentTimeMillis();
         }

         var1.disconnect();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}
