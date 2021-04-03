package mojang;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class TextureManager {

   public static boolean a = false;
   private HashMap hashMap = new HashMap();
   private HashMap e = new HashMap();
   private abh f = new abh();
   private IntBuffer g = BufferManager.createIntBuffer(1);
   private ByteBuffer h = BufferManager.createByteBuffer(16777216);
   private List i = new ArrayList();
   private Map j = new HashMap();
   private OptionParser options;
   public boolean b = false;
   public boolean c = false;
   private TexturePackManager texturePackManager;
   private BufferedImage m = new BufferedImage(64, 64, 2);
   private int n = 16;
   private String currentPath = System.getProperty("user.dir");

   public TextureManager(TexturePackManager texturePackManager, OptionParser optionParser) {
      this.texturePackManager = texturePackManager;
      this.options = optionParser;
      Graphics var3 = this.m.getGraphics();
      var3.setColor(Color.WHITE);
      var3.fillRect(0, 0, 64, 64);
      var3.setColor(Color.BLACK);
      var3.drawString("missingtex", 1, 10);
      var3.dispose();
   }

   public int[] a(String var1) {
      Resource var2 = this.texturePackManager.resource;
      int[] var3 = (int[])this.e.get(var1);
      if(var3 != null) {
         return var3;
      } else {
         try {
            Object var6 = null;
            if(var1.startsWith("##")) {
               var3 = this.b(this.c(this.readImage(var2.readResourceAsStream(var1.substring(2)))));
            } else if(var1.startsWith("%clamp%")) {
               this.b = true;
               var3 = this.b(this.readImage(var2.readResourceAsStream(var1.substring(7))));
               this.b = false;
            } else if(var1.startsWith("%blur%")) {
               this.c = true;
               this.b = true;
               var3 = this.b(this.readImage(var2.readResourceAsStream(var1.substring(6))));
               this.b = false;
               this.c = false;
            } else {
               InputStream var7 = var2.readResourceAsStream(var1);
               if(var7 == null) {
                  var3 = this.b(this.m);
               } else {
                  var3 = this.b(this.readImage(var7));
               }
            }

            this.e.put(var1, var3);
            return var3;
         } catch (IOException var5) {
            var5.printStackTrace();
            int[] var4 = this.b(this.m);
            this.e.put(var1, var4);
            return var4;
         }
      }
   }

   private int[] b(BufferedImage var1) {
      int var2 = var1.getWidth();
      int var3 = var1.getHeight();
      int[] var4 = new int[var2 * var3];
      var1.getRGB(0, 0, var2, var3, var4, 0, var2);
      return var4;
   }

   private int[] a(BufferedImage var1, int[] var2) {
      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      var1.getRGB(0, 0, var3, var4, var2, 0, var3);
      return var2;
   }

   public int readImageFromLocation(String location) {
      Resource var2 = this.texturePackManager.resource;
      Integer var3 = (Integer)this.hashMap.get(location);
      if(var3 != null) {
         return var3.intValue();
      } else {
         try {
            this.g.clear();
            BufferManager.a(this.g);
            int var6 = this.g.get(0);
            if(location.startsWith("##")) {
               this.a(this.c(this.readImage(var2.readResourceAsStream(location.substring(2)))), var6);
            } else if(location.startsWith("%clamp%")) {
               this.b = true;
               this.a(this.readImage(var2.readResourceAsStream(location.substring(7))), var6);
               this.b = false;
            } else if(location.startsWith("%blur%")) {
               this.c = true;
               this.a(this.readImage(var2.readResourceAsStream(location.substring(6))), var6);
               this.c = false;
            } else if(location.startsWith("%blurclamp%")) {
               this.c = true;
               this.b = true;
               this.a(this.readImage(var2.readResourceAsStream(location.substring(11))), var6);
               this.c = false;
               this.b = false;
            } else {
               InputStream var7 = var2.readResourceAsStream(location);
               if(var7 == null) {
                  this.a(this.m, var6);
               } else {
                  this.a(this.readImage(var7), var6);
               }
            }

            this.hashMap.put(location, Integer.valueOf(var6));
            return var6;
         } catch (Exception var5) {
            var5.printStackTrace();
            BufferManager.a(this.g);
            int var4 = this.g.get(0);
            this.a(this.m, var4);
            this.hashMap.put(location, Integer.valueOf(var4));
            return var4;
         }
      }
   }

   private BufferedImage c(BufferedImage var1) {
      int var2 = var1.getWidth() / 16;
      BufferedImage var3 = new BufferedImage(16, var1.getHeight() * var2, 2);
      Graphics var4 = var3.getGraphics();

      for(int var5 = 0; var5 < var2; ++var5) {
         var4.drawImage(var1, -var5 * 16, var5 * var1.getHeight(), (ImageObserver)null);
      }

      var4.dispose();
      return var3;
   }

   public int a(BufferedImage var1) {
      this.g.clear();
      BufferManager.a(this.g);
      int var2 = this.g.get(0);
      this.a(var1, var2);
      this.f.a(var2, var1);
      return var2;
   }

   public void a(BufferedImage var1, int var2) {
      GL11.glBindTexture(3553, var2);
      if(a) {
         GL11.glTexParameteri(3553, 10241, 9986);
         GL11.glTexParameteri(3553, 10240, 9728);
      } else {
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
      }

      if(this.c) {
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
      }

      if(this.b) {
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
      } else {
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
      }

      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      int[] var5 = new int[var3 * var4];
      byte[] var6 = new byte[var3 * var4 * 4];
      var1.getRGB(0, 0, var3, var4, var5, 0, var3);

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      for(var7 = 0; var7 < var5.length; ++var7) {
         var8 = var5[var7] >> 24 & 255;
         var9 = var5[var7] >> 16 & 255;
         var10 = var5[var7] >> 8 & 255;
         var11 = var5[var7] & 255;
         if(this.options != null && this.options.glyph3d) {
            var12 = (var9 * 30 + var10 * 59 + var11 * 11) / 100;
            var13 = (var9 * 30 + var10 * 70) / 100;
            var14 = (var9 * 30 + var11 * 70) / 100;
            var9 = var12;
            var10 = var13;
            var11 = var14;
         }

         var6[var7 * 4 + 0] = (byte)var9;
         var6[var7 * 4 + 1] = (byte)var10;
         var6[var7 * 4 + 2] = (byte)var11;
         var6[var7 * 4 + 3] = (byte)var8;
      }

      this.h.clear();
      this.h.put(var6);
      this.h.position(0).limit(var6.length);
      GL11.glTexImage2D(3553, 0, 6408, var3, var4, 0, 6408, 5121, this.h);
      if(a) {
         for(var7 = 1; var7 <= 4; ++var7) {
            var8 = var3 >> var7 - 1;
            var9 = var3 >> var7;
            var10 = var4 >> var7;

            for(var11 = 0; var11 < var9; ++var11) {
               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.h.getInt((var11 * 2 + 0 + (var12 * 2 + 0) * var8) * 4);
                  var14 = this.h.getInt((var11 * 2 + 1 + (var12 * 2 + 0) * var8) * 4);
                  int var15 = this.h.getInt((var11 * 2 + 1 + (var12 * 2 + 1) * var8) * 4);
                  int var16 = this.h.getInt((var11 * 2 + 0 + (var12 * 2 + 1) * var8) * 4);
                  int var17 = this.a(this.a(var13, var14), this.a(var15, var16));
                  this.h.putInt((var11 + var12 * var9) * 4, var17);
               }
            }

            GL11.glTexImage2D(3553, var7, 6408, var9, var10, 0, 6408, 5121, this.h);
         }
      }

   }

   public void a(int[] var1, int var2, int var3, int var4) {
      GL11.glBindTexture(3553, var4);
      if(a) {
         GL11.glTexParameteri(3553, 10241, 9986);
         GL11.glTexParameteri(3553, 10240, 9728);
      } else {
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
      }

      if(this.c) {
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
      }

      if(this.b) {
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
      } else {
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
      }

      byte[] var5 = new byte[var2 * var3 * 4];

      for(int var6 = 0; var6 < var1.length; ++var6) {
         int var7 = var1[var6] >> 24 & 255;
         int var8 = var1[var6] >> 16 & 255;
         int var9 = var1[var6] >> 8 & 255;
         int var10 = var1[var6] & 255;
         if(this.options != null && this.options.glyph3d) {
            int var11 = (var8 * 30 + var9 * 59 + var10 * 11) / 100;
            int var12 = (var8 * 30 + var9 * 70) / 100;
            int var13 = (var8 * 30 + var10 * 70) / 100;
            var8 = var11;
            var9 = var12;
            var10 = var13;
         }

         var5[var6 * 4 + 0] = (byte)var8;
         var5[var6 * 4 + 1] = (byte)var9;
         var5[var6 * 4 + 2] = (byte)var10;
         var5[var6 * 4 + 3] = (byte)var7;
      }

      this.h.clear();
      this.h.put(var5);
      this.h.position(0).limit(var5.length);
      GL11.glTexSubImage2D(3553, 0, 0, 0, var2, var3, 6408, 5121, this.h);
   }

   public void a(int var1) {
      this.f.d(var1);
      this.g.clear();
      this.g.put(var1);
      this.g.flip();
      GL11.glDeleteTextures(this.g);
   }

   public int a(String var1, String var2) {
      dm var3 = (dm)this.j.get(var1);
      if(var3 != null && var3.a != null && !var3.d) {
         if(var3.c < 0) {
            var3.c = this.a(var3.a);
         } else {
            this.a(var3.a, var3.c);
         }

         var3.d = true;
      }

      return var3 != null && var3.c >= 0?var3.c:(var2 == null?-1:this.readImageFromLocation(var2));
   }

   public dm a(String var1, js var2) {
      dm var3 = (dm)this.j.get(var1);
      if(var3 == null) {
         this.j.put(var1, new dm(var1, var2));
      } else {
         ++var3.b;
      }

      return var3;
   }

   public void c(String var1) {
      dm var2 = (dm)this.j.get(var1);
      if(var2 != null) {
         --var2.b;
         if(var2.b == 0) {
            if(var2.c >= 0) {
               this.a(var2.c);
            }

            this.j.remove(var1);
         }
      }

   }

   public void a(tt var1) {
      this.i.add(var1);
      var1.a();
   }

   public void a() {
      int var1 = -1;

      for(int var2 = 0; var2 < this.i.size(); ++var2) {
         tt var3 = (tt)this.i.get(var2);
         var3.h = this.options.glyph3d;
         var3.a();
         this.h.clear();
         this.h.put(var3.f);
         this.h.position(0).limit(var3.f.length);
         if(var3.g != var1) {
            var3.a(this);
            var1 = var3.g;
         }

         for(int var4 = 0; var4 < var3.j; ++var4) {
            for(int var5 = 0; var5 < var3.j; ++var5) {
               GL11.glTexSubImage2D(3553, 0, var3.g % 16 * 16 + var4 * 16, var3.g / 16 * 16 + var5 * 16, 16, 16, 6408, 5121, this.h);
            }
         }
      }

   }

   private int a(int var1, int var2) {
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 & -16777216) >> 24 & 255;
      short var5 = 255;
      short var15;
      short var16;
      if(var3 + var4 < 255) {
         var5 = 0;
         var15 = 1;
         var16 = 1;
      } else if(var3 > var4) {
         var15 = 255;
         var16 = 1;
      } else {
         var15 = 1;
         var16 = 255;
      }

      int var6 = (var1 >> 16 & 255) * var15;
      int var7 = (var1 >> 8 & 255) * var15;
      int var8 = (var1 & 255) * var15;
      int var9 = (var2 >> 16 & 255) * var16;
      int var10 = (var2 >> 8 & 255) * var16;
      int var11 = (var2 & 255) * var16;
      int var12 = (var6 + var9) / (var15 + var16);
      int var13 = (var7 + var10) / (var15 + var16);
      int var14 = (var8 + var11) / (var15 + var16);
      return var5 << 24 | var12 << 16 | var13 << 8 | var14;
   }

   public void b() {
      Resource var1 = this.texturePackManager.resource;
      Iterator var2 = this.f.b().iterator();

      BufferedImage var4;
      while(var2.hasNext()) {
         int var3 = ((Integer)var2.next()).intValue();
         var4 = (BufferedImage)this.f.a(var3);
         this.a(var4, var3);
      }

      dm var8;
      for(var2 = this.j.values().iterator(); var2.hasNext(); var8.d = false) {
         var8 = (dm)var2.next();
      }

      var2 = this.hashMap.keySet().iterator();

      String var9;
      while(var2.hasNext()) {
         var9 = (String)var2.next();

         try {
            if(var9.startsWith("##")) {
               var4 = this.c(this.readImage(var1.readResourceAsStream(var9.substring(2))));
            } else if(var9.startsWith("%clamp%")) {
               this.b = true;
               var4 = this.readImage(var1.readResourceAsStream(var9.substring(7)));
            } else if(var9.startsWith("%blur%")) {
               this.c = true;
               var4 = this.readImage(var1.readResourceAsStream(var9.substring(6)));
            } else if(var9.startsWith("%blurclamp%")) {
               this.c = true;
               this.b = true;
               var4 = this.readImage(var1.readResourceAsStream(var9.substring(11)));
            } else {
               var4 = readImage(new FileInputStream(currentPath + "/src" + var9));
            }

            int var5 = (Integer) this.hashMap.get(var9);
            this.a(var4, var5);
            this.c = false;
            this.b = false;
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }

      var2 = this.e.keySet().iterator();

      while(var2.hasNext()) {
         var9 = (String)var2.next();

         try {
            if(var9.startsWith("##")) {
               var4 = this.c(this.readImage(var1.readResourceAsStream(var9.substring(2))));
            } else if(var9.startsWith("%clamp%")) {
               this.b = true;
               var4 = this.readImage(var1.readResourceAsStream(var9.substring(7)));
            } else if(var9.startsWith("%blur%")) {
               this.c = true;
               var4 = this.readImage(var1.readResourceAsStream(var9.substring(6)));
            } else {
               var4 = this.readImage(var1.readResourceAsStream(var9));
            }

            this.a(var4, (int[])this.e.get(var9));
            this.c = false;
            this.b = false;
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }

   }

   private BufferedImage readImage(InputStream stream) throws IOException {
      BufferedImage img = ImageIO.read(stream);
      stream.close();
      return img;
   }

   public void b(int var1) {
      if(var1 >= 0) {
         GL11.glBindTexture(3553, var1);
      }
   }

}
