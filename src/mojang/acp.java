package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class acp extends vp {

   private static int a = 0;
   private static Object b = new Object();
   private vp c;
   private qh d;
   private List e = new ArrayList();
   private int f = -1;
   private abp h;
   private abp i;
   private abp j;
   private boolean k = false;
   private boolean l = false;
   private boolean m = false;
   private boolean n = false;
   private String o = null;
   private oa w = null;


   public acp(vp var1) {
      this.c = var1;
   }

   public void a() {}

   public void c() {
      this.q();
      Keyboard.enableRepeatEvents(true);
      this.s.clear();
      this.d = new qh(this);
      this.d();
   }

   private void q() {
      try {
         ady var1 = at.a(new File(this.p.F, "servers.dat"));
         no var2 = var1.n("servers");
         this.e.clear();

         for(int var3 = 0; var3 < var2.d(); ++var3) {
            this.e.add(oa.a((ady)var2.a(var3)));
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   private void r() {
      try {
         no var1 = new no();

         for(int var2 = 0; var2 < this.e.size(); ++var2) {
            var1.a((gh)((oa)this.e.get(var2)).a());
         }

         ady var4 = new ady();
         var4.a("servers", (gh)var1);
         at.a(var4, new File(this.p.F, "servers.dat"));
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void d() {
      adn var1 = adn.a();
      this.s.add(this.h = new abp(7, this.q / 2 - 154, this.r - 28, 70, 20, var1.b("selectServer.edit")));
      this.s.add(this.j = new abp(2, this.q / 2 - 74, this.r - 28, 70, 20, var1.b("selectServer.delete")));
      this.s.add(this.i = new abp(1, this.q / 2 - 154, this.r - 52, 100, 20, var1.b("selectServer.select")));
      this.s.add(new abp(4, this.q / 2 - 50, this.r - 52, 100, 20, var1.b("selectServer.direct")));
      this.s.add(new abp(3, this.q / 2 + 4 + 50, this.r - 52, 100, 20, var1.b("selectServer.add")));
      this.s.add(new abp(8, this.q / 2 + 4, this.r - 28, 70, 20, var1.b("selectServer.refresh")));
      this.s.add(new abp(0, this.q / 2 + 4 + 76, this.r - 28, 75, 20, var1.b("mojang.gui.cancel")));
      boolean var2 = this.f >= 0 && this.f < this.d.a();
      this.i.h = var2;
      this.h.h = var2;
      this.j.h = var2;
   }

   public void e() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(abp var1) {
      if(var1.h) {
         if(var1.f == 2) {
            String var2 = ((oa)this.e.get(this.f)).a;
            if(var2 != null) {
               this.k = true;
               adn var3 = adn.a();
               String var4 = var3.b("selectServer.deleteQuestion");
               String var5 = "\'" + var2 + "\' " + var3.b("selectServer.deleteWarning");
               String var6 = var3.b("selectServer.deleteButton");
               String var7 = var3.b("mojang.gui.cancel");
               mi var8 = new mi(this, var4, var5, var6, var7, this.f);
               this.p.a((vp)var8);
            }
         } else if(var1.f == 1) {
            this.a(this.f);
         } else if(var1.f == 4) {
            this.n = true;
            this.p.a((vp)(new acz(this, this.w = new oa(cy.a("selectServer.defaultName"), ""))));
         } else if(var1.f == 3) {
            this.l = true;
            this.p.a((vp)(new xs(this, this.w = new oa(cy.a("selectServer.defaultName"), ""))));
         } else if(var1.f == 7) {
            this.m = true;
            oa var9 = (oa)this.e.get(this.f);
            this.p.a((vp)(new xs(this, this.w = new oa(var9.a, var9.b))));
         } else if(var1.f == 0) {
            this.p.a(this.c);
         } else if(var1.f == 8) {
            this.p.a((vp)(new acp(this.c)));
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

         this.p.a((vp)this);
      } else if(this.n) {
         this.n = false;
         if(var1) {
            this.a(this.w);
         } else {
            this.p.a((vp)this);
         }
      } else if(this.l) {
         this.l = false;
         if(var1) {
            this.e.add(this.w);
            this.r();
         }

         this.p.a((vp)this);
      } else if(this.m) {
         this.m = false;
         if(var1) {
            oa var3 = (oa)this.e.get(this.f);
            var3.a = this.w.a;
            var3.b = this.w.b;
            this.r();
         }

         this.p.a((vp)this);
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
         this.a((abp)this.s.get(2));
      }

   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   public void a(int var1, int var2, float var3) {
      this.o = null;
      adn var4 = adn.a();
      this.k();
      this.d.a(var1, var2, var3);
      this.a(this.u, var4.b("multiplayer.title"), this.q / 2, 20, 16777215);
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

      this.p.a((vp)(new ajy(this.p, var3[0], var3.length > 1?this.a(var3[1], 25565):25565)));
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
   static List a(acp var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static int a(acp var0, int var1) {
      return var0.f = var1;
   }

   // $FF: synthetic method
   static int b(acp var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static abp c(acp var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static abp d(acp var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static abp e(acp var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static void b(acp var0, int var1) {
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
   static void a(acp var0, oa var1) throws IOException {
      var0.b(var1);
   }

   // $FF: synthetic method
   static int p() {
      return a--;
   }

   // $FF: synthetic method
   static String a(acp var0, String var1) {
      return var0.o = var1;
   }

}
