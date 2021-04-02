package mojang;

public class WorldListItem implements Comparable {

   private final String location;
   private final String worldName;
   private final long lastPlayed;
   private final long randomVar;
   private final boolean needsConversion;
   private final int gameType;
   private final boolean hardcore;


   public WorldListItem(String location, String worldName, long lastPlayed, long randomVariable, int gameType, boolean needsConversion, boolean isHardcore) {
      this.location = location;
      this.worldName = worldName;
      this.lastPlayed = lastPlayed;
      this.randomVar = randomVariable;
      this.gameType = gameType;
      this.needsConversion = needsConversion;
      this.hardcore = isHardcore;
   }

   public String getWorldLocation() {
      return this.location;
   }

   public String getWorldName() {
      return this.worldName;
   }

   public boolean getNeedsConversion() {
      return this.needsConversion;
   }

   public long getLastPlayed() {
      return this.lastPlayed;
   }

   public int compareTo(Object world) {
      return this.lastPlayed < ((WorldListItem)world).lastPlayed ? 1 : (this.lastPlayed > ((WorldListItem)world).lastPlayed ? -1 :this.location.compareTo(((WorldListItem)world).location));
   }

   public int getGameType() {
      return this.gameType;
   }

   public boolean isHardcore() {
      return this.hardcore;
   }
}
