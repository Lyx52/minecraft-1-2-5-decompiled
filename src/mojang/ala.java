package mojang;

import java.net.ConnectException;
import java.net.UnknownHostException;
import mojang.net.minecraft.client.Minecraft;

class ala extends Thread {

   // $FF: synthetic field
   final Minecraft a;
   // $FF: synthetic field
   final String b;
   // $FF: synthetic field
   final int c;
   // $FF: synthetic field
   final ajy d;


   ala(ajy var1, Minecraft var2, String var3, int var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public void run() {
      try {
         ajy.a(this.d, new adl(this.a, this.b, this.c));
         if(ajy.a(this.d)) {
            return;
         }

         ajy.b(this.d).c(new jf(this.a.credentials.username, this.b, this.c));
      } catch (UnknownHostException var2) {
         if(ajy.a(this.d)) {
            return;
         }

         this.a.a((GUIManager)(new dw("connect.failed", "disconnect.genericReason", new Object[]{"Unknown host \'" + this.b + "\'"})));
      } catch (ConnectException var3) {
         if(ajy.a(this.d)) {
            return;
         }

         this.a.a((GUIManager)(new dw("connect.failed", "disconnect.genericReason", new Object[]{var3.getMessage()})));
      } catch (Exception var4) {
         if(ajy.a(this.d)) {
            return;
         }

         var4.printStackTrace();
         this.a.a((GUIManager)(new dw("connect.failed", "disconnect.genericReason", new Object[]{var4.toString()})));
      }

   }
}
