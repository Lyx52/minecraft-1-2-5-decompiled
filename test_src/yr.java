import java.util.List;
import java.util.Random;

public class yr {

   protected static Random d = new Random();
   public static yr[] e = new yr[32000];
   public static yr f = (new akd(0, uk.c)).c(2, 5).a("shovelIron");
   public static yr g = (new au(1, uk.c)).c(2, 6).a("pickaxeIron");
   public static yr h = (new nx(2, uk.c)).c(2, 7).a("hatchetIron");
   public static yr i = (new alx(3)).c(5, 0).a("flintAndSteel");
   public static yr j = (new amm(4, 4, 0.3F, false)).c(10, 0).a("apple");
   public static yr k = (new mm(5)).c(5, 1).a("bow");
   public static yr l = (new yr(6)).c(5, 2).a("arrow");
   public static yr m = (new mz(7)).c(7, 0).a("coal");
   public static yr n = (new yr(8)).c(7, 3).a("emerald");
   public static yr o = (new yr(9)).c(7, 1).a("ingotIron");
   public static yr p = (new yr(10)).c(7, 2).a("ingotGold");
   public static yr q = (new lx(11, uk.c)).c(2, 4).a("swordIron");
   public static yr r = (new lx(12, uk.a)).c(0, 4).a("swordWood");
   public static yr s = (new akd(13, uk.a)).c(0, 5).a("shovelWood");
   public static yr t = (new au(14, uk.a)).c(0, 6).a("pickaxeWood");
   public static yr u = (new nx(15, uk.a)).c(0, 7).a("hatchetWood");
   public static yr v = (new lx(16, uk.b)).c(1, 4).a("swordStone");
   public static yr w = (new akd(17, uk.b)).c(1, 5).a("shovelStone");
   public static yr x = (new au(18, uk.b)).c(1, 6).a("pickaxeStone");
   public static yr y = (new nx(19, uk.b)).c(1, 7).a("hatchetStone");
   public static yr z = (new lx(20, uk.d)).c(3, 4).a("swordDiamond");
   public static yr A = (new akd(21, uk.d)).c(3, 5).a("shovelDiamond");
   public static yr B = (new au(22, uk.d)).c(3, 6).a("pickaxeDiamond");
   public static yr C = (new nx(23, uk.d)).c(3, 7).a("hatchetDiamond");
   public static yr D = (new yr(24)).c(5, 3).j().a("stick");
   public static yr E = (new yr(25)).c(7, 4).a("bowl");
   public static yr F = (new br(26, 8)).c(8, 4).a("mushroomStew");
   public static yr G = (new lx(27, uk.e)).c(4, 4).a("swordGold");
   public static yr H = (new akd(28, uk.e)).c(4, 5).a("shovelGold");
   public static yr I = (new au(29, uk.e)).c(4, 6).a("pickaxeGold");
   public static yr J = (new nx(30, uk.e)).c(4, 7).a("hatchetGold");
   public static yr K = (new yr(31)).c(8, 0).a("string");
   public static yr L = (new yr(32)).c(8, 1).a("feather");
   public static yr M = (new yr(33)).c(8, 2).a("sulphur").b(hx.k);
   public static yr N = (new ic(34, uk.a)).c(0, 8).a("hoeWood");
   public static yr O = (new ic(35, uk.b)).c(1, 8).a("hoeStone");
   public static yr P = (new ic(36, uk.c)).c(2, 8).a("hoeIron");
   public static yr Q = (new ic(37, uk.d)).c(3, 8).a("hoeDiamond");
   public static yr R = (new ic(38, uk.e)).c(4, 8).a("hoeGold");
   public static yr S = (new mt(39, pb.az.bO, pb.aA.bO)).c(9, 0).a("seeds");
   public static yr T = (new yr(40)).c(9, 1).a("wheat");
   public static yr U = (new amm(41, 5, 0.6F, false)).c(9, 2).a("bread");
   public static yr V = (new ql(42, cg.a, 0, 0)).c(0, 0).a("helmetCloth");
   public static yr W = (new ql(43, cg.a, 0, 1)).c(0, 1).a("chestplateCloth");
   public static yr X = (new ql(44, cg.a, 0, 2)).c(0, 2).a("leggingsCloth");
   public static yr Y = (new ql(45, cg.a, 0, 3)).c(0, 3).a("bootsCloth");
   public static yr Z = (new ql(46, cg.b, 1, 0)).c(1, 0).a("helmetChain");
   public static yr aa = (new ql(47, cg.b, 1, 1)).c(1, 1).a("chestplateChain");
   public static yr ab = (new ql(48, cg.b, 1, 2)).c(1, 2).a("leggingsChain");
   public static yr ac = (new ql(49, cg.b, 1, 3)).c(1, 3).a("bootsChain");
   public static yr ad = (new ql(50, cg.c, 2, 0)).c(2, 0).a("helmetIron");
   public static yr ae = (new ql(51, cg.c, 2, 1)).c(2, 1).a("chestplateIron");
   public static yr af = (new ql(52, cg.c, 2, 2)).c(2, 2).a("leggingsIron");
   public static yr ag = (new ql(53, cg.c, 2, 3)).c(2, 3).a("bootsIron");
   public static yr ah = (new ql(54, cg.e, 3, 0)).c(3, 0).a("helmetDiamond");
   public static yr ai = (new ql(55, cg.e, 3, 1)).c(3, 1).a("chestplateDiamond");
   public static yr aj = (new ql(56, cg.e, 3, 2)).c(3, 2).a("leggingsDiamond");
   public static yr ak = (new ql(57, cg.e, 3, 3)).c(3, 3).a("bootsDiamond");
   public static yr al = (new ql(58, cg.d, 4, 0)).c(4, 0).a("helmetGold");
   public static yr am = (new ql(59, cg.d, 4, 1)).c(4, 1).a("chestplateGold");
   public static yr an = (new ql(60, cg.d, 4, 2)).c(4, 2).a("leggingsGold");
   public static yr ao = (new ql(61, cg.d, 4, 3)).c(4, 3).a("bootsGold");
   public static yr ap = (new yr(62)).c(6, 0).a("flint");
   public static yr aq = (new amm(63, 3, 0.3F, true)).c(7, 5).a("porkchopRaw");
   public static yr ar = (new amm(64, 8, 0.8F, true)).c(8, 5).a("porkchopCooked");
   public static yr as = (new amb(65)).c(10, 1).a("painting");
   public static yr at = (new sg(66, 4, 1.2F, false)).t().a(aad.l.H, 5, 0, 1.0F).c(11, 0).a("appleGold");
   public static yr au = (new ajj(67)).c(10, 2).a("sign");
   public static yr av = (new zs(68, acn.d)).c(11, 2).a("doorWood");
   public static yr aw = (new bb(69, 0)).c(10, 4).a("bucket");
   public static yr ax = (new bb(70, pb.A.bO)).c(11, 4).a("bucketWater").a(aw);
   public static yr ay = (new bb(71, pb.C.bO)).c(12, 4).a("bucketLava").a(aw);
   public static yr az = (new agr(72, 0)).c(7, 8).a("minecart");
   public static yr aA = (new nc(73)).c(8, 6).a("saddle");
   public static yr aB = (new zs(74, acn.f)).c(12, 2).a("doorIron");
   public static yr aC = (new zx(75)).c(8, 3).a("redstone").b(hx.i);
   public static yr aD = (new cv(76)).c(14, 0).a("snowball");
   public static yr aE = (new ajk(77)).c(8, 8).a("boat");
   public static yr aF = (new yr(78)).c(7, 6).a("leather");
   public static yr aG = (new pe(79)).c(13, 4).a("milk").a(aw);
   public static yr aH = (new yr(80)).c(6, 1).a("brick");
   public static yr aI = (new yr(81)).c(9, 3).a("clay");
   public static yr aJ = (new acs(82, pb.aX)).c(11, 1).a("reeds");
   public static yr aK = (new yr(83)).c(10, 3).a("paper");
   public static yr aL = (new yr(84)).c(11, 3).a("book");
   public static yr aM = (new yr(85)).c(14, 1).a("slimeball");
   public static yr aN = (new agr(86, 1)).c(7, 9).a("minecartChest");
   public static yr aO = (new agr(87, 2)).c(7, 10).a("minecartFurnace");
   public static yr aP = (new adc(88)).c(12, 0).a("egg");
   public static yr aQ = (new yr(89)).c(6, 3).a("compass");
   public static yr aR = (new vk(90)).c(5, 4).a("fishingRod");
   public static yr aS = (new yr(91)).c(6, 4).a("clock");
   public static yr aT = (new yr(92)).c(9, 4).a("yellowDust").b(hx.j);
   public static yr aU = (new amm(93, 2, 0.3F, false)).c(9, 5).a("fishRaw");
   public static yr aV = (new amm(94, 5, 0.6F, false)).c(10, 5).a("fishCooked");
   public static yr aW = (new hm(95)).c(14, 4).a("dyePowder");
   public static yr aX = (new yr(96)).c(12, 1).a("bone").j();
   public static yr aY = (new yr(97)).c(13, 0).a("sugar").b(hx.b);
   public static yr aZ = (new acs(98, pb.bg)).f(1).c(13, 1).a("cake");
   public static yr ba = (new aco(99)).f(1).c(13, 2).a("bed");
   public static yr bb = (new acs(100, pb.bh)).c(6, 5).a("diode");
   public static yr bc = (new amm(101, 1, 0.1F, false)).c(12, 5).a("cookie");
   public static ra bd = (ra)(new ra(102)).c(12, 3).a("map");
   public static bh be = (bh)(new bh(103)).c(13, 5).a("shears");
   public static yr bf = (new amm(104, 2, 0.3F, false)).c(13, 6).a("melon");
   public static yr bg = (new mt(105, pb.bs.bO, pb.aA.bO)).c(13, 3).a("seeds_pumpkin");
   public static yr bh = (new mt(106, pb.bt.bO, pb.aA.bO)).c(14, 3).a("seeds_melon");
   public static yr bi = (new amm(107, 3, 0.3F, true)).c(9, 6).a("beefRaw");
   public static yr bj = (new amm(108, 8, 0.8F, true)).c(10, 6).a("beefCooked");
   public static yr bk = (new amm(109, 2, 0.3F, true)).a(aad.s.H, 30, 0, 0.3F).c(9, 7).a("chickenRaw");
   public static yr bl = (new amm(110, 6, 0.6F, true)).c(10, 7).a("chickenCooked");
   public static yr bm = (new amm(111, 4, 0.1F, true)).a(aad.s.H, 30, 0, 0.8F).c(11, 5).a("rottenFlesh");
   public static yr bn = (new abr(112)).c(11, 6).a("enderPearl");
   public static yr bo = (new yr(113)).c(12, 6).a("blazeRod");
   public static yr bp = (new yr(114)).c(11, 7).a("ghastTear").b(hx.c);
   public static yr bq = (new yr(115)).c(12, 7).a("goldNugget");
   public static yr br = (new mt(116, pb.bD.bO, pb.bc.bO)).c(13, 7).a("netherStalkSeeds").b("+4");
   public static ei bs = (ei)(new ei(117)).c(13, 8).a("potion");
   public static yr bt = (new aio(118)).c(12, 8).a("glassBottle");
   public static yr bu = (new amm(119, 2, 0.8F, false)).a(aad.u.H, 5, 0, 1.0F).c(11, 8).a("spiderEye").b(hx.d);
   public static yr bv = (new yr(120)).c(10, 8).a("fermentedSpiderEye").b(hx.e);
   public static yr bw = (new yr(121)).c(13, 9).a("blazePowder").b(hx.g);
   public static yr bx = (new yr(122)).c(13, 10).a("magmaCream").b(hx.h);
   public static yr by = (new acs(123, pb.bF)).c(12, 10).a("brewingStand");
   public static yr bz = (new acs(124, pb.bG)).c(12, 9).a("cauldron");
   public static yr bA = (new po(125)).c(11, 9).a("eyeOfEnder");
   public static yr bB = (new yr(126)).c(9, 8).a("speckledMelon").b(hx.f);
   public static yr bC = (new acv(127)).c(9, 9).a("monsterPlacer");
   public static yr bD = (new xi(128)).c(11, 10).a("expBottle");
   public static yr bE = (new gx(129)).c(14, 2).a("fireball");
   public static yr bF = (new aid(2000, "13")).c(0, 15).a("record");
   public static yr bG = (new aid(2001, "cat")).c(1, 15).a("record");
   public static yr bH = (new aid(2002, "blocks")).c(2, 15).a("record");
   public static yr bI = (new aid(2003, "chirp")).c(3, 15).a("record");
   public static yr bJ = (new aid(2004, "far")).c(4, 15).a("record");
   public static yr bK = (new aid(2005, "mall")).c(5, 15).a("record");
   public static yr bL = (new aid(2006, "mellohi")).c(6, 15).a("record");
   public static yr bM = (new aid(2007, "stal")).c(7, 15).a("record");
   public static yr bN = (new aid(2008, "strad")).c(8, 15).a("record");
   public static yr bO = (new aid(2009, "ward")).c(9, 15).a("record");
   public static yr bP = (new aid(2010, "11")).c(10, 15).a("record");
   public final int bQ;
   protected int bR = 64;
   private int a = 0;
   protected int bS;
   protected boolean bT = false;
   protected boolean bU = false;
   private yr b = null;
   private String c = null;
   private String bV;


   protected yr(int var1) {
      this.bQ = 256 + var1;
      if(e[256 + var1] != null) {
         System.out.println("CONFLICT @ " + var1);
      }

      e[256 + var1] = this;
   }

   public yr e(int var1) {
      this.bS = var1;
      return this;
   }

   public yr f(int var1) {
      this.bR = var1;
      return this;
   }

   public yr c(int var1, int var2) {
      this.bS = var1 + var2 * 16;
      return this;
   }

   public int b(int var1) {
      return this.bS;
   }

   public final int g(aan var1) {
      return this.b(var1.i());
   }

   public boolean a(aan var1, yw var2, xd var3, int var4, int var5, int var6, int var7) {
      return false;
   }

   public float a(aan var1, pb var2) {
      return 1.0F;
   }

   public aan a(aan var1, xd var2, yw var3) {
      return var1;
   }

   public aan b(aan var1, xd var2, yw var3) {
      return var1;
   }

   public int f() {
      return this.bR;
   }

   public int a(int var1) {
      return 0;
   }

   public boolean g() {
      return this.bU;
   }

   protected yr a(boolean var1) {
      this.bU = var1;
      return this;
   }

   public int h() {
      return this.a;
   }

   protected yr g(int var1) {
      this.a = var1;
      return this;
   }

   public boolean i() {
      return this.a > 0 && !this.bU;
   }

   public boolean a(aan var1, acq var2, acq var3) {
      return false;
   }

   public boolean a(aan var1, int var2, int var3, int var4, int var5, acq var6) {
      return false;
   }

   public int a(nn var1) {
      return 1;
   }

   public boolean a(pb var1) {
      return false;
   }

   public void a(aan var1, acq var2) {}

   public yr j() {
      this.bT = true;
      return this;
   }

   public boolean a() {
      return this.bT;
   }

   public boolean A_() {
      return false;
   }

   public yr a(String var1) {
      this.bV = "item." + var1;
      return this;
   }

   public String h(aan var1) {
      String var2 = this.a(var1);
      return var2 == null?"":cy.a(var2);
   }

   public String e() {
      return this.bV;
   }

   public String a(aan var1) {
      return this.bV;
   }

   public yr a(yr var1) {
      this.b = var1;
      return this;
   }

   public boolean i(aan var1) {
      return true;
   }

   public boolean k() {
      return false;
   }

   public yr l() {
      return this.b;
   }

   public boolean m() {
      return this.b != null;
   }

   public String n() {
      return cy.a(this.e() + ".name");
   }

   public int b(int var1, int var2) {
      return 16777215;
   }

   public void a(aan var1, xd var2, nn var3, int var4, boolean var5) {}

   public void c(aan var1, xd var2, yw var3) {}

   public aaq c(aan var1) {
      return aaq.a;
   }

   public int b(aan var1) {
      return 0;
   }

   public void a(aan var1, xd var2, yw var3, int var4) {}

   protected yr b(String var1) {
      this.c = var1;
      return this;
   }

   public String o() {
      return this.c;
   }

   public boolean p() {
      return this.c != null;
   }

   public void a(aan var1, List var2) {}

   public String d(aan var1) {
      String var2 = ("" + adn.a().c(this.h(var1))).trim();
      return var2;
   }

   public boolean e(aan var1) {
      return var1.u();
   }

   public fo f(aan var1) {
      return var1.u()?fo.c:fo.a;
   }

   public boolean j(aan var1) {
      return this.f() == 1 && this.i();
   }

   protected pl a(xd var1, yw var2, boolean var3) {
      float var4 = 1.0F;
      float var5 = var2.x + (var2.v - var2.x) * var4;
      float var6 = var2.w + (var2.u - var2.w) * var4;
      double var7 = var2.l + (var2.o - var2.l) * (double)var4;
      double var9 = var2.m + (var2.p - var2.m) * (double)var4 + 1.62D - (double)var2.H;
      double var11 = var2.n + (var2.q - var2.n) * (double)var4;
      bo var13 = bo.b(var7, var9, var11);
      float var14 = gk.b(-var6 * 0.017453292F - 3.1415927F);
      float var15 = gk.a(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -gk.b(-var5 * 0.017453292F);
      float var17 = gk.a(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = 5.0D;
      bo var23 = var13.c((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      pl var24 = var1.a(var13, var23, var3, !var3);
      return var24;
   }

   public int b() {
      return 0;
   }

   public boolean c() {
      return false;
   }

   public int a(int var1, int var2) {
      return this.b(var1);
   }

   static {
      gv.c();
   }
}
