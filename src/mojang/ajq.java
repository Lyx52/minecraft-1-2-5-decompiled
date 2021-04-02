package mojang;

import org.lwjgl.opengl.GL11;

public class ajq extends aar {

   private ahb a = new ahb();
   private ahb c = new ur();


   public void a(kw var1, double var2, double var4, double var6, float var8) {
      System.out.println("HB > KW");
      int var9;
      if(var1.i == null) {
         var9 = 0;
      } else {
         pb var10 = var1.k();
         var9 = var1.i();
         if(var10 != null && var9 == 0) {
            ((sn)var10).h(var1.i, var1.j, var1.k, var1.l);
            var9 = var1.i();
         }

         ((hb)var1).g();
      }

      if(((hb)var1).b == null && ((hb)var1).d == null) {
         ahb var14;
         if(((hb)var1).c == null && ((hb)var1).e == null) {
            var14 = this.a;
            this.a("/mojang/item/chest.png");
         } else {
            var14 = this.c;
            this.a("/mojang/item/largechest.png");
         }

         GL11.glPushMatrix();
         GL11.glEnable('\u803a');
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
         GL11.glScalef(1.0F, -1.0F, -1.0F);
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         short var11 = 0;
         if(var9 == 2) {
            var11 = 180;
         }

         if(var9 == 3) {
            var11 = 0;
         }

         if(var9 == 4) {
            var11 = 90;
         }

         if(var9 == 5) {
            var11 = -90;
         }

         if(var9 == 2 && ((hb)var1).c != null) {
            GL11.glTranslatef(1.0F, 0.0F, 0.0F);
         }

         if(var9 == 5 && ((hb)var1).e != null) {
            GL11.glTranslatef(0.0F, 0.0F, -1.0F);
         }

         GL11.glRotatef((float)var11, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         float var12 = ((hb)var1).g + (((hb)var1).f - ((hb)var1).g) * var8;
         float var13;
         if(((hb)var1).b != null) {
            var13 = ((hb)var1).b.g + (((hb)var1).b.f - ((hb)var1).b.g) * var8;
            if(var13 > var12) {
               var12 = var13;
            }
         }

         if(((hb)var1).d != null) {
            var13 = ((hb)var1).d.g + (((hb)var1).d.f - ((hb)var1).d.g) * var8;
            if(var13 > var12) {
               var12 = var13;
            }
         }

         var12 = 1.0F - var12;
         var12 = 1.0F - var12 * var12 * var12;
         var14.a.f = -(var12 * 3.1415927F / 2.0F);
         var14.a();
         GL11.glDisable('\u803a');
         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
