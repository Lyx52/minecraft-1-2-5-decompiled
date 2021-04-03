import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class zh {

   private static DateFormat a = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
   private static ByteBuffer b;
   private static byte[] c;
   private static int[] d;


   public static String a(File var0, int var1, int var2) {
      return a(var0, (String)null, var1, var2);
   }

   public static String a(File var0, String var1, int var2, int var3) {
      try {
         File var4 = new File(var0, "screenshots");
         var4.mkdir();
         if(b == null || b.capacity() < var2 * var3) {
            b = BufferUtils.createByteBuffer(var2 * var3 * 3);
         }

         if(d == null || d.length < var2 * var3 * 3) {
            c = new byte[var2 * var3 * 3];
            d = new int[var2 * var3];
         }

         GL11.glPixelStorei(3333, 1);
         GL11.glPixelStorei(3317, 1);
         b.clear();
         GL11.glReadPixels(0, 0, var2, var3, 6407, 5121, b);
         b.clear();
         String var5 = "" + a.format(new Date());
         File var6;
         int var7;
         if(var1 == null) {
            for(var7 = 1; (var6 = new File(var4, var5 + (var7 == 1?"":"_" + var7) + ".png")).exists(); ++var7) {
               ;
            }
         } else {
            var6 = new File(var4, var1);
         }

         b.get(c);

         for(var7 = 0; var7 < var2; ++var7) {
            for(int var8 = 0; var8 < var3; ++var8) {
               int var9 = var7 + (var3 - var8 - 1) * var2;
               int var10 = c[var9 * 3 + 0] & 255;
               int var11 = c[var9 * 3 + 1] & 255;
               int var12 = c[var9 * 3 + 2] & 255;
               int var13 = -16777216 | var10 << 16 | var11 << 8 | var12;
               d[var7 + var8 * var2] = var13;
            }
         }

         BufferedImage var15 = new BufferedImage(var2, var3, 1);
         var15.setRGB(0, 0, var2, var3, d, 0, var2);
         ImageIO.write(var15, "png", var6);
         return "Saved screenshot as " + var6.getName();
      } catch (Exception var14) {
         var14.printStackTrace();
         return "Failed to save: " + var14;
      }
   }

}
