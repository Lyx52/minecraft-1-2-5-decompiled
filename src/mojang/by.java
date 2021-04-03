package mojang;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

class by extends Thread {

   // $FF: synthetic field
   final oa a;
   // $FF: synthetic field
   final qh b;


   by(qh var1, oa var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      boolean var27 = false;

      label183: {
         label184: {
            label185: {
               label186: {
                  label187: {
                     try {
                        var27 = true;
                        this.a.d = "§8Polling..";
                        long var1 = System.nanoTime();
                        ServerSelectionMenu.a(this.b.a, this.a);
                        long var3 = System.nanoTime();
                        this.a.e = (var3 - var1) / 1000000L;
                        var27 = false;
                        break label183;
                     } catch (UnknownHostException var35) {
                        this.a.e = -1L;
                        this.a.d = "§4Can\'t resolve hostname";
                        var27 = false;
                        break label184;
                     } catch (SocketTimeoutException var36) {
                        this.a.e = -1L;
                        this.a.d = "§4Can\'t reach server";
                        var27 = false;
                     } catch (ConnectException var37) {
                        this.a.e = -1L;
                        this.a.d = "§4Can\'t reach server";
                        var27 = false;
                        break label187;
                     } catch (IOException var38) {
                        this.a.e = -1L;
                        this.a.d = "§4Communication error";
                        var27 = false;
                        break label186;
                     } catch (Exception var39) {
                        this.a.e = -1L;
                        this.a.d = "ERROR: " + var39.getClass();
                        var27 = false;
                        break label185;
                     } finally {
                        if(var27) {
                           synchronized(ServerSelectionMenu.g()) {
                              ServerSelectionMenu.p();
                           }
                        }
                     }

                     synchronized(ServerSelectionMenu.g()) {
                        ServerSelectionMenu.p();
                        return;
                     }
                  }

                  synchronized(ServerSelectionMenu.g()) {
                     ServerSelectionMenu.p();
                     return;
                  }
               }

               synchronized(ServerSelectionMenu.g()) {
                  ServerSelectionMenu.p();
                  return;
               }
            }

            synchronized(ServerSelectionMenu.g()) {
               ServerSelectionMenu.p();
               return;
            }
         }

         synchronized(ServerSelectionMenu.g()) {
            ServerSelectionMenu.p();
            return;
         }
      }

      synchronized(ServerSelectionMenu.g()) {
         ServerSelectionMenu.p();
      }

   }
}
