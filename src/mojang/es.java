package mojang;

import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GLContext;

public class es {

   public static int a;
   public static int b;
   private static boolean c = false;


   public static void a() {
      c = GLContext.getCapabilities().GL_ARB_multitexture && !GLContext.getCapabilities().OpenGL13;
      if(c) {
         a = '\u84c0';
         b = '\u84c1';
      } else {
         a = '\u84c0';
         b = '\u84c1';
      }

   }

   public static void a(int var0) {
      if(c) {
         ARBMultitexture.glActiveTextureARB(var0);
      } else {
         GL13.glActiveTexture(var0);
      }

   }

   public static void b(int var0) {
      if(c) {
         ARBMultitexture.glClientActiveTextureARB(var0);
      } else {
         GL13.glClientActiveTexture(var0);
      }

   }

   public static void a(int var0, float var1, float var2) {
      if(c) {
         ARBMultitexture.glMultiTexCoord2fARB(var0, var1, var2);
      } else {
         GL13.glMultiTexCoord2f(var0, var1, var2);
      }

   }

}
