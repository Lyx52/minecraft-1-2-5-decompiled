package mojang;

import org.lwjgl.opengl.GL11;

public class aml extends ho {

   private qp a;
   private qp b = new qp(this, "glass");
   private qp c;


   public aml(float var1) {
      this.b.a(0, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      this.a = new qp(this, "cube");
      this.a.a(32, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      this.c = new qp(this, "base");
      this.c.a(0, 16).a(-6.0F, 0.0F, -6.0F, 12, 4, 12);
   }

   public void a(BaseEntity var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      GL11.glTranslatef(0.0F, -0.5F, 0.0F);
      this.c.a(var7);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.8F + var4, 0.0F);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      this.b.a(var7);
      float var8 = 0.875F;
      GL11.glScalef(var8, var8, var8);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      this.b.a(var7);
      GL11.glScalef(var8, var8, var8);
      GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
      GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
      this.a.a(var7);
      GL11.glPopMatrix();
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
   }
}
