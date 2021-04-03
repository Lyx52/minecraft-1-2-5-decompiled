package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class ServerSelectionMenu extends GUIManager {

   private static int a = 0;
   private static Object b = new Object();
   private GUIManager c;
   private qh d;
   private List e = new ArrayList();
   private int f = -1;
   private Button h;
   private Button i;
   private Button j;
   private boolean k = false;
   private boolean l = false;
   private boolean m = false;
   private boolean n = false;
   private String o = null;
   private oa w = null;


   public ServerSelectionMenu(GUIManager var1) {
      this.c = var1;
   }

   public void a() {}

   public void c() {
      this.q();
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      this.d = new qh(this);
      this.d();
   }

   private void q() {
      try {
         CompundTag var1 = at.a(new File(this.minecraft.gameDirectory, "servers.dat"));
         ListTag var2 = var1.getListTag("servers");
         this.e.clear();

         for(int var3 = 0; var3 < var2.d(); ++var3) {
            this.e.add(oa.a((CompundTag)var2.a(var3)));
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   private void r() {
      try {
         ListTag var1 = new ListTag();

         for(int var2 = 0; var2 < this.e.size(); ++var2) {
            var1.a((BaseTag)((oa)this.e.get(var2)).a());
         }

         CompundTag var4 = new CompundTag();
         var4.addBaseTag("servers", (BaseTag)var1);
         at.a(var4, new File(this.minecraft.gameDirectory, "servers.dat"));
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void d() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      this.buttonList.add(this.h = new Button(7, this.q / 2 - 154, this.r - 28, 70, 20, var1.getLocaleStringByName("selectServer.edit")));
      this.buttonList.add(this.j = new Button(2, this.q / 2 - 74, this.r - 28, 70, 20, var1.getLocaleStringByName("selectServer.delete")));
      this.buttonList.add(this.i = new Button(1, this.q / 2 - 154, this.r - 52, 100, 20, var1.getLocaleStringByName("selectServer.select")));
      this.buttonList.add(new Button(4, this.q / 2 - 50, this.r - 52, 100, 20, var1.getLocaleStringByName("selectServer.direct")));
      this.buttonList.add(new Button(3, this.q / 2 + 4 + 50, this.r - 52, 100, 20, var1.getLocaleStringByName("selectServer.add")));
      this.buttonList.add(new Button(8, this.q / 2 + 4, this.r - 28, 70, 20, var1.getLocaleStringByName("selectServer.refresh")));
      this.buttonList.add(new Button(0, this.q / 2 + 4 + 76, this.r - 28, 75, 20, var1.getLocaleStringByName("mojang.gui.cancel")));
      boolean var2 = this.f >= 0 && this.f < this.d.a();
      this.i.visible = var2;
      this.h.visible = var2;
      this.j.visible = var2;
   }

   public void e() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void clickButton(Button var1) {
      if(var1.visible) {
         if(var1.buttonID == 2) {
            String var2 = ((oa)this.e.get(this.f)).a;
            if(var2 != null) {
               this.k = true;
               LocalizationManager var3 = LocalizationManager.getInstance();
               String var4 = var3.getLocaleStringByName("selectServer.deleteQuestion");
               String var5 = "\'" + var2 + "\' " + var3.getLocaleStringByName("selectServer.deleteWarning");
               String var6 = var3.getLocaleStringByName("selectServer.deleteButton");
               String var7 = var3.getLocaleStringByName("mojang.gui.cancel");
               mi var8 = new mi(this, var4, var5, var6, var7, this.f);
               this.minecraft.addMenu((GUIManager)var8);
            }
         } else if(var1.buttonID == 1) {
            this.a(this.f);
         } else if(var1.buttonID == 4) {
            this.n = true;
            this.minecraft.addMenu((GUIManager)(new acz(this, this.w = new oa(LocalizationManagerWrapper.getLocaleString("selectServer.defaultName"), ""))));
         } else if(var1.buttonID == 3) {
            this.l = true;
            this.minecraft.addMenu((GUIManager)(new xs(this, this.w = new oa(LocalizationManagerWrapper.getLocaleString("selectServer.defaultName"), ""))));
         } else if(var1.buttonID == 7) {
            this.m = true;
            oa var9 = (oa)this.e.get(this.f);
            this.minecraft.addMenu((GUIManager)(new xs(this, this.w = new oa(var9.a, var9.b))));
         } else if(var1.buttonID == 0) {
            this.minecraft.addMenu(this.c);
         } else if(var1.buttonID == 8) {
            this.minecraft.addMenu((GUIManager)(new ServerSelectionMenu(this.c)));
         } else {
            this.d.a(var1);
         }

      }
   }

   public void a(boolean var1, int var2) {
      if(this.k) {
         this.k = false;
         if(var1) {
            this.e.remove(var2);
            this.r();
         }

         this.minecraft.addMenu((GUIManager)this);
      } else if(this.n) {
         this.n = false;
         if(var1) {
            this.a(this.w);
         } else {
            this.minecraft.addMenu((GUIManager)this);
         }
      } else if(this.l) {
         this.l = false;
         if(var1) {
            this.e.add(this.w);
            this.r();
         }

         this.minecraft.addMenu((GUIManager)this);
      } else if(this.m) {
         this.m = false;
         if(var1) {
            oa var3 = (oa)this.e.get(this.f);
            var3.a = this.w.a;
            var3.b = this.w.b;
            this.r();
         }

         this.minecraft.addMenu((GUIManager)this);
      }

   }

   private int a(String var1, int var2) {
      try {
         return Integer.parseInt(var1.trim());
      } catch (Exception var4) {
         return var2;
      }
   }

   protected void a(char var1, int var2) {
      if(var1 == 13) {
         this.clickButton((Button)this.buttonList.get(2));
      }

   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      this.o = null;
      LocalizationManager var4 = LocalizationManager.getInstance();
      this.k();
      this.d.a(var1, var2, var3);
      this.a(this.u, var4.getLocaleStringByName("multiplayer.title"), this.q / 2, 20, 16777215);
      super.a(var1, var2, var3);
      if(this.o != null) {
         this.a(this.o, var1, var2);
      }

   }

   private void a(int var1) {
      this.a((oa)this.e.get(var1));
   }

   private void a(oa var1) {
      String var2 = var1.b;
      String[] var3 = var2.split(":");
      if(var2.startsWith("[")) {
         int var4 = var2.indexOf("]");
         if(var4 > 0) {
            String var5 = var2.substring(1, var4);
            String var6 = var2.substring(var4 + 1).trim();
            if(var6.startsWith(":") && var6.length() > 0) {
               var6 = var6.substring(1);
               var3 = new String[]{var5, var6};
            } else {
               var3 = new String[]{var5};
            }
         }
      }

      if(var3.length > 2) {
         var3 = new String[]{var2};
      }

      this.minecraft.addMenu((GUIManager)(new ajy(this.minecraft, var3[0], var3.length > 1?this.a(var3[1], 25565):25565)));
   }

   private void b(oa var1) throws IOException {
      String var2 = var1.b;
      String[] var3 = var2.split(":");
      if(var2.startsWith("[")) {
         int var4 = var2.indexOf("]");
         if(var4 > 0) {
            String var5 = var2.substring(1, var4);
            String var6 = var2.substring(var4 + 1).trim();
            if(var6.startsWith(":") && var6.length() > 0) {
               var6 = var6.substring(1);
               var3 = new String[]{var5, var6};
            } else {
               var3 = new String[]{var5};
            }
         }
      }

      if(var3.length > 2) {
         var3 = new String[]{var2};
      }

      String var29 = var3[0];
      int var30 = var3.length > 1?this.a(var3[1], 25565):25565;
      Socket var31 = null;
      DataInputStream var7 = null;
      DataOutputStream var8 = null;

      try {
         var31 = new Socket();
         var31.setSoTimeout(3000);
         var31.setTcpNoDelay(true);
         var31.setTrafficClass(18);
         var31.connect(new InetSocketAddress(var29, var30), 3000);
         var7 = new DataInputStream(var31.getInputStream());
         var8 = new DataOutputStream(var31.getOutputStream());
         var8.write(254);
         if(var7.read() != 255) {
            throw new IOException("Bad message");
         }

         String var9 = abs.a(var7, 256);
         char[] var10 = var9.toCharArray();

         int var11;
         for(var11 = 0; var11 < var10.length; ++var11) {
            if(var10[var11] != 167 && xn.a.indexOf(var10[var11]) < 0) {
               var10[var11] = 63;
            }
         }

         var9 = new String(var10);
         var3 = var9.split("§");
         var9 = var3[0];
         var11 = -1;
         int var12 = -1;

         try {
            var11 = Integer.parseInt(var3[1]);
            var12 = Integer.parseInt(var3[2]);
         } catch (Exception var27) {
            ;
         }

         var1.d = "§7" + var9;
         if(var11 >= 0 && var12 > 0) {
            var1.c = "§7" + var11 + "§8/§7" + var12;
         } else {
            var1.c = "§8???";
         }
      } finally {
         try {
            if(var7 != null) {
               var7.close();
            }
         } catch (Throwable var26) {
            ;
         }

         try {
            if(var8 != null) {
               var8.close();
            }
         } catch (Throwable var25) {
            ;
         }

         try {
            if(var31 != null) {
               var31.close();
            }
         } catch (Throwable var24) {
            ;
         }

      }

   }

   protected void a(String var1, int var2, int var3) {
      if(var1 != null) {
         int var4 = var2 + 12;
         int var5 = var3 - 12;
         int var6 = this.u.a(var1);
         this.a(var4 - 3, var5 - 3, var4 + var6 + 3, var5 + 8 + 3, -1073741824, -1073741824);
         this.u.a(var1, var4, var5, -1);
      }
   }

   // $FF: synthetic method
   static List a(ServerSelectionMenu var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static int a(ServerSelectionMenu var0, int var1) {
      return var0.f = var1;
   }

   // $FF: synthetic method
   static int b(ServerSelectionMenu var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static Button c(ServerSelectionMenu var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static Button d(ServerSelectionMenu var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static Button e(ServerSelectionMenu var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static void b(ServerSelectionMenu var0, int var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static Object g() {
      return b;
   }

   // $FF: synthetic method
   static int n() {
      return a;
   }

   // $FF: synthetic method
   static int o() {
      return a++;
   }

   // $FF: synthetic method
   static void a(ServerSelectionMenu var0, oa var1) throws IOException {
      var0.b(var1);
   }

   // $FF: synthetic method
   static int p() {
      return a--;
   }

   // $FF: synthetic method
   static String a(ServerSelectionMenu var0, String var1) {
      return var0.o = var1;
   }

}
