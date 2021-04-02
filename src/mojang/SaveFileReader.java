package mojang;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class SaveFileReader implements SaveFileInterface {

   protected final File saveLocation;


   public SaveFileReader(File saveLocation) {
      if(!saveLocation.exists()) {
         saveLocation.mkdirs();
      }

      this.saveLocation = saveLocation;
   }

   public String isOld() {
      return "Old Format";
   }

   public List parseSaveFiles() {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < 5; ++var2) {
         String var3 = "World" + (var2 + 1);
         WorldParser var4 = this.parseSaveFile(var3);
         if(var4 != null) {
            var1.add(new WorldListItem(var3, "", var4.getLastPlayed(), var4.getSizeOnDisk(), var4.getGameType(), false, var4.isHardcore()));
         }
      }

      return var1;
   }

   public void d() {}

   public WorldParser parseSaveFile(String saveName) {
      File saveFile = new File(this.saveLocation, saveName);

      if (saveFile.exists()) {

         File level_data = new File(saveFile, "level.dat");
         CompundTag levelDataTag;
         CompundTag worldData;
         if (level_data.exists()) {
            try {
               levelDataTag = at.readLevelData(new FileInputStream(level_data));
               worldData = levelDataTag.getCompundTag("Data");
               return new WorldParser(worldData);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }

         level_data = new File(saveFile, "level.dat_old");
         if (level_data.exists()) {
            try {
               levelDataTag = at.readLevelData(new FileInputStream(level_data));
               worldData = levelDataTag.getCompundTag("Data");
               return new WorldParser(worldData);
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }

      }
      return null;
   }

   public void a(String var1, String var2) {
      File var3 = new File(this.saveLocation, var1);
      if(var3.exists()) {
         File var4 = new File(var3, "level.dat");
         if(var4.exists()) {
            try {
               CompundTag var5 = at.readLevelData((InputStream)(new FileInputStream(var4)));
               CompundTag var6 = var5.getCompundTag("Data");
               var6.addString("LevelName", var2);
               at.a(var5, (OutputStream)(new FileOutputStream(var4)));
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

      }
   }

   public void deleteSave(String saveName) {
      File saveFile = new File(this.saveLocation, saveName);
      if(saveFile.exists()) {
         removeSaveFiles(saveFile.listFiles());
         saveFile.delete();
      }
   }

   protected static void removeSaveFiles(File[] saveFiles) {
      for(int _index = 0; _index < saveFiles.length; ++_index) {
         if(saveFiles[_index].isDirectory()) {
            System.out.println("Deleting " + saveFiles[_index]);
            removeSaveFiles(saveFiles[_index].listFiles());
         }

         saveFiles[_index].delete();
      }

   }

   public akp a(String var1, boolean var2) {
      return new eg(this.saveLocation, var1, var2);
   }

   public boolean a(String var1) {
      return false;
   }

   public boolean a(String var1, rw var2) {
      return false;
   }
}
