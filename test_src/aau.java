import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class aau {

   public static float a = 0.0F;
   public static float b = 0.0F;
   public static float c = 0.0F;
   private static IntBuffer i = ew.d(16);
   private static FloatBuffer j = ew.e(16);
   private static FloatBuffer k = ew.e(16);
   private static FloatBuffer l = ew.e(3);
   public static float d;
   public static float e;
   public static float f;
   public static float g;
   public static float h;


   public static void a(yw var0, boolean var1) {
      GL11.glGetFloat(2982, j);
      GL11.glGetFloat(2983, k);
      GL11.glGetInteger(2978, i);
      float var2 = (float)((i.get(0) + i.get(2)) / 2);
      float var3 = (float)((i.get(1) + i.get(3)) / 2);
      GLU.gluUnProject(var2, var3, 0.0F, j, k, i, l);
      a = l.get(0);
      b = l.get(1);
      c = l.get(2);
      int var4 = var1?1:0;
      float var5 = var0.v;
      float var6 = var0.u;
      d = gk.b(var6 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      f = gk.a(var6 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      g = -f * gk.a(var5 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      h = d * gk.a(var5 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      e = gk.b(var5 * 3.1415927F / 180.0F);
   }

   public static bo a(acq var0, double var1) {
      double var3 = var0.l + (var0.o - var0.l) * var1;
      double var5 = var0.m + (var0.p - var0.m) * var1 + (double)var0.I();
      double var7 = var0.n + (var0.q - var0.n) * var1;
      double var9 = var3 + (double)(a * 1.0F);
      double var11 = var5 + (double)(b * 1.0F);
      double var13 = var7 + (double)(c * 1.0F);
      return bo.b(var9, var11, var13);
   }

   public static int a(xd var0, acq var1, float var2) {
      bo var3 = a(var1, (double)var2);
      qo var4 = new qo(var3);
      int var5 = var0.a(var4.a, var4.b, var4.c);
      if(var5 != 0 && pb.m[var5].cd.d()) {
         float var6 = agv.e(var0.e(var4.a, var4.b, var4.c)) - 0.11111111F;
         float var7 = (float)(var4.b + 1) - var6;
         if(var3.b >= (double)var7) {
            var5 = var0.a(var4.a, var4.b + 1, var4.c);
         }
      }

      return var5;
   }

}
