package mojang;

import java.util.Iterator;
import java.util.List;

public abstract class Player extends Mob {

   public aak ap = new aak(this);
   public dd aq;
   public dd ar;
   protected ne as = new ne();
   protected int at = 0;
   public byte au = 0;
   public int av = 0;
   public float aw;
   public float ax;
   public boolean ay = false;
   public int az = 0;
   public String aA;
   public int aB;
   public String aC;
   public int aD = 0;
   public double aE;
   public double aF;
   public double aG;
   public double aH;
   public double aI;
   public double aJ;
   protected boolean aK;
   public uh aL;
   private int a;
   public float aM;
   public float aN;
   public float aO;
   private uh b;
   private uh c;
   public int aP = 20;
   protected boolean aQ = false;
   public float aR;
   public float aS;
   public qu aT = new qu();
   public int aU;
   public int aV;
   public float aW;
   private aan d;
   private int e;
   protected float aX = 0.1F;
   protected float aY = 0.02F;
   public act aZ = null;


   public Player(World var1) {
      super(var1);
      this.aq = new y(this.ap, !var1.F);
      this.ar = this.aq;
      this.H = 1.62F;
      uh var2 = var1.x();
      this.c((double)var2.a + 0.5D, (double)(var2.b + 1), (double)var2.c + 0.5D, 0.0F, 0.0F);
      this.bp = "humanoid";
      this.bo = 180.0F;
      this.W = 20;
      this.bm = "/mojang/mob/char.png";
   }

   public int d() {
      return 20;
   }

   protected void b() {
      super.b();
      this.ac.a(16, Byte.valueOf((byte)0));
      this.ac.a(17, Byte.valueOf((byte)0));
   }

   public aan ah() {
      return this.d;
   }

   public int ai() {
      return this.e;
   }

   public boolean aj() {
      return this.d != null;
   }

   public int al() {
      return this.aj()?this.d.l() - this.e:0;
   }

   public void am() {
      if(this.d != null) {
         this.d.b(this.k, this, this.e);
      }

      this.an();
   }

   public void an() {
      this.d = null;
      this.e = 0;
      if(!this.k.F) {
         this.e(false);
      }

   }

   public boolean ao() {
      return this.aj() && yr.e[this.d.c].c(this.d) == aaq.d;
   }

   public void J_() {
      if(this.d != null) {
         aan var1 = this.ap.b();
         if(var1 != this.d) {
            this.an();
         } else {
            if(this.e <= 25 && this.e % 4 == 0) {
               this.a(var1, 5);
            }

            if(--this.e == 0 && !this.k.F) {
               this.ap();
            }
         }
      }

      if(this.aD > 0) {
         --this.aD;
      }

      if(this.az()) {
         ++this.a;
         if(this.a > 100) {
            this.a = 100;
         }

         if(!this.k.F) {
            if(!this.bk()) {
               this.a(true, true, false);
            } else if(this.k.m()) {
               this.a(false, true, true);
            }
         }
      } else if(this.a > 0) {
         ++this.a;
         if(this.a >= 110) {
            this.a = 0;
         }
      }

      super.J_();
      if(!this.k.F && this.ar != null && !this.ar.b(this)) {
         this.af();
         this.ar = this.aq;
      }

      if(this.aT.b) {
         for(int var9 = 0; var9 < 8; ++var9) {
            ;
         }
      }

      if(this.T() && this.aT.a) {
         this.D();
      }

      this.aE = this.aH;
      this.aF = this.aI;
      this.aG = this.aJ;
      double var10 = this.o - this.aH;
      double var3 = this.p - this.aI;
      double var5 = this.q - this.aJ;
      double var7 = 10.0D;
      if(var10 > var7) {
         this.aE = this.aH = this.o;
      }

      if(var5 > var7) {
         this.aG = this.aJ = this.q;
      }

      if(var3 > var7) {
         this.aF = this.aI = this.p;
      }

      if(var10 < -var7) {
         this.aE = this.aH = this.o;
      }

      if(var5 < -var7) {
         this.aG = this.aJ = this.q;
      }

      if(var3 < -var7) {
         this.aF = this.aI = this.p;
      }

      this.aH += var10 * 0.25D;
      this.aJ += var5 * 0.25D;
      this.aI += var3 * 0.25D;
      this.a(gv.k, 1);
      if(this.j == null) {
         this.c = null;
      }

      if(!this.k.F) {
         this.as.a(this);
      }

   }

   protected void a(aan var1, int var2) {
      if(var1.m() == aaq.c) {
         this.k.a(this, "random.drink", 0.5F, this.k.r.nextFloat() * 0.1F + 0.9F);
      }

      if(var1.m() == aaq.b) {
         for(int var3 = 0; var3 < var2; ++var3) {
            bo var4 = mojang.bo.b(((double)this.U.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
            var4.a(-this.v * 3.1415927F / 180.0F);
            var4.b(-this.u * 3.1415927F / 180.0F);
            bo var5 = mojang.bo.b(((double)this.U.nextFloat() - 0.5D) * 0.3D, (double)(-this.U.nextFloat()) * 0.6D - 0.3D, 0.6D);
            var5.a(-this.v * 3.1415927F / 180.0F);
            var5.b(-this.u * 3.1415927F / 180.0F);
            var5 = var5.c(this.o, this.p + (double)this.I(), this.q);
            this.k.a("iconcrack_" + var1.a().bQ, var5.a, var5.b, var5.c, var4.a, var4.b + 0.05D, var4.c);
         }

         this.k.a(this, "random.eat", 0.5F + 0.5F * (float)this.U.nextInt(2), (this.U.nextFloat() - this.U.nextFloat()) * 0.2F + 1.0F);
      }

   }

   protected void ap() {
      if(this.d != null) {
         this.a(this.d, 16);
         int var1 = this.d.a;
         aan var2 = this.d.b(this.k, this);
         if(var2 != this.d || var2 != null && var2.a != var1) {
            this.ap.a[this.ap.c] = var2;
            if(var2.a == 0) {
               this.ap.a[this.ap.c] = null;
            }
         }

         this.an();
      }

   }

   public void a(byte var1) {
      if(var1 == 9) {
         this.ap();
      } else {
         super.a(var1);
      }

   }

   protected boolean aq() {
      return this.bb() <= 0 || this.az();
   }

   protected void af() {
      this.ar = this.aq;
   }

   public void S() {
      this.aC = "https://s3.amazonaws.com/MinecraftCloaks/" + this.aA + ".png";
      this.aa = this.aC;
   }

   public void O() {
      double var1 = this.o;
      double var3 = this.p;
      double var5 = this.q;
      super.O();
      this.aw = this.ax;
      this.ax = 0.0F;
      this.k(this.o - var1, this.p - var3, this.q - var5);
   }

   public void z() {
      this.H = 1.62F;
      this.a(0.6F, 1.8F);
      super.z();
      this.l(this.d());
      this.bD = 0;
   }

   private int bj() {
      return this.a(aad.e)?6 - (1 + this.b(aad.e).c()) * 1:(this.a(aad.f)?6 + (1 + this.b(aad.f).c()) * 2:6);
   }

   protected void y_() {
      int var1 = this.bj();
      if(this.ay) {
         ++this.az;
         if(this.az >= var1) {
            this.az = 0;
            this.ay = false;
         }
      } else {
         this.az = 0;
      }

      this.bw = (float)this.az / (float)var1;
   }

   public void e() {
      if(this.at > 0) {
         --this.at;
      }

      if(this.k.q == 0 && this.bb() < this.d() && this.V % 20 * 12 == 0) {
         this.k(1);
      }

      this.ap.g();
      this.aw = this.ax;
      super.e();
      this.bt = this.aX;
      this.bu = this.aY;
      if(this.W()) {
         this.bt = (float)((double)this.bt + (double)this.aX * 0.3D);
         this.bu = (float)((double)this.bu + (double)this.aY * 0.3D);
      }

      float var1 = Utils.sqrt(this.r * this.r + this.t * this.t);
      float var2 = (float)Math.atan(-this.s * 0.20000000298023224D) * 15.0F;
      if(var1 > 0.1F) {
         var1 = 0.1F;
      }

      if(!this.z || this.bb() <= 0) {
         var1 = 0.0F;
      }

      if(this.z || this.bb() <= 0) {
         var2 = 0.0F;
      }

      this.ax += (var1 - this.ax) * 0.4F;
      this.bG += (var2 - this.bG) * 0.8F;
      if(this.bb() > 0) {
         List var3 = this.k.b((BaseEntity)this, this.y.b(1.0D, 0.0D, 1.0D));
         if(var3 != null) {
            for(int var4 = 0; var4 < var3.size(); ++var4) {
               BaseEntity var5 = (BaseEntity)var3.get(var4);
               if(!var5.G) {
                  this.n(var5);
               }
            }
         }
      }

   }

   private void n(BaseEntity var1) {
      var1.a(this);
   }

   public int ar() {
      return this.av;
   }

   public void a(md var1) {
      super.a(var1);
      this.a(0.2F, 0.2F);
      this.d(this.o, this.p, this.q);
      this.s = 0.10000000149011612D;
      if(this.aA.equals("Notch")) {
         this.a(new aan(yr.j, 1), true);
      }

      this.ap.i();
      if(var1 != null) {
         this.r = (double)(-Utils.cos((this.bC + this.u) * 3.1415927F / 180.0F) * 0.1F);
         this.t = (double)(-Utils.sin((this.bC + this.u) * 3.1415927F / 180.0F) * 0.1F);
      } else {
         this.r = this.t = 0.0D;
      }

      this.H = 0.1F;
      this.a(gv.y, 1);
   }

   public void a(BaseEntity var1, int var2) {
      this.av += var2;
      if(var1 instanceof Player) {
         this.a(gv.A, 1);
      } else {
         this.a(gv.z, 1);
      }

   }

   protected int b(int var1) {
      int var2 = ais.a(this.ap);
      return var2 > 0 && this.U.nextInt(var2 + 1) > 0?var1:super.b(var1);
   }

   public Item as() {
      return this.a(this.ap.a(this.ap.c, 1), false);
   }

   public Item a(aan var1) {
      return this.a(var1, false);
   }

   public Item a(aan var1, boolean var2) {
      if(var1 == null) {
         return null;
      } else {
         Item var3 = new Item(this.k, this.o, this.p - 0.30000001192092896D + (double)this.I(), this.q, var1);
         var3.c = 40;
         float var4 = 0.1F;
         float var5;
         if(var2) {
            var5 = this.U.nextFloat() * 0.5F;
            float var6 = this.U.nextFloat() * 3.1415927F * 2.0F;
            var3.r = (double)(-Utils.sin(var6) * var5);
            var3.t = (double)(Utils.cos(var6) * var5);
            var3.s = 0.20000000298023224D;
         } else {
            var4 = 0.3F;
            var3.r = (double)(-Utils.sin(this.u / 180.0F * 3.1415927F) * Utils.cos(this.v / 180.0F * 3.1415927F) * var4);
            var3.t = (double)(Utils.cos(this.u / 180.0F * 3.1415927F) * Utils.cos(this.v / 180.0F * 3.1415927F) * var4);
            var3.s = (double)(-Utils.sin(this.v / 180.0F * 3.1415927F) * var4 + 0.1F);
            var4 = 0.02F;
            var5 = this.U.nextFloat() * 3.1415927F * 2.0F;
            var4 *= this.U.nextFloat();
            var3.r += Math.cos((double)var5) * (double)var4;
            var3.s += (double)((this.U.nextFloat() - this.U.nextFloat()) * 0.1F);
            var3.t += Math.sin((double)var5) * (double)var4;
         }

         this.a(var3);
         this.a(gv.v, 1);
         return var3;
      }
   }

   protected void a(Item var1) {
      this.k.a((BaseEntity)var1);
   }

   public float a(pb var1) {
      float var2 = this.ap.a(var1);
      float var3 = var2;
      int var4 = ais.b(this.ap);
      if(var4 > 0 && this.ap.b(var1)) {
         var3 = var2 + (float)(var4 * var4 + 1);
      }

      if(this.a(aad.e)) {
         var3 *= 1.0F + (float)(this.b(aad.e).c() + 1) * 0.2F;
      }

      if(this.a(aad.f)) {
         var3 *= 1.0F - (float)(this.b(aad.f).c() + 1) * 0.2F;
      }

      if(this.a(acn.g) && !ais.g(this.ap)) {
         var3 /= 5.0F;
      }

      if(!this.z) {
         var3 /= 5.0F;
      }

      return var3;
   }

   public boolean b(pb var1) {
      return this.ap.b(var1);
   }

   public void a(CompundTag var1) {
      super.a(var1);
      ListTag var2 = var1.getListTag("Inventory");
      this.ap.b(var2);
      this.aB = var1.getInt("Dimension");
      this.aK = var1.getBoolean("Sleeping");
      this.a = var1.getShort("SleepTimer");
      this.aW = var1.getFloat("XpP");
      this.aU = var1.getInt("XpLevel");
      this.aV = var1.getInt("XpTotal");
      if(this.aK) {
         this.aL = new uh(Utils.c(this.o), Utils.c(this.p), Utils.c(this.q));
         this.a(true, true, false);
      }

      if(var1.containsKey("SpawnX") && var1.containsKey("SpawnY") && var1.containsKey("SpawnZ")) {
         this.b = new uh(var1.getInt("SpawnX"), var1.getInt("SpawnY"), var1.getInt("SpawnZ"));
      }

      this.as.a(var1);
      this.aT.b(var1);
   }

   public void b(CompundTag var1) {
      super.b(var1);
      var1.addBaseTag("Inventory", (BaseTag)this.ap.a(new ListTag()));
      var1.addInt("Dimension", this.aB);
      var1.addBoolean("Sleeping", this.aK);
      var1.addShort("SleepTimer", (short)this.a);
      var1.addFloat("XpP", this.aW);
      var1.addInt("XpLevel", this.aU);
      var1.addInt("XpTotal", this.aV);
      if(this.b != null) {
         var1.addInt("SpawnX", this.b.a);
         var1.addInt("SpawnY", this.b.b);
         var1.addInt("SpawnZ", this.b.c);
      }

      this.as.b(var1);
      this.aT.a(var1);
   }

   public void a(io var1) {}

   public void c(int var1, int var2, int var3) {}

   public void a(int var1, int var2, int var3) {}

   public void b(BaseEntity var1, int var2) {}

   public float I() {
      return 0.12F;
   }

   protected void aa() {
      this.H = 1.62F;
   }

   public boolean a(md var1, int var2) {
      if(this.aT.a && !var1.g()) {
         return false;
      } else {
         this.cd = 0;
         if(this.bb() <= 0) {
            return false;
         } else {
            if(this.az() && !this.k.F) {
               this.a(true, true, false);
            }

            BaseEntity var3 = var1.a();
            if(var3 instanceof Monster || var3 instanceof Arrow) {
               if(this.k.q == 0) {
                  var2 = 0;
               }

               if(this.k.q == 1) {
                  var2 = var2 / 2 + 1;
               }

               if(this.k.q == 3) {
                  var2 = var2 * 3 / 2;
               }
            }

            if(var2 == 0) {
               return false;
            } else {
               BaseEntity var4 = var3;
               if(var3 instanceof Arrow && ((Arrow)var3).c != null) {
                  var4 = ((Arrow)var3).c;
               }

               if(var4 instanceof Mob) {
                  this.a((Mob)var4, false);
               }

               this.a(gv.x, var2);
               return super.a(var1, var2);
            }
         }
      }
   }

   protected int b(md var1, int var2) {
      int var3 = super.b(var1, var2);
      if(var3 <= 0) {
         return 0;
      } else {
         int var4 = ais.a(this.ap, var1);
         if(var4 > 20) {
            var4 = 20;
         }

         if(var4 > 0 && var4 <= 20) {
            int var5 = 25 - var4;
            int var6 = var3 * var5 + this.bz;
            var3 = var6 / 25;
            this.bz = var6 % 25;
         }

         return var3;
      }
   }

   protected boolean B_() {
      return false;
   }

   protected void a(Mob var1, boolean var2) {
      if(!(var1 instanceof Creeper) && !(var1 instanceof Ghast)) {
         if(var1 instanceof Wolf) {
            Wolf var3 = (Wolf)var1;
            if(var3.G_() && this.aA.equals(var3.ag())) {
               return;
            }
         }

         if(!(var1 instanceof Player) || this.B_()) {
            List var7 = this.k.a(Wolf.class, wu.b(this.o, this.p, this.q, this.o + 1.0D, this.p + 1.0D, this.q + 1.0D).b(16.0D, 4.0D, 16.0D));
            Iterator var4 = var7.iterator();

            while(var4.hasNext()) {
               BaseEntity var5 = (BaseEntity)var4.next();
               Wolf var6 = (Wolf)var5;
               if(var6.G_() && var6.as() == null && this.aA.equals(var6.ag()) && (!var2 || !var6.af())) {
                  var6.f(false);
                  var6.i(var1);
               }
            }

         }
      }
   }

   protected void h(int var1) {
      this.ap.g(var1);
   }

   public int au() {
      return this.ap.h();
   }

   protected void c(md var1, int var2) {
      if(!var1.e() && this.ao()) {
         var2 = 1 + var2 >> 1;
      }

      var2 = this.d(var1, var2);
      var2 = this.b(var1, var2);
      this.c(var1.f());
      this.bx -= var2;
   }

   public void a(ahg var1) {}

   public void a(az var1) {}

   public void a(sc var1) {}

   public void a(amc var1) {}

   public void j(BaseEntity var1) {
      if(!var1.c(this)) {
         aan var2 = this.av();
         if(var2 != null && var1 instanceof Mob) {
            var2.a((Mob)var1);
            if(var2.a <= 0) {
               var2.a(this);
               this.aw();
            }
         }

      }
   }

   public aan av() {
      return this.ap.b();
   }

   public void aw() {
      this.ap.a(this.ap.c, (aan)null);
   }

   public double P() {
      return (double)(this.H - 0.5F);
   }

   public void ax() {
      if(!this.ay || this.az >= this.bj() / 2 || this.az < 0) {
         this.az = -1;
         this.ay = true;
      }

   }

   public void k(BaseEntity var1) {
      if(var1.k_()) {
         int var2 = this.ap.a(var1);
         if(this.a(aad.g)) {
            var2 += 3 << this.b(aad.g).c();
         }

         if(this.a(aad.t)) {
            var2 -= 2 << this.b(aad.t).c();
         }

         int var3 = 0;
         int var4 = 0;
         if(var1 instanceof Mob) {
            var4 = ais.a(this.ap, (Mob)var1);
            var3 += ais.b(this.ap, (Mob)var1);
         }

         if(this.W()) {
            ++var3;
         }

         if(var2 > 0 || var4 > 0) {
            boolean var5 = this.fallDistance > 0.0F && !this.z && !this.p() && !this.H() && !this.a(aad.q) && this.j == null && var1 instanceof Mob;
            if(var5) {
               var2 += this.U.nextInt(var2 / 2 + 2);
            }

            var2 += var4;
            boolean var6 = var1.a(md.a(this), var2);
            if(var6) {
               if(var3 > 0) {
                  var1.c((double)(-Utils.sin(this.u * 3.1415927F / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(Utils.cos(this.u * 3.1415927F / 180.0F) * (float)var3 * 0.5F));
                  this.r *= 0.6D;
                  this.t *= 0.6D;
                  this.d(false);
               }

               if(var5) {
                  this.d(var1);
               }

               if(var4 > 0) {
                  this.i(var1);
               }

               if(var2 >= 18) {
                  this.a((ajw)dp.E);
               }

               this.l(var1);
            }

            aan var7 = this.av();
            if(var7 != null && var1 instanceof Mob) {
               var7.a((Mob)var1, this);
               if(var7.a <= 0) {
                  var7.a(this);
                  this.aw();
               }
            }

            if(var1 instanceof Mob) {
               if(var1.M()) {
                  this.a((Mob)var1, true);
               }

               this.a(gv.w, var2);
               int var8 = ais.c(this.ap, (Mob)var1);
               if(var8 > 0) {
                  var1.e(var8 * 4);
               }
            }

            this.c(0.3F);
         }

      }
   }

   public void d(BaseEntity var1) {}

   public void i(BaseEntity var1) {}

   public void ag() {}

   public abstract void ab();

   public void b(aan var1) {}

   public void A() {
      super.A();
      this.aq.a(this);
      if(this.ar != null) {
         this.ar.a(this);
      }

   }

   public boolean N() {
      return !this.aK && super.N();
   }

   public ci d(int var1, int var2, int var3) {
      if(!this.k.F) {
         if(this.az() || !this.M()) {
            return mojang.ci.e;
         }

         if(!this.k.t.e()) {
            return mojang.ci.b;
         }

         if(this.k.m()) {
            return mojang.ci.c;
         }

         if(Math.abs(this.o - (double)var1) > 3.0D || Math.abs(this.p - (double)var2) > 2.0D || Math.abs(this.q - (double)var3) > 3.0D) {
            return mojang.ci.d;
         }

         double var4 = 8.0D;
         double var6 = 5.0D;
         List var8 = this.k.a(Monster.class, wu.b((double)var1 - var4, (double)var2 - var6, (double)var3 - var4, (double)var1 + var4, (double)var2 + var6, (double)var3 + var4));
         if(!var8.isEmpty()) {
            return mojang.ci.f;
         }
      }

      this.a(0.2F, 0.2F);
      this.H = 0.2F;
      if(this.k.j(var1, var2, var3)) {
         int var9 = this.k.e(var1, var2, var3);
         int var5 = pm.a(var9);
         float var10 = 0.5F;
         float var7 = 0.5F;
         switch(var5) {
         case 0:
            var7 = 0.9F;
            break;
         case 1:
            var10 = 0.1F;
            break;
         case 2:
            var7 = 0.1F;
            break;
         case 3:
            var10 = 0.9F;
         }

         this.d(var5);
         this.d((double)((float)var1 + var10), (double)((float)var2 + 0.9375F), (double)((float)var3 + var7));
      } else {
         this.d((double)((float)var1 + 0.5F), (double)((float)var2 + 0.9375F), (double)((float)var3 + 0.5F));
      }

      this.aK = true;
      this.a = 0;
      this.aL = new uh(var1, var2, var3);
      this.r = this.t = this.s = 0.0D;
      if(!this.k.F) {
         this.k.C();
      }

      return mojang.ci.a;
   }

   private void d(int var1) {
      this.aM = 0.0F;
      this.aO = 0.0F;
      switch(var1) {
      case 0:
         this.aO = -1.8F;
         break;
      case 1:
         this.aM = 1.8F;
         break;
      case 2:
         this.aO = 1.8F;
         break;
      case 3:
         this.aM = -1.8F;
      }

   }

   public void a(boolean var1, boolean var2, boolean var3) {
      this.a(0.6F, 1.8F);
      this.aa();
      uh var4 = this.aL;
      uh var5 = this.aL;
      if(var4 != null && this.k.a(var4.a, var4.b, var4.c) == pb.S.bO) {
         pm.a(this.k, var4.a, var4.b, var4.c, false);
         var5 = pm.f(this.k, var4.a, var4.b, var4.c, 0);
         if(var5 == null) {
            var5 = new uh(var4.a, var4.b + 1, var4.c);
         }

         this.d((double)((float)var5.a + 0.5F), (double)((float)var5.b + this.H + 0.1F), (double)((float)var5.c + 0.5F));
      }

      this.aK = false;
      if(!this.k.F && var2) {
         this.k.C();
      }

      if(var1) {
         this.a = 0;
      } else {
         this.a = 100;
      }

      if(var3) {
         this.a(this.aL);
      }

   }

   private boolean bk() {
      return this.k.a(this.aL.a, this.aL.b, this.aL.c) == pb.S.bO;
   }

   public static uh a(World var0, uh var1) {
      ca var2 = var0.z();
      var2.c(var1.a - 3 >> 4, var1.c - 3 >> 4);
      var2.c(var1.a + 3 >> 4, var1.c - 3 >> 4);
      var2.c(var1.a - 3 >> 4, var1.c + 3 >> 4);
      var2.c(var1.a + 3 >> 4, var1.c + 3 >> 4);
      if(var0.a(var1.a, var1.b, var1.c) != pb.S.bO) {
         return null;
      } else {
         uh var3 = pm.f(var0, var1.a, var1.b, var1.c, 0);
         return var3;
      }
   }

   public float ay() {
      if(this.aL != null) {
         int var1 = this.k.e(this.aL.a, this.aL.b, this.aL.c);
         int var2 = pm.a(var1);
         switch(var2) {
         case 0:
            return 90.0F;
         case 1:
            return 0.0F;
         case 2:
            return 270.0F;
         case 3:
            return 180.0F;
         }
      }

      return 0.0F;
   }

   public boolean az() {
      return this.aK;
   }

   public boolean aA() {
      return this.aK && this.a >= 100;
   }

   public int aB() {
      return this.a;
   }

   public void b(String var1) {}

   public uh aC() {
      return this.b;
   }

   public void a(uh var1) {
      if(var1 != null) {
         this.b = new uh(var1);
      } else {
         this.b = null;
      }

   }

   public void a(ajw var1) {
      this.a(var1, 1);
   }

   public void a(ajw var1, int var2) {}

   protected void aD() {
      super.aD();
      this.a(gv.u, 1);
      if(this.W()) {
         this.c(0.8F);
      } else {
         this.c(0.2F);
      }

   }

   public void a_(float var1, float var2) {
      double var3 = this.o;
      double var5 = this.p;
      double var7 = this.q;
      if(this.aT.b) {
         double var9 = this.s;
         float var11 = this.bu;
         this.bu = 0.05F;
         super.a_(var1, var2);
         this.s = var9 * 0.6D;
         this.bu = var11;
      } else {
         super.a_(var1, var2);
      }

      this.i(this.o - var3, this.p - var5, this.q - var7);
   }

   public void i(double var1, double var3, double var5) {
      if(this.j == null) {
         int var7;
         if(this.a(acn.g)) {
            var7 = Math.round(Utils.sqrt(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if(var7 > 0) {
               this.a(gv.q, var7);
               this.c(0.015F * (float)var7 * 0.01F);
            }
         } else if(this.H()) {
            var7 = Math.round(Utils.sqrt(var1 * var1 + var5 * var5) * 100.0F);
            if(var7 > 0) {
               this.a(gv.m, var7);
               this.c(0.015F * (float)var7 * 0.01F);
            }
         } else if(this.p()) {
            if(var3 > 0.0D) {
               this.a(gv.o, (int)Math.round(var3 * 100.0D));
            }
         } else if(this.z) {
            var7 = Math.round(Utils.sqrt(var1 * var1 + var5 * var5) * 100.0F);
            if(var7 > 0) {
               this.a(gv.l, var7);
               if(this.W()) {
                  this.c(0.099999994F * (float)var7 * 0.01F);
               } else {
                  this.c(0.01F * (float)var7 * 0.01F);
               }
            }
         } else {
            var7 = Math.round(Utils.sqrt(var1 * var1 + var5 * var5) * 100.0F);
            if(var7 > 25) {
               this.a(gv.p, var7);
            }
         }

      }
   }

   private void k(double var1, double var3, double var5) {
      if(this.j != null) {
         int var7 = Math.round(Utils.sqrt(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         if(var7 > 0) {
            if(this.j instanceof Minecart) {
               this.a(gv.r, var7);
               if(this.c == null) {
                  this.c = new uh(Utils.c(this.o), Utils.c(this.p), Utils.c(this.q));
               } else if(this.c.b(Utils.c(this.o), Utils.c(this.p), Utils.c(this.q)) >= 1000.0D) {
                  this.a((ajw)dp.q, 1);
               }
            } else if(this.j instanceof Boat) {
               this.a(gv.s, var7);
            } else if(this.j instanceof Pig) {
               this.a(gv.t, var7);
            }
         }
      }

   }

   protected void e(float var1) {
      if(!this.aT.c) {
         if(var1 >= 2.0F) {
            this.a(gv.n, (int)Math.round((double)var1 * 100.0D));
         }

         super.e(var1);
      }
   }

   public void b(Mob var1) {
      if(var1 instanceof Monster) {
         this.a((ajw)dp.s);
      }

   }

   public int b(aan var1, int var2) {
      int var3 = super.b(var1, var2);
      if(var1.c == yr.aR.bQ && this.aZ != null) {
         var3 = var1.b() + 16;
      } else {
         if(var1.a().c()) {
            return var1.a().a(var1.i(), var2);
         }

         if(this.d != null && var1.c == yr.k.bQ) {
            int var4 = var1.l() - this.e;
            if(var4 >= 18) {
               return 133;
            }

            if(var4 > 13) {
               return 117;
            }

            if(var4 > 0) {
               return 101;
            }
         }
      }

      return var3;
   }

   public void R() {
      if(this.aP > 0) {
         this.aP = 10;
      } else {
         this.aQ = true;
      }
   }

   public void i(int var1) {
      this.av += var1;
      int var2 = Integer.MAX_VALUE - this.aV;
      if(var1 > var2) {
         var1 = var2;
      }

      this.aW += (float)var1 / (float)this.aE();

      for(this.aV += var1; this.aW >= 1.0F; this.aW /= (float)this.aE()) {
         this.aW = (this.aW - 1.0F) * (float)this.aE();
         this.bl();
      }

   }

   public void j(int var1) {
      this.aU -= var1;
      if(this.aU < 0) {
         this.aU = 0;
      }

   }

   public int aE() {
      return 7 + (this.aU * 7 >> 1);
   }

   private void bl() {
      ++this.aU;
   }

   public void c(float var1) {
      if(!this.aT.a) {
         if(!this.k.F) {
            this.as.a(var1);
         }

      }
   }

   public ne aF() {
      return this.as;
   }

   public boolean a(boolean var1) {
      return (var1 || this.as.c()) && !this.aT.a;
   }

   public boolean aG() {
      return this.bb() > 0 && this.bb() < this.d();
   }

   public void c(aan var1, int var2) {
      if(var1 != this.d) {
         this.d = var1;
         this.e = var2;
         if(!this.k.F) {
            this.e(true);
         }

      }
   }

   public boolean e(int var1, int var2, int var3) {
      return true;
   }

   protected int b(Player var1) {
      int var2 = this.aU * 7;
      return var2 > 100?100:var2;
   }

   protected boolean aH() {
      return true;
   }

   public void c(int var1) {}

   public void d(Player var1) {
      this.ap.a(var1.ap);
      this.bx = var1.bx;
      this.as = var1.as;
      this.aU = var1.aU;
      this.aV = var1.aV;
      this.aW = var1.aW;
      this.av = var1.av;
   }

   protected boolean e_() {
      return !this.aT.b;
   }

   public void aI() {}
}
