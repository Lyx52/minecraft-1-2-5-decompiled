package mojang;

import java.io.*;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import mojang.net.minecraft.client.Minecraft;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ck extends Thread {

   public File a;
   private Minecraft b;
   private boolean c = false;


   public ck(File var1, Minecraft var2) {
      this.b = var2;
      this.setName("Resource download thread");
      this.setDaemon(true);
      this.a = new File(var1, "resources/");
      if(!this.a.exists() && !this.a.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + this.a);
      }
   }

   public void run() {
      try {
         URL var1 = new URL("https://s3.amazonaws.com/MinecraftResources/");
         DocumentBuilderFactory var2 = DocumentBuilderFactory.newInstance();
         DocumentBuilder var3 = var2.newDocumentBuilder();
         Document var4 = var3.parse(var1.openStream());
         NodeList var5 = var4.getElementsByTagName("Contents");

         for(int var6 = 0; var6 < 2; ++var6) {
            for(int var7 = 0; var7 < var5.getLength(); ++var7) {
               Node var8 = var5.item(var7);
               if(var8.getNodeType() == 1) {
                  Element var9 = (Element)var8;
                  String var10 = ((Element)var9.getElementsByTagName("Key").item(0)).getChildNodes().item(0).getNodeValue();
                  long var11 = Long.parseLong(((Element)var9.getElementsByTagName("Size").item(0)).getChildNodes().item(0).getNodeValue());
                  if(var11 > 0L) {
                     this.a(var1, var10, var11, var6);
                     if(this.c) {
                        return;
                     }
                  }
               }
            }
         }
      } catch (Exception var13) {
         this.a(this.a, "");
         var13.printStackTrace();
      }

   }

   public void a() {
      this.a(this.a, "");
   }

   private void a(File var1, String var2) {
      File[] var3 = var1.listFiles();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if(var3[var4].isDirectory()) {
            this.a(var3[var4], var2 + var3[var4].getName() + "/");
         } else {
            try {
               this.b.a(var2 + var3[var4].getName(), var3[var4]);
            } catch (Exception var6) {
               System.out.println("Failed to add " + var2 + var3[var4].getName());
            }
         }
      }

   }

   private void a(URL var1, String var2, long var3, int var5) {
      try {
         int var6 = var2.indexOf("/");
         String var7 = var2.substring(0, var6);
         if(!var7.equals("sound") && !var7.equals("newsound")) {
            if(var5 != 1) {
               return;
            }
         } else if(var5 != 0) {
            return;
         }

         File var8 = new File(this.a, var2);
         if(!var8.exists() || var8.length() != var3) {
            var8.getParentFile().mkdirs();
            String var9 = var2.replaceAll(" ", "%20");
            this.a(new URL(var1, var9), var8, var3);
            if(this.c) {
               return;
            }
         }

         this.b.a(var2, var8);
      } catch (Exception var10) {
         var10.printStackTrace();
      }

   }

   private void a(URL var1, File var2, long var3) throws IOException {
      byte[] var5 = new byte[4096];
      DataInputStream var6 = new DataInputStream(var1.openStream());
      DataOutputStream var7 = new DataOutputStream(new FileOutputStream(var2));
      boolean var8 = false;

      do {
         int var9;
         if((var9 = var6.read(var5)) < 0) {
            var6.close();
            var7.close();
            return;
         }

         var7.write(var5, 0, var9);
      } while(!this.c);

   }

   public void b() {
      this.c = true;
   }
}
