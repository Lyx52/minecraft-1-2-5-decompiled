package mojang;

import org.lwjgl.opengl.GL11;

public class ahm extends um {

   protected ho a;


   public ahm() {
      this.g = 0.5F;
      this.a = new adt();
   }

   public void a(BaseEntity var1, double var2, double var4, double var6, float var8, float var9) {
      System.out.println("AMA > NN");
      GL11.glPushMatrix();
      long var10 = (long)var1.f * 493286711L;
      var10 = var10 * var10 * 4392167121L + var10 * 98761L;
      float var12 = (((float)(var10 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var13 = (((float)(var10 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var14 = (((float)(var10 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      GL11.glTranslatef(var12, var13, var14);
      double var15 = var1.N + (var1.o - var1.N) * (double)var9;
      double var17 = var1.O + (var1.p - var1.O) * (double)var9;
      double var19 = var1.P + (var1.q - var1.P) * (double)var9;
      double var21 = 0.30000001192092896D;
      bo var23 = ((Minecart)var1).i(var15, var17, var19);
      float var24 = var1.x + (var1.v - var1.x) * var9;
      if(var23 != null) {
         bo var25 = ((Minecart)var1).a(var15, var17, var19, var21);
         bo var26 = ((Minecart)var1).a(var15, var17, var19, -var21);
         if(var25 == null) {
            var25 = var23;
         }

         if(var26 == null) {
            var26 = var23;
         }

         var2 += var23.a - var15;
         var4 += (var25.b + var26.b) / 2.0D - var17;
         var6 += var23.c - var19;
         bo var27 = var26.c(-var25.a, -var25.b, -var25.c);
         if(var27.d() != 0.0D) {
            var27 = var27.c();
            var8 = (float)(Math.atan2(var27.c, var27.a) * 180.0D / 3.141592653589793D);
            var24 = (float)(Math.atan(var27.b) * 73.0D);
         }
      }

      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(180.0F - var8, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var24, 0.0F, 0.0F, 1.0F);
      float var28 = (float)((Minecart)var1).p() - var9;
      float var29 = (float)((Minecart)var1).o() - var9;
      if(var29 < 0.0F) {
         var29 = 0.0F;
      }

      if(var28 > 0.0F) {
         GL11.glRotatef(Utils.sin(var28) * var28 * var29 / 10.0F * (float)((Minecart)var1).r(), 1.0F, 0.0F, 0.0F);
      }

      if(((Minecart)var1).a != 0) {
         this.a("/mojang/terrain.png");
         float var30 = 0.75F;
         GL11.glScalef(var30, var30, var30);
         if(((Minecart)var1).a == 1) {
            GL11.glTranslatef(-0.5F, 0.0F, 0.5F);
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            (new vl()).a(pb.au, 0, ((Minecart)var1).a(var9));
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.5F, 0.0F, -0.5F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         } else if(((Minecart)var1).a == 2) {
            GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            (new vl()).a(pb.aB, 0, var1.a(var9));
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.3125F, 0.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

         GL11.glScalef(1.0F / var30, 1.0F / var30, 1.0F / var30);
      }

      this.a("/mojang/item/cart.png");
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      this.a.a(var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }
}
