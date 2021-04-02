package mojang;

public class aad {

   public static final aad[] a = new aad[32];
   public static final aad b = null;
   public static final aad c = (new aad(1, false, 8171462)).a("potion.moveSpeed").a(0, 0);
   public static final aad d = (new aad(2, true, 5926017)).a("potion.moveSlowdown").a(1, 0);
   public static final aad e = (new aad(3, false, 14270531)).a("potion.digSpeed").a(2, 0).a(1.5D);
   public static final aad f = (new aad(4, true, 4866583)).a("potion.digSlowDown").a(3, 0);
   public static final aad g = (new aad(5, false, 9643043)).a("potion.damageBoost").a(4, 0);
   public static final aad h = (new ajc(6, false, 16262179)).a("potion.heal");
   public static final aad i = (new ajc(7, true, 4393481)).a("potion.harm");
   public static final aad j = (new aad(8, false, 7889559)).a("potion.jump").a(2, 1);
   public static final aad k = (new aad(9, true, 5578058)).a("potion.confusion").a(3, 1).a(0.25D);
   public static final aad l = (new aad(10, false, 13458603)).a("potion.regeneration").a(7, 0).a(0.25D);
   public static final aad m = (new aad(11, false, 10044730)).a("potion.resistance").a(6, 1);
   public static final aad n = (new aad(12, false, 14981690)).a("potion.fireResistance").a(7, 1);
   public static final aad o = (new aad(13, false, 3035801)).a("potion.waterBreathing").a(0, 2);
   public static final aad p = (new aad(14, false, 8356754)).a("potion.invisibility").a(0, 1).h();
   public static final aad q = (new aad(15, true, 2039587)).a("potion.blindness").a(5, 1).a(0.25D);
   public static final aad r = (new aad(16, false, 2039713)).a("potion.nightVision").a(4, 1).h();
   public static final aad s = (new aad(17, true, 5797459)).a("potion.hunger").a(1, 1);
   public static final aad t = (new aad(18, true, 4738376)).a("potion.weakness").a(5, 0);
   public static final aad u = (new aad(19, true, 5149489)).a("potion.poison").a(6, 0).a(0.25D);
   public static final aad v = null;
   public static final aad w = null;
   public static final aad x = null;
   public static final aad y = null;
   public static final aad z = null;
   public static final aad A = null;
   public static final aad B = null;
   public static final aad C = null;
   public static final aad D = null;
   public static final aad E = null;
   public static final aad F = null;
   public static final aad G = null;
   public final int H;
   private String I = "";
   private int J = -1;
   private final boolean K;
   private double L;
   private boolean M;
   private final int N;


   protected aad(int var1, boolean var2, int var3) {
      this.H = var1;
      a[var1] = this;
      this.K = var2;
      if(var2) {
         this.L = 0.5D;
      } else {
         this.L = 1.0D;
      }

      this.N = var3;
   }

   protected aad a(int var1, int var2) {
      this.J = var1 + var2 * 8;
      return this;
   }

   public int a() {
      return this.H;
   }

   public void a(acq var1, int var2) {
      if(this.H == l.H) {
         if(var1.bb() < var1.d()) {
            var1.k(1);
         }
      } else if(this.H == u.H) {
         if(var1.bb() > 1) {
            var1.a(md.m, 1);
         }
      } else if(this.H == s.H && var1 instanceof yw) {
         ((yw)var1).c(0.025F * (float)(var2 + 1));
      } else if((this.H != h.H || var1.bh()) && (this.H != i.H || !var1.bh())) {
         if(this.H == i.H && !var1.bh() || this.H == h.H && var1.bh()) {
            var1.a(md.m, 6 << var2);
         }
      } else {
         var1.k(6 << var2);
      }

   }

   public void a(acq var1, acq var2, int var3, double var4) {
      int var6;
      if((this.H != h.H || var2.bh()) && (this.H != i.H || !var2.bh())) {
         if(this.H == i.H && !var2.bh() || this.H == h.H && var2.bh()) {
            var6 = (int)(var4 * (double)(6 << var3) + 0.5D);
            if(var1 == null) {
               var2.a(md.m, var6);
            } else {
               var2.a(md.b(var2, var1), var6);
            }
         }
      } else {
         var6 = (int)(var4 * (double)(6 << var3) + 0.5D);
         var2.k(var6);
      }

   }

   public boolean b() {
      return false;
   }

   public boolean b(int var1, int var2) {
      if(this.H != l.H && this.H != u.H) {
         return this.H == s.H;
      } else {
         int var3 = 25 >> var2;
         return var3 > 0?var1 % var3 == 0:true;
      }
   }

   public aad a(String var1) {
      this.I = var1;
      return this;
   }

   public String c() {
      return this.I;
   }

   public boolean d() {
      return this.J >= 0;
   }

   public int e() {
      return this.J;
   }

   public boolean f() {
      return this.K;
   }

   public static String a(alg var0) {
      int var1 = var0.b();
      int var2 = var1 / 20;
      int var3 = var2 / 60;
      var2 %= 60;
      return var2 < 10?var3 + ":0" + var2:var3 + ":" + var2;
   }

   protected aad a(double var1) {
      this.L = var1;
      return this;
   }

   public double g() {
      return this.L;
   }

   public aad h() {
      this.M = true;
      return this;
   }

   public boolean i() {
      return this.M;
   }

   public int j() {
      return this.N;
   }

}
