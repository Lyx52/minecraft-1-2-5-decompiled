package mojang;

public final class WorldStub {

   private final long seed;
   private final int gameType;
   private final boolean mapFeatures;
   private final boolean hardcore;
   private final WorldGeneratorTypes generatorType;


   public WorldStub(long seed, int gameType, boolean mapFeatures, boolean hardcore, WorldGeneratorTypes generatorType) {
      this.seed = seed;
      this.gameType = gameType;
      this.mapFeatures = mapFeatures;
      this.hardcore = hardcore;
      this.generatorType = generatorType;
   }

   public long getSeed() {
      return this.seed;
   }

   public int getGameType() {
      return this.gameType;
   }

   public boolean isHardcore() {
      return this.hardcore;
   }

   public boolean hasMapFeatures() {
      return this.mapFeatures;
   }

   public WorldGeneratorTypes generatorType() {
      return this.generatorType;
   }
}
