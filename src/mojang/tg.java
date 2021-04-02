package mojang;

import org.lwjgl.opengl.GL11;

public class tg extends fe {

   protected xg c;
   protected float d;


   public tg(xg var1, float var2) {
      this(var1, var2, 1.0F);
      this.c = var1;
   }

   public tg(xg var1, float var2, float var3) {
      super(var1, var2);
      this.c = var1;
      this.d = var3;
   }

   protected void b(acq var1, float var2) {
      super.b(var1, var2);
      aan var3 = var1.ae();
      if(var3 != null) {
         GL11.glPushMatrix();
         this.c.f.c(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         float var4;
         if(var3.c < 256 && vl.a(pb.m[var3.c].d())) {
            var4 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var4 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
         } else if(var3.c == yr.k.bQ) {
            var4 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if(yr.e[var3.c].a()) {
            var4 = 0.625F;
            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            var4 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var4, var4, var4);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         this.e.f.a(var1, var3, 0);
         if(var3.a().c()) {
            this.e.f.a(var1, var3, 1);
         }

         GL11.glPopMatrix();
      }

   }
}
