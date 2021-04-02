package mojang;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class BufferManager {

   private static List textureLists = new ArrayList();
   private static List textureList = new ArrayList();


   public static synchronized int createGLList(int id) {
      int glListID = GL11.glGenLists(id);
      textureLists.add(Integer.valueOf(glListID));
      textureLists.add(Integer.valueOf(id));
      return glListID;
   }

   public static synchronized void a(IntBuffer id) {
      GL11.glGenTextures(id);

      for(int _index = id.position(); _index < id.limit(); ++_index) {
         textureList.add(Integer.valueOf(id.get(_index)));
      }

   }

   public static synchronized void removeTexture(int id) {
      int var1 = textureLists.indexOf(Integer.valueOf(id));
      GL11.glDeleteLists(((Integer) textureLists.get(var1)).intValue(), ((Integer) textureLists.get(var1 + 1)).intValue());
      textureLists.remove(var1);
      //textureLists.remove(var1);
   }

   public static synchronized void clearTextureLists() {
      for(int var0 = 0; var0 < textureLists.size(); var0 += 2) {
         GL11.glDeleteLists(((Integer) textureLists.get(var0)).intValue(), ((Integer) textureLists.get(var0 + 1)).intValue());
      }

      IntBuffer var2 = createIntBuffer(textureList.size());
      var2.flip();
      GL11.glDeleteTextures(var2);

      for(int var1 = 0; var1 < textureList.size(); ++var1) {
         var2.put(((Integer) textureList.get(var1)).intValue());
      }

      var2.flip();
      GL11.glDeleteTextures(var2);
      textureLists.clear();
      textureList.clear();
   }

   public static synchronized ByteBuffer createByteBuffer(int size) {
      return ByteBuffer.allocateDirect(size).order(ByteOrder.nativeOrder());
   }

   public static IntBuffer createIntBuffer(int size) {
      return createByteBuffer(size << 2).asIntBuffer();
   }

   public static FloatBuffer createFloatBuffer(int size) {
      return createByteBuffer(size << 2).asFloatBuffer();
   }

}
