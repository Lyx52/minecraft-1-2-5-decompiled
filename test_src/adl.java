import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class adl extends oe {

   private boolean f = false;
   private lg g;
   public String a;
   private Minecraft h;
   private je i;
   private boolean j = false;
   public za b = new za((akp)null);
   private Map k = new HashMap();
   public List c = new ArrayList();
   public int d = 20;
   Random e = new Random();


   public adl(Minecraft var1, String var2, int var3) {
      this.h = var1;
      Socket var4 = new Socket(InetAddress.getByName(var2), var3);
      this.g = new lg(var4, "Client", this);
   }

   public void b() {
      if(!this.f) {
         this.g.b();
      }

      this.g.a();
   }

   public void a(aec var1) {
      this.h.c = new rk(this.h, this);
      this.h.K.a(gv.i, 1);
      this.i = new je(this, new fj(0L, var1.d, false, false, var1.c), var1.e, var1.f);
      this.i.F = true;
      this.h.a((xd)this.i);
      this.h.h.aB = var1.e;
      this.h.a((vp)(new ez(this)));
      this.h.h.f = var1.a;
      this.d = var1.h;
      ((rk)this.h.c).a(var1.d == 1);
   }

   public void a(jp var1) {
      double var2 = (double)var1.b / 32.0D;
      double var4 = (double)var1.c / 32.0D;
      double var6 = (double)var1.d / 32.0D;
      fq var8 = new fq(this.i, var2, var4, var6, new aan(var1.h, var1.i, var1.j));
      var8.r = (double)var1.e / 128.0D;
      var8.s = (double)var1.f / 128.0D;
      var8.t = (double)var1.g / 128.0D;
      var8.ah = var1.b;
      var8.ai = var1.c;
      var8.aj = var1.d;
      this.i.a(var1.a, var8);
   }

   public void a(np var1) {
      double var2 = (double)var1.b / 32.0D;
      double var4 = (double)var1.c / 32.0D;
      double var6 = (double)var1.d / 32.0D;
      Object var8 = null;
      if(var1.h == 10) {
         var8 = new ama(this.i, var2, var4, var6, 0);
      } else if(var1.h == 11) {
         var8 = new ama(this.i, var2, var4, var6, 1);
      } else if(var1.h == 12) {
         var8 = new ama(this.i, var2, var4, var6, 2);
      } else if(var1.h == 90) {
         var8 = new act(this.i, var2, var4, var6);
      } else if(var1.h == 60) {
         var8 = new nm(this.i, var2, var4, var6);
      } else if(var1.h == 61) {
         var8 = new uq(this.i, var2, var4, var6);
      } else if(var1.h == 65) {
         var8 = new adw(this.i, var2, var4, var6);
      } else if(var1.h == 72) {
         var8 = new va(this.i, var2, var4, var6);
      } else if(var1.h == 63) {
         var8 = new bt(this.i, var2, var4, var6, (double)var1.e / 8000.0D, (double)var1.f / 8000.0D, (double)var1.g / 8000.0D);
         var1.i = 0;
      } else if(var1.h == 64) {
         var8 = new qb(this.i, var2, var4, var6, (double)var1.e / 8000.0D, (double)var1.f / 8000.0D, (double)var1.g / 8000.0D);
         var1.i = 0;
      } else if(var1.h == 62) {
         var8 = new qe(this.i, var2, var4, var6);
      } else if(var1.h == 73) {
         var8 = new bj(this.i, var2, var4, var6, var1.i);
         var1.i = 0;
      } else if(var1.h == 75) {
         var8 = new hf(this.i, var2, var4, var6);
         var1.i = 0;
      } else if(var1.h == 1) {
         var8 = new ep(this.i, var2, var4, var6);
      } else if(var1.h == 50) {
         var8 = new agg(this.i, var2, var4, var6);
      } else if(var1.h == 51) {
         var8 = new el(this.i, var2, var4, var6);
      } else if(var1.h == 70) {
         var8 = new abf(this.i, var2, var4, var6, pb.E.bO);
      } else if(var1.h == 71) {
         var8 = new abf(this.i, var2, var4, var6, pb.F.bO);
      } else if(var1.h == 74) {
         var8 = new abf(this.i, var2, var4, var6, pb.bK.bO);
      }

      if(var8 != null) {
         ((nn)var8).ah = var1.b;
         ((nn)var8).ai = var1.c;
         ((nn)var8).aj = var1.d;
         ((nn)var8).u = 0.0F;
         ((nn)var8).v = 0.0F;
         nn[] var9 = ((nn)var8).Z();
         if(var9 != null) {
            int var10 = var1.a - ((nn)var8).f;

            for(int var11 = 0; var11 < var9.length; ++var11) {
               var9[var11].f += var10;
            }
         }

         ((nn)var8).f = var1.a;
         this.i.a(var1.a, (nn)var8);
         if(var1.i > 0) {
            if(var1.h == 60) {
               nn var12 = this.a(var1.i);
               if(var12 instanceof acq) {
                  ((nm)var8).c = (acq)var12;
               }
            }

            ((nn)var8).a((double)var1.e / 8000.0D, (double)var1.f / 8000.0D, (double)var1.g / 8000.0D);
         }
      }

   }

   public void a(lj var1) {
      bz var2 = new bz(this.i, (double)var1.b, (double)var1.c, (double)var1.d, var1.e);
      var2.ah = var1.b;
      var2.ai = var1.c;
      var2.aj = var1.d;
      var2.u = 0.0F;
      var2.v = 0.0F;
      var2.f = var1.a;
      this.i.a(var1.a, var2);
   }

   public void a(wz var1) {
      double var2 = (double)var1.b / 32.0D;
      double var4 = (double)var1.c / 32.0D;
      double var6 = (double)var1.d / 32.0D;
      d var8 = null;
      if(var1.e == 1) {
         var8 = new d(this.i, var2, var4, var6);
      }

      if(var8 != null) {
         var8.ah = var1.b;
         var8.ai = var1.c;
         var8.aj = var1.d;
         var8.u = 0.0F;
         var8.v = 0.0F;
         var8.f = var1.a;
         this.i.e(var8);
      }

   }

   public void a(qc var1) {
      mk var2 = new mk(this.i, var1.b, var1.c, var1.d, var1.e, var1.f);
      this.i.a(var1.a, var2);
   }

   public void a(yn var1) {
      nn var2 = this.a(var1.a);
      if(var2 != null) {
         var2.a((double)var1.b / 8000.0D, (double)var1.c / 8000.0D, (double)var1.d / 8000.0D);
      }
   }

   public void a(pf var1) {
      nn var2 = this.a(var1.a);
      if(var2 != null && var1.b() != null) {
         var2.y().a(var1.b());
      }

   }

   public void a(iy var1) {
      double var2 = (double)var1.c / 32.0D;
      double var4 = (double)var1.d / 32.0D;
      double var6 = (double)var1.e / 32.0D;
      float var8 = (float)(var1.f * 360) / 256.0F;
      float var9 = (float)(var1.g * 360) / 256.0F;
      rv var10 = new rv(this.h.f, var1.b);
      var10.l = var10.N = (double)(var10.ah = var1.c);
      var10.m = var10.O = (double)(var10.ai = var1.d);
      var10.n = var10.P = (double)(var10.aj = var1.e);
      int var11 = var1.h;
      if(var11 == 0) {
         var10.ap.a[var10.ap.c] = null;
      } else {
         var10.ap.a[var10.ap.c] = new aan(var11, 1, 0);
      }

      var10.b(var2, var4, var6, var8, var9);
      this.i.a(var1.a, var10);
   }

   public void a(mr var1) {
      nn var2 = this.a(var1.a);
      if(var2 != null) {
         var2.ah = var1.b;
         var2.ai = var1.c;
         var2.aj = var1.d;
         double var3 = (double)var2.ah / 32.0D;
         double var5 = (double)var2.ai / 32.0D + 0.015625D;
         double var7 = (double)var2.aj / 32.0D;
         float var9 = (float)(var1.e * 360) / 256.0F;
         float var10 = (float)(var1.f * 360) / 256.0F;
         var2.a(var3, var5, var7, var9, var10, 3);
      }
   }

   public void a(aip var1) {
      nn var2 = this.a(var1.a);
      if(var2 != null) {
         var2.ah += var1.b;
         var2.ai += var1.c;
         var2.aj += var1.d;
         double var3 = (double)var2.ah / 32.0D;
         double var5 = (double)var2.ai / 32.0D;
         double var7 = (double)var2.aj / 32.0D;
         float var9 = var1.g?(float)(var1.e * 360) / 256.0F:var2.u;
         float var10 = var1.g?(float)(var1.f * 360) / 256.0F:var2.v;
         var2.a(var3, var5, var7, var9, var10, 3);
      }
   }

   public void a(aji var1) {
      nn var2 = this.a(var1.a);
      if(var2 != null) {
         float var3 = (float)(var1.b * 360) / 256.0F;
         var2.f(var3);
      }
   }

   public void a(agx var1) {
      this.i.b(var1.a);
   }

   public void a(gg var1) {
      vq var2 = this.h.h;
      double var3 = var2.o;
      double var5 = var2.p;
      double var7 = var2.q;
      float var9 = var2.u;
      float var10 = var2.v;
      if(var1.h) {
         var3 = var1.a;
         var5 = var1.b;
         var7 = var1.c;
      }

      if(var1.i) {
         var9 = var1.e;
         var10 = var1.f;
      }

      var2.Q = 0.0F;
      var2.r = var2.s = var2.t = 0.0D;
      var2.b(var3, var5, var7, var9, var10);
      var1.a = var2.o;
      var1.b = var2.y.b;
      var1.c = var2.q;
      var1.d = var2.p;
      this.g.a((abs)var1);
      if(!this.j) {
         this.h.h.l = this.h.h.o;
         this.h.h.m = this.h.h.p;
         this.h.h.n = this.h.h.q;
         this.j = true;
         this.h.a((vp)null);
      }

   }

   public void a(ahc var1) {
      this.i.a(var1.a, var1.b, var1.c);
   }

   public void a(akt var1) {
      int var2 = var1.a * 16;
      int var3 = var1.b * 16;
      if(var1.c != null) {
         DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var1.c));

         try {
            for(int var5 = 0; var5 < var1.d; ++var5) {
               short var6 = var4.readShort();
               short var7 = var4.readShort();
               int var8 = (var7 & 4095) >> 4;
               int var9 = var7 & 15;
               int var10 = var6 >> 12 & 15;
               int var11 = var6 >> 8 & 15;
               int var12 = var6 & 255;
               this.i.c(var10 + var2, var12, var11 + var3, var8, var9);
            }
         } catch (IOException var13) {
            ;
         }

      }
   }

   public void a(sz var1) {
      this.i.a(var1.a << 4, 0, var1.b << 4, (var1.a << 4) + 15, 256, (var1.b << 4) + 15);
      ack var2 = this.i.d(var1.a, var1.b);
      if(var1.f && var2 == null) {
         this.i.a(var1.a, var1.b, true);
         var2 = this.i.d(var1.a, var1.b);
      }

      if(var2 != null) {
         var2.a(var1.e, var1.c, var1.d, var1.f);
         this.i.c(var1.a << 4, 0, var1.b << 4, (var1.a << 4) + 15, 256, (var1.b << 4) + 15);
         if(!var1.f || !(this.i.t instanceof ms)) {
            var2.n();
         }
      }

   }

   public void a(ol var1) {
      this.i.c(var1.a, var1.b, var1.c, var1.d, var1.e);
   }

   public void a(amg var1) {
      this.g.a("disconnect.kicked", new Object[0]);
      this.f = true;
      this.h.a((xd)null);
      this.h.a((vp)(new dw("disconnect.disconnected", "disconnect.genericReason", new Object[]{var1.a})));
   }

   public void a(String var1, Object[] var2) {
      if(!this.f) {
         this.f = true;
         this.h.a((xd)null);
         this.h.a((vp)(new dw("disconnect.lost", var1, var2)));
      }
   }

   public void b(abs var1) {
      if(!this.f) {
         this.g.a(var1);
         this.g.c();
      }
   }

   public void c(abs var1) {
      if(!this.f) {
         this.g.a(var1);
      }
   }

   public void a(vv var1) {
      nn var2 = this.a(var1.a);
      Object var3 = (acq)this.a(var1.b);
      if(var3 == null) {
         var3 = this.h.h;
      }

      if(var2 != null) {
         if(var2 instanceof bz) {
            this.i.a(var2, "random.orb", 0.2F, ((this.e.nextFloat() - this.e.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         } else {
            this.i.a(var2, "random.pop", 0.2F, ((this.e.nextFloat() - this.e.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         }

         this.h.j.a((rt)(new ws(this.h.f, var2, (nn)var3, -0.5F)));
         this.i.b(var1.a);
      }

   }

   public void a(afd var1) {
      this.h.w.a(var1.a);
   }

   public void a(kc var1) {
      nn var2 = this.a(var1.a);
      if(var2 != null) {
         yw var3;
         if(var1.b == 1) {
            var3 = (yw)var2;
            var3.ax();
         } else if(var1.b == 2) {
            var2.k();
         } else if(var1.b == 3) {
            var3 = (yw)var2;
            var3.a(false, false, false);
         } else if(var1.b == 4) {
            var3 = (yw)var2;
            var3.ab();
         } else if(var1.b == 6) {
            this.h.j.a((rt)(new fs(this.h.f, var2)));
         } else if(var1.b == 7) {
            fs var4 = new fs(this.h.f, var2, "magicCrit");
            this.h.j.a((rt)var4);
         } else if(var1.b == 5 && var2 instanceof rv) {
            ;
         }

      }
   }

   public void a(abj var1) {
      nn var2 = this.a(var1.a);
      if(var2 != null) {
         if(var1.e == 0) {
            yw var3 = (yw)var2;
            var3.d(var1.b, var1.c, var1.d);
         }

      }
   }

   public void a(jf var1) {
      boolean var2 = true;
      String var3 = var1.a;
      if(var3 != null && var3.trim().length() != 0) {
         if(!var3.equals("-")) {
            try {
               Long.parseLong(var3, 16);
            } catch (NumberFormatException var8) {
               var2 = false;
            }
         }
      } else {
         var2 = false;
      }

      if(!var2) {
         this.g.a("disconnect.genericReason", new Object[]{"The server responded with an invalid server key"});
      } else if(var1.a.equals("-")) {
         this.c(new aec(this.h.k.b, 29));
      } else {
         try {
            URL var4 = new URL("http://session.minecraft.net/game/joinserver.jsp?user=" + this.h.k.b + "&sessionId=" + this.h.k.c + "&serverId=" + var1.a);
            BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.openStream()));
            String var6 = var5.readLine();
            var5.close();
            if(var6.equalsIgnoreCase("ok")) {
               this.c(new aec(this.h.k.b, 29));
            } else {
               this.g.a("disconnect.loginFailedInfo", new Object[]{var6});
            }
         } catch (Exception var7) {
            var7.printStackTrace();
            this.g.a("disconnect.genericReason", new Object[]{"Internal client error: " + var7.toString()});
         }
      }

   }

   public void c() {
      this.f = true;
      this.g.a();
      this.g.a("disconnect.closed", new Object[0]);
   }

   public void a(aay var1) {
      double var2 = (double)var1.c / 32.0D;
      double var4 = (double)var1.d / 32.0D;
      double var6 = (double)var1.e / 32.0D;
      float var8 = (float)(var1.f * 360) / 256.0F;
      float var9 = (float)(var1.g * 360) / 256.0F;
      acq var10 = (acq)aao.a(var1.b, this.h.f);
      var10.ah = var1.c;
      var10.ai = var1.d;
      var10.aj = var1.e;
      var10.bf = (float)(var1.h * 360) / 256.0F;
      nn[] var11 = var10.Z();
      if(var11 != null) {
         int var12 = var1.a - var10.f;

         for(int var13 = 0; var13 < var11.length; ++var13) {
            var11[var13].f += var12;
         }
      }

      var10.f = var1.a;
      var10.b(var2, var4, var6, var8, var9);
      this.i.a(var1.a, var10);
      List var14 = var1.b();
      if(var14 != null) {
         var10.y().a(var14);
      }

   }

   public void a(zf var1) {
      this.h.f.a(var1.a);
   }

   public void a(agl var1) {
      this.h.h.a(new uh(var1.a, var1.b, var1.c));
      this.h.f.B().a(var1.a, var1.b, var1.c);
   }

   public void a(adv var1) {
      Object var2 = this.a(var1.a);
      nn var3 = this.a(var1.b);
      if(var1.a == this.h.h.f) {
         var2 = this.h.h;
      }

      if(var2 != null) {
         ((nn)var2).h(var3);
      }
   }

   public void a(gt var1) {
      nn var2 = this.a(var1.a);
      if(var2 != null) {
         var2.a(var1.b);
      }

   }

   private nn a(int var1) {
      return (nn)(var1 == this.h.h.f?this.h.h:this.i.a(var1));
   }

   public void a(ds var1) {
      this.h.h.d(var1.a);
      this.h.h.aF().a(var1.b);
      this.h.h.aF().b(var1.c);
   }

   public void a(ih var1) {
      this.h.h.a(var1.a, var1.b, var1.c);
   }

   public void a(kx var1) {
      if(var1.a != this.h.h.aB) {
         this.j = false;
         this.i = new je(this, new fj(0L, var1.d, false, false, var1.e), var1.a, var1.b);
         this.i.F = true;
         this.h.a((xd)this.i);
         this.h.h.aB = var1.a;
         this.h.a((vp)(new ez(this)));
      }

      this.h.a(true, var1.a, false);
      ((rk)this.h.c).a(var1.d == 1);
   }

   public void a(ags var1) {
      agh var2 = new agh(this.h.f, (nn)null, var1.a, var1.b, var1.c, var1.d);
      var2.g = var1.e;
      var2.a(true);
   }

   public void a(gr var1) {
      vq var2 = this.h.h;
      switch(var1.b) {
      case 0:
         var2.a((io)(new me(var1.c, var1.d)));
         var2.ar.f = var1.a;
         break;
      case 1:
         var2.a(gk.c(var2.o), gk.c(var2.p), gk.c(var2.q));
         var2.ar.f = var1.a;
         break;
      case 2:
         var2.a(new ahg());
         var2.ar.f = var1.a;
         break;
      case 3:
         var2.a(new az());
         var2.ar.f = var1.a;
         break;
      case 4:
         var2.c(gk.c(var2.o), gk.c(var2.p), gk.c(var2.q));
         var2.ar.f = var1.a;
         break;
      case 5:
         var2.a(new amc());
         var2.ar.f = var1.a;
      }

   }

   public void a(fu var1) {
      vq var2 = this.h.h;
      if(var1.a == -1) {
         var2.ap.b(var1.c);
      } else if(var1.a == 0 && var1.b >= 36 && var1.b < 45) {
         aan var3 = var2.aq.b(var1.b).b();
         if(var1.c != null && (var3 == null || var3.a < var1.c.a)) {
            var1.c.b = 5;
         }

         var2.aq.a(var1.b, var1.c);
      } else if(var1.a == var2.ar.f) {
         var2.ar.a(var1.b, var1.c);
      }

   }

   public void a(kn var1) {
      dd var2 = null;
      vq var3 = this.h.h;
      if(var1.a == 0) {
         var2 = var3.aq;
      } else if(var1.a == var3.ar.f) {
         var2 = var3.ar;
      }

      if(var2 != null) {
         if(var1.c) {
            var2.a(var1.b);
         } else {
            var2.b(var1.b);
            this.c(new kn(var1.a, var1.b, true));
         }
      }

   }

   public void a(abl var1) {
      vq var2 = this.h.h;
      if(var1.a == 0) {
         var2.aq.a(var1.b);
      } else if(var1.a == var2.ar.f) {
         var2.ar.a(var1.b);
      }

   }

   public void a(aiu var1) {
      if(this.h.f.j(var1.a, var1.b, var1.c)) {
         kw var2 = this.h.f.b(var1.a, var1.b, var1.c);
         if(var2 instanceof sc) {
            sc var3 = (sc)var2;
            if(var3.a()) {
               for(int var4 = 0; var4 < 4; ++var4) {
                  var3.a[var4] = var1.d[var4];
               }

               var3.j();
            }
         }
      }

   }

   public void a(ait var1) {
      if(this.h.f.j(var1.a, var1.b, var1.c)) {
         kw var2 = this.h.f.b(var1.a, var1.b, var1.c);
         if(var2 != null && var1.d == 1 && var2 instanceof cj) {
            ((cj)var2).a(aao.a(var1.e));
         }
      }

   }

   public void a(jl var1) {
      vq var2 = this.h.h;
      this.a((abs)var1);
      if(var2.ar != null && var2.ar.f == var1.a) {
         var2.ar.a(var1.b, var1.c);
      }

   }

   public void a(ta var1) {
      nn var2 = this.a(var1.a);
      if(var2 != null) {
         var2.b(var1.b, var1.c, var1.d);
      }

   }

   public void a(add var1) {
      this.h.h.af();
   }

   public void a(qi var1) {
      this.h.f.f(var1.a, var1.b, var1.c, var1.d, var1.e);
   }

   public void a(us var1) {
      vq var2 = this.h.h;
      int var3 = var1.b;
      if(var3 >= 0 && var3 < us.a.length && us.a[var3] != null) {
         var2.b(us.a[var3]);
      }

      if(var3 == 1) {
         this.i.B().b(true);
         this.i.k(1.0F);
      } else if(var3 == 2) {
         this.i.B().b(false);
         this.i.k(0.0F);
      } else if(var3 == 3) {
         ((rk)this.h.c).a(var1.c == 1);
      } else if(var3 == 4) {
         this.h.a((vp)(new c()));
      }

   }

   public void a(ai var1) {
      if(var1.a == yr.bd.bQ) {
         ra.a(var1.b, this.h.f).a(var1.c);
      } else {
         System.out.println("Unknown itemid: " + var1.b);
      }

   }

   public void a(ej var1) {
      this.h.f.g(var1.a, var1.c, var1.d, var1.e, var1.b);
   }

   public void a(kk var1) {
      ((ahv)this.h.h).b(gv.a(var1.a), var1.b);
   }

   public void a(wb var1) {
      nn var2 = this.a(var1.a);
      if(var2 != null && var2 instanceof acq) {
         ((acq)var2).b(new alg(var1.b, var1.d, var1.c));
      }
   }

   public void a(ado var1) {
      nn var2 = this.a(var1.a);
      if(var2 != null && var2 instanceof acq) {
         ((acq)var2).m(var1.b);
      }
   }

   public boolean a() {
      return false;
   }

   public void a(wj var1) {
      ah var2 = (ah)this.k.get(var1.a);
      if(var2 == null && var1.b) {
         var2 = new ah(var1.a);
         this.k.put(var1.a, var2);
         this.c.add(var2);
      }

      if(var2 != null && !var1.b) {
         this.k.remove(var1.a);
         this.c.remove(var2);
      }

      if(var1.b && var2 != null) {
         var2.b = var1.c;
      }

   }

   public void a(acw var1) {
      this.c(new acw(var1.a));
   }

   public void a(ym var1) {
      vq var2 = this.h.h;
      var2.aT.b = var1.b;
      var2.aT.d = var1.d;
      var2.aT.a = var1.a;
      var2.aT.c = var1.c;
   }
}
