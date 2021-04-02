package mojang;

import org.lwjgl.opengl.GL11;

public class eq extends aar {

   private lk a = new lk();


   public void a(kw var1, double var2, double var4, double var6, float var8) {
      System.out.println("UZ > KW");
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F, (float)var6 + 0.5F);
      float var9 = (float)((uz)var1).a + var8;
      GL11.glTranslatef(0.0F, 0.1F + Utils.sin(var9 * 0.1F) * 0.01F, 0.0F);

      float var10;
      for(var10 = ((uz)var1).h - ((uz)var1).p; var10 >= 3.1415927F; var10 -= 6.2831855F) {
         ;
      }

      while(var10 < -3.1415927F) {
         var10 += 6.2831855F;
      }

      float var11 = ((uz)var1).p + var10 * var8;
      GL11.glRotatef(-var11 * 180.0F / 3.1415927F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
      this.a("/mojang/item/book.png");
      float var12 = ((uz)var1).c + (((uz)var1).b - ((uz)var1).c) * var8 + 0.25F;
      float var13 = ((uz)var1).c + (((uz)var1).b - ((uz)var1).c) * var8 + 0.75F;
      var12 = (var12 - (float) Utils.b((double)var12)) * 1.6F - 0.3F;
      var13 = (var13 - (float) Utils.b((double)var13)) * 1.6F - 0.3F;
      if(var12 < 0.0F) {
         var12 = 0.0F;
      }

      if(var13 < 0.0F) {
         var13 = 0.0F;
      }

      if(var12 > 1.0F) {
         var12 = 1.0F;
      }

      if(var13 > 1.0F) {
         var13 = 1.0F;
      }

      float var14 = ((uz)var1).g + (((uz)var1).f - ((uz)var1).g) * var8;
      this.a.a((BaseEntity)null, var9, var12, var13, var14, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }
}
