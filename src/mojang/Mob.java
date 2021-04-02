package mojang;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class Mob extends BaseEntity {

   public int ba = 20;
   public float bb;
   public float bc;
   public float bd = 0.0F;
   public float be = 0.0F;
   public float bf = 0.0F;
   public float bg = 0.0F;
   protected float bh;
   protected float bi;
   protected float bj;
   protected float bk;
   protected boolean bl = true;
   protected String bm = "/mojang/mob/char.png";
   protected boolean bn = true;
   protected float bo = 0.0F;
   protected String bp = null;
   protected float bq = 1.0F;
   protected int br = 0;
   protected float bs = 0.0F;
   public float bt = 0.1F;
   public float bu = 0.02F;
   public float bv;
   public float bw;
   protected int bx = this.d();
   public int by;
   protected int bz;
   private int a;
   public int bA;
   public int bB;
   public float bC = 0.0F;
   public int bD = 0;
   public int bE = 0;
   public float bF;
   public float bG;
   protected boolean bH = false;
   protected int bI;
   public int bJ = -1;
   public float bK = (float)(Math.random() * 0.8999999761581421D + 0.10000000149011612D);
   public float bL;
   public float bM;
   public float bN;
   protected Player bO = null;
   protected int bP = 0;
   private Mob b = null;
   private int c = 0;
   private Mob d = null;
   public int bQ = 0;
   public int bR = 0;
   protected HashMap bS = new HashMap();
   private boolean e = true;
   private int am;
   private vz an;
   private j ao;
   private aej ap;
   private vh aq;
   private rh ar;
   protected nb bT = new nb();
   protected nb bU = new nb();
   private Mob as;
   private abk at;
   private float au;
   private uh av = new uh(0, 0, 0);
   private float aw = -1.0F;
   protected int bV;
   protected double bW;
   protected double bX;
   protected double bY;
   protected double bZ;
   protected double ca;
   float cb = 0.0F;
   protected int cc = 0;
   protected int cd = 0;
   protected float ce;
   protected float cf;
   protected float cg;
   protected boolean ch = false;
   protected float ci = 0.0F;
   protected float cj = 0.7F;
   private int ax = 0;
   private BaseEntity ay;
   protected int ck = 0;


   public Mob(World var1) {
      super(var1);
      this.h = true;
      this.an = new vz(this);
      this.ao = new j(this);
      this.ap = new aej(this);
      this.aq = new vh(this);
      this.ar = new rh(this, var1, 16.0F);
      this.at = new abk(this);
      this.bc = (float)(Math.random() + 1.0D) * 0.01F;
      this.d(this.o, this.p, this.q);
      this.bb = (float)Math.random() * 12398.0F;
      this.u = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.bf = this.u;
      this.R = 0.5F;
   }

   public vz aJ() {
      return this.an;
   }

   public j aK() {
      return this.ao;
   }

   public aej aL() {
      return this.ap;
   }

   public rh aM() {
      return this.ar;
   }

   public abk aN() {
      return this.at;
   }

   public Random aO() {
      return this.U;
   }

   public Mob aP() {
      return this.b;
   }

   public Mob aQ() {
      return this.d;
   }

   public void l(BaseEntity var1) {
      if(var1 instanceof Mob) {
         this.d = (Mob)var1;
      }

   }

   public int aR() {
      return this.cd;
   }

   public void f(float var1) {
      this.bf = var1;
   }

   public float aS() {
      return this.au;
   }

   public void g(float var1) {
      this.au = var1;
      this.h(var1);
   }

   public boolean c(BaseEntity var1) {
      this.l(var1);
      return false;
   }

   public Mob aT() {
      return this.as;
   }

   public void c(Mob var1) {
      this.as = var1;
   }

   public boolean a(Class var1) {
      return Creeper.class != var1 && Ghast.class != var1;
   }

   public void v() {}

   public boolean aU() {
      return this.f(Utils.c(this.o), Utils.c(this.p), Utils.c(this.q));
   }

   public boolean f(int var1, int var2, int var3) {
      return this.aw == -1.0F?true:this.av.c(var1, var2, var3) < this.aw * this.aw;
   }

   public void b(int var1, int var2, int var3, int var4) {
      this.av.a(var1, var2, var3);
      this.aw = (float)var4;
   }

   public uh aV() {
      return this.av;
   }

   public float aW() {
      return this.aw;
   }

   public void aX() {
      this.aw = -1.0F;
   }

   public boolean aY() {
      return this.aw != -1.0F;
   }

   public void a(Mob var1) {
      this.b = var1;
      this.c = this.b != null?60:0;
   }

   protected void b() {
      this.ac.a(8, Integer.valueOf(this.am));
   }

   public boolean m(BaseEntity var1) {
      return this.k.a(mojang.bo.b(this.o, this.p + (double)this.I(), this.q), mojang.bo.b(var1.o, var1.p + (double)var1.I(), var1.q)) == null;
   }

   public String v_() {
      return this.bm;
   }

   public boolean l_() {
      return !this.G;
   }

   public boolean d_() {
      return !this.G;
   }

   public float I() {
      return this.J * 0.85F;
   }

   public int j() {
      return 80;
   }

   public void aZ() {
      String var1 = this.m();
      if(var1 != null) {
         this.k.a(this, var1, this.C_(), this.af());
      }

   }

   public void B() {
      this.bv = this.bw;
      super.B();
      lv.a("mobBaseTick");
      if(this.M() && this.U.nextInt(1000) < this.a++) {
         this.a = -this.j();
         this.aZ();
      }

      if(this.M() && this.N() && this.a(md.e, 1)) {
         ;
      }

      if(this.F() || this.k.F) {
         this.D();
      }

      if(this.M() && this.a(acn.g) && !this.r_() && !this.bS.containsKey(Integer.valueOf(aad.o.H))) {
         this.g(this.b(this.Y()));
         if(this.Y() == -20) {
            this.g(0);

            for(int var1 = 0; var1 < 8; ++var1) {
               float var2 = this.U.nextFloat() - this.U.nextFloat();
               float var3 = this.U.nextFloat() - this.U.nextFloat();
               float var4 = this.U.nextFloat() - this.U.nextFloat();
               this.k.a("bubble", this.o + (double)var2, this.p + (double)var3, this.q + (double)var4, this.r, this.s, this.t);
            }

            this.a(md.f, 2);
         }

         this.D();
      } else {
         this.g(300);
      }

      this.bF = this.bG;
      if(this.bE > 0) {
         --this.bE;
      }

      if(this.bA > 0) {
         --this.bA;
      }

      if(this.Y > 0) {
         --this.Y;
      }

      if(this.bx <= 0) {
         this.w_();
      }

      if(this.bP > 0) {
         --this.bP;
      } else {
         this.bO = null;
      }

      if(this.d != null && !this.d.M()) {
         this.d = null;
      }

      if(this.b != null) {
         if(!this.b.M()) {
            this.a((Mob)null);
         } else if(this.c > 0) {
            --this.c;
         } else {
            this.a((Mob)null);
         }
      }

      this.be();
      this.bk = this.bj;
      this.be = this.bd;
      this.bg = this.bf;
      this.w = this.u;
      this.x = this.v;
      lv.b();
   }

   protected void w_() {
      ++this.bD;
      if(this.bD == 20) {
         int var1;
         if(!this.k.F && (this.bP > 0 || this.aH()) && !this.bi()) {
            var1 = this.b(this.bO);

            while(var1 > 0) {
               int var2 = XPOrb.b(var1);
               var1 -= var2;
               this.k.a((BaseEntity)(new XPOrb(this.k, this.o, this.p, this.q, var2)));
            }
         }

         this.bc();
         this.A();

         for(var1 = 0; var1 < 20; ++var1) {
            double var8 = this.U.nextGaussian() * 0.02D;
            double var4 = this.U.nextGaussian() * 0.02D;
            double var6 = this.U.nextGaussian() * 0.02D;
            this.k.a("explode", this.o + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, this.p + (double)(this.U.nextFloat() * this.J), this.q + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, var8, var4, var6);
         }
      }

   }

   protected int b(int var1) {
      return var1 - 1;
   }

   protected int b(Player var1) {
      return this.bI;
   }

   protected boolean aH() {
      return false;
   }

   public void ba() {
      for(int var1 = 0; var1 < 20; ++var1) {
         double var2 = this.U.nextGaussian() * 0.02D;
         double var4 = this.U.nextGaussian() * 0.02D;
         double var6 = this.U.nextGaussian() * 0.02D;
         double var8 = 10.0D;
         this.k.a("explode", this.o + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I - var2 * var8, this.p + (double)(this.U.nextFloat() * this.J) - var4 * var8, this.q + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I - var6 * var8, var2, var4, var6);
      }

   }

   public void O() {
      super.O();
      this.bh = this.bi;
      this.bi = 0.0F;
      this.fallDistance = 0.0F;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.H = 0.0F;
      this.bW = var1;
      this.bX = var3;
      this.bY = var5;
      this.bZ = (double)var7;
      this.ca = (double)var8;
      this.bV = var9;
   }

   public void J_() {
      super.J_();
      if(this.bQ > 0) {
         if(this.bR <= 0) {
            this.bR = 60;
         }

         --this.bR;
         if(this.bR <= 0) {
            --this.bQ;
         }
      }

      this.e();
      double var1 = this.o - this.sandX;
      double var3 = this.q - this.sandZ;
      float var5 = Utils.sqrt(var1 * var1 + var3 * var3);
      float var6 = this.bd;
      float var7 = 0.0F;
      this.bh = this.bi;
      float var8 = 0.0F;
      if(var5 > 0.05F) {
         var8 = 1.0F;
         var7 = var5 * 3.0F;
         var6 = (float)Math.atan2(var3, var1) * 180.0F / 3.1415927F - 90.0F;
      }

      if(this.bw > 0.0F) {
         var6 = this.u;
      }

      if(!this.z) {
         var8 = 0.0F;
      }

      this.bi += (var8 - this.bi) * 0.3F;
      if(this.b_()) {
         this.aq.a();
      } else {
         float var9;
         for(var9 = var6 - this.bd; var9 < -180.0F; var9 += 360.0F) {
            ;
         }

         while(var9 >= 180.0F) {
            var9 -= 360.0F;
         }

         this.bd += var9 * 0.3F;

         float var10;
         for(var10 = this.u - this.bd; var10 < -180.0F; var10 += 360.0F) {
            ;
         }

         while(var10 >= 180.0F) {
            var10 -= 360.0F;
         }

         boolean var11 = var10 < -90.0F || var10 >= 90.0F;
         if(var10 < -75.0F) {
            var10 = -75.0F;
         }

         if(var10 >= 75.0F) {
            var10 = 75.0F;
         }

         this.bd = this.u - var10;
         if(var10 * var10 > 2500.0F) {
            this.bd += var10 * 0.2F;
         }

         if(var11) {
            var7 *= -1.0F;
         }
      }

      while(this.u - this.w < -180.0F) {
         this.w -= 360.0F;
      }

      while(this.u - this.w >= 180.0F) {
         this.w += 360.0F;
      }

      while(this.bd - this.be < -180.0F) {
         this.be -= 360.0F;
      }

      while(this.bd - this.be >= 180.0F) {
         this.be += 360.0F;
      }

      while(this.v - this.x < -180.0F) {
         this.x -= 360.0F;
      }

      while(this.v - this.x >= 180.0F) {
         this.x += 360.0F;
      }

      while(this.bf - this.bg < -180.0F) {
         this.bg -= 360.0F;
      }

      while(this.bf - this.bg >= 180.0F) {
         this.bg += 360.0F;
      }

      this.bj += var7;
   }

   protected void a(float var1, float var2) {
      super.a(var1, var2);
   }

   public void k(int var1) {
      if(this.bx > 0) {
         this.bx += var1;
         if(this.bx > this.d()) {
            this.bx = this.d();
         }

         this.Y = this.ba / 2;
      }
   }

   public abstract int d();

   public int bb() {
      return this.bx;
   }

   public void l(int var1) {
      this.bx = var1;
      if(var1 > this.d()) {
         var1 = this.d();
      }

   }

   public boolean a(md var1, int var2) {
      if(this.k.F) {
         return false;
      } else {
         this.cd = 0;
         if(this.bx <= 0) {
            return false;
         } else if(var1.k() && this.a(aad.n)) {
            return false;
         } else {
            this.bM = 1.5F;
            boolean var3 = true;
            if((float)this.Y > (float)this.ba / 2.0F) {
               if(var2 <= this.cc) {
                  return false;
               }

               this.c(var1, var2 - this.cc);
               this.cc = var2;
               var3 = false;
            } else {
               this.cc = var2;
               this.by = this.bx;
               this.Y = this.ba;
               this.c(var1, var2);
               this.bA = this.bB = 10;
            }

            this.bC = 0.0F;
            BaseEntity var4 = var1.a();
            if(var4 != null) {
               if(var4 instanceof Mob) {
                  this.a((Mob)var4);
               }

               if(var4 instanceof Player) {
                  this.bP = 60;
                  this.bO = (Player)var4;
               } else if(var4 instanceof Wolf) {
                  Wolf var5 = (Wolf)var4;
                  if(var5.G_()) {
                     this.bP = 60;
                     this.bO = null;
                  }
               }
            }

            if(var3) {
               this.k.a(this, (byte)2);
               this.K();
               if(var4 != null) {
                  double var9 = var4.o - this.o;

                  double var7;
                  for(var7 = var4.q - this.q; var9 * var9 + var7 * var7 < 1.0E-4D; var7 = (Math.random() - Math.random()) * 0.01D) {
                     var9 = (Math.random() - Math.random()) * 0.01D;
                  }

                  this.bC = (float)(Math.atan2(var7, var9) * 180.0D / 3.1415927410125732D) - this.u;
                  this.a(var4, var2, var9, var7);
               } else {
                  this.bC = (float)((int)(Math.random() * 2.0D) * 180);
               }
            }

            if(this.bx <= 0) {
               if(var3) {
                  this.k.a(this, this.o(), this.C_(), this.af());
               }

               this.a(var1);
            } else if(var3) {
               this.k.a(this, this.n(), this.C_(), this.af());
            }

            return true;
         }
      }
   }

   private float af() {
      return this.bi()?(this.U.nextFloat() - this.U.nextFloat()) * 0.2F + 1.5F:(this.U.nextFloat() - this.U.nextFloat()) * 0.2F + 1.0F;
   }

   public void k() {
      this.bA = this.bB = 10;
      this.bC = 0.0F;
   }

   public int au() {
      return 0;
   }

   protected void h(int var1) {}

   protected int d(md var1, int var2) {
      if(!var1.e()) {
         int var3 = 25 - this.au();
         int var4 = var2 * var3 + this.bz;
         this.h(var2);
         var2 = var4 / 25;
         this.bz = var4 % 25;
      }

      return var2;
   }

   protected int b(md var1, int var2) {
      if(this.a(aad.m)) {
         int var3 = (this.b(aad.m).c() + 1) * 5;
         int var4 = 25 - var3;
         int var5 = var2 * var4 + this.bz;
         var2 = var5 / 25;
         this.bz = var5 % 25;
      }

      return var2;
   }

   protected void c(md var1, int var2) {
      var2 = this.d(var1, var2);
      var2 = this.b(var1, var2);
      this.bx -= var2;
   }

   protected float C_() {
      return 1.0F;
   }

   protected String m() {
      return null;
   }

   protected String n() {
      return "damage.hurtflesh";
   }

   protected String o() {
      return "damage.hurtflesh";
   }

   public void a(BaseEntity var1, int var2, double var3, double var5) {
      this.al = true;
      float var7 = Utils.sqrt(var3 * var3 + var5 * var5);
      float var8 = 0.4F;
      this.r /= 2.0D;
      this.s /= 2.0D;
      this.t /= 2.0D;
      this.r -= var3 / (double)var7 * (double)var8;
      this.s += (double)var8;
      this.t -= var5 / (double)var7 * (double)var8;
      if(this.s > 0.4000000059604645D) {
         this.s = 0.4000000059604645D;
      }

   }

   public void a(md var1) {
      BaseEntity var2 = var1.a();
      if(this.br >= 0 && var2 != null) {
         var2.a((BaseEntity)this, this.br);
      }

      if(var2 != null) {
         var2.b(this);
      }

      this.bH = true;
      if(!this.k.F) {
         int var3 = 0;
         if(var2 instanceof Player) {
            var3 = ais.f(((Player)var2).ap);
         }

         if(!this.bi()) {
            this.a(this.bP > 0, var3);
            if(this.bP > 0) {
               int var4 = this.U.nextInt(200) - var3;
               if(var4 < 5) {
                  this.j_(var4 <= 0?1:0);
               }
            }
         }
      }

      this.k.a(this, (byte)3);
   }

   protected void j_(int var1) {}

   protected void a(boolean var1, int var2) {
      int var3 = this.f();
      if(var3 > 0) {
         int var4 = this.U.nextInt(3);
         if(var2 > 0) {
            var4 += this.U.nextInt(var2 + 1);
         }

         for(int var5 = 0; var5 < var4; ++var5) {
            this.b(var3, 1);
         }
      }

   }

   protected int f() {
      return 0;
   }

   protected void e(float var1) {
      super.e(var1);
      int var2 = (int)Math.ceil((double)(var1 - 3.0F));
      if(var2 > 0) {
         if(var2 > 4) {
            this.k.a(this, "damage.fallbig", 1.0F, 1.0F);
         } else {
            this.k.a(this, "damage.fallsmall", 1.0F, 1.0F);
         }

         this.a(md.i, var2);
         int var3 = this.k.a(Utils.c(this.o), Utils.c(this.p - 0.20000000298023224D - (double)this.H), Utils.c(this.q));
         if(var3 > 0) {
            vj var4 = pb.m[var3].cb;
            this.k.a(this, var4.d(), var4.b() * 0.5F, var4.c() * 0.75F);
         }
      }

   }

   public void a_(float var1, float var2) {
      double var3;
      if(this.H()) {
         var3 = this.p;
         this.a(var1, var2, this.b_()?0.04F:0.02F);
         this.b(this.r, this.s, this.t);
         this.r *= 0.800000011920929D;
         this.s *= 0.800000011920929D;
         this.t *= 0.800000011920929D;
         this.s -= 0.02D;
         if(this.A && this.e(this.r, this.s + 0.6000000238418579D - this.p + var3, this.t)) {
            this.s = 0.30000001192092896D;
         }
      } else if(this.J()) {
         var3 = this.p;
         this.a(var1, var2, 0.02F);
         this.b(this.r, this.s, this.t);
         this.r *= 0.5D;
         this.s *= 0.5D;
         this.t *= 0.5D;
         this.s -= 0.02D;
         if(this.A && this.e(this.r, this.s + 0.6000000238418579D - this.p + var3, this.t)) {
            this.s = 0.30000001192092896D;
         }
      } else {
         float var8 = 0.91F;
         if(this.z) {
            var8 = 0.54600006F;
            int var4 = this.k.a(Utils.c(this.o), Utils.c(this.y.b) - 1, Utils.c(this.q));
            if(var4 > 0) {
               var8 = pb.m[var4].ce * 0.91F;
            }
         }

         float var9 = 0.16277136F / (var8 * var8 * var8);
         float var5;
         if(this.z) {
            if(this.b_()) {
               var5 = this.aS();
            } else {
               var5 = this.bt;
            }

            var5 *= var9;
         } else {
            var5 = this.bu;
         }

         this.a(var1, var2, var5);
         var8 = 0.91F;
         if(this.z) {
            var8 = 0.54600006F;
            int var6 = this.k.a(Utils.c(this.o), Utils.c(this.y.b) - 1, Utils.c(this.q));
            if(var6 > 0) {
               var8 = pb.m[var6].ce * 0.91F;
            }
         }

         if(this.p()) {
            float var10 = 0.15F;
            if(this.r < (double)(-var10)) {
               this.r = (double)(-var10);
            }

            if(this.r > (double)var10) {
               this.r = (double)var10;
            }

            if(this.t < (double)(-var10)) {
               this.t = (double)(-var10);
            }

            if(this.t > (double)var10) {
               this.t = (double)var10;
            }

            this.fallDistance = 0.0F;
            if(this.s < -0.15D) {
               this.s = -0.15D;
            }

            boolean var7 = this.V() && this instanceof Player;
            if(var7 && this.s < 0.0D) {
               this.s = 0.0D;
            }
         }

         this.b(this.r, this.s, this.t);
         if(this.A && this.p()) {
            this.s = 0.2D;
         }

         this.s -= 0.08D;
         this.s *= 0.9800000190734863D;
         this.r *= (double)var8;
         this.t *= (double)var8;
      }

      this.bL = this.bM;
      var3 = this.o - this.sandX;
      double var11 = this.q - this.sandZ;
      float var12 = Utils.sqrt(var3 * var3 + var11 * var11) * 4.0F;
      if(var12 > 1.0F) {
         var12 = 1.0F;
      }

      this.bM += (var12 - this.bM) * 0.4F;
      this.bN += this.bM;
   }

   public boolean p() {
      int var1 = Utils.c(this.o);
      int var2 = Utils.c(this.y.b);
      int var3 = Utils.c(this.q);
      int var4 = this.k.a(var1, var2, var3);
      return var4 == pb.aF.bO || var4 == pb.bu.bO;
   }

   public void b(CompundTag var1) {
      var1.addShort("Health", (short)this.bx);
      var1.addShort("HurtTime", (short)this.bA);
      var1.addShort("DeathTime", (short)this.bD);
      var1.addShort("AttackTime", (short)this.bE);
      if(!this.bS.isEmpty()) {
         ListTag var2 = new ListTag();
         Iterator var3 = this.bS.values().iterator();

         while(var3.hasNext()) {
            alg var4 = (alg)var3.next();
            CompundTag var5 = new CompundTag();
            var5.addByte("Id", (byte)var4.a());
            var5.addByte("Amplifier", (byte)var4.c());
            var5.addInt("Duration", var4.b());
            var2.a((BaseTag)var5);
         }

         var1.addBaseTag("ActiveEffects", (BaseTag)var2);
      }

   }

   public void a(CompundTag var1) {
      if(this.bx < -32768) {
         this.bx = -32768;
      }

      this.bx = var1.getShort("Health");
      if(!var1.containsKey("Health")) {
         this.bx = this.d();
      }

      this.bA = var1.getShort("HurtTime");
      this.bD = var1.getShort("DeathTime");
      this.bE = var1.getShort("AttackTime");
      if(var1.containsKey("ActiveEffects")) {
         ListTag var2 = var1.getListTag("ActiveEffects");

         for(int var3 = 0; var3 < var2.d(); ++var3) {
            CompundTag var4 = (CompundTag)var2.a(var3);
            byte var5 = var4.getByte("Id");
            byte var6 = var4.getByte("Amplifier");
            int var7 = var4.getInt("Duration");
            this.bS.put(Integer.valueOf(var5), new alg(var5, var7, var6));
         }
      }

   }

   public boolean M() {
      return !this.G && this.bx > 0;
   }

   public boolean r_() {
      return false;
   }

   public void h(float var1) {
      this.cf = var1;
   }

   public void i(boolean var1) {
      this.ch = var1;
   }

   public void e() {
      if(this.ax > 0) {
         --this.ax;
      }

      if(this.bV > 0) {
         double var1 = this.o + (this.bW - this.o) / (double)this.bV;
         double var3 = this.p + (this.bX - this.p) / (double)this.bV;
         double var5 = this.q + (this.bY - this.q) / (double)this.bV;

         double var7;
         for(var7 = this.bZ - (double)this.u; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.u = (float)((double)this.u + var7 / (double)this.bV);
         this.v = (float)((double)this.v + (this.ca - (double)this.v) / (double)this.bV);
         --this.bV;
         this.d(var1, var3, var5);
         this.b(this.u, this.v);
         List var9 = this.k.a((BaseEntity)this, this.y.e(0.03125D, 0.0D, 0.03125D));
         if(var9.size() > 0) {
            double var10 = 0.0D;

            for(int var12 = 0; var12 < var9.size(); ++var12) {
               wu var13 = (wu)var9.get(var12);
               if(var13.e > var10) {
                  var10 = var13.e;
               }
            }

            var3 += var10 - this.y.b;
            this.d(var1, var3, var5);
         }
      }

      lv.a("ai");
      if(this.aq()) {
         this.ch = false;
         this.ce = 0.0F;
         this.cf = 0.0F;
         this.cg = 0.0F;
      } else if(this.H_()) {
         if(this.b_()) {
            lv.a("newAi");
            this.s_();
            lv.b();
         } else {
            lv.a("oldAi");
            this.y_();
            lv.b();
            this.bf = this.u;
         }
      }

      lv.b();
      boolean var14 = this.H();
      boolean var2 = this.J();
      if(this.ch) {
         if(var14) {
            this.s += 0.03999999910593033D;
         } else if(var2) {
            this.s += 0.03999999910593033D;
         } else if(this.z && this.ax == 0) {
            this.aD();
            this.ax = 10;
         }
      } else {
         this.ax = 0;
      }

      this.ce *= 0.98F;
      this.cf *= 0.98F;
      this.cg *= 0.9F;
      float var15 = this.bt;
      this.bt *= this.at();
      this.a_(this.ce, this.cf);
      this.bt = var15;
      lv.a("push");
      List var4 = this.k.b((BaseEntity)this, this.y.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
      if(var4 != null && var4.size() > 0) {
         for(int var16 = 0; var16 < var4.size(); ++var16) {
            BaseEntity var6 = (BaseEntity)var4.get(var16);
            if(var6.d_()) {
               var6.g(this);
            }
         }
      }

      lv.b();
   }

   protected boolean b_() {
      return false;
   }

   protected boolean H_() {
      return !this.k.F;
   }

   protected boolean aq() {
      return this.bx <= 0;
   }

   public boolean ao() {
      return false;
   }

   protected void aD() {
      this.s = 0.41999998688697815D;
      if(this.a(aad.j)) {
         this.s += (double)((float)(this.b(aad.j).c() + 1) * 0.1F);
      }

      if(this.W()) {
         float var1 = this.u * 0.017453292F;
         this.r -= (double)(Utils.sin(var1) * 0.2F);
         this.t += (double)(Utils.cos(var1) * 0.2F);
      }

      this.al = true;
   }

   protected boolean c_() {
      return true;
   }

   protected void w() {
      Player var1 = this.k.a(this, -1.0D);
      if(var1 != null) {
         double var2 = var1.o - this.o;
         double var4 = var1.p - this.p;
         double var6 = var1.q - this.q;
         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
         if(this.c_() && var8 > 16384.0D) {
            this.A();
         }

         if(this.cd > 600 && this.U.nextInt(800) == 0 && var8 > 1024.0D && this.c_()) {
            this.A();
         } else if(var8 < 1024.0D) {
            this.cd = 0;
         }
      }

   }

   protected void s_() {
      ++this.cd;
      lv.a("checkDespawn");
      this.w();
      lv.b();
      lv.a("sensing");
      this.at.a();
      lv.b();
      lv.a("targetSelector");
      this.bU.a();
      lv.b();
      lv.a("goalSelector");
      this.bT.a();
      lv.b();
      lv.a("navigation");
      this.ar.d();
      lv.b();
      lv.a("mojang.mob tick");
      this.g();
      lv.b();
      lv.a("controls");
      this.ao.c();
      this.an.a();
      this.ap.b();
      lv.b();
   }

   protected void g() {}

   protected void y_() {
      ++this.cd;
      this.w();
      this.ce = 0.0F;
      this.cf = 0.0F;
      float var1 = 8.0F;
      if(this.U.nextFloat() < 0.02F) {
         Player var2 = this.k.a(this, (double)var1);
         if(var2 != null) {
            this.ay = var2;
            this.ck = 10 + this.U.nextInt(20);
         } else {
            this.cg = (this.U.nextFloat() - 0.5F) * 20.0F;
         }
      }

      if(this.ay != null) {
         this.a(this.ay, 10.0F, (float)this.ak());
         if(this.ck-- <= 0 || this.ay.G || this.ay.f(this) > (double)(var1 * var1)) {
            this.ay = null;
         }
      } else {
         if(this.U.nextFloat() < 0.05F) {
            this.cg = (this.U.nextFloat() - 0.5F) * 20.0F;
         }

         this.u += this.cg;
         this.v = this.ci;
      }

      boolean var4 = this.H();
      boolean var3 = this.J();
      if(var4 || var3) {
         this.ch = this.U.nextFloat() < 0.8F;
      }

   }

   public int ak() {
      return 40;
   }

   public void a(BaseEntity var1, float var2, float var3) {
      double var4 = var1.o - this.o;
      double var8 = var1.q - this.q;
      double var6;
      if(var1 instanceof Mob) {
         Mob var10 = (Mob)var1;
         var6 = this.p + (double)this.I() - (var10.p + (double)var10.I());
      } else {
         var6 = (var1.y.b + var1.y.e) / 2.0D - (this.p + (double)this.I());
      }

      double var14 = (double) Utils.sqrt(var4 * var4 + var8 * var8);
      float var12 = (float)(Math.atan2(var8, var4) * 180.0D / 3.1415927410125732D) - 90.0F;
      float var13 = (float)(-(Math.atan2(var6, var14) * 180.0D / 3.1415927410125732D));
      this.v = -this.b(this.v, var13, var3);
      this.u = this.b(this.u, var12, var2);
   }

   private float b(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
         ;
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public void bc() {}

   public boolean i() {
      return this.k.a(this.y) && this.k.a((BaseEntity)this, this.y).size() == 0 && !this.k.b(this.y);
   }

   protected void E() {
      this.a(md.j, 4);
   }

   public float i(float var1) {
      float var2 = this.bw - this.bv;
      if(var2 < 0.0F) {
         ++var2;
      }

      return this.bv + var2 * var1;
   }

   public bo j(float var1) {
      if(var1 == 1.0F) {
         return mojang.bo.b(this.o, this.p, this.q);
      } else {
         double var2 = this.sandX + (this.o - this.sandX) * (double)var1;
         double var4 = this.sandY + (this.p - this.sandY) * (double)var1;
         double var6 = this.sandZ + (this.q - this.sandZ) * (double)var1;
         return mojang.bo.b(var2, var4, var6);
      }
   }

   public bo Q() {
      return this.k(1.0F);
   }

   public bo k(float var1) {
      float var2;
      float var3;
      float var4;
      float var5;
      if(var1 == 1.0F) {
         var2 = Utils.cos(-this.u * 0.017453292F - 3.1415927F);
         var3 = Utils.sin(-this.u * 0.017453292F - 3.1415927F);
         var4 = -Utils.cos(-this.v * 0.017453292F);
         var5 = Utils.sin(-this.v * 0.017453292F);
         return mojang.bo.b((double)(var3 * var4), (double)var5, (double)(var2 * var4));
      } else {
         var2 = this.x + (this.v - this.x) * var1;
         var3 = this.w + (this.u - this.w) * var1;
         var4 = Utils.cos(-var3 * 0.017453292F - 3.1415927F);
         var5 = Utils.sin(-var3 * 0.017453292F - 3.1415927F);
         float var6 = -Utils.cos(-var2 * 0.017453292F);
         float var7 = Utils.sin(-var2 * 0.017453292F);
         return mojang.bo.b((double)(var5 * var6), (double)var7, (double)(var4 * var6));
      }
   }

   public float bd() {
      return 1.0F;
   }

   public pl a(double var1, float var3) {
      bo var4 = this.j(var3);
      bo var5 = this.k(var3);
      bo var6 = var4.c(var5.a * var1, var5.b * var1, var5.c * var1);
      return this.k.a(var4, var6);
   }

   public int ac() {
      return 4;
   }

   public aan ae() {
      return null;
   }

   public void a(byte var1) {
      if(var1 == 2) {
         this.bM = 1.5F;
         this.Y = this.ba;
         this.bA = this.bB = 10;
         this.bC = 0.0F;
         this.k.a(this, this.n(), this.C_(), (this.U.nextFloat() - this.U.nextFloat()) * 0.2F + 1.0F);
         this.a(md.k, 0);
      } else if(var1 == 3) {
         this.k.a(this, this.o(), this.C_(), (this.U.nextFloat() - this.U.nextFloat()) * 0.2F + 1.0F);
         this.bx = 0;
         this.a(md.k);
      } else {
         super.a(var1);
      }

   }

   public boolean az() {
      return false;
   }

   public int b(aan var1, int var2) {
      return var1.b();
   }

   protected void be() {
      Iterator var1 = this.bS.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         alg var3 = (alg)this.bS.get(var2);
         if(!var3.a(this) && !this.k.F) {
            var1.remove();
            this.e(var3);
         }
      }

      int var9;
      if(this.e) {
         if(!this.k.F) {
            if(!this.bS.isEmpty()) {
               var9 = hx.a(this.bS.values());
               this.ac.b(8, Integer.valueOf(var9));
            } else {
               this.ac.b(8, Integer.valueOf(0));
            }
         }

         this.e = false;
      }

      if(this.U.nextBoolean()) {
         var9 = this.ac.c(8);
         if(var9 > 0) {
            double var10 = (double)(var9 >> 16 & 255) / 255.0D;
            double var5 = (double)(var9 >> 8 & 255) / 255.0D;
            double var7 = (double)(var9 >> 0 & 255) / 255.0D;
            this.k.a("mobSpell", this.o + (this.U.nextDouble() - 0.5D) * (double)this.I, this.p + this.U.nextDouble() * (double)this.J - (double)this.H, this.q + (this.U.nextDouble() - 0.5D) * (double)this.I, var10, var5, var7);
         }
      }

   }

   public void bf() {
      Iterator var1 = this.bS.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         alg var3 = (alg)this.bS.get(var2);
         if(!this.k.F) {
            var1.remove();
            this.e(var3);
         }
      }

   }

   public Collection bg() {
      return this.bS.values();
   }

   public boolean a(aad var1) {
      return this.bS.containsKey(Integer.valueOf(var1.H));
   }

   public alg b(aad var1) {
      return (alg)this.bS.get(Integer.valueOf(var1.H));
   }

   public void b(alg var1) {
      if(this.a(var1)) {
         if(this.bS.containsKey(Integer.valueOf(var1.a()))) {
            ((alg)this.bS.get(Integer.valueOf(var1.a()))).a(var1);
            this.d((alg)this.bS.get(Integer.valueOf(var1.a())));
         } else {
            this.bS.put(Integer.valueOf(var1.a()), var1);
            this.c(var1);
         }

      }
   }

   public boolean a(alg var1) {
      if(this.s() == mojang.bk.b) {
         int var2 = var1.a();
         if(var2 == aad.l.H || var2 == aad.u.H) {
            return false;
         }
      }

      return true;
   }

   public boolean bh() {
      return this.s() == mojang.bk.b;
   }

   public void m(int var1) {
      this.bS.remove(Integer.valueOf(var1));
   }

   protected void c(alg var1) {
      this.e = true;
   }

   protected void d(alg var1) {
      this.e = true;
   }

   protected void e(alg var1) {
      this.e = true;
   }

   protected float at() {
      float var1 = 1.0F;
      if(this.a(aad.c)) {
         var1 *= 1.0F + 0.2F * (float)(this.b(aad.c).c() + 1);
      }

      if(this.a(aad.d)) {
         var1 *= 1.0F - 0.15F * (float)(this.b(aad.d).c() + 1);
      }

      return var1;
   }

   public void j(double var1, double var3, double var5) {
      this.c(var1, var3, var5, this.u, this.v);
   }

   public boolean bi() {
      return false;
   }

   public bk s() {
      return mojang.bk.a;
   }

   public void c(aan var1) {
      this.k.a(this, "random.break", 0.8F, 0.8F + this.k.r.nextFloat() * 0.4F);

      for(int var2 = 0; var2 < 5; ++var2) {
         bo var3 = mojang.bo.b(((double)this.U.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
         var3.a(-this.v * 3.1415927F / 180.0F);
         var3.b(-this.u * 3.1415927F / 180.0F);
         bo var4 = mojang.bo.b(((double)this.U.nextFloat() - 0.5D) * 0.3D, (double)(-this.U.nextFloat()) * 0.6D - 0.3D, 0.6D);
         var4.a(-this.v * 3.1415927F / 180.0F);
         var4.b(-this.u * 3.1415927F / 180.0F);
         var4 = var4.c(this.o, this.p + (double)this.I(), this.q);
         this.k.a("iconcrack_" + var1.a().bQ, var4.a, var4.b, var4.c, var3.a, var3.b + 0.05D, var3.c);
      }

   }
}
