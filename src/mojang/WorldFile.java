package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Logger;

public class WorldFile implements WorldFileInterface {

   private static final Logger a = Logger.getLogger("Minecraft");
   private final File worldFileLocation;
   private final File players;
   private final File data;
   private final long lastTime = System.currentTimeMillis();
   private final String worldName;


   public WorldFile(File saveFileHomeLocation, String worldName, boolean hasBeenEntered) {
      this.worldFileLocation = new File(saveFileHomeLocation, worldName);
      this.worldFileLocation.mkdirs();
      this.players = new File(this.worldFileLocation, "players");
      this.data = new File(this.worldFileLocation, "data");
      this.data.mkdirs();
      this.worldName = worldName;

      if(hasBeenEntered) {
         this.players.mkdirs();
      }

      this.checkSessionLock();
   }

   private void checkSessionLock() {
      try {
         File sessionLock = new File(this.worldFileLocation, "session.lock");
         DataOutputStream sessionLockWriter = new DataOutputStream(new FileOutputStream(sessionLock));

         try {
            sessionLockWriter.writeLong(this.lastTime);
         } finally {
            sessionLockWriter.close();
         }

      } catch (IOException e) {
         e.printStackTrace();
         throw new RuntimeException("Failed to check session lock, aborting");
      }
   }

   protected File getWorldFileLocation() {
      return this.worldFileLocation;
   }

   public void b() {
      try {
         File sessionLock = new File(this.worldFileLocation, "session.lock");
         DataInputStream sessonLockReader = new DataInputStream(new FileInputStream(sessionLock));

         try {
            if(sessonLockReader.readLong() != this.lastTime) {
               throw new MinecraftRuntimeException("The save is being accessed from another location, aborting");
            }
         } finally {
            sessonLockReader.close();
         }

      } catch (IOException e) {
         e.printStackTrace();
         throw new MinecraftRuntimeException("Failed to check session lock, aborting");
      }
   }

   public ua createDimensionFile(alb var1) {
      throw new RuntimeException("Old Chunk Storage is no longer supported.");
   }

   public WorldParser c() {
      File var1 = new File(this.worldFileLocation, "level.dat");
      CompundTag var2;
      CompundTag var3;
      if(var1.exists()) {
         try {
            var2 = at.readLevelData((InputStream)(new FileInputStream(var1)));
            var3 = var2.getCompundTag("Data");
            return new WorldParser(var3);
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }

      var1 = new File(this.worldFileLocation, "level.dat_old");
      if(var1.exists()) {
         try {
            var2 = at.readLevelData((InputStream)(new FileInputStream(var1)));
            var3 = var2.getCompundTag("Data");
            return new WorldParser(var3);
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      return null;
   }

   public void a(WorldParser var1, List var2) {
      CompundTag var3 = var1.setPlayerData(var2);
      CompundTag var4 = new CompundTag();
      var4.addBaseTag("Data", (BaseTag)var3);

      try {
         File var5 = new File(this.worldFileLocation, "level.dat_new");
         File var6 = new File(this.worldFileLocation, "level.dat_old");
         File var7 = new File(this.worldFileLocation, "level.dat");
         at.writeAndGZIPTag(var4, (OutputStream)(new FileOutputStream(var5)));
         if(var6.exists()) {
            var6.delete();
         }

         var7.renameTo(var6);
         if(var7.exists()) {
            var7.delete();
         }

         var5.renameTo(var7);
         if(var5.exists()) {
            var5.delete();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public void a(WorldParser worldParser) {
      CompundTag currentPlayer = worldParser.getTagWithCurrentPlayer();
      CompundTag tag = new CompundTag();
      tag.addBaseTag("Data", (BaseTag)currentPlayer);

      try {
         File newLevelData = new File(this.worldFileLocation, "level.dat_new");
         File oldLevelData = new File(this.worldFileLocation, "level.dat_old");
         File currentLevelData = new File(this.worldFileLocation, "level.dat");
         at.writeAndGZIPTag(tag, (OutputStream)(new FileOutputStream(newLevelData)));

         if(oldLevelData.exists()) {
            oldLevelData.delete();
         }

         currentLevelData.renameTo(oldLevelData);
         if(currentLevelData.exists()) {
            currentLevelData.delete();
         }

         newLevelData.renameTo(currentLevelData);
         if(newLevelData.exists()) {
            newLevelData.delete();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public File getDataFile(String filename) {
      return new File(this.data, filename + ".dat");
   }

   public String getWorldName() {
      return this.worldName;
   }

}
