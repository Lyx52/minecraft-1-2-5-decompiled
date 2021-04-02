package mojang;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class aiq extends Resource {

   private int e = -1;
   private BufferedImage f;
   private File g;


   public aiq(File var1) {
      this.a = var1.getName();
      this.g = var1;
   }

   private String b(String var1) {
      if(var1 != null && var1.length() > 34) {
         var1 = var1.substring(0, 34);
      }

      return var1;
   }

   public void a(Minecraft minecraft) {
      InputStream var2 = null;

      try {
         try {
            var2 = this.readResourceAsStream("mojang/pack.txt");
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2));
            this.b = this.b(var3.readLine());
            this.c = this.b(var3.readLine());
            var3.close();
            var2.close();
         } catch (Exception var15) {
            ;
         }

         try {
            var2 = this.readResourceAsStream("mojang/pack.png");
            this.f = ImageIO.read(var2);
            var2.close();
         } catch (Exception var14) {
            ;
         }
      } catch (Exception var16) {
         var16.printStackTrace();
      } finally {
         try {
            var2.close();
         } catch (Exception var13) {
            ;
         }

      }

   }

   public void b(Minecraft minecraft) {
      if(this.f != null) {
         minecraft.p.a(this.e);
      }

      this.b();
   }

   public void c(Minecraft minecraft) {
      if(this.f != null && this.e < 0) {
         this.e = minecraft.p.a(this.f);
      }

      if(this.f != null) {
         minecraft.p.b(this.e);
      } else {
         GL11.glBindTexture(3553, minecraft.p.b("/mojang/gui/unknown_pack.png"));
      }

   }

   public void read() {}

   public void b() {}

   public InputStream readResourceAsStream(String var1) {
      try {
         File var2 = new File(this.g, var1.substring(1));
         if(var2.exists()) {
            return new BufferedInputStream(new FileInputStream(var2));
         }
      } catch (Exception var3) {
         ;
      }

      return Resource.class.getResourceAsStream(var1);
   }
}
