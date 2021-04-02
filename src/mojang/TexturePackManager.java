package mojang;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mojang.net.minecraft.client.Minecraft;

public class TexturePackManager {

   private List b = new ArrayList();
   private Resource c = new lc();
   public Resource resource;
   private Map d = new HashMap();
   private Minecraft minecraftInstance;
   private File texturepackDirectory;
   private String texturePackName;


   public TexturePackManager(Minecraft minecraft, File gameDirectory) {
      this.minecraftInstance = minecraft;
      this.texturepackDirectory = new File(gameDirectory, "texturepacks");
      if(this.texturepackDirectory.exists()) {
         if(!this.texturepackDirectory.isDirectory()) {
            this.texturepackDirectory.delete();
            this.texturepackDirectory.mkdirs();
         }
      } else {
         this.texturepackDirectory.mkdirs();
      }

      this.texturePackName = minecraft.options.texturePackName;
      this.readTexturePacks();
      this.resource.read();
   }

   public boolean setTexturePack(Resource resource) {
      if(resource == this.resource) {
         return false;
      } else {
         this.resource.b();
         this.texturePackName = resource.a;
         this.resource = resource;
         this.minecraftInstance.options.texturePackName = this.texturePackName;
         this.minecraftInstance.options.b();
         this.resource.read();
         return true;
      }
   }

   public void readTexturePacks() {
      ArrayList var1 = new ArrayList();
      this.resource = null;
      var1.add(this.c);
      if(this.texturepackDirectory.exists() && this.texturepackDirectory.isDirectory()) {
         File[] var2 = this.texturepackDirectory.listFiles();
         File[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            String var7;
            Resource var13;
            if(var6.isFile() && var6.getName().toLowerCase().endsWith(".zip")) {
               var7 = var6.getName() + ":" + var6.length() + ":" + var6.lastModified();

               try {
                  if(!this.d.containsKey(var7)) {
                     aju var14 = new aju(var6);
                     var14.d = var7;
                     this.d.put(var7, var14);
                     var14.a(this.minecraftInstance);
                  }

                  var13 = (Resource)this.d.get(var7);
                  if(var13.a.equals(this.texturePackName)) {
                     this.resource = var13;
                  }

                  var1.add(var13);
               } catch (Exception var10) {
                  var10.printStackTrace();
               }
            } else if(var6.isDirectory() && (new File(var6, "mojang/pack.txt")).exists()) {
               var7 = var6.getName() + ":folder:" + var6.lastModified();

               try {
                  if(!this.d.containsKey(var7)) {
                     aiq var8 = new aiq(var6);
                     var8.d = var7;
                     this.d.put(var7, var8);
                     var8.a(this.minecraftInstance);
                  }

                  var13 = (Resource)this.d.get(var7);
                  if(var13.a.equals(this.texturePackName)) {
                     this.resource = var13;
                  }

                  var1.add(var13);
               } catch (Exception var9) {
                  var9.printStackTrace();
               }
            }
         }
      }

      if(this.resource == null) {
         this.resource = this.c;
      }

      this.b.removeAll(var1);
      Iterator var11 = this.b.iterator();

      while(var11.hasNext()) {
         Resource var12 = (Resource)var11.next();
         var12.b(this.minecraftInstance);
         this.d.remove(var12.d);
      }

      this.b = var1;
   }

   public List b() {
      return new ArrayList(this.b);
   }
}
