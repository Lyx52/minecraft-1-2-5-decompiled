package mojang;

import java.util.HashMap;
import java.util.Map;

public class EntityManager {

   private static Map nameToClass = new HashMap();
   private static Map classToName = new HashMap();
   private static Map idToClass = new HashMap();
   private static Map classToId = new HashMap();
   private static Map nameToId = new HashMap();
   public static HashMap a = new HashMap();


   private static void addEntity(Class entityClass, String entityName, int entityID) {
      nameToClass.put(entityName, entityClass);
      classToName.put(entityClass, entityName);
      idToClass.put(Integer.valueOf(entityID), entityClass);
      classToId.put(entityClass, Integer.valueOf(entityID));
      nameToId.put(entityName, Integer.valueOf(entityID));
   }

   private static void _addEntity(Class entityClass, String entityName, int entityID, int var3, int var4) {
      addEntity(entityClass, entityName, entityID);
      a.put(Integer.valueOf(entityID), new hr(entityID, var3, var4));
   }

   public static BaseEntity a(String var0, World var1) {
      BaseEntity var2 = null;

      try {
         Class var3 = (Class) nameToClass.get(var0);
         if(var3 != null) {
            var2 = (BaseEntity)var3.getConstructor(new Class[]{World.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static BaseEntity a(CompundTag var0, World var1) {
      BaseEntity entity = null;

      try {
         Class var3 = (Class) nameToClass.get(var0.getString("id"));
         if(var3 != null) {
            entity = (BaseEntity)var3.getConstructor(new Class[]{World.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(entity != null) {
         entity.e(var0);
      } else {
         System.out.println("Skipping Entity with id " + var0.getString("id"));
      }

      return entity;
   }

   public static BaseEntity createEntity(int entityID, World world) {
      BaseEntity entity = null;

      try {
         Class entityClass = (Class) idToClass.get(entityID);
         if(entityClass != null) {
            entity = (BaseEntity)entityClass.getConstructor(new Class[]{World.class}).newInstance(new Object[]{world});
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      if(entity == null) {
         System.out.println("Skipping Entity with id " + entityID);
      }

      return entity;
   }

   public static int getIDByClass(BaseEntity entityClass) {
      return (Integer) classToId.get(entityClass.getClass());
   }

   public static String getNameByClass(BaseEntity entityClass) {
      return (String) classToName.get(entityClass.getClass());
   }

   public static String getNameByID(int entityID) {
      Class entityClass = (Class) idToClass.get(entityID);
      return entityClass != null ? (String) classToName.get(entityClass) : null;
   }

   static {
      addEntity(Item.class, "Item", 1);
      addEntity(XPOrb.class, "XPOrb", 2);
      addEntity(Painting.class, "Painting", 9);
      addEntity(Arrow.class, "Arrow", 10);
      addEntity(Snowball.class, "Snowball", 11);
      addEntity(Fireball.class, "Fireball", 12);
      addEntity(SmallFireball.class, "SmallFireball", 13);
      addEntity(ThrownEnderpearl.class, "ThrownEnderpearl", 14);
      addEntity(EyeOfEnderSignal.class, "EyeOfEnderSignal", 15);
      addEntity(ThrownPotion.class, "ThrownPotion", 16);
      addEntity(ThrownExpBottle.class, "ThrownExpBottle", 17);
      addEntity(PrimeTnt.class, "PrimedTnt", 20);
      addEntity(FallingSand.class, "FallingSand", 21);
      addEntity(Minecart.class, "Minecart", 40);
      addEntity(Boat.class, "Boat", 41);
      addEntity(Mob.class, "Mob", 48);
      addEntity(Monster.class, "Monster", 49);
      _addEntity(Creeper.class, "Creeper", 50, 894731, 0);
      _addEntity(Skeleton.class, "Skeleton", 51, 12698049, 4802889);
      _addEntity(Spider.class, "Spider", 52, 3419431, 11013646);
      addEntity(Giant.class, "Giant", 53);
      _addEntity(Zombie.class, "Zombie", 54, '\uafaf', 7969893);
      _addEntity(Slime.class, "Slime", 55, 5349438, 8306542);
      _addEntity(Ghast.class, "Ghast", 56, 16382457, 12369084);
      _addEntity(PigZombie.class, "PigZombie", 57, 15373203, 5009705);
      _addEntity(Enderman.class, "Enderman", 58, 1447446, 0);
      _addEntity(CaveSpider.class, "CaveSpider", 59, 803406, 11013646);
      _addEntity(Silverfish.class, "Silverfish", 60, 7237230, 3158064);
      _addEntity(Blaze.class, "Blaze", 61, 16167425, 16775294);
      _addEntity(LavaSlime.class, "LavaSlime", 62, 3407872, 16579584);
      addEntity(EnderDragon.class, "EnderDragon", 63);
      _addEntity(Pig.class, "Pig", 90, 15771042, 14377823);
      _addEntity(Sheep.class, "Sheep", 91, 15198183, 16758197);
      _addEntity(Cow.class, "Cow", 92, 4470310, 10592673);
      _addEntity(Chicken.class, "Chicken", 93, 10592673, 16711680);
      _addEntity(Squid.class, "Squid", 94, 2243405, 7375001);
      _addEntity(Wolf.class, "Wolf", 95, 14144467, 13545366);
      _addEntity(MushroomCow.class, "MushroomCow", 96, 10489616, 12040119);
      addEntity(SnowMan.class, "SnowMan", 97);
      _addEntity(Ozelot.class, "Ozelot", 98, 15720061, 5653556);
      addEntity(VillagerGolem.class, "VillagerGolem", 99);
      _addEntity(Villager.class, "Villager", 120, 5651507, 12422002);
      addEntity(EnderCrystal.class, "EnderCrystal", 200);
   }
}
