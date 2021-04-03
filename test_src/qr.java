
public class qr extends bc {

   public qr(xd var1) {
      super(var1);
      this.bm = "/mob/pig.png";
      this.a(0.9F, 0.9F);
      this.aM().a(true);
      float var2 = 0.25F;
      this.bT.a(0, new aje(this));
      this.bT.a(1, new ke(this, 0.38F));
      this.bT.a(2, new als(this, var2));
      this.bT.a(3, new akz(this, 0.25F, yr.T.bQ, false));
      this.bT.a(4, new ek(this, 0.28F));
      this.bT.a(5, new acu(this, var2));
      this.bT.a(6, new ob(this, yw.class, 6.0F));
      this.bT.a(7, new bd(this));
   }

   public boolean b_() {
      return true;
   }

   public int d() {
      return 10;
   }

   protected void b() {
      super.b();
      this.ac.a(16, Byte.valueOf((byte)0));
   }

   public void b(ady var1) {
      super.b(var1);
      var1.a("Saddle", this.aa());
   }

   public void a(ady var1) {
      super.a(var1);
      this.a(var1.o("Saddle"));
   }

   protected String m() {
      return "mob.pig";
   }

   protected String n() {
      return "mob.pig";
   }

   protected String o() {
      return "mob.pigdeath";
   }

   public boolean c(yw var1) {
      if(super.c(var1)) {
         return true;
      } else if(this.aa() && !this.k.F && (this.i == null || this.i == var1)) {
         var1.h(this);
         return true;
      } else {
         return false;
      }
   }

   protected int f() {
      return this.T()?yr.ar.bQ:yr.aq.bQ;
   }

   public boolean aa() {
      return (this.ac.a(16) & 1) != 0;
   }

   public void a(boolean var1) {
      if(var1) {
         this.ac.b(16, Byte.valueOf((byte)1));
      } else {
         this.ac.b(16, Byte.valueOf((byte)0));
      }

   }

   public void a(d var1) {
      if(!this.k.F) {
         alt var2 = new alt(this.k);
         var2.c(this.o, this.p, this.q, this.u, this.v);
         this.k.a((nn)var2);
         this.A();
      }
   }

   protected void e(float var1) {
      super.e(var1);
      if(var1 > 5.0F && this.i instanceof yw) {
         ((yw)this.i).a((ajw)dp.u);
      }

   }

   public bc a(bc var1) {
      return new qr(this.k);
   }
}
