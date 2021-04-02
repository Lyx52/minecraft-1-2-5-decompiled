package mojang;

import org.lwjgl.opengl.GL11;

public class afm extends fe {

   private dz c;


   public afm() {
      super(new dz(), 0.5F);
      this.c = (dz)super.a;
      this.a(this.c);
   }

   protected void a(SnowMan var1, float var2) {
      super.b(var1, var2);
      aan var3 = new aan(pb.ba, 1);
      if(var3 != null && var3.a().bQ < 256) {
         GL11.glPushMatrix();
         this.c.c.c(0.0625F);
         if(vl.a(pb.m[var3.c].d())) {
            float var4 = 0.625F;
            GL11.glTranslatef(0.0F, -0.34375F, 0.0F);
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
         }

         this.e.f.a(var1, var3, 0);
         GL11.glPopMatrix();
      }

   }
}
