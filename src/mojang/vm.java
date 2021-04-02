package mojang;

import org.lwjgl.opengl.GLContext;

public class vm {

   private static boolean a = true;


   public static boolean a() {
      return a && GLContext.getCapabilities().GL_ARB_occlusion_query;
   }

}
