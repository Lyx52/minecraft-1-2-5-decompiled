package mojang;

public class uo extends wd {

   private akz b;


   public uo(xd var1) {
      super(var1);
      this.bm = "/mojang/mob/ozelot.png";
      this.a(0.6F, 0.8F);
      this.aM().a(true);
      this.bT.a(1, new aje(this));
      this.bT.a(2, this.a);
      this.bT.a(3, this.b = new akz(this, 0.18F, yr.aU.bQ, true));
      this.bT.a(4, new fg(this, yw.class, 16.0F, 0.23F, 0.4F));
      this.bT.a(5, new ni(this, 0.3F, 10.0F, 5.0F));
      this.bT.a(6, new x(this, 0.4F));
      this.bT.a(7, new bu(this, 0.3F));
      this.bT.a(8, new ut(this));
      this.bT.a(9, new als(this, 0.23F));
      this.bT.a(10, new acu(this, 0.23F));
      this.bT.a(11, new ob(this, yw.class, 10.0F));
      this.bU.a(1, new aht(this, rd.class, 14.0F, 750, false));
   }

   protected void b() {
      super.b();
      this.ac.a(18, Byte.valueOf((byte)0));
   }

   public void g() {
      if(!this.aK().a()) {
         this.c(false);
         this.d(false);
      } else {
         float var1 = this.aK().b();
         if(var1 == 0.18F) {
            this.c(true);
            this.d(false);
         } else if(var1 == 0.4F) {
            this.c(false);
            this.d(true);
         } else {
            this.c(false);
            this.d(false);
         }
      }

   }

   protected boolean c_() {
      return !this.G_();
   }

   public String v_() {
      switch(this.ad()) {
      case 0:
         return "/mojang/mob/ozelot.png";
      case 1:
         return "/mojang/mob/cat_black.png";
      case 2:
         return "/mojang/mob/cat_red.png";
      case 3:
         return "/mojang/mob/cat_siamese.png";
      default:
         return super.v_();
      }
   }

   public boolean b_() {
      return true;
   }

   public int d() {
      return 10;
   }

   protected void e(float var1) {}

   public void b(ady var1) {
      super.b(var1);
      var1.a("CatType", this.ad());
   }

   public void a(ady var1) {
      super.a(var1);
      this.c(var1.f("CatType"));
   }

   protected String m() {
      return this.G_()?(this.o_()?"mojang.mob.cat.purr":(this.U.nextInt(4) == 0?"mojang.mob.cat.purreow":"mojang.mob.cat.meow")):"";
   }

   protected String n() {
      return "mojang.mob.cat.hitt";
   }

   protected String o() {
      return "mojang.mob.cat.hitt";
   }

   protected float C_() {
      return 0.4F;
   }

   protected int f() {
      return yr.aF.bQ;
   }

   public boolean c(nn var1) {
      return var1.a(md.a((acq)this), 3);
   }

   public boolean a(md var1, int var2) {
      this.a.a(false);
      return super.a(var1, var2);
   }

   protected void a(boolean var1, int var2) {}

   public boolean c(yw var1) {
      aan var2 = var1.ap.b();
      if(!this.G_()) {
         if(this.b.h() && var2 != null && var2.c == yr.aU.bQ && var1.f(this) < 9.0D) {
            --var2.a;
            if(var2.a <= 0) {
               var1.ap.a(var1.ap.c, (aan)null);
            }

            if(!this.k.F) {
               if(this.U.nextInt(3) == 0) {
                  this.b(true);
                  this.c(1 + this.k.r.nextInt(3));
                  this.a(var1.aA);
                  this.a(true);
                  this.a.a(true);
                  this.k.a(this, (byte)7);
               } else {
                  this.a(false);
                  this.k.a(this, (byte)6);
               }
            }
         }

         return true;
      } else {
         if(var1.aA.equalsIgnoreCase(this.ag()) && !this.k.F && !this.a(var2)) {
            this.a.a(!this.af());
         }

         return super.c(var1);
      }
   }

   public bc a(bc var1) {
      uo var2 = new uo(this.k);
      if(this.G_()) {
         var2.a(this.ag());
         var2.b(true);
         var2.c(this.ad());
      }

      return var2;
   }

   public boolean a(aan var1) {
      return var1 != null && var1.c == yr.aU.bQ;
   }

   public boolean b(bc var1) {
      if(var1 == this) {
         return false;
      } else if(!this.G_()) {
         return false;
      } else if(!(var1 instanceof uo)) {
         return false;
      } else {
         uo var2 = (uo)var1;
         return !var2.G_()?false:this.o_() && var2.o_();
      }
   }

   public int ad() {
      return this.ac.a(18);
   }

   public void c(int var1) {
      this.ac.b(18, Byte.valueOf((byte)var1));
   }

   public boolean i() {
      if(this.k.r.nextInt(3) == 0) {
         return false;
      } else {
         if(this.k.a(this.y) && this.k.a((nn)this, this.y).size() == 0 && !this.k.b(this.y)) {
            int var1 = gk.c(this.o);
            int var2 = gk.c(this.y.b);
            int var3 = gk.c(this.q);
            if(var2 < 63) {
               return false;
            }

            int var4 = this.k.a(var1, var2 - 1, var3);
            if(var4 == pb.u.bO || var4 == pb.K.bO) {
               return true;
            }
         }

         return false;
      }
   }
}
