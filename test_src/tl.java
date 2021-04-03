
public class tl extends akm {

   private int b = 0;
   kd a = null;
   private int c;
   private int d;


   public tl(xd var1) {
      super(var1);
      this.bm = "/mob/villager_golem.png";
      this.a(1.4F, 2.9F);
      this.aM().a(true);
      this.bT.a(1, new ax(this, 0.25F, true));
      this.bT.a(2, new xz(this, 0.22F, 32.0F));
      this.bT.a(3, new akr(this, 0.16F, true));
      this.bT.a(4, new vw(this, 0.16F));
      this.bT.a(5, new yc(this));
      this.bT.a(6, new acu(this, 0.16F));
      this.bT.a(7, new ob(this, yw.class, 6.0F));
      this.bT.a(8, new bd(this));
      this.bU.a(1, new hd(this));
      this.bU.a(2, new zy(this, false));
      this.bU.a(3, new amf(this, yy.class, 16.0F, 0, false, true));
   }

   protected void b() {
      super.b();
      this.ac.a(16, Byte.valueOf((byte)0));
   }

   public boolean b_() {
      return true;
   }

   protected void g() {
      if(--this.b <= 0) {
         this.b = 70 + this.U.nextInt(50);
         this.a = this.k.A.a(gk.c(this.o), gk.c(this.p), gk.c(this.q), 32);
         if(this.a == null) {
            this.aX();
         } else {
            uh var1 = this.a.a();
            this.b(var1.a, var1.b, var1.c, this.a.b());
         }
      }

      super.g();
   }

   public int d() {
      return 100;
   }

   protected int b(int var1) {
      return var1;
   }

   public void e() {
      super.e();
      if(this.c > 0) {
         --this.c;
      }

      if(this.d > 0) {
         --this.d;
      }

      if(this.r * this.r + this.t * this.t > 2.500000277905201E-7D && this.U.nextInt(5) == 0) {
         int var1 = gk.c(this.o);
         int var2 = gk.c(this.p - 0.20000000298023224D - (double)this.H);
         int var3 = gk.c(this.q);
         int var4 = this.k.a(var1, var2, var3);
         if(var4 > 0) {
            this.k.a("tilecrack_" + var4, this.o + ((double)this.U.nextFloat() - 0.5D) * (double)this.I, this.y.b + 0.1D, this.q + ((double)this.U.nextFloat() - 0.5D) * (double)this.I, 4.0D * ((double)this.U.nextFloat() - 0.5D), 0.5D, ((double)this.U.nextFloat() - 0.5D) * 4.0D);
         }
      }

   }

   public boolean a(Class var1) {
      return this.F_() && yw.class.isAssignableFrom(var1)?false:super.a(var1);
   }

   public void b(ady var1) {
      super.b(var1);
      var1.a("PlayerCreated", this.F_());
   }

   public void a(ady var1) {
      super.a(var1);
      this.b(var1.o("PlayerCreated"));
   }

   public boolean c(nn var1) {
      this.c = 10;
      this.k.a(this, (byte)4);
      boolean var2 = var1.a(md.a((acq)this), 7 + this.U.nextInt(15));
      if(var2) {
         var1.s += 0.4000000059604645D;
      }

      this.k.a(this, "mob.irongolem.throw", 1.0F, 1.0F);
      return var2;
   }

   public void a(byte var1) {
      if(var1 == 4) {
         this.c = 10;
         this.k.a(this, "mob.irongolem.throw", 1.0F, 1.0F);
      } else if(var1 == 11) {
         this.d = 400;
      } else {
         super.a(var1);
      }

   }

   public kd aa() {
      return this.a;
   }

   public int ab() {
      return this.c;
   }

   public void a(boolean var1) {
      this.d = var1?400:0;
      this.k.a(this, (byte)11);
   }

   protected String m() {
      return "none";
   }

   protected String n() {
      return "mob.irongolem.hit";
   }

   protected String o() {
      return "mob.irongolem.death";
   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.k.a(this, "mob.irongolem.walk", 1.0F, 1.0F);
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.U.nextInt(3);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.b(pb.ae.bO, 1);
      }

      var4 = 3 + this.U.nextInt(3);

      for(int var5 = 0; var5 < var4; ++var5) {
         this.b(yr.o.bQ, 1);
      }

   }

   public int E_() {
      return this.d;
   }

   public boolean F_() {
      return (this.ac.a(16) & 1) != 0;
   }

   public void b(boolean var1) {
      byte var2 = this.ac.a(16);
      if(var1) {
         this.ac.b(16, Byte.valueOf((byte)(var2 | 1)));
      } else {
         this.ac.b(16, Byte.valueOf((byte)(var2 & -2)));
      }

   }
}
