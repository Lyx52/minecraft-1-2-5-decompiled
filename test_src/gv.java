import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class gv {

   protected static Map a = new HashMap();
   public static List b = new ArrayList();
   public static List c = new ArrayList();
   public static List d = new ArrayList();
   public static List e = new ArrayList();
   public static ajw f = (new rx(1000, "stat.startGame")).h().a();
   public static ajw g = (new rx(1001, "stat.createWorld")).h().a();
   public static ajw h = (new rx(1002, "stat.loadWorld")).h().a();
   public static ajw i = (new rx(1003, "stat.joinMultiplayer")).h().a();
   public static ajw j = (new rx(1004, "stat.leaveGame")).h().a();
   public static ajw k = (new rx(1100, "stat.playOneMinute", ajw.i)).h().a();
   public static ajw l = (new rx(2000, "stat.walkOneCm", ajw.j)).h().a();
   public static ajw m = (new rx(2001, "stat.swimOneCm", ajw.j)).h().a();
   public static ajw n = (new rx(2002, "stat.fallOneCm", ajw.j)).h().a();
   public static ajw o = (new rx(2003, "stat.climbOneCm", ajw.j)).h().a();
   public static ajw p = (new rx(2004, "stat.flyOneCm", ajw.j)).h().a();
   public static ajw q = (new rx(2005, "stat.diveOneCm", ajw.j)).h().a();
   public static ajw r = (new rx(2006, "stat.minecartOneCm", ajw.j)).h().a();
   public static ajw s = (new rx(2007, "stat.boatOneCm", ajw.j)).h().a();
   public static ajw t = (new rx(2008, "stat.pigOneCm", ajw.j)).h().a();
   public static ajw u = (new rx(2010, "stat.jump")).h().a();
   public static ajw v = (new rx(2011, "stat.drop")).h().a();
   public static ajw w = (new rx(2020, "stat.damageDealt")).a();
   public static ajw x = (new rx(2021, "stat.damageTaken")).a();
   public static ajw y = (new rx(2022, "stat.deaths")).a();
   public static ajw z = (new rx(2023, "stat.mobKills")).a();
   public static ajw A = (new rx(2024, "stat.playerKills")).a();
   public static ajw B = (new rx(2025, "stat.fishCaught")).a();
   public static ajw[] C = a("stat.mineBlock", 16777216);
   public static ajw[] D;
   public static ajw[] E;
   public static ajw[] F;
   private static boolean G;
   private static boolean H;


   public static void a() {}

   public static void b() {
      E = a(E, "stat.useItem", 16908288, 0, 256);
      F = b(F, "stat.breakItem", 16973824, 0, 256);
      G = true;
      d();
   }

   public static void c() {
      E = a(E, "stat.useItem", 16908288, 256, 32000);
      F = b(F, "stat.breakItem", 16973824, 256, 32000);
      H = true;
      d();
   }

   public static void d() {
      if(G && H) {
         HashSet var0 = new HashSet();
         Iterator var1 = fr.a().b().iterator();

         while(var1.hasNext()) {
            wf var2 = (wf)var1.next();
            var0.add(Integer.valueOf(var2.b().c));
         }

         var1 = dy.a().b().values().iterator();

         while(var1.hasNext()) {
            aan var4 = (aan)var1.next();
            var0.add(Integer.valueOf(var4.c));
         }

         D = new ajw[32000];
         var1 = var0.iterator();

         while(var1.hasNext()) {
            Integer var5 = (Integer)var1.next();
            if(yr.e[var5.intValue()] != null) {
               String var3 = cy.a("stat.craftItem", new Object[]{yr.e[var5.intValue()].n()});
               D[var5.intValue()] = (new aii(16842752 + var5.intValue(), var3, var5.intValue())).a();
            }
         }

         a(D);
      }
   }

   private static ajw[] a(String var0, int var1) {
      ajw[] var2 = new ajw[256];

      for(int var3 = 0; var3 < 256; ++var3) {
         if(pb.m[var3] != null && pb.m[var3].t()) {
            String var4 = cy.a(var0, new Object[]{pb.m[var3].r()});
            var2[var3] = (new aii(var1 + var3, var4, var3)).a();
            e.add((aii)var2[var3]);
         }
      }

      a(var2);
      return var2;
   }

   private static ajw[] a(ajw[] var0, String var1, int var2, int var3, int var4) {
      if(var0 == null) {
         var0 = new ajw[32000];
      }

      for(int var5 = var3; var5 < var4; ++var5) {
         if(yr.e[var5] != null) {
            String var6 = cy.a(var1, new Object[]{yr.e[var5].n()});
            var0[var5] = (new aii(var2 + var5, var6, var5)).a();
            if(var5 >= 256) {
               d.add((aii)var0[var5]);
            }
         }
      }

      a(var0);
      return var0;
   }

   private static ajw[] b(ajw[] var0, String var1, int var2, int var3, int var4) {
      if(var0 == null) {
         var0 = new ajw[32000];
      }

      for(int var5 = var3; var5 < var4; ++var5) {
         if(yr.e[var5] != null && yr.e[var5].i()) {
            String var6 = cy.a(var1, new Object[]{yr.e[var5].n()});
            var0[var5] = (new aii(var2 + var5, var6, var5)).a();
         }
      }

      a(var0);
      return var0;
   }

   private static void a(ajw[] var0) {
      a(var0, pb.B.bO, pb.A.bO);
      a(var0, pb.D.bO, pb.D.bO);
      a(var0, pb.bf.bO, pb.ba.bO);
      a(var0, pb.aC.bO, pb.aB.bO);
      a(var0, pb.aO.bO, pb.aN.bO);
      a(var0, pb.bi.bO, pb.bh.bO);
      a(var0, pb.aQ.bO, pb.aP.bO);
      a(var0, pb.ag.bO, pb.af.bO);
      a(var0, pb.aj.bO, pb.ak.bO);
      a(var0, pb.u.bO, pb.v.bO);
      a(var0, pb.aA.bO, pb.v.bO);
   }

   private static void a(ajw[] var0, int var1, int var2) {
      if(var0[var1] != null && var0[var2] == null) {
         var0[var2] = var0[var1];
      } else {
         b.remove(var0[var1]);
         e.remove(var0[var1]);
         c.remove(var0[var1]);
         var0[var1] = var0[var2];
      }
   }

   public static ajw a(int var0) {
      return (ajw)a.get(Integer.valueOf(var0));
   }

   static {
      dp.a();
      G = false;
      H = false;
   }
}
