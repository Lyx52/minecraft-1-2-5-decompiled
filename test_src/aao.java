import java.util.HashMap;
import java.util.Map;

public class aao {

   private static Map b = new HashMap();
   private static Map c = new HashMap();
   private static Map d = new HashMap();
   private static Map e = new HashMap();
   private static Map f = new HashMap();
   public static HashMap a = new HashMap();


   private static void a(Class var0, String var1, int var2) {
      b.put(var1, var0);
      c.put(var0, var1);
      d.put(Integer.valueOf(var2), var0);
      e.put(var0, Integer.valueOf(var2));
      f.put(var1, Integer.valueOf(var2));
   }

   private static void a(Class var0, String var1, int var2, int var3, int var4) {
      a(var0, var1, var2);
      a.put(Integer.valueOf(var2), new hr(var2, var3, var4));
   }

   public static nn a(String var0, xd var1) {
      nn var2 = null;

      try {
         Class var3 = (Class)b.get(var0);
         if(var3 != null) {
            var2 = (nn)var3.getConstructor(new Class[]{xd.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static nn a(ady var0, xd var1) {
      nn var2 = null;

      try {
         Class var3 = (Class)b.get(var0.j("id"));
         if(var3 != null) {
            var2 = (nn)var3.getConstructor(new Class[]{xd.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 != null) {
         var2.e(var0);
      } else {
         System.out.println("Skipping Entity with id " + var0.j("id"));
      }

      return var2;
   }

   public static nn a(int var0, xd var1) {
      nn var2 = null;

      try {
         Class var3 = (Class)d.get(Integer.valueOf(var0));
         if(var3 != null) {
            var2 = (nn)var3.getConstructor(new Class[]{xd.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 == null) {
         System.out.println("Skipping Entity with id " + var0);
      }

      return var2;
   }

   public static int a(nn var0) {
      return ((Integer)e.get(var0.getClass())).intValue();
   }

   public static String b(nn var0) {
      return (String)c.get(var0.getClass());
   }

   public static String a(int var0) {
      Class var1 = (Class)d.get(Integer.valueOf(var0));
      return var1 != null?(String)c.get(var1):null;
   }

   static {
      a(fq.class, "Item", 1);
      a(bz.class, "XPOrb", 2);
      a(mk.class, "Painting", 9);
      a(nm.class, "Arrow", 10);
      a(uq.class, "Snowball", 11);
      a(bt.class, "Fireball", 12);
      a(qb.class, "SmallFireball", 13);
      a(adw.class, "ThrownEnderpearl", 14);
      a(va.class, "EyeOfEnderSignal", 15);
      a(bj.class, "ThrownPotion", 16);
      a(hf.class, "ThrownExpBottle", 17);
      a(agg.class, "PrimedTnt", 20);
      a(abf.class, "FallingSand", 21);
      a(ama.class, "Minecart", 40);
      a(ep.class, "Boat", 41);
      a(acq.class, "Mob", 48);
      a(yy.class, "Monster", 49);
      a(yd.class, "Creeper", 50, 894731, 0);
      a(xr.class, "Skeleton", 51, 12698049, 4802889);
      a(cb.class, "Spider", 52, 3419431, 11013646);
      a(kh.class, "Giant", 53);
      a(ajg.class, "Zombie", 54, '\uafaf', 7969893);
      a(aja.class, "Slime", 55, 5349438, 8306542);
      a(ui.class, "Ghast", 56, 16382457, 12369084);
      a(alt.class, "PigZombie", 57, 15373203, 5009705);
      a(jg.class, "Enderman", 58, 1447446, 0);
      a(fn.class, "CaveSpider", 59, 803406, 11013646);
      a(qn.class, "Silverfish", 60, 7237230, 3158064);
      a(adg.class, "Blaze", 61, 16167425, 16775294);
      a(aic.class, "LavaSlime", 62, 3407872, 16579584);
      a(oq.class, "EnderDragon", 63);
      a(qr.class, "Pig", 90, 15771042, 14377823);
      a(cu.class, "Sheep", 91, 15198183, 16758197);
      a(un.class, "Cow", 92, 4470310, 10592673);
      a(rd.class, "Chicken", 93, 10592673, 16711680);
      a(all.class, "Squid", 94, 2243405, 7375001);
      a(yo.class, "Wolf", 95, 14144467, 13545366);
      a(of.class, "MushroomCow", 96, 10489616, 12040119);
      a(q.class, "SnowMan", 97);
      a(uo.class, "Ozelot", 98, 15720061, 5653556);
      a(tl.class, "VillagerGolem", 99);
      a(ed.class, "Villager", 120, 5651507, 12422002);
      a(el.class, "EnderCrystal", 200);
   }
}
