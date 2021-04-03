import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;

public class tu extends tt {

   private Minecraft a;
   private int[] b = new int[256];
   private double c;
   private double d;


   public tu(Minecraft var1) {
      super(yr.aQ.b(0));
      this.a = var1;
      this.k = 1;

      try {
         BufferedImage var2 = ImageIO.read(Minecraft.class.getResource("/gui/items.png"));
         int var3 = this.g % 16 * 16;
         int var4 = this.g / 16 * 16;
         var2.getRGB(var3, var4, 16, 16, this.b, 0, 16);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   public void a() {
      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.b[var1] >> 24 & 255;
         int var3 = this.b[var1] >> 16 & 255;
         int var4 = this.b[var1] >> 8 & 255;
         int var5 = this.b[var1] >> 0 & 255;
         if(this.h) {
            int var6 = (var3 * 30 + var4 * 59 + var5 * 11) / 100;
            int var7 = (var3 * 30 + var4 * 70) / 100;
            int var8 = (var3 * 30 + var5 * 70) / 100;
            var3 = var6;
            var4 = var7;
            var5 = var8;
         }

         this.f[var1 * 4 + 0] = (byte)var3;
         this.f[var1 * 4 + 1] = (byte)var4;
         this.f[var1 * 4 + 2] = (byte)var5;
         this.f[var1 * 4 + 3] = (byte)var2;
      }

      double var20 = 0.0D;
      if(this.a.f != null && this.a.h != null) {
         uh var21 = this.a.f.x();
         double var23 = (double)var21.a - this.a.h.o;
         double var25 = (double)var21.c - this.a.h.q;
         var20 = (double)(this.a.h.u - 90.0F) * 3.141592653589793D / 180.0D - Math.atan2(var25, var23);
         if(!this.a.f.t.e()) {
            var20 = Math.random() * 3.1415927410125732D * 2.0D;
         }
      }

      double var22;
      for(var22 = var20 - this.c; var22 < -3.141592653589793D; var22 += 6.283185307179586D) {
         ;
      }

      while(var22 >= 3.141592653589793D) {
         var22 -= 6.283185307179586D;
      }

      if(var22 < -1.0D) {
         var22 = -1.0D;
      }

      if(var22 > 1.0D) {
         var22 = 1.0D;
      }

      this.d += var22 * 0.1D;
      this.d *= 0.8D;
      this.c += this.d;
      double var24 = Math.sin(this.c);
      double var26 = Math.cos(this.c);

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      short var16;
      int var17;
      int var18;
      int var19;
      for(var9 = -4; var9 <= 4; ++var9) {
         var10 = (int)(8.5D + var26 * (double)var9 * 0.3D);
         var11 = (int)(7.5D - var24 * (double)var9 * 0.3D * 0.5D);
         var12 = var11 * 16 + var10;
         var13 = 100;
         var14 = 100;
         var15 = 100;
         var16 = 255;
         if(this.h) {
            var17 = (var13 * 30 + var14 * 59 + var15 * 11) / 100;
            var18 = (var13 * 30 + var14 * 70) / 100;
            var19 = (var13 * 30 + var15 * 70) / 100;
            var13 = var17;
            var14 = var18;
            var15 = var19;
         }

         this.f[var12 * 4 + 0] = (byte)var13;
         this.f[var12 * 4 + 1] = (byte)var14;
         this.f[var12 * 4 + 2] = (byte)var15;
         this.f[var12 * 4 + 3] = (byte)var16;
      }

      for(var9 = -8; var9 <= 16; ++var9) {
         var10 = (int)(8.5D + var24 * (double)var9 * 0.3D);
         var11 = (int)(7.5D + var26 * (double)var9 * 0.3D * 0.5D);
         var12 = var11 * 16 + var10;
         var13 = var9 >= 0?255:100;
         var14 = var9 >= 0?20:100;
         var15 = var9 >= 0?20:100;
         var16 = 255;
         if(this.h) {
            var17 = (var13 * 30 + var14 * 59 + var15 * 11) / 100;
            var18 = (var13 * 30 + var14 * 70) / 100;
            var19 = (var13 * 30 + var15 * 70) / 100;
            var13 = var17;
            var14 = var18;
            var15 = var19;
         }

         this.f[var12 * 4 + 0] = (byte)var13;
         this.f[var12 * 4 + 1] = (byte)var14;
         this.f[var12 * 4 + 2] = (byte)var15;
         this.f[var12 * 4 + 3] = (byte)var16;
      }

   }
}
