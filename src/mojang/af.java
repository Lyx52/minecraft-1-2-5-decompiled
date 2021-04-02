package mojang;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class af extends aar {

   private Map a = new HashMap();

   @Override
   public void a(kw var1, double var2, double var4, double var6, float var8) {
      System.out.println("CJ > KW");
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      nn var9 = (nn)this.a.get(((cj)var1).a());
      if(var9 == null) {
         var9 = aao.a(((cj)var1).a(), (xd)null);
         this.a.put(((cj)var1).a(), var9);
      }

      if(var9 != null) {
         var9.a(((cj)var1).i);
         float var10 = 0.4375F;
         GL11.glTranslatef(0.0F, 0.4F, 0.0F);
         GL11.glRotatef((float)(((cj)var1).c + (((cj)var1).b - ((cj)var1).c) * (double)var8) * 10.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.4F, 0.0F);
         GL11.glScalef(var10, var10, var10);
         var9.c(var2, var4, var6, 0.0F, 0.0F);
         ahu.a.a(var9, 0.0D, 0.0D, 0.0D, 0.0F, var8);
      }

      GL11.glPopMatrix();
   }


}
