package mojang;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class abn {

   public static final abn[] a = new abn[256];
   public static final abn b = (new tm(0)).b(112).a("Ocean").b(-1.0F, 0.4F);
   public static final abn c = (new jw(1)).b(9286496).a("Plains").a(0.8F, 0.4F);
   public static final abn d = (new ahn(2)).b(16421912).a("Desert").m().a(2.0F, 0.0F).b(0.1F, 0.2F);
   public static final abn e = (new ahq(3)).b(6316128).a("Extreme Hills").b(0.2F, 1.3F).a(0.2F, 0.3F);
   public static final abn f = (new agj(4)).b(353825).a("Forest").a(5159473).a(0.7F, 0.8F);
   public static final abn g = (new sp(5)).b(747097).a("Taiga").a(5159473).b().a(0.05F, 0.8F).b(0.1F, 0.4F);
   public static final abn h = (new ahs(6)).b(522674).a("Swampland").a(9154376).b(-0.2F, 0.1F).a(0.8F, 0.9F);
   public static final abn i = (new jo(7)).b(255).a("River").b(-0.5F, 0.0F);
   public static final abn j = (new td(8)).b(16711680).a("Hell").m().a(2.0F, 0.0F);
   public static final abn k = (new fz(9)).b(8421631).a("Sky").m();
   public static final abn l = (new tm(10)).b(9474208).a("FrozenOcean").b().b(-1.0F, 0.5F).a(0.0F, 0.5F);
   public static final abn m = (new jo(11)).b(10526975).a("FrozenRiver").b().b(-0.5F, 0.0F).a(0.0F, 0.5F);
   public static final abn n = (new lp(12)).b(16777215).a("Ice Plains").b().a(0.0F, 0.5F);
   public static final abn o = (new lp(13)).b(10526880).a("Ice Mountains").b().b(0.2F, 1.2F).a(0.0F, 0.5F);
   public static final abn p = (new gl(14)).b(16711935).a("MushroomIsland").a(0.9F, 1.0F).b(0.2F, 1.0F);
   public static final abn q = (new gl(15)).b(10486015).a("MushroomIslandShore").a(0.9F, 1.0F).b(-1.0F, 0.1F);
   public static final abn r = (new ng(16)).b(16440917).a("Beach").a(0.8F, 0.4F).b(0.0F, 0.1F);
   public static final abn s = (new ahn(17)).b(13786898).a("DesertHills").m().a(2.0F, 0.0F).b(0.2F, 0.7F);
   public static final abn t = (new agj(18)).b(2250012).a("ForestHills").a(5159473).a(0.7F, 0.8F).b(0.2F, 0.6F);
   public static final abn u = (new sp(19)).b(1456435).a("TaigaHills").b().a(5159473).a(0.05F, 0.8F).b(0.2F, 0.7F);
   public static final abn v = (new ahq(20)).b(7501978).a("Extreme Hills Edge").b(0.2F, 0.8F).a(0.2F, 0.3F);
   public static final abn w = (new bn(21)).b(5470985).a("Jungle").a(5470985).a(1.2F, 0.9F).b(0.2F, 0.4F);
   public static final abn x = (new bn(22)).b(2900485).a("JungleHills").a(5470985).a(1.2F, 0.9F).b(1.8F, 0.2F);
   public String y;
   public int z;
   public byte A;
   public byte B;
   public int C;
   public float D;
   public float E;
   public float F;
   public float G;
   public int H;
   public yg I;
   protected List J;
   protected List K;
   protected List L;
   private boolean R;
   private boolean S;
   public final int M;
   protected sb N;
   protected zz O;
   protected i P;
   protected bf Q;


   protected abn(int var1) {
      this.A = (byte)pb.u.bO;
      this.B = (byte)pb.v.bO;
      this.C = 5169201;
      this.D = 0.1F;
      this.E = 0.3F;
      this.F = 0.5F;
      this.G = 0.5F;
      this.H = 16777215;
      this.J = new ArrayList();
      this.K = new ArrayList();
      this.L = new ArrayList();
      this.S = true;
      this.N = new sb(false);
      this.O = new zz(false);
      this.P = new i(false);
      this.Q = new bf();
      this.M = var1;
      a[var1] = this;
      this.I = this.a();
      this.K.add(new bg(cu.class, 12, 4, 4));
      this.K.add(new bg(qr.class, 10, 4, 4));
      this.K.add(new bg(rd.class, 10, 4, 4));
      this.K.add(new bg(un.class, 8, 4, 4));
      this.J.add(new bg(cb.class, 10, 4, 4));
      this.J.add(new bg(ajg.class, 10, 4, 4));
      this.J.add(new bg(xr.class, 10, 4, 4));
      this.J.add(new bg(yd.class, 10, 4, 4));
      this.J.add(new bg(aja.class, 10, 4, 4));
      this.J.add(new bg(jg.class, 1, 1, 4));
      this.L.add(new bg(all.class, 10, 4, 4));
   }

   protected yg a() {
      return new yg(this);
   }

   private abn a(float var1, float var2) {
      if(var1 > 0.1F && var1 < 0.2F) {
         throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
      } else {
         this.F = var1;
         this.G = var2;
         return this;
      }
   }

   private abn b(float var1, float var2) {
      this.D = var1;
      this.E = var2;
      return this;
   }

   private abn m() {
      this.S = false;
      return this;
   }

   public li a(Random var1) {
      return (li)(var1.nextInt(10) == 0?this.O:this.N);
   }

   public li b(Random var1) {
      return new to(pb.X.bO, 1);
   }

   protected abn b() {
      this.R = true;
      return this;
   }

   protected abn a(String var1) {
      this.y = var1;
      return this;
   }

   protected abn a(int var1) {
      this.C = var1;
      return this;
   }

   protected abn b(int var1) {
      this.z = var1;
      return this;
   }

   public int a(float var1) {
      var1 /= 3.0F;
      if(var1 < -1.0F) {
         var1 = -1.0F;
      }

      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      return Color.getHSBColor(0.62222224F - var1 * 0.05F, 0.5F + var1 * 0.1F, 1.0F).getRGB();
   }

   public List a(acf var1) {
      return var1 == acf.a?this.J:(var1 == acf.b?this.K:(var1 == acf.c?this.L:null));
   }

   public boolean c() {
      return this.R;
   }

   public boolean d() {
      return this.R?false:this.S;
   }

   public boolean e() {
      return this.G > 0.85F;
   }

   public float f() {
      return 0.1F;
   }

   public final int g() {
      return (int)(this.G * 65536.0F);
   }

   public final int h() {
      return (int)(this.F * 65536.0F);
   }

   public final float i() {
      return this.G;
   }

   public final float j() {
      return this.F;
   }

   public void a(xd var1, Random var2, int var3, int var4) {
      this.I.a(var1, var2, var3, var4);
   }

   public int k() {
      double var1 = (double)gk.a(this.j(), 0.0F, 1.0F);
      double var3 = (double)gk.a(this.i(), 0.0F, 1.0F);
      return zv.a(var1, var3);
   }

   public int l() {
      double var1 = (double)gk.a(this.j(), 0.0F, 1.0F);
      double var3 = (double)gk.a(this.i(), 0.0F, 1.0F);
      return gu.a(var1, var3);
   }

}
