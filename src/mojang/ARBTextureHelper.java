package mojang;

import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GLContext;

public class ARBTextureHelper {

   public static int a;
   public static int b;
   private static boolean hasMultitextureGL13 = false;


   public static void init() {
      hasMultitextureGL13 = GLContext.getCapabilities().GL_ARB_multitexture && !GLContext.getCapabilities().OpenGL13;
      if(hasMultitextureGL13) {
         a = '\u84c0';
         b = '\u84c1';
      } else {
         a = '\u84c0';
         b = '\u84c1';
      }

   }

   public static void selectActiveTexture(int textureID) {
      if(hasMultitextureGL13) {
         ARBMultitexture.glActiveTextureARB(textureID);
      } else {
         GL13.glActiveTexture(textureID);
      }

   }

   public static void selectClientActiveTexture(int textureID) {
      if(hasMultitextureGL13) {
         ARBMultitexture.glClientActiveTextureARB(textureID);
      } else {
         GL13.glClientActiveTexture(textureID);
      }

   }

   public static void setMultiTexCoord2f(int targetID, float x, float y) {
      if(hasMultitextureGL13) {
         ARBMultitexture.glMultiTexCoord2fARB(targetID, x, y);
      } else {
         GL13.glMultiTexCoord2f(targetID, x, y);
      }

   }

}
