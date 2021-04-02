package mojang;

import mojang.net.minecraft.client.Minecraft;

public class ahv extends vq {

   public adl cl;
   private int cm = 0;
   private double co;
   private double cp;
   private double cq;
   private double cr;
   private float cs;
   private float ct;
   private boolean cu = false;
   private boolean cv = false;
   private boolean cw = false;
   private int cx = 0;
   private boolean cn = false;


   public ahv(Minecraft var1, xd var2, fc var3, adl var4) {
      super(var1, var2, var3, 0);
      this.cl = var4;
   }

   public boolean a(md var1, int var2) {
      return false;
   }

   public void k(int var1) {}

   public void J_() {
      if(this.k.j(gk.c(this.o), 0, gk.c(this.q))) {
         super.J_();
         this.bj();
      }
   }

   public void bj() {
      if(this.cm++ == 20) {
         this.cm = 0;
      }

      boolean var1 = this.W();
      if(var1 != this.cw) {
         if(var1) {
            this.cl.c(new aig(this, 4));
         } else {
            this.cl.c(new aig(this, 5));
         }

         this.cw = var1;
      }

      boolean var2 = this.V();
      if(var2 != this.cv) {
         if(var2) {
            this.cl.c(new aig(this, 1));
         } else {
            this.cl.c(new aig(this, 2));
         }

         this.cv = var2;
      }

      double var3 = this.o - this.co;
      double var5 = this.y.b - this.cp;
      double var7 = this.p - this.cq;
      double var9 = this.q - this.cr;
      double var11 = (double)(this.u - this.cs);
      double var13 = (double)(this.v - this.ct);
      boolean var15 = var5 != 0.0D || var7 != 0.0D || var3 != 0.0D || var9 != 0.0D;
      boolean var16 = var11 != 0.0D || var13 != 0.0D;
      if(this.j != null) {
         if(var16) {
            this.cl.c(new ag(this.r, -999.0D, -999.0D, this.t, this.z));
         } else {
            this.cl.c(new du(this.r, -999.0D, -999.0D, this.t, this.u, this.v, this.z));
         }

         var15 = false;
      } else if(var15 && var16) {
         this.cl.c(new du(this.o, this.y.b, this.p, this.q, this.u, this.v, this.z));
         this.cx = 0;
      } else if(var15) {
         this.cl.c(new ag(this.o, this.y.b, this.p, this.q, this.z));
         this.cx = 0;
      } else if(var16) {
         this.cl.c(new pq(this.u, this.v, this.z));
         this.cx = 0;
      } else {
         this.cl.c(new gg(this.z));
         if(this.cu == this.z && this.cx <= 200) {
            ++this.cx;
         } else {
            this.cx = 0;
         }
      }

      this.cu = this.z;
      if(var15) {
         this.co = this.o;
         this.cp = this.y.b;
         this.cq = this.p;
         this.cr = this.q;
      }

      if(var16) {
         this.cs = this.u;
         this.ct = this.v;
      }

   }

   public fq as() {
      this.cl.c(new hc(4, 0, 0, 0, 0));
      return null;
   }

   protected void a(fq var1) {}

   public void a(String var1) {
      if(this.b.w.c().size() == 0 || !((String)this.b.w.c().get(this.b.w.c().size() - 1)).equals(var1)) {
         this.b.w.c().add(var1);
      }

      this.cl.c(new afd(var1));
   }

   public void ax() {
      super.ax();
      this.cl.c(new kc(this, 1));
   }

   public void ag() {
      this.cl.c(new kx(this.aB, (byte)this.k.q, this.k.B().t(), this.k.b(), 0));
   }

   protected void c(md var1, int var2) {
      this.l(this.bb() - var2);
   }

   public void af() {
      this.cl.c(new add(this.ar.f));
      this.ap.b((aan)null);
      super.af();
   }

   public void d(int var1) {
      if(this.cn) {
         super.d(var1);
      } else {
         this.l(var1);
         this.cn = true;
      }

   }

   public void a(ajw var1, int var2) {
      if(var1 != null) {
         if(var1.f) {
            super.a(var1, var2);
         }

      }
   }

   public void b(ajw var1, int var2) {
      if(var1 != null) {
         if(!var1.f) {
            super.a(var1, var2);
         }

      }
   }

   public void aI() {
      this.cl.c(new ym(this.aT));
   }
}
