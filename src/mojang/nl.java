package mojang;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.text.Bidi;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class nl {

   private static final Pattern r = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
   private int[] d = new int[256];
   public int a = 0;
   public int b = 8;
   public Random c = new Random();
   private byte[] e = new byte[65536];
   private final int[] f = new int[256];
   private int[] g = new int[32];
   private int h;
   private final aaw i;
   private float j;
   private float k;
   private boolean l;
   private boolean m;
   private float n;
   private float o;
   private float p;
   private float q;


   nl() {
      this.i = null;
   }

   public nl(hu var1, String var2, aaw var3, boolean var4) {
      this.i = var3;
      this.l = var4;

      BufferedImage var5;
      try {
         var5 = ImageIO.read(aaw.class.getResourceAsStream(var2));
         InputStream var6 = aaw.class.getResourceAsStream("/mojang/font/glyph_sizes.bin");
         var6.read(this.e);
      } catch (IOException var18) {
         throw new RuntimeException(var18);
      }

      int var19 = var5.getWidth();
      int var7 = var5.getHeight();
      int[] var8 = new int[var19 * var7];
      var5.getRGB(0, 0, var19, var7, var8, 0, var19);
      int var9 = 0;

      int var10;
      int var11;
      int var12;
      int var13;
      int var15;
      int var16;
      while(var9 < 256) {
         var10 = var9 % 16;
         var11 = var9 / 16;
         var12 = 7;

         while(true) {
            if(var12 >= 0) {
               var13 = var10 * 8 + var12;
               boolean var14 = true;

               for(var15 = 0; var15 < 8 && var14; ++var15) {
                  var16 = (var11 * 8 + var15) * var19;
                  int var17 = var8[var13 + var16] & 255;
                  if(var17 > 0) {
                     var14 = false;
                  }
               }

               if(var14) {
                  --var12;
                  continue;
               }
            }

            if(var9 == 32) {
               var12 = 2;
            }

            this.d[var9] = var12 + 2;
            ++var9;
            break;
         }
      }

      this.a = var3.a(var5);

      for(var9 = 0; var9 < 32; ++var9) {
         var10 = (var9 >> 3 & 1) * 85;
         var11 = (var9 >> 2 & 1) * 170 + var10;
         var12 = (var9 >> 1 & 1) * 170 + var10;
         var13 = (var9 >> 0 & 1) * 170 + var10;
         if(var9 == 6) {
            var11 += 85;
         }

         if(var1.g) {
            int var20 = (var11 * 30 + var12 * 59 + var13 * 11) / 100;
            var15 = (var11 * 30 + var12 * 70) / 100;
            var16 = (var11 * 30 + var13 * 70) / 100;
            var11 = var20;
            var12 = var15;
            var13 = var16;
         }

         if(var9 >= 16) {
            var11 /= 4;
            var12 /= 4;
            var13 /= 4;
         }

         this.g[var9] = (var11 & 255) << 16 | (var12 & 255) << 8 | var13 & 255;
      }

   }

   private float a(int var1, char var2, boolean var3) {
      return var2 == 32?4.0F:(var1 > 0 && !this.l?this.a(var1 + 32, var3):this.a(var2, var3));
   }

   private float a(int var1, boolean var2) {
      float var3 = (float)(var1 % 16 * 8);
      float var4 = (float)(var1 / 16 * 8);
      float var5 = var2?1.0F:0.0F;
      if(this.h != this.a) {
         GL11.glBindTexture(3553, this.a);
         this.h = this.a;
      }

      float var6 = (float)this.d[var1] - 0.01F;
      GL11.glBegin(5);
      GL11.glTexCoord2f(var3 / 128.0F, var4 / 128.0F);
      GL11.glVertex3f(this.j + var5, this.k, 0.0F);
      GL11.glTexCoord2f(var3 / 128.0F, (var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.j - var5, this.k + 7.99F, 0.0F);
      GL11.glTexCoord2f((var3 + var6) / 128.0F, var4 / 128.0F);
      GL11.glVertex3f(this.j + var6 + var5, this.k, 0.0F);
      GL11.glTexCoord2f((var3 + var6) / 128.0F, (var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.j + var6 - var5, this.k + 7.99F, 0.0F);
      GL11.glEnd();
      return (float)this.d[var1];
   }

   private void a(int var1) {
      String var3 = String.format("/mojang/font/glyph_%02X.png", new Object[]{Integer.valueOf(var1)});

      BufferedImage var2;
      try {
         var2 = ImageIO.read(aaw.class.getResourceAsStream(var3));
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }

      this.f[var1] = this.i.a(var2);
      this.h = this.f[var1];
   }

   private float a(char var1, boolean var2) {
      if(this.e[var1] == 0) {
         return 0.0F;
      } else {
         int var3 = var1 / 256;
         if(this.f[var3] == 0) {
            this.a(var3);
         }

         if(this.h != this.f[var3]) {
            GL11.glBindTexture(3553, this.f[var3]);
            this.h = this.f[var3];
         }

         int var4 = this.e[var1] >>> 4;
         int var5 = this.e[var1] & 15;
         float var6 = (float)var4;
         float var7 = (float)(var5 + 1);
         float var8 = (float)(var1 % 16 * 16) + var6;
         float var9 = (float)((var1 & 255) / 16 * 16);
         float var10 = var7 - var6 - 0.02F;
         float var11 = var2?1.0F:0.0F;
         GL11.glBegin(5);
         GL11.glTexCoord2f(var8 / 256.0F, var9 / 256.0F);
         GL11.glVertex3f(this.j + var11, this.k, 0.0F);
         GL11.glTexCoord2f(var8 / 256.0F, (var9 + 15.98F) / 256.0F);
         GL11.glVertex3f(this.j - var11, this.k + 7.99F, 0.0F);
         GL11.glTexCoord2f((var8 + var10) / 256.0F, var9 / 256.0F);
         GL11.glVertex3f(this.j + var10 / 2.0F + var11, this.k, 0.0F);
         GL11.glTexCoord2f((var8 + var10) / 256.0F, (var9 + 15.98F) / 256.0F);
         GL11.glVertex3f(this.j + var10 / 2.0F - var11, this.k + 7.99F, 0.0F);
         GL11.glEnd();
         return (var7 - var6) / 2.0F + 1.0F;
      }
   }

   public int a(String var1, int var2, int var3, int var4) {
      if(this.m) {
         var1 = this.b(var1);
      }

      int var5 = this.a(var1, var2 + 1, var3 + 1, var4, true);
      var5 = Math.max(var5, this.a(var1, var2, var3, var4, false));
      return var5;
   }

   public void b(String var1, int var2, int var3, int var4) {
      if(this.m) {
         var1 = this.b(var1);
      }

      this.a(var1, var2, var3, var4, false);
   }

   private String b(String var1) {
      if(var1 != null && Bidi.requiresBidi(var1.toCharArray(), 0, var1.length())) {
         Bidi var2 = new Bidi(var1, -2);
         byte[] var3 = new byte[var2.getRunCount()];
         String[] var4 = new String[var3.length];

         int var7;
         for(int var5 = 0; var5 < var3.length; ++var5) {
            int var6 = var2.getRunStart(var5);
            var7 = var2.getRunLimit(var5);
            int var8 = var2.getRunLevel(var5);
            String var9 = var1.substring(var6, var7);
            var3[var5] = (byte)var8;
            var4[var5] = var9;
         }

         String[] var11 = (String[])var4.clone();
         Bidi.reorderVisually(var3, 0, var4, 0, var3.length);
         StringBuilder var12 = new StringBuilder();
         var7 = 0;

         while(var7 < var4.length) {
            byte var13 = var3[var7];
            int var14 = 0;

            while(true) {
               if(var14 < var11.length) {
                  if(!var11[var14].equals(var4[var7])) {
                     ++var14;
                     continue;
                  }

                  var13 = var3[var14];
               }

               if((var13 & 1) == 0) {
                  var12.append(var4[var7]);
               } else {
                  for(var14 = var4[var7].length() - 1; var14 >= 0; --var14) {
                     char var10 = var4[var7].charAt(var14);
                     if(var10 == 40) {
                        var10 = 41;
                     } else if(var10 == 41) {
                        var10 = 40;
                     }

                     var12.append(var10);
                  }
               }

               ++var7;
               break;
            }
         }

         return var12.toString();
      } else {
         return var1;
      }
   }

   private void a(String var1, boolean var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;

      for(int var8 = 0; var8 < var1.length(); ++var8) {
         char var9 = var1.charAt(var8);
         int var10;
         int var11;
         if(var9 == 167 && var8 + 1 < var1.length()) {
            var10 = "0123456789abcdefklmnor".indexOf(var1.toLowerCase().charAt(var8 + 1));
            if(var10 < 16) {
               var3 = false;
               var4 = false;
               var7 = false;
               var6 = false;
               var5 = false;
               if(var10 < 0 || var10 > 15) {
                  var10 = 15;
               }

               if(var2) {
                  var10 += 16;
               }

               var11 = this.g[var10];
               GL11.glColor3f((float)(var11 >> 16) / 255.0F, (float)(var11 >> 8 & 255) / 255.0F, (float)(var11 & 255) / 255.0F);
            } else if(var10 == 16) {
               var3 = true;
            } else if(var10 == 17) {
               var4 = true;
            } else if(var10 == 18) {
               var7 = true;
            } else if(var10 == 19) {
               var6 = true;
            } else if(var10 == 20) {
               var5 = true;
            } else if(var10 == 21) {
               var3 = false;
               var4 = false;
               var7 = false;
               var6 = false;
               var5 = false;
               GL11.glColor4f(this.n, this.o, this.p, this.q);
            }

            ++var8;
         } else {
            var10 = xn.a.indexOf(var9);
            if(var3 && var10 > 0) {
               do {
                  var11 = this.c.nextInt(xn.a.length());
               } while(this.d[var10 + 32] != this.d[var11 + 32]);

               var10 = var11;
            }

            float var14 = this.a(var10, var9, var5);
            if(var4) {
               ++this.j;
               this.a(var10, var9, var5);
               --this.j;
               ++var14;
            }

            adz var12;
            if(var7) {
               var12 = adz.a;
               GL11.glDisable(3553);
               var12.b();
               var12.a((double)this.j, (double)(this.k + (float)(this.b / 2)), 0.0D);
               var12.a((double)(this.j + var14), (double)(this.k + (float)(this.b / 2)), 0.0D);
               var12.a((double)(this.j + var14), (double)(this.k + (float)(this.b / 2) - 1.0F), 0.0D);
               var12.a((double)this.j, (double)(this.k + (float)(this.b / 2) - 1.0F), 0.0D);
               var12.a();
               GL11.glEnable(3553);
            }

            if(var6) {
               var12 = adz.a;
               GL11.glDisable(3553);
               var12.b();
               int var13 = var6?-1:0;
               var12.a((double)(this.j + (float)var13), (double)(this.k + (float)this.b), 0.0D);
               var12.a((double)(this.j + var14), (double)(this.k + (float)this.b), 0.0D);
               var12.a((double)(this.j + var14), (double)(this.k + (float)this.b - 1.0F), 0.0D);
               var12.a((double)(this.j + (float)var13), (double)(this.k + (float)this.b - 1.0F), 0.0D);
               var12.a();
               GL11.glEnable(3553);
            }

            this.j += var14;
         }
      }

   }

   public int a(String var1, int var2, int var3, int var4, boolean var5) {
      if(var1 != null) {
         this.h = 0;
         if((var4 & -67108864) == 0) {
            var4 |= -16777216;
         }

         if(var5) {
            var4 = (var4 & 16579836) >> 2 | var4 & -16777216;
         }

         this.n = (float)(var4 >> 16 & 255) / 255.0F;
         this.o = (float)(var4 >> 8 & 255) / 255.0F;
         this.p = (float)(var4 & 255) / 255.0F;
         this.q = (float)(var4 >> 24 & 255) / 255.0F;
         GL11.glColor4f(this.n, this.o, this.p, this.q);
         this.j = (float)var2;
         this.k = (float)var3;
         this.a(var1, var5);
         return (int)this.j;
      } else {
         return 0;
      }
   }

   public int a(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = 0;
         boolean var3 = false;

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            char var5 = var1.charAt(var4);
            int var6 = this.a(var5);
            if(var6 < 0 && var4 < var1.length() - 1) {
               ++var4;
               var5 = var1.charAt(var4);
               if(var5 != 108 && var5 != 76) {
                  if(var5 == 114 || var5 == 82) {
                     var3 = false;
                  }
               } else {
                  var3 = true;
               }

               var6 = this.a(var5);
            }

            var2 += var6;
            if(var3) {
               ++var2;
            }
         }

         return var2;
      }
   }

   public int a(char var1) {
      if(var1 == 167) {
         return -1;
      } else {
         int var2 = xn.a.indexOf(var1);
         if(var2 >= 0 && !this.l) {
            return this.d[var2 + 32];
         } else if(this.e[var1] != 0) {
            int var3 = this.e[var1] >> 4;
            int var4 = this.e[var1] & 15;
            if(var4 > 7) {
               var4 = 15;
               var3 = 0;
            }

            ++var4;
            return (var4 - var3) / 2 + 1;
         } else {
            return 0;
         }
      }
   }

   public String a(String var1, int var2) {
      return this.a(var1, var2, false);
   }

   public String a(String var1, int var2, boolean var3) {
      StringBuilder var4 = new StringBuilder();
      int var5 = 0;
      int var6 = var3?var1.length() - 1:0;
      int var7 = var3?-1:1;
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var6; var10 >= 0 && var10 < var1.length() && var5 < var2; var10 += var7) {
         char var11 = var1.charAt(var10);
         int var12 = this.a(var11);
         if(var8) {
            var8 = false;
            if(var11 != 108 && var11 != 76) {
               if(var11 == 114 || var11 == 82) {
                  var9 = false;
               }
            } else {
               var9 = true;
            }
         } else if(var12 < 0) {
            var8 = true;
         } else {
            var5 += var12;
            if(var9) {
               ++var5;
            }
         }

         if(var5 > var2) {
            break;
         }

         if(var3) {
            var4.insert(0, var11);
         } else {
            var4.append(var11);
         }
      }

      return var4.toString();
   }

   public void a(String var1, int var2, int var3, int var4, int var5) {
      if(this.m) {
         var1 = this.b(var1);
      }

      this.b(var1, var2, var3, var4, var5);
   }

   private void b(String var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, false);
   }

   private void a(String var1, int var2, int var3, int var4, int var5, boolean var6) {
      String[] var7 = var1.split("\n");
      if(var7.length > 1) {
         for(int var14 = 0; var14 < var7.length; ++var14) {
            this.b(var7[var14], var2, var3, var4, var5);
            var3 += this.b(var7[var14], var4);
         }

      } else {
         String[] var8 = var1.split(" ");
         int var9 = 0;
         String var10 = "";

         while(var9 < var8.length) {
            String var11;
            for(var11 = var10 + var8[var9++] + " "; var9 < var8.length && this.a(var11 + var8[var9]) < var4; var11 = var11 + var8[var9++] + " ") {
               ;
            }

            int var12;
            for(; this.a(var11) > var4; var11 = var10 + var11.substring(var12)) {
               for(var12 = 0; this.a(var11.substring(0, var12 + 1)) <= var4; ++var12) {
                  ;
               }

               if(var11.substring(0, var12).trim().length() > 0) {
                  String var13 = var11.substring(0, var12);
                  if(var13.lastIndexOf("§") >= 0) {
                     var10 = "§" + var13.charAt(var13.lastIndexOf("§") + 1);
                  }

                  this.a(var13, var2, var3, var5, var6);
                  var3 += this.b;
               }
            }

            if(this.a(var11.trim()) > 0) {
               if(var11.lastIndexOf("§") >= 0) {
                  var10 = "§" + var11.charAt(var11.lastIndexOf("§") + 1);
               }

               this.a(var11, var2, var3, var5, var6);
               var3 += this.b;
            }
         }

      }
   }

   public int b(String var1, int var2) {
      String[] var3 = var1.split("\n");
      int var5;
      if(var3.length > 1) {
         int var9 = 0;

         for(var5 = 0; var5 < var3.length; ++var5) {
            var9 += this.b(var3[var5], var2);
         }

         return var9;
      } else {
         String[] var4 = var1.split(" ");
         var5 = 0;
         int var6 = 0;

         while(var5 < var4.length) {
            String var7;
            for(var7 = var4[var5++] + " "; var5 < var4.length && this.a(var7 + var4[var5]) < var2; var7 = var7 + var4[var5++] + " ") {
               ;
            }

            int var8;
            for(; this.a(var7) > var2; var7 = var7.substring(var8)) {
               for(var8 = 0; this.a(var7.substring(0, var8 + 1)) <= var2; ++var8) {
                  ;
               }

               if(var7.substring(0, var8).trim().length() > 0) {
                  var6 += this.b;
               }
            }

            if(var7.trim().length() > 0) {
               var6 += this.b;
            }
         }

         if(var6 < this.b) {
            var6 += this.b;
         }

         return var6;
      }
   }

   public void a(boolean var1) {
      this.l = var1;
   }

   public void b(boolean var1) {
      this.m = var1;
   }

   public List c(String var1, int var2) {
      return Arrays.asList(this.d(var1, var2).split("\n"));
   }

   String d(String var1, int var2) {
      int var3 = this.e(var1, var2);
      if(var1.length() <= var3) {
         return var1;
      } else {
         String var4 = var1.substring(0, var3);
         String var5 = c(var4) + var1.substring(var3 + (var1.charAt(var3) == 32?1:0));
         return var4 + "\n" + this.d(var5, var2);
      }
   }

   private int e(String var1, int var2) {
      int var3 = var1.length();
      int var4 = 0;
      int var5 = 0;
      int var6 = -1;

      for(boolean var7 = false; var5 < var3; ++var5) {
         char var8 = var1.charAt(var5);
         switch(var8) {
         case 32:
            var6 = var5;
         case 167:
            if(var5 != var3) {
               ++var5;
               char var9 = var1.charAt(var5);
               if(var9 != 108 && var9 != 76) {
                  if(var9 == 114 || var9 == 82) {
                     var7 = false;
                  }
               } else {
                  var7 = true;
               }
            }
            break;
         default:
            var4 += this.a(var8);
            if(var7) {
               ++var4;
            }
         }

         if(var8 == 10) {
            ++var5;
            var6 = var5;
            break;
         }

         if(var4 > var2) {
            break;
         }
      }

      return var5 != var3 && var6 != -1 && var6 < var5?var6:var5;
   }

   private static boolean b(char var0) {
      return var0 >= 48 && var0 <= 57 || var0 >= 97 && var0 <= 102 || var0 >= 65 && var0 <= 70;
   }

   private static boolean c(char var0) {
      return var0 >= 107 && var0 <= 111 || var0 >= 75 && var0 <= 79 || var0 == 114 || var0 == 82;
   }

   private static String c(String var0) {
      String var1 = "";
      int var2 = -1;
      int var3 = var0.length();

      while((var2 = var0.indexOf(167, var2 + 1)) != -1) {
         if(var2 < var3 - 1) {
            char var4 = var0.charAt(var2 + 1);
            if(b(var4)) {
               var1 = "§" + var4;
            } else if(c(var4)) {
               var1 = var1 + "§" + var4;
            }
         }
      }

      return var1;
   }

   public static String d(String var0) {
      return r.matcher(var0).replaceAll("");
   }

}
