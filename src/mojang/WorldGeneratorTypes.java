package mojang;

public class WorldGeneratorTypes {

   public static final WorldGeneratorTypes[] WORLD_GENERATOR_TYPES = new WorldGeneratorTypes[16];
   public static final WorldGeneratorTypes defaultWorld = (new WorldGeneratorTypes(0, "default", 1)).isDefault();
   public static final WorldGeneratorTypes flatWorld = new WorldGeneratorTypes(1, "flat");
   public static final WorldGeneratorTypes default_1_1 = (new WorldGeneratorTypes(8, "default_1_1", 0)).a(false);
   private final String generatorName;
   private final int f;
   private boolean g;
   private boolean isDefault;


   private WorldGeneratorTypes(int var1, String var2) {
      this(var1, var2, 0);
   }

   private WorldGeneratorTypes(int var1, String generatorName, int var3) {
      this.generatorName = generatorName;
      this.f = var3;
      this.g = true;
      WORLD_GENERATOR_TYPES[var1] = this;
   }

   public String a() {
      return this.generatorName;
   }

   public String b() {
      return "generator." + this.generatorName;
   }

   public int c() {
      return this.f;
   }

   public WorldGeneratorTypes getByVersion(int version) {
      return this == defaultWorld && version == 0 ? default_1_1 : this;
   }

   private WorldGeneratorTypes a(boolean var1) {
      this.g = var1;
      return this;
   }

   public boolean d() {
      return this.g;
   }

   private WorldGeneratorTypes isDefault() {
      this.isDefault = true;
      return this;
   }

   public boolean getIsDefault() {
      return this.isDefault;
   }

   public static WorldGeneratorTypes getGenerator(String generatorName) {

      for(int index = 0; index < WORLD_GENERATOR_TYPES.length; ++index) {

         if(WORLD_GENERATOR_TYPES[index] != null && WORLD_GENERATOR_TYPES[index].generatorName.equalsIgnoreCase(generatorName)) {
            return WORLD_GENERATOR_TYPES[index];
         }
      }

      return null;
   }

}
