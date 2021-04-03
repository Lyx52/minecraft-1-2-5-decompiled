package mojang;

import java.io.File;
import java.util.List;

public class WorldFileDimWrapper extends WorldFile {

   public WorldFileDimWrapper(File saveFilesHomeLocation, String worldName, boolean var3) {
      super(saveFilesHomeLocation, worldName, var3);
   }

   public ua createDimensionFile(alb var1) {
      File worldFileLocation = this.getWorldFileLocation();
      File dimensionFile;
      if(var1 instanceof akf) {
         dimensionFile = new File(worldFileLocation, "DIM-1");
         dimensionFile.mkdirs();
         return new ChunkTagManager(dimensionFile);
      } else if(var1 instanceof ii) {
         dimensionFile = new File(worldFileLocation, "DIM1");
         dimensionFile.mkdirs();
         return new ChunkTagManager(dimensionFile);
      } else {
         return new ChunkTagManager(worldFileLocation);
      }
   }

   public void a(WorldParser var1, List var2) {
      var1.setVersion(19133);
      super.a(var1, var2);
   }
}
