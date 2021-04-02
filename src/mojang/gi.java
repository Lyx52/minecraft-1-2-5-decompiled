package mojang;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mojang.net.minecraft.client.Minecraft;

public class gi {

   private List b = new ArrayList();
   private h c = new lc();
   public h a;
   private Map d = new HashMap();
   private Minecraft e;
   private File f;
   private String g;


   public gi(Minecraft var1, File var2) {
      this.e = var1;
      this.f = new File(var2, "texturepacks");
      if(this.f.exists()) {
         if(!this.f.isDirectory()) {
            this.f.delete();
            this.f.mkdirs();
         }
      } else {
         this.f.mkdirs();
      }

      this.g = var1.A.m;
      this.a();
      this.a.a();
   }

   public boolean a(h var1) {
      if(var1 == this.a) {
         return false;
      } else {
         this.a.b();
         this.g = var1.a;
         this.a = var1;
         this.e.A.m = this.g;
         this.e.A.b();
         this.a.a();
         return true;
      }
   }

   public void a() {
      ArrayList var1 = new ArrayList();
      this.a = null;
      var1.add(this.c);
      if(this.f.exists() && this.f.isDirectory()) {
         File[] var2 = this.f.listFiles();
         File[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            String var7;
            h var13;
            if(var6.isFile() && var6.getName().toLowerCase().endsWith(".zip")) {
               var7 = var6.getName() + ":" + var6.length() + ":" + var6.lastModified();

               try {
                  if(!this.d.containsKey(var7)) {
                     aju var14 = new aju(var6);
                     var14.d = var7;
                     this.d.put(var7, var14);
                     var14.a(this.e);
                  }

                  var13 = (h)this.d.get(var7);
                  if(var13.a.equals(this.g)) {
                     this.a = var13;
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
                     var8.a(this.e);
                  }

                  var13 = (h)this.d.get(var7);
                  if(var13.a.equals(this.g)) {
                     this.a = var13;
                  }

                  var1.add(var13);
               } catch (Exception var9) {
                  var9.printStackTrace();
               }
            }
         }
      }

      if(this.a == null) {
         this.a = this.c;
      }

      this.b.removeAll(var1);
      Iterator var11 = this.b.iterator();

      while(var11.hasNext()) {
         h var12 = (h)var11.next();
         var12.b(this.e);
         this.d.remove(var12.d);
      }

      this.b = var1;
   }

   public List b() {
      return new ArrayList(this.b);
   }
}
