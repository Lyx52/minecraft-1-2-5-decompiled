package mojang;

import java.util.ArrayList;
import java.util.List;

public class dp {

   public static int a;
   public static int b;
   public static int c;
   public static int d;
   public static List e = new ArrayList();
   public static aeb f = (new aeb(0, "openInventory", 0, 0, yr.aL, (aeb)null)).b().d();
   public static aeb g = (new aeb(1, "mineWood", 2, 1, pb.J, f)).d();
   public static aeb h = (new aeb(2, "buildWorkBench", 4, -1, pb.ay, g)).d();
   public static aeb i = (new aeb(3, "buildPickaxe", 4, 2, yr.t, h)).d();
   public static aeb j = (new aeb(4, "buildFurnace", 3, 4, pb.aC, i)).d();
   public static aeb k = (new aeb(5, "acquireIron", 1, 4, yr.o, j)).d();
   public static aeb l = (new aeb(6, "buildHoe", 2, -3, yr.N, h)).d();
   public static aeb m = (new aeb(7, "makeBread", -1, -3, yr.U, l)).d();
   public static aeb n = (new aeb(8, "bakeCake", 0, -5, yr.aZ, l)).d();
   public static aeb o = (new aeb(9, "buildBetterPickaxe", 6, 2, yr.x, i)).d();
   public static aeb p = (new aeb(10, "cookFish", 2, 6, yr.aV, j)).d();
   public static aeb q = (new aeb(11, "onARail", 2, 3, pb.aG, k)).c().d();
   public static aeb r = (new aeb(12, "buildSword", 6, -1, yr.r, h)).d();
   public static aeb s = (new aeb(13, "killEnemy", 8, -1, yr.aX, r)).d();
   public static aeb t = (new aeb(14, "killCow", 7, -3, yr.aF, r)).d();
   public static aeb u = (new aeb(15, "flyPig", 8, -4, yr.aA, t)).c().d();
   public static aeb v = (new aeb(16, "snipeSkeleton", 7, 0, yr.k, s)).c().d();
   public static aeb w = (new aeb(17, "diamonds", -1, 5, yr.n, k)).d();
   public static aeb x = (new aeb(18, "portal", -1, 7, pb.ap, w)).d();
   public static aeb y = (new aeb(19, "ghast", -4, 8, yr.bp, x)).c().d();
   public static aeb z = (new aeb(20, "blazeRod", 0, 9, yr.bo, x)).d();
   public static aeb A = (new aeb(21, "potion", 2, 8, yr.bs, z)).d();
   public static aeb B = (new aeb(22, "theEnd", 3, 10, yr.bA, z)).c().d();
   public static aeb C = (new aeb(23, "theEnd2", 4, 13, pb.bK, B)).c().d();
   public static aeb D = (new aeb(24, "enchantments", -4, 4, pb.bE, w)).d();
   public static aeb E = (new aeb(25, "overkill", -4, 1, yr.z, D)).c().d();
   public static aeb F = (new aeb(26, "bookcase", -3, 6, pb.an, D)).d();


   public static void a() {}

   static {
      System.out.println(e.size() + " achievements");
   }
}
