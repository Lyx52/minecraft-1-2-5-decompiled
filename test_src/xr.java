
public class xr extends yy {

   private static final aan a = new aan(yr.k, 1);


   public xr(xd var1) {
      super(var1);
      this.bm = "/mob/skeleton.png";
      this.cj = 0.25F;
      this.bT.a(1, new aje(this));
      this.bT.a(2, new ajt(this));
      this.bT.a(3, new na(this, this.cj));
      this.bT.a(4, new sf(this, this.cj, 1, 60));
      this.bT.a(5, new acu(this, this.cj));
      this.bT.a(6, new ob(this, yw.class, 8.0F));
      this.bT.a(6, new bd(this));
      this.bU.a(1, new zy(this, false));
      this.bU.a(2, new amf(this, yw.class, 16.0F, 0, true));
   }

   public boolean b_() {
      return true;
   }

   public int d() {
      return 20;
   }

   protected String m() {
      return "mob.skeleton";
   }

   protected String n() {
      return "mob.skeletonhurt";
   }

   protected String o() {
      return "mob.skeletonhurt";
   }

   public aan ae() {
      return a;
   }

   public bk s() {
      return bk.b;
   }

   public void e() {
      if(this.k.m() && !this.k.F) {
         float var1 = this.a(1.0F);
         if(var1 > 0.5F && this.k.m(gk.c(this.o), gk.c(this.p), gk.c(this.q)) && this.U.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.e(8);
         }
      }

      super.e();
   }

   public void a(md var1) {
      super.a(var1);
      if(var1.b() instanceof nm && var1.a() instanceof yw) {
         yw var2 = (yw)var1.a();
         double var3 = var2.o - this.o;
         double var5 = var2.q - this.q;
         if(var3 * var3 + var5 * var5 >= 2500.0D) {
            var2.a((ajw)dp.v);
         }
      }

   }

   protected int f() {
      return yr.l.bQ;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.U.nextInt(3 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.b(yr.l.bQ, 1);
      }

      var3 = this.U.nextInt(3 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.b(yr.aX.bQ, 1);
      }

   }

   protected void j_(int var1) {
      if(var1 > 0) {
         aan var2 = new aan(yr.k);
         ais.a(this.U, var2, 5);
         this.a(var2, 0.0F);
      } else {
         this.b(yr.k.bQ, 1);
      }

   }

}
