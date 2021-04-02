package mojang;

public class yo extends wd {

   private boolean b = false;
   private float c;
   private float d;
   private boolean e;
   private boolean am;
   private float an;
   private float ar;


   public yo(xd var1) {
      super(var1);
      this.bm = "/mojang/mob/wolf.png";
      this.a(0.6F, 0.8F);
      this.cj = 0.3F;
      this.aM().a(true);
      this.bT.a(1, new aje(this));
      this.bT.a(2, this.a);
      this.bT.a(3, new bu(this, 0.4F));
      this.bT.a(4, new ax(this, this.cj, true));
      this.bT.a(5, new ni(this, this.cj, 10.0F, 2.0F));
      this.bT.a(6, new als(this, this.cj));
      this.bT.a(7, new acu(this, this.cj));
      this.bT.a(8, new wi(this, 8.0F));
      this.bT.a(9, new ob(this, yw.class, 8.0F));
      this.bT.a(9, new bd(this));
      this.bU.a(1, new xk(this));
      this.bU.a(2, new ya(this));
      this.bU.a(3, new zy(this, true));
      this.bU.a(4, new aht(this, cu.class, 16.0F, 200, false));
   }

   public boolean b_() {
      return true;
   }

   public void c(acq var1) {
      super.c(var1);
      if(var1 instanceof yw) {
         this.g(true);
      }

   }

   protected void g() {
      this.ac.b(18, Integer.valueOf(this.bb()));
   }

   public int d() {
      return this.G_()?20:8;
   }

   protected void b() {
      super.b();
      this.ac.a(18, new Integer(this.bb()));
   }

   protected boolean e_() {
      return false;
   }

   public String v_() {
      return this.G_()? "/mojang/mob/wolf_tame.png" :(this.am()? "/mojang/mob/wolf_angry.png" :super.v_());
   }

   public void b(ady var1) {
      super.b(var1);
      var1.a("Angry", this.am());
   }

   public void a(ady var1) {
      super.a(var1);
      this.g(var1.o("Angry"));
   }

   protected boolean c_() {
      return this.am();
   }

   protected String m() {
      return this.am()?"mojang.mob.wolf.growl":(this.U.nextInt(3) == 0?(this.G_() && this.ac.c(18) < 10?"mojang.mob.wolf.whine":"mojang.mob.wolf.panting"):"mojang.mob.wolf.bark");
   }

   protected String n() {
      return "mojang.mob.wolf.hurt";
   }

   protected String o() {
      return "mojang.mob.wolf.death";
   }

   protected float C_() {
      return 0.4F;
   }

   protected int f() {
      return -1;
   }

   public void e() {
      super.e();
      if(!this.k.F && this.e && !this.am && !this.ar() && this.z) {
         this.am = true;
         this.an = 0.0F;
         this.ar = 0.0F;
         this.k.a(this, (byte)8);
      }

   }

   public void J_() {
      super.J_();
      this.d = this.c;
      if(this.b) {
         this.c += (1.0F - this.c) * 0.4F;
      } else {
         this.c += (0.0F - this.c) * 0.4F;
      }

      if(this.b) {
         this.ck = 10;
      }

      if(this.G()) {
         this.e = true;
         this.am = false;
         this.an = 0.0F;
         this.ar = 0.0F;
      } else if((this.e || this.am) && this.am) {
         if(this.an == 0.0F) {
            this.k.a(this, "mojang.mob.wolf.shake", this.C_(), (this.U.nextFloat() - this.U.nextFloat()) * 0.2F + 1.0F);
         }

         this.ar = this.an;
         this.an += 0.05F;
         if(this.ar >= 2.0F) {
            this.e = false;
            this.am = false;
            this.ar = 0.0F;
            this.an = 0.0F;
         }

         if(this.an > 0.4F) {
            float var1 = (float)this.y.b;
            int var2 = (int)(gk.a((this.an - 0.4F) * 3.1415927F) * 7.0F);

            for(int var3 = 0; var3 < var2; ++var3) {
               float var4 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I * 0.5F;
               float var5 = (this.U.nextFloat() * 2.0F - 1.0F) * this.I * 0.5F;
               this.k.a("splash", this.o + (double)var4, (double)(var1 + 0.8F), this.q + (double)var5, this.r, this.s, this.t);
            }
         }
      }

   }

   public boolean aj() {
      return this.e;
   }

   public float c(float var1) {
      return 0.75F + (this.ar + (this.an - this.ar) * var1) / 2.0F * 0.25F;
   }

   public float d(float var1, float var2) {
      float var3 = (this.ar + (this.an - this.ar) * var1 + var2) / 1.8F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      } else if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      return gk.a(var3 * 3.1415927F) * gk.a(var3 * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
   }

   public float d(float var1) {
      return (this.d + (this.c - this.d) * var1) * 0.15F * 3.1415927F;
   }

   public float I() {
      return this.J * 0.8F;
   }

   public int ak() {
      return this.af()?20:super.ak();
   }

   public boolean a(md var1, int var2) {
      nn var3 = var1.a();
      this.a.a(false);
      if(var3 != null && !(var3 instanceof yw) && !(var3 instanceof nm)) {
         var2 = (var2 + 1) / 2;
      }

      return super.a(var1, var2);
   }

   public boolean c(nn var1) {
      int var2 = this.G_()?4:2;
      return var1.a(md.a((acq)this), var2);
   }

   public boolean c(yw var1) {
      aan var2 = var1.ap.b();
      if(!this.G_()) {
         if(var2 != null && var2.c == yr.aX.bQ && !this.am()) {
            if(!var1.aT.d) {
               --var2.a;
            }

            if(var2.a <= 0) {
               var1.ap.a(var1.ap.c, (aan)null);
            }

            if(!this.k.F) {
               if(this.U.nextInt(3) == 0) {
                  this.b(true);
                  this.a((vu)null);
                  this.c((acq)null);
                  this.a.a(true);
                  this.l(20);
                  this.a(var1.aA);
                  this.a(true);
                  this.k.a(this, (byte)7);
               } else {
                  this.a(false);
                  this.k.a(this, (byte)6);
               }
            }

            return true;
         }
      } else {
         if(var2 != null && yr.e[var2.c] instanceof amm) {
            amm var3 = (amm)yr.e[var2.c];
            if(var3.s() && this.ac.c(18) < 20) {
               if(!var1.aT.d) {
                  --var2.a;
               }

               this.k(var3.q());
               if(var2.a <= 0) {
                  var1.ap.a(var1.ap.c, (aan)null);
               }

               return true;
            }
         }

         if(var1.aA.equalsIgnoreCase(this.ag()) && !this.k.F && !this.a(var2)) {
            this.a.a(!this.af());
            this.ch = false;
            this.a((vu)null);
         }
      }

      return super.c(var1);
   }

   public void a(byte var1) {
      if(var1 == 8) {
         this.am = true;
         this.an = 0.0F;
         this.ar = 0.0F;
      } else {
         super.a(var1);
      }

   }

   public float al() {
      return this.am()?1.5393804F:(this.G_()?(0.55F - (float)(20 - this.ac.c(18)) * 0.02F) * 3.1415927F:0.62831855F);
   }

   public boolean a(aan var1) {
      return var1 == null?false:(!(yr.e[var1.c] instanceof amm)?false:((amm)yr.e[var1.c]).s());
   }

   public int ac() {
      return 8;
   }

   public boolean am() {
      return (this.ac.a(16) & 2) != 0;
   }

   public void g(boolean var1) {
      byte var2 = this.ac.a(16);
      if(var1) {
         this.ac.b(16, Byte.valueOf((byte)(var2 | 2)));
      } else {
         this.ac.b(16, Byte.valueOf((byte)(var2 & -3)));
      }

   }

   public bc a(bc var1) {
      yo var2 = new yo(this.k);
      var2.a(this.ag());
      var2.b(true);
      return var2;
   }

   public void h(boolean var1) {
      this.b = var1;
   }

   public boolean b(bc var1) {
      if(var1 == this) {
         return false;
      } else if(!this.G_()) {
         return false;
      } else if(!(var1 instanceof yo)) {
         return false;
      } else {
         yo var2 = (yo)var1;
         return !var2.G_()?false:(var2.af()?false:this.o_() && var2.o_());
      }
   }
}
