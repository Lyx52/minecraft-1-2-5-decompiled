package mojang;

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class st extends fe {

   private ud c;
   private Random d = new Random();


   public st() {
      super(new ud(), 0.5F);
      this.c = (ud)super.a;
      this.a(this.c);
   }

   public void a(Enderman var1, double var2, double var4, double var6, float var8, float var9) {
      this.c.a = var1.z_() > 0;
      this.c.b = var1.a;
      if(var1.a) {
         double var10 = 0.02D;
         var2 += this.d.nextGaussian() * var10;
         var6 += this.d.nextGaussian() * var10;
      }

      super.a((Mob)var1, var2, var4, var6, var8, var9);
   }

   protected void a(Enderman var1, float var2) {
      super.b(var1, var2);
      if(var1.z_() > 0) {
         GL11.glEnable('\u803a');
         GL11.glPushMatrix();
         float var3 = 0.5F;
         GL11.glTranslatef(0.0F, 0.6875F, -0.75F);
         var3 *= 1.0F;
         GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(var3, -var3, var3);
         int var4 = var1.b(var2);
         int var5 = var4 % 65536;
         int var6 = var4 / 65536;
         ARBTextureHelper.setMultiTexCoord2f(ARBTextureHelper.b, (float)var5 / 1.0F, (float)var6 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.a("/mojang/terrain.png");
         this.f.a(pb.m[var1.z_()], var1.x(), 1.0F);
         GL11.glPopMatrix();
         GL11.glDisable('\u803a');
      }

   }

   protected int a(Enderman var1, int var2, float var3) {
      if(var2 != 0) {
         return -1;
      } else {
         this.a("/mojang/mob/enderman_eyes.png");
         float var4 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         GL11.glDisable(2896);
         char var5 = '\uf0f0';
         int var6 = var5 % 65536;
         int var7 = var5 / 65536;
         ARBTextureHelper.setMultiTexCoord2f(ARBTextureHelper.b, (float)var6 / 1.0F, (float)var7 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(2896);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
         return 1;
      }
   }
}
