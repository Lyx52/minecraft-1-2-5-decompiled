package mojang;

import java.util.List;

public class WorldParser {

   private long worldSeed;
   private WorldGeneratorTypes generatorType;
   private int spawnX;
   private int spawnY;
   private int spawnZ;
   private long gameTime;
   private long lastPlayed;
   private long sizeOnDisk;
   private CompundTag playerTag;
   private int playerDimension;
   private String levelName;
   private int version;
   private boolean isRaining;
   private int rainTime;
   private boolean isThundering;
   private int thunderTime;
   private int gameType;
   private boolean hasMapFeatures;
   private boolean isHardcore;


   public WorldParser(CompundTag tag) {
      this.generatorType = WorldGeneratorTypes.defaultWorld;
      this.isHardcore = false;
      this.worldSeed = tag.getLong("RandomSeed");
      if(tag.containsKey("generatorName")) {
         String generatorName = tag.getString("generatorName");
         this.generatorType = WorldGeneratorTypes.getGenerator(generatorName);

         if(this.generatorType == null) {
            this.generatorType = WorldGeneratorTypes.defaultWorld;
         } else if(this.generatorType.getIsDefault()) {
            int generatorVersion = 0;
            if(tag.containsKey("generatorVersion")) {
               generatorVersion = tag.getInt("generatorVersion");
            }

            this.generatorType = this.generatorType.getByVersion(generatorVersion);
         }
      }

      this.gameType = tag.getInt("GameType");
      if(tag.containsKey("MapFeatures")) {
         this.hasMapFeatures = tag.getBoolean("MapFeatures");
      } else {
         this.hasMapFeatures = true;
      }

      this.spawnX = tag.getInt("SpawnX");
      this.spawnY = tag.getInt("SpawnY");
      this.spawnZ = tag.getInt("SpawnZ");
      this.gameTime = tag.getLong("Time");
      this.lastPlayed = tag.getLong("LastPlayed");
      this.sizeOnDisk = tag.getLong("SizeOnDisk");
      this.levelName = tag.getString("LevelName");
      this.version = tag.getInt("version");
      this.rainTime = tag.getInt("rainTime");
      this.isRaining = tag.getBoolean("raining");
      this.thunderTime = tag.getInt("thunderTime");
      this.isThundering = tag.getBoolean("thundering");
      this.isHardcore = tag.getBoolean("hardcore");

      if(tag.containsKey("Player")) {
         this.playerTag = tag.getCompundTag("Player");
         this.playerDimension = this.playerTag.getInt("Dimension");
      }

   }

   public WorldParser(WorldStub world, String levelName) {
      this.generatorType = WorldGeneratorTypes.defaultWorld;
      this.isHardcore = false;
      this.worldSeed = world.getSeed();
      this.gameType = world.getGameType();
      this.hasMapFeatures = world.hasMapFeatures();
      this.levelName = levelName;
      this.isHardcore = world.isHardcore();
      this.generatorType = world.generatorType();
   }

   public WorldParser(WorldParser var1) {
      this.generatorType = WorldGeneratorTypes.defaultWorld;
      this.isHardcore = false;
      this.worldSeed = var1.worldSeed;
      this.generatorType = var1.generatorType;
      this.gameType = var1.gameType;
      this.hasMapFeatures = var1.hasMapFeatures;
      this.spawnX = var1.spawnX;
      this.spawnY = var1.spawnY;
      this.spawnZ = var1.spawnZ;
      this.gameTime = var1.gameTime;
      this.lastPlayed = var1.lastPlayed;
      this.sizeOnDisk = var1.sizeOnDisk;
      this.playerTag = var1.playerTag;
      this.playerDimension = var1.playerDimension;
      this.levelName = var1.levelName;
      this.version = var1.version;
      this.rainTime = var1.rainTime;
      this.isRaining = var1.isRaining;
      this.thunderTime = var1.thunderTime;
      this.isThundering = var1.isThundering;
      this.isHardcore = var1.isHardcore;
   }

   public CompundTag getTagWithCurrentPlayer() {
      CompundTag tag = new CompundTag();
      this.setWorldTag(tag, this.playerTag);
      return tag;
   }

   public CompundTag setPlayerData(List dataList) {
      CompundTag tag = new CompundTag();
      Player player = null;
      CompundTag newTag = null;
      if(dataList.size() > 0) {
         player = (Player)dataList.get(0);
      }

      if(player != null) {
         newTag = new CompundTag();
         player.setEntityData(newTag);
      }

      this.setWorldTag(tag, newTag);
      return tag;
   }

   private void setWorldTag(CompundTag worldTag, CompundTag playerTag) {
      worldTag.addLong("RandomSeed", this.worldSeed);
      worldTag.addString("generatorName", this.generatorType.a());
      worldTag.addInt("generatorVersion", this.generatorType.c());
      worldTag.addInt("GameType", this.gameType);
      worldTag.addBoolean("MapFeatures", this.hasMapFeatures);
      worldTag.addInt("SpawnX", this.spawnX);
      worldTag.addInt("SpawnY", this.spawnY);
      worldTag.addInt("SpawnZ", this.spawnZ);
      worldTag.addLong("Time", this.gameTime);
      worldTag.addLong("SizeOnDisk", this.sizeOnDisk);
      worldTag.addLong("LastPlayed", System.currentTimeMillis());
      worldTag.addString("LevelName", this.levelName);
      worldTag.addInt("version", this.version);
      worldTag.addInt("rainTime", this.rainTime);
      worldTag.addBoolean("raining", this.isRaining);
      worldTag.addInt("thunderTime", this.thunderTime);
      worldTag.addBoolean("thundering", this.isThundering);
      worldTag.addBoolean("hardcore", this.isHardcore);
      if(playerTag != null) {
         worldTag.addCompundTag("Player", playerTag);
      }

   }

   public long getWorldSeed() {
      return this.worldSeed;
   }

   public int getSpawnX() {
      return this.spawnX;
   }

   public int getSpawnY() {
      return this.spawnY;
   }

   public int getSpawnZ() {
      return this.spawnZ;
   }

   public long getGameTime() {
      return this.gameTime;
   }

   public long getSizeOnDisk() {
      return this.sizeOnDisk;
   }

   public CompundTag getPlayerTag() {
      return this.playerTag;
   }

   public int getPlayerDimension() {
      return this.playerDimension;
   }

   public void setSpawnX(int x) {
      this.spawnX = x;
   }

   public void setSpawnY(int y) {
      this.spawnY = y;
   }

   public void setSpawnZ(int z) {
      this.spawnZ = z;
   }

   public void setGameTime(long value) {
      this.gameTime = value;
   }

   public void setPlayerTag(CompundTag tag) {
      this.playerTag = tag;
   }

   public void setSpawnPoint(int x, int y, int z) {
      this.spawnX = x;
      this.spawnY = y;
      this.spawnZ = z;
   }

   public String getLevelName() {
      return this.levelName;
   }

   public void setLevelName(String name) {
      this.levelName = name;
   }

   public int getVersion() {
      return this.version;
   }

   public void setVersion(int version) {
      this.version = version;
   }

   public long getLastPlayed() {
      return this.lastPlayed;
   }

   public boolean isThundering() {
      return this.isThundering;
   }

   public void setThundering(boolean value) {
      this.isThundering = value;
   }

   public int getThunderTime() {
      return this.thunderTime;
   }

   public void setThunderTime(int value) {
      this.thunderTime = value;
   }

   public boolean isRaining() {
      return this.isRaining;
   }

   public void setRain(boolean value) {
      this.isRaining = value;
   }

   public int getRainTime() {
      return this.rainTime;
   }

   public void setRainTime(int value) {
      this.rainTime = value;
   }

   public int getGameType() {
      return this.gameType;
   }

   public boolean hasMapFeatures() {
      return this.hasMapFeatures;
   }

   public boolean isHardcore() {
      return this.isHardcore;
   }

   public WorldGeneratorTypes getGenerator() {
      return this.generatorType;
   }

   public void setGenerator(WorldGeneratorTypes generator) {
      this.generatorType = generator;
   }
}
