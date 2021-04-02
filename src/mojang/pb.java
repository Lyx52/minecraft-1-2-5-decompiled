package mojang;

import java.util.ArrayList;
import java.util.Random;

public class pb {

   public static final vj d = new vj("stone", 1.0F, 1.0F);
   public static final vj e = new vj("wood", 1.0F, 1.0F);
   public static final vj f = new vj("gravel", 1.0F, 1.0F);
   public static final vj g = new vj("grass", 1.0F, 1.0F);
   public static final vj h = new vj("stone", 1.0F, 1.0F);
   public static final vj i = new vj("stone", 1.0F, 1.5F);
   public static final vj j = new ak("stone", 1.0F, 1.0F);
   public static final vj k = new vj("cloth", 1.0F, 1.0F);
   public static final vj l = new aj("sand", 1.0F, 1.0F);
   public static final pb[] m = new pb[4096];
   public static final boolean[] n = new boolean[4096];
   public static final int[] o = new int[4096];
   public static final boolean[] p = new boolean[4096];
   public static final int[] q = new int[4096];
   public static final boolean[] r = new boolean[4096];
   public static boolean[] s = new boolean[4096];
   public static final pb t = (new doo(1, 1)).c(1.5F).b(10.0F).a(h).a("stone");
   public static final qy u = (qy)(new qy(2)).c(0.6F).a(g).a("grass");
   public static final pb v = (new aet(3, 2)).c(0.5F).a(f).a("dirt");
   public static final pb w = (new pb(4, 16, acn.e)).c(2.0F).b(10.0F).a(h).a("stonebrick");
   public static final pb x = (new nz(5)).c(2.0F).b(5.0F).a(e).a("wood").k();
   public static final pb y = (new zc(6, 15)).c(0.0F).a(g).a("sapling").k();
   public static final pb z = (new pb(7, 17, acn.e)).m().b(6000000.0F).a(h).a("bedrock").u();
   public static final pb A = (new kr(8, acn.g)).c(100.0F).f(3).a("water").u().k();
   public static final pb B = (new aea(9, acn.g)).c(100.0F).f(3).a("water").u().k();
   public static final pb C = (new kr(10, acn.h)).c(0.0F).a(1.0F).f(255).a("lava").u().k();
   public static final pb D = (new aea(11, acn.h)).c(100.0F).a(1.0F).f(255).a("lava").u().k();
   public static final pb E = (new yp(12, 18)).c(0.5F).a(l).a("sand");
   public static final pb F = (new jq(13, 19)).c(0.6F).a(f).a("gravel");
   public static final pb G = (new jj(14, 32)).c(3.0F).b(5.0F).a(h).a("oreGold");
   public static final pb H = (new jj(15, 33)).c(3.0F).b(5.0F).a(h).a("oreIron");
   public static final pb I = (new jj(16, 34)).c(3.0F).b(5.0F).a(h).a("oreCoal");
   public static final pb J = (new pp(17)).c(2.0F).a(e).a("log").k();
   public static final uf K = (uf)(new uf(18, 52)).c(0.2F).f(1).a(g).a("leaves").k();
   public static final pb L = (new rf(19)).c(0.6F).a(g).a("sponge");
   public static final pb M = (new xj(20, 49, acn.q, false)).c(0.3F).a(j).a("glass");
   public static final pb N = (new jj(21, 160)).c(3.0F).b(5.0F).a(h).a("oreLapis");
   public static final pb O = (new pb(22, 144, acn.e)).c(3.0F).b(5.0F).a(h).a("blockLapis");
   public static final pb P = (new alj(23)).c(3.5F).a(h).a("dispenser").k();
   public static final pb Q = (new mo(24)).a(h).c(0.8F).a("sandStone").k();
   public static final pb R = (new afp(25)).c(0.8F).a("musicBlock").k();
   public static final pb S = (new pm(26)).c(0.2F).a("bed").u().k();
   public static final pb T = (new aez(27, 179, true)).c(0.7F).a(i).a("goldenRail").k();
   public static final pb U = (new afe(28, 195)).c(0.7F).a(i).a("detectorRail").k();
   public static final pb V = (new abc(29, 106, true)).a("pistonStickyBase").k();
   public static final pb W = (new mv(30, 11)).f(1).c(4.0F).a("web");
   public static final my X = (my)(new my(31, 39)).c(0.0F).a(g).a("tallgrass");
   public static final gs Y = (gs)(new gs(32, 55)).c(0.0F).a(g).a("deadbush");
   public static final pb Z = (new abc(33, 107, false)).a("pistonBase").k();
   public static final sq aa = (sq)(new sq(34, 107)).k();
   public static final pb ab = (new wo()).c(0.8F).a(k).a("cloth").k();
   public static final pa ac = new pa(36);
   public static final qk ad = (qk)(new qk(37, 13)).c(0.0F).a(g).a("flower");
   public static final qk ae = (qk)(new qk(38, 12)).c(0.0F).a(g).a("rose");
   public static final qk af = (qk)(new ahx(39, 29)).c(0.0F).a(g).a(0.125F).a("mushroom");
   public static final qk ag = (qk)(new ahx(40, 28)).c(0.0F).a(g).a("mushroom");
   public static final pb ah = (new su(41, 23)).c(3.0F).b(10.0F).a(i).a("blockGold");
   public static final pb ai = (new su(42, 22)).c(5.0F).b(10.0F).a(i).a("blockIron");
   public static final pb aj = (new amh(43, true)).c(2.0F).b(10.0F).a(h).a("stoneSlab");
   public static final pb ak = (new amh(44, false)).c(2.0F).b(10.0F).a(h).a("stoneSlab");
   public static final pb al = (new pb(45, 7, acn.e)).c(2.0F).b(10.0F).a(h).a("brick");
   public static final pb am = (new ae(46, 8)).c(0.0F).a(g).a("tnt");
   public static final pb an = (new fi(47, 35)).c(1.5F).a(e).a("bookshelf");
   public static final pb ao = (new pb(48, 36, acn.e)).c(2.0F).b(10.0F).a(h).a("stoneMoss");
   public static final pb ap = (new xb(49, 37)).c(50.0F).b(2000.0F).a(h).a("obsidian");
   public static final pb aq = (new pt(50, 80)).c(0.0F).a(0.9375F).a(e).a("torch").k();
   public static final ame ar = (ame)(new ame(51, 31)).c(0.0F).a(1.0F).a(e).a("fire").u();
   public static final pb as = (new cm(52, 65)).c(5.0F).a(i).a("mobSpawner").u();
   public static final pb at = (new nr(53, x)).a("stairsWood").k();
   public static final pb au = (new sn(54)).c(2.5F).a(e).a("chest").k();
   public static final pb av = (new ahi(55, 164)).c(0.0F).a(d).a("redstoneDust").u().k();
   public static final pb aw = (new jj(56, 50)).c(3.0F).b(5.0F).a(h).a("oreDiamond");
   public static final pb ax = (new su(57, 24)).c(5.0F).b(10.0F).a(i).a("blockDiamond");
   public static final pb ay = (new ef(58)).c(2.5F).a(e).a("workbench");
   public static final pb az = (new jx(59, 88)).c(0.0F).a(g).a("crops").u().k();
   public static final pb aA = (new ajp(60)).c(0.6F).a(f).a("farmland").k();
   public static final pb aB = (new aho(61, false)).c(3.5F).a(h).a("furnace").k();
   public static final pb aC = (new aho(62, true)).c(3.5F).a(h).a(0.875F).a("furnace").k();
   public static final pb aD = (new ot(63, sc.class, true)).c(1.0F).a(e).a("sign").u().k();
   public static final pb aE = (new acb(64, acn.d)).c(3.0F).a(e).a("doorWood").u().k();
   public static final pb aF = (new cx(65, 83)).c(0.4F).a(e).a("ladder").k();
   public static final pb aG = (new aez(66, 128, false)).c(0.7F).a(i).a("rail").k();
   public static final pb aH = (new nr(67, w)).a("stairsStone").k();
   public static final pb aI = (new ot(68, sc.class, false)).c(1.0F).a(e).a("sign").u().k();
   public static final pb aJ = (new alk(69, 96)).c(0.5F).a(e).a("lever").k();
   public static final pb aK = (new ul(70, t.bN, agw.b, acn.e)).c(0.5F).a(h).a("pressurePlate").k();
   public static final pb aL = (new acb(71, acn.f)).c(5.0F).a(i).a("doorIron").u().k();
   public static final pb aM = (new ul(72, x.bN, agw.a, acn.d)).c(0.5F).a(e).a("pressurePlate").k();
   public static final pb aN = (new uj(73, 51, false)).c(3.0F).b(5.0F).a(h).a("oreRedstone").k();
   public static final pb aO = (new uj(74, 51, true)).a(0.625F).c(3.0F).b(5.0F).a(h).a("oreRedstone").k();
   public static final pb aP = (new vo(75, 115, false)).c(0.0F).a(e).a("notGate").k();
   public static final pb aQ = (new vo(76, 99, true)).c(0.0F).a(0.5F).a(e).a("notGate").k();
   public static final pb aR = (new km(77, t.bN)).c(0.5F).a(h).a("button").k();
   public static final pb aS = (new ha(78, 66)).c(0.1F).a(k).a("snow").f(0);
   public static final pb aT = (new jz(79, 67)).c(0.5F).f(3).a(j).a("ice");
   public static final pb aU = (new aa(80, 66)).c(0.2F).a(k).a("snow");
   public static final pb aV = (new aer(81, 70)).c(0.4F).a(k).a("cactus");
   public static final pb aW = (new agz(82, 72)).c(0.6F).a(f).a("clay");
   public static final pb aX = (new ago(83, 73)).c(0.0F).a(g).a("reeds").u();
   public static final pb aY = (new xl(84, 74)).c(2.0F).b(10.0F).a(h).a("jukebox").k();
   public static final pb aZ = (new abg(85, 4)).c(2.0F).b(5.0F).a(e).a("fence");
   public static final pb ba = (new xa(86, 102, false)).c(1.0F).a(e).a("pumpkin").k();
   public static final pb bb = (new sa(87, 103)).c(0.4F).a(h).a("hellrock");
   public static final pb bc = (new aee(88, 104)).c(0.5F).a(l).a("hellsand");
   public static final pb bd = (new iq(89, 105, acn.q)).c(0.3F).a(j).a(1.0F).a("lightgem");
   public static final al be = (al)(new al(90, 14)).c(-1.0F).a(j).a(0.75F).a("portal");
   public static final pb bf = (new xa(91, 102, true)).c(1.0F).a(e).a(1.0F).a("litpumpkin").k();
   public static final pb bg = (new ov(92, 121)).c(0.5F).a(k).a("cake").u().k();
   public static final pb bh = (new qx(93, false)).c(0.0F).a(e).a("diode").u().k();
   public static final pb bi = (new qx(94, true)).c(0.0F).a(0.625F).a(e).a("diode").u().k();
   public static final pb bj = (new abx(95)).c(0.0F).a(1.0F).a(e).a("lockedchest").a(true).k();
   public static final pb bk = (new kt(96, acn.d)).c(3.0F).a(e).a("trapdoor").u().k();
   public static final pb bl = (new age(97)).c(0.75F);
   public static final pb bm = (new agi(98)).c(1.5F).b(10.0F).a(h).a("stonebricksmooth");
   public static final pb bn = (new pw(99, acn.d, 142, 0)).c(0.2F).a(e).a("mushroom").k();
   public static final pb bo = (new pw(100, acn.d, 142, 1)).c(0.2F).a(e).a("mushroom").k();
   public static final pb bp = (new akq(101, 85, 85, acn.f, true)).c(5.0F).b(10.0F).a(i).a("fenceIron");
   public static final pb bq = (new akq(102, 49, 148, acn.q, false)).c(0.3F).a(j).a("thinGlass");
   public static final pb br = (new eb(103)).c(1.0F).a(e).a("melon");
   public static final pb bs = (new aei(104, ba)).c(0.0F).a(e).a("pumpkinStem").k();
   public static final pb bt = (new aei(105, br)).c(0.0F).a(e).a("pumpkinStem").k();
   public static final pb bu = (new aem(106)).c(0.2F).a(g).a("vine").k();
   public static final pb bv = (new ajf(107, 4)).c(2.0F).b(5.0F).a(e).a("fenceGate").k();
   public static final pb bw = (new nr(108, al)).a("stairsBrick").k();
   public static final pb bx = (new nr(109, bm)).a("stairsStoneBrickSmooth").k();
   public static final alr by = (alr)(new alr(110)).c(0.6F).a(g).a("mycel");
   public static final pb bz = (new ye(111, 76)).c(0.0F).a(g).a("waterlily");
   public static final pb bA = (new pb(112, 224, acn.e)).c(2.0F).b(10.0F).a(h).a("netherBrick");
   public static final pb bB = (new abg(113, 224, acn.e)).c(2.0F).b(10.0F).a(h).a("netherFence");
   public static final pb bC = (new nr(114, bA)).a("stairsNetherBrick").k();
   public static final pb bD = (new rr(115)).a("netherStalk").k();
   public static final pb bE = (new yl(116)).c(5.0F).b(2000.0F).a("enchantmentTable");
   public static final pb bF = (new xc(117)).c(0.5F).a(0.125F).a("brewingStand").k();
   public static final pb bG = (new xm(118)).c(2.0F).a("cauldron").k();
   public static final pb bH = (new tc(119, acn.B)).c(-1.0F).b(6000000.0F);
   public static final pb bI = (new amj(120)).a(j).a(0.125F).c(-1.0F).a("endPortalFrame").k().b(6000000.0F);
   public static final pb bJ = (new pb(121, 175, acn.e)).c(3.0F).b(15.0F).a(h).a("whiteStone");
   public static final pb bK = (new de(122, 167)).c(3.0F).b(15.0F).a(h).a(0.125F).a("dragonEgg");
   public static final pb bL = (new ir(123, false)).c(0.3F).a(j).a("redstoneLight");
   public static final pb bM = (new ir(124, true)).c(0.3F).a(j).a("redstoneLight");
   public int bN;
   public final int bO;
   protected float bP;
   protected float bQ;
   protected boolean bR;
   protected boolean bS;
   protected boolean bT;
   protected boolean bU;
   public double bV;
   public double bW;
   public double bX;
   public double bY;
   public double bZ;
   public double ca;
   public vj cb;
   public float cc;
   public final acn cd;
   public float ce;
   private String a;


   protected pb(int var1, acn var2) {
      this.bR = true;
      this.bS = true;
      this.cb = d;
      this.cc = 1.0F;
      this.ce = 0.6F;
      if(m[var1] != null) {
         throw new IllegalArgumentException("Slot " + var1 + " is already occupied by " + m[var1] + " when adding " + this);
      } else {
         this.cd = var2;
         m[var1] = this;
         this.bO = var1;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         n[var1] = this.a();
         o[var1] = this.a()?255:0;
         p[var1] = !var2.b();
      }
   }

   protected pb k() {
      r[this.bO] = true;
      return this;
   }

   protected void l() {}

   protected pb(int var1, int var2, acn var3) {
      this(var1, var3);
      this.bN = var2;
   }

   protected pb a(vj var1) {
      this.cb = var1;
      return this;
   }

   protected pb f(int var1) {
      o[this.bO] = var1;
      return this;
   }

   protected pb a(float var1) {
      q[this.bO] = (int)(15.0F * var1);
      return this;
   }

   protected pb b(float var1) {
      this.bQ = var1 * 3.0F;
      return this;
   }

   public static boolean g(int var0) {
      pb var1 = m[var0];
      return var1 == null?false:var1.cd.j() && var1.b();
   }

   public boolean b() {
      return true;
   }

   public boolean b(ali var1, int var2, int var3, int var4) {
      return !this.cd.c();
   }

   public int d() {
      return 0;
   }

   protected pb c(float var1) {
      this.bP = var1;
      if(this.bQ < var1 * 5.0F) {
         this.bQ = var1 * 5.0F;
      }

      return this;
   }

   protected pb m() {
      this.c(-1.0F);
      return this;
   }

   public float n() {
      return this.bP;
   }

   protected pb a(boolean var1) {
      this.bT = var1;
      return this;
   }

   public boolean o() {
      return this.bT;
   }

   public boolean p() {
      return this.bU;
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.bV = (double)var1;
      this.bW = (double)var2;
      this.bX = (double)var3;
      this.bY = (double)var4;
      this.bZ = (double)var5;
      this.ca = (double)var6;
   }

   public float e(ali var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4, q[this.bO]);
   }

   public int d(ali var1, int var2, int var3, int var4) {
      return var1.b(var2, var3, var4, q[this.bO]);
   }

   public boolean a(ali var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 && this.bW > 0.0D?true:(var5 == 1 && this.bZ < 1.0D?true:(var5 == 2 && this.bX > 0.0D?true:(var5 == 3 && this.ca < 1.0D?true:(var5 == 4 && this.bV > 0.0D?true:(var5 == 5 && this.bY < 1.0D?true:!var1.g(var2, var3, var4))))));
   }

   public boolean c(ali var1, int var2, int var3, int var4, int var5) {
      return var1.f(var2, var3, var4).a();
   }

   public int d(ali var1, int var2, int var3, int var4, int var5) {
      return this.a(var5, var1.e(var2, var3, var4));
   }

   public int a(int var1, int var2) {
      return this.a_(var1);
   }

   public int a_(int var1) {
      return this.bN;
   }

   public wu d(xd var1, int var2, int var3, int var4) {
      return wu.b((double)var2 + this.bV, (double)var3 + this.bW, (double)var4 + this.bX, (double)var2 + this.bY, (double)var3 + this.bZ, (double)var4 + this.ca);
   }

   public void a(xd var1, int var2, int var3, int var4, wu var5, ArrayList var6) {
      wu var7 = this.c(var1, var2, var3, var4);
      if(var7 != null && var5.a(var7)) {
         var6.add(var7);
      }

   }

   public wu c(xd var1, int var2, int var3, int var4) {
      return wu.b((double)var2 + this.bV, (double)var3 + this.bW, (double)var4 + this.bX, (double)var2 + this.bY, (double)var3 + this.bZ, (double)var4 + this.ca);
   }

   public boolean a() {
      return true;
   }

   public boolean a(int var1, boolean var2) {
      return this.j();
   }

   public boolean j() {
      return true;
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {}

   public void b(xd var1, int var2, int var3, int var4, Random var5) {}

   public void b(xd var1, int var2, int var3, int var4, int var5) {}

   public void a(xd var1, int var2, int var3, int var4, int var5) {}

   public int e() {
      return 10;
   }

   public void a(xd var1, int var2, int var3, int var4) {}

   public void b_(xd var1, int var2, int var3, int var4) {}

   public int a(Random var1) {
      return 1;
   }

   public int a(int var1, Random var2, int var3) {
      return this.bO;
   }

   public float a(yw var1) {
      return this.bP < 0.0F?0.0F:(!var1.b(this)?1.0F / this.bP / 100.0F:var1.a(this) / this.bP / 30.0F);
   }

   public final void a(xd var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1, var2, var3, var4, var5, 1.0F, var6);
   }

   public void a(xd var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.F) {
         int var8 = this.a(var7, var1.r);

         for(int var9 = 0; var9 < var8; ++var9) {
            if(var1.r.nextFloat() <= var6) {
               int var10 = this.a(var5, var1.r, var7);
               if(var10 > 0) {
                  this.a(var1, var2, var3, var4, new aan(var10, 1, this.c(var5)));
               }
            }
         }

      }
   }

   protected void a(xd var1, int var2, int var3, int var4, aan var5) {
      if(!var1.F) {
         float var6 = 0.7F;
         double var7 = (double)(var1.r.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         double var9 = (double)(var1.r.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         double var11 = (double)(var1.r.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         fq var13 = new fq(var1, (double)var2 + var7, (double)var3 + var9, (double)var4 + var11, var5);
         var13.c = 10;
         var1.a((nn)var13);
      }
   }

   protected int c(int var1) {
      return 0;
   }

   public float a(nn var1) {
      return this.bQ / 5.0F;
   }

   public pl a(xd var1, int var2, int var3, int var4, bo var5, bo var6) {
      this.a((ali)var1, var2, var3, var4);
      var5 = var5.c((double)(-var2), (double)(-var3), (double)(-var4));
      var6 = var6.c((double)(-var2), (double)(-var3), (double)(-var4));
      bo var7 = var5.a(var6, this.bV);
      bo var8 = var5.a(var6, this.bY);
      bo var9 = var5.b(var6, this.bW);
      bo var10 = var5.b(var6, this.bZ);
      bo var11 = var5.c(var6, this.bX);
      bo var12 = var5.c(var6, this.ca);
      if(!this.a(var7)) {
         var7 = null;
      }

      if(!this.a(var8)) {
         var8 = null;
      }

      if(!this.b(var9)) {
         var9 = null;
      }

      if(!this.b(var10)) {
         var10 = null;
      }

      if(!this.c(var11)) {
         var11 = null;
      }

      if(!this.c(var12)) {
         var12 = null;
      }

      bo var13 = null;
      if(var7 != null && (var13 == null || var5.d(var7) < var5.d(var13))) {
         var13 = var7;
      }

      if(var8 != null && (var13 == null || var5.d(var8) < var5.d(var13))) {
         var13 = var8;
      }

      if(var9 != null && (var13 == null || var5.d(var9) < var5.d(var13))) {
         var13 = var9;
      }

      if(var10 != null && (var13 == null || var5.d(var10) < var5.d(var13))) {
         var13 = var10;
      }

      if(var11 != null && (var13 == null || var5.d(var11) < var5.d(var13))) {
         var13 = var11;
      }

      if(var12 != null && (var13 == null || var5.d(var12) < var5.d(var13))) {
         var13 = var12;
      }

      if(var13 == null) {
         return null;
      } else {
         byte var14 = -1;
         if(var13 == var7) {
            var14 = 4;
         }

         if(var13 == var8) {
            var14 = 5;
         }

         if(var13 == var9) {
            var14 = 0;
         }

         if(var13 == var10) {
            var14 = 1;
         }

         if(var13 == var11) {
            var14 = 2;
         }

         if(var13 == var12) {
            var14 = 3;
         }

         return new pl(var2, var3, var4, var14, var13.c((double)var2, (double)var3, (double)var4));
      }
   }

   private boolean a(bo var1) {
      return var1 == null?false:var1.b >= this.bW && var1.b <= this.bZ && var1.c >= this.bX && var1.c <= this.ca;
   }

   private boolean b(bo var1) {
      return var1 == null?false:var1.a >= this.bV && var1.a <= this.bY && var1.c >= this.bX && var1.c <= this.ca;
   }

   private boolean c(bo var1) {
      return var1 == null?false:var1.a >= this.bV && var1.a <= this.bY && var1.b >= this.bW && var1.b <= this.bZ;
   }

   public void b(xd var1, int var2, int var3, int var4) {}

   public int c() {
      return 0;
   }

   public boolean d(xd var1, int var2, int var3, int var4, int var5) {
      return this.e(var1, var2, var3, var4);
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return var5 == 0 || m[var5].cd.i();
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      return false;
   }

   public void b(xd var1, int var2, int var3, int var4, nn var5) {}

   public void c(xd var1, int var2, int var3, int var4, int var5) {}

   public void a(xd var1, int var2, int var3, int var4, yw var5) {}

   public void a(xd var1, int var2, int var3, int var4, nn var5, bo var6) {}

   public void a(ali var1, int var2, int var3, int var4) {}

   public int i() {
      return 16777215;
   }

   public int d(int var1) {
      return 16777215;
   }

   public int c(ali var1, int var2, int var3, int var4) {
      return 16777215;
   }

   public boolean b(ali var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean g() {
      return false;
   }

   public void a(xd var1, int var2, int var3, int var4, nn var5) {}

   public boolean e(xd var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public void h() {}

   public void a(xd var1, yw var2, int var3, int var4, int var5, int var6) {
      var2.a(gv.C[this.bO], 1);
      var2.c(0.025F);
      if(this.q() && ais.d(var2.ap)) {
         aan var8 = this.b(var6);
         if(var8 != null) {
            this.a(var1, var3, var4, var5, var8);
         }
      } else {
         int var7 = ais.e(var2.ap);
         this.a(var1, var3, var4, var5, var6, var7);
      }

   }

   protected boolean q() {
      return this.b() && !this.bU;
   }

   protected aan b(int var1) {
      int var2 = 0;
      if(this.bO >= 0 && this.bO < yr.e.length && yr.e[this.bO].g()) {
         var2 = var1;
      }

      return new aan(this.bO, 1, var2);
   }

   public int a(int var1, Random var2) {
      return this.a(var2);
   }

   public boolean g(xd var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(xd var1, int var2, int var3, int var4, acq var5) {}

   public pb a(String var1) {
      this.a = "tile." + var1;
      return this;
   }

   public String r() {
      return cy.a(this.s() + ".name");
   }

   public String s() {
      return this.a;
   }

   public void b(xd var1, int var2, int var3, int var4, int var5, int var6) {}

   public boolean t() {
      return this.bS;
   }

   protected pb u() {
      this.bS = false;
      return this;
   }

   public int f() {
      return this.cd.l();
   }

   public float f(ali var1, int var2, int var3, int var4) {
      return var1.h(var2, var3, var4)?0.2F:1.0F;
   }

   public void a(xd var1, int var2, int var3, int var4, nn var5, float var6) {}

   static {
      yr.e[ab.bO] = (new uc(ab.bO - 256)).a("cloth");
      yr.e[J.bO] = (new aba(J.bO - 256, J)).a("log");
      yr.e[x.bO] = (new aba(x.bO - 256, x)).a("wood");
      yr.e[bm.bO] = (new aba(bm.bO - 256, bm)).a("stonebricksmooth");
      yr.e[Q.bO] = (new aba(Q.bO - 256, Q)).a("sandStone");
      yr.e[ak.bO] = (new wt(ak.bO - 256)).a("stoneSlab");
      yr.e[y.bO] = (new jh(y.bO - 256)).a("sapling");
      yr.e[K.bO] = (new ph(K.bO - 256)).a("leaves");
      yr.e[bu.bO] = new aky(bu.bO - 256, false);
      yr.e[X.bO] = (new aky(X.bO - 256, true)).a(new String[]{"shrub", "grass", "fern"});
      yr.e[bz.bO] = new agq(bz.bO - 256);
      yr.e[Z.bO] = new agc(Z.bO - 256);
      yr.e[V.bO] = new agc(V.bO - 256);

      for(int var0 = 0; var0 < 256; ++var0) {
         if(m[var0] != null) {
            if(yr.e[var0] == null) {
               yr.e[var0] = new vd(var0 - 256);
               m[var0].l();
            }

            boolean var1 = false;
            if(var0 > 0 && m[var0].d() == 10) {
               var1 = true;
            }

            if(var0 > 0 && m[var0] instanceof amh) {
               var1 = true;
            }

            if(var0 == aA.bO) {
               var1 = true;
            }

            if(p[var0]) {
               var1 = true;
            }

            s[var0] = var1;
         }
      }

      p[0] = true;
      gv.b();
   }
}
